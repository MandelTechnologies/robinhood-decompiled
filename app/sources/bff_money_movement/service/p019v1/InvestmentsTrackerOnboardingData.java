package bff_money_movement.service.p019v1;

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

/* compiled from: InvestmentsTrackerOnboardingData.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J(\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerOnboardingData;", "Lcom/squareup/wire/Message;", "", "first_page", "Lbff_money_movement/service/v1/InvestmentsTrackerOnboardingFirstPage;", "second_page", "Lbff_money_movement/service/v1/InvestmentsTrackerOnboardingSecondPage;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lbff_money_movement/service/v1/InvestmentsTrackerOnboardingFirstPage;Lbff_money_movement/service/v1/InvestmentsTrackerOnboardingSecondPage;Lokio/ByteString;)V", "getFirst_page", "()Lbff_money_movement/service/v1/InvestmentsTrackerOnboardingFirstPage;", "getSecond_page", "()Lbff_money_movement/service/v1/InvestmentsTrackerOnboardingSecondPage;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class InvestmentsTrackerOnboardingData extends Message {

    @JvmField
    public static final ProtoAdapter<InvestmentsTrackerOnboardingData> ADAPTER;

    @WireField(adapter = "bff_money_movement.service.v1.InvestmentsTrackerOnboardingFirstPage#ADAPTER", jsonName = "firstPage", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final InvestmentsTrackerOnboardingFirstPage first_page;

    @WireField(adapter = "bff_money_movement.service.v1.InvestmentsTrackerOnboardingSecondPage#ADAPTER", jsonName = "secondPage", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final InvestmentsTrackerOnboardingSecondPage second_page;

    public InvestmentsTrackerOnboardingData() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8481newBuilder();
    }

    public final InvestmentsTrackerOnboardingFirstPage getFirst_page() {
        return this.first_page;
    }

    public final InvestmentsTrackerOnboardingSecondPage getSecond_page() {
        return this.second_page;
    }

    public /* synthetic */ InvestmentsTrackerOnboardingData(InvestmentsTrackerOnboardingFirstPage investmentsTrackerOnboardingFirstPage, InvestmentsTrackerOnboardingSecondPage investmentsTrackerOnboardingSecondPage, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : investmentsTrackerOnboardingFirstPage, (i & 2) != 0 ? null : investmentsTrackerOnboardingSecondPage, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestmentsTrackerOnboardingData(InvestmentsTrackerOnboardingFirstPage investmentsTrackerOnboardingFirstPage, InvestmentsTrackerOnboardingSecondPage investmentsTrackerOnboardingSecondPage, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.first_page = investmentsTrackerOnboardingFirstPage;
        this.second_page = investmentsTrackerOnboardingSecondPage;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8481newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof InvestmentsTrackerOnboardingData)) {
            return false;
        }
        InvestmentsTrackerOnboardingData investmentsTrackerOnboardingData = (InvestmentsTrackerOnboardingData) other;
        return Intrinsics.areEqual(unknownFields(), investmentsTrackerOnboardingData.unknownFields()) && Intrinsics.areEqual(this.first_page, investmentsTrackerOnboardingData.first_page) && Intrinsics.areEqual(this.second_page, investmentsTrackerOnboardingData.second_page);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        InvestmentsTrackerOnboardingFirstPage investmentsTrackerOnboardingFirstPage = this.first_page;
        int iHashCode2 = (iHashCode + (investmentsTrackerOnboardingFirstPage != null ? investmentsTrackerOnboardingFirstPage.hashCode() : 0)) * 37;
        InvestmentsTrackerOnboardingSecondPage investmentsTrackerOnboardingSecondPage = this.second_page;
        int iHashCode3 = iHashCode2 + (investmentsTrackerOnboardingSecondPage != null ? investmentsTrackerOnboardingSecondPage.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        InvestmentsTrackerOnboardingFirstPage investmentsTrackerOnboardingFirstPage = this.first_page;
        if (investmentsTrackerOnboardingFirstPage != null) {
            arrayList.add("first_page=" + investmentsTrackerOnboardingFirstPage);
        }
        InvestmentsTrackerOnboardingSecondPage investmentsTrackerOnboardingSecondPage = this.second_page;
        if (investmentsTrackerOnboardingSecondPage != null) {
            arrayList.add("second_page=" + investmentsTrackerOnboardingSecondPage);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InvestmentsTrackerOnboardingData{", "}", 0, null, null, 56, null);
    }

    public final InvestmentsTrackerOnboardingData copy(InvestmentsTrackerOnboardingFirstPage first_page, InvestmentsTrackerOnboardingSecondPage second_page, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new InvestmentsTrackerOnboardingData(first_page, second_page, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(InvestmentsTrackerOnboardingData.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<InvestmentsTrackerOnboardingData>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bff_money_movement.service.v1.InvestmentsTrackerOnboardingData$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(InvestmentsTrackerOnboardingData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getFirst_page() != null) {
                    size += InvestmentsTrackerOnboardingFirstPage.ADAPTER.encodedSizeWithTag(1, value.getFirst_page());
                }
                return value.getSecond_page() != null ? size + InvestmentsTrackerOnboardingSecondPage.ADAPTER.encodedSizeWithTag(2, value.getSecond_page()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, InvestmentsTrackerOnboardingData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getFirst_page() != null) {
                    InvestmentsTrackerOnboardingFirstPage.ADAPTER.encodeWithTag(writer, 1, (int) value.getFirst_page());
                }
                if (value.getSecond_page() != null) {
                    InvestmentsTrackerOnboardingSecondPage.ADAPTER.encodeWithTag(writer, 2, (int) value.getSecond_page());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, InvestmentsTrackerOnboardingData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getSecond_page() != null) {
                    InvestmentsTrackerOnboardingSecondPage.ADAPTER.encodeWithTag(writer, 2, (int) value.getSecond_page());
                }
                if (value.getFirst_page() != null) {
                    InvestmentsTrackerOnboardingFirstPage.ADAPTER.encodeWithTag(writer, 1, (int) value.getFirst_page());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public InvestmentsTrackerOnboardingData redact(InvestmentsTrackerOnboardingData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                InvestmentsTrackerOnboardingFirstPage first_page = value.getFirst_page();
                InvestmentsTrackerOnboardingFirstPage investmentsTrackerOnboardingFirstPageRedact = first_page != null ? InvestmentsTrackerOnboardingFirstPage.ADAPTER.redact(first_page) : null;
                InvestmentsTrackerOnboardingSecondPage second_page = value.getSecond_page();
                return value.copy(investmentsTrackerOnboardingFirstPageRedact, second_page != null ? InvestmentsTrackerOnboardingSecondPage.ADAPTER.redact(second_page) : null, ByteString.EMPTY);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public InvestmentsTrackerOnboardingData decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                InvestmentsTrackerOnboardingFirstPage investmentsTrackerOnboardingFirstPageDecode = null;
                InvestmentsTrackerOnboardingSecondPage investmentsTrackerOnboardingSecondPageDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new InvestmentsTrackerOnboardingData(investmentsTrackerOnboardingFirstPageDecode, investmentsTrackerOnboardingSecondPageDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        investmentsTrackerOnboardingFirstPageDecode = InvestmentsTrackerOnboardingFirstPage.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        investmentsTrackerOnboardingSecondPageDecode = InvestmentsTrackerOnboardingSecondPage.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
