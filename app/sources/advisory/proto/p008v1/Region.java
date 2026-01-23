package advisory.proto.p008v1;

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
import org.bouncycastle.i18n.ErrorBundle;
import yoda.service.dashboard.AssetClassRegion;
import yoda.service.dashboard.ClassificationDetails;

/* compiled from: Region.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"BC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0018\u001a\u00020\u0002H\u0017J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0096\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020 H\u0016JB\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\rR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006#"}, m3636d2 = {"Ladvisory/proto/v1/Region;", "Lcom/squareup/wire/Message;", "", "region", "Lyoda/service/dashboard/AssetClassRegion;", ErrorBundle.DETAIL_ENTRY, "Lyoda/service/dashboard/ClassificationDetails;", "categories", "", "Ladvisory/proto/v1/Category;", "link", "Ladvisory/proto/v1/LinkDetails;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lyoda/service/dashboard/AssetClassRegion;Lyoda/service/dashboard/ClassificationDetails;Ljava/util/List;Ladvisory/proto/v1/LinkDetails;Lokio/ByteString;)V", "getRegion", "()Lyoda/service/dashboard/AssetClassRegion;", "getDetails", "()Lyoda/service/dashboard/ClassificationDetails;", "getLink", "()Ladvisory/proto/v1/LinkDetails;", "getCategories", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes.dex */
public final class Region extends Message {

    @JvmField
    public static final ProtoAdapter<Region> ADAPTER;

