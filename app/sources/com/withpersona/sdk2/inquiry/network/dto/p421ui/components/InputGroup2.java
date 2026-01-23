package com.withpersona.sdk2.inquiry.network.dto.p421ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.gold.contracts.GoldFeature;
import com.squareup.moshi.JsonClass;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.UiComponentAttributes;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.TextBasedComponentStyle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: InputGroup.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0003\u0017\u0018\u0019B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0011R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputRadioGroup;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "name", "", "attributes", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputRadioGroup$Attributes;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputRadioGroup$InputRadioGroupComponentStyle;", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputRadioGroup$Attributes;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputRadioGroup$InputRadioGroupComponentStyle;)V", "getName", "()Ljava/lang/String;", "getAttributes", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputRadioGroup$Attributes;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputRadioGroup$InputRadioGroupComponentStyle;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Attributes", "InputRadioGroupComponentStyle", "Companion", "network-inquiry_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.network.dto.ui.components.InputRadioGroup, reason: use source file name */
/* loaded from: classes18.dex */
public final class InputGroup2 implements UiComponentConfig {

    /* renamed from: type, reason: collision with root package name */
    public static final String f10651type = "input_radio_group";
    private final Attributes attributes;
    private final String name;
    private final InputRadioGroupComponentStyle styles;
    public static final Parcelable.Creator<InputGroup2> CREATOR = new Creator();

    /* compiled from: InputGroup.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.withpersona.sdk2.inquiry.network.dto.ui.components.InputRadioGroup$Creator */
    public static final class Creator implements Parcelable.Creator<InputGroup2> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InputGroup2 createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InputGroup2(parcel.readString(), parcel.readInt() == 0 ? null : Attributes.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? InputRadioGroupComponentStyle.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InputGroup2[] newArray(int i) {
            return new InputGroup2[i];
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
        InputRadioGroupComponentStyle inputRadioGroupComponentStyle = this.styles;
        if (inputRadioGroupComponentStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            inputRadioGroupComponentStyle.writeToParcel(dest, flags);
        }
    }

    public InputGroup2(String name, Attributes attributes, InputRadioGroupComponentStyle inputRadioGroupComponentStyle) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.attributes = attributes;
        this.styles = inputRadioGroupComponentStyle;
    }

    public /* synthetic */ InputGroup2(String str, Attributes attributes, InputRadioGroupComponentStyle inputRadioGroupComponentStyle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, attributes, (i & 4) != 0 ? null : inputRadioGroupComponentStyle);
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.p421ui.components.UiComponentConfig
    public String getName() {
        return this.name;
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.p421ui.components.UiComponentConfig
    public Attributes getAttributes() {
        return this.attributes;
    }

    public final InputRadioGroupComponentStyle getStyles() {
        return this.styles;
    }

    /* compiled from: InputGroup.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u0015\u001a\u00020\u0016J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0016R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u001c"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputRadioGroup$Attributes;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentAttributes;", "prefill", "", AnnotatedPrivateKey.LABEL, "options", "", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/OptionWithDescription;", "hidden", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "disabled", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;)V", "getPrefill", "()Ljava/lang/String;", "getLabel", "getOptions", "()Ljava/util/List;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getDisabled", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.withpersona.sdk2.inquiry.network.dto.ui.components.InputRadioGroup$Attributes */
    public static final class Attributes implements UiComponentAttributes {
        public static final Parcelable.Creator<Attributes> CREATOR = new Creator();
        private final JsonLogicBoolean disabled;
        private final JsonLogicBoolean hidden;
        private final String label;
        private final List<InputGroup4> options;
        private final String prefill;

        /* compiled from: InputGroup.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        /* renamed from: com.withpersona.sdk2.inquiry.network.dto.ui.components.InputRadioGroup$Attributes$Creator */
        public static final class Creator implements Parcelable.Creator<Attributes> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Attributes createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(InputGroup4.CREATOR.createFromParcel(parcel));
                }
                return new Attributes(string2, string3, arrayList, parcel.readInt() == 0 ? null : JsonLogicBoolean.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? JsonLogicBoolean.CREATOR.createFromParcel(parcel) : null);
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
            dest.writeString(this.prefill);
            dest.writeString(this.label);
            List<InputGroup4> list = this.options;
            dest.writeInt(list.size());
            Iterator<InputGroup4> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
            JsonLogicBoolean jsonLogicBoolean = this.hidden;
            if (jsonLogicBoolean == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                jsonLogicBoolean.writeToParcel(dest, flags);
            }
            JsonLogicBoolean jsonLogicBoolean2 = this.disabled;
            if (jsonLogicBoolean2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                jsonLogicBoolean2.writeToParcel(dest, flags);
            }
        }

