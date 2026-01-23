package com.withpersona.sdk2.inquiry.steps.p423ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.Json;
import com.squareup.workflow1.p415ui.TextController;
import com.squareup.workflow1.p415ui.TextController3;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.InputSelectBoxComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.InputPhoneNumber;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.InputTextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.utils.CountryCodeUtils;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.utils.PhoneNumberInfo;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.utils.SelectedOptionsController;
import com.withpersona.sdk2.inquiry.steps.p423ui.view.AssociatedHideableView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: InputPhoneNumberComponent.kt */
@Metadata(m3635d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u0000 Y2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u00022\u00020\u00032\u00020\u0004:\u0001YB?\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0019¢\u0006\u0004\b\u001e\u0010\u001fJT\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b$\u0010\u001fJ\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010#R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b,\u0010#R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b.\u0010/R\u001c\u0010\n\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\b0\u0010/R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00101\u001a\u0004\b2\u00103R$\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010*\u001a\u0004\b4\u0010#\"\u0004\b5\u00106R&\u00109\u001a\b\u0012\u0004\u0012\u000208078\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b9\u0010:\u0012\u0004\b=\u0010>\u001a\u0004\b;\u0010<R\u001d\u0010@\u001a\u00020?8\u0006¢\u0006\u0012\n\u0004\b@\u0010A\u0012\u0004\bD\u0010>\u001a\u0004\bB\u0010CR(\u0010F\u001a\u00020E8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0004\bF\u0010G\u0012\u0004\bL\u0010>\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR#\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00130M8\u0006¢\u0006\u0012\n\u0004\bN\u0010:\u0012\u0004\bP\u0010>\u001a\u0004\bO\u0010<R(\u0010R\u001a\u00020Q8\u0016@\u0016X\u0097\u000e¢\u0006\u0018\n\u0004\bR\u0010S\u0012\u0004\bX\u0010>\u001a\u0004\bT\u0010U\"\u0004\bV\u0010W¨\u0006Z"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputPhoneNumberComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/SingleTextValueComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/DisableableComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/HideableComponent;", "", "name", "value", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "hidden", "disabled", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "errorTextStyle", "selectedCountryCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;Ljava/lang/String;)V", "newString", "update", "(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputPhoneNumberComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;", "selectedCountry", "updateSelectedCountry", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputPhoneNumberComponent;", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputPhoneNumberComponent;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "getValue", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getDisabled", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "getErrorTextStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "getSelectedCountryCode", "setSelectedCountryCode", "(Ljava/lang/String;)V", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/view/AssociatedHideableView;", "associatedViews", "Ljava/util/List;", "getAssociatedViews", "()Ljava/util/List;", "getAssociatedViews$annotations", "()V", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputSelectBoxComponent;", "countryCodeSelectComponent", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputSelectBoxComponent;", "getCountryCodeSelectComponent", "()Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputSelectBoxComponent;", "getCountryCodeSelectComponent$annotations", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/utils/SelectedOptionsController;", "countryCodeOptionsController", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/utils/SelectedOptionsController;", "getCountryCodeOptionsController", "()Lcom/withpersona/sdk2/inquiry/steps/ui/components/utils/SelectedOptionsController;", "setCountryCodeOptionsController", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/utils/SelectedOptionsController;)V", "getCountryCodeOptionsController$annotations", "", "countryCodeOptions", "getCountryCodeOptions", "getCountryCodeOptions$annotations", "Lcom/squareup/workflow1/ui/TextController;", "textController", "Lcom/squareup/workflow1/ui/TextController;", "getTextController", "()Lcom/squareup/workflow1/ui/TextController;", "setTextController", "(Lcom/squareup/workflow1/ui/TextController;)V", "getTextController$annotations", "Companion", "ui-step-renderer_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class InputPhoneNumberComponent implements UiComponent, SingleTextValueComponent<InputPhoneNumberComponent>, UiComponentAttributes2, UiComponentAttributes3 {
    private final List<AssociatedHideableView> associatedViews;
    private final List<Option> countryCodeOptions;
    private SelectedOptionsController countryCodeOptionsController;
    private final InputSelectBoxComponent countryCodeSelectComponent;
    private final JsonLogicBoolean disabled;
    private final TextBasedComponentStyle errorTextStyle;
    private final JsonLogicBoolean hidden;
    private final String name;
    private String selectedCountryCode;
    private TextController textController;
    private final String value;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<InputPhoneNumberComponent> CREATOR = new Creator();

    /* compiled from: InputPhoneNumberComponent.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<InputPhoneNumberComponent> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InputPhoneNumberComponent createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InputPhoneNumberComponent(parcel.readString(), parcel.readString(), (JsonLogicBoolean) parcel.readParcelable(InputPhoneNumberComponent.class.getClassLoader()), (JsonLogicBoolean) parcel.readParcelable(InputPhoneNumberComponent.class.getClassLoader()), (TextBasedComponentStyle) parcel.readParcelable(InputPhoneNumberComponent.class.getClassLoader()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InputPhoneNumberComponent[] newArray(int i) {
            return new InputPhoneNumberComponent[i];
        }
    }

    public static /* synthetic */ InputPhoneNumberComponent copy$default(InputPhoneNumberComponent inputPhoneNumberComponent, String str, String str2, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, TextBasedComponentStyle textBasedComponentStyle, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = inputPhoneNumberComponent.name;
        }
        if ((i & 2) != 0) {
            str2 = inputPhoneNumberComponent.value;
        }
        if ((i & 4) != 0) {
            jsonLogicBoolean = inputPhoneNumberComponent.hidden;
        }
        if ((i & 8) != 0) {
            jsonLogicBoolean2 = inputPhoneNumberComponent.disabled;
        }
        if ((i & 16) != 0) {
            textBasedComponentStyle = inputPhoneNumberComponent.errorTextStyle;
        }
        if ((i & 32) != 0) {
            str3 = inputPhoneNumberComponent.selectedCountryCode;
        }
        TextBasedComponentStyle textBasedComponentStyle2 = textBasedComponentStyle;
        String str4 = str3;
        return inputPhoneNumberComponent.copy(str, str2, jsonLogicBoolean, jsonLogicBoolean2, textBasedComponentStyle2, str4);
    }

    @Json(ignore = true)
    public static /* synthetic */ void getTextController$annotations() {
    }

    public final InputPhoneNumberComponent copy(String name, String value, JsonLogicBoolean hidden, JsonLogicBoolean disabled, TextBasedComponentStyle errorTextStyle, String selectedCountryCode) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        return new InputPhoneNumberComponent(name, value, hidden, disabled, errorTextStyle, selectedCountryCode);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InputPhoneNumberComponent)) {
            return false;
        }
        InputPhoneNumberComponent inputPhoneNumberComponent = (InputPhoneNumberComponent) other;
        return Intrinsics.areEqual(this.name, inputPhoneNumberComponent.name) && Intrinsics.areEqual(this.value, inputPhoneNumberComponent.value) && Intrinsics.areEqual(this.hidden, inputPhoneNumberComponent.hidden) && Intrinsics.areEqual(this.disabled, inputPhoneNumberComponent.disabled) && Intrinsics.areEqual(this.errorTextStyle, inputPhoneNumberComponent.errorTextStyle) && Intrinsics.areEqual(this.selectedCountryCode, inputPhoneNumberComponent.selectedCountryCode);
    }

    public int hashCode() {
        int iHashCode = ((this.name.hashCode() * 31) + this.value.hashCode()) * 31;
        JsonLogicBoolean jsonLogicBoolean = this.hidden;
        int iHashCode2 = (iHashCode + (jsonLogicBoolean == null ? 0 : jsonLogicBoolean.hashCode())) * 31;
        JsonLogicBoolean jsonLogicBoolean2 = this.disabled;
        int iHashCode3 = (iHashCode2 + (jsonLogicBoolean2 == null ? 0 : jsonLogicBoolean2.hashCode())) * 31;
        TextBasedComponentStyle textBasedComponentStyle = this.errorTextStyle;
        int iHashCode4 = (iHashCode3 + (textBasedComponentStyle == null ? 0 : textBasedComponentStyle.hashCode())) * 31;
        String str = this.selectedCountryCode;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "InputPhoneNumberComponent(name=" + this.name + ", value=" + this.value + ", hidden=" + this.hidden + ", disabled=" + this.disabled + ", errorTextStyle=" + this.errorTextStyle + ", selectedCountryCode=" + this.selectedCountryCode + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.name);
        dest.writeString(this.value);
        dest.writeParcelable(this.hidden, flags);
        dest.writeParcelable(this.disabled, flags);
        dest.writeParcelable(this.errorTextStyle, flags);
        dest.writeString(this.selectedCountryCode);
    }

    public InputPhoneNumberComponent(String name, String value, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, TextBasedComponentStyle textBasedComponentStyle, String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.name = name;
        this.value = value;
        this.hidden = jsonLogicBoolean;
        this.disabled = jsonLogicBoolean2;
        this.errorTextStyle = textBasedComponentStyle;
        this.selectedCountryCode = str;
        this.associatedViews = new ArrayList();
        CountryCodeUtils countryCodeUtils = CountryCodeUtils.INSTANCE;
        this.countryCodeOptions = countryCodeUtils.getCountryOptions();
        this.countryCodeSelectComponent = new InputSelectBoxComponent() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.InputPhoneNumberComponent.1
            @Override // com.withpersona.sdk2.inquiry.steps.p423ui.components.InputSelectBoxComponent
            public boolean getCanSelectMultipleValues() {
                return false;
            }

            @Override // com.withpersona.sdk2.inquiry.steps.p423ui.components.InputSelectBoxComponent
            public String getLabel() {
                return null;
            }

            @Override // com.withpersona.sdk2.inquiry.steps.p423ui.components.InputSelectBoxComponent
            public InputSelectBoxComponentStyle getStyles() {
                return null;
            }

            @Override // com.withpersona.sdk2.inquiry.steps.p423ui.components.InputSelectBoxComponent
            public List<Option> getOptions() {
                return InputPhoneNumberComponent.this.getCountryCodeOptions();
            }

            @Override // com.withpersona.sdk2.inquiry.steps.p423ui.components.InputSelectBoxComponent
            public List<Option> getSelectedOptions() {
                return CollectionsKt.listOf(CountryCodeUtils.INSTANCE.getInitialSelectedOption(InputPhoneNumberComponent.this.getSelectedCountryCode()));
            }
        };
        this.countryCodeOptionsController = new SelectedOptionsController(countryCodeUtils.getInitialSelectedOption(this.selectedCountryCode));
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

    public final TextBasedComponentStyle getErrorTextStyle() {
        return this.errorTextStyle;
    }

    public final String getSelectedCountryCode() {
        return this.selectedCountryCode;
    }

    /* compiled from: InputPhoneNumberComponent.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputPhoneNumberComponent$Companion;", "", "<init>", "()V", "fromConfig", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputPhoneNumberComponent;", "config", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputPhoneNumber;", "ui-step-renderer_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final InputPhoneNumberComponent fromConfig(InputPhoneNumber config) {
            String string2;
            String countryCode;
            String str;
            String countryCode2;
            String prefill;
            Intrinsics.checkNotNullParameter(config, "config");
            InputPhoneNumber.Attributes attributes = config.getAttributes();
            if (attributes == null || (prefill = attributes.getPrefill()) == null || (string2 = StringsKt.trim(prefill).toString()) == null) {
                string2 = "";
            }
            if (StringsKt.startsWith$default(string2, "+", false, 2, (Object) null)) {
                PhoneNumberInfo phoneNumberInfo = CountryCodeUtils.INSTANCE.parsePhoneNumberInfo(string2);
                String localPhoneNumber = phoneNumberInfo.getLocalPhoneNumber();
                countryCode2 = phoneNumberInfo.getCountryCode();
                str = localPhoneNumber;
            } else {
                InputPhoneNumber.Attributes attributes2 = config.getAttributes();
                if (attributes2 == null || (countryCode = attributes2.getCountryCode()) == null) {
                    countryCode = CountryCodeUtils.INSTANCE.getUsCountryCodeMetadata().getCountryCode();
                }
                str = string2;
                countryCode2 = countryCode;
            }
            String name = config.getName();
            InputPhoneNumber.Attributes attributes3 = config.getAttributes();
            JsonLogicBoolean hidden = attributes3 != null ? attributes3.getHidden() : null;
            InputPhoneNumber.Attributes attributes4 = config.getAttributes();
            JsonLogicBoolean disabled = attributes4 != null ? attributes4.getDisabled() : null;
            InputTextBasedComponentStyle styles = config.getStyles();
            return new InputPhoneNumberComponent(name, str, hidden, disabled, styles != null ? styles.getErrorTextStyle() : null, countryCode2);
        }
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p423ui.components.UiComponentAttributes3
    public List<AssociatedHideableView> getAssociatedViews() {
        return this.associatedViews;
    }

    public final InputSelectBoxComponent getCountryCodeSelectComponent() {
        return this.countryCodeSelectComponent;
    }

    public final SelectedOptionsController getCountryCodeOptionsController() {
        return this.countryCodeOptionsController;
    }

    public final List<Option> getCountryCodeOptions() {
        return this.countryCodeOptions;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p423ui.components.SingleTextValueComponent
    public TextController getTextController() {
        return this.textController;
    }

    public void setTextController(TextController textController) {
        Intrinsics.checkNotNullParameter(textController, "<set-?>");
        this.textController = textController;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p423ui.components.SingleTextValueComponent
    public InputPhoneNumberComponent update(String newString) {
        Intrinsics.checkNotNullParameter(newString, "newString");
        InputPhoneNumberComponent inputPhoneNumberComponentCopy$default = copy$default(this, null, newString, null, null, null, null, 61, null);
        inputPhoneNumberComponentCopy$default.setTextController(getTextController());
        inputPhoneNumberComponentCopy$default.countryCodeOptionsController = this.countryCodeOptionsController;
        return inputPhoneNumberComponentCopy$default;
    }

    public final InputPhoneNumberComponent updateSelectedCountry(Option selectedCountry) {
        InputPhoneNumberComponent inputPhoneNumberComponentCopy$default = copy$default(this, null, null, null, null, null, selectedCountry != null ? CountryCodeUtils.INSTANCE.getCountryCode(selectedCountry) : null, 31, null);
        inputPhoneNumberComponentCopy$default.setTextController(getTextController());
        inputPhoneNumberComponentCopy$default.countryCodeOptionsController = this.countryCodeOptionsController;
        return inputPhoneNumberComponentCopy$default;
    }
}
