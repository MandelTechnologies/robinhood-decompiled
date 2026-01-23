package bonfire.proto.idl.crypto.p033v1;

import android.os.Parcel;
import android.os.Parcelable;
import bonfire.proto.idl.crypto.p033v1.FeedbackDto;
import bonfire.proto.idl.crypto.p033v1.MediaDto;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: DataDto.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 32\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00044356B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u008f\u0001\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\b\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0006\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00142\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0096\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0018H\u0016¢\u0006\u0004\b#\u0010$J\u001f\u0010)\u001a\u00020(2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u0018H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0018H\u0016¢\u0006\u0004\b+\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010,R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b-\u0010\u001eR\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b.\u0010\u001eR\u0011\u0010\u000b\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b/\u0010\u001eR\u0011\u0010\f\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b0\u0010\u001eR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b1\u00102¨\u00067"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/DataDto;", "Lcom/robinhood/idl/MessageDto;", "Lbonfire/proto/idl/crypto/v1/Data;", "Landroid/os/Parcelable;", "Lbonfire/proto/idl/crypto/v1/DataDto$Surrogate;", "surrogate", "<init>", "(Lbonfire/proto/idl/crypto/v1/DataDto$Surrogate;)V", "", "source", "title", "published_at", "url", "source_uri", "Lbonfire/proto/idl/crypto/v1/FeedbackDto;", "feedback", "Lbonfire/proto/idl/crypto/v1/MediaDto;", "media", "preview_media", "preview_text", "", "is_embedded", "logo_hex_code", "authors", "", "popularity", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbonfire/proto/idl/crypto/v1/FeedbackDto;Lbonfire/proto/idl/crypto/v1/MediaDto;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;I)V", "toProto", "()Lbonfire/proto/idl/crypto/v1/Data;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbonfire/proto/idl/crypto/v1/DataDto$Surrogate;", "getSource", "getTitle", "getPublished_at", "getUrl", "getMedia", "()Lbonfire/proto/idl/crypto/v1/MediaDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes16.dex */
public final class DataDto implements Dto3<Data>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<DataDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<DataDto, Data>> binaryBase64Serializer$delegate;
    private static final DataDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ DataDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private DataDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getSource() {
        return this.surrogate.getSource();
    }

    public final String getTitle() {
        return this.surrogate.getTitle();
    }

    public final String getPublished_at() {
        return this.surrogate.getPublished_at();
    }

    public final String getUrl() {
        return this.surrogate.getUrl();
    }

    public final MediaDto getMedia() {
        return this.surrogate.getMedia();
    }

    public /* synthetic */ DataDto(String str, String str2, String str3, String str4, String str5, FeedbackDto feedbackDto, MediaDto mediaDto, String str6, String str7, boolean z, String str8, String str9, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? "" : str5, (i2 & 32) != 0 ? null : feedbackDto, (i2 & 64) == 0 ? mediaDto : null, (i2 & 128) != 0 ? "" : str6, (i2 & 256) != 0 ? "" : str7, (i2 & 512) != 0 ? false : z, (i2 & 1024) != 0 ? "" : str8, (i2 & 2048) == 0 ? str9 : "", (i2 & 4096) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DataDto(String source, String title, String published_at, String url, String source_uri, FeedbackDto feedbackDto, MediaDto mediaDto, String preview_media, String preview_text, boolean z, String logo_hex_code, String authors, int i) {
        this(new Surrogate(source, title, published_at, url, source_uri, feedbackDto, mediaDto, preview_media, preview_text, z, logo_hex_code, authors, i));
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(published_at, "published_at");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(source_uri, "source_uri");
        Intrinsics.checkNotNullParameter(preview_media, "preview_media");
        Intrinsics.checkNotNullParameter(preview_text, "preview_text");
        Intrinsics.checkNotNullParameter(logo_hex_code, "logo_hex_code");
        Intrinsics.checkNotNullParameter(authors, "authors");
    }

    @Override // com.robinhood.idl.Dto
    public Data toProto() {
        String source = this.surrogate.getSource();
        String title = this.surrogate.getTitle();
        String published_at = this.surrogate.getPublished_at();
        String url = this.surrogate.getUrl();
        String source_uri = this.surrogate.getSource_uri();
        FeedbackDto feedback = this.surrogate.getFeedback();
        Feedback proto = feedback != null ? feedback.toProto() : null;
        MediaDto media = this.surrogate.getMedia();
        return new Data(source, title, published_at, url, source_uri, proto, media != null ? media.toProto() : null, this.surrogate.getPreview_media(), this.surrogate.getPreview_text(), this.surrogate.getIs_embedded(), this.surrogate.getLogo_hex_code(), this.surrogate.getAuthors(), this.surrogate.getPopularity(), null, 8192, null);
    }

    public String toString() {
        return "[DataDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof DataDto) && Intrinsics.areEqual(((DataDto) other).surrogate, this.surrogate);
        }
        return true;
    }

    public int hashCode() {
        return this.surrogate.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DataDto.kt */
    @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b/\b\u0083\b\u0018\u0000 O2\u00020\u0001:\u0002POB\u009c\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\u0017\b\u0002\u0010\u0016\u001a\u00110\u0012¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\t0\u0015¢\u0006\u0004\b\u0017\u0010\u0018B\u0099\u0001\b\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u0012\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0012\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u0017\u0010\u001cJ'\u0010%\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010+\u001a\u00020\u000e2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010-\u0012\u0004\b/\u00100\u001a\u0004\b.\u0010'R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010-\u0012\u0004\b2\u00100\u001a\u0004\b1\u0010'R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010-\u0012\u0004\b4\u00100\u001a\u0004\b3\u0010'R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010-\u0012\u0004\b6\u00100\u001a\u0004\b5\u0010'R \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010-\u0012\u0004\b8\u00100\u001a\u0004\b7\u0010'R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00109\u0012\u0004\b<\u00100\u001a\u0004\b:\u0010;R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010=\u0012\u0004\b@\u00100\u001a\u0004\b>\u0010?R \u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010-\u0012\u0004\bB\u00100\u001a\u0004\bA\u0010'R \u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010-\u0012\u0004\bD\u00100\u001a\u0004\bC\u0010'R \u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010E\u0012\u0004\bG\u00100\u001a\u0004\b\u000f\u0010FR \u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010-\u0012\u0004\bI\u00100\u001a\u0004\bH\u0010'R \u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010-\u0012\u0004\bK\u00100\u001a\u0004\bJ\u0010'R/\u0010\u0016\u001a\u00110\u0012¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\t0\u00158\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010L\u0012\u0004\bN\u00100\u001a\u0004\bM\u0010)¨\u0006Q"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/DataDto$Surrogate;", "", "", "source", "title", "published_at", "url", "source_uri", "Lbonfire/proto/idl/crypto/v1/FeedbackDto;", "feedback", "Lbonfire/proto/idl/crypto/v1/MediaDto;", "media", "preview_media", "preview_text", "", "is_embedded", "logo_hex_code", "authors", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int32Serializer;", "popularity", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbonfire/proto/idl/crypto/v1/FeedbackDto;Lbonfire/proto/idl/crypto/v1/MediaDto;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;I)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbonfire/proto/idl/crypto/v1/FeedbackDto;Lbonfire/proto/idl/crypto/v1/MediaDto;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bonfire_proto_idl_crypto_v1_externalRelease", "(Lbonfire/proto/idl/crypto/v1/DataDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSource", "getSource$annotations", "()V", "getTitle", "getTitle$annotations", "getPublished_at", "getPublished_at$annotations", "getUrl", "getUrl$annotations", "getSource_uri", "getSource_uri$annotations", "Lbonfire/proto/idl/crypto/v1/FeedbackDto;", "getFeedback", "()Lbonfire/proto/idl/crypto/v1/FeedbackDto;", "getFeedback$annotations", "Lbonfire/proto/idl/crypto/v1/MediaDto;", "getMedia", "()Lbonfire/proto/idl/crypto/v1/MediaDto;", "getMedia$annotations", "getPreview_media", "getPreview_media$annotations", "getPreview_text", "getPreview_text$annotations", "Z", "()Z", "is_embedded$annotations", "getLogo_hex_code", "getLogo_hex_code$annotations", "getAuthors", "getAuthors$annotations", "I", "getPopularity", "getPopularity$annotations", "Companion", "$serializer", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String authors;
        private final FeedbackDto feedback;
        private final boolean is_embedded;
        private final String logo_hex_code;
        private final MediaDto media;
        private final int popularity;
        private final String preview_media;
        private final String preview_text;
        private final String published_at;
        private final String source;
        private final String source_uri;
        private final String title;
        private final String url;

        public Surrogate() {
            this((String) null, (String) null, (String) null, (String) null, (String) null, (FeedbackDto) null, (MediaDto) null, (String) null, (String) null, false, (String) null, (String) null, 0, 8191, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.source, surrogate.source) && Intrinsics.areEqual(this.title, surrogate.title) && Intrinsics.areEqual(this.published_at, surrogate.published_at) && Intrinsics.areEqual(this.url, surrogate.url) && Intrinsics.areEqual(this.source_uri, surrogate.source_uri) && Intrinsics.areEqual(this.feedback, surrogate.feedback) && Intrinsics.areEqual(this.media, surrogate.media) && Intrinsics.areEqual(this.preview_media, surrogate.preview_media) && Intrinsics.areEqual(this.preview_text, surrogate.preview_text) && this.is_embedded == surrogate.is_embedded && Intrinsics.areEqual(this.logo_hex_code, surrogate.logo_hex_code) && Intrinsics.areEqual(this.authors, surrogate.authors) && this.popularity == surrogate.popularity;
        }

        public int hashCode() {
            int iHashCode = ((((((((this.source.hashCode() * 31) + this.title.hashCode()) * 31) + this.published_at.hashCode()) * 31) + this.url.hashCode()) * 31) + this.source_uri.hashCode()) * 31;
            FeedbackDto feedbackDto = this.feedback;
            int iHashCode2 = (iHashCode + (feedbackDto == null ? 0 : feedbackDto.hashCode())) * 31;
            MediaDto mediaDto = this.media;
            return ((((((((((((iHashCode2 + (mediaDto != null ? mediaDto.hashCode() : 0)) * 31) + this.preview_media.hashCode()) * 31) + this.preview_text.hashCode()) * 31) + Boolean.hashCode(this.is_embedded)) * 31) + this.logo_hex_code.hashCode()) * 31) + this.authors.hashCode()) * 31) + Integer.hashCode(this.popularity);
        }

        public String toString() {
            return "Surrogate(source=" + this.source + ", title=" + this.title + ", published_at=" + this.published_at + ", url=" + this.url + ", source_uri=" + this.source_uri + ", feedback=" + this.feedback + ", media=" + this.media + ", preview_media=" + this.preview_media + ", preview_text=" + this.preview_text + ", is_embedded=" + this.is_embedded + ", logo_hex_code=" + this.logo_hex_code + ", authors=" + this.authors + ", popularity=" + this.popularity + ")";
        }

        /* compiled from: DataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/DataDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/crypto/v1/DataDto$Surrogate;", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return DataDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, String str4, String str5, FeedbackDto feedbackDto, MediaDto mediaDto, String str6, String str7, boolean z, String str8, String str9, int i2, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.source = "";
            } else {
                this.source = str;
            }
            if ((i & 2) == 0) {
                this.title = "";
            } else {
                this.title = str2;
            }
            if ((i & 4) == 0) {
                this.published_at = "";
            } else {
                this.published_at = str3;
            }
            if ((i & 8) == 0) {
                this.url = "";
            } else {
                this.url = str4;
            }
            if ((i & 16) == 0) {
                this.source_uri = "";
            } else {
                this.source_uri = str5;
            }
            if ((i & 32) == 0) {
                this.feedback = null;
            } else {
                this.feedback = feedbackDto;
            }
            if ((i & 64) == 0) {
                this.media = null;
            } else {
                this.media = mediaDto;
            }
            if ((i & 128) == 0) {
                this.preview_media = "";
            } else {
                this.preview_media = str6;
            }
            if ((i & 256) == 0) {
                this.preview_text = "";
            } else {
                this.preview_text = str7;
            }
            if ((i & 512) == 0) {
                this.is_embedded = false;
            } else {
                this.is_embedded = z;
            }
            if ((i & 1024) == 0) {
                this.logo_hex_code = "";
            } else {
                this.logo_hex_code = str8;
            }
            if ((i & 2048) == 0) {
                this.authors = "";
            } else {
                this.authors = str9;
            }
            if ((i & 4096) == 0) {
                this.popularity = 0;
            } else {
                this.popularity = i2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$bonfire_proto_idl_crypto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.source, "")) {
                output.encodeStringElement(serialDesc, 0, self.source);
            }
            if (!Intrinsics.areEqual(self.title, "")) {
                output.encodeStringElement(serialDesc, 1, self.title);
            }
            if (!Intrinsics.areEqual(self.published_at, "")) {
                output.encodeStringElement(serialDesc, 2, self.published_at);
            }
            if (!Intrinsics.areEqual(self.url, "")) {
                output.encodeStringElement(serialDesc, 3, self.url);
            }
            if (!Intrinsics.areEqual(self.source_uri, "")) {
                output.encodeStringElement(serialDesc, 4, self.source_uri);
            }
            FeedbackDto feedbackDto = self.feedback;
            if (feedbackDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, FeedbackDto.Serializer.INSTANCE, feedbackDto);
            }
            MediaDto mediaDto = self.media;
            if (mediaDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, MediaDto.Serializer.INSTANCE, mediaDto);
            }
            if (!Intrinsics.areEqual(self.preview_media, "")) {
                output.encodeStringElement(serialDesc, 7, self.preview_media);
            }
            if (!Intrinsics.areEqual(self.preview_text, "")) {
                output.encodeStringElement(serialDesc, 8, self.preview_text);
            }
            boolean z = self.is_embedded;
            if (z) {
                output.encodeBooleanElement(serialDesc, 9, z);
            }
            if (!Intrinsics.areEqual(self.logo_hex_code, "")) {
                output.encodeStringElement(serialDesc, 10, self.logo_hex_code);
            }
            if (!Intrinsics.areEqual(self.authors, "")) {
                output.encodeStringElement(serialDesc, 11, self.authors);
            }
            int i = self.popularity;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 12, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
        }

        public Surrogate(String source, String title, String published_at, String url, String source_uri, FeedbackDto feedbackDto, MediaDto mediaDto, String preview_media, String preview_text, boolean z, String logo_hex_code, String authors, int i) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(published_at, "published_at");
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(source_uri, "source_uri");
            Intrinsics.checkNotNullParameter(preview_media, "preview_media");
            Intrinsics.checkNotNullParameter(preview_text, "preview_text");
            Intrinsics.checkNotNullParameter(logo_hex_code, "logo_hex_code");
            Intrinsics.checkNotNullParameter(authors, "authors");
            this.source = source;
            this.title = title;
            this.published_at = published_at;
            this.url = url;
            this.source_uri = source_uri;
            this.feedback = feedbackDto;
            this.media = mediaDto;
            this.preview_media = preview_media;
            this.preview_text = preview_text;
            this.is_embedded = z;
            this.logo_hex_code = logo_hex_code;
            this.authors = authors;
            this.popularity = i;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, String str4, String str5, FeedbackDto feedbackDto, MediaDto mediaDto, String str6, String str7, boolean z, String str8, String str9, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? "" : str5, (i2 & 32) != 0 ? null : feedbackDto, (i2 & 64) == 0 ? mediaDto : null, (i2 & 128) != 0 ? "" : str6, (i2 & 256) != 0 ? "" : str7, (i2 & 512) != 0 ? false : z, (i2 & 1024) != 0 ? "" : str8, (i2 & 2048) == 0 ? str9 : "", (i2 & 4096) != 0 ? 0 : i);
        }

        public final String getSource() {
            return this.source;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getPublished_at() {
            return this.published_at;
        }

        public final String getUrl() {
            return this.url;
        }

        public final String getSource_uri() {
            return this.source_uri;
        }

        public final FeedbackDto getFeedback() {
            return this.feedback;
        }

        public final MediaDto getMedia() {
            return this.media;
        }

        public final String getPreview_media() {
            return this.preview_media;
        }

        public final String getPreview_text() {
            return this.preview_text;
        }

        /* renamed from: is_embedded, reason: from getter */
        public final boolean getIs_embedded() {
            return this.is_embedded;
        }

        public final String getLogo_hex_code() {
            return this.logo_hex_code;
        }

        public final String getAuthors() {
            return this.authors;
        }

        public final int getPopularity() {
            return this.popularity;
        }
    }

    /* compiled from: DataDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/DataDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbonfire/proto/idl/crypto/v1/DataDto;", "Lbonfire/proto/idl/crypto/v1/Data;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbonfire/proto/idl/crypto/v1/DataDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<DataDto, Data> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<DataDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<DataDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<DataDto> getBinaryBase64Serializer() {
            return (KSerializer) DataDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<Data> getProtoAdapter() {
            return Data.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public DataDto getZeroValue() {
            return DataDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public DataDto fromProto(Data proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String source = proto.getSource();
            String title = proto.getTitle();
            String published_at = proto.getPublished_at();
            String url = proto.getUrl();
            String source_uri = proto.getSource_uri();
            Feedback feedback = proto.getFeedback();
            DefaultConstructorMarker defaultConstructorMarker = null;
            FeedbackDto feedbackDtoFromProto = feedback != null ? FeedbackDto.INSTANCE.fromProto(feedback) : null;
            Media media = proto.getMedia();
            return new DataDto(new Surrogate(source, title, published_at, url, source_uri, feedbackDtoFromProto, media != null ? MediaDto.INSTANCE.fromProto(media) : null, proto.getPreview_media(), proto.getPreview_text(), proto.getIs_embedded(), proto.getLogo_hex_code(), proto.getAuthors(), proto.getPopularity()), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bonfire.proto.idl.crypto.v1.DataDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DataDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new DataDto(null, null, null, null, null, null, null, null, null, false, null, null, 0, 8191, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: DataDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/DataDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/crypto/v1/DataDto;", "<init>", "()V", "surrogateSerializer", "Lbonfire/proto/idl/crypto/v1/DataDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<DataDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bonfire.proto.idl.crypto.v1.Data", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, DataDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public DataDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new DataDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: DataDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/DataDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4190_6)
        public final String provideIntoMap() {
            return "bonfire.proto.idl.crypto.v1.DataDto";
        }
    }
}
