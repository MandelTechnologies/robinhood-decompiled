package com.withpersona.sdk2.inquiry.network.dto.p421ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.JsonClass;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.UiComponentAttributes;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.InputSelectComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.InputTextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.TextBasedComponentStyle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: InputInternationalDb.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0004\u0017\u0018\u0019\u001aB#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0011R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputInternationalDb;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "name", "", "attributes", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputInternationalDb$Attributes;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputInternationalDb$InputInternationalDbComponentStyle;", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputInternationalDb$Attributes;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputInternationalDb$InputInternationalDbComponentStyle;)V", "getName", "()Ljava/lang/String;", "getAttributes", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputInternationalDb$Attributes;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputInternationalDb$InputInternationalDbComponentStyle;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "InputInternationalDbComponentStyle", "Attributes", "IdType", "Companion", "network-inquiry_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class InputInternationalDb implements UiComponentConfig {

    /* renamed from: type, reason: collision with root package name */
    public static final String f10646type = "input_international_db";
    private final Attributes attributes;
    private final String name;
    private final InputInternationalDbComponentStyle styles;
    public static final Parcelable.Creator<InputInternationalDb> CREATOR = new Creator();

    /* compiled from: InputInternationalDb.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<InputInternationalDb> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InputInternationalDb createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InputInternationalDb(parcel.readString(), parcel.readInt() == 0 ? null : Attributes.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? InputInternationalDbComponentStyle.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InputInternationalDb[] newArray(int i) {
            return new InputInternationalDb[i];
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
        InputInternationalDbComponentStyle inputInternationalDbComponentStyle = this.styles;
        if (inputInternationalDbComponentStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            inputInternationalDbComponentStyle.writeToParcel(dest, flags);
        }
    }

    public InputInternationalDb(String name, Attributes attributes, InputInternationalDbComponentStyle inputInternationalDbComponentStyle) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.attributes = attributes;
        this.styles = inputInternationalDbComponentStyle;
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.p421ui.components.UiComponentConfig
    public String getName() {
        return this.name;
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.p421ui.components.UiComponentConfig
    public Attributes getAttributes() {
        return this.attributes;
    }

    public final InputInternationalDbComponentStyle getStyles() {
        return this.styles;
    }

    /* compiled from: InputInternationalDb.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0011R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0017"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputInternationalDb$InputInternationalDbComponentStyle;", "Landroid/os/Parcelable;", "inputSelectStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;", "inputTextStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;", "textStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;)V", "getInputSelectStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;", "getInputTextStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;", "getTextStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class InputInternationalDbComponentStyle implements Parcelable {
        public static final Parcelable.Creator<InputInternationalDbComponentStyle> CREATOR = new Creator();
        private final InputSelectComponentStyle inputSelectStyle;
        private final InputTextBasedComponentStyle inputTextStyle;
        private final TextBasedComponentStyle textStyle;

        /* compiled from: InputInternationalDb.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<InputInternationalDbComponentStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputInternationalDbComponentStyle createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InputInternationalDbComponentStyle(parcel.readInt() == 0 ? null : InputSelectComponentStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : InputTextBasedComponentStyle.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? TextBasedComponentStyle.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputInternationalDbComponentStyle[] newArray(int i) {
                return new InputInternationalDbComponentStyle[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            InputSelectComponentStyle inputSelectComponentStyle = this.inputSelectStyle;
            if (inputSelectComponentStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                inputSelectComponentStyle.writeToParcel(dest, flags);
            }
            InputTextBasedComponentStyle inputTextBasedComponentStyle = this.inputTextStyle;
            if (inputTextBasedComponentStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                inputTextBasedComponentStyle.writeToParcel(dest, flags);
            }
            TextBasedComponentStyle textBasedComponentStyle = this.textStyle;
            if (textBasedComponentStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                textBasedComponentStyle.writeToParcel(dest, flags);
            }
        }

        public InputInternationalDbComponentStyle(InputSelectComponentStyle inputSelectComponentStyle, InputTextBasedComponentStyle inputTextBasedComponentStyle, TextBasedComponentStyle textBasedComponentStyle) {
            this.inputSelectStyle = inputSelectComponentStyle;
            this.inputTextStyle = inputTextBasedComponentStyle;
            this.textStyle = textBasedComponentStyle;
        }

        public final InputSelectComponentStyle getInputSelectStyle() {
            return this.inputSelectStyle;
        }

        public final InputTextBasedComponentStyle getInputTextStyle() {
            return this.inputTextStyle;
        }

        public final TextBasedComponentStyle getTextStyle() {
            return this.textStyle;
        }
    }

    /* compiled from: InputInternationalDb.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001BÓ\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0006\u00106\u001a\u000207J\u0016\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u000207R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001eR\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010&\u001a\u0004\b$\u0010%R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010&\u001a\u0004\b'\u0010%R\u0015\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010&\u001a\u0004\b(\u0010%R\u0015\u0010\r\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010&\u001a\u0004\b)\u0010%R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001eR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001eR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001eR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001eR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001eR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001eR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001eR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b5\u00104¨\u0006="}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputInternationalDb$Attributes;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentAttributes;", "prefillIdbCountry", "", "prefillIdbType", "prefillIdbValue", "errorIdbCountry", "errorIdbType", "errorIdbValue", "hideCountryIfPrefilled", "", "hideTypeIfPrefilled", "hideCountryIfSingleChoice", "hideTypeIfSingleChoice", "allowedIdTypes", "", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputInternationalDb$IdType;", AnnotatedPrivateKey.LABEL, "labelIdbCountry", "labelIdbType", "labelIdbValue", "placeholderIdbCountry", "placeholderIdbType", "placeholderIdbValue", "hidden", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "disabled", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;)V", "getPrefillIdbCountry", "()Ljava/lang/String;", "getPrefillIdbType", "getPrefillIdbValue", "getErrorIdbCountry", "getErrorIdbType", "getErrorIdbValue", "getHideCountryIfPrefilled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getHideTypeIfPrefilled", "getHideCountryIfSingleChoice", "getHideTypeIfSingleChoice", "getAllowedIdTypes", "()Ljava/util/List;", "getLabel", "getLabelIdbCountry", "getLabelIdbType", "getLabelIdbValue", "getPlaceholderIdbCountry", "getPlaceholderIdbType", "getPlaceholderIdbValue", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getDisabled", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Attributes implements UiComponentAttributes {
        public static final Parcelable.Creator<Attributes> CREATOR = new Creator();
        private final List<IdType> allowedIdTypes;
        private final JsonLogicBoolean disabled;
        private final String errorIdbCountry;
        private final String errorIdbType;
        private final String errorIdbValue;
        private final JsonLogicBoolean hidden;
        private final Boolean hideCountryIfPrefilled;
        private final Boolean hideCountryIfSingleChoice;
        private final Boolean hideTypeIfPrefilled;
        private final Boolean hideTypeIfSingleChoice;
        private final String label;
        private final String labelIdbCountry;
        private final String labelIdbType;
        private final String labelIdbValue;
        private final String placeholderIdbCountry;
        private final String placeholderIdbType;
        private final String placeholderIdbValue;
        private final String prefillIdbCountry;
        private final String prefillIdbType;
        private final String prefillIdbValue;

        /* compiled from: InputInternationalDb.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Attributes> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Attributes createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
                Boolean boolValueOf2 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
                Boolean boolValueOf3 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
                Boolean boolValueOf4 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(IdType.CREATOR.createFromParcel(parcel));
                }
                return new Attributes(string2, string3, string4, string5, string6, string7, boolValueOf, boolValueOf2, boolValueOf3, boolValueOf4, arrayList, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : JsonLogicBoolean.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? JsonLogicBoolean.CREATOR.createFromParcel(parcel) : null);
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
            dest.writeString(this.prefillIdbCountry);
            dest.writeString(this.prefillIdbType);
            dest.writeString(this.prefillIdbValue);
            dest.writeString(this.errorIdbCountry);
            dest.writeString(this.errorIdbType);
            dest.writeString(this.errorIdbValue);
            Boolean bool = this.hideCountryIfPrefilled;
            if (bool == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(bool.booleanValue() ? 1 : 0);
            }
            Boolean bool2 = this.hideTypeIfPrefilled;
            if (bool2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(bool2.booleanValue() ? 1 : 0);
            }
            Boolean bool3 = this.hideCountryIfSingleChoice;
            if (bool3 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(bool3.booleanValue() ? 1 : 0);
            }
            Boolean bool4 = this.hideTypeIfSingleChoice;
            if (bool4 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(bool4.booleanValue() ? 1 : 0);
            }
            List<IdType> list = this.allowedIdTypes;
            dest.writeInt(list.size());
            Iterator<IdType> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
            dest.writeString(this.label);
            dest.writeString(this.labelIdbCountry);
            dest.writeString(this.labelIdbType);
            dest.writeString(this.labelIdbValue);
            dest.writeString(this.placeholderIdbCountry);
            dest.writeString(this.placeholderIdbType);
            dest.writeString(this.placeholderIdbValue);
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

        public Attributes(String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, List<IdType> allowedIdTypes, String str7, String str8, String str9, String str10, String str11, String str12, String str13, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2) {
            Intrinsics.checkNotNullParameter(allowedIdTypes, "allowedIdTypes");
            this.prefillIdbCountry = str;
            this.prefillIdbType = str2;
            this.prefillIdbValue = str3;
            this.errorIdbCountry = str4;
            this.errorIdbType = str5;
            this.errorIdbValue = str6;
            this.hideCountryIfPrefilled = bool;
            this.hideTypeIfPrefilled = bool2;
            this.hideCountryIfSingleChoice = bool3;
            this.hideTypeIfSingleChoice = bool4;
            this.allowedIdTypes = allowedIdTypes;
            this.label = str7;
            this.labelIdbCountry = str8;
            this.labelIdbType = str9;
            this.labelIdbValue = str10;
            this.placeholderIdbCountry = str11;
            this.placeholderIdbType = str12;
            this.placeholderIdbValue = str13;
            this.hidden = jsonLogicBoolean;
            this.disabled = jsonLogicBoolean2;
        }

        public final String getPrefillIdbCountry() {
            return this.prefillIdbCountry;
        }

        public final String getPrefillIdbType() {
            return this.prefillIdbType;
        }

        public final String getPrefillIdbValue() {
            return this.prefillIdbValue;
        }

        public final String getErrorIdbCountry() {
            return this.errorIdbCountry;
        }

        public final String getErrorIdbType() {
            return this.errorIdbType;
        }

        public final String getErrorIdbValue() {
            return this.errorIdbValue;
        }

        public final Boolean getHideCountryIfPrefilled() {
            return this.hideCountryIfPrefilled;
        }

        public final Boolean getHideTypeIfPrefilled() {
            return this.hideTypeIfPrefilled;
        }

        public final Boolean getHideCountryIfSingleChoice() {
            return this.hideCountryIfSingleChoice;
        }

        public final Boolean getHideTypeIfSingleChoice() {
            return this.hideTypeIfSingleChoice;
        }

        public final List<IdType> getAllowedIdTypes() {
            return this.allowedIdTypes;
        }

        public final String getLabel() {
            return this.label;
        }

        public final String getLabelIdbCountry() {
            return this.labelIdbCountry;
        }

        public final String getLabelIdbType() {
            return this.labelIdbType;
        }

        public final String getLabelIdbValue() {
            return this.labelIdbValue;
        }

        public final String getPlaceholderIdbCountry() {
            return this.placeholderIdbCountry;
        }

        public final String getPlaceholderIdbType() {
            return this.placeholderIdbType;
        }

        public final String getPlaceholderIdbValue() {
            return this.placeholderIdbValue;
        }

        public final JsonLogicBoolean getHidden() {
            return this.hidden;
        }

        public final JsonLogicBoolean getDisabled() {
            return this.disabled;
        }
    }

    /* compiled from: InputInternationalDb.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u0019\u001a\u00020\u001aJ\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001aR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000f¨\u0006 "}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputInternationalDb$IdType;", "Landroid/os/Parcelable;", "mask", "", "placeholder", "secure", "", "countryName", "countryCode", "idType", "name", "description", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMask", "()Ljava/lang/String;", "getPlaceholder", "getSecure", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getCountryName", "getCountryCode", "getIdType", "getName", "getDescription", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class IdType implements Parcelable {
        public static final Parcelable.Creator<IdType> CREATOR = new Creator();
        private final String countryCode;
        private final String countryName;
        private final String description;
        private final String idType;
        private final String mask;
        private final String name;
        private final String placeholder;
        private final Boolean secure;

        /* compiled from: InputInternationalDb.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<IdType> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IdType createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new IdType(string2, string3, boolValueOf, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IdType[] newArray(int i) {
                return new IdType[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            int iBooleanValue;
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.mask);
            dest.writeString(this.placeholder);
            Boolean bool = this.secure;
            if (bool == null) {
                iBooleanValue = 0;
            } else {
                dest.writeInt(1);
                iBooleanValue = bool.booleanValue();
            }
            dest.writeInt(iBooleanValue);
            dest.writeString(this.countryName);
            dest.writeString(this.countryCode);
            dest.writeString(this.idType);
            dest.writeString(this.name);
            dest.writeString(this.description);
        }

        public IdType(String str, String str2, Boolean bool, String str3, String str4, String str5, String str6, String str7) {
            this.mask = str;
            this.placeholder = str2;
            this.secure = bool;
            this.countryName = str3;
            this.countryCode = str4;
            this.idType = str5;
            this.name = str6;
            this.description = str7;
        }

        public final String getMask() {
            return this.mask;
        }

        public final String getPlaceholder() {
            return this.placeholder;
        }

        public final Boolean getSecure() {
            return this.secure;
        }

        public final String getCountryName() {
            return this.countryName;
        }

        public final String getCountryCode() {
            return this.countryCode;
        }

        public final String getIdType() {
            return this.idType;
        }

        public final String getName() {
            return this.name;
        }

        public final String getDescription() {
            return this.description;
        }
    }
}
