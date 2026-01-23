package com.withpersona.sdk2.inquiry.steps.p423ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.EnumC7081g;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.InputGroup3;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.InputSelect;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.InputSelectComponentStyle;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.utils.SelectedOptionsController;
import com.withpersona.sdk2.inquiry.steps.p423ui.view.AssociatedHideableView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: InputSelectComponent.kt */
@Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u0000 L2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001LB]\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0015\u001a\u00020\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0019¢\u0006\u0004\b\u001e\u0010\u001fJv\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b$\u0010\u001fJ\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010#R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b-\u0010.R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010/\u001a\u0004\b0\u00101R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u00102\u001a\u0004\b3\u00104R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u00102\u001a\u0004\b5\u00104R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010*\u001a\u0004\b6\u0010#R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010*\u001a\u0004\b7\u0010#R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010/\u001a\u0004\b8\u00101R&\u0010;\u001a\b\u0012\u0004\u0012\u00020:098\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b;\u0010/\u0012\u0004\b=\u0010>\u001a\u0004\b<\u00101R \u0010?\u001a\u00020'8\u0016X\u0096D¢\u0006\u0012\n\u0004\b?\u0010@\u0012\u0004\bC\u0010>\u001a\u0004\bA\u0010BR(\u0010E\u001a\u00020D8\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\bE\u0010F\u0012\u0004\bK\u0010>\u001a\u0004\bG\u0010H\"\u0004\bI\u0010J¨\u0006M"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputSelectComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/MultiTextValueComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputSelectBoxComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/DisableableComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/HideableComponent;", "", "name", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;", "styles", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;", "selectedOptions", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "hidden", "disabled", AnnotatedPrivateKey.LABEL, "placeholder", "options", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "update", "(Ljava/util/List;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputSelectComponent;", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "copy", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputSelectComponent;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;", "Ljava/util/List;", "getSelectedOptions", "()Ljava/util/List;", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getDisabled", "getLabel", "getPlaceholder", "getOptions", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/view/AssociatedHideableView;", "associatedViews", "getAssociatedViews", "getAssociatedViews$annotations", "()V", "canSelectMultipleValues", "Z", "getCanSelectMultipleValues", "()Z", "getCanSelectMultipleValues$annotations", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/utils/SelectedOptionsController;", "selectedOptionsController", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/utils/SelectedOptionsController;", "getSelectedOptionsController", "()Lcom/withpersona/sdk2/inquiry/steps/ui/components/utils/SelectedOptionsController;", "setSelectedOptionsController", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/utils/SelectedOptionsController;)V", "getSelectedOptionsController$annotations", "Companion", "ui-step-renderer_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class InputSelectComponent implements UiComponent, MultiTextValueComponent<InputSelectComponent>, InputSelectBoxComponent, UiComponentAttributes2, UiComponentAttributes3 {
    private final List<AssociatedHideableView> associatedViews;
    private final boolean canSelectMultipleValues;
    private final JsonLogicBoolean disabled;
    private final JsonLogicBoolean hidden;
    private final String label;
    private final String name;
    private final List<Option> options;
    private final String placeholder;
    private final List<Option> selectedOptions;
    private SelectedOptionsController selectedOptionsController;
    private final InputSelectComponentStyle styles;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<InputSelectComponent> CREATOR = new Creator();

    /* compiled from: InputSelectComponent.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<InputSelectComponent> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InputSelectComponent createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string2 = parcel.readString();
            InputSelectComponentStyle inputSelectComponentStyle = (InputSelectComponentStyle) parcel.readParcelable(InputSelectComponent.class.getClassLoader());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(Option.CREATOR.createFromParcel(parcel));
            }
            JsonLogicBoolean jsonLogicBoolean = (JsonLogicBoolean) parcel.readParcelable(InputSelectComponent.class.getClassLoader());
            JsonLogicBoolean jsonLogicBoolean2 = (JsonLogicBoolean) parcel.readParcelable(InputSelectComponent.class.getClassLoader());
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList2.add(Option.CREATOR.createFromParcel(parcel));
            }
            return new InputSelectComponent(string2, inputSelectComponentStyle, arrayList, jsonLogicBoolean, jsonLogicBoolean2, string3, string4, arrayList2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InputSelectComponent[] newArray(int i) {
            return new InputSelectComponent[i];
        }
    }

    public static /* synthetic */ InputSelectComponent copy$default(InputSelectComponent inputSelectComponent, String str, InputSelectComponentStyle inputSelectComponentStyle, List list, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, String str2, String str3, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = inputSelectComponent.name;
        }
        if ((i & 2) != 0) {
            inputSelectComponentStyle = inputSelectComponent.styles;
        }
        if ((i & 4) != 0) {
            list = inputSelectComponent.selectedOptions;
        }
        if ((i & 8) != 0) {
            jsonLogicBoolean = inputSelectComponent.hidden;
        }
        if ((i & 16) != 0) {
            jsonLogicBoolean2 = inputSelectComponent.disabled;
        }
        if ((i & 32) != 0) {
            str2 = inputSelectComponent.label;
        }
        if ((i & 64) != 0) {
            str3 = inputSelectComponent.placeholder;
        }
        if ((i & 128) != 0) {
            list2 = inputSelectComponent.options;
        }
        String str4 = str3;
        List list3 = list2;
        JsonLogicBoolean jsonLogicBoolean3 = jsonLogicBoolean2;
        String str5 = str2;
        return inputSelectComponent.copy(str, inputSelectComponentStyle, list, jsonLogicBoolean, jsonLogicBoolean3, str5, str4, list3);
    }

    public final InputSelectComponent copy(String name, InputSelectComponentStyle styles, List<Option> selectedOptions, JsonLogicBoolean hidden, JsonLogicBoolean disabled, String label, String placeholder, List<Option> options) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(selectedOptions, "selectedOptions");
        Intrinsics.checkNotNullParameter(options, "options");
        return new InputSelectComponent(name, styles, selectedOptions, hidden, disabled, label, placeholder, options);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InputSelectComponent)) {
            return false;
        }
        InputSelectComponent inputSelectComponent = (InputSelectComponent) other;
        return Intrinsics.areEqual(this.name, inputSelectComponent.name) && Intrinsics.areEqual(this.styles, inputSelectComponent.styles) && Intrinsics.areEqual(this.selectedOptions, inputSelectComponent.selectedOptions) && Intrinsics.areEqual(this.hidden, inputSelectComponent.hidden) && Intrinsics.areEqual(this.disabled, inputSelectComponent.disabled) && Intrinsics.areEqual(this.label, inputSelectComponent.label) && Intrinsics.areEqual(this.placeholder, inputSelectComponent.placeholder) && Intrinsics.areEqual(this.options, inputSelectComponent.options);
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        InputSelectComponentStyle inputSelectComponentStyle = this.styles;
        int iHashCode2 = (((iHashCode + (inputSelectComponentStyle == null ? 0 : inputSelectComponentStyle.hashCode())) * 31) + this.selectedOptions.hashCode()) * 31;
        JsonLogicBoolean jsonLogicBoolean = this.hidden;
        int iHashCode3 = (iHashCode2 + (jsonLogicBoolean == null ? 0 : jsonLogicBoolean.hashCode())) * 31;
        JsonLogicBoolean jsonLogicBoolean2 = this.disabled;
        int iHashCode4 = (iHashCode3 + (jsonLogicBoolean2 == null ? 0 : jsonLogicBoolean2.hashCode())) * 31;
        String str = this.label;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.placeholder;
        return ((iHashCode5 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.options.hashCode();
    }

    public String toString() {
        return "InputSelectComponent(name=" + this.name + ", styles=" + this.styles + ", selectedOptions=" + this.selectedOptions + ", hidden=" + this.hidden + ", disabled=" + this.disabled + ", label=" + this.label + ", placeholder=" + this.placeholder + ", options=" + this.options + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.name);
        dest.writeParcelable(this.styles, flags);
        List<Option> list = this.selectedOptions;
        dest.writeInt(list.size());
        Iterator<Option> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
        dest.writeParcelable(this.hidden, flags);
        dest.writeParcelable(this.disabled, flags);
        dest.writeString(this.label);
        dest.writeString(this.placeholder);
        List<Option> list2 = this.options;
        dest.writeInt(list2.size());
        Iterator<Option> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(dest, flags);
        }
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p423ui.components.MultiTextValueComponent
    public /* bridge */ /* synthetic */ UiComponent update(List list) {
        return update((List<Option>) list);
    }

    public InputSelectComponent(String name, InputSelectComponentStyle inputSelectComponentStyle, List<Option> selectedOptions, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, String str, String str2, List<Option> options) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(selectedOptions, "selectedOptions");
        Intrinsics.checkNotNullParameter(options, "options");
        this.name = name;
        this.styles = inputSelectComponentStyle;
        this.selectedOptions = selectedOptions;
        this.hidden = jsonLogicBoolean;
        this.disabled = jsonLogicBoolean2;
        this.label = str;
        this.placeholder = str2;
        this.options = options;
        this.associatedViews = new ArrayList();
        this.selectedOptionsController = new SelectedOptionsController(getSelectedOptions());
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p423ui.components.UiComponent
    public String getName() {
        return this.name;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p423ui.components.InputSelectBoxComponent
    public InputSelectComponentStyle getStyles() {
        return this.styles;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p423ui.components.InputSelectBoxComponent
    public List<Option> getSelectedOptions() {
        return this.selectedOptions;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p423ui.components.UiComponentAttributes3
    public JsonLogicBoolean getHidden() {
        return this.hidden;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p423ui.components.UiComponentAttributes2
    public JsonLogicBoolean getDisabled() {
        return this.disabled;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p423ui.components.InputSelectBoxComponent
    public String getLabel() {
        return this.label;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p423ui.components.InputSelectBoxComponent
    public List<Option> getOptions() {
        return this.options;
    }

    /* compiled from: InputSelectComponent.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputSelectComponent$Companion;", "", "<init>", "()V", "from", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputSelectComponent;", "config", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputSelect;", "ui-step-renderer_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final InputSelectComponent from(InputSelect config) {
            List listEmptyList;
            List listEmptyList2;
            List<InputGroup3> options;
            Intrinsics.checkNotNullParameter(config, "config");
            InputSelect.Attributes attributes = config.getAttributes();
            List<InputGroup3> options2 = attributes != null ? attributes.getOptions() : null;
            if (options2 == null) {
                listEmptyList = CollectionsKt.emptyList();
            } else {
                ArrayList<InputGroup3> arrayList = new ArrayList();
                for (Object obj : options2) {
                    String value = ((InputGroup3) obj).getValue();
                    InputSelect.Attributes attributes2 = config.getAttributes();
                    if (Intrinsics.areEqual(value, attributes2 != null ? attributes2.getPrefill() : null)) {
                        arrayList.add(obj);
                    }
                }
                listEmptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                for (InputGroup3 inputGroup3 : arrayList) {
                    listEmptyList.add(new Option(inputGroup3.getText(), inputGroup3.getValue()));
                }
            }
            List list = listEmptyList;
            String name = config.getName();
            InputSelectComponentStyle styles = config.getStyles();
            InputSelect.Attributes attributes3 = config.getAttributes();
            JsonLogicBoolean hidden = attributes3 != null ? attributes3.getHidden() : null;
            InputSelect.Attributes attributes4 = config.getAttributes();
            JsonLogicBoolean disabled = attributes4 != null ? attributes4.getDisabled() : null;
            InputSelect.Attributes attributes5 = config.getAttributes();
            String label = attributes5 != null ? attributes5.getLabel() : null;
            InputSelect.Attributes attributes6 = config.getAttributes();
            String placeholder = attributes6 != null ? attributes6.getPlaceholder() : null;
            InputSelect.Attributes attributes7 = config.getAttributes();
            if (attributes7 == null || (options = attributes7.getOptions()) == null) {
                listEmptyList2 = CollectionsKt.emptyList();
            } else {
                List<InputGroup3> list2 = options;
                listEmptyList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                for (InputGroup3 inputGroup32 : list2) {
                    listEmptyList2.add(new Option(inputGroup32.getText(), inputGroup32.getValue()));
                }
            }
            return new InputSelectComponent(name, styles, list, hidden, disabled, label, placeholder, listEmptyList2);
        }
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p423ui.components.UiComponentAttributes3
    public List<AssociatedHideableView> getAssociatedViews() {
        return this.associatedViews;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p423ui.components.InputSelectBoxComponent
    public boolean getCanSelectMultipleValues() {
        return this.canSelectMultipleValues;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p423ui.components.MultiTextValueComponent
    public SelectedOptionsController getSelectedOptionsController() {
        return this.selectedOptionsController;
    }

    public void setSelectedOptionsController(SelectedOptionsController selectedOptionsController) {
        Intrinsics.checkNotNullParameter(selectedOptionsController, "<set-?>");
        this.selectedOptionsController = selectedOptionsController;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p423ui.components.MultiTextValueComponent
    public InputSelectComponent update(List<Option> selectedOptions) {
        Intrinsics.checkNotNullParameter(selectedOptions, "selectedOptions");
        InputSelectComponent inputSelectComponentCopy$default = copy$default(this, null, null, CollectionsKt.take(selectedOptions, 1), null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE, null);
        inputSelectComponentCopy$default.setSelectedOptionsController(getSelectedOptionsController());
        return inputSelectComponentCopy$default;
    }
}
