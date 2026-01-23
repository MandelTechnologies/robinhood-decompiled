package com.withpersona.sdk2.inquiry.steps.p423ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.Json;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.InputCurrency;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.InputTextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.utils.NumberController;
import com.withpersona.sdk2.inquiry.steps.p423ui.view.AssociatedHideableView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InputCurrencyComponent.kt */
@Metadata(m3635d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0004\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u00022\u00020\u00032\u00020\u0004B7\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fB\u0011\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u000e\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0018¢\u0006\u0004\b\u001d\u0010\u001eJJ\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b#\u0010\u001eJ\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010\"R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b,\u0010-R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b/\u00100R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010.\u001a\u0004\b1\u00100R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u00102\u001a\u0004\b3\u00104R&\u00107\u001a\b\u0012\u0004\u0012\u000206058\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b7\u00108\u0012\u0004\b;\u0010<\u001a\u0004\b9\u0010:R(\u0010>\u001a\u00020=8\u0016@\u0016X\u0097\u000e¢\u0006\u0018\n\u0004\b>\u0010?\u0012\u0004\bD\u0010<\u001a\u0004\b@\u0010A\"\u0004\bB\u0010C¨\u0006E"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCurrencyComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/SingleNumberValueComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/DisableableComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/HideableComponent;", "", "name", "", "value", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "hidden", "disabled", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "errorTextStyle", "<init>", "(Ljava/lang/String;Ljava/lang/Number;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCurrency;", "config", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCurrency;)V", "newValue", "update", "(Ljava/lang/Number;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCurrencyComponent;", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "copy", "(Ljava/lang/String;Ljava/lang/Number;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCurrencyComponent;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "Ljava/lang/Number;", "getValue", "()Ljava/lang/Number;", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getDisabled", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "getErrorTextStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/view/AssociatedHideableView;", "associatedViews", "Ljava/util/List;", "getAssociatedViews", "()Ljava/util/List;", "getAssociatedViews$annotations", "()V", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/utils/NumberController;", "numberController", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/utils/NumberController;", "getNumberController", "()Lcom/withpersona/sdk2/inquiry/steps/ui/components/utils/NumberController;", "setNumberController", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/utils/NumberController;)V", "getNumberController$annotations", "ui-step-renderer_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class InputCurrencyComponent implements UiComponent, SingleNumberValueComponent<InputCurrencyComponent>, UiComponentAttributes2, UiComponentAttributes3 {
    public static final Parcelable.Creator<InputCurrencyComponent> CREATOR = new Creator();
    private final List<AssociatedHideableView> associatedViews;
    private final JsonLogicBoolean disabled;
    private final TextBasedComponentStyle errorTextStyle;
    private final JsonLogicBoolean hidden;
    private final String name;
    private NumberController numberController;
    private final Number value;

    /* compiled from: InputCurrencyComponent.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<InputCurrencyComponent> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InputCurrencyComponent createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InputCurrencyComponent(parcel.readString(), (Number) parcel.readSerializable(), (JsonLogicBoolean) parcel.readParcelable(InputCurrencyComponent.class.getClassLoader()), (JsonLogicBoolean) parcel.readParcelable(InputCurrencyComponent.class.getClassLoader()), (TextBasedComponentStyle) parcel.readParcelable(InputCurrencyComponent.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InputCurrencyComponent[] newArray(int i) {
            return new InputCurrencyComponent[i];
        }
    }

    public static /* synthetic */ InputCurrencyComponent copy$default(InputCurrencyComponent inputCurrencyComponent, String str, Number number, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, TextBasedComponentStyle textBasedComponentStyle, int i, Object obj) {
        if ((i & 1) != 0) {
            str = inputCurrencyComponent.name;
        }
        if ((i & 2) != 0) {
            number = inputCurrencyComponent.value;
        }
        if ((i & 4) != 0) {
            jsonLogicBoolean = inputCurrencyComponent.hidden;
        }
        if ((i & 8) != 0) {
            jsonLogicBoolean2 = inputCurrencyComponent.disabled;
        }
        if ((i & 16) != 0) {
            textBasedComponentStyle = inputCurrencyComponent.errorTextStyle;
        }
        TextBasedComponentStyle textBasedComponentStyle2 = textBasedComponentStyle;
        JsonLogicBoolean jsonLogicBoolean3 = jsonLogicBoolean;
        return inputCurrencyComponent.copy(str, number, jsonLogicBoolean3, jsonLogicBoolean2, textBasedComponentStyle2);
    }

    @Json(ignore = true)
    public static /* synthetic */ void getNumberController$annotations() {
    }

    public final InputCurrencyComponent copy(String name, Number value, JsonLogicBoolean hidden, JsonLogicBoolean disabled, TextBasedComponentStyle errorTextStyle) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new InputCurrencyComponent(name, value, hidden, disabled, errorTextStyle);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InputCurrencyComponent)) {
            return false;
        }
        InputCurrencyComponent inputCurrencyComponent = (InputCurrencyComponent) other;
        return Intrinsics.areEqual(this.name, inputCurrencyComponent.name) && Intrinsics.areEqual(this.value, inputCurrencyComponent.value) && Intrinsics.areEqual(this.hidden, inputCurrencyComponent.hidden) && Intrinsics.areEqual(this.disabled, inputCurrencyComponent.disabled) && Intrinsics.areEqual(this.errorTextStyle, inputCurrencyComponent.errorTextStyle);
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        Number number = this.value;
        int iHashCode2 = (iHashCode + (number == null ? 0 : number.hashCode())) * 31;
        JsonLogicBoolean jsonLogicBoolean = this.hidden;
        int iHashCode3 = (iHashCode2 + (jsonLogicBoolean == null ? 0 : jsonLogicBoolean.hashCode())) * 31;
        JsonLogicBoolean jsonLogicBoolean2 = this.disabled;
        int iHashCode4 = (iHashCode3 + (jsonLogicBoolean2 == null ? 0 : jsonLogicBoolean2.hashCode())) * 31;
        TextBasedComponentStyle textBasedComponentStyle = this.errorTextStyle;
        return iHashCode4 + (textBasedComponentStyle != null ? textBasedComponentStyle.hashCode() : 0);
    }

    public String toString() {
        return "InputCurrencyComponent(name=" + this.name + ", value=" + this.value + ", hidden=" + this.hidden + ", disabled=" + this.disabled + ", errorTextStyle=" + this.errorTextStyle + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.name);
        dest.writeSerializable(this.value);
        dest.writeParcelable(this.hidden, flags);
        dest.writeParcelable(this.disabled, flags);
        dest.writeParcelable(this.errorTextStyle, flags);
    }

    public InputCurrencyComponent(String name, Number number, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, TextBasedComponentStyle textBasedComponentStyle) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.value = number;
        this.hidden = jsonLogicBoolean;
        this.disabled = jsonLogicBoolean2;
        this.errorTextStyle = textBasedComponentStyle;
        this.associatedViews = new ArrayList();
        this.numberController = new NumberController(number);
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p423ui.components.UiComponent
    public String getName() {
        return this.name;
    }

    public final Number getValue() {
        return this.value;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p423ui.components.UiComponentAttributes3
    public JsonLogicBoolean getHidden() {
        return this.hidden;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p423ui.components.UiComponentAttributes2
    public JsonLogicBoolean getDisabled() {
        return this.disabled;
    }

    public final TextBasedComponentStyle getErrorTextStyle() {
        return this.errorTextStyle;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p423ui.components.UiComponentAttributes3
    public List<AssociatedHideableView> getAssociatedViews() {
        return this.associatedViews;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p423ui.components.SingleNumberValueComponent
    public NumberController getNumberController() {
        return this.numberController;
    }

    public void setNumberController(NumberController numberController) {
        Intrinsics.checkNotNullParameter(numberController, "<set-?>");
        this.numberController = numberController;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public InputCurrencyComponent(InputCurrency config) {
        Intrinsics.checkNotNullParameter(config, "config");
        String name = config.getName();
        InputCurrency.Attributes attributes = config.getAttributes();
        Number prefill = attributes != null ? attributes.getPrefill() : null;
        InputCurrency.Attributes attributes2 = config.getAttributes();
        JsonLogicBoolean hidden = attributes2 != null ? attributes2.getHidden() : null;
        InputCurrency.Attributes attributes3 = config.getAttributes();
        JsonLogicBoolean disabled = attributes3 != null ? attributes3.getDisabled() : null;
        InputTextBasedComponentStyle styles = config.getStyles();
        this(name, prefill, hidden, disabled, styles != null ? styles.getErrorTextStyle() : null);
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p423ui.components.SingleNumberValueComponent
    public InputCurrencyComponent update(Number newValue) {
        InputCurrencyComponent inputCurrencyComponentCopy$default = copy$default(this, null, newValue, null, null, null, 29, null);
        inputCurrencyComponentCopy$default.setNumberController(getNumberController());
        return inputCurrencyComponentCopy$default;
    }
}
