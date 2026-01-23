package com.robinhood.copilot.proto.p286v1;

import com.plaid.internal.EnumC7081g;
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
import p479j$.time.Instant;

/* compiled from: GetInsightsRequest.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\u0018\u0000 ,2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001,Bc\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0010\b\u0002\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJi\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0010\b\u0002\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t2\u0010\b\u0002\u0010\u000b\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\u001dR\"\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b#\u0010$R\"\u0010\u000b\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b%\u0010$R\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010&\u001a\u0004\b'\u0010\u001bR\u001a\u0010\u000e\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010&\u001a\u0004\b(\u0010\u001bR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010+¨\u0006-"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/GetInsightsRequest;", "Lcom/squareup/wire/Message;", "", "", "instrument_id", "", "Lcom/robinhood/copilot/proto/v1/InsightCategory;", "categories", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "start_date", "end_date", "", "page_offset", "page_size", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Ljava/util/List;Lj$/time/Instant;Lj$/time/Instant;IILokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Ljava/util/List;Lj$/time/Instant;Lj$/time/Instant;IILokio/ByteString;)Lcom/robinhood/copilot/proto/v1/GetInsightsRequest;", "Ljava/lang/String;", "getInstrument_id", "Lj$/time/Instant;", "getStart_date", "()Lj$/time/Instant;", "getEnd_date", "I", "getPage_offset", "getPage_size", "Ljava/util/List;", "getCategories", "()Ljava/util/List;", "Companion", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class GetInsightsRequest extends Message {

    @JvmField
    public static final ProtoAdapter<GetInsightsRequest> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.copilot.proto.v1.InsightCategory#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    private final List<InsightCategory> categories;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "endDate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final Instant end_date;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "instrumentId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String instrument_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "pageOffset", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final int page_offset;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "pageSize", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final int page_size;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "startDate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Instant start_date;

    public GetInsightsRequest() {
        this(null, null, null, null, 0, 0, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m22112newBuilder();
    }

    public final String getInstrument_id() {
        return this.instrument_id;
    }

    public /* synthetic */ GetInsightsRequest(String str, List list, Instant instant, Instant instant2, int i, int i2, ByteString byteString, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? CollectionsKt.emptyList() : list, (i3 & 4) != 0 ? null : instant, (i3 & 8) != 0 ? null : instant2, (i3 & 16) != 0 ? 0 : i, (i3 & 32) != 0 ? 0 : i2, (i3 & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Instant getStart_date() {
        return this.start_date;
    }

    public final Instant getEnd_date() {
        return this.end_date;
    }

    public final int getPage_offset() {
        return this.page_offset;
    }

    public final int getPage_size() {
        return this.page_size;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetInsightsRequest(String instrument_id, List<? extends InsightCategory> categories, Instant instant, Instant instant2, int i, int i2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(categories, "categories");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.instrument_id = instrument_id;
        this.start_date = instant;
        this.end_date = instant2;
        this.page_offset = i;
        this.page_size = i2;
        this.categories = Internal.immutableCopyOf("categories", categories);
    }

    public final List<InsightCategory> getCategories() {
        return this.categories;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m22112newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetInsightsRequest)) {
            return false;
        }
        GetInsightsRequest getInsightsRequest = (GetInsightsRequest) other;
        return Intrinsics.areEqual(unknownFields(), getInsightsRequest.unknownFields()) && Intrinsics.areEqual(this.instrument_id, getInsightsRequest.instrument_id) && Intrinsics.areEqual(this.categories, getInsightsRequest.categories) && Intrinsics.areEqual(this.start_date, getInsightsRequest.start_date) && Intrinsics.areEqual(this.end_date, getInsightsRequest.end_date) && this.page_offset == getInsightsRequest.page_offset && this.page_size == getInsightsRequest.page_size;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.instrument_id.hashCode()) * 37) + this.categories.hashCode()) * 37;
        Instant instant = this.start_date;
        int iHashCode2 = (iHashCode + (instant != null ? instant.hashCode() : 0)) * 37;
        Instant instant2 = this.end_date;
        int iHashCode3 = ((((iHashCode2 + (instant2 != null ? instant2.hashCode() : 0)) * 37) + Integer.hashCode(this.page_offset)) * 37) + Integer.hashCode(this.page_size);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("instrument_id=" + Internal.sanitize(this.instrument_id));
        if (!this.categories.isEmpty()) {
            arrayList.add("categories=" + this.categories);
        }
        Instant instant = this.start_date;
        if (instant != null) {
            arrayList.add("start_date=" + instant);
        }
        Instant instant2 = this.end_date;
        if (instant2 != null) {
            arrayList.add("end_date=" + instant2);
        }
        arrayList.add("page_offset=" + this.page_offset);
        arrayList.add("page_size=" + this.page_size);
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetInsightsRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetInsightsRequest copy$default(GetInsightsRequest getInsightsRequest, String str, List list, Instant instant, Instant instant2, int i, int i2, ByteString byteString, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = getInsightsRequest.instrument_id;
        }
        if ((i3 & 2) != 0) {
            list = getInsightsRequest.categories;
        }
        if ((i3 & 4) != 0) {
            instant = getInsightsRequest.start_date;
        }
        if ((i3 & 8) != 0) {
            instant2 = getInsightsRequest.end_date;
        }
        if ((i3 & 16) != 0) {
            i = getInsightsRequest.page_offset;
        }
        if ((i3 & 32) != 0) {
            i2 = getInsightsRequest.page_size;
        }
        if ((i3 & 64) != 0) {
            byteString = getInsightsRequest.unknownFields();
        }
        int i4 = i2;
        ByteString byteString2 = byteString;
        int i5 = i;
        Instant instant3 = instant;
        return getInsightsRequest.copy(str, list, instant3, instant2, i5, i4, byteString2);
    }

    public final GetInsightsRequest copy(String instrument_id, List<? extends InsightCategory> categories, Instant start_date, Instant end_date, int page_offset, int page_size, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(categories, "categories");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetInsightsRequest(instrument_id, categories, start_date, end_date, page_offset, page_size, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetInsightsRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetInsightsRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.copilot.proto.v1.GetInsightsRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetInsightsRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getInstrument_id());
                }
                int iEncodedSizeWithTag = size + InsightCategory.ADAPTER.asRepeated().encodedSizeWithTag(2, value.getCategories());
                if (value.getStart_date() != null) {
                    iEncodedSizeWithTag += ProtoAdapter.INSTANT.encodedSizeWithTag(3, value.getStart_date());
                }
                if (value.getEnd_date() != null) {
                    iEncodedSizeWithTag += ProtoAdapter.INSTANT.encodedSizeWithTag(4, value.getEnd_date());
                }
                if (value.getPage_offset() != 0) {
                    iEncodedSizeWithTag += ProtoAdapter.INT32.encodedSizeWithTag(5, Integer.valueOf(value.getPage_offset()));
                }
                return value.getPage_size() != 0 ? iEncodedSizeWithTag + ProtoAdapter.INT32.encodedSizeWithTag(6, Integer.valueOf(value.getPage_size())) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetInsightsRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getInstrument_id());
                }
                InsightCategory.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getCategories());
                if (value.getStart_date() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 3, (int) value.getStart_date());
                }
                if (value.getEnd_date() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 4, (int) value.getEnd_date());
                }
                if (value.getPage_offset() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 5, (int) Integer.valueOf(value.getPage_offset()));
                }
                if (value.getPage_size() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 6, (int) Integer.valueOf(value.getPage_size()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetInsightsRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getPage_size() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 6, (int) Integer.valueOf(value.getPage_size()));
                }
                if (value.getPage_offset() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 5, (int) Integer.valueOf(value.getPage_offset()));
                }
                if (value.getEnd_date() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 4, (int) value.getEnd_date());
                }
                if (value.getStart_date() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 3, (int) value.getStart_date());
                }
                InsightCategory.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getCategories());
                if (Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getInstrument_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetInsightsRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                Instant instantDecode = null;
                int iIntValue = 0;
                int iIntValue2 = 0;
                String strDecode = "";
                Instant instantDecode2 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                try {
                                    InsightCategory.ADAPTER.tryDecode(reader, arrayList);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 3:
                                instantDecode2 = ProtoAdapter.INSTANT.decode(reader);
                                break;
                            case 4:
                                instantDecode = ProtoAdapter.INSTANT.decode(reader);
                                break;
                            case 5:
                                iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                                break;
                            case 6:
                                iIntValue2 = ProtoAdapter.INT32.decode(reader).intValue();
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new GetInsightsRequest(strDecode, arrayList, instantDecode2, instantDecode, iIntValue, iIntValue2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetInsightsRequest redact(GetInsightsRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Instant start_date = value.getStart_date();
                Instant instantRedact = start_date != null ? ProtoAdapter.INSTANT.redact(start_date) : null;
                Instant end_date = value.getEnd_date();
                return GetInsightsRequest.copy$default(value, null, null, instantRedact, end_date != null ? ProtoAdapter.INSTANT.redact(end_date) : null, 0, 0, ByteString.EMPTY, 51, null);
            }
        };
    }
}
