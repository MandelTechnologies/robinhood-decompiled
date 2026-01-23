package com.withpersona.sdk2.inquiry.network.dto.p421ui.styling;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.gold.contracts.GoldFeature;
import com.squareup.moshi.JsonClass;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.StyleElements;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ButtonComponentStyling.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u009d\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b!\u0010\"J\u0006\u0010w\u001a\u00020PJ\u0016\u0010x\u001a\u00020y2\u0006\u0010z\u001a\u00020{2\u0006\u0010|\u001a\u00020PR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u001e¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0013\u0010\u001f\u001a\u0004\u0018\u00010 ¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0016\u0010A\u001a\u0004\u0018\u00010B8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0016\u0010E\u001a\u0004\u0018\u00010B8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010DR\u0016\u0010G\u001a\u0004\u0018\u00010H8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bI\u0010JR\u0016\u0010K\u001a\u0004\u0018\u00010L8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0016\u0010O\u001a\u0004\u0018\u00010P8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010RR\u0016\u0010S\u001a\u0004\u0018\u00010P8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bT\u0010RR\u0016\u0010U\u001a\u0004\u0018\u00010P8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bV\u0010RR\u0016\u0010W\u001a\u0004\u0018\u00010L8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bX\u0010NR\u0016\u0010Y\u001a\u0004\u0018\u00010Z8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b[\u0010\\R\u0016\u0010]\u001a\u0004\u0018\u00010^8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b_\u0010`R\u0016\u0010a\u001a\u0004\u0018\u00010L8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bb\u0010NR\u0016\u0010c\u001a\u0004\u0018\u00010P8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bd\u0010RR\u0014\u0010e\u001a\u00020P8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bf\u0010RR\u0016\u0010g\u001a\u0004\u0018\u00010P8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bh\u0010RR\u0016\u0010i\u001a\u0004\u0018\u00010L8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bj\u0010NR\u0016\u0010k\u001a\u0004\u0018\u00010L8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bl\u0010NR\u0016\u0010m\u001a\u0004\u0018\u00010P8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bn\u0010RR\u0016\u0010o\u001a\u0004\u0018\u00010P8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bp\u0010RR\u0016\u0010q\u001a\u0004\u0018\u00010P8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\br\u0010RR\u0016\u0010s\u001a\u0004\u0018\u00010L8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bt\u0010NR\u0016\u0010u\u001a\u0004\u0018\u00010L8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bv\u0010N¨\u0006}"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonActionComponentStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/BaseButtonComponentStyle;", "padding", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedPaddingStyle;", GoldFeature.MARGIN, "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedMarginStyle;", "justify", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedJustifyStyle;", "fontFamily", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedFontFamilyStyle;", "fontSize", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedFontSizeStyle;", "fontWeight", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedFontWeightStyle;", "letterSpacing", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedLetterSpacingStyle;", "lineHeight", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedLineHeightStyle;", "textColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedTextColorStyle;", "height", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedHeightStyle;", "width", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedWidthStyle;", "backgroundColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedBackgroundColorStyle;", "borderColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedBorderColorStyle;", "borderRadius", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedBorderRadiusStyle;", "borderWidth", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedBorderWidthStyle;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedPaddingStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedMarginStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedJustifyStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedFontFamilyStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedFontSizeStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedFontWeightStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedLetterSpacingStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedLineHeightStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedTextColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedHeightStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedWidthStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedBackgroundColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedBorderColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedBorderRadiusStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedBorderWidthStyle;)V", "getPadding", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedPaddingStyle;", "getMargin", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedMarginStyle;", "getJustify", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedJustifyStyle;", "getFontFamily", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedFontFamilyStyle;", "getFontSize", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedFontSizeStyle;", "getFontWeight", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedFontWeightStyle;", "getLetterSpacing", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedLetterSpacingStyle;", "getLineHeight", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedLineHeightStyle;", "getTextColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedTextColorStyle;", "getHeight", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedHeightStyle;", "getWidth", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedWidthStyle;", "getBackgroundColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedBackgroundColorStyle;", "getBorderColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedBorderColorStyle;", "getBorderRadius", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedBorderRadiusStyle;", "getBorderWidth", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedBorderWidthStyle;", "paddingValue", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SizeSet;", "getPaddingValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SizeSet;", "marginValue", "getMarginValue", "justificationValue", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$PositionType;", "getJustificationValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$PositionType;", "fontSizeValue", "", "getFontSizeValue", "()Ljava/lang/Double;", "baseTextColorValue", "", "getBaseTextColorValue", "()Ljava/lang/Integer;", "activeTextColorValue", "getActiveTextColorValue", "disabledTextColorValue", "getDisabledTextColorValue", "letterSpacingValue", "getLetterSpacingValue", "fontNameValue", "", "getFontNameValue", "()Ljava/lang/String;", "fontWeightValue", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeight;", "getFontWeightValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeight;", "lineHeightValue", "getLineHeightValue", "baseBackgroundColorValue", "getBaseBackgroundColorValue", "activeBackgroundColorValue", "getActiveBackgroundColorValue", "disabledBackgroundColorValue", "getDisabledBackgroundColorValue", "heightValue", "getHeightValue", "widthValue", "getWidthValue", "baseBorderColorValue", "getBaseBorderColorValue", "activeBorderColorValue", "getActiveBorderColorValue", "disabledBorderColorValue", "getDisabledBorderColorValue", "borderRadiusValue", "getBorderRadiusValue", "borderWidthValue", "getBorderWidthValue", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonActionComponentStyle, reason: use source file name */
/* loaded from: classes18.dex */
public final class ButtonComponentStyling2 implements Parcelable, ButtonComponentStyling {
    public static final Parcelable.Creator<ButtonComponentStyling2> CREATOR = new Creator();
    private final AttributeStyles.ButtonBasedBackgroundColorStyle backgroundColor;
    private final AttributeStyles.ButtonBasedBorderColorStyle borderColor;
    private final AttributeStyles.ButtonBasedBorderRadiusStyle borderRadius;
    private final AttributeStyles.ButtonBasedBorderWidthStyle borderWidth;
    private final AttributeStyles.ButtonBasedFontFamilyStyle fontFamily;
    private final AttributeStyles.ButtonBasedFontSizeStyle fontSize;
    private final AttributeStyles.ButtonBasedFontWeightStyle fontWeight;
    private final AttributeStyles.ButtonBasedHeightStyle height;
    private final AttributeStyles.ButtonBasedJustifyStyle justify;
    private final AttributeStyles.ButtonBasedLetterSpacingStyle letterSpacing;
    private final AttributeStyles.ButtonBasedLineHeightStyle lineHeight;
    private final AttributeStyles.ButtonBasedMarginStyle margin;
    private final AttributeStyles.ButtonBasedPaddingStyle padding;
    private final AttributeStyles.ButtonBasedTextColorStyle textColor;
    private final AttributeStyles.ButtonBasedWidthStyle width;

