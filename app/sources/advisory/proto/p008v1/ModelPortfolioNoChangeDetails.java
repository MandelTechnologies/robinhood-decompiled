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

/* compiled from: ModelPortfolioNoChangeDetails.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\r\u001a\u00020\u0002H\u0017J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016J$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Ladvisory/proto/v1/ModelPortfolioNoChangeDetails;", "Lcom/squareup/wire/Message;", "", "lottie_url_light", "", "lottie_url_dark", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getLottie_url_light", "()Ljava/lang/String;", "getLottie_url_dark", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class ModelPortfolioNoChangeDetails extends Message {

    @JvmField
    public static final ProtoAdapter<ModelPortfolioNoChangeDetails> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "lottieUrlDark", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String lottie_url_dark;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "lottieUrlLight", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String lottie_url_light;

    public ModelPortfolioNoChangeDetails() {
        this(null, null, null, 7, null);
    }

    public /* synthetic */ ModelPortfolioNoChangeDetails(String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m4523newBuilder();
    }

    public final String getLottie_url_light() {
        return this.lottie_url_light;
    }

    public final String getLottie_url_dark() {
        return this.lottie_url_dark;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModelPortfolioNoChangeDetails(String lottie_url_light, String lottie_url_dark, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(lottie_url_light, "lottie_url_light");
        Intrinsics.checkNotNullParameter(lottie_url_dark, "lottie_url_dark");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.lottie_url_light = lottie_url_light;
        this.lottie_url_dark = lottie_url_dark;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m4523newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ModelPortfolioNoChangeDetails)) {
            return false;
        }
        ModelPortfolioNoChangeDetails modelPortfolioNoChangeDetails = (ModelPortfolioNoChangeDetails) other;
        return Intrinsics.areEqual(unknownFields(), modelPortfolioNoChangeDetails.unknownFields()) && Intrinsics.areEqual(this.lottie_url_light, modelPortfolioNoChangeDetails.lottie_url_light) && Intrinsics.areEqual(this.lottie_url_dark, modelPortfolioNoChangeDetails.lottie_url_dark);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.lottie_url_light.hashCode()) * 37) + this.lottie_url_dark.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("lottie_url_light=" + Internal.sanitize(this.lottie_url_light));
        arrayList.add("lottie_url_dark=" + Internal.sanitize(this.lottie_url_dark));
        return CollectionsKt.joinToString$default(arrayList, ", ", "ModelPortfolioNoChangeDetails{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ModelPortfolioNoChangeDetails copy$default(ModelPortfolioNoChangeDetails modelPortfolioNoChangeDetails, String str, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = modelPortfolioNoChangeDetails.lottie_url_light;
        }
        if ((i & 2) != 0) {
            str2 = modelPortfolioNoChangeDetails.lottie_url_dark;
        }
        if ((i & 4) != 0) {
            byteString = modelPortfolioNoChangeDetails.unknownFields();
        }
        return modelPortfolioNoChangeDetails.copy(str, str2, byteString);
    }

    public final ModelPortfolioNoChangeDetails copy(String lottie_url_light, String lottie_url_dark, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(lottie_url_light, "lottie_url_light");
        Intrinsics.checkNotNullParameter(lottie_url_dark, "lottie_url_dark");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ModelPortfolioNoChangeDetails(lottie_url_light, lottie_url_dark, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ModelPortfolioNoChangeDetails.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ModelPortfolioNoChangeDetails>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: advisory.proto.v1.ModelPortfolioNoChangeDetails$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ModelPortfolioNoChangeDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getLottie_url_light(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getLottie_url_light());
                }
                return !Intrinsics.areEqual(value.getLottie_url_dark(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(2, value.getLottie_url_dark()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ModelPortfolioNoChangeDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getLottie_url_light(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getLottie_url_light());
                }
                if (!Intrinsics.areEqual(value.getLottie_url_dark(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getLottie_url_dark());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ModelPortfolioNoChangeDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getLottie_url_dark(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getLottie_url_dark());
                }
                if (Intrinsics.areEqual(value.getLottie_url_light(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getLottie_url_light());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ModelPortfolioNoChangeDetails redact(ModelPortfolioNoChangeDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return ModelPortfolioNoChangeDetails.copy$default(value, null, null, ByteString.EMPTY, 3, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ModelPortfolioNoChangeDetails decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new ModelPortfolioNoChangeDetails(strDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
