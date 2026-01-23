package com.robinhood.prediction_markets.proto.p361v1.idl;

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

/* compiled from: NavigationNode.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 +2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001+Bk\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010#\u001a\u00020\u0002H\u0017J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'H\u0096\u0002J\b\u0010(\u001a\u00020\bH\u0016J\b\u0010)\u001a\u00020\u0004H\u0016Jj\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0016\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u0006,"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/NavigationNode;", "Lcom/squareup/wire/Message;", "", "id", "", "parent_id", "default_child_node", "rank", "", "display_tab_text", "display_header_text", "display_layout_type", "Lcom/robinhood/prediction_markets/proto/v1/idl/DisplayLayoutType;", "sub_category_selection_mode", "Lcom/robinhood/prediction_markets/proto/v1/idl/SubCategorySelectionMode;", "image_style", "Lcom/robinhood/prediction_markets/proto/v1/idl/ImageStyle;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lcom/robinhood/prediction_markets/proto/v1/idl/DisplayLayoutType;Lcom/robinhood/prediction_markets/proto/v1/idl/SubCategorySelectionMode;Lcom/robinhood/prediction_markets/proto/v1/idl/ImageStyle;Lokio/ByteString;)V", "getId", "()Ljava/lang/String;", "getParent_id", "getDefault_child_node", "getRank", "()I", "getDisplay_tab_text", "getDisplay_header_text", "getDisplay_layout_type", "()Lcom/robinhood/prediction_markets/proto/v1/idl/DisplayLayoutType;", "getSub_category_selection_mode", "()Lcom/robinhood/prediction_markets/proto/v1/idl/SubCategorySelectionMode;", "getImage_style", "()Lcom/robinhood/prediction_markets/proto/v1/idl/ImageStyle;", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "copy", "Companion", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class NavigationNode extends Message {

    @JvmField
    public static final ProtoAdapter<NavigationNode> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "defaultChildNode", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String default_child_node;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "displayHeaderText", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String display_header_text;

    @WireField(adapter = "com.robinhood.prediction_markets.proto.v1.idl.DisplayLayoutType#ADAPTER", jsonName = "displayLayoutType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final DisplayLayoutType display_layout_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "displayTabText", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String display_tab_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String id;

    @WireField(adapter = "com.robinhood.prediction_markets.proto.v1.idl.ImageStyle#ADAPTER", jsonName = "imageStyle", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final ImageStyle image_style;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "parentId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String parent_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final int rank;

    @WireField(adapter = "com.robinhood.prediction_markets.proto.v1.idl.SubCategorySelectionMode#ADAPTER", jsonName = "subCategorySelectionMode", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final SubCategorySelectionMode sub_category_selection_mode;

    public NavigationNode() {
        this(null, null, null, 0, null, null, null, null, null, null, 1023, null);
    }

    public /* synthetic */ NavigationNode(String str, String str2, String str3, int i, String str4, String str5, DisplayLayoutType displayLayoutType, SubCategorySelectionMode subCategorySelectionMode, ImageStyle imageStyle, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? "" : str5, (i2 & 64) != 0 ? DisplayLayoutType.DISPLAY_LAYOUT_TYPE_UNSPECIFIED : displayLayoutType, (i2 & 128) != 0 ? SubCategorySelectionMode.SUB_CATEGORY_SELECTION_MODE_UNSPECIFIED : subCategorySelectionMode, (i2 & 256) != 0 ? ImageStyle.IMAGE_STYLE_UNSPECIFIED : imageStyle, (i2 & 512) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m23838newBuilder();
    }

    public final String getId() {
        return this.id;
    }

    public final String getParent_id() {
        return this.parent_id;
    }

    public final String getDefault_child_node() {
        return this.default_child_node;
    }

    public final int getRank() {
        return this.rank;
    }

    public final String getDisplay_tab_text() {
        return this.display_tab_text;
    }

    public final String getDisplay_header_text() {
        return this.display_header_text;
    }

    public final DisplayLayoutType getDisplay_layout_type() {
        return this.display_layout_type;
    }

    public final SubCategorySelectionMode getSub_category_selection_mode() {
        return this.sub_category_selection_mode;
    }

    public final ImageStyle getImage_style() {
        return this.image_style;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationNode(String id, String parent_id, String default_child_node, int i, String display_tab_text, String display_header_text, DisplayLayoutType display_layout_type, SubCategorySelectionMode sub_category_selection_mode, ImageStyle image_style, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(parent_id, "parent_id");
        Intrinsics.checkNotNullParameter(default_child_node, "default_child_node");
        Intrinsics.checkNotNullParameter(display_tab_text, "display_tab_text");
        Intrinsics.checkNotNullParameter(display_header_text, "display_header_text");
        Intrinsics.checkNotNullParameter(display_layout_type, "display_layout_type");
        Intrinsics.checkNotNullParameter(sub_category_selection_mode, "sub_category_selection_mode");
        Intrinsics.checkNotNullParameter(image_style, "image_style");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = id;
        this.parent_id = parent_id;
        this.default_child_node = default_child_node;
        this.rank = i;
        this.display_tab_text = display_tab_text;
        this.display_header_text = display_header_text;
        this.display_layout_type = display_layout_type;
        this.sub_category_selection_mode = sub_category_selection_mode;
        this.image_style = image_style;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m23838newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof NavigationNode)) {
            return false;
        }
        NavigationNode navigationNode = (NavigationNode) other;
        return Intrinsics.areEqual(unknownFields(), navigationNode.unknownFields()) && Intrinsics.areEqual(this.id, navigationNode.id) && Intrinsics.areEqual(this.parent_id, navigationNode.parent_id) && Intrinsics.areEqual(this.default_child_node, navigationNode.default_child_node) && this.rank == navigationNode.rank && Intrinsics.areEqual(this.display_tab_text, navigationNode.display_tab_text) && Intrinsics.areEqual(this.display_header_text, navigationNode.display_header_text) && this.display_layout_type == navigationNode.display_layout_type && this.sub_category_selection_mode == navigationNode.sub_category_selection_mode && this.image_style == navigationNode.image_style;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((((((((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + this.parent_id.hashCode()) * 37) + this.default_child_node.hashCode()) * 37) + Integer.hashCode(this.rank)) * 37) + this.display_tab_text.hashCode()) * 37) + this.display_header_text.hashCode()) * 37) + this.display_layout_type.hashCode()) * 37) + this.sub_category_selection_mode.hashCode()) * 37) + this.image_style.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + Internal.sanitize(this.id));
        arrayList.add("parent_id=" + Internal.sanitize(this.parent_id));
        arrayList.add("default_child_node=" + Internal.sanitize(this.default_child_node));
        arrayList.add("rank=" + this.rank);
        arrayList.add("display_tab_text=" + Internal.sanitize(this.display_tab_text));
        arrayList.add("display_header_text=" + Internal.sanitize(this.display_header_text));
        arrayList.add("display_layout_type=" + this.display_layout_type);
        arrayList.add("sub_category_selection_mode=" + this.sub_category_selection_mode);
        arrayList.add("image_style=" + this.image_style);
        return CollectionsKt.joinToString$default(arrayList, ", ", "NavigationNode{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ NavigationNode copy$default(NavigationNode navigationNode, String str, String str2, String str3, int i, String str4, String str5, DisplayLayoutType displayLayoutType, SubCategorySelectionMode subCategorySelectionMode, ImageStyle imageStyle, ByteString byteString, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = navigationNode.id;
        }
        if ((i2 & 2) != 0) {
            str2 = navigationNode.parent_id;
        }
        if ((i2 & 4) != 0) {
            str3 = navigationNode.default_child_node;
        }
        if ((i2 & 8) != 0) {
            i = navigationNode.rank;
        }
        if ((i2 & 16) != 0) {
            str4 = navigationNode.display_tab_text;
        }
        if ((i2 & 32) != 0) {
            str5 = navigationNode.display_header_text;
        }
        if ((i2 & 64) != 0) {
            displayLayoutType = navigationNode.display_layout_type;
        }
        if ((i2 & 128) != 0) {
            subCategorySelectionMode = navigationNode.sub_category_selection_mode;
        }
        if ((i2 & 256) != 0) {
            imageStyle = navigationNode.image_style;
        }
        if ((i2 & 512) != 0) {
            byteString = navigationNode.unknownFields();
        }
        ImageStyle imageStyle2 = imageStyle;
        ByteString byteString2 = byteString;
        DisplayLayoutType displayLayoutType2 = displayLayoutType;
        SubCategorySelectionMode subCategorySelectionMode2 = subCategorySelectionMode;
        String str6 = str4;
        String str7 = str5;
        return navigationNode.copy(str, str2, str3, i, str6, str7, displayLayoutType2, subCategorySelectionMode2, imageStyle2, byteString2);
    }

    public final NavigationNode copy(String id, String parent_id, String default_child_node, int rank, String display_tab_text, String display_header_text, DisplayLayoutType display_layout_type, SubCategorySelectionMode sub_category_selection_mode, ImageStyle image_style, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(parent_id, "parent_id");
        Intrinsics.checkNotNullParameter(default_child_node, "default_child_node");
        Intrinsics.checkNotNullParameter(display_tab_text, "display_tab_text");
        Intrinsics.checkNotNullParameter(display_header_text, "display_header_text");
        Intrinsics.checkNotNullParameter(display_layout_type, "display_layout_type");
        Intrinsics.checkNotNullParameter(sub_category_selection_mode, "sub_category_selection_mode");
        Intrinsics.checkNotNullParameter(image_style, "image_style");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new NavigationNode(id, parent_id, default_child_node, rank, display_tab_text, display_header_text, display_layout_type, sub_category_selection_mode, image_style, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(NavigationNode.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<NavigationNode>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.prediction_markets.proto.v1.idl.NavigationNode$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(NavigationNode value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                }
                if (!Intrinsics.areEqual(value.getParent_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getParent_id());
                }
                if (!Intrinsics.areEqual(value.getDefault_child_node(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getDefault_child_node());
                }
                if (value.getRank() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(4, Integer.valueOf(value.getRank()));
                }
                if (!Intrinsics.areEqual(value.getDisplay_tab_text(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getDisplay_tab_text());
                }
                if (!Intrinsics.areEqual(value.getDisplay_header_text(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getDisplay_header_text());
                }
                if (value.getDisplay_layout_type() != DisplayLayoutType.DISPLAY_LAYOUT_TYPE_UNSPECIFIED) {
                    size += DisplayLayoutType.ADAPTER.encodedSizeWithTag(7, value.getDisplay_layout_type());
                }
                if (value.getSub_category_selection_mode() != SubCategorySelectionMode.SUB_CATEGORY_SELECTION_MODE_UNSPECIFIED) {
                    size += SubCategorySelectionMode.ADAPTER.encodedSizeWithTag(8, value.getSub_category_selection_mode());
                }
                return value.getImage_style() != ImageStyle.IMAGE_STYLE_UNSPECIFIED ? size + ImageStyle.ADAPTER.encodedSizeWithTag(9, value.getImage_style()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, NavigationNode value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                }
                if (!Intrinsics.areEqual(value.getParent_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getParent_id());
                }
                if (!Intrinsics.areEqual(value.getDefault_child_node(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getDefault_child_node());
                }
                if (value.getRank() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 4, (int) Integer.valueOf(value.getRank()));
                }
                if (!Intrinsics.areEqual(value.getDisplay_tab_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getDisplay_tab_text());
                }
                if (!Intrinsics.areEqual(value.getDisplay_header_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getDisplay_header_text());
                }
                if (value.getDisplay_layout_type() != DisplayLayoutType.DISPLAY_LAYOUT_TYPE_UNSPECIFIED) {
                    DisplayLayoutType.ADAPTER.encodeWithTag(writer, 7, (int) value.getDisplay_layout_type());
                }
                if (value.getSub_category_selection_mode() != SubCategorySelectionMode.SUB_CATEGORY_SELECTION_MODE_UNSPECIFIED) {
                    SubCategorySelectionMode.ADAPTER.encodeWithTag(writer, 8, (int) value.getSub_category_selection_mode());
                }
                if (value.getImage_style() != ImageStyle.IMAGE_STYLE_UNSPECIFIED) {
                    ImageStyle.ADAPTER.encodeWithTag(writer, 9, (int) value.getImage_style());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, NavigationNode value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getImage_style() != ImageStyle.IMAGE_STYLE_UNSPECIFIED) {
                    ImageStyle.ADAPTER.encodeWithTag(writer, 9, (int) value.getImage_style());
                }
                if (value.getSub_category_selection_mode() != SubCategorySelectionMode.SUB_CATEGORY_SELECTION_MODE_UNSPECIFIED) {
                    SubCategorySelectionMode.ADAPTER.encodeWithTag(writer, 8, (int) value.getSub_category_selection_mode());
                }
                if (value.getDisplay_layout_type() != DisplayLayoutType.DISPLAY_LAYOUT_TYPE_UNSPECIFIED) {
                    DisplayLayoutType.ADAPTER.encodeWithTag(writer, 7, (int) value.getDisplay_layout_type());
                }
                if (!Intrinsics.areEqual(value.getDisplay_header_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getDisplay_header_text());
                }
                if (!Intrinsics.areEqual(value.getDisplay_tab_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getDisplay_tab_text());
                }
                if (value.getRank() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 4, (int) Integer.valueOf(value.getRank()));
                }
                if (!Intrinsics.areEqual(value.getDefault_child_node(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getDefault_child_node());
                }
                if (!Intrinsics.areEqual(value.getParent_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getParent_id());
                }
                if (Intrinsics.areEqual(value.getId(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public NavigationNode decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                DisplayLayoutType displayLayoutTypeDecode = DisplayLayoutType.DISPLAY_LAYOUT_TYPE_UNSPECIFIED;
                SubCategorySelectionMode subCategorySelectionMode = SubCategorySelectionMode.SUB_CATEGORY_SELECTION_MODE_UNSPECIFIED;
                ImageStyle imageStyle = ImageStyle.IMAGE_STYLE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                int iIntValue = 0;
                ImageStyle imageStyleDecode = imageStyle;
                String strDecode5 = strDecode4;
                SubCategorySelectionMode subCategorySelectionModeDecode = subCategorySelectionMode;
                while (true) {
                    DisplayLayoutType displayLayoutType = displayLayoutTypeDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            switch (iNextTag) {
                                case 1:
                                    strDecode5 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 2:
                                    strDecode = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 3:
                                    strDecode2 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 4:
                                    iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                                    break;
                                case 5:
                                    strDecode3 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 6:
                                    strDecode4 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 7:
                                    try {
                                        displayLayoutTypeDecode = DisplayLayoutType.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                        break;
                                    }
                                case 8:
                                    try {
                                        subCategorySelectionModeDecode = SubCategorySelectionMode.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                        break;
                                    }
                                case 9:
                                    try {
                                        imageStyleDecode = ImageStyle.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                        break;
                                    }
                                default:
                                    reader.readUnknownField(iNextTag);
                                    break;
                            }
                        } else {
                            return new NavigationNode(strDecode5, strDecode, strDecode2, iIntValue, strDecode3, strDecode4, displayLayoutType, subCategorySelectionModeDecode, imageStyleDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public NavigationNode redact(NavigationNode value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return NavigationNode.copy$default(value, null, null, null, 0, null, null, null, null, null, ByteString.EMPTY, 511, null);
            }
        };
    }
}
