package com.withpersona.sdk2.inquiry.network.dto.p421ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.JsonClass;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.BaseButtonAttributes;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.Button;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.ButtonComponentStyling9;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Button.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0002\u0017\u0018B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0011R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/VerifyPersonaButton;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Button;", "name", "", "attributes", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/VerifyPersonaButton$Attributes;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonVerifyPersonaComponentStyle;", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/VerifyPersonaButton$Attributes;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonVerifyPersonaComponentStyle;)V", "getName", "()Ljava/lang/String;", "getAttributes", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/VerifyPersonaButton$Attributes;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonVerifyPersonaComponentStyle;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "Attributes", "network-inquiry_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class VerifyPersonaButton implements Button {

    /* renamed from: type, reason: collision with root package name */
    public static final String f10663type = "button_verify_with_persona";
    private final Attributes attributes;
    private final String name;
    private final ButtonComponentStyling9 styles;
    public static final Parcelable.Creator<VerifyPersonaButton> CREATOR = new Creator();

    /* compiled from: Button.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<VerifyPersonaButton> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VerifyPersonaButton createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new VerifyPersonaButton(parcel.readString(), parcel.readInt() == 0 ? null : Attributes.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ButtonComponentStyling9.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VerifyPersonaButton[] newArray(int i) {
            return new VerifyPersonaButton[i];
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
        ButtonComponentStyling9 buttonComponentStyling9 = this.styles;
        if (buttonComponentStyling9 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            buttonComponentStyling9.writeToParcel(dest, flags);
        }
    }

    public VerifyPersonaButton(String name, Attributes attributes, ButtonComponentStyling9 buttonComponentStyling9) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.attributes = attributes;
        this.styles = buttonComponentStyling9;
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.p421ui.components.UiComponentConfig
    public String getName() {
        return this.name;
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.p421ui.components.UiComponentConfig
    public Attributes getAttributes() {
        return this.attributes;
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.p421ui.components.Button
    public ButtonComponentStyling9 getStyles() {
        return this.styles;
    }

    /* compiled from: Button.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010\u001b\u001a\u00020\bJ\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\f\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019¨\u0006!"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/VerifyPersonaButton$Attributes;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/BaseButtonAttributes;", "text", "", "buttonType", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Button$ButtonType;", "autoSubmitCountdownText", "autoSubmitIntervalSeconds", "", "url", "hidden", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "disabled", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Button$ButtonType;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;)V", "getText", "()Ljava/lang/String;", "getButtonType", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Button$ButtonType;", "getAutoSubmitCountdownText", "getAutoSubmitIntervalSeconds", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getUrl", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getDisabled", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Attributes implements BaseButtonAttributes {
        public static final Parcelable.Creator<Attributes> CREATOR = new Creator();
        private final String autoSubmitCountdownText;
        private final Integer autoSubmitIntervalSeconds;
        private final Button.ButtonType buttonType;
        private final JsonLogicBoolean disabled;
        private final JsonLogicBoolean hidden;
        private final String text;
        private final String url;

        /* compiled from: Button.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Attributes> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Attributes createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Attributes(parcel.readString(), parcel.readInt() == 0 ? null : Button.ButtonType.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() == 0 ? null : JsonLogicBoolean.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? JsonLogicBoolean.CREATOR.createFromParcel(parcel) : null);
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
            dest.writeString(this.text);
            Button.ButtonType buttonType = this.buttonType;
            if (buttonType == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(buttonType.name());
            }
            dest.writeString(this.autoSubmitCountdownText);
            Integer num = this.autoSubmitIntervalSeconds;
            if (num == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(num.intValue());
            }
            dest.writeString(this.url);
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

        public Attributes(String text, Button.ButtonType buttonType, String str, Integer num, String str2, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
            this.buttonType = buttonType;
            this.autoSubmitCountdownText = str;
            this.autoSubmitIntervalSeconds = num;
            this.url = str2;
            this.hidden = jsonLogicBoolean;
            this.disabled = jsonLogicBoolean2;
        }

        public /* synthetic */ Attributes(String str, Button.ButtonType buttonType, String str2, Integer num, String str3, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, buttonType, str2, num, str3, (i & 32) != 0 ? null : jsonLogicBoolean, (i & 64) != 0 ? null : jsonLogicBoolean2);
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.p421ui.BaseButtonAttributes
        public String getText() {
            return this.text;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.p421ui.BaseButtonAttributes
        public Button.ButtonType getButtonType() {
            return this.buttonType;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.p421ui.BaseButtonAttributes
        public String getAutoSubmitCountdownText() {
            return this.autoSubmitCountdownText;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.p421ui.BaseButtonAttributes
        public Integer getAutoSubmitIntervalSeconds() {
            return this.autoSubmitIntervalSeconds;
        }

        public final String getUrl() {
            return this.url;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.p421ui.BaseButtonAttributes
        public JsonLogicBoolean getHidden() {
            return this.hidden;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.p421ui.BaseButtonAttributes
        public JsonLogicBoolean getDisabled() {
            return this.disabled;
        }
    }
}
