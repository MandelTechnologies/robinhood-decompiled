package com.withpersona.sdk2.inquiry.steps.p423ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.Json;
import com.squareup.workflow1.p415ui.TextController;
import com.squareup.workflow1.p415ui.TextController3;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.InputMaskedText;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.InputTextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.steps.p423ui.view.AssociatedHideableView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InputMaskedTextComponent.kt */
@Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u00022\u00020\u00032\u00020\u0004B5\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eB\u0011\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\r\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0017¢\u0006\u0004\b\u001c\u0010\u001dJH\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\"\u0010\u001dJ\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010!R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b*\u0010!R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b,\u0010-R\u001c\u0010\n\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b.\u0010-R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010/\u001a\u0004\b0\u00101R&\u00104\u001a\b\u0012\u0004\u0012\u000203028\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b4\u00105\u0012\u0004\b8\u00109\u001a\u0004\b6\u00107R(\u0010;\u001a\u00020:8\u0016@\u0016X\u0097\u000e¢\u0006\u0018\n\u0004\b;\u0010<\u0012\u0004\bA\u00109\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@¨\u0006B"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputMaskedTextComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/SingleTextValueComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/DisableableComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/HideableComponent;", "", "name", "value", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "hidden", "disabled", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;", "styles", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputMaskedText;", "config", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputMaskedText;)V", "newString", "update", "(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputMaskedTextComponent;", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputMaskedTextComponent;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "getValue", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getDisabled", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/view/AssociatedHideableView;", "associatedViews", "Ljava/util/List;", "getAssociatedViews", "()Ljava/util/List;", "getAssociatedViews$annotations", "()V", "Lcom/squareup/workflow1/ui/TextController;", "textController", "Lcom/squareup/workflow1/ui/TextController;", "getTextController", "()Lcom/squareup/workflow1/ui/TextController;", "setTextController", "(Lcom/squareup/workflow1/ui/TextController;)V", "getTextController$annotations", "ui-step-renderer_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class InputMaskedTextComponent implements UiComponent, SingleTextValueComponent<InputMaskedTextComponent>, UiComponentAttributes2, UiComponentAttributes3 {
    public static final Parcelable.Creator<InputMaskedTextComponent> CREATOR = new Creator();
    private final List<AssociatedHideableView> associatedViews;
    private final JsonLogicBoolean disabled;
    private final JsonLogicBoolean hidden;
    private final String name;
    private final InputTextBasedComponentStyle styles;
    private TextController textController;
    private final String value;

    /* compiled from: InputMaskedTextComponent.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<InputMaskedTextComponent> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InputMaskedTextComponent createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InputMaskedTextComponent(parcel.readString(), parcel.readString(), (JsonLogicBoolean) parcel.readParcelable(InputMaskedTextComponent.class.getClassLoader()), (JsonLogicBoolean) parcel.readParcelable(InputMaskedTextComponent.class.getClassLoader()), (InputTextBasedComponentStyle) parcel.readParcelable(InputMaskedTextComponent.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InputMaskedTextComponent[] newArray(int i) {
            return new InputMaskedTextComponent[i];
        }
    }

    public static /* synthetic */ InputMaskedTextComponent copy$default(InputMaskedTextComponent inputMaskedTextComponent, String str, String str2, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, InputTextBasedComponentStyle inputTextBasedComponentStyle, int i, Object obj) {
        if ((i & 1) != 0) {
            str = inputMaskedTextComponent.name;
        }
        if ((i & 2) != 0) {
            str2 = inputMaskedTextComponent.value;
        }
        if ((i & 4) != 0) {
            jsonLogicBoolean = inputMaskedTextComponent.hidden;
        }
        if ((i & 8) != 0) {
            jsonLogicBoolean2 = inputMaskedTextComponent.disabled;
        }
        if ((i & 16) != 0) {
            inputTextBasedComponentStyle = inputMaskedTextComponent.styles;
        }
        InputTextBasedComponentStyle inputTextBasedComponentStyle2 = inputTextBasedComponentStyle;
        JsonLogicBoolean jsonLogicBoolean3 = jsonLogicBoolean;
        return inputMaskedTextComponent.copy(str, str2, jsonLogicBoolean3, jsonLogicBoolean2, inputTextBasedComponentStyle2);
    }

    @Json(ignore = true)
    public static /* synthetic */ void getTextController$annotations() {
    }

    public final InputMaskedTextComponent copy(String name, String value, JsonLogicBoolean hidden, JsonLogicBoolean disabled, InputTextBasedComponentStyle styles) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        return new InputMaskedTextComponent(name, value, hidden, disabled, styles);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InputMaskedTextComponent)) {
            return false;
        }
        InputMaskedTextComponent inputMaskedTextComponent = (InputMaskedTextComponent) other;
        return Intrinsics.areEqual(this.name, inputMaskedTextComponent.name) && Intrinsics.areEqual(this.value, inputMaskedTextComponent.value) && Intrinsics.areEqual(this.hidden, inputMaskedTextComponent.hidden) && Intrinsics.areEqual(this.disabled, inputMaskedTextComponent.disabled) && Intrinsics.areEqual(this.styles, inputMaskedTextComponent.styles);
    }

    public int hashCode() {
        int iHashCode = ((this.name.hashCode() * 31) + this.value.hashCode()) * 31;
        JsonLogicBoolean jsonLogicBoolean = this.hidden;
        int iHashCode2 = (iHashCode + (jsonLogicBoolean == null ? 0 : jsonLogicBoolean.hashCode())) * 31;
        JsonLogicBoolean jsonLogicBoolean2 = this.disabled;
        int iHashCode3 = (iHashCode2 + (jsonLogicBoolean2 == null ? 0 : jsonLogicBoolean2.hashCode())) * 31;
        InputTextBasedComponentStyle inputTextBasedComponentStyle = this.styles;
        return iHashCode3 + (inputTextBasedComponentStyle != null ? inputTextBasedComponentStyle.hashCode() : 0);
    }

    public String toString() {
        return "InputMaskedTextComponent(name=" + this.name + ", value=" + this.value + ", hidden=" + this.hidden + ", disabled=" + this.disabled + ", styles=" + this.styles + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.name);
        dest.writeString(this.value);
        dest.writeParcelable(this.hidden, flags);
        dest.writeParcelable(this.disabled, flags);
        dest.writeParcelable(this.styles, flags);
    }

    public InputMaskedTextComponent(String name, String value, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, InputTextBasedComponentStyle inputTextBasedComponentStyle) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.name = name;
        this.value = value;
        this.hidden = jsonLogicBoolean;
        this.disabled = jsonLogicBoolean2;
        this.styles = inputTextBasedComponentStyle;
        this.associatedViews = new ArrayList();
        this.textController = TextController3.TextController(value);
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p423ui.components.UiComponent
    public String getName() {
        return this.name;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p423ui.components.UiComponentAttributes3
    public JsonLogicBoolean getHidden() {
        return this.hidden;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p423ui.components.UiComponentAttributes2
    public JsonLogicBoolean getDisabled() {
        return this.disabled;
    }

    public final InputTextBasedComponentStyle getStyles() {
        return this.styles;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p423ui.components.UiComponentAttributes3
    public List<AssociatedHideableView> getAssociatedViews() {
        return this.associatedViews;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p423ui.components.SingleTextValueComponent
    public TextController getTextController() {
        return this.textController;
    }

    public void setTextController(TextController textController) {
        Intrinsics.checkNotNullParameter(textController, "<set-?>");
        this.textController = textController;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public InputMaskedTextComponent(InputMaskedText config) {
        String prefill;
        Intrinsics.checkNotNullParameter(config, "config");
        String name = config.getName();
        InputMaskedText.Attributes attributes = config.getAttributes();
        String str = (attributes == null || (prefill = attributes.getPrefill()) == null) ? "" : prefill;
        InputMaskedText.Attributes attributes2 = config.getAttributes();
        JsonLogicBoolean hidden = attributes2 != null ? attributes2.getHidden() : null;
        InputMaskedText.Attributes attributes3 = config.getAttributes();
        this(name, str, hidden, attributes3 != null ? attributes3.getDisabled() : null, config.getStyles());
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p423ui.components.SingleTextValueComponent
    public InputMaskedTextComponent update(String newString) {
        Intrinsics.checkNotNullParameter(newString, "newString");
        InputMaskedTextComponent inputMaskedTextComponentCopy$default = copy$default(this, null, newString, null, null, null, 29, null);
        inputMaskedTextComponentCopy$default.setTextController(getTextController());
        return inputMaskedTextComponentCopy$default;
    }
}
