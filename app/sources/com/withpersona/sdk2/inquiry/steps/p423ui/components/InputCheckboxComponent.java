package com.withpersona.sdk2.inquiry.steps.p423ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.Json;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.InputCheckbox;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.utils.TwoStateViewController;
import com.withpersona.sdk2.inquiry.steps.p423ui.view.AssociatedHideableView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InputCheckboxComponent.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u00022\u00020\u00032\u00020\u0004B+\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rB\u001b\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ<\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b!\u0010\u001cJ\u001a\u0010$\u001a\u00020\u00072\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010 R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b)\u0010*R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b,\u0010-R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b.\u0010-R&\u00101\u001a\b\u0012\u0004\u0012\u0002000/8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b1\u00102\u0012\u0004\b5\u00106\u001a\u0004\b3\u00104R(\u00108\u001a\u0002078\u0016@\u0016X\u0097\u000e¢\u0006\u0018\n\u0004\b8\u00109\u0012\u0004\b>\u00106\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=¨\u0006?"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCheckboxComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/SingleBooleanValueComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/DisableableComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/HideableComponent;", "", "name", "", "value", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "hidden", "disabled", "<init>", "(Ljava/lang/String;ZLcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCheckbox;", "config", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCheckbox;Z)V", "newValue", "update", "(Z)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCheckboxComponent;", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "copy", "(Ljava/lang/String;ZLcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCheckboxComponent;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "Z", "getValue", "()Z", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getDisabled", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/view/AssociatedHideableView;", "associatedViews", "Ljava/util/List;", "getAssociatedViews", "()Ljava/util/List;", "getAssociatedViews$annotations", "()V", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/utils/TwoStateViewController;", "twoStateViewController", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/utils/TwoStateViewController;", "getTwoStateViewController", "()Lcom/withpersona/sdk2/inquiry/steps/ui/components/utils/TwoStateViewController;", "setTwoStateViewController", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/utils/TwoStateViewController;)V", "getTwoStateViewController$annotations", "ui-step-renderer_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class InputCheckboxComponent implements UiComponent, SingleBooleanValueComponent<InputCheckboxComponent>, UiComponentAttributes2, UiComponentAttributes3 {
    public static final Parcelable.Creator<InputCheckboxComponent> CREATOR = new Creator();
    private final List<AssociatedHideableView> associatedViews;
    private final JsonLogicBoolean disabled;
    private final JsonLogicBoolean hidden;
    private final String name;
    private TwoStateViewController twoStateViewController;
    private final boolean value;

    /* compiled from: InputCheckboxComponent.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<InputCheckboxComponent> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InputCheckboxComponent createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InputCheckboxComponent(parcel.readString(), parcel.readInt() != 0, (JsonLogicBoolean) parcel.readParcelable(InputCheckboxComponent.class.getClassLoader()), (JsonLogicBoolean) parcel.readParcelable(InputCheckboxComponent.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InputCheckboxComponent[] newArray(int i) {
            return new InputCheckboxComponent[i];
        }
    }

    public static /* synthetic */ InputCheckboxComponent copy$default(InputCheckboxComponent inputCheckboxComponent, String str, boolean z, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = inputCheckboxComponent.name;
        }
        if ((i & 2) != 0) {
            z = inputCheckboxComponent.value;
        }
        if ((i & 4) != 0) {
            jsonLogicBoolean = inputCheckboxComponent.hidden;
        }
        if ((i & 8) != 0) {
            jsonLogicBoolean2 = inputCheckboxComponent.disabled;
        }
        return inputCheckboxComponent.copy(str, z, jsonLogicBoolean, jsonLogicBoolean2);
    }

    @Json(ignore = true)
    public static /* synthetic */ void getTwoStateViewController$annotations() {
    }

    public final InputCheckboxComponent copy(String name, boolean value, JsonLogicBoolean hidden, JsonLogicBoolean disabled) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new InputCheckboxComponent(name, value, hidden, disabled);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InputCheckboxComponent)) {
            return false;
        }
        InputCheckboxComponent inputCheckboxComponent = (InputCheckboxComponent) other;
        return Intrinsics.areEqual(this.name, inputCheckboxComponent.name) && this.value == inputCheckboxComponent.value && Intrinsics.areEqual(this.hidden, inputCheckboxComponent.hidden) && Intrinsics.areEqual(this.disabled, inputCheckboxComponent.disabled);
    }

    public int hashCode() {
        int iHashCode = ((this.name.hashCode() * 31) + Boolean.hashCode(this.value)) * 31;
        JsonLogicBoolean jsonLogicBoolean = this.hidden;
        int iHashCode2 = (iHashCode + (jsonLogicBoolean == null ? 0 : jsonLogicBoolean.hashCode())) * 31;
        JsonLogicBoolean jsonLogicBoolean2 = this.disabled;
        return iHashCode2 + (jsonLogicBoolean2 != null ? jsonLogicBoolean2.hashCode() : 0);
    }

    public String toString() {
        return "InputCheckboxComponent(name=" + this.name + ", value=" + this.value + ", hidden=" + this.hidden + ", disabled=" + this.disabled + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.name);
        dest.writeInt(this.value ? 1 : 0);
        dest.writeParcelable(this.hidden, flags);
        dest.writeParcelable(this.disabled, flags);
    }

    public InputCheckboxComponent(String name, boolean z, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.value = z;
        this.hidden = jsonLogicBoolean;
        this.disabled = jsonLogicBoolean2;
        this.associatedViews = new ArrayList();
        this.twoStateViewController = new TwoStateViewController(z);
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

    @Override // com.withpersona.sdk2.inquiry.steps.p423ui.components.SingleBooleanValueComponent
    public TwoStateViewController getTwoStateViewController() {
        return this.twoStateViewController;
    }

    public void setTwoStateViewController(TwoStateViewController twoStateViewController) {
        Intrinsics.checkNotNullParameter(twoStateViewController, "<set-?>");
        this.twoStateViewController = twoStateViewController;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ InputCheckboxComponent(InputCheckbox inputCheckbox, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Boolean prefill;
        if ((i & 2) != 0) {
            InputCheckbox.Attributes attributes = inputCheckbox.getAttributes();
            z = (attributes == null || (prefill = attributes.getPrefill()) == null) ? false : prefill.booleanValue();
        }
        this(inputCheckbox, z);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public InputCheckboxComponent(InputCheckbox config, boolean z) {
        Intrinsics.checkNotNullParameter(config, "config");
        String name = config.getName();
        InputCheckbox.Attributes attributes = config.getAttributes();
        JsonLogicBoolean hidden = attributes != null ? attributes.getHidden() : null;
        InputCheckbox.Attributes attributes2 = config.getAttributes();
        this(name, z, hidden, attributes2 != null ? attributes2.getDisabled() : null);
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p423ui.components.SingleBooleanValueComponent
    public InputCheckboxComponent update(boolean newValue) {
        InputCheckboxComponent inputCheckboxComponentCopy$default = copy$default(this, null, newValue, null, null, 13, null);
        inputCheckboxComponentCopy$default.setTwoStateViewController(getTwoStateViewController());
        return inputCheckboxComponentCopy$default;
    }
}
