package com.withpersona.sdk2.inquiry.network.dto.p421ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.JsonClass;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.BaseButtonAttributes2;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.ButtonComponentStyling8;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Button.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0011R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0018"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/SubmitButton;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Button;", "name", "", "attributes", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/BasicButtonAttributes;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonSubmitComponentStyle;", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/BasicButtonAttributes;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonSubmitComponentStyle;)V", "getName", "()Ljava/lang/String;", "getAttributes", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/BasicButtonAttributes;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonSubmitComponentStyle;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "network-inquiry_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class SubmitButton implements Button {

    /* renamed from: type, reason: collision with root package name */
    public static final String f10660type = "button_submit";
    private final BaseButtonAttributes2 attributes;
    private final String name;
    private final ButtonComponentStyling8 styles;
    public static final Parcelable.Creator<SubmitButton> CREATOR = new Creator();

    /* compiled from: Button.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<SubmitButton> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SubmitButton createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SubmitButton(parcel.readString(), parcel.readInt() == 0 ? null : BaseButtonAttributes2.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ButtonComponentStyling8.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SubmitButton[] newArray(int i) {
            return new SubmitButton[i];
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
        BaseButtonAttributes2 baseButtonAttributes2 = this.attributes;
        if (baseButtonAttributes2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            baseButtonAttributes2.writeToParcel(dest, flags);
        }
        ButtonComponentStyling8 buttonComponentStyling8 = this.styles;
        if (buttonComponentStyling8 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            buttonComponentStyling8.writeToParcel(dest, flags);
        }
    }

    public SubmitButton(String name, BaseButtonAttributes2 baseButtonAttributes2, ButtonComponentStyling8 buttonComponentStyling8) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.attributes = baseButtonAttributes2;
        this.styles = buttonComponentStyling8;
    }

    public /* synthetic */ SubmitButton(String str, BaseButtonAttributes2 baseButtonAttributes2, ButtonComponentStyling8 buttonComponentStyling8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, baseButtonAttributes2, (i & 4) != 0 ? null : buttonComponentStyling8);
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.p421ui.components.UiComponentConfig
    public String getName() {
        return this.name;
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.p421ui.components.UiComponentConfig
    public BaseButtonAttributes2 getAttributes() {
        return this.attributes;
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.p421ui.components.Button
    public ButtonComponentStyling8 getStyles() {
        return this.styles;
    }
}
