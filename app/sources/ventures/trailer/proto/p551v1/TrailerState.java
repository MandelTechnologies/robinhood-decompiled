package ventures.trailer.proto.p551v1;

import com.robinhood.android.car.result.CarResultComposable2;
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
import rh_server_driven_ui.p531v1.Icon;
import rh_server_driven_ui.p531v1.UIComponent;

/* compiled from: TrailerState.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB?\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0015\u001a\u00020\u0002H\u0017J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0006H\u0016J>\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011¨\u0006\u001f"}, m3636d2 = {"Lventures/trailer/proto/v1/TrailerState;", "Lcom/squareup/wire/Message;", "", CarResultComposable2.BODY, "Lrh_server_driven_ui/v1/UIComponent;", "primary_cta_text", "", "primary_cta_icon", "Lrh_server_driven_ui/v1/Icon;", "secondary_cta_text", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrh_server_driven_ui/v1/UIComponent;Ljava/lang/String;Lrh_server_driven_ui/v1/Icon;Ljava/lang/String;Lokio/ByteString;)V", "getBody", "()Lrh_server_driven_ui/v1/UIComponent;", "getPrimary_cta_text", "()Ljava/lang/String;", "getPrimary_cta_icon", "()Lrh_server_driven_ui/v1/Icon;", "getSecondary_cta_text", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "microgram.contracts.ventures.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes28.dex */
public final class TrailerState extends Message {

    @JvmField
    public static final ProtoAdapter<TrailerState> ADAPTER;

    @WireField(adapter = "rh_server_driven_ui.v1.UIComponent#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final UIComponent body;

    @WireField(adapter = "rh_server_driven_ui.v1.Icon#ADAPTER", jsonName = "primaryCtaIcon", schemaIndex = 2, tag = 3)
    private final Icon primary_cta_icon;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "primaryCtaText", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String primary_cta_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "secondaryCtaText", schemaIndex = 3, tag = 4)
    private final String secondary_cta_text;

    public TrailerState() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m30050newBuilder();
    }

    public final UIComponent getBody() {
        return this.body;
    }

    public final String getPrimary_cta_text() {
        return this.primary_cta_text;
    }

    public /* synthetic */ TrailerState(UIComponent uIComponent, String str, Icon icon, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uIComponent, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : icon, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Icon getPrimary_cta_icon() {
        return this.primary_cta_icon;
    }

    public final String getSecondary_cta_text() {
        return this.secondary_cta_text;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrailerState(UIComponent uIComponent, String primary_cta_text, Icon icon, String str, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(primary_cta_text, "primary_cta_text");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.body = uIComponent;
        this.primary_cta_text = primary_cta_text;
        this.primary_cta_icon = icon;
        this.secondary_cta_text = str;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m30050newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TrailerState)) {
            return false;
        }
        TrailerState trailerState = (TrailerState) other;
        return Intrinsics.areEqual(unknownFields(), trailerState.unknownFields()) && Intrinsics.areEqual(this.body, trailerState.body) && Intrinsics.areEqual(this.primary_cta_text, trailerState.primary_cta_text) && this.primary_cta_icon == trailerState.primary_cta_icon && Intrinsics.areEqual(this.secondary_cta_text, trailerState.secondary_cta_text);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        UIComponent uIComponent = this.body;
        int iHashCode2 = (((iHashCode + (uIComponent != null ? uIComponent.hashCode() : 0)) * 37) + this.primary_cta_text.hashCode()) * 37;
        Icon icon = this.primary_cta_icon;
        int iHashCode3 = (iHashCode2 + (icon != null ? icon.hashCode() : 0)) * 37;
        String str = this.secondary_cta_text;
        int iHashCode4 = iHashCode3 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        UIComponent uIComponent = this.body;
        if (uIComponent != null) {
            arrayList.add("body=" + uIComponent);
        }
        arrayList.add("primary_cta_text=" + Internal.sanitize(this.primary_cta_text));
        Icon icon = this.primary_cta_icon;
        if (icon != null) {
            arrayList.add("primary_cta_icon=" + icon);
        }
        String str = this.secondary_cta_text;
        if (str != null) {
            arrayList.add("secondary_cta_text=" + Internal.sanitize(str));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TrailerState{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ TrailerState copy$default(TrailerState trailerState, UIComponent uIComponent, String str, Icon icon, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            uIComponent = trailerState.body;
        }
        if ((i & 2) != 0) {
            str = trailerState.primary_cta_text;
        }
        if ((i & 4) != 0) {
            icon = trailerState.primary_cta_icon;
        }
        if ((i & 8) != 0) {
            str2 = trailerState.secondary_cta_text;
        }
        if ((i & 16) != 0) {
            byteString = trailerState.unknownFields();
        }
        ByteString byteString2 = byteString;
        Icon icon2 = icon;
        return trailerState.copy(uIComponent, str, icon2, str2, byteString2);
    }

    public final TrailerState copy(UIComponent body, String primary_cta_text, Icon primary_cta_icon, String secondary_cta_text, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(primary_cta_text, "primary_cta_text");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new TrailerState(body, primary_cta_text, primary_cta_icon, secondary_cta_text, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TrailerState.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<TrailerState>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: ventures.trailer.proto.v1.TrailerState$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TrailerState value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getBody() != null) {
                    size += UIComponent.ADAPTER.encodedSizeWithTag(1, value.getBody());
                }
                if (!Intrinsics.areEqual(value.getPrimary_cta_text(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getPrimary_cta_text());
                }
                return size + Icon.ADAPTER.encodedSizeWithTag(3, value.getPrimary_cta_icon()) + ProtoAdapter.STRING.encodedSizeWithTag(4, value.getSecondary_cta_text());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TrailerState value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getBody() != null) {
                    UIComponent.ADAPTER.encodeWithTag(writer, 1, (int) value.getBody());
                }
                if (!Intrinsics.areEqual(value.getPrimary_cta_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getPrimary_cta_text());
                }
                Icon.ADAPTER.encodeWithTag(writer, 3, (int) value.getPrimary_cta_icon());
                ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getSecondary_cta_text());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TrailerState value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 4, (int) value.getSecondary_cta_text());
                Icon.ADAPTER.encodeWithTag(writer, 3, (int) value.getPrimary_cta_icon());
                if (!Intrinsics.areEqual(value.getPrimary_cta_text(), "")) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getPrimary_cta_text());
                }
                if (value.getBody() != null) {
                    UIComponent.ADAPTER.encodeWithTag(writer, 1, (int) value.getBody());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TrailerState redact(TrailerState value) {
                Intrinsics.checkNotNullParameter(value, "value");
                UIComponent body = value.getBody();
                return TrailerState.copy$default(value, body != null ? UIComponent.ADAPTER.redact(body) : null, null, null, null, ByteString.EMPTY, 14, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TrailerState decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                Icon iconDecode = null;
                String strDecode = null;
                String strDecode2 = "";
                UIComponent uIComponentDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new TrailerState(uIComponentDecode, strDecode2, iconDecode, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        uIComponentDecode = UIComponent.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        try {
                            iconDecode = Icon.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
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
