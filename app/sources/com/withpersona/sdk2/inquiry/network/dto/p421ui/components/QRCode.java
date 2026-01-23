package com.withpersona.sdk2.inquiry.network.dto.p421ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.gold.contracts.GoldFeature;
import com.squareup.moshi.JsonClass;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.UiComponentAttributes;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.StyleElements;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QRCode.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 &2\u00020\u0001:\u0003$%&B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u001e\u001a\u00020\u0019J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0019R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u00198F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001b¨\u0006'"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/QRCode;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "name", "", "attributes", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/QRCode$Attributes;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/QRCode$QRCodeComponentStyle;", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/QRCode$Attributes;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/QRCode$QRCodeComponentStyle;)V", "getName", "()Ljava/lang/String;", "getAttributes", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/QRCode$Attributes;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/QRCode$QRCodeComponentStyle;", "justification", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$PositionType;", "getJustification", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$PositionType;", GoldFeature.MARGIN, "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SizeSet;", "getMargin", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SizeSet;", "strokeColor", "", "getStrokeColor", "()Ljava/lang/Integer;", "fillColor", "getFillColor", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "QRCodeComponentStyle", "Attributes", "Companion", "network-inquiry_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class QRCode implements UiComponentConfig {

    /* renamed from: type, reason: collision with root package name */
    public static final String f10657type = "qr_code";
    private final Attributes attributes;
    private final String name;
    private final QRCodeComponentStyle styles;
    public static final Parcelable.Creator<QRCode> CREATOR = new Creator();

    /* compiled from: QRCode.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<QRCode> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QRCode createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new QRCode(parcel.readString(), parcel.readInt() == 0 ? null : Attributes.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? QRCodeComponentStyle.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QRCode[] newArray(int i) {
            return new QRCode[i];
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
        QRCodeComponentStyle qRCodeComponentStyle = this.styles;
        if (qRCodeComponentStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            qRCodeComponentStyle.writeToParcel(dest, flags);
        }
    }

    public QRCode(String name, Attributes attributes, QRCodeComponentStyle qRCodeComponentStyle) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.attributes = attributes;
        this.styles = qRCodeComponentStyle;
    }

    public /* synthetic */ QRCode(String str, Attributes attributes, QRCodeComponentStyle qRCodeComponentStyle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, attributes, (i & 4) != 0 ? null : qRCodeComponentStyle);
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.p421ui.components.UiComponentConfig
    public String getName() {
        return this.name;
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.p421ui.components.UiComponentConfig
    public Attributes getAttributes() {
        return this.attributes;
    }

    public final QRCodeComponentStyle getStyles() {
        return this.styles;
    }

    /* compiled from: QRCode.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u0018\u001a\u00020\u0019J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0019R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001f"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/QRCode$QRCodeComponentStyle;", "Landroid/os/Parcelable;", "width", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$QRCodeWidthStyle;", "justify", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$QRCodeJustifyStyle;", GoldFeature.MARGIN, "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$QRCodeMarginStyle;", "strokeColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$QRCodeStrokeColorStyle;", "fillColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$QRCodeFillColorStyle;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$QRCodeWidthStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$QRCodeJustifyStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$QRCodeMarginStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$QRCodeStrokeColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$QRCodeFillColorStyle;)V", "getWidth", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$QRCodeWidthStyle;", "getJustify", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$QRCodeJustifyStyle;", "getMargin", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$QRCodeMarginStyle;", "getStrokeColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$QRCodeStrokeColorStyle;", "getFillColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$QRCodeFillColorStyle;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class QRCodeComponentStyle implements Parcelable {
        public static final Parcelable.Creator<QRCodeComponentStyle> CREATOR = new Creator();
        private final AttributeStyles.QRCodeFillColorStyle fillColor;
        private final AttributeStyles.QRCodeJustifyStyle justify;
        private final AttributeStyles.QRCodeMarginStyle margin;
        private final AttributeStyles.QRCodeStrokeColorStyle strokeColor;
        private final AttributeStyles.QRCodeWidthStyle width;

        /* compiled from: QRCode.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<QRCodeComponentStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final QRCodeComponentStyle createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new QRCodeComponentStyle(parcel.readInt() == 0 ? null : AttributeStyles.QRCodeWidthStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.QRCodeJustifyStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.QRCodeMarginStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.QRCodeStrokeColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AttributeStyles.QRCodeFillColorStyle.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final QRCodeComponentStyle[] newArray(int i) {
                return new QRCodeComponentStyle[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            AttributeStyles.QRCodeWidthStyle qRCodeWidthStyle = this.width;
            if (qRCodeWidthStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                qRCodeWidthStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.QRCodeJustifyStyle qRCodeJustifyStyle = this.justify;
            if (qRCodeJustifyStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                qRCodeJustifyStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.QRCodeMarginStyle qRCodeMarginStyle = this.margin;
            if (qRCodeMarginStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                qRCodeMarginStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.QRCodeStrokeColorStyle qRCodeStrokeColorStyle = this.strokeColor;
            if (qRCodeStrokeColorStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                qRCodeStrokeColorStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.QRCodeFillColorStyle qRCodeFillColorStyle = this.fillColor;
            if (qRCodeFillColorStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                qRCodeFillColorStyle.writeToParcel(dest, flags);
            }
        }

        public QRCodeComponentStyle(AttributeStyles.QRCodeWidthStyle qRCodeWidthStyle, AttributeStyles.QRCodeJustifyStyle qRCodeJustifyStyle, AttributeStyles.QRCodeMarginStyle qRCodeMarginStyle, AttributeStyles.QRCodeStrokeColorStyle qRCodeStrokeColorStyle, AttributeStyles.QRCodeFillColorStyle qRCodeFillColorStyle) {
            this.width = qRCodeWidthStyle;
            this.justify = qRCodeJustifyStyle;
            this.margin = qRCodeMarginStyle;
            this.strokeColor = qRCodeStrokeColorStyle;
            this.fillColor = qRCodeFillColorStyle;
        }

        public final AttributeStyles.QRCodeWidthStyle getWidth() {
            return this.width;
        }

        public final AttributeStyles.QRCodeJustifyStyle getJustify() {
            return this.justify;
        }

        public final AttributeStyles.QRCodeMarginStyle getMargin() {
            return this.margin;
        }

        public final AttributeStyles.QRCodeStrokeColorStyle getStrokeColor() {
            return this.strokeColor;
        }

        public final AttributeStyles.QRCodeFillColorStyle getFillColor() {
            return this.fillColor;
        }
    }

    /* compiled from: QRCode.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0013"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/QRCode$Attributes;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentAttributes;", "value", "", "hidden", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;)V", "getValue", "()Ljava/lang/String;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Attributes implements UiComponentAttributes {
        public static final Parcelable.Creator<Attributes> CREATOR = new Creator();
        private final JsonLogicBoolean hidden;
        private final String value;

        /* compiled from: QRCode.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Attributes> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Attributes createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Attributes(parcel.readString(), parcel.readInt() == 0 ? null : JsonLogicBoolean.CREATOR.createFromParcel(parcel));
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
            dest.writeString(this.value);
            JsonLogicBoolean jsonLogicBoolean = this.hidden;
            if (jsonLogicBoolean == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                jsonLogicBoolean.writeToParcel(dest, flags);
            }
        }

        public Attributes(String str, JsonLogicBoolean jsonLogicBoolean) {
            this.value = str;
            this.hidden = jsonLogicBoolean;
        }

        public /* synthetic */ Attributes(String str, JsonLogicBoolean jsonLogicBoolean, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : jsonLogicBoolean);
        }

        public final String getValue() {
            return this.value;
        }

        public final JsonLogicBoolean getHidden() {
            return this.hidden;
        }
    }

    public final StyleElements.PositionType getJustification() {
        AttributeStyles.QRCodeJustifyStyle justify;
        StyleElements.Position base;
        QRCodeComponentStyle qRCodeComponentStyle = this.styles;
        if (qRCodeComponentStyle == null || (justify = qRCodeComponentStyle.getJustify()) == null || (base = justify.getBase()) == null) {
            return null;
        }
        return base.getBase();
    }

    public final StyleElements.SizeSet getMargin() {
        AttributeStyles.QRCodeMarginStyle margin;
        StyleElements.MeasurementSet base;
        QRCodeComponentStyle qRCodeComponentStyle = this.styles;
        if (qRCodeComponentStyle == null || (margin = qRCodeComponentStyle.getMargin()) == null || (base = margin.getBase()) == null) {
            return null;
        }
        return base.getBase();
    }

    public final Integer getStrokeColor() {
        AttributeStyles.QRCodeStrokeColorStyle strokeColor;
        StyleElements.SimpleElementColor base;
        StyleElements.SimpleElementColorValue base2;
        QRCodeComponentStyle qRCodeComponentStyle = this.styles;
        if (qRCodeComponentStyle == null || (strokeColor = qRCodeComponentStyle.getStrokeColor()) == null || (base = strokeColor.getBase()) == null || (base2 = base.getBase()) == null) {
            return null;
        }
        return base2.getValue();
    }

    public final Integer getFillColor() {
        AttributeStyles.QRCodeFillColorStyle fillColor;
        StyleElements.SimpleElementColor base;
        StyleElements.SimpleElementColorValue base2;
        QRCodeComponentStyle qRCodeComponentStyle = this.styles;
        if (qRCodeComponentStyle == null || (fillColor = qRCodeComponentStyle.getFillColor()) == null || (base = fillColor.getBase()) == null || (base2 = base.getBase()) == null) {
            return null;
        }
        return base2.getValue();
    }
}
