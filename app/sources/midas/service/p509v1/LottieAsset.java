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

/* compiled from: LottieAsset.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0002H\u0017J\u0013\u0010\u0012\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0004H\u0016J.\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, m3636d2 = {"Lmidas/service/v1/LottieAsset;", "Lcom/squareup/wire/Message;", "", "path_light", "", "path_dark", "should_loop", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLokio/ByteString;)V", "getPath_light", "()Ljava/lang/String;", "getPath_dark", "getShould_loop", "()Z", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "midas.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class LottieAsset extends Message {

    @JvmField
    public static final ProtoAdapter<LottieAsset> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String path_dark;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String path_light;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final boolean should_loop;

    public LottieAsset() {
        this(null, null, false, null, 15, null);
    }

    public /* synthetic */ LottieAsset(String str, String str2, boolean z, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29321newBuilder();
    }

    public final String getPath_light() {
        return this.path_light;
    }

    public final String getPath_dark() {
        return this.path_dark;
    }

    public final boolean getShould_loop() {
        return this.should_loop;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LottieAsset(String path_light, String path_dark, boolean z, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(path_light, "path_light");
        Intrinsics.checkNotNullParameter(path_dark, "path_dark");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.path_light = path_light;
        this.path_dark = path_dark;
        this.should_loop = z;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29321newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof LottieAsset)) {
            return false;
        }
        LottieAsset lottieAsset = (LottieAsset) other;
        return Intrinsics.areEqual(unknownFields(), lottieAsset.unknownFields()) && Intrinsics.areEqual(this.path_light, lottieAsset.path_light) && Intrinsics.areEqual(this.path_dark, lottieAsset.path_dark) && this.should_loop == lottieAsset.should_loop;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.path_light.hashCode()) * 37) + this.path_dark.hashCode()) * 37) + Boolean.hashCode(this.should_loop);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("path_light=" + Internal.sanitize(this.path_light));
        arrayList.add("path_dark=" + Internal.sanitize(this.path_dark));
        arrayList.add("should_loop=" + this.should_loop);
        return CollectionsKt.joinToString$default(arrayList, ", ", "LottieAsset{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ LottieAsset copy$default(LottieAsset lottieAsset, String str, String str2, boolean z, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = lottieAsset.path_light;
        }
        if ((i & 2) != 0) {
            str2 = lottieAsset.path_dark;
        }
        if ((i & 4) != 0) {
            z = lottieAsset.should_loop;
        }
        if ((i & 8) != 0) {
            byteString = lottieAsset.unknownFields();
        }
        return lottieAsset.copy(str, str2, z, byteString);
    }

    public final LottieAsset copy(String path_light, String path_dark, boolean should_loop, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(path_light, "path_light");
        Intrinsics.checkNotNullParameter(path_dark, "path_dark");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new LottieAsset(path_light, path_dark, should_loop, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(LottieAsset.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<LottieAsset>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: midas.service.v1.LottieAsset$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(LottieAsset value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getPath_light(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getPath_light());
                }
                if (!Intrinsics.areEqual(value.getPath_dark(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getPath_dark());
                }
                return value.getShould_loop() ? size + ProtoAdapter.BOOL.encodedSizeWithTag(3, Boolean.valueOf(value.getShould_loop())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, LottieAsset value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getPath_light(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getPath_light());
                }
                if (!Intrinsics.areEqual(value.getPath_dark(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getPath_dark());
                }
                if (value.getShould_loop()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getShould_loop()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, LottieAsset value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getShould_loop()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getShould_loop()));
                }
                if (!Intrinsics.areEqual(value.getPath_dark(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getPath_dark());
                }
                if (Intrinsics.areEqual(value.getPath_light(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getPath_light());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public LottieAsset redact(LottieAsset value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return LottieAsset.copy$default(value, null, null, false, ByteString.EMPTY, 7, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public LottieAsset decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                boolean zBooleanValue = false;
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new LottieAsset(strDecode, strDecode2, zBooleanValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
