package bff_money_movement.service.p019v1;

import com.robinhood.android.markdown.compose.MarkdownText4;
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

/* compiled from: InvestmentsTrackerComponentUpsellCard.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cBA\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0004H\u0016J@\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\t\u001a\u00020\nR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u001d"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerComponentUpsellCard;", "Lcom/squareup/wire/Message;", "", "description", "", "link_text", "action", "Lbff_money_movement/service/v1/InvestmentsTrackerAction;", "image_url", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lbff_money_movement/service/v1/InvestmentsTrackerAction;Ljava/lang/String;Lokio/ByteString;)V", "getDescription", "()Ljava/lang/String;", "getLink_text", "getAction", "()Lbff_money_movement/service/v1/InvestmentsTrackerAction;", "getImage_url", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class InvestmentsTrackerComponentUpsellCard extends Message {

    @JvmField
    public static final ProtoAdapter<InvestmentsTrackerComponentUpsellCard> ADAPTER;

    @WireField(adapter = "bff_money_movement.service.v1.InvestmentsTrackerAction#ADAPTER", schemaIndex = 2, tag = 3)
    private final InvestmentsTrackerAction action;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    private final String description;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = MarkdownText4.TagImageUrl, schemaIndex = 3, tag = 4)
    private final String image_url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "linkText", schemaIndex = 1, tag = 2)
    private final String link_text;

    public InvestmentsTrackerComponentUpsellCard() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8466newBuilder();
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getLink_text() {
        return this.link_text;
    }

    public final InvestmentsTrackerAction getAction() {
        return this.action;
    }

    public final String getImage_url() {
        return this.image_url;
    }

    public /* synthetic */ InvestmentsTrackerComponentUpsellCard(String str, String str2, InvestmentsTrackerAction investmentsTrackerAction, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : investmentsTrackerAction, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestmentsTrackerComponentUpsellCard(String str, String str2, InvestmentsTrackerAction investmentsTrackerAction, String str3, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.description = str;
        this.link_text = str2;
        this.action = investmentsTrackerAction;
        this.image_url = str3;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8466newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof InvestmentsTrackerComponentUpsellCard)) {
            return false;
        }
        InvestmentsTrackerComponentUpsellCard investmentsTrackerComponentUpsellCard = (InvestmentsTrackerComponentUpsellCard) other;
        return Intrinsics.areEqual(unknownFields(), investmentsTrackerComponentUpsellCard.unknownFields()) && Intrinsics.areEqual(this.description, investmentsTrackerComponentUpsellCard.description) && Intrinsics.areEqual(this.link_text, investmentsTrackerComponentUpsellCard.link_text) && this.action == investmentsTrackerComponentUpsellCard.action && Intrinsics.areEqual(this.image_url, investmentsTrackerComponentUpsellCard.image_url);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.description;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.link_text;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        InvestmentsTrackerAction investmentsTrackerAction = this.action;
        int iHashCode4 = (iHashCode3 + (investmentsTrackerAction != null ? investmentsTrackerAction.hashCode() : 0)) * 37;
        String str3 = this.image_url;
        int iHashCode5 = iHashCode4 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.description;
        if (str != null) {
            arrayList.add("description=" + Internal.sanitize(str));
        }
        String str2 = this.link_text;
        if (str2 != null) {
            arrayList.add("link_text=" + Internal.sanitize(str2));
        }
        InvestmentsTrackerAction investmentsTrackerAction = this.action;
        if (investmentsTrackerAction != null) {
            arrayList.add("action=" + investmentsTrackerAction);
        }
        String str3 = this.image_url;
        if (str3 != null) {
            arrayList.add("image_url=" + Internal.sanitize(str3));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InvestmentsTrackerComponentUpsellCard{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ InvestmentsTrackerComponentUpsellCard copy$default(InvestmentsTrackerComponentUpsellCard investmentsTrackerComponentUpsellCard, String str, String str2, InvestmentsTrackerAction investmentsTrackerAction, String str3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = investmentsTrackerComponentUpsellCard.description;
        }
        if ((i & 2) != 0) {
            str2 = investmentsTrackerComponentUpsellCard.link_text;
        }
        if ((i & 4) != 0) {
            investmentsTrackerAction = investmentsTrackerComponentUpsellCard.action;
        }
        if ((i & 8) != 0) {
            str3 = investmentsTrackerComponentUpsellCard.image_url;
        }
        if ((i & 16) != 0) {
            byteString = investmentsTrackerComponentUpsellCard.unknownFields();
        }
        ByteString byteString2 = byteString;
        InvestmentsTrackerAction investmentsTrackerAction2 = investmentsTrackerAction;
        return investmentsTrackerComponentUpsellCard.copy(str, str2, investmentsTrackerAction2, str3, byteString2);
    }

    public final InvestmentsTrackerComponentUpsellCard copy(String description, String link_text, InvestmentsTrackerAction action, String image_url, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new InvestmentsTrackerComponentUpsellCard(description, link_text, action, image_url, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(InvestmentsTrackerComponentUpsellCard.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<InvestmentsTrackerComponentUpsellCard>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bff_money_movement.service.v1.InvestmentsTrackerComponentUpsellCard$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(InvestmentsTrackerComponentUpsellCard value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                return size + protoAdapter.encodedSizeWithTag(1, value.getDescription()) + protoAdapter.encodedSizeWithTag(2, value.getLink_text()) + InvestmentsTrackerAction.ADAPTER.encodedSizeWithTag(3, value.getAction()) + protoAdapter.encodedSizeWithTag(4, value.getImage_url());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, InvestmentsTrackerComponentUpsellCard value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 1, (int) value.getDescription());
                protoAdapter.encodeWithTag(writer, 2, (int) value.getLink_text());
                InvestmentsTrackerAction.ADAPTER.encodeWithTag(writer, 3, (int) value.getAction());
                protoAdapter.encodeWithTag(writer, 4, (int) value.getImage_url());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, InvestmentsTrackerComponentUpsellCard value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 4, (int) value.getImage_url());
                InvestmentsTrackerAction.ADAPTER.encodeWithTag(writer, 3, (int) value.getAction());
                protoAdapter.encodeWithTag(writer, 2, (int) value.getLink_text());
                protoAdapter.encodeWithTag(writer, 1, (int) value.getDescription());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public InvestmentsTrackerComponentUpsellCard redact(InvestmentsTrackerComponentUpsellCard value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return InvestmentsTrackerComponentUpsellCard.copy$default(value, null, null, null, null, ByteString.EMPTY, 15, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public InvestmentsTrackerComponentUpsellCard decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = null;
                String strDecode2 = null;
                InvestmentsTrackerAction investmentsTrackerActionDecode = null;
                String strDecode3 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new InvestmentsTrackerComponentUpsellCard(strDecode, strDecode2, investmentsTrackerActionDecode, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        try {
                            investmentsTrackerActionDecode = InvestmentsTrackerAction.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 4) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
