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

/* compiled from: InvestmentsTrackerComponentUpsellDetails.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0004H\u0016J8\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerComponentUpsellDetails;", "Lcom/squareup/wire/Message;", "", "header_text", "", "subtitle", "icon_svg_url", "action", "Lbff_money_movement/service/v1/InvestmentsTrackerAction;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbff_money_movement/service/v1/InvestmentsTrackerAction;Lokio/ByteString;)V", "getHeader_text", "()Ljava/lang/String;", "getSubtitle", "getIcon_svg_url", "getAction", "()Lbff_money_movement/service/v1/InvestmentsTrackerAction;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class InvestmentsTrackerComponentUpsellDetails extends Message {

    @JvmField
    public static final ProtoAdapter<InvestmentsTrackerComponentUpsellDetails> ADAPTER;

    @WireField(adapter = "bff_money_movement.service.v1.InvestmentsTrackerAction#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final InvestmentsTrackerAction action;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "headerText", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String header_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "iconSvgUrl", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String icon_svg_url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String subtitle;

    public InvestmentsTrackerComponentUpsellDetails() {
        this(null, null, null, null, null, 31, null);
    }

    public /* synthetic */ InvestmentsTrackerComponentUpsellDetails(String str, String str2, String str3, InvestmentsTrackerAction investmentsTrackerAction, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? InvestmentsTrackerAction.ACTION_UNSPECIFIED : investmentsTrackerAction, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8467newBuilder();
    }

    public final String getHeader_text() {
        return this.header_text;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getIcon_svg_url() {
        return this.icon_svg_url;
    }

    public final InvestmentsTrackerAction getAction() {
        return this.action;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestmentsTrackerComponentUpsellDetails(String header_text, String subtitle, String icon_svg_url, InvestmentsTrackerAction action, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(header_text, "header_text");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(icon_svg_url, "icon_svg_url");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.header_text = header_text;
        this.subtitle = subtitle;
        this.icon_svg_url = icon_svg_url;
        this.action = action;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8467newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof InvestmentsTrackerComponentUpsellDetails)) {
            return false;
        }
        InvestmentsTrackerComponentUpsellDetails investmentsTrackerComponentUpsellDetails = (InvestmentsTrackerComponentUpsellDetails) other;
        return Intrinsics.areEqual(unknownFields(), investmentsTrackerComponentUpsellDetails.unknownFields()) && Intrinsics.areEqual(this.header_text, investmentsTrackerComponentUpsellDetails.header_text) && Intrinsics.areEqual(this.subtitle, investmentsTrackerComponentUpsellDetails.subtitle) && Intrinsics.areEqual(this.icon_svg_url, investmentsTrackerComponentUpsellDetails.icon_svg_url) && this.action == investmentsTrackerComponentUpsellDetails.action;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.header_text.hashCode()) * 37) + this.subtitle.hashCode()) * 37) + this.icon_svg_url.hashCode()) * 37) + this.action.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("header_text=" + Internal.sanitize(this.header_text));
        arrayList.add("subtitle=" + Internal.sanitize(this.subtitle));
        arrayList.add("icon_svg_url=" + Internal.sanitize(this.icon_svg_url));
        arrayList.add("action=" + this.action);
        return CollectionsKt.joinToString$default(arrayList, ", ", "InvestmentsTrackerComponentUpsellDetails{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ InvestmentsTrackerComponentUpsellDetails copy$default(InvestmentsTrackerComponentUpsellDetails investmentsTrackerComponentUpsellDetails, String str, String str2, String str3, InvestmentsTrackerAction investmentsTrackerAction, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = investmentsTrackerComponentUpsellDetails.header_text;
        }
        if ((i & 2) != 0) {
            str2 = investmentsTrackerComponentUpsellDetails.subtitle;
        }
        if ((i & 4) != 0) {
            str3 = investmentsTrackerComponentUpsellDetails.icon_svg_url;
        }
        if ((i & 8) != 0) {
            investmentsTrackerAction = investmentsTrackerComponentUpsellDetails.action;
        }
        if ((i & 16) != 0) {
            byteString = investmentsTrackerComponentUpsellDetails.unknownFields();
        }
        ByteString byteString2 = byteString;
        String str4 = str3;
        return investmentsTrackerComponentUpsellDetails.copy(str, str2, str4, investmentsTrackerAction, byteString2);
    }

    public final InvestmentsTrackerComponentUpsellDetails copy(String header_text, String subtitle, String icon_svg_url, InvestmentsTrackerAction action, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(header_text, "header_text");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(icon_svg_url, "icon_svg_url");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new InvestmentsTrackerComponentUpsellDetails(header_text, subtitle, icon_svg_url, action, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(InvestmentsTrackerComponentUpsellDetails.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<InvestmentsTrackerComponentUpsellDetails>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bff_money_movement.service.v1.InvestmentsTrackerComponentUpsellDetails$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(InvestmentsTrackerComponentUpsellDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getHeader_text(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getHeader_text());
                }
                if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getSubtitle());
                }
                if (!Intrinsics.areEqual(value.getIcon_svg_url(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getIcon_svg_url());
                }
                return value.getAction() != InvestmentsTrackerAction.ACTION_UNSPECIFIED ? size + InvestmentsTrackerAction.ADAPTER.encodedSizeWithTag(4, value.getAction()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, InvestmentsTrackerComponentUpsellDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getHeader_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getHeader_text());
                }
                if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSubtitle());
                }
                if (!Intrinsics.areEqual(value.getIcon_svg_url(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getIcon_svg_url());
                }
                if (value.getAction() != InvestmentsTrackerAction.ACTION_UNSPECIFIED) {
                    InvestmentsTrackerAction.ADAPTER.encodeWithTag(writer, 4, (int) value.getAction());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, InvestmentsTrackerComponentUpsellDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getAction() != InvestmentsTrackerAction.ACTION_UNSPECIFIED) {
                    InvestmentsTrackerAction.ADAPTER.encodeWithTag(writer, 4, (int) value.getAction());
                }
                if (!Intrinsics.areEqual(value.getIcon_svg_url(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getIcon_svg_url());
                }
                if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSubtitle());
                }
                if (Intrinsics.areEqual(value.getHeader_text(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getHeader_text());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public InvestmentsTrackerComponentUpsellDetails decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                InvestmentsTrackerAction investmentsTrackerActionDecode = InvestmentsTrackerAction.ACTION_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                while (true) {
                    InvestmentsTrackerAction investmentsTrackerAction = investmentsTrackerActionDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new InvestmentsTrackerComponentUpsellDetails(strDecode, strDecode2, strDecode3, investmentsTrackerAction, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 2) {
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 3) {
                            strDecode3 = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 4) {
                            try {
                                investmentsTrackerActionDecode = InvestmentsTrackerAction.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public InvestmentsTrackerComponentUpsellDetails redact(InvestmentsTrackerComponentUpsellDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return InvestmentsTrackerComponentUpsellDetails.copy$default(value, null, null, null, null, ByteString.EMPTY, 15, null);
            }
        };
    }
}