    /* compiled from: ButtonComponentStyling.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonActionComponentStyle$Creator */
    public static final class Creator implements Parcelable.Creator<ButtonComponentStyling2> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ButtonComponentStyling2 createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ButtonComponentStyling2(parcel.readInt() == 0 ? null : AttributeStyles.ButtonBasedPaddingStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ButtonBasedMarginStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ButtonBasedJustifyStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ButtonBasedFontFamilyStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ButtonBasedFontSizeStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ButtonBasedFontWeightStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ButtonBasedLetterSpacingStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ButtonBasedLineHeightStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ButtonBasedTextColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ButtonBasedHeightStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ButtonBasedWidthStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ButtonBasedBackgroundColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ButtonBasedBorderColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ButtonBasedBorderRadiusStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ButtonBasedBorderWidthStyle.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ButtonComponentStyling2[] newArray(int i) {
            return new ButtonComponentStyling2[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        AttributeStyles.ButtonBasedPaddingStyle buttonBasedPaddingStyle = this.padding;
        if (buttonBasedPaddingStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            buttonBasedPaddingStyle.writeToParcel(dest, flags);
        }
        AttributeStyles.ButtonBasedMarginStyle buttonBasedMarginStyle = this.margin;
        if (buttonBasedMarginStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            buttonBasedMarginStyle.writeToParcel(dest, flags);
        }
        AttributeStyles.ButtonBasedJustifyStyle buttonBasedJustifyStyle = this.justify;
        if (buttonBasedJustifyStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            buttonBasedJustifyStyle.writeToParcel(dest, flags);
        }
        AttributeStyles.ButtonBasedFontFamilyStyle buttonBasedFontFamilyStyle = this.fontFamily;
        if (buttonBasedFontFamilyStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            buttonBasedFontFamilyStyle.writeToParcel(dest, flags);
        }
        AttributeStyles.ButtonBasedFontSizeStyle buttonBasedFontSizeStyle = this.fontSize;
        if (buttonBasedFontSizeStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            buttonBasedFontSizeStyle.writeToParcel(dest, flags);
        }
        AttributeStyles.ButtonBasedFontWeightStyle buttonBasedFontWeightStyle = this.fontWeight;
        if (buttonBasedFontWeightStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            buttonBasedFontWeightStyle.writeToParcel(dest, flags);
        }
        AttributeStyles.ButtonBasedLetterSpacingStyle buttonBasedLetterSpacingStyle = this.letterSpacing;
        if (buttonBasedLetterSpacingStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            buttonBasedLetterSpacingStyle.writeToParcel(dest, flags);
        }
        AttributeStyles.ButtonBasedLineHeightStyle buttonBasedLineHeightStyle = this.lineHeight;
        if (buttonBasedLineHeightStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            buttonBasedLineHeightStyle.writeToParcel(dest, flags);
        }
        AttributeStyles.ButtonBasedTextColorStyle buttonBasedTextColorStyle = this.textColor;
        if (buttonBasedTextColorStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            buttonBasedTextColorStyle.writeToParcel(dest, flags);
        }
        AttributeStyles.ButtonBasedHeightStyle buttonBasedHeightStyle = this.height;
        if (buttonBasedHeightStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            buttonBasedHeightStyle.writeToParcel(dest, flags);
        }
        AttributeStyles.ButtonBasedWidthStyle buttonBasedWidthStyle = this.width;
        if (buttonBasedWidthStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            buttonBasedWidthStyle.writeToParcel(dest, flags);
        }
        AttributeStyles.ButtonBasedBackgroundColorStyle buttonBasedBackgroundColorStyle = this.backgroundColor;
        if (buttonBasedBackgroundColorStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            buttonBasedBackgroundColorStyle.writeToParcel(dest, flags);
        }
        AttributeStyles.ButtonBasedBorderColorStyle buttonBasedBorderColorStyle = this.borderColor;
        if (buttonBasedBorderColorStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            buttonBasedBorderColorStyle.writeToParcel(dest, flags);
        }
        AttributeStyles.ButtonBasedBorderRadiusStyle buttonBasedBorderRadiusStyle = this.borderRadius;
        if (buttonBasedBorderRadiusStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            buttonBasedBorderRadiusStyle.writeToParcel(dest, flags);
        }
        AttributeStyles.ButtonBasedBorderWidthStyle buttonBasedBorderWidthStyle = this.borderWidth;
        if (buttonBasedBorderWidthStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            buttonBasedBorderWidthStyle.writeToParcel(dest, flags);
        }
    }

    public ButtonComponentStyling2(AttributeStyles.ButtonBasedPaddingStyle buttonBasedPaddingStyle, AttributeStyles.ButtonBasedMarginStyle buttonBasedMarginStyle, AttributeStyles.ButtonBasedJustifyStyle buttonBasedJustifyStyle, AttributeStyles.ButtonBasedFontFamilyStyle buttonBasedFontFamilyStyle, AttributeStyles.ButtonBasedFontSizeStyle buttonBasedFontSizeStyle, AttributeStyles.ButtonBasedFontWeightStyle buttonBasedFontWeightStyle, AttributeStyles.ButtonBasedLetterSpacingStyle buttonBasedLetterSpacingStyle, AttributeStyles.ButtonBasedLineHeightStyle buttonBasedLineHeightStyle, AttributeStyles.ButtonBasedTextColorStyle buttonBasedTextColorStyle, AttributeStyles.ButtonBasedHeightStyle buttonBasedHeightStyle, AttributeStyles.ButtonBasedWidthStyle buttonBasedWidthStyle, AttributeStyles.ButtonBasedBackgroundColorStyle buttonBasedBackgroundColorStyle, AttributeStyles.ButtonBasedBorderColorStyle buttonBasedBorderColorStyle, AttributeStyles.ButtonBasedBorderRadiusStyle buttonBasedBorderRadiusStyle, AttributeStyles.ButtonBasedBorderWidthStyle buttonBasedBorderWidthStyle) {
        this.padding = buttonBasedPaddingStyle;
        this.margin = buttonBasedMarginStyle;
        this.justify = buttonBasedJustifyStyle;
        this.fontFamily = buttonBasedFontFamilyStyle;
        this.fontSize = buttonBasedFontSizeStyle;
        this.fontWeight = buttonBasedFontWeightStyle;
        this.letterSpacing = buttonBasedLetterSpacingStyle;
        this.lineHeight = buttonBasedLineHeightStyle;
        this.textColor = buttonBasedTextColorStyle;
        this.height = buttonBasedHeightStyle;
        this.width = buttonBasedWidthStyle;
        this.backgroundColor = buttonBasedBackgroundColorStyle;
        this.borderColor = buttonBasedBorderColorStyle;
        this.borderRadius = buttonBasedBorderRadiusStyle;
        this.borderWidth = buttonBasedBorderWidthStyle;
    }

    public final AttributeStyles.ButtonBasedPaddingStyle getPadding() {
        return this.padding;
    }

    public final AttributeStyles.ButtonBasedMarginStyle getMargin() {
        return this.margin;
    }

    public final AttributeStyles.ButtonBasedJustifyStyle getJustify() {
        return this.justify;
    }

    public final AttributeStyles.ButtonBasedFontFamilyStyle getFontFamily() {
        return this.fontFamily;
    }

    public final AttributeStyles.ButtonBasedFontSizeStyle getFontSize() {
        return this.fontSize;
    }

    public final AttributeStyles.ButtonBasedFontWeightStyle getFontWeight() {
        return this.fontWeight;
    }

    public final AttributeStyles.ButtonBasedLetterSpacingStyle getLetterSpacing() {
        return this.letterSpacing;
    }

    public final AttributeStyles.ButtonBasedLineHeightStyle getLineHeight() {
        return this.lineHeight;
    }

    public final AttributeStyles.ButtonBasedTextColorStyle getTextColor() {
        return this.textColor;
    }

    public final AttributeStyles.ButtonBasedHeightStyle getHeight() {
        return this.height;
    }

    public final AttributeStyles.ButtonBasedWidthStyle getWidth() {
        return this.width;
    }

    public final AttributeStyles.ButtonBasedBackgroundColorStyle getBackgroundColor() {
        return this.backgroundColor;
    }

    public final AttributeStyles.ButtonBasedBorderColorStyle getBorderColor() {
        return this.borderColor;
    }

    public final AttributeStyles.ButtonBasedBorderRadiusStyle getBorderRadius() {
        return this.borderRadius;
    }

    public final AttributeStyles.ButtonBasedBorderWidthStyle getBorderWidth() {
        return this.borderWidth;
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.ButtonComponentStyling
    public StyleElements.SizeSet getPaddingValue() {
        StyleElements.MeasurementSet base;
        AttributeStyles.ButtonBasedPaddingStyle buttonBasedPaddingStyle = this.padding;
        if (buttonBasedPaddingStyle == null || (base = buttonBasedPaddingStyle.getBase()) == null) {
            return null;
        }
        return base.getBase();
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.ButtonComponentStyling
    public StyleElements.SizeSet getMarginValue() {
        StyleElements.MeasurementSet base;
        AttributeStyles.ButtonBasedMarginStyle buttonBasedMarginStyle = this.margin;
        if (buttonBasedMarginStyle == null || (base = buttonBasedMarginStyle.getBase()) == null) {
            return null;
        }
        return base.getBase();
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.ButtonComponentStyling
    public StyleElements.PositionType getJustificationValue() {
        StyleElements.Position base;
        AttributeStyles.ButtonBasedJustifyStyle buttonBasedJustifyStyle = this.justify;
        if (buttonBasedJustifyStyle == null || (base = buttonBasedJustifyStyle.getBase()) == null) {
            return null;
        }
        return base.getBase();
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.ButtonComponentStyling
    public Double getFontSizeValue() {
        StyleElements.Measurement base;
        StyleElements.Size base2;
        AttributeStyles.ButtonBasedFontSizeStyle buttonBasedFontSizeStyle = this.fontSize;
        if (buttonBasedFontSizeStyle == null || (base = buttonBasedFontSizeStyle.getBase()) == null || (base2 = base.getBase()) == null) {
            return null;
        }
        return base2.getDp();
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.ButtonComponentStyling
    public Integer getBaseTextColorValue() {
        StyleElements.ComplexElementColor base;
        AttributeStyles.ButtonBasedTextColorStyle buttonBasedTextColorStyle = this.textColor;
        if (buttonBasedTextColorStyle == null || (base = buttonBasedTextColorStyle.getBase()) == null) {
            return null;
        }
        return base.getBase();
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.ButtonComponentStyling
    public Integer getActiveTextColorValue() {
        StyleElements.ComplexElementColor base;
        AttributeStyles.ButtonBasedTextColorStyle buttonBasedTextColorStyle = this.textColor;
        if (buttonBasedTextColorStyle == null || (base = buttonBasedTextColorStyle.getBase()) == null) {
            return null;
        }
        return base.getActive();
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.ButtonComponentStyling
    public Integer getDisabledTextColorValue() {
        StyleElements.ComplexElementColor base;
        Integer disabled;
        AttributeStyles.ButtonBasedTextColorStyle buttonBasedTextColorStyle = this.textColor;
        return (buttonBasedTextColorStyle == null || (base = buttonBasedTextColorStyle.getBase()) == null || (disabled = base.getDisabled()) == null) ? getBaseTextColorValue() : disabled;
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.ButtonComponentStyling
    public Double getLetterSpacingValue() {
        StyleElements.Measurement base;
        StyleElements.Size base2;
        AttributeStyles.ButtonBasedLetterSpacingStyle buttonBasedLetterSpacingStyle = this.letterSpacing;
        if (buttonBasedLetterSpacingStyle == null || (base = buttonBasedLetterSpacingStyle.getBase()) == null || (base2 = base.getBase()) == null) {
            return null;
        }
        return base2.getDp();
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.ButtonComponentStyling
    public String getFontNameValue() {
        StyleElements.FontName base;
        AttributeStyles.ButtonBasedFontFamilyStyle buttonBasedFontFamilyStyle = this.fontFamily;
        if (buttonBasedFontFamilyStyle == null || (base = buttonBasedFontFamilyStyle.getBase()) == null) {
            return null;
        }
        return base.getFontName();
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.ButtonComponentStyling
    public StyleElements.FontWeight getFontWeightValue() {
        StyleElements.FontWeightContainer base;
        AttributeStyles.ButtonBasedFontWeightStyle buttonBasedFontWeightStyle = this.fontWeight;
        if (buttonBasedFontWeightStyle == null || (base = buttonBasedFontWeightStyle.getBase()) == null) {
            return null;
        }
        return base.getBase();
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.ButtonComponentStyling
    public Double getLineHeightValue() {
        StyleElements.Measurement base;
        StyleElements.Size base2;
        AttributeStyles.ButtonBasedLineHeightStyle buttonBasedLineHeightStyle = this.lineHeight;
        if (buttonBasedLineHeightStyle == null || (base = buttonBasedLineHeightStyle.getBase()) == null || (base2 = base.getBase()) == null) {
            return null;
        }
        return base2.getDp();
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.ButtonComponentStyling
    public Integer getBaseBackgroundColorValue() {
        StyleElements.ComplexElementColor base;
        AttributeStyles.ButtonBasedBackgroundColorStyle buttonBasedBackgroundColorStyle = this.backgroundColor;
        if (buttonBasedBackgroundColorStyle == null || (base = buttonBasedBackgroundColorStyle.getBase()) == null) {
            return null;
        }
        return base.getBase();
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.ButtonComponentStyling
    public Integer getActiveBackgroundColorValue() {
        StyleElements.ComplexElementColor base;
        Integer active;
        AttributeStyles.ButtonBasedBackgroundColorStyle buttonBasedBackgroundColorStyle = this.backgroundColor;
        return Integer.valueOf((buttonBasedBackgroundColorStyle == null || (base = buttonBasedBackgroundColorStyle.getBase()) == null || (active = base.getActive()) == null) ? ButtonComponentStyling6.defaultLoadingColor : active.intValue());
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.ButtonComponentStyling
    public Integer getDisabledBackgroundColorValue() {
        StyleElements.ComplexElementColor base;
        Integer disabled;
        AttributeStyles.ButtonBasedBackgroundColorStyle buttonBasedBackgroundColorStyle = this.backgroundColor;
        return (buttonBasedBackgroundColorStyle == null || (base = buttonBasedBackgroundColorStyle.getBase()) == null || (disabled = base.getDisabled()) == null) ? getBaseBackgroundColorValue() : disabled;
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.ButtonComponentStyling
    public Double getHeightValue() {
        StyleElements.Measurement base;
        StyleElements.Size base2;
        AttributeStyles.ButtonBasedHeightStyle buttonBasedHeightStyle = this.height;
        if (buttonBasedHeightStyle == null || (base = buttonBasedHeightStyle.getBase()) == null || (base2 = base.getBase()) == null) {
            return null;
        }
        return base2.getDp();
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.ButtonComponentStyling
    public Double getWidthValue() {
        StyleElements.Measurement base;
        StyleElements.Size base2;
        AttributeStyles.ButtonBasedWidthStyle buttonBasedWidthStyle = this.width;
        if (buttonBasedWidthStyle == null || (base = buttonBasedWidthStyle.getBase()) == null || (base2 = base.getBase()) == null) {
            return null;
        }
        return base2.getDp();
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.ButtonComponentStyling
    public Integer getBaseBorderColorValue() {
        StyleElements.ComplexElementColor base;
        AttributeStyles.ButtonBasedBorderColorStyle buttonBasedBorderColorStyle = this.borderColor;
        if (buttonBasedBorderColorStyle == null || (base = buttonBasedBorderColorStyle.getBase()) == null) {
            return null;
        }
        return base.getBase();
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.ButtonComponentStyling
    public Integer getActiveBorderColorValue() {
        StyleElements.ComplexElementColor base;
        AttributeStyles.ButtonBasedBorderColorStyle buttonBasedBorderColorStyle = this.borderColor;
        if (buttonBasedBorderColorStyle == null || (base = buttonBasedBorderColorStyle.getBase()) == null) {
            return null;
        }
        return base.getActive();
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.ButtonComponentStyling
    public Integer getDisabledBorderColorValue() {
        StyleElements.ComplexElementColor base;
        Integer disabled;
        AttributeStyles.ButtonBasedBorderColorStyle buttonBasedBorderColorStyle = this.borderColor;
        return (buttonBasedBorderColorStyle == null || (base = buttonBasedBorderColorStyle.getBase()) == null || (disabled = base.getDisabled()) == null) ? getBaseBorderColorValue() : disabled;
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.ButtonComponentStyling
    public Double getBorderRadiusValue() {
        StyleElements.Measurement base;
        StyleElements.Size base2;
        AttributeStyles.ButtonBasedBorderRadiusStyle buttonBasedBorderRadiusStyle = this.borderRadius;
        if (buttonBasedBorderRadiusStyle == null || (base = buttonBasedBorderRadiusStyle.getBase()) == null || (base2 = base.getBase()) == null) {
            return null;
        }
        return base2.getDp();
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.ButtonComponentStyling
    public Double getBorderWidthValue() {
        StyleElements.MeasurementSet base;
        StyleElements.SizeSet base2;
        StyleElements.Size top;
        AttributeStyles.ButtonBasedBorderWidthStyle buttonBasedBorderWidthStyle = this.borderWidth;
        if (buttonBasedBorderWidthStyle == null || (base = buttonBasedBorderWidthStyle.getBase()) == null || (base2 = base.getBase()) == null || (top = base2.getTop()) == null) {
            return null;
        }
        return top.getDp();
    }
}
