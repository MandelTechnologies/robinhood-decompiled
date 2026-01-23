package trivia.p550v1;

import com.plaid.internal.EnumC7081g;
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

/* compiled from: GetVideoViewModelResponse.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eBQ\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0016\u001a\u00020\u0002H\u0017J\u0013\u0010\u0017\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0004H\u0016JP\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\rR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0012R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0016\u0010\u000b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0012¨\u0006\u001f"}, m3636d2 = {"Ltrivia/v1/GetVideoViewModelResponse;", "Lcom/squareup/wire/Message;", "", "video_url", "", "is_video_playing", "", "video_start_offset_ms", "", "is_video_full_screen", "asset_url", "is_gold_styled", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;ZJZLjava/lang/String;ZLokio/ByteString;)V", "getVideo_url", "()Ljava/lang/String;", "()Z", "getVideo_start_offset_ms", "()J", "getAsset_url", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "trivia.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class GetVideoViewModelResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetVideoViewModelResponse> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "assetUrl", schemaIndex = 4, tag = 5)
    private final String asset_url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isGoldStyled", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final boolean is_gold_styled;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isVideoFullScreen", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final boolean is_video_full_screen;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isVideoPlaying", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final boolean is_video_playing;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", jsonName = "videoStartOffsetMs", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final long video_start_offset_ms;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "videoUrl", schemaIndex = 0, tag = 1)
    private final String video_url;

    public GetVideoViewModelResponse() {
        this(null, false, 0L, false, null, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m30013newBuilder();
    }

    public final String getVideo_url() {
        return this.video_url;
    }

    /* renamed from: is_video_playing, reason: from getter */
    public final boolean getIs_video_playing() {
        return this.is_video_playing;
    }

    public final long getVideo_start_offset_ms() {
        return this.video_start_offset_ms;
    }

    /* renamed from: is_video_full_screen, reason: from getter */
    public final boolean getIs_video_full_screen() {
        return this.is_video_full_screen;
    }

    public final String getAsset_url() {
        return this.asset_url;
    }

    /* renamed from: is_gold_styled, reason: from getter */
    public final boolean getIs_gold_styled() {
        return this.is_gold_styled;
    }

    public /* synthetic */ GetVideoViewModelResponse(String str, boolean z, long j, boolean z2, String str2, boolean z3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? 0L : j, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? false : z3, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetVideoViewModelResponse(String str, boolean z, long j, boolean z2, String str2, boolean z3, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.video_url = str;
        this.is_video_playing = z;
        this.video_start_offset_ms = j;
        this.is_video_full_screen = z2;
        this.asset_url = str2;
        this.is_gold_styled = z3;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m30013newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetVideoViewModelResponse)) {
            return false;
        }
        GetVideoViewModelResponse getVideoViewModelResponse = (GetVideoViewModelResponse) other;
        return Intrinsics.areEqual(unknownFields(), getVideoViewModelResponse.unknownFields()) && Intrinsics.areEqual(this.video_url, getVideoViewModelResponse.video_url) && this.is_video_playing == getVideoViewModelResponse.is_video_playing && this.video_start_offset_ms == getVideoViewModelResponse.video_start_offset_ms && this.is_video_full_screen == getVideoViewModelResponse.is_video_full_screen && Intrinsics.areEqual(this.asset_url, getVideoViewModelResponse.asset_url) && this.is_gold_styled == getVideoViewModelResponse.is_gold_styled;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.video_url;
        int iHashCode2 = (((((((iHashCode + (str != null ? str.hashCode() : 0)) * 37) + Boolean.hashCode(this.is_video_playing)) * 37) + Long.hashCode(this.video_start_offset_ms)) * 37) + Boolean.hashCode(this.is_video_full_screen)) * 37;
        String str2 = this.asset_url;
        int iHashCode3 = ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37) + Boolean.hashCode(this.is_gold_styled);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.video_url;
        if (str != null) {
            arrayList.add("video_url=" + Internal.sanitize(str));
        }
        arrayList.add("is_video_playing=" + this.is_video_playing);
        arrayList.add("video_start_offset_ms=" + this.video_start_offset_ms);
        arrayList.add("is_video_full_screen=" + this.is_video_full_screen);
        String str2 = this.asset_url;
        if (str2 != null) {
            arrayList.add("asset_url=" + Internal.sanitize(str2));
        }
        arrayList.add("is_gold_styled=" + this.is_gold_styled);
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetVideoViewModelResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetVideoViewModelResponse copy$default(GetVideoViewModelResponse getVideoViewModelResponse, String str, boolean z, long j, boolean z2, String str2, boolean z3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getVideoViewModelResponse.video_url;
        }
        if ((i & 2) != 0) {
            z = getVideoViewModelResponse.is_video_playing;
        }
        if ((i & 4) != 0) {
            j = getVideoViewModelResponse.video_start_offset_ms;
        }
        if ((i & 8) != 0) {
            z2 = getVideoViewModelResponse.is_video_full_screen;
        }
        if ((i & 16) != 0) {
            str2 = getVideoViewModelResponse.asset_url;
        }
        if ((i & 32) != 0) {
            z3 = getVideoViewModelResponse.is_gold_styled;
        }
        if ((i & 64) != 0) {
            byteString = getVideoViewModelResponse.unknownFields();
        }
        long j2 = j;
        return getVideoViewModelResponse.copy(str, z, j2, z2, str2, z3, byteString);
    }

    public final GetVideoViewModelResponse copy(String video_url, boolean is_video_playing, long video_start_offset_ms, boolean is_video_full_screen, String asset_url, boolean is_gold_styled, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetVideoViewModelResponse(video_url, is_video_playing, video_start_offset_ms, is_video_full_screen, asset_url, is_gold_styled, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetVideoViewModelResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetVideoViewModelResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: trivia.v1.GetVideoViewModelResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetVideoViewModelResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(1, value.getVideo_url());
                if (value.getIs_video_playing()) {
                    iEncodedSizeWithTag += ProtoAdapter.BOOL.encodedSizeWithTag(2, Boolean.valueOf(value.getIs_video_playing()));
                }
                if (value.getVideo_start_offset_ms() != 0) {
                    iEncodedSizeWithTag += ProtoAdapter.INT64.encodedSizeWithTag(3, Long.valueOf(value.getVideo_start_offset_ms()));
                }
                if (value.getIs_video_full_screen()) {
                    iEncodedSizeWithTag += ProtoAdapter.BOOL.encodedSizeWithTag(4, Boolean.valueOf(value.getIs_video_full_screen()));
                }
                int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(5, value.getAsset_url());
                return value.getIs_gold_styled() ? iEncodedSizeWithTag2 + ProtoAdapter.BOOL.encodedSizeWithTag(6, Boolean.valueOf(value.getIs_gold_styled())) : iEncodedSizeWithTag2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetVideoViewModelResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 1, (int) value.getVideo_url());
                if (value.getIs_video_playing()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) Boolean.valueOf(value.getIs_video_playing()));
                }
                if (value.getVideo_start_offset_ms() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 3, (int) Long.valueOf(value.getVideo_start_offset_ms()));
                }
                if (value.getIs_video_full_screen()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 4, (int) Boolean.valueOf(value.getIs_video_full_screen()));
                }
                protoAdapter.encodeWithTag(writer, 5, (int) value.getAsset_url());
                if (value.getIs_gold_styled()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 6, (int) Boolean.valueOf(value.getIs_gold_styled()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetVideoViewModelResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getIs_gold_styled()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 6, (int) Boolean.valueOf(value.getIs_gold_styled()));
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 5, (int) value.getAsset_url());
                if (value.getIs_video_full_screen()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 4, (int) Boolean.valueOf(value.getIs_video_full_screen()));
                }
                if (value.getVideo_start_offset_ms() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 3, (int) Long.valueOf(value.getVideo_start_offset_ms()));
                }
                if (value.getIs_video_playing()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) Boolean.valueOf(value.getIs_video_playing()));
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getVideo_url());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetVideoViewModelResponse redact(GetVideoViewModelResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GetVideoViewModelResponse.copy$default(value, null, false, 0L, false, null, false, ByteString.EMPTY, 63, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetVideoViewModelResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = null;
                boolean zBooleanValue = false;
                boolean zBooleanValue2 = false;
                boolean zBooleanValue3 = false;
                long jLongValue = 0;
                String strDecode2 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 3:
                                jLongValue = ProtoAdapter.INT64.decode(reader).longValue();
                                break;
                            case 4:
                                zBooleanValue2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 5:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                zBooleanValue3 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new GetVideoViewModelResponse(strDecode, zBooleanValue, jLongValue, zBooleanValue2, strDecode2, zBooleanValue3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
