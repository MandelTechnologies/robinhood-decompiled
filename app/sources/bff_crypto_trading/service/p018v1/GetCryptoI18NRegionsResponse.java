package bff_crypto_trading.service.p018v1;

import com.robinhood.rosetta.i18n.Locality;
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

/* compiled from: GetCryptoI18NRegionsResponse.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aBA\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0010\u001a\u00020\u0002H\u0017J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J@\u0010\u0019\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\tR\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001b"}, m3636d2 = {"Lbff_crypto_trading/service/v1/GetCryptoI18NRegionsResponse;", "Lcom/squareup/wire/Message;", "", "results", "", "Lcom/robinhood/rosetta/i18n/Locality;", "primary_regions", "secondary_regions", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Lokio/ByteString;)V", "getResults", "()Ljava/util/List;", "getPrimary_regions", "getSecondary_regions", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "bff_crypto_trading.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes.dex */
public final class GetCryptoI18NRegionsResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetCryptoI18NRegionsResponse> ADAPTER;

    @WireField(adapter = "com.robinhood.rosetta.i18n.Locality#ADAPTER", jsonName = "primaryRegions", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    private final List<Locality> primary_regions;

    @WireField(adapter = "com.robinhood.rosetta.i18n.Locality#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    private final List<Locality> results;

    @WireField(adapter = "com.robinhood.rosetta.i18n.Locality#ADAPTER", jsonName = "secondaryRegions", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    private final List<Locality> secondary_regions;

    public GetCryptoI18NRegionsResponse() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8380newBuilder();
    }

    public /* synthetic */ GetCryptoI18NRegionsResponse(List list, List list2, List list3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? CollectionsKt.emptyList() : list2, (i & 4) != 0 ? CollectionsKt.emptyList() : list3, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetCryptoI18NRegionsResponse(List<? extends Locality> results, List<? extends Locality> primary_regions, List<? extends Locality> secondary_regions, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(results, "results");
        Intrinsics.checkNotNullParameter(primary_regions, "primary_regions");
        Intrinsics.checkNotNullParameter(secondary_regions, "secondary_regions");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.results = Internal.immutableCopyOf("results", results);
        this.primary_regions = Internal.immutableCopyOf("primary_regions", primary_regions);
        this.secondary_regions = Internal.immutableCopyOf("secondary_regions", secondary_regions);
    }

    public final List<Locality> getResults() {
        return this.results;
    }

    public final List<Locality> getPrimary_regions() {
        return this.primary_regions;
    }

    public final List<Locality> getSecondary_regions() {
        return this.secondary_regions;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8380newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetCryptoI18NRegionsResponse)) {
            return false;
        }
        GetCryptoI18NRegionsResponse getCryptoI18NRegionsResponse = (GetCryptoI18NRegionsResponse) other;
        return Intrinsics.areEqual(unknownFields(), getCryptoI18NRegionsResponse.unknownFields()) && Intrinsics.areEqual(this.results, getCryptoI18NRegionsResponse.results) && Intrinsics.areEqual(this.primary_regions, getCryptoI18NRegionsResponse.primary_regions) && Intrinsics.areEqual(this.secondary_regions, getCryptoI18NRegionsResponse.secondary_regions);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.results.hashCode()) * 37) + this.primary_regions.hashCode()) * 37) + this.secondary_regions.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.results.isEmpty()) {
            arrayList.add("results=" + this.results);
        }
        if (!this.primary_regions.isEmpty()) {
            arrayList.add("primary_regions=" + this.primary_regions);
        }
        if (!this.secondary_regions.isEmpty()) {
            arrayList.add("secondary_regions=" + this.secondary_regions);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetCryptoI18NRegionsResponse{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetCryptoI18NRegionsResponse copy$default(GetCryptoI18NRegionsResponse getCryptoI18NRegionsResponse, List list, List list2, List list3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            list = getCryptoI18NRegionsResponse.results;
        }
        if ((i & 2) != 0) {
            list2 = getCryptoI18NRegionsResponse.primary_regions;
        }
        if ((i & 4) != 0) {
            list3 = getCryptoI18NRegionsResponse.secondary_regions;
        }
        if ((i & 8) != 0) {
            byteString = getCryptoI18NRegionsResponse.unknownFields();
        }
        return getCryptoI18NRegionsResponse.copy(list, list2, list3, byteString);
    }

    public final GetCryptoI18NRegionsResponse copy(List<? extends Locality> results, List<? extends Locality> primary_regions, List<? extends Locality> secondary_regions, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(results, "results");
        Intrinsics.checkNotNullParameter(primary_regions, "primary_regions");
        Intrinsics.checkNotNullParameter(secondary_regions, "secondary_regions");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetCryptoI18NRegionsResponse(results, primary_regions, secondary_regions, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetCryptoI18NRegionsResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetCryptoI18NRegionsResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bff_crypto_trading.service.v1.GetCryptoI18NRegionsResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetCryptoI18NRegionsResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                ProtoAdapter<Locality> protoAdapter = Locality.ADAPTER;
                return size + protoAdapter.asRepeated().encodedSizeWithTag(1, value.getResults()) + protoAdapter.asRepeated().encodedSizeWithTag(2, value.getPrimary_regions()) + protoAdapter.asRepeated().encodedSizeWithTag(3, value.getSecondary_regions());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetCryptoI18NRegionsResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ProtoAdapter<Locality> protoAdapter = Locality.ADAPTER;
                protoAdapter.asRepeated().encodeWithTag(writer, 1, (int) value.getResults());
                protoAdapter.asRepeated().encodeWithTag(writer, 2, (int) value.getPrimary_regions());
                protoAdapter.asRepeated().encodeWithTag(writer, 3, (int) value.getSecondary_regions());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetCryptoI18NRegionsResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<Locality> protoAdapter = Locality.ADAPTER;
                protoAdapter.asRepeated().encodeWithTag(writer, 3, (int) value.getSecondary_regions());
                protoAdapter.asRepeated().encodeWithTag(writer, 2, (int) value.getPrimary_regions());
                protoAdapter.asRepeated().encodeWithTag(writer, 1, (int) value.getResults());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetCryptoI18NRegionsResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetCryptoI18NRegionsResponse(arrayList, arrayList2, arrayList3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            Locality.ADAPTER.tryDecode(reader, arrayList);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 2) {
                        try {
                            Locality.ADAPTER.tryDecode(reader, arrayList2);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        }
                    } else if (iNextTag == 3) {
                        try {
                            Locality.ADAPTER.tryDecode(reader, arrayList3);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetCryptoI18NRegionsResponse redact(GetCryptoI18NRegionsResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GetCryptoI18NRegionsResponse.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
            }
        };
    }
}
