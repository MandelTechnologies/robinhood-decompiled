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

/* compiled from: GetNonOriginatedTransferInfoResponse.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB9\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0012\u001a\u00020\u0002H\u0017J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J8\u0010\u001b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, m3636d2 = {"Lbff_money_movement/service/v1/GetNonOriginatedTransferInfoResponse;", "Lcom/squareup/wire/Message;", "", "sections", "", "Lbff_money_movement/service/v1/GetNonOriginatedTransferInfoSection;", "screen_data", "Lbff_money_movement/service/v1/StandardScreenData;", "confirmation_screen_data", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Lbff_money_movement/service/v1/StandardScreenData;Lbff_money_movement/service/v1/StandardScreenData;Lokio/ByteString;)V", "getScreen_data", "()Lbff_money_movement/service/v1/StandardScreenData;", "getConfirmation_screen_data", "getSections", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes.dex */
public final class GetNonOriginatedTransferInfoResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetNonOriginatedTransferInfoResponse> ADAPTER;

    @WireField(adapter = "bff_money_movement.service.v1.StandardScreenData#ADAPTER", jsonName = "confirmationScreenData", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final StandardScreenData confirmation_screen_data;

    @WireField(adapter = "bff_money_movement.service.v1.StandardScreenData#ADAPTER", jsonName = "screenData", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final StandardScreenData screen_data;

    @WireField(adapter = "bff_money_movement.service.v1.GetNonOriginatedTransferInfoSection#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    private final List<GetNonOriginatedTransferInfoSection> sections;

    public GetNonOriginatedTransferInfoResponse() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8423newBuilder();
    }

    public /* synthetic */ GetNonOriginatedTransferInfoResponse(List list, StandardScreenData standardScreenData, StandardScreenData standardScreenData2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? null : standardScreenData, (i & 4) != 0 ? null : standardScreenData2, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final StandardScreenData getScreen_data() {
        return this.screen_data;
    }

    public final StandardScreenData getConfirmation_screen_data() {
        return this.confirmation_screen_data;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetNonOriginatedTransferInfoResponse(List<GetNonOriginatedTransferInfoSection> sections, StandardScreenData standardScreenData, StandardScreenData standardScreenData2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(sections, "sections");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.screen_data = standardScreenData;
        this.confirmation_screen_data = standardScreenData2;
        this.sections = Internal.immutableCopyOf("sections", sections);
    }

    public final List<GetNonOriginatedTransferInfoSection> getSections() {
        return this.sections;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8423newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetNonOriginatedTransferInfoResponse)) {
            return false;
        }
        GetNonOriginatedTransferInfoResponse getNonOriginatedTransferInfoResponse = (GetNonOriginatedTransferInfoResponse) other;
        return Intrinsics.areEqual(unknownFields(), getNonOriginatedTransferInfoResponse.unknownFields()) && Intrinsics.areEqual(this.sections, getNonOriginatedTransferInfoResponse.sections) && Intrinsics.areEqual(this.screen_data, getNonOriginatedTransferInfoResponse.screen_data) && Intrinsics.areEqual(this.confirmation_screen_data, getNonOriginatedTransferInfoResponse.confirmation_screen_data);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.sections.hashCode()) * 37;
        StandardScreenData standardScreenData = this.screen_data;
        int iHashCode2 = (iHashCode + (standardScreenData != null ? standardScreenData.hashCode() : 0)) * 37;
        StandardScreenData standardScreenData2 = this.confirmation_screen_data;
        int iHashCode3 = iHashCode2 + (standardScreenData2 != null ? standardScreenData2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.sections.isEmpty()) {
            arrayList.add("sections=" + this.sections);
        }
        StandardScreenData standardScreenData = this.screen_data;
        if (standardScreenData != null) {
            arrayList.add("screen_data=" + standardScreenData);
        }
        StandardScreenData standardScreenData2 = this.confirmation_screen_data;
        if (standardScreenData2 != null) {
            arrayList.add("confirmation_screen_data=" + standardScreenData2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetNonOriginatedTransferInfoResponse{", "}", 0, null, null, 56, null);
    }

    public final GetNonOriginatedTransferInfoResponse copy(List<GetNonOriginatedTransferInfoSection> sections, StandardScreenData screen_data, StandardScreenData confirmation_screen_data, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetNonOriginatedTransferInfoResponse(sections, screen_data, confirmation_screen_data, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetNonOriginatedTransferInfoResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetNonOriginatedTransferInfoResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bff_money_movement.service.v1.GetNonOriginatedTransferInfoResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetNonOriginatedTransferInfoResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size() + GetNonOriginatedTransferInfoSection.ADAPTER.asRepeated().encodedSizeWithTag(1, value.getSections());
                if (value.getScreen_data() != null) {
                    size += StandardScreenData.ADAPTER.encodedSizeWithTag(2, value.getScreen_data());
                }
                return value.getConfirmation_screen_data() != null ? size + StandardScreenData.ADAPTER.encodedSizeWithTag(3, value.getConfirmation_screen_data()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetNonOriginatedTransferInfoResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                GetNonOriginatedTransferInfoSection.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getSections());
                if (value.getScreen_data() != null) {
                    StandardScreenData.ADAPTER.encodeWithTag(writer, 2, (int) value.getScreen_data());
                }
                if (value.getConfirmation_screen_data() != null) {
                    StandardScreenData.ADAPTER.encodeWithTag(writer, 3, (int) value.getConfirmation_screen_data());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetNonOriginatedTransferInfoResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getConfirmation_screen_data() != null) {
                    StandardScreenData.ADAPTER.encodeWithTag(writer, 3, (int) value.getConfirmation_screen_data());
                }
                if (value.getScreen_data() != null) {
                    StandardScreenData.ADAPTER.encodeWithTag(writer, 2, (int) value.getScreen_data());
                }
                GetNonOriginatedTransferInfoSection.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getSections());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetNonOriginatedTransferInfoResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                StandardScreenData standardScreenDataDecode = null;
                StandardScreenData standardScreenDataDecode2 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetNonOriginatedTransferInfoResponse(arrayList, standardScreenDataDecode, standardScreenDataDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        arrayList.add(GetNonOriginatedTransferInfoSection.ADAPTER.decode(reader));
                    } else if (iNextTag == 2) {
                        standardScreenDataDecode = StandardScreenData.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        standardScreenDataDecode2 = StandardScreenData.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetNonOriginatedTransferInfoResponse redact(GetNonOriginatedTransferInfoResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                List<GetNonOriginatedTransferInfoSection> listM26823redactElements = Internal.m26823redactElements(value.getSections(), GetNonOriginatedTransferInfoSection.ADAPTER);
                StandardScreenData screen_data = value.getScreen_data();
                StandardScreenData standardScreenDataRedact = screen_data != null ? StandardScreenData.ADAPTER.redact(screen_data) : null;
                StandardScreenData confirmation_screen_data = value.getConfirmation_screen_data();
                return value.copy(listM26823redactElements, standardScreenDataRedact, confirmation_screen_data != null ? StandardScreenData.ADAPTER.redact(confirmation_screen_data) : null, ByteString.EMPTY);
            }
        };
    }
}
