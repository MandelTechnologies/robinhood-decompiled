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

/* compiled from: GetTrailerResponse.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 BA\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\nH\u0016J@\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006!"}, m3636d2 = {"Lventures/trailer/proto/v1/GetTrailerResponse;", "Lcom/squareup/wire/Message;", "", "landing_screen", "Lventures/trailer/proto/v1/TrailerLandingScreen;", "trailer_screen", "Lventures/trailer/proto/v1/TrailerScreen;", "post_trailer_screen", "Lventures/trailer/proto/v1/PostTrailerScreen;", "redirect_deeplink_url", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lventures/trailer/proto/v1/TrailerLandingScreen;Lventures/trailer/proto/v1/TrailerScreen;Lventures/trailer/proto/v1/PostTrailerScreen;Ljava/lang/String;Lokio/ByteString;)V", "getLanding_screen", "()Lventures/trailer/proto/v1/TrailerLandingScreen;", "getTrailer_screen", "()Lventures/trailer/proto/v1/TrailerScreen;", "getPost_trailer_screen", "()Lventures/trailer/proto/v1/PostTrailerScreen;", "getRedirect_deeplink_url", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "microgram.contracts.ventures.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes28.dex */
public final class GetTrailerResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetTrailerResponse> ADAPTER;

    @WireField(adapter = "ventures.trailer.proto.v1.TrailerLandingScreen#ADAPTER", jsonName = "landingScreen", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final TrailerLandingScreen landing_screen;

    @WireField(adapter = "ventures.trailer.proto.v1.PostTrailerScreen#ADAPTER", jsonName = "postTrailerScreen", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final PostTrailerScreen post_trailer_screen;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "redirectDeeplinkUrl", schemaIndex = 3, tag = 4)
    private final String redirect_deeplink_url;

    @WireField(adapter = "ventures.trailer.proto.v1.TrailerScreen#ADAPTER", jsonName = "trailerScreen", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final TrailerScreen trailer_screen;

    public GetTrailerResponse() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m30038newBuilder();
    }

    public final TrailerLandingScreen getLanding_screen() {
        return this.landing_screen;
    }

    public final TrailerScreen getTrailer_screen() {
        return this.trailer_screen;
    }

    public final PostTrailerScreen getPost_trailer_screen() {
        return this.post_trailer_screen;
    }

    public final String getRedirect_deeplink_url() {
        return this.redirect_deeplink_url;
    }

    public /* synthetic */ GetTrailerResponse(TrailerLandingScreen trailerLandingScreen, TrailerScreen trailerScreen, PostTrailerScreen postTrailerScreen, String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : trailerLandingScreen, (i & 2) != 0 ? null : trailerScreen, (i & 4) != 0 ? null : postTrailerScreen, (i & 8) != 0 ? null : str, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetTrailerResponse(TrailerLandingScreen trailerLandingScreen, TrailerScreen trailerScreen, PostTrailerScreen postTrailerScreen, String str, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.landing_screen = trailerLandingScreen;
        this.trailer_screen = trailerScreen;
        this.post_trailer_screen = postTrailerScreen;
        this.redirect_deeplink_url = str;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m30038newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetTrailerResponse)) {
            return false;
        }
        GetTrailerResponse getTrailerResponse = (GetTrailerResponse) other;
        return Intrinsics.areEqual(unknownFields(), getTrailerResponse.unknownFields()) && Intrinsics.areEqual(this.landing_screen, getTrailerResponse.landing_screen) && Intrinsics.areEqual(this.trailer_screen, getTrailerResponse.trailer_screen) && Intrinsics.areEqual(this.post_trailer_screen, getTrailerResponse.post_trailer_screen) && Intrinsics.areEqual(this.redirect_deeplink_url, getTrailerResponse.redirect_deeplink_url);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        TrailerLandingScreen trailerLandingScreen = this.landing_screen;
        int iHashCode2 = (iHashCode + (trailerLandingScreen != null ? trailerLandingScreen.hashCode() : 0)) * 37;
        TrailerScreen trailerScreen = this.trailer_screen;
        int iHashCode3 = (iHashCode2 + (trailerScreen != null ? trailerScreen.hashCode() : 0)) * 37;
        PostTrailerScreen postTrailerScreen = this.post_trailer_screen;
        int iHashCode4 = (iHashCode3 + (postTrailerScreen != null ? postTrailerScreen.hashCode() : 0)) * 37;
        String str = this.redirect_deeplink_url;
        int iHashCode5 = iHashCode4 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        TrailerLandingScreen trailerLandingScreen = this.landing_screen;
        if (trailerLandingScreen != null) {
            arrayList.add("landing_screen=" + trailerLandingScreen);
        }
        TrailerScreen trailerScreen = this.trailer_screen;
        if (trailerScreen != null) {
            arrayList.add("trailer_screen=" + trailerScreen);
        }
        PostTrailerScreen postTrailerScreen = this.post_trailer_screen;
        if (postTrailerScreen != null) {
            arrayList.add("post_trailer_screen=" + postTrailerScreen);
        }
        String str = this.redirect_deeplink_url;
        if (str != null) {
            arrayList.add("redirect_deeplink_url=" + Internal.sanitize(str));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetTrailerResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetTrailerResponse copy$default(GetTrailerResponse getTrailerResponse, TrailerLandingScreen trailerLandingScreen, TrailerScreen trailerScreen, PostTrailerScreen postTrailerScreen, String str, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            trailerLandingScreen = getTrailerResponse.landing_screen;
        }
        if ((i & 2) != 0) {
            trailerScreen = getTrailerResponse.trailer_screen;
        }
        if ((i & 4) != 0) {
            postTrailerScreen = getTrailerResponse.post_trailer_screen;
        }
        if ((i & 8) != 0) {
            str = getTrailerResponse.redirect_deeplink_url;
        }
        if ((i & 16) != 0) {
            byteString = getTrailerResponse.unknownFields();
        }
        ByteString byteString2 = byteString;
        PostTrailerScreen postTrailerScreen2 = postTrailerScreen;
        return getTrailerResponse.copy(trailerLandingScreen, trailerScreen, postTrailerScreen2, str, byteString2);
    }

    public final GetTrailerResponse copy(TrailerLandingScreen landing_screen, TrailerScreen trailer_screen, PostTrailerScreen post_trailer_screen, String redirect_deeplink_url, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetTrailerResponse(landing_screen, trailer_screen, post_trailer_screen, redirect_deeplink_url, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetTrailerResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetTrailerResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: ventures.trailer.proto.v1.GetTrailerResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetTrailerResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getLanding_screen() != null) {
                    size += TrailerLandingScreen.ADAPTER.encodedSizeWithTag(1, value.getLanding_screen());
                }
                if (value.getTrailer_screen() != null) {
                    size += TrailerScreen.ADAPTER.encodedSizeWithTag(2, value.getTrailer_screen());
                }
                if (value.getPost_trailer_screen() != null) {
                    size += PostTrailerScreen.ADAPTER.encodedSizeWithTag(3, value.getPost_trailer_screen());
                }
                return size + ProtoAdapter.STRING.encodedSizeWithTag(4, value.getRedirect_deeplink_url());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetTrailerResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getLanding_screen() != null) {
                    TrailerLandingScreen.ADAPTER.encodeWithTag(writer, 1, (int) value.getLanding_screen());
                }
                if (value.getTrailer_screen() != null) {
                    TrailerScreen.ADAPTER.encodeWithTag(writer, 2, (int) value.getTrailer_screen());
                }
                if (value.getPost_trailer_screen() != null) {
                    PostTrailerScreen.ADAPTER.encodeWithTag(writer, 3, (int) value.getPost_trailer_screen());
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getRedirect_deeplink_url());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetTrailerResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getRedirect_deeplink_url());
                if (value.getPost_trailer_screen() != null) {
                    PostTrailerScreen.ADAPTER.encodeWithTag(writer, 3, (int) value.getPost_trailer_screen());
                }
                if (value.getTrailer_screen() != null) {
                    TrailerScreen.ADAPTER.encodeWithTag(writer, 2, (int) value.getTrailer_screen());
                }
                if (value.getLanding_screen() != null) {
                    TrailerLandingScreen.ADAPTER.encodeWithTag(writer, 1, (int) value.getLanding_screen());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetTrailerResponse redact(GetTrailerResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                TrailerLandingScreen landing_screen = value.getLanding_screen();
                TrailerLandingScreen trailerLandingScreenRedact = landing_screen != null ? TrailerLandingScreen.ADAPTER.redact(landing_screen) : null;
                TrailerScreen trailer_screen = value.getTrailer_screen();
                TrailerScreen trailerScreenRedact = trailer_screen != null ? TrailerScreen.ADAPTER.redact(trailer_screen) : null;
                PostTrailerScreen post_trailer_screen = value.getPost_trailer_screen();
                return GetTrailerResponse.copy$default(value, trailerLandingScreenRedact, trailerScreenRedact, post_trailer_screen != null ? PostTrailerScreen.ADAPTER.redact(post_trailer_screen) : null, null, ByteString.EMPTY, 8, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetTrailerResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                TrailerLandingScreen trailerLandingScreenDecode = null;
                TrailerScreen trailerScreenDecode = null;
                PostTrailerScreen postTrailerScreenDecode = null;
                String strDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetTrailerResponse(trailerLandingScreenDecode, trailerScreenDecode, postTrailerScreenDecode, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        trailerLandingScreenDecode = TrailerLandingScreen.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        trailerScreenDecode = TrailerScreen.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        postTrailerScreenDecode = PostTrailerScreen.ADAPTER.decode(reader);
                    } else if (iNextTag == 4) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