        public Attributes(String str, String str2, List<InputGroup4> options, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2) {
            Intrinsics.checkNotNullParameter(options, "options");
            this.prefill = str;
            this.label = str2;
            this.options = options;
            this.hidden = jsonLogicBoolean;
            this.disabled = jsonLogicBoolean2;
        }

        public /* synthetic */ Attributes(String str, String str2, List list, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, list, (i & 8) != 0 ? null : jsonLogicBoolean, (i & 16) != 0 ? null : jsonLogicBoolean2);
        }

        public final String getPrefill() {
            return this.prefill;
        }

        public final String getLabel() {
            return this.label;
        }

        public final List<InputGroup4> getOptions() {
            return this.options;
        }

        public final JsonLogicBoolean getHidden() {
            return this.hidden;
        }

        public final JsonLogicBoolean getDisabled() {
            return this.disabled;
        }
    }

    /* compiled from: InputGroup.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0006\u00100\u001a\u000201J\u0016\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u000201R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010$\u001a\u00020%8F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0011\u0010(\u001a\u00020%8F¢\u0006\u0006\u001a\u0004\b)\u0010'R\u0011\u0010*\u001a\u00020%8F¢\u0006\u0006\u001a\u0004\b+\u0010'R\u0013\u0010,\u001a\u0004\u0018\u00010-8F¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00067"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputRadioGroup$InputRadioGroupComponentStyle;", "Landroid/os/Parcelable;", GoldFeature.MARGIN, "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedMarginStyle;", "fontFamily", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputRadioGroupFontFamilyStyle;", "fontSize", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputRadioGroupFontSizeStyle;", "fontWeight", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputRadioGroupFontWeightStyle;", "letterSpacing", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputRadioGroupLetterSpacingStyle;", "lineHeight", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputRadioGroupLineHeightStyle;", "textColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputRadioGroupTextColorStyle;", "textColorHighlight", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedTextColorStyle;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedMarginStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputRadioGroupFontFamilyStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputRadioGroupFontSizeStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputRadioGroupFontWeightStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputRadioGroupLetterSpacingStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputRadioGroupLineHeightStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputRadioGroupTextColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedTextColorStyle;)V", "getMargin", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedMarginStyle;", "getFontFamily", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputRadioGroupFontFamilyStyle;", "getFontSize", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputRadioGroupFontSizeStyle;", "getFontWeight", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputRadioGroupFontWeightStyle;", "getLetterSpacing", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputRadioGroupLetterSpacingStyle;", "getLineHeight", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputRadioGroupLineHeightStyle;", "getTextColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputRadioGroupTextColorStyle;", "getTextColorHighlight", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedTextColorStyle;", "textBasedStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "getTextBasedStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "descriptionTextStyle", "getDescriptionTextStyle", "errorTextStyle", "getErrorTextStyle", "margins", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SizeSet;", "getMargins", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SizeSet;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.withpersona.sdk2.inquiry.network.dto.ui.components.InputRadioGroup$InputRadioGroupComponentStyle */
    public static final class InputRadioGroupComponentStyle implements Parcelable {
        public static final Parcelable.Creator<InputRadioGroupComponentStyle> CREATOR = new Creator();
        private final AttributeStyles.InputRadioGroupFontFamilyStyle fontFamily;
        private final AttributeStyles.InputRadioGroupFontSizeStyle fontSize;
        private final AttributeStyles.InputRadioGroupFontWeightStyle fontWeight;
        private final AttributeStyles.InputRadioGroupLetterSpacingStyle letterSpacing;
        private final AttributeStyles.InputRadioGroupLineHeightStyle lineHeight;
        private final AttributeStyles.TextBasedMarginStyle margin;
        private final AttributeStyles.InputRadioGroupTextColorStyle textColor;
        private final AttributeStyles.TextBasedTextColorStyle textColorHighlight;

        /* compiled from: InputGroup.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        /* renamed from: com.withpersona.sdk2.inquiry.network.dto.ui.components.InputRadioGroup$InputRadioGroupComponentStyle$Creator */
        public static final class Creator implements Parcelable.Creator<InputRadioGroupComponentStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputRadioGroupComponentStyle createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InputRadioGroupComponentStyle(parcel.readInt() == 0 ? null : AttributeStyles.TextBasedMarginStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputRadioGroupFontFamilyStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputRadioGroupFontSizeStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputRadioGroupFontWeightStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputRadioGroupLetterSpacingStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputRadioGroupLineHeightStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputRadioGroupTextColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AttributeStyles.TextBasedTextColorStyle.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputRadioGroupComponentStyle[] newArray(int i) {
                return new InputRadioGroupComponentStyle[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            AttributeStyles.TextBasedMarginStyle textBasedMarginStyle = this.margin;
            if (textBasedMarginStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                textBasedMarginStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.InputRadioGroupFontFamilyStyle inputRadioGroupFontFamilyStyle = this.fontFamily;
            if (inputRadioGroupFontFamilyStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                inputRadioGroupFontFamilyStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.InputRadioGroupFontSizeStyle inputRadioGroupFontSizeStyle = this.fontSize;
            if (inputRadioGroupFontSizeStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                inputRadioGroupFontSizeStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.InputRadioGroupFontWeightStyle inputRadioGroupFontWeightStyle = this.fontWeight;
            if (inputRadioGroupFontWeightStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                inputRadioGroupFontWeightStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.InputRadioGroupLetterSpacingStyle inputRadioGroupLetterSpacingStyle = this.letterSpacing;
            if (inputRadioGroupLetterSpacingStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                inputRadioGroupLetterSpacingStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.InputRadioGroupLineHeightStyle inputRadioGroupLineHeightStyle = this.lineHeight;
            if (inputRadioGroupLineHeightStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                inputRadioGroupLineHeightStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.InputRadioGroupTextColorStyle inputRadioGroupTextColorStyle = this.textColor;
            if (inputRadioGroupTextColorStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                inputRadioGroupTextColorStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.TextBasedTextColorStyle textBasedTextColorStyle = this.textColorHighlight;
            if (textBasedTextColorStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                textBasedTextColorStyle.writeToParcel(dest, flags);
            }
        }

        public InputRadioGroupComponentStyle(AttributeStyles.TextBasedMarginStyle textBasedMarginStyle, AttributeStyles.InputRadioGroupFontFamilyStyle inputRadioGroupFontFamilyStyle, AttributeStyles.InputRadioGroupFontSizeStyle inputRadioGroupFontSizeStyle, AttributeStyles.InputRadioGroupFontWeightStyle inputRadioGroupFontWeightStyle, AttributeStyles.InputRadioGroupLetterSpacingStyle inputRadioGroupLetterSpacingStyle, AttributeStyles.InputRadioGroupLineHeightStyle inputRadioGroupLineHeightStyle, AttributeStyles.InputRadioGroupTextColorStyle inputRadioGroupTextColorStyle, AttributeStyles.TextBasedTextColorStyle textBasedTextColorStyle) {
            this.margin = textBasedMarginStyle;
            this.fontFamily = inputRadioGroupFontFamilyStyle;
            this.fontSize = inputRadioGroupFontSizeStyle;
            this.fontWeight = inputRadioGroupFontWeightStyle;
            this.letterSpacing = inputRadioGroupLetterSpacingStyle;
            this.lineHeight = inputRadioGroupLineHeightStyle;
            this.textColor = inputRadioGroupTextColorStyle;
            this.textColorHighlight = textBasedTextColorStyle;
        }

        public final AttributeStyles.TextBasedMarginStyle getMargin() {
            return this.margin;
        }

        public final AttributeStyles.InputRadioGroupFontFamilyStyle getFontFamily() {
            return this.fontFamily;
        }

        public final AttributeStyles.InputRadioGroupFontSizeStyle getFontSize() {
            return this.fontSize;
        }

        public final AttributeStyles.InputRadioGroupFontWeightStyle getFontWeight() {
            return this.fontWeight;
        }

        public final AttributeStyles.InputRadioGroupLetterSpacingStyle getLetterSpacing() {
            return this.letterSpacing;
        }

        public final AttributeStyles.InputRadioGroupLineHeightStyle getLineHeight() {
            return this.lineHeight;
        }

        public final AttributeStyles.InputRadioGroupTextColorStyle getTextColor() {
            return this.textColor;
        }

        public final AttributeStyles.TextBasedTextColorStyle getTextColorHighlight() {
            return this.textColorHighlight;
        }

        public final TextBasedComponentStyle getTextBasedStyle() {
            AttributeStyles.InputRadioGroupFontFamilyStyle inputRadioGroupFontFamilyStyle = this.fontFamily;
            AttributeStyles.TextBasedFontFamilyStyle textBasedFontFamilyStyle = new AttributeStyles.TextBasedFontFamilyStyle(inputRadioGroupFontFamilyStyle != null ? inputRadioGroupFontFamilyStyle.getBase() : null);
            AttributeStyles.InputRadioGroupFontSizeStyle inputRadioGroupFontSizeStyle = this.fontSize;
            AttributeStyles.TextBasedFontSizeStyle textBasedFontSizeStyle = new AttributeStyles.TextBasedFontSizeStyle(inputRadioGroupFontSizeStyle != null ? inputRadioGroupFontSizeStyle.getBase() : null);
            AttributeStyles.InputRadioGroupFontWeightStyle inputRadioGroupFontWeightStyle = this.fontWeight;
            AttributeStyles.TextBasedFontWeightStyle textBasedFontWeightStyle = new AttributeStyles.TextBasedFontWeightStyle(inputRadioGroupFontWeightStyle != null ? inputRadioGroupFontWeightStyle.getBase() : null);
            AttributeStyles.InputRadioGroupLetterSpacingStyle inputRadioGroupLetterSpacingStyle = this.letterSpacing;
            AttributeStyles.TextBasedLetterSpacingStyle textBasedLetterSpacingStyle = new AttributeStyles.TextBasedLetterSpacingStyle(inputRadioGroupLetterSpacingStyle != null ? inputRadioGroupLetterSpacingStyle.getBase() : null);
            AttributeStyles.InputRadioGroupLineHeightStyle inputRadioGroupLineHeightStyle = this.lineHeight;
            AttributeStyles.TextBasedLineHeightStyle textBasedLineHeightStyle = new AttributeStyles.TextBasedLineHeightStyle(inputRadioGroupLineHeightStyle != null ? inputRadioGroupLineHeightStyle.getBase() : null);
            AttributeStyles.InputRadioGroupTextColorStyle inputRadioGroupTextColorStyle = this.textColor;
            return new TextBasedComponentStyle(null, null, textBasedFontFamilyStyle, textBasedFontSizeStyle, textBasedFontWeightStyle, textBasedLetterSpacingStyle, textBasedLineHeightStyle, new AttributeStyles.TextBasedTextColorStyle(inputRadioGroupTextColorStyle != null ? inputRadioGroupTextColorStyle.getBase() : null), this.textColorHighlight);
        }

        public final TextBasedComponentStyle getDescriptionTextStyle() {
            AttributeStyles.InputRadioGroupFontFamilyStyle inputRadioGroupFontFamilyStyle = this.fontFamily;
            AttributeStyles.TextBasedFontFamilyStyle textBasedFontFamilyStyle = new AttributeStyles.TextBasedFontFamilyStyle(inputRadioGroupFontFamilyStyle != null ? inputRadioGroupFontFamilyStyle.getDescription() : null);
            AttributeStyles.InputRadioGroupFontSizeStyle inputRadioGroupFontSizeStyle = this.fontSize;
            AttributeStyles.TextBasedFontSizeStyle textBasedFontSizeStyle = new AttributeStyles.TextBasedFontSizeStyle(inputRadioGroupFontSizeStyle != null ? inputRadioGroupFontSizeStyle.getDescription() : null);
            AttributeStyles.InputRadioGroupFontWeightStyle inputRadioGroupFontWeightStyle = this.fontWeight;
            AttributeStyles.TextBasedFontWeightStyle textBasedFontWeightStyle = new AttributeStyles.TextBasedFontWeightStyle(inputRadioGroupFontWeightStyle != null ? inputRadioGroupFontWeightStyle.getDescription() : null);
            AttributeStyles.InputRadioGroupLetterSpacingStyle inputRadioGroupLetterSpacingStyle = this.letterSpacing;
            AttributeStyles.TextBasedLetterSpacingStyle textBasedLetterSpacingStyle = new AttributeStyles.TextBasedLetterSpacingStyle(inputRadioGroupLetterSpacingStyle != null ? inputRadioGroupLetterSpacingStyle.getDescription() : null);
            AttributeStyles.InputRadioGroupLineHeightStyle inputRadioGroupLineHeightStyle = this.lineHeight;
            AttributeStyles.TextBasedLineHeightStyle textBasedLineHeightStyle = new AttributeStyles.TextBasedLineHeightStyle(inputRadioGroupLineHeightStyle != null ? inputRadioGroupLineHeightStyle.getDescription() : null);
            AttributeStyles.InputRadioGroupTextColorStyle inputRadioGroupTextColorStyle = this.textColor;
            return new TextBasedComponentStyle(null, null, textBasedFontFamilyStyle, textBasedFontSizeStyle, textBasedFontWeightStyle, textBasedLetterSpacingStyle, textBasedLineHeightStyle, new AttributeStyles.TextBasedTextColorStyle(inputRadioGroupTextColorStyle != null ? inputRadioGroupTextColorStyle.getDescription() : null), null);
        }

        public final TextBasedComponentStyle getErrorTextStyle() {
            AttributeStyles.InputRadioGroupFontFamilyStyle inputRadioGroupFontFamilyStyle = this.fontFamily;
            AttributeStyles.TextBasedFontFamilyStyle textBasedFontFamilyStyle = new AttributeStyles.TextBasedFontFamilyStyle(inputRadioGroupFontFamilyStyle != null ? inputRadioGroupFontFamilyStyle.getError() : null);
            AttributeStyles.InputRadioGroupFontSizeStyle inputRadioGroupFontSizeStyle = this.fontSize;
            AttributeStyles.TextBasedFontSizeStyle textBasedFontSizeStyle = new AttributeStyles.TextBasedFontSizeStyle(inputRadioGroupFontSizeStyle != null ? inputRadioGroupFontSizeStyle.getError() : null);
            AttributeStyles.InputRadioGroupFontWeightStyle inputRadioGroupFontWeightStyle = this.fontWeight;
            AttributeStyles.TextBasedFontWeightStyle textBasedFontWeightStyle = new AttributeStyles.TextBasedFontWeightStyle(inputRadioGroupFontWeightStyle != null ? inputRadioGroupFontWeightStyle.getError() : null);
            AttributeStyles.InputRadioGroupLetterSpacingStyle inputRadioGroupLetterSpacingStyle = this.letterSpacing;
            AttributeStyles.TextBasedLetterSpacingStyle textBasedLetterSpacingStyle = new AttributeStyles.TextBasedLetterSpacingStyle(inputRadioGroupLetterSpacingStyle != null ? inputRadioGroupLetterSpacingStyle.getError() : null);
            AttributeStyles.InputRadioGroupLineHeightStyle inputRadioGroupLineHeightStyle = this.lineHeight;
            AttributeStyles.TextBasedLineHeightStyle textBasedLineHeightStyle = new AttributeStyles.TextBasedLineHeightStyle(inputRadioGroupLineHeightStyle != null ? inputRadioGroupLineHeightStyle.getError() : null);
            AttributeStyles.InputRadioGroupTextColorStyle inputRadioGroupTextColorStyle = this.textColor;
            return new TextBasedComponentStyle(null, null, textBasedFontFamilyStyle, textBasedFontSizeStyle, textBasedFontWeightStyle, textBasedLetterSpacingStyle, textBasedLineHeightStyle, new AttributeStyles.TextBasedTextColorStyle(inputRadioGroupTextColorStyle != null ? inputRadioGroupTextColorStyle.getError() : null), null);
        }

        public final StyleElements.SizeSet getMargins() {
            StyleElements.MeasurementSet base;
            AttributeStyles.TextBasedMarginStyle textBasedMarginStyle = this.margin;
            if (textBasedMarginStyle == null || (base = textBasedMarginStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }
    }
}
