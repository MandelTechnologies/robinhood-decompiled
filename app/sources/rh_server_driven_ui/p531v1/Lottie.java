package rh_server_driven_ui.p531v1;

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

/* compiled from: Lottie.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 (2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001(B]\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u001f\u001a\u00020\u0002H\u0017J\u0013\u0010 \u001a\u00020\u00072\b\u0010!\u001a\u0004\u0018\u00010\"H\u0096\u0002J\b\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020\u0004H\u0016Ja\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010'R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001e\u0010\u001c¨\u0006)"}, m3636d2 = {"Lrh_server_driven_ui/v1/Lottie;", "Lcom/squareup/wire/Message;", "", "light_mode_content_url", "", "dark_mode_content_url", "should_loop", "", "aspect_ratio", "", "start_position", "should_auto_play", "use_core_animation_renderer", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZFLjava/lang/Float;Ljava/lang/Boolean;Ljava/lang/Boolean;Lokio/ByteString;)V", "getLight_mode_content_url", "()Ljava/lang/String;", "getDark_mode_content_url", "getShould_loop", "()Z", "getAspect_ratio", "()F", "getStart_position", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getShould_auto_play", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getUse_core_animation_renderer", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "(Ljava/lang/String;Ljava/lang/String;ZFLjava/lang/Float;Ljava/lang/Boolean;Ljava/lang/Boolean;Lokio/ByteString;)Lrh_server_driven_ui/v1/Lottie;", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class Lottie extends Message {

    @JvmField
    public static final ProtoAdapter<Lottie> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "aspectRatio", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final float aspect_ratio;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "darkModeContentUrl", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String dark_mode_content_url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "lightModeContentUrl", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String light_mode_content_url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "shouldAutoPlay", schemaIndex = 5, tag = 6)
    private final Boolean should_auto_play;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "shouldLoop", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final boolean should_loop;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "startPosition", schemaIndex = 4, tag = 5)
    private final Float start_position;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "useCoreAnimationRenderer", schemaIndex = 6, tag = 7)
    private final Boolean use_core_animation_renderer;

    public Lottie() {
        this(null, null, false, 0.0f, null, null, null, null, 255, null);
    }

    public /* synthetic */ Lottie(String str, String str2, boolean z, float f, Float f2, Boolean bool, Boolean bool2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? 0.0f : f, (i & 16) != 0 ? null : f2, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : bool2, (i & 128) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29773newBuilder();
    }

    public final String getLight_mode_content_url() {
        return this.light_mode_content_url;
    }

    public final String getDark_mode_content_url() {
        return this.dark_mode_content_url;
    }

    public final boolean getShould_loop() {
        return this.should_loop;
    }

    public final float getAspect_ratio() {
        return this.aspect_ratio;
    }

    public final Float getStart_position() {
        return this.start_position;
    }

    public final Boolean getShould_auto_play() {
        return this.should_auto_play;
    }

    public final Boolean getUse_core_animation_renderer() {
        return this.use_core_animation_renderer;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Lottie(String light_mode_content_url, String dark_mode_content_url, boolean z, float f, Float f2, Boolean bool, Boolean bool2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(light_mode_content_url, "light_mode_content_url");
        Intrinsics.checkNotNullParameter(dark_mode_content_url, "dark_mode_content_url");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.light_mode_content_url = light_mode_content_url;
        this.dark_mode_content_url = dark_mode_content_url;
        this.should_loop = z;
        this.aspect_ratio = f;
        this.start_position = f2;
        this.should_auto_play = bool;
        this.use_core_animation_renderer = bool2;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29773newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Lottie)) {
            return false;
        }
        Lottie lottie = (Lottie) other;
        return Intrinsics.areEqual(unknownFields(), lottie.unknownFields()) && Intrinsics.areEqual(this.light_mode_content_url, lottie.light_mode_content_url) && Intrinsics.areEqual(this.dark_mode_content_url, lottie.dark_mode_content_url) && this.should_loop == lottie.should_loop && this.aspect_ratio == lottie.aspect_ratio && Intrinsics.areEqual(this.start_position, lottie.start_position) && Intrinsics.areEqual(this.should_auto_play, lottie.should_auto_play) && Intrinsics.areEqual(this.use_core_animation_renderer, lottie.use_core_animation_renderer);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((unknownFields().hashCode() * 37) + this.light_mode_content_url.hashCode()) * 37) + this.dark_mode_content_url.hashCode()) * 37) + Boolean.hashCode(this.should_loop)) * 37) + Float.hashCode(this.aspect_ratio)) * 37;
        Float f = this.start_position;
        int iHashCode2 = (iHashCode + (f != null ? f.hashCode() : 0)) * 37;
        Boolean bool = this.should_auto_play;
        int iHashCode3 = (iHashCode2 + (bool != null ? bool.hashCode() : 0)) * 37;
        Boolean bool2 = this.use_core_animation_renderer;
        int iHashCode4 = iHashCode3 + (bool2 != null ? bool2.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("light_mode_content_url=" + Internal.sanitize(this.light_mode_content_url));
        arrayList.add("dark_mode_content_url=" + Internal.sanitize(this.dark_mode_content_url));
        arrayList.add("should_loop=" + this.should_loop);
        arrayList.add("aspect_ratio=" + this.aspect_ratio);
        Float f = this.start_position;
        if (f != null) {
            arrayList.add("start_position=" + f);
        }
        Boolean bool = this.should_auto_play;
        if (bool != null) {
            arrayList.add("should_auto_play=" + bool);
        }
        Boolean bool2 = this.use_core_animation_renderer;
        if (bool2 != null) {
            arrayList.add("use_core_animation_renderer=" + bool2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Lottie{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ Lottie copy$default(Lottie lottie, String str, String str2, boolean z, float f, Float f2, Boolean bool, Boolean bool2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = lottie.light_mode_content_url;
        }
        if ((i & 2) != 0) {
            str2 = lottie.dark_mode_content_url;
        }
        if ((i & 4) != 0) {
            z = lottie.should_loop;
        }
        if ((i & 8) != 0) {
            f = lottie.aspect_ratio;
        }
        if ((i & 16) != 0) {
            f2 = lottie.start_position;
        }
        if ((i & 32) != 0) {
            bool = lottie.should_auto_play;
        }
        if ((i & 64) != 0) {
            bool2 = lottie.use_core_animation_renderer;
        }
        if ((i & 128) != 0) {
            byteString = lottie.unknownFields();
        }
        Boolean bool3 = bool2;
        ByteString byteString2 = byteString;
        Float f3 = f2;
        Boolean bool4 = bool;
        return lottie.copy(str, str2, z, f, f3, bool4, bool3, byteString2);
    }

    public final Lottie copy(String light_mode_content_url, String dark_mode_content_url, boolean should_loop, float aspect_ratio, Float start_position, Boolean should_auto_play, Boolean use_core_animation_renderer, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(light_mode_content_url, "light_mode_content_url");
        Intrinsics.checkNotNullParameter(dark_mode_content_url, "dark_mode_content_url");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new Lottie(light_mode_content_url, dark_mode_content_url, should_loop, aspect_ratio, start_position, should_auto_play, use_core_animation_renderer, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Lottie.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<Lottie>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.Lottie$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Lottie value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getLight_mode_content_url(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getLight_mode_content_url());
                }
                if (!Intrinsics.areEqual(value.getDark_mode_content_url(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getDark_mode_content_url());
                }
                if (value.getShould_loop()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(3, Boolean.valueOf(value.getShould_loop()));
                }
                if (!Float.valueOf(value.getAspect_ratio()).equals(Float.valueOf(0.0f))) {
                    size += ProtoAdapter.FLOAT.encodedSizeWithTag(4, Float.valueOf(value.getAspect_ratio()));
                }
                int iEncodedSizeWithTag = size + ProtoAdapter.FLOAT.encodedSizeWithTag(5, value.getStart_position());
                ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
                return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(6, value.getShould_auto_play()) + protoAdapter.encodedSizeWithTag(7, value.getUse_core_animation_renderer());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Lottie value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getLight_mode_content_url(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getLight_mode_content_url());
                }
                if (!Intrinsics.areEqual(value.getDark_mode_content_url(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getDark_mode_content_url());
                }
                if (value.getShould_loop()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getShould_loop()));
                }
                if (!Float.valueOf(value.getAspect_ratio()).equals(Float.valueOf(0.0f))) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 4, (int) Float.valueOf(value.getAspect_ratio()));
                }
                ProtoAdapter.FLOAT.encodeWithTag(writer, 5, (int) value.getStart_position());
                ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
                protoAdapter.encodeWithTag(writer, 6, (int) value.getShould_auto_play());
                protoAdapter.encodeWithTag(writer, 7, (int) value.getUse_core_animation_renderer());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Lottie value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
                protoAdapter.encodeWithTag(writer, 7, (int) value.getUse_core_animation_renderer());
                protoAdapter.encodeWithTag(writer, 6, (int) value.getShould_auto_play());
                ProtoAdapter<Float> protoAdapter2 = ProtoAdapter.FLOAT;
                protoAdapter2.encodeWithTag(writer, 5, (int) value.getStart_position());
                if (!Float.valueOf(value.getAspect_ratio()).equals(Float.valueOf(0.0f))) {
                    protoAdapter2.encodeWithTag(writer, 4, (int) Float.valueOf(value.getAspect_ratio()));
                }
                if (value.getShould_loop()) {
                    protoAdapter.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getShould_loop()));
                }
                if (!Intrinsics.areEqual(value.getDark_mode_content_url(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getDark_mode_content_url());
                }
                if (Intrinsics.areEqual(value.getLight_mode_content_url(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getLight_mode_content_url());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Lottie redact(Lottie value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return Lottie.copy$default(value, null, null, false, 0.0f, null, null, null, ByteString.EMPTY, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Lottie decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                Float fDecode = null;
                boolean zBooleanValue = false;
                float fFloatValue = 0.0f;
                Boolean boolDecode = null;
                Boolean boolDecode2 = null;
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 4:
                                fFloatValue = ProtoAdapter.FLOAT.decode(reader).floatValue();
                                break;
                            case 5:
                                fDecode = ProtoAdapter.FLOAT.decode(reader);
                                break;
                            case 6:
                                boolDecode = ProtoAdapter.BOOL.decode(reader);
                                break;
                            case 7:
                                boolDecode2 = ProtoAdapter.BOOL.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new Lottie(strDecode, strDecode2, zBooleanValue, fFloatValue, fDecode, boolDecode, boolDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
