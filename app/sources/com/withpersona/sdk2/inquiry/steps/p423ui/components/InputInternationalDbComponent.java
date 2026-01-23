package com.withpersona.sdk2.inquiry.steps.p423ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.workflow1.p415ui.TextController;
import com.squareup.workflow1.p415ui.TextController3;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.InputSelectBoxComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.InputInternationalDb;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.InputSelectComponentStyle;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.InputInternationalDbComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.utils.SelectedOptionsController;
import com.withpersona.sdk2.inquiry.steps.p423ui.view.AssociatedHideableView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: InputInternationalDbComponent.kt */
@Metadata(m3635d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u001a\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u0000 t2\u00020\u00012\u00020\u00022\u00020\u0003:\u0003tuvB\u007f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001b\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00002\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b \u0010!J\u001d\u0010'\u001a\u00020&2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020$¢\u0006\u0004\b)\u0010*J \u0001\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020$HÖ\u0001¢\u0006\u0004\b/\u0010*J\u001a\u00102\u001a\u00020\f2\b\u00101\u001a\u0004\u0018\u000100HÖ\u0003¢\u0006\u0004\b2\u00103R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u00104\u001a\u0004\b5\u0010.R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00104\u001a\u0004\b6\u0010.R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u00104\u001a\u0004\b7\u0010.R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b8\u0010.R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u00109\u001a\u0004\b:\u0010;R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u00109\u001a\u0004\b<\u0010;R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010=\u001a\u0004\b>\u0010?R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010=\u001a\u0004\b@\u0010?R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u000f\u0010A\u001a\u0004\bB\u0010CR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010A\u001a\u0004\bD\u0010CR\u001f\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010E\u001a\u0004\bF\u0010GR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010H\u001a\u0004\bI\u0010JR&\u0010M\u001a\b\u0012\u0004\u0012\u00020L0K8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\bM\u0010E\u0012\u0004\bO\u0010P\u001a\u0004\bN\u0010GR(\u0010R\u001a\u00020Q8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0004\bR\u0010S\u0012\u0004\bX\u0010P\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR(\u0010Y\u001a\u00020Q8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0004\bY\u0010S\u0012\u0004\b\\\u0010P\u001a\u0004\bZ\u0010U\"\u0004\b[\u0010WR:\u0010^\u001a\n\u0012\u0004\u0012\u00020]\u0018\u00010\u00112\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020]\u0018\u00010\u00118\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\b^\u0010E\u0012\u0004\b`\u0010P\u001a\u0004\b_\u0010GR0\u0010c\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020b0\u0011\u0018\u00010a8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\bc\u0010d\u0012\u0004\be\u0010PR\u001d\u0010f\u001a\u00020\u001f8\u0006¢\u0006\u0012\n\u0004\bf\u0010g\u0012\u0004\bi\u0010P\u001a\u0004\bh\u0010!R(\u0010k\u001a\u00020j8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0004\bk\u0010l\u0012\u0004\bq\u0010P\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR\u0019\u0010s\u001a\n\u0012\u0004\u0012\u00020b\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\br\u0010G¨\u0006w"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputInternationalDbComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/DisableableComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/HideableComponent;", "", "name", "selectedCountry", "selectedIdType", "idValue", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "hidden", "disabled", "", "hideCountryField", "hideIdTypeField", "hideCountryIfSingleChoice", "hideTypeIfSingleChoice", "", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputInternationalDb$IdType;", "allowedIdTypes", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;", "inputSelectStyle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;ZZLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;)V", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;", "updateSelectedCountry", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputInternationalDbComponent;", "updateSelectedIdType", "value", "updateValue", "(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputInternationalDbComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputSelectBoxComponent;", "getIdTypeSelectComponent", "()Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputSelectBoxComponent;", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;ZZLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputInternationalDbComponent;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "getSelectedCountry", "getSelectedIdType", "getIdValue", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getDisabled", "Z", "getHideCountryField", "()Z", "getHideIdTypeField", "Ljava/lang/Boolean;", "getHideCountryIfSingleChoice", "()Ljava/lang/Boolean;", "getHideTypeIfSingleChoice", "Ljava/util/List;", "getAllowedIdTypes", "()Ljava/util/List;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;", "getInputSelectStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/view/AssociatedHideableView;", "associatedViews", "getAssociatedViews", "getAssociatedViews$annotations", "()V", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/utils/SelectedOptionsController;", "countryOptionsController", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/utils/SelectedOptionsController;", "getCountryOptionsController", "()Lcom/withpersona/sdk2/inquiry/steps/ui/components/utils/SelectedOptionsController;", "setCountryOptionsController", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/utils/SelectedOptionsController;)V", "getCountryOptionsController$annotations", "idTypeOptionsController", "getIdTypeOptionsController", "setIdTypeOptionsController", "getIdTypeOptionsController$annotations", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputInternationalDbComponent$CountryOption;", "countryOptions", "getCountryOptions", "getCountryOptions$annotations", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputInternationalDbComponent$IdOption;", "typesByCountryCode", "Ljava/util/Map;", "getTypesByCountryCode$annotations", "countrySelectComponent", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputSelectBoxComponent;", "getCountrySelectComponent", "getCountrySelectComponent$annotations", "Lcom/squareup/workflow1/ui/TextController;", "idValueController", "Lcom/squareup/workflow1/ui/TextController;", "getIdValueController", "()Lcom/squareup/workflow1/ui/TextController;", "setIdValueController", "(Lcom/squareup/workflow1/ui/TextController;)V", "getIdValueController$annotations", "getIdTypeOptions", "idTypeOptions", "Companion", "CountryOption", "IdOption", "ui-step-renderer_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes18.dex */
public final /* data */ class InputInternationalDbComponent implements UiComponent, UiComponentAttributes2, UiComponentAttributes3 {
    private final List<InputInternationalDb.IdType> allowedIdTypes;
    private final List<AssociatedHideableView> associatedViews;
    private List<CountryOption> countryOptions;
    private SelectedOptionsController countryOptionsController;
    private final InputSelectBoxComponent countrySelectComponent;
    private final JsonLogicBoolean disabled;
    private final JsonLogicBoolean hidden;
    private final boolean hideCountryField;
    private final Boolean hideCountryIfSingleChoice;
    private final boolean hideIdTypeField;
    private final Boolean hideTypeIfSingleChoice;
    private SelectedOptionsController idTypeOptionsController;
    private final String idValue;
    private TextController idValueController;
    private final InputSelectComponentStyle inputSelectStyle;
    private final String name;
    private final String selectedCountry;
    private final String selectedIdType;
    private Map<String, ? extends List<IdOption>> typesByCountryCode;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<InputInternationalDbComponent> CREATOR = new Creator();

    /* compiled from: InputInternationalDbComponent.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<InputInternationalDbComponent> {
        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final InputInternationalDbComponent createFromParcel(Parcel parcel) {
            int i;
            boolean z;
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            JsonLogicBoolean jsonLogicBoolean = (JsonLogicBoolean) parcel.readParcelable(InputInternationalDbComponent.class.getClassLoader());
            JsonLogicBoolean jsonLogicBoolean2 = (JsonLogicBoolean) parcel.readParcelable(InputInternationalDbComponent.class.getClassLoader());
            boolean z2 = false;
            boolean z3 = 1;
            if (parcel.readInt() != 0) {
                i = 0;
                z2 = true;
            } else {
                i = 0;
            }
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = true;
                z3 = i;
            }
            ArrayList arrayList = null;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0 ? z ? 1 : 0 : i);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolean z4 = z;
                if (parcel.readInt() == 0) {
                    z4 = i;
                }
                boolValueOf2 = Boolean.valueOf(z4);
            }
            if (parcel.readInt() != 0) {
                int i2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i2);
                while (i != i2) {
                    arrayList2.add(parcel.readParcelable(InputInternationalDbComponent.class.getClassLoader()));
                    i++;
                }
                arrayList = arrayList2;
            }
            return new InputInternationalDbComponent(string2, string3, string4, string5, jsonLogicBoolean, jsonLogicBoolean2, z2, z3, boolValueOf, boolValueOf2, arrayList, (InputSelectComponentStyle) parcel.readParcelable(InputInternationalDbComponent.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InputInternationalDbComponent[] newArray(int i) {
            return new InputInternationalDbComponent[i];
        }
    }

    public static /* synthetic */ InputInternationalDbComponent copy$default(InputInternationalDbComponent inputInternationalDbComponent, String str, String str2, String str3, String str4, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, boolean z, boolean z2, Boolean bool, Boolean bool2, List list, InputSelectComponentStyle inputSelectComponentStyle, int i, Object obj) {
        if ((i & 1) != 0) {
            str = inputInternationalDbComponent.name;
        }
        if ((i & 2) != 0) {
            str2 = inputInternationalDbComponent.selectedCountry;
        }
        if ((i & 4) != 0) {
            str3 = inputInternationalDbComponent.selectedIdType;
        }
        if ((i & 8) != 0) {
            str4 = inputInternationalDbComponent.idValue;
        }
        if ((i & 16) != 0) {
            jsonLogicBoolean = inputInternationalDbComponent.hidden;
        }
        if ((i & 32) != 0) {
            jsonLogicBoolean2 = inputInternationalDbComponent.disabled;
        }
        if ((i & 64) != 0) {
            z = inputInternationalDbComponent.hideCountryField;
        }
        if ((i & 128) != 0) {
            z2 = inputInternationalDbComponent.hideIdTypeField;
        }
        if ((i & 256) != 0) {
            bool = inputInternationalDbComponent.hideCountryIfSingleChoice;
        }
        if ((i & 512) != 0) {
            bool2 = inputInternationalDbComponent.hideTypeIfSingleChoice;
        }
        if ((i & 1024) != 0) {
            list = inputInternationalDbComponent.allowedIdTypes;
        }
        if ((i & 2048) != 0) {
            inputSelectComponentStyle = inputInternationalDbComponent.inputSelectStyle;
        }
        List list2 = list;
        InputSelectComponentStyle inputSelectComponentStyle2 = inputSelectComponentStyle;
        Boolean bool3 = bool;
        Boolean bool4 = bool2;
        boolean z3 = z;
        boolean z4 = z2;
        JsonLogicBoolean jsonLogicBoolean3 = jsonLogicBoolean;
        JsonLogicBoolean jsonLogicBoolean4 = jsonLogicBoolean2;
        return inputInternationalDbComponent.copy(str, str2, str3, str4, jsonLogicBoolean3, jsonLogicBoolean4, z3, z4, bool3, bool4, list2, inputSelectComponentStyle2);
    }

    public final InputInternationalDbComponent copy(String name, String selectedCountry, String selectedIdType, String idValue, JsonLogicBoolean hidden, JsonLogicBoolean disabled, boolean hideCountryField, boolean hideIdTypeField, Boolean hideCountryIfSingleChoice, Boolean hideTypeIfSingleChoice, List<InputInternationalDb.IdType> allowedIdTypes, InputSelectComponentStyle inputSelectStyle) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new InputInternationalDbComponent(name, selectedCountry, selectedIdType, idValue, hidden, disabled, hideCountryField, hideIdTypeField, hideCountryIfSingleChoice, hideTypeIfSingleChoice, allowedIdTypes, inputSelectStyle);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InputInternationalDbComponent)) {
            return false;
        }
        InputInternationalDbComponent inputInternationalDbComponent = (InputInternationalDbComponent) other;
        return Intrinsics.areEqual(this.name, inputInternationalDbComponent.name) && Intrinsics.areEqual(this.selectedCountry, inputInternationalDbComponent.selectedCountry) && Intrinsics.areEqual(this.selectedIdType, inputInternationalDbComponent.selectedIdType) && Intrinsics.areEqual(this.idValue, inputInternationalDbComponent.idValue) && Intrinsics.areEqual(this.hidden, inputInternationalDbComponent.hidden) && Intrinsics.areEqual(this.disabled, inputInternationalDbComponent.disabled) && this.hideCountryField == inputInternationalDbComponent.hideCountryField && this.hideIdTypeField == inputInternationalDbComponent.hideIdTypeField && Intrinsics.areEqual(this.hideCountryIfSingleChoice, inputInternationalDbComponent.hideCountryIfSingleChoice) && Intrinsics.areEqual(this.hideTypeIfSingleChoice, inputInternationalDbComponent.hideTypeIfSingleChoice) && Intrinsics.areEqual(this.allowedIdTypes, inputInternationalDbComponent.allowedIdTypes) && Intrinsics.areEqual(this.inputSelectStyle, inputInternationalDbComponent.inputSelectStyle);
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        String str = this.selectedCountry;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.selectedIdType;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.idValue;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        JsonLogicBoolean jsonLogicBoolean = this.hidden;
        int iHashCode5 = (iHashCode4 + (jsonLogicBoolean == null ? 0 : jsonLogicBoolean.hashCode())) * 31;
        JsonLogicBoolean jsonLogicBoolean2 = this.disabled;
        int iHashCode6 = (((((iHashCode5 + (jsonLogicBoolean2 == null ? 0 : jsonLogicBoolean2.hashCode())) * 31) + Boolean.hashCode(this.hideCountryField)) * 31) + Boolean.hashCode(this.hideIdTypeField)) * 31;
        Boolean bool = this.hideCountryIfSingleChoice;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.hideTypeIfSingleChoice;
        int iHashCode8 = (iHashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        List<InputInternationalDb.IdType> list = this.allowedIdTypes;
        int iHashCode9 = (iHashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        InputSelectComponentStyle inputSelectComponentStyle = this.inputSelectStyle;
        return iHashCode9 + (inputSelectComponentStyle != null ? inputSelectComponentStyle.hashCode() : 0);
    }

    public String toString() {
        return "InputInternationalDbComponent(name=" + this.name + ", selectedCountry=" + this.selectedCountry + ", selectedIdType=" + this.selectedIdType + ", idValue=" + this.idValue + ", hidden=" + this.hidden + ", disabled=" + this.disabled + ", hideCountryField=" + this.hideCountryField + ", hideIdTypeField=" + this.hideIdTypeField + ", hideCountryIfSingleChoice=" + this.hideCountryIfSingleChoice + ", hideTypeIfSingleChoice=" + this.hideTypeIfSingleChoice + ", allowedIdTypes=" + this.allowedIdTypes + ", inputSelectStyle=" + this.inputSelectStyle + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.name);
        dest.writeString(this.selectedCountry);
        dest.writeString(this.selectedIdType);
        dest.writeString(this.idValue);
        dest.writeParcelable(this.hidden, flags);
        dest.writeParcelable(this.disabled, flags);
        dest.writeInt(this.hideCountryField ? 1 : 0);
        dest.writeInt(this.hideIdTypeField ? 1 : 0);
        Boolean bool = this.hideCountryIfSingleChoice;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.hideTypeIfSingleChoice;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        List<InputInternationalDb.IdType> list = this.allowedIdTypes;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<InputInternationalDb.IdType> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
        }
        dest.writeParcelable(this.inputSelectStyle, flags);
    }

    public InputInternationalDbComponent(String name, String str, String str2, String str3, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, boolean z, boolean z2, Boolean bool, Boolean bool2, List<InputInternationalDb.IdType> list, InputSelectComponentStyle inputSelectComponentStyle) {
        Option option;
        Object next;
        Object next2;
        String countryName;
        String name2;
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.selectedCountry = str;
        this.selectedIdType = str2;
        this.idValue = str3;
        this.hidden = jsonLogicBoolean;
        this.disabled = jsonLogicBoolean2;
        this.hideCountryField = z;
        this.hideIdTypeField = z2;
        this.hideCountryIfSingleChoice = bool;
        this.hideTypeIfSingleChoice = bool2;
        this.allowedIdTypes = list;
        this.inputSelectStyle = inputSelectComponentStyle;
        this.associatedViews = new ArrayList();
        this.idValueController = TextController3.TextController(str3 == null ? "" : str3);
        final LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (list != null) {
            for (InputInternationalDb.IdType idType : list) {
                String countryCode = idType.getCountryCode();
                if (countryCode != null && (countryName = idType.getCountryName()) != null) {
                    linkedHashSet.add(new CountryOption(countryName, countryCode));
                    Object arrayList = linkedHashMap.get(countryCode);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        linkedHashMap.put(countryCode, arrayList);
                    }
                    Collection collection = (Collection) arrayList;
                    String idType2 = idType.getIdType();
                    if (idType2 != null && (name2 = idType.getName()) != null) {
                        collection.add(new IdOption(idType2, name2));
                    }
                }
            }
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            List list2 = (List) ((Map.Entry) it.next()).getValue();
            if (list2.size() > 1) {
                CollectionsKt.sortWith(list2, new Comparator() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.InputInternationalDbComponent$_init_$lambda$3$$inlined$sortBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return ComparisonsKt.compareValues(((InputInternationalDbComponent.IdOption) t).getName(), ((InputInternationalDbComponent.IdOption) t2).getName());
                    }
                });
            }
        }
        Iterator it2 = linkedHashSet.iterator();
        while (true) {
            option = null;
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.areEqual(((CountryOption) next).getCountryCode(), this.selectedCountry)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        CountryOption countryOption = (CountryOption) next;
        Option option2 = countryOption != null ? InputInternationalDbComponent2.toOption(countryOption) : null;
        List list3 = (List) linkedHashMap.get(option2 != null ? option2.getValue() : null);
        if (list3 != null) {
            Iterator it3 = list3.iterator();
            while (true) {
                if (it3.hasNext()) {
                    next2 = it3.next();
                    if (Intrinsics.areEqual(((IdOption) next2).getIdType(), this.selectedIdType)) {
                        break;
                    }
                } else {
                    next2 = null;
                    break;
                }
            }
            IdOption idOption = (IdOption) next2;
            if (idOption != null) {
                option = InputInternationalDbComponent2.toOption(idOption);
            }
        }
        this.countryOptionsController = new SelectedOptionsController(option2);
        this.idTypeOptionsController = new SelectedOptionsController(option);
        this.countryOptions = CollectionsKt.sortedWith(CollectionsKt.toList(linkedHashSet), new Comparator() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.InputInternationalDbComponent$special$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(((InputInternationalDbComponent.CountryOption) t).getCountryName(), ((InputInternationalDbComponent.CountryOption) t2).getCountryName());
            }
        });
        this.typesByCountryCode = linkedHashMap;
        this.countrySelectComponent = new InputSelectBoxComponent() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.InputInternationalDbComponent.4
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
                return InputInternationalDbComponent.this.getInputSelectStyle();
            }

            @Override // com.withpersona.sdk2.inquiry.steps.p423ui.components.InputSelectBoxComponent
            public List<Option> getOptions() {
                Set<CountryOption> set = linkedHashSet;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(set, 10));
                Iterator<T> it4 = set.iterator();
                while (it4.hasNext()) {
                    arrayList2.add(InputInternationalDbComponent2.toOption((CountryOption) it4.next()));
                }
                return arrayList2;
            }

            @Override // com.withpersona.sdk2.inquiry.steps.p423ui.components.InputSelectBoxComponent
            public List<Option> getSelectedOptions() {
                return CollectionsKt.emptyList();
            }
        };
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p423ui.components.UiComponent
    public String getName() {
        return this.name;
    }

    public final String getSelectedCountry() {
        return this.selectedCountry;
    }

    public final String getSelectedIdType() {
        return this.selectedIdType;
    }

    public final String getIdValue() {
        return this.idValue;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p423ui.components.UiComponentAttributes3
    public JsonLogicBoolean getHidden() {
        return this.hidden;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p423ui.components.UiComponentAttributes2
    public JsonLogicBoolean getDisabled() {
        return this.disabled;
    }

    public final boolean getHideCountryField() {
        return this.hideCountryField;
    }

    public final boolean getHideIdTypeField() {
        return this.hideIdTypeField;
    }

    public final Boolean getHideCountryIfSingleChoice() {
        return this.hideCountryIfSingleChoice;
    }

    public final Boolean getHideTypeIfSingleChoice() {
        return this.hideTypeIfSingleChoice;
    }

    public final List<InputInternationalDb.IdType> getAllowedIdTypes() {
        return this.allowedIdTypes;
    }

    public final InputSelectComponentStyle getInputSelectStyle() {
        return this.inputSelectStyle;
    }

    /* compiled from: InputInternationalDbComponent.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputInternationalDbComponent$Companion;", "", "<init>", "()V", "fromConfig", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputInternationalDbComponent;", "config", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputInternationalDb;", "ui-step-renderer_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final InputInternationalDbComponent fromConfig(InputInternationalDb config) {
            List<InputInternationalDb.IdType> allowedIdTypes;
            String countryName;
            String name;
            Intrinsics.checkNotNullParameter(config, "config");
            InputInternationalDb.Attributes attributes = config.getAttributes();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            InputInternationalDb.Attributes attributes2 = config.getAttributes();
            if (attributes2 != null && (allowedIdTypes = attributes2.getAllowedIdTypes()) != null) {
                for (InputInternationalDb.IdType idType : allowedIdTypes) {
                    String countryCode = idType.getCountryCode();
                    if (countryCode != null && (countryName = idType.getCountryName()) != null) {
                        linkedHashSet.add(new CountryOption(countryName, countryCode));
                        Object arrayList = linkedHashMap.get(countryCode);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            linkedHashMap.put(countryCode, arrayList);
                        }
                        Collection collection = (Collection) arrayList;
                        String idType2 = idType.getIdType();
                        if (idType2 != null && (name = idType.getName()) != null) {
                            collection.add(new IdOption(idType2, name));
                        }
                    }
                }
            }
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                List list = (List) ((Map.Entry) it.next()).getValue();
                if (list.size() > 1) {
                    CollectionsKt.sortWith(list, new Comparator() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.InputInternationalDbComponent$Companion$fromConfig$lambda$3$$inlined$sortBy$1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.util.Comparator
                        public final int compare(T t, T t2) {
                            return ComparisonsKt.compareValues(((InputInternationalDbComponent.IdOption) t).getName(), ((InputInternationalDbComponent.IdOption) t2).getName());
                        }
                    });
                }
            }
            boolean z = (attributes != null ? Intrinsics.areEqual(attributes.getHideCountryIfPrefilled(), Boolean.TRUE) : false) && attributes.getPrefillIdbCountry() != null;
            boolean z2 = (attributes != null ? Intrinsics.areEqual(attributes.getHideTypeIfPrefilled(), Boolean.TRUE) : false) && attributes.getPrefillIdbType() != null;
            String name2 = config.getName();
            InputInternationalDb.Attributes attributes3 = config.getAttributes();
            String prefillIdbCountry = attributes3 != null ? attributes3.getPrefillIdbCountry() : null;
            InputInternationalDb.Attributes attributes4 = config.getAttributes();
            String prefillIdbType = attributes4 != null ? attributes4.getPrefillIdbType() : null;
            InputInternationalDb.Attributes attributes5 = config.getAttributes();
            String prefillIdbValue = attributes5 != null ? attributes5.getPrefillIdbValue() : null;
            InputInternationalDb.Attributes attributes6 = config.getAttributes();
            JsonLogicBoolean hidden = attributes6 != null ? attributes6.getHidden() : null;
            InputInternationalDb.Attributes attributes7 = config.getAttributes();
            JsonLogicBoolean disabled = attributes7 != null ? attributes7.getDisabled() : null;
            InputInternationalDb.Attributes attributes8 = config.getAttributes();
            Boolean hideCountryIfSingleChoice = attributes8 != null ? attributes8.getHideCountryIfSingleChoice() : null;
            InputInternationalDb.Attributes attributes9 = config.getAttributes();
            Boolean hideTypeIfSingleChoice = attributes9 != null ? attributes9.getHideTypeIfSingleChoice() : null;
            InputInternationalDb.Attributes attributes10 = config.getAttributes();
            List<InputInternationalDb.IdType> allowedIdTypes2 = attributes10 != null ? attributes10.getAllowedIdTypes() : null;
            InputInternationalDb.InputInternationalDbComponentStyle styles = config.getStyles();
            return new InputInternationalDbComponent(name2, prefillIdbCountry, prefillIdbType, prefillIdbValue, hidden, disabled, z, z2, hideCountryIfSingleChoice, hideTypeIfSingleChoice, allowedIdTypes2, styles != null ? styles.getInputSelectStyle() : null);
        }
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p423ui.components.UiComponentAttributes3
    public List<AssociatedHideableView> getAssociatedViews() {
        return this.associatedViews;
    }

    public final SelectedOptionsController getCountryOptionsController() {
        return this.countryOptionsController;
    }

    public final SelectedOptionsController getIdTypeOptionsController() {
        return this.idTypeOptionsController;
    }

    public final List<CountryOption> getCountryOptions() {
        return this.countryOptions;
    }

    public final InputSelectBoxComponent getCountrySelectComponent() {
        return this.countrySelectComponent;
    }

    public final TextController getIdValueController() {
        return this.idValueController;
    }

    public final List<IdOption> getIdTypeOptions() {
        Map<String, ? extends List<IdOption>> map = this.typesByCountryCode;
        if (map != null) {
            return map.get(this.selectedCountry);
        }
        return null;
    }

    /* compiled from: InputInternationalDbComponent.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0012\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputInternationalDbComponent$CountryOption;", "", "", "countryName", "countryCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCountryName", "getCountryCode", "ui-step-renderer_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final /* data */ class CountryOption {
        private final String countryCode;
        private final String countryName;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CountryOption)) {
                return false;
            }
            CountryOption countryOption = (CountryOption) other;
            return Intrinsics.areEqual(this.countryName, countryOption.countryName) && Intrinsics.areEqual(this.countryCode, countryOption.countryCode);
        }

        public int hashCode() {
            return (this.countryName.hashCode() * 31) + this.countryCode.hashCode();
        }

        public String toString() {
            return "CountryOption(countryName=" + this.countryName + ", countryCode=" + this.countryCode + ")";
        }

        public CountryOption(String countryName, String countryCode) {
            Intrinsics.checkNotNullParameter(countryName, "countryName");
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            this.countryName = countryName;
            this.countryCode = countryCode;
        }

        public final String getCountryName() {
            return this.countryName;
        }

        public final String getCountryCode() {
            return this.countryCode;
        }
    }

    /* compiled from: InputInternationalDbComponent.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0012\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputInternationalDbComponent$IdOption;", "", "", "idType", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIdType", "getName", "ui-step-renderer_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final /* data */ class IdOption {
        private final String idType;
        private final String name;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof IdOption)) {
                return false;
            }
            IdOption idOption = (IdOption) other;
            return Intrinsics.areEqual(this.idType, idOption.idType) && Intrinsics.areEqual(this.name, idOption.name);
        }

        public int hashCode() {
            return (this.idType.hashCode() * 31) + this.name.hashCode();
        }

        public String toString() {
            return "IdOption(idType=" + this.idType + ", name=" + this.name + ")";
        }

        public IdOption(String idType, String name) {
            Intrinsics.checkNotNullParameter(idType, "idType");
            Intrinsics.checkNotNullParameter(name, "name");
            this.idType = idType;
            this.name = name;
        }

        public final String getIdType() {
            return this.idType;
        }

        public final String getName() {
            return this.name;
        }
    }

    public final InputInternationalDbComponent updateSelectedCountry(Option selectedCountry) {
        InputInternationalDbComponent inputInternationalDbComponentCopy$default = copy$default(this, null, selectedCountry != null ? selectedCountry.getValue() : null, null, null, null, null, false, false, null, null, null, null, 4093, null);
        inputInternationalDbComponentCopy$default.countryOptionsController = this.countryOptionsController;
        inputInternationalDbComponentCopy$default.idTypeOptionsController = this.idTypeOptionsController;
        inputInternationalDbComponentCopy$default.idValueController = this.idValueController;
        return inputInternationalDbComponentCopy$default;
    }

    public final InputInternationalDbComponent updateSelectedIdType(Option selectedIdType) {
        InputInternationalDbComponent inputInternationalDbComponentCopy$default = copy$default(this, null, null, selectedIdType != null ? selectedIdType.getValue() : null, null, null, null, false, false, null, null, null, null, 4091, null);
        inputInternationalDbComponentCopy$default.countryOptionsController = this.countryOptionsController;
        inputInternationalDbComponentCopy$default.idTypeOptionsController = this.idTypeOptionsController;
        inputInternationalDbComponentCopy$default.idValueController = this.idValueController;
        return inputInternationalDbComponentCopy$default;
    }

    public final InputInternationalDbComponent updateValue(String value) {
        InputInternationalDbComponent inputInternationalDbComponentCopy$default = copy$default(this, null, null, null, value, null, null, false, false, null, null, null, null, 4087, null);
        inputInternationalDbComponentCopy$default.countryOptionsController = this.countryOptionsController;
        inputInternationalDbComponentCopy$default.idTypeOptionsController = this.idTypeOptionsController;
        inputInternationalDbComponentCopy$default.idValueController = this.idValueController;
        return inputInternationalDbComponentCopy$default;
    }

    public final InputSelectBoxComponent getIdTypeSelectComponent() {
        final List<IdOption> idTypeOptions = getIdTypeOptions();
        if (idTypeOptions == null) {
            return null;
        }
        return new InputSelectBoxComponent() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.InputInternationalDbComponent.getIdTypeSelectComponent.1
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
                return InputInternationalDbComponent.this.getInputSelectStyle();
            }

            @Override // com.withpersona.sdk2.inquiry.steps.p423ui.components.InputSelectBoxComponent
            public List<Option> getOptions() {
                List<IdOption> list = idTypeOptions;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(InputInternationalDbComponent2.toOption((IdOption) it.next()));
                }
                return arrayList;
            }

            @Override // com.withpersona.sdk2.inquiry.steps.p423ui.components.InputSelectBoxComponent
            public List<Option> getSelectedOptions() {
                return CollectionsKt.emptyList();
            }
        };
    }
}
