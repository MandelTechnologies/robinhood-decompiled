package advisory.proto.p008v1;

import com.robinhood.android.util.notification.RhGcmListenerService;
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
import yoda.service.dashboard.ClassificationDetails;
import yoda.service.dashboard.SubAssetClassCategory;

/* compiled from: Category.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"BC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0018\u001a\u00020\u0002H\u0017J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0096\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020 H\u0016JB\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\rR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006#"}, m3636d2 = {"Ladvisory/proto/v1/Category;", "Lcom/squareup/wire/Message;", "", RhGcmListenerService.EXTRA_CATEGORY, "Lyoda/service/dashboard/SubAssetClassCategory;", ErrorBundle.DETAIL_ENTRY, "Lyoda/service/dashboard/ClassificationDetails;", "assets", "", "Ladvisory/proto/v1/Asset;", "link", "Ladvisory/proto/v1/LinkDetails;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lyoda/service/dashboard/SubAssetClassCategory;Lyoda/service/dashboard/ClassificationDetails;Ljava/util/List;Ladvisory/proto/v1/LinkDetails;Lokio/ByteString;)V", "getCategory", "()Lyoda/service/dashboard/SubAssetClassCategory;", "getDetails", "()Lyoda/service/dashboard/ClassificationDetails;", "getLink", "()Ladvisory/proto/v1/LinkDetails;", "getAssets", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes.dex */
public final class Category extends Message {

    @JvmField
    public static final ProtoAdapter<Category> ADAPTER;

