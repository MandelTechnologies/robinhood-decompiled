package midas.service.p509v1;

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
import rh_server_driven_ui.p531v1.PogWithPictogram;

/* compiled from: Asset.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J4\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, m3636d2 = {"Lmidas/service/v1/Asset;", "Lcom/squareup/wire/Message;", "", "image", "Lmidas/service/v1/ImageAsset;", "lottie", "Lmidas/service/v1/LottieAsset;", "pog", "Lrh_server_driven_ui/v1/PogWithPictogram;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lmidas/service/v1/ImageAsset;Lmidas/service/v1/LottieAsset;Lrh_server_driven_ui/v1/PogWithPictogram;Lokio/ByteString;)V", "getImage", "()Lmidas/service/v1/ImageAsset;", "getLottie", "()Lmidas/service/v1/LottieAsset;", "getPog", "()Lrh_server_driven_ui/v1/PogWithPictogram;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "midas.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class Asset extends Message {

    @JvmField
    public static final ProtoAdapter<Asset> ADAPTER;

    @WireField(adapter = "midas.service.v1.ImageAsset#ADAPTER", oneofName = "type", schemaIndex = 0, tag = 1)
    private final ImageAsset image;

    @WireField(adapter = "midas.service.v1.LottieAsset#ADAPTER", oneofName = "type", schemaIndex = 1, tag = 2)
    private final LottieAsset lottie;

    @WireField(adapter = "rh_server_driven_ui.v1.PogWithPictogram#ADAPTER", oneofName = "type", schemaIndex = 2, tag = 3)
    private final PogWithPictogram pog;

    public Asset() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29314newBuilder();
    }

    public final ImageAsset getImage() {
        return this.image;
    }

    public final LottieAsset getLottie() {
        return this.lottie;
    }

    public final PogWithPictogram getPog() {
        return this.pog;
    }

    public /* synthetic */ Asset(ImageAsset imageAsset, LottieAsset lottieAsset, PogWithPictogram pogWithPictogram, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : imageAsset, (i & 2) != 0 ? null : lottieAsset, (i & 4) != 0 ? null : pogWithPictogram, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Asset(ImageAsset imageAsset, LottieAsset lottieAsset, PogWithPictogram pogWithPictogram, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.image = imageAsset;
        this.lottie = lottieAsset;
        this.pog = pogWithPictogram;
        if (Internal.countNonNull(imageAsset, lottieAsset, pogWithPictogram) > 1) {
            throw new IllegalArgumentException("At most one of image, lottie, pog may be non-null");
        }
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29314newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Asset)) {
            return false;
        }
        Asset asset = (Asset) other;
        return Intrinsics.areEqual(unknownFields(), asset.unknownFields()) && Intrinsics.areEqual(this.image, asset.image) && Intrinsics.areEqual(this.lottie, asset.lottie) && Intrinsics.areEqual(this.pog, asset.pog);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        ImageAsset imageAsset = this.image;
        int iHashCode2 = (iHashCode + (imageAsset != null ? imageAsset.hashCode() : 0)) * 37;
        LottieAsset lottieAsset = this.lottie;
        int iHashCode3 = (iHashCode2 + (lottieAsset != null ? lottieAsset.hashCode() : 0)) * 37;
        PogWithPictogram pogWithPictogram = this.pog;
        int iHashCode4 = iHashCode3 + (pogWithPictogram != null ? pogWithPictogram.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        ImageAsset imageAsset = this.image;
        if (imageAsset != null) {
            arrayList.add("image=" + imageAsset);
        }
        LottieAsset lottieAsset = this.lottie;
        if (lottieAsset != null) {
            arrayList.add("lottie=" + lottieAsset);
        }
        PogWithPictogram pogWithPictogram = this.pog;
        if (pogWithPictogram != null) {
            arrayList.add("pog=" + pogWithPictogram);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Asset{", "}", 0, null, null, 56, null);
    }

    public final Asset copy(ImageAsset image, LottieAsset lottie, PogWithPictogram pog, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new Asset(image, lottie, pog, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Asset.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<Asset>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: midas.service.v1.Asset$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Asset value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + ImageAsset.ADAPTER.encodedSizeWithTag(1, value.getImage()) + LottieAsset.ADAPTER.encodedSizeWithTag(2, value.getLottie()) + PogWithPictogram.ADAPTER.encodedSizeWithTag(3, value.getPog());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Asset value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ImageAsset.ADAPTER.encodeWithTag(writer, 1, (int) value.getImage());
                LottieAsset.ADAPTER.encodeWithTag(writer, 2, (int) value.getLottie());
                PogWithPictogram.ADAPTER.encodeWithTag(writer, 3, (int) value.getPog());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Asset value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                PogWithPictogram.ADAPTER.encodeWithTag(writer, 3, (int) value.getPog());
                LottieAsset.ADAPTER.encodeWithTag(writer, 2, (int) value.getLottie());
                ImageAsset.ADAPTER.encodeWithTag(writer, 1, (int) value.getImage());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Asset redact(Asset value) {
                Intrinsics.checkNotNullParameter(value, "value");
                ImageAsset image = value.getImage();
                ImageAsset imageAssetRedact = image != null ? ImageAsset.ADAPTER.redact(image) : null;
                LottieAsset lottie = value.getLottie();
                LottieAsset lottieAssetRedact = lottie != null ? LottieAsset.ADAPTER.redact(lottie) : null;
                PogWithPictogram pog = value.getPog();
                return value.copy(imageAssetRedact, lottieAssetRedact, pog != null ? PogWithPictogram.ADAPTER.redact(pog) : null, ByteString.EMPTY);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Asset decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                ImageAsset imageAssetDecode = null;
                LottieAsset lottieAssetDecode = null;
                PogWithPictogram pogWithPictogramDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new Asset(imageAssetDecode, lottieAssetDecode, pogWithPictogramDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        imageAssetDecode = ImageAsset.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        lottieAssetDecode = LottieAsset.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        pogWithPictogramDecode = PogWithPictogram.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
