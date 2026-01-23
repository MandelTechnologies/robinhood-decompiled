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

/* compiled from: InvestmentsTrackerOnboardingCarouselItem.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0002H\u0017J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0004H\u0016J8\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001b"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerOnboardingCarouselItem;", "Lcom/squareup/wire/Message;", "", "image_url", "", "dark_mode_image_url", "title", "description", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getImage_url", "()Ljava/lang/String;", "getDark_mode_image_url", "getTitle", "getDescription", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class InvestmentsTrackerOnboardingCarouselItem extends Message {

    @JvmField
    public static final ProtoAdapter<InvestmentsTrackerOnboardingCarouselItem> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "darkModeImageUrl", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 4)
    private final String dark_mode_image_url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 3)
    private final String description;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = MarkdownText4.TagImageUrl, label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String image_url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 2)
    private final String title;

    public InvestmentsTrackerOnboardingCarouselItem() {
        this(null, null, null, null, null, 31, null);
    }

    public /* synthetic */ InvestmentsTrackerOnboardingCarouselItem(String str, String str2, String str3, String str4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8479newBuilder();
    }

    public final String getImage_url() {
        return this.image_url;
    }

    public final String getDark_mode_image_url() {
        return this.dark_mode_image_url;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getDescription() {
        return this.description;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestmentsTrackerOnboardingCarouselItem(String image_url, String dark_mode_image_url, String title, String description, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(image_url, "image_url");
        Intrinsics.checkNotNullParameter(dark_mode_image_url, "dark_mode_image_url");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.image_url = image_url;
        this.dark_mode_image_url = dark_mode_image_url;
        this.title = title;
        this.description = description;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8479newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof InvestmentsTrackerOnboardingCarouselItem)) {
            return false;
        }
        InvestmentsTrackerOnboardingCarouselItem investmentsTrackerOnboardingCarouselItem = (InvestmentsTrackerOnboardingCarouselItem) other;
        return Intrinsics.areEqual(unknownFields(), investmentsTrackerOnboardingCarouselItem.unknownFields()) && Intrinsics.areEqual(this.image_url, investmentsTrackerOnboardingCarouselItem.image_url) && Intrinsics.areEqual(this.dark_mode_image_url, investmentsTrackerOnboardingCarouselItem.dark_mode_image_url) && Intrinsics.areEqual(this.title, investmentsTrackerOnboardingCarouselItem.title) && Intrinsics.areEqual(this.description, investmentsTrackerOnboardingCarouselItem.description);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.image_url.hashCode()) * 37) + this.dark_mode_image_url.hashCode()) * 37) + this.title.hashCode()) * 37) + this.description.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("image_url=" + Internal.sanitize(this.image_url));
        arrayList.add("dark_mode_image_url=" + Internal.sanitize(this.dark_mode_image_url));
        arrayList.add("title=" + Internal.sanitize(this.title));
        arrayList.add("description=" + Internal.sanitize(this.description));
        return CollectionsKt.joinToString$default(arrayList, ", ", "InvestmentsTrackerOnboardingCarouselItem{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ InvestmentsTrackerOnboardingCarouselItem copy$default(InvestmentsTrackerOnboardingCarouselItem investmentsTrackerOnboardingCarouselItem, String str, String str2, String str3, String str4, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = investmentsTrackerOnboardingCarouselItem.image_url;
        }
        if ((i & 2) != 0) {
            str2 = investmentsTrackerOnboardingCarouselItem.dark_mode_image_url;
        }
        if ((i & 4) != 0) {
            str3 = investmentsTrackerOnboardingCarouselItem.title;
        }
        if ((i & 8) != 0) {
            str4 = investmentsTrackerOnboardingCarouselItem.description;
        }
        if ((i & 16) != 0) {
            byteString = investmentsTrackerOnboardingCarouselItem.unknownFields();
        }
        ByteString byteString2 = byteString;
        String str5 = str3;
        return investmentsTrackerOnboardingCarouselItem.copy(str, str2, str5, str4, byteString2);
    }

    public final InvestmentsTrackerOnboardingCarouselItem copy(String image_url, String dark_mode_image_url, String title, String description, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(image_url, "image_url");
        Intrinsics.checkNotNullParameter(dark_mode_image_url, "dark_mode_image_url");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new InvestmentsTrackerOnboardingCarouselItem(image_url, dark_mode_image_url, title, description, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(InvestmentsTrackerOnboardingCarouselItem.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<InvestmentsTrackerOnboardingCarouselItem>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bff_money_movement.service.v1.InvestmentsTrackerOnboardingCarouselItem$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(InvestmentsTrackerOnboardingCarouselItem value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getImage_url(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getImage_url());
                }
                if (!Intrinsics.areEqual(value.getDark_mode_image_url(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getDark_mode_image_url());
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getTitle());
                }
                return !Intrinsics.areEqual(value.getDescription(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getDescription()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, InvestmentsTrackerOnboardingCarouselItem value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getImage_url(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getImage_url());
                }
                if (!Intrinsics.areEqual(value.getDark_mode_image_url(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getDark_mode_image_url());
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getDescription());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, InvestmentsTrackerOnboardingCarouselItem value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getDescription());
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getDark_mode_image_url(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getDark_mode_image_url());
                }
                if (Intrinsics.areEqual(value.getImage_url(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getImage_url());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public InvestmentsTrackerOnboardingCarouselItem redact(InvestmentsTrackerOnboardingCarouselItem value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return InvestmentsTrackerOnboardingCarouselItem.copy$default(value, null, null, null, null, ByteString.EMPTY, 15, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public InvestmentsTrackerOnboardingCarouselItem decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new InvestmentsTrackerOnboardingCarouselItem(strDecode, strDecode2, strDecode3, strDecode4, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode4 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 4) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
