package advisory.proto.p008v1;

import com.robinhood.android.account.p060ui.AccountOverviewOptionsSettingCard4;
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

/* compiled from: DashboardCard.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 $2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$BK\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u001b\u001a\u00020\u0002H\u0017J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0096\u0002J\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020\u0006H\u0016JJ\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000eR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006%"}, m3636d2 = {"Ladvisory/proto/v1/DashboardCard;", "Lcom/squareup/wire/Message;", "", "image", "Ladvisory/proto/v1/DashboardCardImage;", "text_markdown", "", AccountOverviewOptionsSettingCard4.CTA, "Ladvisory/proto/v1/DashboardCardCta;", "dismiss_settings", "Ladvisory/proto/v1/DashboardCardDismissSettings;", "alignment", "Ladvisory/proto/v1/DashboardCardAlignment;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ladvisory/proto/v1/DashboardCardImage;Ljava/lang/String;Ladvisory/proto/v1/DashboardCardCta;Ladvisory/proto/v1/DashboardCardDismissSettings;Ladvisory/proto/v1/DashboardCardAlignment;Lokio/ByteString;)V", "getImage", "()Ladvisory/proto/v1/DashboardCardImage;", "getText_markdown", "()Ljava/lang/String;", "getCta", "()Ladvisory/proto/v1/DashboardCardCta;", "getDismiss_settings", "()Ladvisory/proto/v1/DashboardCardDismissSettings;", "getAlignment", "()Ladvisory/proto/v1/DashboardCardAlignment;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class DashboardCard extends Message {

    @JvmField
    public static final ProtoAdapter<DashboardCard> ADAPTER;

    @WireField(adapter = "advisory.proto.v1.DashboardCardAlignment#ADAPTER", schemaIndex = 4, tag = 5)
    private final DashboardCardAlignment alignment;

    @WireField(adapter = "advisory.proto.v1.DashboardCardCta#ADAPTER", schemaIndex = 2, tag = 3)
    private final DashboardCardCta cta;

    @WireField(adapter = "advisory.proto.v1.DashboardCardDismissSettings#ADAPTER", jsonName = "dismissSettings", schemaIndex = 3, tag = 4)
    private final DashboardCardDismissSettings dismiss_settings;

    @WireField(adapter = "advisory.proto.v1.DashboardCardImage#ADAPTER", schemaIndex = 0, tag = 1)
    private final DashboardCardImage image;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "textMarkdown", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String text_markdown;

    public DashboardCard() {
        this(null, null, null, null, null, null, 63, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m4410newBuilder();
    }

    public final DashboardCardImage getImage() {
        return this.image;
    }

    public final String getText_markdown() {
        return this.text_markdown;
    }

    public /* synthetic */ DashboardCard(DashboardCardImage dashboardCardImage, String str, DashboardCardCta dashboardCardCta, DashboardCardDismissSettings dashboardCardDismissSettings, DashboardCardAlignment dashboardCardAlignment, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : dashboardCardImage, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : dashboardCardCta, (i & 8) != 0 ? null : dashboardCardDismissSettings, (i & 16) != 0 ? null : dashboardCardAlignment, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    public final DashboardCardCta getCta() {
        return this.cta;
    }

    public final DashboardCardDismissSettings getDismiss_settings() {
        return this.dismiss_settings;
    }

    public final DashboardCardAlignment getAlignment() {
        return this.alignment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DashboardCard(DashboardCardImage dashboardCardImage, String text_markdown, DashboardCardCta dashboardCardCta, DashboardCardDismissSettings dashboardCardDismissSettings, DashboardCardAlignment dashboardCardAlignment, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(text_markdown, "text_markdown");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.image = dashboardCardImage;
        this.text_markdown = text_markdown;
        this.cta = dashboardCardCta;
        this.dismiss_settings = dashboardCardDismissSettings;
        this.alignment = dashboardCardAlignment;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m4410newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof DashboardCard)) {
            return false;
        }
        DashboardCard dashboardCard = (DashboardCard) other;
        return Intrinsics.areEqual(unknownFields(), dashboardCard.unknownFields()) && Intrinsics.areEqual(this.image, dashboardCard.image) && Intrinsics.areEqual(this.text_markdown, dashboardCard.text_markdown) && Intrinsics.areEqual(this.cta, dashboardCard.cta) && Intrinsics.areEqual(this.dismiss_settings, dashboardCard.dismiss_settings) && this.alignment == dashboardCard.alignment;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        DashboardCardImage dashboardCardImage = this.image;
        int iHashCode2 = (((iHashCode + (dashboardCardImage != null ? dashboardCardImage.hashCode() : 0)) * 37) + this.text_markdown.hashCode()) * 37;
        DashboardCardCta dashboardCardCta = this.cta;
        int iHashCode3 = (iHashCode2 + (dashboardCardCta != null ? dashboardCardCta.hashCode() : 0)) * 37;
        DashboardCardDismissSettings dashboardCardDismissSettings = this.dismiss_settings;
        int iHashCode4 = (iHashCode3 + (dashboardCardDismissSettings != null ? dashboardCardDismissSettings.hashCode() : 0)) * 37;
        DashboardCardAlignment dashboardCardAlignment = this.alignment;
        int iHashCode5 = iHashCode4 + (dashboardCardAlignment != null ? dashboardCardAlignment.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        DashboardCardImage dashboardCardImage = this.image;
        if (dashboardCardImage != null) {
            arrayList.add("image=" + dashboardCardImage);
        }
        arrayList.add("text_markdown=" + Internal.sanitize(this.text_markdown));
        DashboardCardCta dashboardCardCta = this.cta;
        if (dashboardCardCta != null) {
            arrayList.add("cta=" + dashboardCardCta);
        }
        DashboardCardDismissSettings dashboardCardDismissSettings = this.dismiss_settings;
        if (dashboardCardDismissSettings != null) {
            arrayList.add("dismiss_settings=" + dashboardCardDismissSettings);
        }
        DashboardCardAlignment dashboardCardAlignment = this.alignment;
        if (dashboardCardAlignment != null) {
            arrayList.add("alignment=" + dashboardCardAlignment);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "DashboardCard{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ DashboardCard copy$default(DashboardCard dashboardCard, DashboardCardImage dashboardCardImage, String str, DashboardCardCta dashboardCardCta, DashboardCardDismissSettings dashboardCardDismissSettings, DashboardCardAlignment dashboardCardAlignment, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            dashboardCardImage = dashboardCard.image;
        }
        if ((i & 2) != 0) {
            str = dashboardCard.text_markdown;
        }
        if ((i & 4) != 0) {
            dashboardCardCta = dashboardCard.cta;
        }
        if ((i & 8) != 0) {
            dashboardCardDismissSettings = dashboardCard.dismiss_settings;
        }
        if ((i & 16) != 0) {
            dashboardCardAlignment = dashboardCard.alignment;
        }
        if ((i & 32) != 0) {
            byteString = dashboardCard.unknownFields();
        }
        DashboardCardAlignment dashboardCardAlignment2 = dashboardCardAlignment;
        ByteString byteString2 = byteString;
        return dashboardCard.copy(dashboardCardImage, str, dashboardCardCta, dashboardCardDismissSettings, dashboardCardAlignment2, byteString2);
    }

    public final DashboardCard copy(DashboardCardImage image, String text_markdown, DashboardCardCta cta, DashboardCardDismissSettings dismiss_settings, DashboardCardAlignment alignment, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(text_markdown, "text_markdown");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new DashboardCard(image, text_markdown, cta, dismiss_settings, alignment, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(DashboardCard.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<DashboardCard>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: advisory.proto.v1.DashboardCard$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(DashboardCard value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size() + DashboardCardImage.ADAPTER.encodedSizeWithTag(1, value.getImage());
                if (!Intrinsics.areEqual(value.getText_markdown(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getText_markdown());
                }
                return size + DashboardCardCta.ADAPTER.encodedSizeWithTag(3, value.getCta()) + DashboardCardDismissSettings.ADAPTER.encodedSizeWithTag(4, value.getDismiss_settings()) + DashboardCardAlignment.ADAPTER.encodedSizeWithTag(5, value.getAlignment());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, DashboardCard value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                DashboardCardImage.ADAPTER.encodeWithTag(writer, 1, (int) value.getImage());
                if (!Intrinsics.areEqual(value.getText_markdown(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getText_markdown());
                }
                DashboardCardCta.ADAPTER.encodeWithTag(writer, 3, (int) value.getCta());
                DashboardCardDismissSettings.ADAPTER.encodeWithTag(writer, 4, (int) value.getDismiss_settings());
                DashboardCardAlignment.ADAPTER.encodeWithTag(writer, 5, (int) value.getAlignment());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, DashboardCard value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                DashboardCardAlignment.ADAPTER.encodeWithTag(writer, 5, (int) value.getAlignment());
                DashboardCardDismissSettings.ADAPTER.encodeWithTag(writer, 4, (int) value.getDismiss_settings());
                DashboardCardCta.ADAPTER.encodeWithTag(writer, 3, (int) value.getCta());
                if (!Intrinsics.areEqual(value.getText_markdown(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getText_markdown());
                }
                DashboardCardImage.ADAPTER.encodeWithTag(writer, 1, (int) value.getImage());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public DashboardCard redact(DashboardCard value) {
                Intrinsics.checkNotNullParameter(value, "value");
                DashboardCardImage image = value.getImage();
                DashboardCardImage dashboardCardImageRedact = image != null ? DashboardCardImage.ADAPTER.redact(image) : null;
                DashboardCardCta cta = value.getCta();
                DashboardCardCta dashboardCardCtaRedact = cta != null ? DashboardCardCta.ADAPTER.redact(cta) : null;
                DashboardCardDismissSettings dismiss_settings = value.getDismiss_settings();
                return DashboardCard.copy$default(value, dashboardCardImageRedact, null, dashboardCardCtaRedact, dismiss_settings != null ? DashboardCardDismissSettings.ADAPTER.redact(dismiss_settings) : null, null, ByteString.EMPTY, 18, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public DashboardCard decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                DashboardCardCta dashboardCardCtaDecode = null;
                DashboardCardDismissSettings dashboardCardDismissSettingsDecode = null;
                DashboardCardAlignment dashboardCardAlignmentDecode = null;
                String strDecode = "";
                DashboardCardImage dashboardCardImageDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new DashboardCard(dashboardCardImageDecode, strDecode, dashboardCardCtaDecode, dashboardCardDismissSettingsDecode, dashboardCardAlignmentDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        dashboardCardImageDecode = DashboardCardImage.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        dashboardCardCtaDecode = DashboardCardCta.ADAPTER.decode(reader);
                    } else if (iNextTag == 4) {
                        dashboardCardDismissSettingsDecode = DashboardCardDismissSettings.ADAPTER.decode(reader);
                    } else if (iNextTag == 5) {
                        try {
                            dashboardCardAlignmentDecode = DashboardCardAlignment.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
