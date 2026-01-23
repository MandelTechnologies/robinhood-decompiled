package bff_money_movement.service.p019v1;

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

/* compiled from: LottieInfo.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\r\u001a\u00020\u0002H\u0017J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016J$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lbff_money_movement/service/v1/LottieInfo;", "Lcom/squareup/wire/Message;", "", "light_mode_url", "", "dark_mode_url", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getLight_mode_url", "()Ljava/lang/String;", "getDark_mode_url", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes.dex */
public final class LottieInfo extends Message {

    @JvmField
    public static final ProtoAdapter<LottieInfo> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "darkModeUrl", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String dark_mode_url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "lightModeUrl", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String light_mode_url;

    public LottieInfo() {
        this(null, null, null, 7, null);
    }

    public /* synthetic */ LottieInfo(String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8495newBuilder();
    }

    public final String getLight_mode_url() {
        return this.light_mode_url;
    }

    public final String getDark_mode_url() {
        return this.dark_mode_url;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LottieInfo(String light_mode_url, String dark_mode_url, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(light_mode_url, "light_mode_url");
        Intrinsics.checkNotNullParameter(dark_mode_url, "dark_mode_url");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.light_mode_url = light_mode_url;
        this.dark_mode_url = dark_mode_url;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8495newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof LottieInfo)) {
            return false;
        }
        LottieInfo lottieInfo = (LottieInfo) other;
        return Intrinsics.areEqual(unknownFields(), lottieInfo.unknownFields()) && Intrinsics.areEqual(this.light_mode_url, lottieInfo.light_mode_url) && Intrinsics.areEqual(this.dark_mode_url, lottieInfo.dark_mode_url);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.light_mode_url.hashCode()) * 37) + this.dark_mode_url.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("light_mode_url=" + Internal.sanitize(this.light_mode_url));
        arrayList.add("dark_mode_url=" + Internal.sanitize(this.dark_mode_url));
        return CollectionsKt.joinToString$default(arrayList, ", ", "LottieInfo{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ LottieInfo copy$default(LottieInfo lottieInfo, String str, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = lottieInfo.light_mode_url;
        }
        if ((i & 2) != 0) {
            str2 = lottieInfo.dark_mode_url;
        }
        if ((i & 4) != 0) {
            byteString = lottieInfo.unknownFields();
        }
        return lottieInfo.copy(str, str2, byteString);
    }

    public final LottieInfo copy(String light_mode_url, String dark_mode_url, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(light_mode_url, "light_mode_url");
        Intrinsics.checkNotNullParameter(dark_mode_url, "dark_mode_url");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new LottieInfo(light_mode_url, dark_mode_url, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(LottieInfo.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<LottieInfo>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bff_money_movement.service.v1.LottieInfo$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(LottieInfo value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getLight_mode_url(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getLight_mode_url());
                }
                return !Intrinsics.areEqual(value.getDark_mode_url(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(2, value.getDark_mode_url()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, LottieInfo value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getLight_mode_url(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getLight_mode_url());
                }
                if (!Intrinsics.areEqual(value.getDark_mode_url(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getDark_mode_url());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, LottieInfo value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getDark_mode_url(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getDark_mode_url());
                }
                if (Intrinsics.areEqual(value.getLight_mode_url(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getLight_mode_url());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public LottieInfo redact(LottieInfo value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return LottieInfo.copy$default(value, null, null, ByteString.EMPTY, 3, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public LottieInfo decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new LottieInfo(strDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
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