    @WireField(adapter = "advisory.proto.v1.Category#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    private final List<Category> categories;

    @WireField(adapter = "yoda.service.dashboard.ClassificationDetails#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final ClassificationDetails details;

    @WireField(adapter = "advisory.proto.v1.LinkDetails#ADAPTER", schemaIndex = 3, tag = 4)
    private final LinkDetails link;

    @WireField(adapter = "yoda.service.dashboard.AssetClassRegion#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final AssetClassRegion region;

    public Region() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m4528newBuilder();
    }

    public final AssetClassRegion getRegion() {
        return this.region;
    }

    public /* synthetic */ Region(AssetClassRegion assetClassRegion, ClassificationDetails classificationDetails, List list, LinkDetails linkDetails, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? AssetClassRegion.ASSET_CLASS_REGION_UNSPECIFIED : assetClassRegion, (i & 2) != 0 ? null : classificationDetails, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? null : linkDetails, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    public final ClassificationDetails getDetails() {
        return this.details;
    }

    public final LinkDetails getLink() {
        return this.link;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Region(AssetClassRegion region, ClassificationDetails classificationDetails, List<Category> categories, LinkDetails linkDetails, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(region, "region");
        Intrinsics.checkNotNullParameter(categories, "categories");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.region = region;
        this.details = classificationDetails;
        this.link = linkDetails;
        this.categories = Internal.immutableCopyOf("categories", categories);
    }

    public final List<Category> getCategories() {
        return this.categories;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m4528newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Region)) {
            return false;
        }
        Region region = (Region) other;
        return Intrinsics.areEqual(unknownFields(), region.unknownFields()) && this.region == region.region && Intrinsics.areEqual(this.details, region.details) && Intrinsics.areEqual(this.categories, region.categories) && Intrinsics.areEqual(this.link, region.link);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.region.hashCode()) * 37;
        ClassificationDetails classificationDetails = this.details;
        int iHashCode2 = (((iHashCode + (classificationDetails != null ? classificationDetails.hashCode() : 0)) * 37) + this.categories.hashCode()) * 37;
        LinkDetails linkDetails = this.link;
        int iHashCode3 = iHashCode2 + (linkDetails != null ? linkDetails.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("region=" + this.region);
        ClassificationDetails classificationDetails = this.details;
        if (classificationDetails != null) {
            arrayList.add("details=" + classificationDetails);
        }
        if (!this.categories.isEmpty()) {
            arrayList.add("categories=" + this.categories);
        }
        LinkDetails linkDetails = this.link;
        if (linkDetails != null) {
            arrayList.add("link=" + linkDetails);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Region{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ Region copy$default(Region region, AssetClassRegion assetClassRegion, ClassificationDetails classificationDetails, List list, LinkDetails linkDetails, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            assetClassRegion = region.region;
        }
        if ((i & 2) != 0) {
            classificationDetails = region.details;
        }
        if ((i & 4) != 0) {
            list = region.categories;
        }
        if ((i & 8) != 0) {
            linkDetails = region.link;
        }
        if ((i & 16) != 0) {
            byteString = region.unknownFields();
        }
        ByteString byteString2 = byteString;
        List list2 = list;
        return region.copy(assetClassRegion, classificationDetails, list2, linkDetails, byteString2);
    }

    public final Region copy(AssetClassRegion region, ClassificationDetails details, List<Category> categories, LinkDetails link, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(region, "region");
        Intrinsics.checkNotNullParameter(categories, "categories");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new Region(region, details, categories, link, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Region.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<Region>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: advisory.proto.v1.Region$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Region value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getRegion() != AssetClassRegion.ASSET_CLASS_REGION_UNSPECIFIED) {
                    size += AssetClassRegion.ADAPTER.encodedSizeWithTag(1, value.getRegion());
                }
                if (value.getDetails() != null) {
                    size += ClassificationDetails.ADAPTER.encodedSizeWithTag(2, value.getDetails());
                }
                return size + Category.ADAPTER.asRepeated().encodedSizeWithTag(3, value.getCategories()) + LinkDetails.ADAPTER.encodedSizeWithTag(4, value.getLink());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Region value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getRegion() != AssetClassRegion.ASSET_CLASS_REGION_UNSPECIFIED) {
                    AssetClassRegion.ADAPTER.encodeWithTag(writer, 1, (int) value.getRegion());
                }
                if (value.getDetails() != null) {
                    ClassificationDetails.ADAPTER.encodeWithTag(writer, 2, (int) value.getDetails());
                }
                Category.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getCategories());
                LinkDetails.ADAPTER.encodeWithTag(writer, 4, (int) value.getLink());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Region value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                LinkDetails.ADAPTER.encodeWithTag(writer, 4, (int) value.getLink());
                Category.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getCategories());
                if (value.getDetails() != null) {
                    ClassificationDetails.ADAPTER.encodeWithTag(writer, 2, (int) value.getDetails());
                }
                if (value.getRegion() != AssetClassRegion.ASSET_CLASS_REGION_UNSPECIFIED) {
                    AssetClassRegion.ADAPTER.encodeWithTag(writer, 1, (int) value.getRegion());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Region decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                AssetClassRegion assetClassRegionDecode = AssetClassRegion.ASSET_CLASS_REGION_UNSPECIFIED;
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                ClassificationDetails classificationDetailsDecode = null;
                LinkDetails linkDetailsDecode = null;
                while (true) {
                    AssetClassRegion assetClassRegion = assetClassRegionDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new Region(assetClassRegion, classificationDetailsDecode, arrayList, linkDetailsDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            try {
                                assetClassRegionDecode = AssetClassRegion.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 2) {
                            classificationDetailsDecode = ClassificationDetails.ADAPTER.decode(reader);
                        } else if (iNextTag == 3) {
                            arrayList.add(Category.ADAPTER.decode(reader));
                        } else if (iNextTag == 4) {
                            linkDetailsDecode = LinkDetails.ADAPTER.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Region redact(Region value) {
                Intrinsics.checkNotNullParameter(value, "value");
                ClassificationDetails details = value.getDetails();
                ClassificationDetails classificationDetailsRedact = details != null ? ClassificationDetails.ADAPTER.redact(details) : null;
                List listM26823redactElements = Internal.m26823redactElements(value.getCategories(), Category.ADAPTER);
                LinkDetails link = value.getLink();
                return Region.copy$default(value, null, classificationDetailsRedact, listM26823redactElements, link != null ? LinkDetails.ADAPTER.redact(link) : null, ByteString.EMPTY, 1, null);
            }
        };
    }
}
