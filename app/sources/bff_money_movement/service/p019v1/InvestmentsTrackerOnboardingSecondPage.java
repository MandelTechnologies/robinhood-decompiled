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

/* compiled from: InvestmentsTrackerOnboardingSecondPage.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J.\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u0019"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerOnboardingSecondPage;", "Lcom/squareup/wire/Message;", "", "title", "", "disclosure_metadata", "primary_button_text", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getTitle", "()Ljava/lang/String;", "getDisclosure_metadata", "getPrimary_button_text", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class InvestmentsTrackerOnboardingSecondPage extends Message {

    @JvmField
    public static final ProtoAdapter<InvestmentsTrackerOnboardingSecondPage> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "disclosureMetadata", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String disclosure_metadata;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "primaryButtonText", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String primary_button_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String title;

    public InvestmentsTrackerOnboardingSecondPage() {
        this(null, null, null, null, 15, null);
    }

    public /* synthetic */ InvestmentsTrackerOnboardingSecondPage(String str, String str2, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8486newBuilder();
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getDisclosure_metadata() {
        return this.disclosure_metadata;
    }

    public final String getPrimary_button_text() {
        return this.primary_button_text;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestmentsTrackerOnboardingSecondPage(String title, String disclosure_metadata, String primary_button_text, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(disclosure_metadata, "disclosure_metadata");
        Intrinsics.checkNotNullParameter(primary_button_text, "primary_button_text");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.title = title;
        this.disclosure_metadata = disclosure_metadata;
        this.primary_button_text = primary_button_text;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8486newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof InvestmentsTrackerOnboardingSecondPage)) {
            return false;
        }
        InvestmentsTrackerOnboardingSecondPage investmentsTrackerOnboardingSecondPage = (InvestmentsTrackerOnboardingSecondPage) other;
        return Intrinsics.areEqual(unknownFields(), investmentsTrackerOnboardingSecondPage.unknownFields()) && Intrinsics.areEqual(this.title, investmentsTrackerOnboardingSecondPage.title) && Intrinsics.areEqual(this.disclosure_metadata, investmentsTrackerOnboardingSecondPage.disclosure_metadata) && Intrinsics.areEqual(this.primary_button_text, investmentsTrackerOnboardingSecondPage.primary_button_text);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.title.hashCode()) * 37) + this.disclosure_metadata.hashCode()) * 37) + this.primary_button_text.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("title=" + Internal.sanitize(this.title));
        arrayList.add("disclosure_metadata=" + Internal.sanitize(this.disclosure_metadata));
        arrayList.add("primary_button_text=" + Internal.sanitize(this.primary_button_text));
        return CollectionsKt.joinToString$default(arrayList, ", ", "InvestmentsTrackerOnboardingSecondPage{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ InvestmentsTrackerOnboardingSecondPage copy$default(InvestmentsTrackerOnboardingSecondPage investmentsTrackerOnboardingSecondPage, String str, String str2, String str3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = investmentsTrackerOnboardingSecondPage.title;
        }
        if ((i & 2) != 0) {
            str2 = investmentsTrackerOnboardingSecondPage.disclosure_metadata;
        }
        if ((i & 4) != 0) {
            str3 = investmentsTrackerOnboardingSecondPage.primary_button_text;
        }
        if ((i & 8) != 0) {
            byteString = investmentsTrackerOnboardingSecondPage.unknownFields();
        }
        return investmentsTrackerOnboardingSecondPage.copy(str, str2, str3, byteString);
    }

    public final InvestmentsTrackerOnboardingSecondPage copy(String title, String disclosure_metadata, String primary_button_text, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(disclosure_metadata, "disclosure_metadata");
        Intrinsics.checkNotNullParameter(primary_button_text, "primary_button_text");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new InvestmentsTrackerOnboardingSecondPage(title, disclosure_metadata, primary_button_text, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(InvestmentsTrackerOnboardingSecondPage.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<InvestmentsTrackerOnboardingSecondPage>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bff_money_movement.service.v1.InvestmentsTrackerOnboardingSecondPage$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(InvestmentsTrackerOnboardingSecondPage value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getDisclosure_metadata(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getDisclosure_metadata());
                }
                return !Intrinsics.areEqual(value.getPrimary_button_text(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getPrimary_button_text()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, InvestmentsTrackerOnboardingSecondPage value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getDisclosure_metadata(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getDisclosure_metadata());
                }
                if (!Intrinsics.areEqual(value.getPrimary_button_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getPrimary_button_text());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, InvestmentsTrackerOnboardingSecondPage value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getPrimary_button_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getPrimary_button_text());
                }
                if (!Intrinsics.areEqual(value.getDisclosure_metadata(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getDisclosure_metadata());
                }
                if (Intrinsics.areEqual(value.getTitle(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public InvestmentsTrackerOnboardingSecondPage redact(InvestmentsTrackerOnboardingSecondPage value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return InvestmentsTrackerOnboardingSecondPage.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public InvestmentsTrackerOnboardingSecondPage decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new InvestmentsTrackerOnboardingSecondPage(strDecode, strDecode2, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
