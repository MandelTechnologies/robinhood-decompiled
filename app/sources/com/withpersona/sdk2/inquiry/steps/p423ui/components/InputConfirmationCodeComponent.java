package com.withpersona.sdk2.inquiry.steps.p423ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.Json;
import com.squareup.workflow1.p415ui.TextController;
import com.squareup.workflow1.p415ui.TextController3;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.InputConfirmationCode;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.utils.inputConfirmation.SubmitConfirmationCodeHelper;
import com.withpersona.sdk2.inquiry.steps.p423ui.view.AssociatedHideableView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InputConfirmationCodeComponent.kt */
@Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u00022\u00020\u00032\u00020\u0004B+\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fB\u0011\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000b\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0015¢\u0006\u0004\b\u001a\u0010\u001bJ<\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b \u0010\u001bJ\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b(\u0010\u001fR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b*\u0010+R\u001c\u0010\n\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b,\u0010+R&\u0010/\u001a\b\u0012\u0004\u0012\u00020.0-8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b/\u00100\u0012\u0004\b3\u00104\u001a\u0004\b1\u00102R(\u00106\u001a\u0002058\u0016@\u0016X\u0097\u000e¢\u0006\u0018\n\u0004\b6\u00107\u0012\u0004\b<\u00104\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001d\u0010>\u001a\u00020=8\u0006¢\u0006\u0012\n\u0004\b>\u0010?\u0012\u0004\bB\u00104\u001a\u0004\b@\u0010A¨\u0006C"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputConfirmationCodeComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/SingleTextValueComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/DisableableComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/HideableComponent;", "", "name", "value", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "hidden", "disabled", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputConfirmationCode;", "config", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputConfirmationCode;)V", "newString", "update", "(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputConfirmationCodeComponent;", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputConfirmationCodeComponent;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "getValue", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getDisabled", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/view/AssociatedHideableView;", "associatedViews", "Ljava/util/List;", "getAssociatedViews", "()Ljava/util/List;", "getAssociatedViews$annotations", "()V", "Lcom/squareup/workflow1/ui/TextController;", "textController", "Lcom/squareup/workflow1/ui/TextController;", "getTextController", "()Lcom/squareup/workflow1/ui/TextController;", "setTextController", "(Lcom/squareup/workflow1/ui/TextController;)V", "getTextController$annotations", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/utils/inputConfirmation/SubmitConfirmationCodeHelper;", "submitCodeHelper", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/utils/inputConfirmation/SubmitConfirmationCodeHelper;", "getSubmitCodeHelper", "()Lcom/withpersona/sdk2/inquiry/steps/ui/components/utils/inputConfirmation/SubmitConfirmationCodeHelper;", "getSubmitCodeHelper$annotations", "ui-step-renderer_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class InputConfirmationCodeComponent implements UiComponent, SingleTextValueComponent<InputConfirmationCodeComponent>, UiComponentAttributes2, UiComponentAttributes3 {
    public static final Parcelable.Creator<InputConfirmationCodeComponent> CREATOR = new Creator();
    private final List<AssociatedHideableView> associatedViews;
    private final JsonLogicBoolean disabled;
    private final JsonLogicBoolean hidden;
    private final String name;
    private final SubmitConfirmationCodeHelper submitCodeHelper;
    private TextController textController;
    private final String value;

    /* compiled from: InputConfirmationCodeComponent.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<InputConfirmationCodeComponent> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InputConfirmationCodeComponent createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InputConfirmationCodeComponent(parcel.readString(), parcel.readString(), (JsonLogicBoolean) parcel.readParcelable(InputConfirmationCodeComponent.class.getClassLoader()), (JsonLogicBoolean) parcel.readParcelable(InputConfirmationCodeComponent.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InputConfirmationCodeComponent[] newArray(int i) {
            return new InputConfirmationCodeComponent[i];
        }
    }

    public static /* synthetic */ InputConfirmationCodeComponent copy$default(InputConfirmationCodeComponent inputConfirmationCodeComponent, String str, String str2, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = inputConfirmationCodeComponent.name;
        }
        if ((i & 2) != 0) {
            str2 = inputConfirmationCodeComponent.value;
        }
        if ((i & 4) != 0) {
            jsonLogicBoolean = inputConfirmationCodeComponent.hidden;
        }
        if ((i & 8) != 0) {
            jsonLogicBoolean2 = inputConfirmationCodeComponent.disabled;
        }
        return inputConfirmationCodeComponent.copy(str, str2, jsonLogicBoolean, jsonLogicBoolean2);
    }

    @Json(ignore = true)
    public static /* synthetic */ void getTextController$annotations() {
    }

    public final InputConfirmationCodeComponent copy(String name, String value, JsonLogicBoolean hidden, JsonLogicBoolean disabled) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        return new InputConfirmationCodeComponent(name, value, hidden, disabled);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InputConfirmationCodeComponent)) {
            return false;
        }
        InputConfirmationCodeComponent inputConfirmationCodeComponent = (InputConfirmationCodeComponent) other;
        return Intrinsics.areEqual(this.name, inputConfirmationCodeComponent.name) && Intrinsics.areEqual(this.value, inputConfirmationCodeComponent.value) && Intrinsics.areEqual(this.hidden, inputConfirmationCodeComponent.hidden) && Intrinsics.areEqual(this.disabled, inputConfirmationCodeComponent.disabled);
    }

    public int hashCode() {
        int iHashCode = ((this.name.hashCode() * 31) + this.value.hashCode()) * 31;
        JsonLogicBoolean jsonLogicBoolean = this.hidden;
        int iHashCode2 = (iHashCode + (jsonLogicBoolean == null ? 0 : jsonLogicBoolean.hashCode())) * 31;
        JsonLogicBoolean jsonLogicBoolean2 = this.disabled;
        return iHashCode2 + (jsonLogicBoolean2 != null ? jsonLogicBoolean2.hashCode() : 0);
    }

    public String toString() {
        return "InputConfirmationCodeComponent(name=" + this.name + ", value=" + this.value + ", hidden=" + this.hidden + ", disabled=" + this.disabled + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.name);
        dest.writeString(this.value);
        dest.writeParcelable(this.hidden, flags);
        dest.writeParcelable(this.disabled, flags);
    }

    public InputConfirmationCodeComponent(String name, String value, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.name = name;
        this.value = value;
        this.hidden = jsonLogicBoolean;
        this.disabled = jsonLogicBoolean2;
        this.associatedViews = new ArrayList();
        this.textController = TextController3.TextController(value);
        this.submitCodeHelper = new SubmitConfirmationCodeHelper();
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

    public final SubmitConfirmationCodeHelper getSubmitCodeHelper() {
        return this.submitCodeHelper;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public InputConfirmationCodeComponent(InputConfirmationCode config) {
        Intrinsics.checkNotNullParameter(config, "config");
        String name = config.getName();
        InputConfirmationCode.Attributes attributes = config.getAttributes();
        String prefill = (attributes == null || (prefill = attributes.getPrefill()) == null) ? "" : prefill;
        InputConfirmationCode.Attributes attributes2 = config.getAttributes();
        JsonLogicBoolean hidden = attributes2 != null ? attributes2.getHidden() : null;
        InputConfirmationCode.Attributes attributes3 = config.getAttributes();
        this(name, prefill, hidden, attributes3 != null ? attributes3.getDisabled() : null);
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p423ui.components.SingleTextValueComponent
    public InputConfirmationCodeComponent update(String newString) {
        Intrinsics.checkNotNullParameter(newString, "newString");
        InputConfirmationCodeComponent inputConfirmationCodeComponentCopy$default = copy$default(this, null, newString, null, null, 13, null);
        inputConfirmationCodeComponentCopy$default.setTextController(getTextController());
        return inputConfirmationCodeComponentCopy$default;
    }
}
