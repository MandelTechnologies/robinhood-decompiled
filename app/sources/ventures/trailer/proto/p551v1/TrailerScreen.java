package ventures.trailer.proto.p551v1;

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

/* compiled from: TrailerScreen.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB3\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0002H\u0017J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0004H\u0016J2\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lventures/trailer/proto/v1/TrailerScreen;", "Lcom/squareup/wire/Message;", "", "trailer_url", "", "pre_trailer_state", "Lventures/trailer/proto/v1/TrailerState;", "post_trailer_state", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lventures/trailer/proto/v1/TrailerState;Lventures/trailer/proto/v1/TrailerState;Lokio/ByteString;)V", "getTrailer_url", "()Ljava/lang/String;", "getPre_trailer_state", "()Lventures/trailer/proto/v1/TrailerState;", "getPost_trailer_state", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "microgram.contracts.ventures.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes28.dex */
public final class TrailerScreen extends Message {

    @JvmField
    public static final ProtoAdapter<TrailerScreen> ADAPTER;

    @WireField(adapter = "ventures.trailer.proto.v1.TrailerState#ADAPTER", jsonName = "postTrailerState", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final TrailerState post_trailer_state;

    @WireField(adapter = "ventures.trailer.proto.v1.TrailerState#ADAPTER", jsonName = "preTrailerState", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final TrailerState pre_trailer_state;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "trailerUrl", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String trailer_url;

    public TrailerScreen() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m30048newBuilder();
    }

    public final String getTrailer_url() {
        return this.trailer_url;
    }

    public /* synthetic */ TrailerScreen(String str, TrailerState trailerState, TrailerState trailerState2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : trailerState, (i & 4) != 0 ? null : trailerState2, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final TrailerState getPre_trailer_state() {
        return this.pre_trailer_state;
    }

    public final TrailerState getPost_trailer_state() {
        return this.post_trailer_state;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrailerScreen(String trailer_url, TrailerState trailerState, TrailerState trailerState2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(trailer_url, "trailer_url");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.trailer_url = trailer_url;
        this.pre_trailer_state = trailerState;
        this.post_trailer_state = trailerState2;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m30048newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TrailerScreen)) {
            return false;
        }
        TrailerScreen trailerScreen = (TrailerScreen) other;
        return Intrinsics.areEqual(unknownFields(), trailerScreen.unknownFields()) && Intrinsics.areEqual(this.trailer_url, trailerScreen.trailer_url) && Intrinsics.areEqual(this.pre_trailer_state, trailerScreen.pre_trailer_state) && Intrinsics.areEqual(this.post_trailer_state, trailerScreen.post_trailer_state);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.trailer_url.hashCode()) * 37;
        TrailerState trailerState = this.pre_trailer_state;
        int iHashCode2 = (iHashCode + (trailerState != null ? trailerState.hashCode() : 0)) * 37;
        TrailerState trailerState2 = this.post_trailer_state;
        int iHashCode3 = iHashCode2 + (trailerState2 != null ? trailerState2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("trailer_url=" + Internal.sanitize(this.trailer_url));
        TrailerState trailerState = this.pre_trailer_state;
        if (trailerState != null) {
            arrayList.add("pre_trailer_state=" + trailerState);
        }
        TrailerState trailerState2 = this.post_trailer_state;
        if (trailerState2 != null) {
            arrayList.add("post_trailer_state=" + trailerState2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TrailerScreen{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ TrailerScreen copy$default(TrailerScreen trailerScreen, String str, TrailerState trailerState, TrailerState trailerState2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = trailerScreen.trailer_url;
        }
        if ((i & 2) != 0) {
            trailerState = trailerScreen.pre_trailer_state;
        }
        if ((i & 4) != 0) {
            trailerState2 = trailerScreen.post_trailer_state;
        }
        if ((i & 8) != 0) {
            byteString = trailerScreen.unknownFields();
        }
        return trailerScreen.copy(str, trailerState, trailerState2, byteString);
    }

    public final TrailerScreen copy(String trailer_url, TrailerState pre_trailer_state, TrailerState post_trailer_state, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(trailer_url, "trailer_url");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new TrailerScreen(trailer_url, pre_trailer_state, post_trailer_state, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TrailerScreen.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<TrailerScreen>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: ventures.trailer.proto.v1.TrailerScreen$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TrailerScreen value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getTrailer_url(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTrailer_url());
                }
                if (value.getPre_trailer_state() != null) {
                    size += TrailerState.ADAPTER.encodedSizeWithTag(2, value.getPre_trailer_state());
                }
                return value.getPost_trailer_state() != null ? size + TrailerState.ADAPTER.encodedSizeWithTag(3, value.getPost_trailer_state()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TrailerScreen value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getTrailer_url(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTrailer_url());
                }
                if (value.getPre_trailer_state() != null) {
                    TrailerState.ADAPTER.encodeWithTag(writer, 2, (int) value.getPre_trailer_state());
                }
                if (value.getPost_trailer_state() != null) {
                    TrailerState.ADAPTER.encodeWithTag(writer, 3, (int) value.getPost_trailer_state());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TrailerScreen value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getPost_trailer_state() != null) {
                    TrailerState.ADAPTER.encodeWithTag(writer, 3, (int) value.getPost_trailer_state());
                }
                if (value.getPre_trailer_state() != null) {
                    TrailerState.ADAPTER.encodeWithTag(writer, 2, (int) value.getPre_trailer_state());
                }
                if (Intrinsics.areEqual(value.getTrailer_url(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTrailer_url());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TrailerScreen redact(TrailerScreen value) {
                Intrinsics.checkNotNullParameter(value, "value");
                TrailerState pre_trailer_state = value.getPre_trailer_state();
                TrailerState trailerStateRedact = pre_trailer_state != null ? TrailerState.ADAPTER.redact(pre_trailer_state) : null;
                TrailerState post_trailer_state = value.getPost_trailer_state();
                return TrailerScreen.copy$default(value, null, trailerStateRedact, post_trailer_state != null ? TrailerState.ADAPTER.redact(post_trailer_state) : null, ByteString.EMPTY, 1, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TrailerScreen decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                TrailerState trailerStateDecode = null;
                TrailerState trailerStateDecode2 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new TrailerScreen(strDecode, trailerStateDecode, trailerStateDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        trailerStateDecode = TrailerState.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        trailerStateDecode2 = TrailerState.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
