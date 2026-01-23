package ventures.trailer.proto.p551v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
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
import rh_server_driven_ui.p531v1.UIComponent;

/* compiled from: PostTrailerScreen.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J(\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m3636d2 = {"Lventures/trailer/proto/v1/PostTrailerScreen;", "Lcom/squareup/wire/Message;", "", "header", "Lrh_server_driven_ui/v1/UIComponent;", "card", "Lventures/trailer/proto/v1/Card;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrh_server_driven_ui/v1/UIComponent;Lventures/trailer/proto/v1/Card;Lokio/ByteString;)V", "getHeader", "()Lrh_server_driven_ui/v1/UIComponent;", "getCard", "()Lventures/trailer/proto/v1/Card;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "microgram.contracts.ventures.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes28.dex */
public final class PostTrailerScreen extends Message {

    @JvmField
    public static final ProtoAdapter<PostTrailerScreen> ADAPTER;

    @WireField(adapter = "ventures.trailer.proto.v1.Card#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Card card;

    @WireField(adapter = "rh_server_driven_ui.v1.UIComponent#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final UIComponent header;

    public PostTrailerScreen() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m30040newBuilder();
    }

    public final UIComponent getHeader() {
        return this.header;
    }

    public final Card getCard() {
        return this.card;
    }

    public /* synthetic */ PostTrailerScreen(UIComponent uIComponent, Card card, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uIComponent, (i & 2) != 0 ? null : card, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostTrailerScreen(UIComponent uIComponent, Card card, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.header = uIComponent;
        this.card = card;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m30040newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof PostTrailerScreen)) {
            return false;
        }
        PostTrailerScreen postTrailerScreen = (PostTrailerScreen) other;
        return Intrinsics.areEqual(unknownFields(), postTrailerScreen.unknownFields()) && Intrinsics.areEqual(this.header, postTrailerScreen.header) && Intrinsics.areEqual(this.card, postTrailerScreen.card);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        UIComponent uIComponent = this.header;
        int iHashCode2 = (iHashCode + (uIComponent != null ? uIComponent.hashCode() : 0)) * 37;
        Card card = this.card;
        int iHashCode3 = iHashCode2 + (card != null ? card.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        UIComponent uIComponent = this.header;
        if (uIComponent != null) {
            arrayList.add("header=" + uIComponent);
        }
        Card card = this.card;
        if (card != null) {
            arrayList.add("card=" + card);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PostTrailerScreen{", "}", 0, null, null, 56, null);
    }

    public final PostTrailerScreen copy(UIComponent header, Card card, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new PostTrailerScreen(header, card, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PostTrailerScreen.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<PostTrailerScreen>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: ventures.trailer.proto.v1.PostTrailerScreen$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PostTrailerScreen value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getHeader() != null) {
                    size += UIComponent.ADAPTER.encodedSizeWithTag(1, value.getHeader());
                }
                return value.getCard() != null ? size + Card.ADAPTER.encodedSizeWithTag(2, value.getCard()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PostTrailerScreen value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getHeader() != null) {
                    UIComponent.ADAPTER.encodeWithTag(writer, 1, (int) value.getHeader());
                }
                if (value.getCard() != null) {
                    Card.ADAPTER.encodeWithTag(writer, 2, (int) value.getCard());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PostTrailerScreen value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getCard() != null) {
                    Card.ADAPTER.encodeWithTag(writer, 2, (int) value.getCard());
                }
                if (value.getHeader() != null) {
                    UIComponent.ADAPTER.encodeWithTag(writer, 1, (int) value.getHeader());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PostTrailerScreen redact(PostTrailerScreen value) {
                Intrinsics.checkNotNullParameter(value, "value");
                UIComponent header = value.getHeader();
                UIComponent uIComponentRedact = header != null ? UIComponent.ADAPTER.redact(header) : null;
                Card card = value.getCard();
                return value.copy(uIComponentRedact, card != null ? Card.ADAPTER.redact(card) : null, ByteString.EMPTY);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PostTrailerScreen decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                UIComponent uIComponentDecode = null;
                Card cardDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new PostTrailerScreen(uIComponentDecode, cardDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        uIComponentDecode = UIComponent.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        cardDecode = Card.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
