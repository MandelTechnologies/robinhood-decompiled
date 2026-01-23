package advisory.proto.p008v1;

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

/* compiled from: AdvisoryInsightContentViewModelAudioMux.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J0\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u0019"}, m3636d2 = {"Ladvisory/proto/v1/AdvisoryInsightContentViewModelAudioMux;", "Lcom/squareup/wire/Message;", "", "playback_id", "", "m3u8_url", "token", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getPlayback_id", "()Ljava/lang/String;", "getM3u8_url", "getToken", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes.dex */
public final class AdvisoryInsightContentViewModelAudioMux extends Message {

    @JvmField
    public static final ProtoAdapter<AdvisoryInsightContentViewModelAudioMux> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "m3u8Url", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String m3u8_url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "playbackId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String playback_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    private final String token;

    public AdvisoryInsightContentViewModelAudioMux() {
        this(null, null, null, null, 15, null);
    }

    public /* synthetic */ AdvisoryInsightContentViewModelAudioMux(String str, String str2, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m4393newBuilder();
    }

    public final String getPlayback_id() {
        return this.playback_id;
    }

    public final String getM3u8_url() {
        return this.m3u8_url;
    }

    public final String getToken() {
        return this.token;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvisoryInsightContentViewModelAudioMux(String playback_id, String m3u8_url, String str, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(playback_id, "playback_id");
        Intrinsics.checkNotNullParameter(m3u8_url, "m3u8_url");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.playback_id = playback_id;
        this.m3u8_url = m3u8_url;
        this.token = str;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m4393newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof AdvisoryInsightContentViewModelAudioMux)) {
            return false;
        }
        AdvisoryInsightContentViewModelAudioMux advisoryInsightContentViewModelAudioMux = (AdvisoryInsightContentViewModelAudioMux) other;
        return Intrinsics.areEqual(unknownFields(), advisoryInsightContentViewModelAudioMux.unknownFields()) && Intrinsics.areEqual(this.playback_id, advisoryInsightContentViewModelAudioMux.playback_id) && Intrinsics.areEqual(this.m3u8_url, advisoryInsightContentViewModelAudioMux.m3u8_url) && Intrinsics.areEqual(this.token, advisoryInsightContentViewModelAudioMux.token);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.playback_id.hashCode()) * 37) + this.m3u8_url.hashCode()) * 37;
        String str = this.token;
        int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("playback_id=" + Internal.sanitize(this.playback_id));
        arrayList.add("m3u8_url=" + Internal.sanitize(this.m3u8_url));
        String str = this.token;
        if (str != null) {
            arrayList.add("token=" + Internal.sanitize(str));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AdvisoryInsightContentViewModelAudioMux{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ AdvisoryInsightContentViewModelAudioMux copy$default(AdvisoryInsightContentViewModelAudioMux advisoryInsightContentViewModelAudioMux, String str, String str2, String str3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = advisoryInsightContentViewModelAudioMux.playback_id;
        }
        if ((i & 2) != 0) {
            str2 = advisoryInsightContentViewModelAudioMux.m3u8_url;
        }
        if ((i & 4) != 0) {
            str3 = advisoryInsightContentViewModelAudioMux.token;
        }
        if ((i & 8) != 0) {
            byteString = advisoryInsightContentViewModelAudioMux.unknownFields();
        }
        return advisoryInsightContentViewModelAudioMux.copy(str, str2, str3, byteString);
    }

    public final AdvisoryInsightContentViewModelAudioMux copy(String playback_id, String m3u8_url, String token, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(playback_id, "playback_id");
        Intrinsics.checkNotNullParameter(m3u8_url, "m3u8_url");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new AdvisoryInsightContentViewModelAudioMux(playback_id, m3u8_url, token, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AdvisoryInsightContentViewModelAudioMux.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<AdvisoryInsightContentViewModelAudioMux>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: advisory.proto.v1.AdvisoryInsightContentViewModelAudioMux$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(AdvisoryInsightContentViewModelAudioMux value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getPlayback_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getPlayback_id());
                }
                if (!Intrinsics.areEqual(value.getM3u8_url(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getM3u8_url());
                }
                return size + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getToken());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, AdvisoryInsightContentViewModelAudioMux value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getPlayback_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getPlayback_id());
                }
                if (!Intrinsics.areEqual(value.getM3u8_url(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getM3u8_url());
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getToken());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, AdvisoryInsightContentViewModelAudioMux value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 3, (int) value.getToken());
                if (!Intrinsics.areEqual(value.getM3u8_url(), "")) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getM3u8_url());
                }
                if (Intrinsics.areEqual(value.getPlayback_id(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getPlayback_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public AdvisoryInsightContentViewModelAudioMux redact(AdvisoryInsightContentViewModelAudioMux value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return AdvisoryInsightContentViewModelAudioMux.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public AdvisoryInsightContentViewModelAudioMux decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = null;
                String strDecode3 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new AdvisoryInsightContentViewModelAudioMux(strDecode, strDecode3, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