    @WireField(adapter = "advisory.proto.v1.Asset#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    private final List<Asset> assets;

    @WireField(adapter = "yoda.service.dashboard.SubAssetClassCategory#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final SubAssetClassCategory category;

    @WireField(adapter = "yoda.service.dashboard.ClassificationDetails#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final ClassificationDetails details;

    @WireField(adapter = "advisory.proto.v1.LinkDetails#ADAPTER", schemaIndex = 3, tag = 4)
    private final LinkDetails link;

    public Category() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m4408newBuilder();
    }

    public final SubAssetClassCategory getCategory() {
        return this.category;
    }

    public /* synthetic */ Category(SubAssetClassCategory subAssetClassCategory, ClassificationDetails classificationDetails, List list, LinkDetails linkDetails, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_UNSPECIFIED : subAssetClassCategory, (i & 2) != 0 ? null : classificationDetails, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? null : linkDetails, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    public final ClassificationDetails getDetails() {
        return this.details;
    }

    public final LinkDetails getLink() {
        return this.link;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Category(SubAssetClassCategory category, ClassificationDetails classificationDetails, List<Asset> assets, LinkDetails linkDetails, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(assets, "assets");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.category = category;
        this.details = classificationDetails;
        this.link = linkDetails;
        this.assets = Internal.immutableCopyOf("assets", assets);
    }

    public final List<Asset> getAssets() {
        return this.assets;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m4408newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Category)) {
            return false;
        }
        Category category = (Category) other;
        return Intrinsics.areEqual(unknownFields(), category.unknownFields()) && this.category == category.category && Intrinsics.areEqual(this.details, category.details) && Intrinsics.areEqual(this.assets, category.assets) && Intrinsics.areEqual(this.link, category.link);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.category.hashCode()) * 37;
        ClassificationDetails classificationDetails = this.details;
        int iHashCode2 = (((iHashCode + (classificationDetails != null ? classificationDetails.hashCode() : 0)) * 37) + this.assets.hashCode()) * 37;
        LinkDetails linkDetails = this.link;
        int iHashCode3 = iHashCode2 + (linkDetails != null ? linkDetails.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("category=" + this.category);
        ClassificationDetails classificationDetails = this.details;
        if (classificationDetails != null) {
            arrayList.add("details=" + classificationDetails);
        }
        if (!this.assets.isEmpty()) {
            arrayList.add("assets=" + this.assets);
        }
        LinkDetails linkDetails = this.link;
        if (linkDetails != null) {
            arrayList.add("link=" + linkDetails);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Category{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ Category copy$default(Category category, SubAssetClassCategory subAssetClassCategory, ClassificationDetails classificationDetails, List list, LinkDetails linkDetails, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            subAssetClassCategory = category.category;
        }
        if ((i & 2) != 0) {
            classificationDetails = category.details;
        }
        if ((i & 4) != 0) {
            list = category.assets;
        }
        if ((i & 8) != 0) {
            linkDetails = category.link;
        }
        if ((i & 16) != 0) {
            byteString = category.unknownFields();
        }
        ByteString byteString2 = byteString;
        List list2 = list;
        return category.copy(subAssetClassCategory, classificationDetails, list2, linkDetails, byteString2);
    }

    public final Category copy(SubAssetClassCategory category, ClassificationDetails details, List<Asset> assets, LinkDetails link, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(assets, "assets");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new Category(category, details, assets, link, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Category.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<Category>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: advisory.proto.v1.Category$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Category value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getCategory() != SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_UNSPECIFIED) {
                    size += SubAssetClassCategory.ADAPTER.encodedSizeWithTag(1, value.getCategory());
                }
                if (value.getDetails() != null) {
                    size += ClassificationDetails.ADAPTER.encodedSizeWithTag(2, value.getDetails());
                }
                return size + Asset.ADAPTER.asRepeated().encodedSizeWithTag(3, value.getAssets()) + LinkDetails.ADAPTER.encodedSizeWithTag(4, value.getLink());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Category value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getCategory() != SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_UNSPECIFIED) {
                    SubAssetClassCategory.ADAPTER.encodeWithTag(writer, 1, (int) value.getCategory());
                }
                if (value.getDetails() != null) {
                    ClassificationDetails.ADAPTER.encodeWithTag(writer, 2, (int) value.getDetails());
                }
                Asset.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getAssets());
                LinkDetails.ADAPTER.encodeWithTag(writer, 4, (int) value.getLink());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Category value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                LinkDetails.ADAPTER.encodeWithTag(writer, 4, (int) value.getLink());
                Asset.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getAssets());
                if (value.getDetails() != null) {
                    ClassificationDetails.ADAPTER.encodeWithTag(writer, 2, (int) value.getDetails());
                }
                if (value.getCategory() != SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_UNSPECIFIED) {
                    SubAssetClassCategory.ADAPTER.encodeWithTag(writer, 1, (int) value.getCategory());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Category decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                SubAssetClassCategory subAssetClassCategoryDecode = SubAssetClassCategory.SUB_ASSET_CLASS_CATEGORY_UNSPECIFIED;
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                ClassificationDetails classificationDetailsDecode = null;
                LinkDetails linkDetailsDecode = null;
                while (true) {
                    SubAssetClassCategory subAssetClassCategory = subAssetClassCategoryDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new Category(subAssetClassCategory, classificationDetailsDecode, arrayList, linkDetailsDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            try {
                                subAssetClassCategoryDecode = SubAssetClassCategory.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 2) {
                            classificationDetailsDecode = ClassificationDetails.ADAPTER.decode(reader);
                        } else if (iNextTag == 3) {
                            arrayList.add(Asset.ADAPTER.decode(reader));
                        } else if (iNextTag == 4) {
                            linkDetailsDecode = LinkDetails.ADAPTER.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Category redact(Category value) {
                Intrinsics.checkNotNullParameter(value, "value");
                ClassificationDetails details = value.getDetails();
                ClassificationDetails classificationDetailsRedact = details != null ? ClassificationDetails.ADAPTER.redact(details) : null;
                List listM26823redactElements = Internal.m26823redactElements(value.getAssets(), Asset.ADAPTER);
                LinkDetails link = value.getLink();
                return Category.copy$default(value, null, classificationDetailsRedact, listM26823redactElements, link != null ? LinkDetails.ADAPTER.redact(link) : null, ByteString.EMPTY, 1, null);
            }
        };
    }
}
