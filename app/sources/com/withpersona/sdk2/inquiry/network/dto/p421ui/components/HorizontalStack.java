package com.withpersona.sdk2.inquiry.network.dto.p421ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.gold.contracts.GoldFeature;
import com.squareup.moshi.JsonClass;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.UiComponentAttributes;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.StyleElements;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HorizontalStack.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0003\u001c\u001d\u001eB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0015\u001a\u00020\u0016J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/HorizontalStack;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentContainerConfig;", "name", "", "attributes", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/HorizontalStack$Attributes;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/HorizontalStack$HorizontalStackComponentStyle;", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/HorizontalStack$Attributes;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/HorizontalStack$HorizontalStackComponentStyle;)V", "getName", "()Ljava/lang/String;", "getAttributes", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/HorizontalStack$Attributes;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/HorizontalStack$HorizontalStackComponentStyle;", "children", "", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "getChildren", "()Ljava/util/List;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "HorizontalStackComponentStyle", "Attributes", "Companion", "network-inquiry_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class HorizontalStack implements UiComponentContainerConfig {

    /* renamed from: type, reason: collision with root package name */
    public static final String f10639type = "horizontal_stack";
    private final Attributes attributes;
    private final String name;
    private final HorizontalStackComponentStyle styles;
    public static final Parcelable.Creator<HorizontalStack> CREATOR = new Creator();

    /* compiled from: HorizontalStack.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<HorizontalStack> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HorizontalStack createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new HorizontalStack(parcel.readString(), parcel.readInt() == 0 ? null : Attributes.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? HorizontalStackComponentStyle.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HorizontalStack[] newArray(int i) {
            return new HorizontalStack[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.name);
        Attributes attributes = this.attributes;
        if (attributes == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            attributes.writeToParcel(dest, flags);
        }
        HorizontalStackComponentStyle horizontalStackComponentStyle = this.styles;
        if (horizontalStackComponentStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            horizontalStackComponentStyle.writeToParcel(dest, flags);
        }
    }

    public HorizontalStack(String name, Attributes attributes, HorizontalStackComponentStyle horizontalStackComponentStyle) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.attributes = attributes;
        this.styles = horizontalStackComponentStyle;
    }

    public /* synthetic */ HorizontalStack(String str, Attributes attributes, HorizontalStackComponentStyle horizontalStackComponentStyle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, attributes, (i & 4) != 0 ? null : horizontalStackComponentStyle);
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.p421ui.components.UiComponentConfig
    public String getName() {
        return this.name;
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.p421ui.components.UiComponentConfig
    public Attributes getAttributes() {
        return this.attributes;
    }

    public final HorizontalStackComponentStyle getStyles() {
        return this.styles;
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.p421ui.components.UiComponentContainerConfig
    public List<UiComponentConfig> getChildren() {
        Attributes attributes = getAttributes();
        if (attributes != null) {
            return attributes.getChildren();
        }
        return null;
    }

    /* compiled from: HorizontalStack.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001Bu\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0006\u0010T\u001a\u000201J\u0016\u0010U\u001a\u00020V2\u0006\u0010W\u001a\u00020X2\u0006\u0010Y\u001a\u000201R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0013\u00100\u001a\u0004\u0018\u0001018F¢\u0006\u0006\u001a\u0004\b2\u00103R\u0013\u00104\u001a\u0004\u0018\u0001058F¢\u0006\u0006\u001a\u0004\b6\u00107R\u0013\u00108\u001a\u0004\u0018\u0001018F¢\u0006\u0006\u001a\u0004\b9\u00103R\u0013\u0010:\u001a\u0004\u0018\u00010;8F¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0013\u0010>\u001a\u0004\u0018\u0001058F¢\u0006\u0006\u001a\u0004\b?\u00107R\u0013\u0010@\u001a\u0004\u0018\u0001058F¢\u0006\u0006\u001a\u0004\bA\u00107R\u0013\u0010B\u001a\u0004\u0018\u00010C8F¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0011\u0010F\u001a\u00020G8F¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0013\u0010J\u001a\u0004\u0018\u00010K8F¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0013\u0010N\u001a\u0004\u0018\u00010;8F¢\u0006\u0006\u001a\u0004\bO\u0010=R\u0013\u0010P\u001a\u0004\u0018\u00010Q8F¢\u0006\u0006\u001a\u0004\bR\u0010S¨\u0006Z"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/HorizontalStack$HorizontalStackComponentStyle;", "Landroid/os/Parcelable;", "backgroundColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$HorizontalStackBackgroundColorStyle;", "borderWidth", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$HorizontalStackBorderWidthStyle;", "borderColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$HorizontalStackBorderColorStyle;", "borderRadius", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$HorizontalStackBorderRadiusStyle;", "padding", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$HorizontalStackPaddingStyle;", GoldFeature.MARGIN, "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$HorizontalStackMarginStyle;", "axis", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$HorizontalStackAxisStyle;", "childSizes", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$HorizontalStackChildSizesStyle;", "alignment", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$HorizontalStackAlignmentStyle;", "gap", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$HorizontalStackGapStyle;", "width", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$HorizontalStackWidthStyle;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$HorizontalStackBackgroundColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$HorizontalStackBorderWidthStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$HorizontalStackBorderColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$HorizontalStackBorderRadiusStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$HorizontalStackPaddingStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$HorizontalStackMarginStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$HorizontalStackAxisStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$HorizontalStackChildSizesStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$HorizontalStackAlignmentStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$HorizontalStackGapStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$HorizontalStackWidthStyle;)V", "getBackgroundColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$HorizontalStackBackgroundColorStyle;", "getBorderWidth", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$HorizontalStackBorderWidthStyle;", "getBorderColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$HorizontalStackBorderColorStyle;", "getBorderRadius", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$HorizontalStackBorderRadiusStyle;", "getPadding", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$HorizontalStackPaddingStyle;", "getMargin", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$HorizontalStackMarginStyle;", "getAxis", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$HorizontalStackAxisStyle;", "getChildSizes", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$HorizontalStackChildSizesStyle;", "getAlignment", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$HorizontalStackAlignmentStyle;", "getGap", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$HorizontalStackGapStyle;", "getWidth", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$HorizontalStackWidthStyle;", "baseBackgroundColorValue", "", "getBaseBackgroundColorValue", "()Ljava/lang/Integer;", "borderWidthValue", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SizeSet;", "getBorderWidthValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SizeSet;", "baseBorderColorValue", "getBaseBorderColorValue", "borderRadiusValue", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Size;", "getBorderRadiusValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Size;", "paddingValue", "getPaddingValue", "marginValue", "getMarginValue", "childSizesValue", "", "getChildSizesValue", "()[I", "axisValue", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;", "getAxisValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;", "alignmentValue", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$PositionType;", "getAlignmentValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$PositionType;", "gapValue", "getGapValue", "widthValue", "", "getWidthValue", "()Ljava/lang/Double;", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class HorizontalStackComponentStyle implements Parcelable {
        public static final Parcelable.Creator<HorizontalStackComponentStyle> CREATOR = new Creator();
        private final AttributeStyles.HorizontalStackAlignmentStyle alignment;
        private final AttributeStyles.HorizontalStackAxisStyle axis;
        private final AttributeStyles.HorizontalStackBackgroundColorStyle backgroundColor;
        private final AttributeStyles.HorizontalStackBorderColorStyle borderColor;
        private final AttributeStyles.HorizontalStackBorderRadiusStyle borderRadius;
        private final AttributeStyles.HorizontalStackBorderWidthStyle borderWidth;
        private final AttributeStyles.HorizontalStackChildSizesStyle childSizes;
        private final AttributeStyles.HorizontalStackGapStyle gap;
        private final AttributeStyles.HorizontalStackMarginStyle margin;
        private final AttributeStyles.HorizontalStackPaddingStyle padding;
        private final AttributeStyles.HorizontalStackWidthStyle width;

        /* compiled from: HorizontalStack.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<HorizontalStackComponentStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HorizontalStackComponentStyle createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new HorizontalStackComponentStyle(parcel.readInt() == 0 ? null : AttributeStyles.HorizontalStackBackgroundColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.HorizontalStackBorderWidthStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.HorizontalStackBorderColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.HorizontalStackBorderRadiusStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.HorizontalStackPaddingStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.HorizontalStackMarginStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.HorizontalStackAxisStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.HorizontalStackChildSizesStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.HorizontalStackAlignmentStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.HorizontalStackGapStyle.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AttributeStyles.HorizontalStackWidthStyle.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HorizontalStackComponentStyle[] newArray(int i) {
                return new HorizontalStackComponentStyle[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            AttributeStyles.HorizontalStackBackgroundColorStyle horizontalStackBackgroundColorStyle = this.backgroundColor;
            if (horizontalStackBackgroundColorStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                horizontalStackBackgroundColorStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.HorizontalStackBorderWidthStyle horizontalStackBorderWidthStyle = this.borderWidth;
            if (horizontalStackBorderWidthStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                horizontalStackBorderWidthStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.HorizontalStackBorderColorStyle horizontalStackBorderColorStyle = this.borderColor;
            if (horizontalStackBorderColorStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                horizontalStackBorderColorStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.HorizontalStackBorderRadiusStyle horizontalStackBorderRadiusStyle = this.borderRadius;
            if (horizontalStackBorderRadiusStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                horizontalStackBorderRadiusStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.HorizontalStackPaddingStyle horizontalStackPaddingStyle = this.padding;
            if (horizontalStackPaddingStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                horizontalStackPaddingStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.HorizontalStackMarginStyle horizontalStackMarginStyle = this.margin;
            if (horizontalStackMarginStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                horizontalStackMarginStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.HorizontalStackAxisStyle horizontalStackAxisStyle = this.axis;
            if (horizontalStackAxisStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                horizontalStackAxisStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.HorizontalStackChildSizesStyle horizontalStackChildSizesStyle = this.childSizes;
            if (horizontalStackChildSizesStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                horizontalStackChildSizesStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.HorizontalStackAlignmentStyle horizontalStackAlignmentStyle = this.alignment;
            if (horizontalStackAlignmentStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                horizontalStackAlignmentStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.HorizontalStackGapStyle horizontalStackGapStyle = this.gap;
            if (horizontalStackGapStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                horizontalStackGapStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.HorizontalStackWidthStyle horizontalStackWidthStyle = this.width;
            if (horizontalStackWidthStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                horizontalStackWidthStyle.writeToParcel(dest, flags);
            }
        }

        public HorizontalStackComponentStyle(AttributeStyles.HorizontalStackBackgroundColorStyle horizontalStackBackgroundColorStyle, AttributeStyles.HorizontalStackBorderWidthStyle horizontalStackBorderWidthStyle, AttributeStyles.HorizontalStackBorderColorStyle horizontalStackBorderColorStyle, AttributeStyles.HorizontalStackBorderRadiusStyle horizontalStackBorderRadiusStyle, AttributeStyles.HorizontalStackPaddingStyle horizontalStackPaddingStyle, AttributeStyles.HorizontalStackMarginStyle horizontalStackMarginStyle, AttributeStyles.HorizontalStackAxisStyle horizontalStackAxisStyle, AttributeStyles.HorizontalStackChildSizesStyle horizontalStackChildSizesStyle, AttributeStyles.HorizontalStackAlignmentStyle horizontalStackAlignmentStyle, AttributeStyles.HorizontalStackGapStyle horizontalStackGapStyle, AttributeStyles.HorizontalStackWidthStyle horizontalStackWidthStyle) {
            this.backgroundColor = horizontalStackBackgroundColorStyle;
            this.borderWidth = horizontalStackBorderWidthStyle;
            this.borderColor = horizontalStackBorderColorStyle;
            this.borderRadius = horizontalStackBorderRadiusStyle;
            this.padding = horizontalStackPaddingStyle;
            this.margin = horizontalStackMarginStyle;
            this.axis = horizontalStackAxisStyle;
            this.childSizes = horizontalStackChildSizesStyle;
            this.alignment = horizontalStackAlignmentStyle;
            this.gap = horizontalStackGapStyle;
            this.width = horizontalStackWidthStyle;
        }

        public final AttributeStyles.HorizontalStackBackgroundColorStyle getBackgroundColor() {
            return this.backgroundColor;
        }

        public final AttributeStyles.HorizontalStackBorderWidthStyle getBorderWidth() {
            return this.borderWidth;
        }

        public final AttributeStyles.HorizontalStackBorderColorStyle getBorderColor() {
            return this.borderColor;
        }

        public final AttributeStyles.HorizontalStackBorderRadiusStyle getBorderRadius() {
            return this.borderRadius;
        }

        public final AttributeStyles.HorizontalStackPaddingStyle getPadding() {
            return this.padding;
        }

        public final AttributeStyles.HorizontalStackMarginStyle getMargin() {
            return this.margin;
        }

        public final AttributeStyles.HorizontalStackAxisStyle getAxis() {
            return this.axis;
        }

        public final AttributeStyles.HorizontalStackChildSizesStyle getChildSizes() {
            return this.childSizes;
        }

        public final AttributeStyles.HorizontalStackAlignmentStyle getAlignment() {
            return this.alignment;
        }

        public final AttributeStyles.HorizontalStackGapStyle getGap() {
            return this.gap;
        }

        public final AttributeStyles.HorizontalStackWidthStyle getWidth() {
            return this.width;
        }

        public final Integer getBaseBackgroundColorValue() {
            StyleElements.SimpleElementColor base;
            StyleElements.SimpleElementColorValue base2;
            AttributeStyles.HorizontalStackBackgroundColorStyle horizontalStackBackgroundColorStyle = this.backgroundColor;
            if (horizontalStackBackgroundColorStyle == null || (base = horizontalStackBackgroundColorStyle.getBase()) == null || (base2 = base.getBase()) == null) {
                return null;
            }
            return base2.getValue();
        }

        public final StyleElements.SizeSet getBorderWidthValue() {
            StyleElements.MeasurementSet base;
            AttributeStyles.HorizontalStackBorderWidthStyle horizontalStackBorderWidthStyle = this.borderWidth;
            if (horizontalStackBorderWidthStyle == null || (base = horizontalStackBorderWidthStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public final Integer getBaseBorderColorValue() {
            StyleElements.SimpleElementColor base;
            StyleElements.SimpleElementColorValue base2;
            AttributeStyles.HorizontalStackBorderColorStyle horizontalStackBorderColorStyle = this.borderColor;
            if (horizontalStackBorderColorStyle == null || (base = horizontalStackBorderColorStyle.getBase()) == null || (base2 = base.getBase()) == null) {
                return null;
            }
            return base2.getValue();
        }

        public final StyleElements.Size getBorderRadiusValue() {
            StyleElements.Measurement base;
            AttributeStyles.HorizontalStackBorderRadiusStyle horizontalStackBorderRadiusStyle = this.borderRadius;
            if (horizontalStackBorderRadiusStyle == null || (base = horizontalStackBorderRadiusStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public final StyleElements.SizeSet getPaddingValue() {
            StyleElements.MeasurementSet base;
            AttributeStyles.HorizontalStackPaddingStyle horizontalStackPaddingStyle = this.padding;
            if (horizontalStackPaddingStyle == null || (base = horizontalStackPaddingStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public final StyleElements.SizeSet getMarginValue() {
            StyleElements.MeasurementSet base;
            AttributeStyles.HorizontalStackMarginStyle horizontalStackMarginStyle = this.margin;
            if (horizontalStackMarginStyle == null || (base = horizontalStackMarginStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public final int[] getChildSizesValue() {
            StyleElements.ChildSizes base;
            AttributeStyles.HorizontalStackChildSizesStyle horizontalStackChildSizesStyle = this.childSizes;
            if (horizontalStackChildSizesStyle == null || (base = horizontalStackChildSizesStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public final StyleElements.Axis getAxisValue() {
            StyleElements.AxisContainer base;
            StyleElements.Axis base2;
            AttributeStyles.HorizontalStackAxisStyle horizontalStackAxisStyle = this.axis;
            return (horizontalStackAxisStyle == null || (base = horizontalStackAxisStyle.getBase()) == null || (base2 = base.getBase()) == null) ? StyleElements.Axis.HORIZONTAL : base2;
        }

        public final StyleElements.PositionType getAlignmentValue() {
            StyleElements.Position base;
            AttributeStyles.HorizontalStackAlignmentStyle horizontalStackAlignmentStyle = this.alignment;
            if (horizontalStackAlignmentStyle == null || (base = horizontalStackAlignmentStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public final StyleElements.Size getGapValue() {
            StyleElements.Measurement base;
            AttributeStyles.HorizontalStackGapStyle horizontalStackGapStyle = this.gap;
            if (horizontalStackGapStyle == null || (base = horizontalStackGapStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public final Double getWidthValue() {
            StyleElements.Measurement base;
            StyleElements.Size base2;
            AttributeStyles.HorizontalStackWidthStyle horizontalStackWidthStyle = this.width;
            if (horizontalStackWidthStyle == null || (base = horizontalStackWidthStyle.getBase()) == null || (base2 = base.getBase()) == null) {
                return null;
            }
            return base2.getDp();
        }
    }

    /* compiled from: HorizontalStack.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000eR\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0014"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/HorizontalStack$Attributes;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentAttributes;", "children", "", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "hidden", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "<init>", "(Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;)V", "getChildren", "()Ljava/util/List;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Attributes implements UiComponentAttributes {
        public static final Parcelable.Creator<Attributes> CREATOR = new Creator();
        private final List<UiComponentConfig> children;
        private final JsonLogicBoolean hidden;

        /* compiled from: HorizontalStack.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Attributes> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Attributes createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i = parcel.readInt();
                    arrayList = new ArrayList(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        arrayList.add(parcel.readParcelable(Attributes.class.getClassLoader()));
                    }
                }
                return new Attributes(arrayList, parcel.readInt() != 0 ? JsonLogicBoolean.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Attributes[] newArray(int i) {
                return new Attributes[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            List<UiComponentConfig> list = this.children;
            if (list == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(list.size());
                Iterator<UiComponentConfig> it = list.iterator();
                while (it.hasNext()) {
                    dest.writeParcelable(it.next(), flags);
                }
            }
            JsonLogicBoolean jsonLogicBoolean = this.hidden;
            if (jsonLogicBoolean == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                jsonLogicBoolean.writeToParcel(dest, flags);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Attributes(List<? extends UiComponentConfig> list, JsonLogicBoolean jsonLogicBoolean) {
            this.children = list;
            this.hidden = jsonLogicBoolean;
        }

        public /* synthetic */ Attributes(List list, JsonLogicBoolean jsonLogicBoolean, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i & 2) != 0 ? null : jsonLogicBoolean);
        }

        public final List<UiComponentConfig> getChildren() {
            return this.children;
        }

        public final JsonLogicBoolean getHidden() {
            return this.hidden;
        }
    }
}
