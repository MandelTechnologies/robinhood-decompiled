package com.robinhood.prediction_markets.proto.p361v1.idl;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
import com.robinhood.prediction_markets.proto.p361v1.idl.DisplayLayoutTypeDto;
import com.robinhood.prediction_markets.proto.p361v1.idl.ImageStyleDto;
import com.robinhood.prediction_markets.proto.p361v1.idl.SubCategorySelectionModeDto;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: NavigationNodeDto.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 42\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00043456B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007Bc\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015¢\u0006\u0004\b\u0006\u0010\u0016J`\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0015J\b\u0010&\u001a\u00020\u0002H\u0016J\b\u0010'\u001a\u00020\tH\u0016J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0096\u0002J\b\u0010,\u001a\u00020\rH\u0016J\u0018\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\rH\u0016J\b\u00102\u001a\u00020\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000e\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0018R\u0011\u0010\u000f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0018R\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0012\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0011\u0010\u0014\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u00067"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/NavigationNodeDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/prediction_markets/proto/v1/idl/NavigationNode;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/prediction_markets/proto/v1/idl/NavigationNodeDto$Surrogate;", "<init>", "(Lcom/robinhood/prediction_markets/proto/v1/idl/NavigationNodeDto$Surrogate;)V", "id", "", "parent_id", "default_child_node", "rank", "", "display_tab_text", "display_header_text", "display_layout_type", "Lcom/robinhood/prediction_markets/proto/v1/idl/DisplayLayoutTypeDto;", "sub_category_selection_mode", "Lcom/robinhood/prediction_markets/proto/v1/idl/SubCategorySelectionModeDto;", "image_style", "Lcom/robinhood/prediction_markets/proto/v1/idl/ImageStyleDto;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lcom/robinhood/prediction_markets/proto/v1/idl/DisplayLayoutTypeDto;Lcom/robinhood/prediction_markets/proto/v1/idl/SubCategorySelectionModeDto;Lcom/robinhood/prediction_markets/proto/v1/idl/ImageStyleDto;)V", "getId", "()Ljava/lang/String;", "getParent_id", "getDefault_child_node", "getRank", "()I", "getDisplay_tab_text", "getDisplay_header_text", "getDisplay_layout_type", "()Lcom/robinhood/prediction_markets/proto/v1/idl/DisplayLayoutTypeDto;", "getSub_category_selection_mode", "()Lcom/robinhood/prediction_markets/proto/v1/idl/SubCategorySelectionModeDto;", "getImage_style", "()Lcom/robinhood/prediction_markets/proto/v1/idl/ImageStyleDto;", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes26.dex */
public final class NavigationNodeDto implements Dto3<NavigationNode>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<NavigationNodeDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<NavigationNodeDto, NavigationNode>> binaryBase64Serializer$delegate;
    private static final NavigationNodeDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ NavigationNodeDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private NavigationNodeDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getId() {
        return this.surrogate.getId();
    }

    public final String getParent_id() {
        return this.surrogate.getParent_id();
    }

    public final String getDefault_child_node() {
        return this.surrogate.getDefault_child_node();
    }

    public final int getRank() {
        return this.surrogate.getRank();
    }

    public final String getDisplay_tab_text() {
        return this.surrogate.getDisplay_tab_text();
    }

    public final String getDisplay_header_text() {
        return this.surrogate.getDisplay_header_text();
    }

    public final DisplayLayoutTypeDto getDisplay_layout_type() {
        return this.surrogate.getDisplay_layout_type();
    }

    public final SubCategorySelectionModeDto getSub_category_selection_mode() {
        return this.surrogate.getSub_category_selection_mode();
    }

    public final ImageStyleDto getImage_style() {
        return this.surrogate.getImage_style();
    }

    public /* synthetic */ NavigationNodeDto(String str, String str2, String str3, int i, String str4, String str5, DisplayLayoutTypeDto displayLayoutTypeDto, SubCategorySelectionModeDto subCategorySelectionModeDto, ImageStyleDto imageStyleDto, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? "" : str5, (i2 & 64) != 0 ? DisplayLayoutTypeDto.INSTANCE.getZeroValue() : displayLayoutTypeDto, (i2 & 128) != 0 ? SubCategorySelectionModeDto.INSTANCE.getZeroValue() : subCategorySelectionModeDto, (i2 & 256) != 0 ? ImageStyleDto.INSTANCE.getZeroValue() : imageStyleDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NavigationNodeDto(String id, String parent_id, String default_child_node, int i, String display_tab_text, String display_header_text, DisplayLayoutTypeDto display_layout_type, SubCategorySelectionModeDto sub_category_selection_mode, ImageStyleDto image_style) {
        this(new Surrogate(id, parent_id, default_child_node, i, display_tab_text, display_header_text, display_layout_type, sub_category_selection_mode, image_style));
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(parent_id, "parent_id");
        Intrinsics.checkNotNullParameter(default_child_node, "default_child_node");
        Intrinsics.checkNotNullParameter(display_tab_text, "display_tab_text");
        Intrinsics.checkNotNullParameter(display_header_text, "display_header_text");
        Intrinsics.checkNotNullParameter(display_layout_type, "display_layout_type");
        Intrinsics.checkNotNullParameter(sub_category_selection_mode, "sub_category_selection_mode");
        Intrinsics.checkNotNullParameter(image_style, "image_style");
    }

    public static /* synthetic */ NavigationNodeDto copy$default(NavigationNodeDto navigationNodeDto, String str, String str2, String str3, int i, String str4, String str5, DisplayLayoutTypeDto displayLayoutTypeDto, SubCategorySelectionModeDto subCategorySelectionModeDto, ImageStyleDto imageStyleDto, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = navigationNodeDto.surrogate.getId();
        }
        if ((i2 & 2) != 0) {
            str2 = navigationNodeDto.surrogate.getParent_id();
        }
        if ((i2 & 4) != 0) {
            str3 = navigationNodeDto.surrogate.getDefault_child_node();
        }
        if ((i2 & 8) != 0) {
            i = navigationNodeDto.surrogate.getRank();
        }
        if ((i2 & 16) != 0) {
            str4 = navigationNodeDto.surrogate.getDisplay_tab_text();
        }
        if ((i2 & 32) != 0) {
            str5 = navigationNodeDto.surrogate.getDisplay_header_text();
        }
        if ((i2 & 64) != 0) {
            displayLayoutTypeDto = navigationNodeDto.surrogate.getDisplay_layout_type();
        }
        if ((i2 & 128) != 0) {
            subCategorySelectionModeDto = navigationNodeDto.surrogate.getSub_category_selection_mode();
        }
        if ((i2 & 256) != 0) {
            imageStyleDto = navigationNodeDto.surrogate.getImage_style();
        }
        SubCategorySelectionModeDto subCategorySelectionModeDto2 = subCategorySelectionModeDto;
        ImageStyleDto imageStyleDto2 = imageStyleDto;
        String str6 = str5;
        DisplayLayoutTypeDto displayLayoutTypeDto2 = displayLayoutTypeDto;
        String str7 = str4;
        String str8 = str3;
        return navigationNodeDto.copy(str, str2, str8, i, str7, str6, displayLayoutTypeDto2, subCategorySelectionModeDto2, imageStyleDto2);
    }

    public final NavigationNodeDto copy(String id, String parent_id, String default_child_node, int rank, String display_tab_text, String display_header_text, DisplayLayoutTypeDto display_layout_type, SubCategorySelectionModeDto sub_category_selection_mode, ImageStyleDto image_style) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(parent_id, "parent_id");
        Intrinsics.checkNotNullParameter(default_child_node, "default_child_node");
        Intrinsics.checkNotNullParameter(display_tab_text, "display_tab_text");
        Intrinsics.checkNotNullParameter(display_header_text, "display_header_text");
        Intrinsics.checkNotNullParameter(display_layout_type, "display_layout_type");
        Intrinsics.checkNotNullParameter(sub_category_selection_mode, "sub_category_selection_mode");
        Intrinsics.checkNotNullParameter(image_style, "image_style");
        return new NavigationNodeDto(new Surrogate(id, parent_id, default_child_node, rank, display_tab_text, display_header_text, display_layout_type, sub_category_selection_mode, image_style));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public NavigationNode toProto() {
        return new NavigationNode(this.surrogate.getId(), this.surrogate.getParent_id(), this.surrogate.getDefault_child_node(), this.surrogate.getRank(), this.surrogate.getDisplay_tab_text(), this.surrogate.getDisplay_header_text(), (DisplayLayoutType) this.surrogate.getDisplay_layout_type().toProto(), (SubCategorySelectionMode) this.surrogate.getSub_category_selection_mode().toProto(), (ImageStyle) this.surrogate.getImage_style().toProto(), null, 512, null);
    }

    public String toString() {
        return "[NavigationNodeDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof NavigationNodeDto) && Intrinsics.areEqual(((NavigationNodeDto) other).surrogate, this.surrogate);
        }
        return true;
    }

    public int hashCode() {
        return this.surrogate.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: NavigationNodeDto.kt */
    @Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 I2\u00020\u0001:\u0002HIBp\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0017\b\u0002\u0010\u0006\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014Bs\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0013\u0010\u0018J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\u0018\u00104\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\nHÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u000eHÆ\u0003J\t\u00108\u001a\u00020\u0010HÆ\u0003J\t\u00109\u001a\u00020\u0012HÆ\u0003Jr\u0010:\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0017\b\u0002\u0010\u0006\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012HÆ\u0001J\u0013\u0010;\u001a\u00020<2\b\u0010=\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010>\u001a\u00020\u0007HÖ\u0001J\t\u0010?\u001a\u00020\u0003HÖ\u0001J%\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020\u00002\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020FH\u0001¢\u0006\u0002\bGR\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u001c\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001cR+\u0010\u0006\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\u001a\u001a\u0004\b\"\u0010#R\u001c\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b$\u0010\u001a\u001a\u0004\b%\u0010\u001cR\u001c\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b&\u0010\u001a\u001a\u0004\b'\u0010\u001cR\u001c\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b(\u0010\u001a\u001a\u0004\b)\u0010*R\u001c\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b+\u0010\u001a\u001a\u0004\b,\u0010-R\u001c\u0010\u0011\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b.\u0010\u001a\u001a\u0004\b/\u00100¨\u0006J"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/NavigationNodeDto$Surrogate;", "", "id", "", "parent_id", "default_child_node", "rank", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int32Serializer;", "display_tab_text", "display_header_text", "display_layout_type", "Lcom/robinhood/prediction_markets/proto/v1/idl/DisplayLayoutTypeDto;", "sub_category_selection_mode", "Lcom/robinhood/prediction_markets/proto/v1/idl/SubCategorySelectionModeDto;", "image_style", "Lcom/robinhood/prediction_markets/proto/v1/idl/ImageStyleDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lcom/robinhood/prediction_markets/proto/v1/idl/DisplayLayoutTypeDto;Lcom/robinhood/prediction_markets/proto/v1/idl/SubCategorySelectionModeDto;Lcom/robinhood/prediction_markets/proto/v1/idl/ImageStyleDto;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lcom/robinhood/prediction_markets/proto/v1/idl/DisplayLayoutTypeDto;Lcom/robinhood/prediction_markets/proto/v1/idl/SubCategorySelectionModeDto;Lcom/robinhood/prediction_markets/proto/v1/idl/ImageStyleDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getId$annotations", "()V", "getId", "()Ljava/lang/String;", "getParent_id$annotations", "getParent_id", "getDefault_child_node$annotations", "getDefault_child_node", "getRank$annotations", "getRank", "()I", "getDisplay_tab_text$annotations", "getDisplay_tab_text", "getDisplay_header_text$annotations", "getDisplay_header_text", "getDisplay_layout_type$annotations", "getDisplay_layout_type", "()Lcom/robinhood/prediction_markets/proto/v1/idl/DisplayLayoutTypeDto;", "getSub_category_selection_mode$annotations", "getSub_category_selection_mode", "()Lcom/robinhood/prediction_markets/proto/v1/idl/SubCategorySelectionModeDto;", "getImage_style$annotations", "getImage_style", "()Lcom/robinhood/prediction_markets/proto/v1/idl/ImageStyleDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$prediction_markets_v1_externalRelease", "$serializer", "Companion", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String default_child_node;
        private final String display_header_text;
        private final DisplayLayoutTypeDto display_layout_type;
        private final String display_tab_text;
        private final String id;
        private final ImageStyleDto image_style;
        private final String parent_id;
        private final int rank;
        private final SubCategorySelectionModeDto sub_category_selection_mode;

        public Surrogate() {
            this((String) null, (String) null, (String) null, 0, (String) null, (String) null, (DisplayLayoutTypeDto) null, (SubCategorySelectionModeDto) null, (ImageStyleDto) null, 511, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, String str3, int i, String str4, String str5, DisplayLayoutTypeDto displayLayoutTypeDto, SubCategorySelectionModeDto subCategorySelectionModeDto, ImageStyleDto imageStyleDto, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = surrogate.id;
            }
            if ((i2 & 2) != 0) {
                str2 = surrogate.parent_id;
            }
            if ((i2 & 4) != 0) {
                str3 = surrogate.default_child_node;
            }
            if ((i2 & 8) != 0) {
                i = surrogate.rank;
            }
            if ((i2 & 16) != 0) {
                str4 = surrogate.display_tab_text;
            }
            if ((i2 & 32) != 0) {
                str5 = surrogate.display_header_text;
            }
            if ((i2 & 64) != 0) {
                displayLayoutTypeDto = surrogate.display_layout_type;
            }
            if ((i2 & 128) != 0) {
                subCategorySelectionModeDto = surrogate.sub_category_selection_mode;
            }
            if ((i2 & 256) != 0) {
                imageStyleDto = surrogate.image_style;
            }
            SubCategorySelectionModeDto subCategorySelectionModeDto2 = subCategorySelectionModeDto;
            ImageStyleDto imageStyleDto2 = imageStyleDto;
            String str6 = str5;
            DisplayLayoutTypeDto displayLayoutTypeDto2 = displayLayoutTypeDto;
            String str7 = str4;
            String str8 = str3;
            return surrogate.copy(str, str2, str8, i, str7, str6, displayLayoutTypeDto2, subCategorySelectionModeDto2, imageStyleDto2);
        }

        @SerialName("defaultChildNode")
        @JsonAnnotations2(names = {"default_child_node"})
        public static /* synthetic */ void getDefault_child_node$annotations() {
        }

        @SerialName("displayHeaderText")
        @JsonAnnotations2(names = {"display_header_text"})
        public static /* synthetic */ void getDisplay_header_text$annotations() {
        }

        @SerialName("displayLayoutType")
        @JsonAnnotations2(names = {"display_layout_type"})
        public static /* synthetic */ void getDisplay_layout_type$annotations() {
        }

        @SerialName("displayTabText")
        @JsonAnnotations2(names = {"display_tab_text"})
        public static /* synthetic */ void getDisplay_tab_text$annotations() {
        }

        @SerialName("id")
        @JsonAnnotations2(names = {"id"})
        public static /* synthetic */ void getId$annotations() {
        }

        @SerialName("imageStyle")
        @JsonAnnotations2(names = {"image_style"})
        public static /* synthetic */ void getImage_style$annotations() {
        }

        @SerialName("parentId")
        @JsonAnnotations2(names = {"parent_id"})
        public static /* synthetic */ void getParent_id$annotations() {
        }

        @SerialName("rank")
        @JsonAnnotations2(names = {"rank"})
        public static /* synthetic */ void getRank$annotations() {
        }

        @SerialName("subCategorySelectionMode")
        @JsonAnnotations2(names = {"sub_category_selection_mode"})
        public static /* synthetic */ void getSub_category_selection_mode$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getParent_id() {
            return this.parent_id;
        }

        /* renamed from: component3, reason: from getter */
        public final String getDefault_child_node() {
            return this.default_child_node;
        }

        /* renamed from: component4, reason: from getter */
        public final int getRank() {
            return this.rank;
        }

        /* renamed from: component5, reason: from getter */
        public final String getDisplay_tab_text() {
            return this.display_tab_text;
        }

        /* renamed from: component6, reason: from getter */
        public final String getDisplay_header_text() {
            return this.display_header_text;
        }

        /* renamed from: component7, reason: from getter */
        public final DisplayLayoutTypeDto getDisplay_layout_type() {
            return this.display_layout_type;
        }

        /* renamed from: component8, reason: from getter */
        public final SubCategorySelectionModeDto getSub_category_selection_mode() {
            return this.sub_category_selection_mode;
        }

        /* renamed from: component9, reason: from getter */
        public final ImageStyleDto getImage_style() {
            return this.image_style;
        }

        public final Surrogate copy(String id, String parent_id, String default_child_node, int rank, String display_tab_text, String display_header_text, DisplayLayoutTypeDto display_layout_type, SubCategorySelectionModeDto sub_category_selection_mode, ImageStyleDto image_style) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(parent_id, "parent_id");
            Intrinsics.checkNotNullParameter(default_child_node, "default_child_node");
            Intrinsics.checkNotNullParameter(display_tab_text, "display_tab_text");
            Intrinsics.checkNotNullParameter(display_header_text, "display_header_text");
            Intrinsics.checkNotNullParameter(display_layout_type, "display_layout_type");
            Intrinsics.checkNotNullParameter(sub_category_selection_mode, "sub_category_selection_mode");
            Intrinsics.checkNotNullParameter(image_style, "image_style");
            return new Surrogate(id, parent_id, default_child_node, rank, display_tab_text, display_header_text, display_layout_type, sub_category_selection_mode, image_style);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.id, surrogate.id) && Intrinsics.areEqual(this.parent_id, surrogate.parent_id) && Intrinsics.areEqual(this.default_child_node, surrogate.default_child_node) && this.rank == surrogate.rank && Intrinsics.areEqual(this.display_tab_text, surrogate.display_tab_text) && Intrinsics.areEqual(this.display_header_text, surrogate.display_header_text) && this.display_layout_type == surrogate.display_layout_type && this.sub_category_selection_mode == surrogate.sub_category_selection_mode && this.image_style == surrogate.image_style;
        }

        public int hashCode() {
            return (((((((((((((((this.id.hashCode() * 31) + this.parent_id.hashCode()) * 31) + this.default_child_node.hashCode()) * 31) + Integer.hashCode(this.rank)) * 31) + this.display_tab_text.hashCode()) * 31) + this.display_header_text.hashCode()) * 31) + this.display_layout_type.hashCode()) * 31) + this.sub_category_selection_mode.hashCode()) * 31) + this.image_style.hashCode();
        }

        public String toString() {
            return "Surrogate(id=" + this.id + ", parent_id=" + this.parent_id + ", default_child_node=" + this.default_child_node + ", rank=" + this.rank + ", display_tab_text=" + this.display_tab_text + ", display_header_text=" + this.display_header_text + ", display_layout_type=" + this.display_layout_type + ", sub_category_selection_mode=" + this.sub_category_selection_mode + ", image_style=" + this.image_style + ")";
        }

        /* compiled from: NavigationNodeDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/NavigationNodeDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/prediction_markets/proto/v1/idl/NavigationNodeDto$Surrogate;", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return NavigationNodeDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, int i2, String str4, String str5, DisplayLayoutTypeDto displayLayoutTypeDto, SubCategorySelectionModeDto subCategorySelectionModeDto, ImageStyleDto imageStyleDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.id = "";
            } else {
                this.id = str;
            }
            if ((i & 2) == 0) {
                this.parent_id = "";
            } else {
                this.parent_id = str2;
            }
            if ((i & 4) == 0) {
                this.default_child_node = "";
            } else {
                this.default_child_node = str3;
            }
            if ((i & 8) == 0) {
                this.rank = 0;
            } else {
                this.rank = i2;
            }
            if ((i & 16) == 0) {
                this.display_tab_text = "";
            } else {
                this.display_tab_text = str4;
            }
            if ((i & 32) == 0) {
                this.display_header_text = "";
            } else {
                this.display_header_text = str5;
            }
            if ((i & 64) == 0) {
                this.display_layout_type = DisplayLayoutTypeDto.INSTANCE.getZeroValue();
            } else {
                this.display_layout_type = displayLayoutTypeDto;
            }
            if ((i & 128) == 0) {
                this.sub_category_selection_mode = SubCategorySelectionModeDto.INSTANCE.getZeroValue();
            } else {
                this.sub_category_selection_mode = subCategorySelectionModeDto;
            }
            if ((i & 256) == 0) {
                this.image_style = ImageStyleDto.INSTANCE.getZeroValue();
            } else {
                this.image_style = imageStyleDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$prediction_markets_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.id, "")) {
                output.encodeStringElement(serialDesc, 0, self.id);
            }
            if (!Intrinsics.areEqual(self.parent_id, "")) {
                output.encodeStringElement(serialDesc, 1, self.parent_id);
            }
            if (!Intrinsics.areEqual(self.default_child_node, "")) {
                output.encodeStringElement(serialDesc, 2, self.default_child_node);
            }
            int i = self.rank;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 3, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
            if (!Intrinsics.areEqual(self.display_tab_text, "")) {
                output.encodeStringElement(serialDesc, 4, self.display_tab_text);
            }
            if (!Intrinsics.areEqual(self.display_header_text, "")) {
                output.encodeStringElement(serialDesc, 5, self.display_header_text);
            }
            if (self.display_layout_type != DisplayLayoutTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 6, DisplayLayoutTypeDto.Serializer.INSTANCE, self.display_layout_type);
            }
            if (self.sub_category_selection_mode != SubCategorySelectionModeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 7, SubCategorySelectionModeDto.Serializer.INSTANCE, self.sub_category_selection_mode);
            }
            if (self.image_style != ImageStyleDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 8, ImageStyleDto.Serializer.INSTANCE, self.image_style);
            }
        }

        public Surrogate(String id, String parent_id, String default_child_node, int i, String display_tab_text, String display_header_text, DisplayLayoutTypeDto display_layout_type, SubCategorySelectionModeDto sub_category_selection_mode, ImageStyleDto image_style) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(parent_id, "parent_id");
            Intrinsics.checkNotNullParameter(default_child_node, "default_child_node");
            Intrinsics.checkNotNullParameter(display_tab_text, "display_tab_text");
            Intrinsics.checkNotNullParameter(display_header_text, "display_header_text");
            Intrinsics.checkNotNullParameter(display_layout_type, "display_layout_type");
            Intrinsics.checkNotNullParameter(sub_category_selection_mode, "sub_category_selection_mode");
            Intrinsics.checkNotNullParameter(image_style, "image_style");
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

        public /* synthetic */ Surrogate(String str, String str2, String str3, int i, String str4, String str5, DisplayLayoutTypeDto displayLayoutTypeDto, SubCategorySelectionModeDto subCategorySelectionModeDto, ImageStyleDto imageStyleDto, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? "" : str5, (i2 & 64) != 0 ? DisplayLayoutTypeDto.INSTANCE.getZeroValue() : displayLayoutTypeDto, (i2 & 128) != 0 ? SubCategorySelectionModeDto.INSTANCE.getZeroValue() : subCategorySelectionModeDto, (i2 & 256) != 0 ? ImageStyleDto.INSTANCE.getZeroValue() : imageStyleDto);
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

        public final DisplayLayoutTypeDto getDisplay_layout_type() {
            return this.display_layout_type;
        }

        public final SubCategorySelectionModeDto getSub_category_selection_mode() {
            return this.sub_category_selection_mode;
        }

        public final ImageStyleDto getImage_style() {
            return this.image_style;
        }
    }

    /* compiled from: NavigationNodeDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/NavigationNodeDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/prediction_markets/proto/v1/idl/NavigationNodeDto;", "Lcom/robinhood/prediction_markets/proto/v1/idl/NavigationNode;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/prediction_markets/proto/v1/idl/NavigationNodeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<NavigationNodeDto, NavigationNode> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<NavigationNodeDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<NavigationNodeDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<NavigationNodeDto> getBinaryBase64Serializer() {
            return (KSerializer) NavigationNodeDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<NavigationNode> getProtoAdapter() {
            return NavigationNode.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public NavigationNodeDto getZeroValue() {
            return NavigationNodeDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public NavigationNodeDto fromProto(NavigationNode proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new NavigationNodeDto(new Surrogate(proto.getId(), proto.getParent_id(), proto.getDefault_child_node(), proto.getRank(), proto.getDisplay_tab_text(), proto.getDisplay_header_text(), DisplayLayoutTypeDto.INSTANCE.fromProto(proto.getDisplay_layout_type()), SubCategorySelectionModeDto.INSTANCE.fromProto(proto.getSub_category_selection_mode()), ImageStyleDto.INSTANCE.fromProto(proto.getImage_style())), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.prediction_markets.proto.v1.idl.NavigationNodeDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NavigationNodeDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new NavigationNodeDto(null, null, null, 0, null, null, null, null, null, 511, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: NavigationNodeDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/NavigationNodeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/prediction_markets/proto/v1/idl/NavigationNodeDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/prediction_markets/proto/v1/idl/NavigationNodeDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<NavigationNodeDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/prediction_markets.v1.NavigationNode", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, NavigationNodeDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public NavigationNodeDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new NavigationNodeDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: NavigationNodeDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/NavigationNodeDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4190_6)
        public final String provideIntoMap() {
            return "com.robinhood.prediction_markets.proto.v1.idl.NavigationNodeDto";
        }
    }
}
