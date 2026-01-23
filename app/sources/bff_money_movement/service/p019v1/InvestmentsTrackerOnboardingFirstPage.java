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
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: InvestmentsTrackerOnboardingFirstPage.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B+\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0010\u001a\u00020\u0002H\u0017J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0007H\u0016J*\u0010\u0018\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerOnboardingFirstPage;", "Lcom/squareup/wire/Message;", "", "carousel_items", "", "Lbff_money_movement/service/v1/InvestmentsTrackerOnboardingCarouselItem;", "primary_button_text", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Ljava/lang/String;Lokio/ByteString;)V", "getPrimary_button_text", "()Ljava/lang/String;", "getCarousel_items", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class InvestmentsTrackerOnboardingFirstPage extends Message {

    @JvmField
    public static final ProtoAdapter<InvestmentsTrackerOnboardingFirstPage> ADAPTER;

    @WireField(adapter = "bff_money_movement.service.v1.InvestmentsTrackerOnboardingCarouselItem#ADAPTER", jsonName = "carouselItems", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    private final List<InvestmentsTrackerOnboardingCarouselItem> carousel_items;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "primaryButtonText", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String primary_button_text;

    public InvestmentsTrackerOnboardingFirstPage() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8483newBuilder();
    }

    public /* synthetic */ InvestmentsTrackerOnboardingFirstPage(List list, String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getPrimary_button_text() {
        return this.primary_button_text;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestmentsTrackerOnboardingFirstPage(List<InvestmentsTrackerOnboardingCarouselItem> carousel_items, String primary_button_text, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(carousel_items, "carousel_items");
        Intrinsics.checkNotNullParameter(primary_button_text, "primary_button_text");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.primary_button_text = primary_button_text;
        this.carousel_items = Internal.immutableCopyOf("carousel_items", carousel_items);
    }

    public final List<InvestmentsTrackerOnboardingCarouselItem> getCarousel_items() {
        return this.carousel_items;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8483newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof InvestmentsTrackerOnboardingFirstPage)) {
            return false;
        }
        InvestmentsTrackerOnboardingFirstPage investmentsTrackerOnboardingFirstPage = (InvestmentsTrackerOnboardingFirstPage) other;
        return Intrinsics.areEqual(unknownFields(), investmentsTrackerOnboardingFirstPage.unknownFields()) && Intrinsics.areEqual(this.carousel_items, investmentsTrackerOnboardingFirstPage.carousel_items) && Intrinsics.areEqual(this.primary_button_text, investmentsTrackerOnboardingFirstPage.primary_button_text);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.carousel_items.hashCode()) * 37) + this.primary_button_text.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.carousel_items.isEmpty()) {
            arrayList.add("carousel_items=" + this.carousel_items);
        }
        arrayList.add("primary_button_text=" + Internal.sanitize(this.primary_button_text));
        return CollectionsKt.joinToString$default(arrayList, ", ", "InvestmentsTrackerOnboardingFirstPage{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InvestmentsTrackerOnboardingFirstPage copy$default(InvestmentsTrackerOnboardingFirstPage investmentsTrackerOnboardingFirstPage, List list, String str, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            list = investmentsTrackerOnboardingFirstPage.carousel_items;
        }
        if ((i & 2) != 0) {
            str = investmentsTrackerOnboardingFirstPage.primary_button_text;
        }
        if ((i & 4) != 0) {
            byteString = investmentsTrackerOnboardingFirstPage.unknownFields();
        }
        return investmentsTrackerOnboardingFirstPage.copy(list, str, byteString);
    }

    public final InvestmentsTrackerOnboardingFirstPage copy(List<InvestmentsTrackerOnboardingCarouselItem> carousel_items, String primary_button_text, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(carousel_items, "carousel_items");
        Intrinsics.checkNotNullParameter(primary_button_text, "primary_button_text");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new InvestmentsTrackerOnboardingFirstPage(carousel_items, primary_button_text, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(InvestmentsTrackerOnboardingFirstPage.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<InvestmentsTrackerOnboardingFirstPage>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bff_money_movement.service.v1.InvestmentsTrackerOnboardingFirstPage$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(InvestmentsTrackerOnboardingFirstPage value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size() + InvestmentsTrackerOnboardingCarouselItem.ADAPTER.asRepeated().encodedSizeWithTag(1, value.getCarousel_items());
                return !Intrinsics.areEqual(value.getPrimary_button_text(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(2, value.getPrimary_button_text()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, InvestmentsTrackerOnboardingFirstPage value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                InvestmentsTrackerOnboardingCarouselItem.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getCarousel_items());
                if (!Intrinsics.areEqual(value.getPrimary_button_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getPrimary_button_text());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, InvestmentsTrackerOnboardingFirstPage value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getPrimary_button_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getPrimary_button_text());
                }
                InvestmentsTrackerOnboardingCarouselItem.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getCarousel_items());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public InvestmentsTrackerOnboardingFirstPage decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new InvestmentsTrackerOnboardingFirstPage(arrayList, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        arrayList.add(InvestmentsTrackerOnboardingCarouselItem.ADAPTER.decode(reader));
                    } else if (iNextTag == 2) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public InvestmentsTrackerOnboardingFirstPage redact(InvestmentsTrackerOnboardingFirstPage value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return InvestmentsTrackerOnboardingFirstPage.copy$default(value, Internal.m26823redactElements(value.getCarousel_items(), InvestmentsTrackerOnboardingCarouselItem.ADAPTER), null, ByteString.EMPTY, 2, null);
            }
        };
    }
}
