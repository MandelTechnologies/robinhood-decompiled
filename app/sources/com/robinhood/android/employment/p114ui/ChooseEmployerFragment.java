package com.robinhood.android.employment.p114ui;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.jakewharton.rxbinding3.widget.RxTextView;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.dropdown.RdsDropdown;
import com.robinhood.android.designsystem.textinput.RdsTextInputEditText;
import com.robinhood.android.employment.C14481R;
import com.robinhood.android.employment.databinding.FragmentChooseEmployerBinding;
import com.robinhood.android.employment.p114ui.ChooseEmployerBottomSheetFragment;
import com.robinhood.android.employment.p114ui.ChooseEmployerFragment;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.identi.ApiEmploymentInfo;
import com.robinhood.models.p355ui.bonfire.UiEmployerType;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: ChooseEmployerFragment.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0007\b\u0007\u0018\u0000 02\u00020\u00012\u00020\u0002:\u0004-./0B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u001a\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\b\u0010!\u001a\u00020\u0017H\u0016J\u0010\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020$H\u0002J\u0010\u0010%\u001a\u00020\u00172\u0006\u0010&\u001a\u00020'H\u0002J(\u0010(\u001a\u0004\u0018\u00010\u00192\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00190*2\b\u0010+\u001a\u0004\u0018\u00010\u0019H\u0002J\u0010\u0010,\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001bH\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014¨\u00061"}, m3636d2 = {"Lcom/robinhood/android/employment/ui/ChooseEmployerFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/employment/ui/ChooseEmployerBottomSheetFragment$Callbacks;", "<init>", "()V", "duxo", "Lcom/robinhood/android/employment/ui/ChooseEmployerDuxo;", "getDuxo", "()Lcom/robinhood/android/employment/ui/ChooseEmployerDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "binding", "Lcom/robinhood/android/employment/databinding/FragmentChooseEmployerBinding;", "getBinding", "()Lcom/robinhood/android/employment/databinding/FragmentChooseEmployerBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/employment/ui/ChooseEmployerFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/employment/ui/ChooseEmployerFragment$Callbacks;", "callbacks$delegate", "onSelectionClick", "", "text", "", "dropdownType", "Lcom/robinhood/android/employment/ui/ChooseEmployerFragment$DropdownType;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "bindState", "newState", "Lcom/robinhood/android/employment/ui/ChooseEmployerViewState;", "setLoading", "isLoading", "", "findKeyFromValue", "map", "", "value", "showBottomSheet", "Callbacks", "DropdownType", "Args", "Companion", "feature-employment_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class ChooseEmployerFragment extends BaseFragment implements ChooseEmployerBottomSheetFragment.Callbacks {
    private static final String BOTTOM_SHEET_TAG = "employerBottomSheet";

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(ChooseEmployerFragment.class, "binding", "getBinding()Lcom/robinhood/android/employment/databinding/FragmentChooseEmployerBinding;", 0)), Reflection.property1(new PropertyReference1Impl(ChooseEmployerFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/employment/ui/ChooseEmployerFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: ChooseEmployerFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DropdownType.values().length];
            try {
                iArr[DropdownType.INDUSTRY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DropdownType.OCCUPATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ChooseEmployerFragment() {
        super(C14481R.layout.fragment_choose_employer);
        this.duxo = OldDuxos.oldDuxo(this, ChooseEmployerDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, ChooseEmployerFragment2.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.employment.ui.ChooseEmployerFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof ChooseEmployerFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
    }

    /* compiled from: ChooseEmployerFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\tH&¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/employment/ui/ChooseEmployerFragment$Callbacks;", "", "onEmployerInfoEntered", "", "employerName", "", "employerDescription", "employerIndustry", "shouldRouteToEmployerAddressUpdate", "", "feature-employment_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onEmployerInfoEntered(String employerName, String employerDescription, String employerIndustry, boolean shouldRouteToEmployerAddressUpdate);

        /* compiled from: ChooseEmployerFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class DefaultImpls {
            public static /* synthetic */ void onEmployerInfoEntered$default(Callbacks callbacks, String str, String str2, String str3, boolean z, int i, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onEmployerInfoEntered");
                }
                if ((i & 8) != 0) {
                    z = false;
                }
                callbacks.onEmployerInfoEntered(str, str2, str3, z);
            }
        }
    }

    private final ChooseEmployerDuxo getDuxo() {
        return (ChooseEmployerDuxo) this.duxo.getValue();
    }

    private final FragmentChooseEmployerBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentChooseEmployerBinding) value;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    @Override // com.robinhood.android.employment.ui.ChooseEmployerBottomSheetFragment.Callbacks
    public void onSelectionClick(String text, DropdownType dropdownType) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(dropdownType, "dropdownType");
        int i = WhenMappings.$EnumSwitchMapping$0[dropdownType.ordinal()];
        if (i == 1) {
            getDuxo().updateEmployerIndustry(findKeyFromValue(((Args) INSTANCE.getArgs((Fragment) this)).getEmployerTypes().getIndustries(), text));
            getBinding().employerIndustryDropdown.setText(text);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            getDuxo().updateEmployerDescription(findKeyFromValue(((Args) INSTANCE.getArgs((Fragment) this)).getEmployerTypes().getOccupations(), text));
            getBinding().employerDescriptionDropdown.setText(text);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        RdsTextInputEditText rdsTextInputEditText = getBinding().employerNameEditText;
        Companion companion = INSTANCE;
        rdsTextInputEditText.setText(((Args) companion.getArgs((Fragment) this)).getInitialEmployerName());
        RdsDropdown employerDescriptionDropdown = getBinding().employerDescriptionDropdown;
        Intrinsics.checkNotNullExpressionValue(employerDescriptionDropdown, "employerDescriptionDropdown");
        OnClickListeners.onClick(employerDescriptionDropdown, new Function0() { // from class: com.robinhood.android.employment.ui.ChooseEmployerFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChooseEmployerFragment.onViewCreated$lambda$0(this.f$0);
            }
        });
        RdsDropdown employerIndustryDropdown = getBinding().employerIndustryDropdown;
        Intrinsics.checkNotNullExpressionValue(employerIndustryDropdown, "employerIndustryDropdown");
        OnClickListeners.onClick(employerIndustryDropdown, new Function0() { // from class: com.robinhood.android.employment.ui.ChooseEmployerFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChooseEmployerFragment.onViewCreated$lambda$1(this.f$0);
            }
        });
        RdsTextInputEditText employerNameEditText = getBinding().employerNameEditText;
        Intrinsics.checkNotNullExpressionValue(employerNameEditText, "employerNameEditText");
        LifecycleHost.DefaultImpls.bind$default(this, RxTextView.textChanges(employerNameEditText), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.employment.ui.ChooseEmployerFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ChooseEmployerFragment.onViewCreated$lambda$2(this.f$0, (CharSequence) obj);
            }
        });
        RdsButton employerButton = getBinding().employerButton;
        Intrinsics.checkNotNullExpressionValue(employerButton, "employerButton");
        OnClickListeners.onClick(employerButton, new Function0() { // from class: com.robinhood.android.employment.ui.ChooseEmployerFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChooseEmployerFragment.onViewCreated$lambda$3(this.f$0);
            }
        });
        if (((Args) companion.getArgs((Fragment) this)).getInitialEmployerName() == null) {
            RdsTextInputEditText employerNameEditText2 = getBinding().employerNameEditText;
            Intrinsics.checkNotNullExpressionValue(employerNameEditText2, "employerNameEditText");
            BaseFragment.keyboardFocusOn$default(this, employerNameEditText2, false, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(ChooseEmployerFragment chooseEmployerFragment) {
        chooseEmployerFragment.showBottomSheet(DropdownType.OCCUPATION);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(ChooseEmployerFragment chooseEmployerFragment) {
        chooseEmployerFragment.showBottomSheet(DropdownType.INDUSTRY);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$2(ChooseEmployerFragment chooseEmployerFragment, CharSequence it) {
        Intrinsics.checkNotNullParameter(it, "it");
        chooseEmployerFragment.getDuxo().updateEmployerName(it.toString());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3(ChooseEmployerFragment chooseEmployerFragment) {
        ChooseEmployerDuxo duxo = chooseEmployerFragment.getDuxo();
        Companion companion = INSTANCE;
        ApiEmploymentInfo.EmploymentStatus employmentStatus = ((Args) companion.getArgs((Fragment) chooseEmployerFragment)).getEmploymentStatus();
        String strValueOf = String.valueOf(chooseEmployerFragment.getBinding().employerNameEditText.getText());
        String strFindKeyFromValue = chooseEmployerFragment.findKeyFromValue(((Args) companion.getArgs((Fragment) chooseEmployerFragment)).getEmployerTypes().getOccupations(), String.valueOf(chooseEmployerFragment.getBinding().employerDescriptionDropdown.getText()));
        Intrinsics.checkNotNull(strFindKeyFromValue);
        duxo.submitEmployment(employmentStatus, strValueOf, strFindKeyFromValue, chooseEmployerFragment.findKeyFromValue(((Args) companion.getArgs((Fragment) chooseEmployerFragment)).getEmployerTypes().getIndustries(), String.valueOf(chooseEmployerFragment.getBinding().employerIndustryDropdown.getText())));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C144841(this));
    }

    /* compiled from: ChooseEmployerFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.employment.ui.ChooseEmployerFragment$onStart$1 */
    /* synthetic */ class C144841 extends FunctionReferenceImpl implements Function1<ChooseEmployerViewState, Unit> {
        C144841(Object obj) {
            super(1, obj, ChooseEmployerFragment.class, "bindState", "bindState(Lcom/robinhood/android/employment/ui/ChooseEmployerViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ChooseEmployerViewState chooseEmployerViewState) {
            invoke2(chooseEmployerViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(ChooseEmployerViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((ChooseEmployerFragment) this.receiver).bindState(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindState(ChooseEmployerViewState newState) {
        getBinding().employerInfoTitle.setText(getString(newState.getTitle()));
        getBinding().employerInfoSubtitle.setText(getString(newState.getSubtitle()));
        getBinding().employerButton.setEnabled(newState.isContinueEnabled());
        setLoading(newState.isLoading());
        if (newState.getEmployerSubmitted()) {
            Callbacks callbacks = getCallbacks();
            String employerName = newState.getEmployerName();
            Intrinsics.checkNotNull(employerName);
            String employerDescription = newState.getEmployerDescription();
            Intrinsics.checkNotNull(employerDescription);
            callbacks.onEmployerInfoEntered(employerName, employerDescription, newState.getEmployerIndustry(), newState.getShouldUpdateEmployerAddress());
        }
    }

    private final void setLoading(boolean isLoading) {
        requireToolbar().setLoadingViewVisible(isLoading);
        FragmentChooseEmployerBinding binding = getBinding();
        binding.employerButton.setLoading(isLoading);
        binding.employerNameEditText.setEnabled(!isLoading);
        binding.employerIndustryDropdown.setEnabled(!isLoading);
        binding.employerDescriptionDropdown.setEnabled(!isLoading);
    }

    private final String findKeyFromValue(Map<String, String> map, String value) {
        Object next;
        Iterator<T> it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual((String) ((Map.Entry) next).getValue(), value)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (String) entry.getKey();
        }
        return null;
    }

    private final void showBottomSheet(DropdownType dropdownType) {
        Map<String, String> industries;
        ChooseEmployerBottomSheetFragment.Companion companion = ChooseEmployerBottomSheetFragment.INSTANCE;
        int i = WhenMappings.$EnumSwitchMapping$0[dropdownType.ordinal()];
        if (i == 1) {
            industries = ((Args) INSTANCE.getArgs((Fragment) this)).getEmployerTypes().getIndustries();
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            industries = ((Args) INSTANCE.getArgs((Fragment) this)).getEmployerTypes().getOccupations();
        }
        ChooseEmployerBottomSheetFragment chooseEmployerBottomSheetFragment = (ChooseEmployerBottomSheetFragment) companion.newInstance((Parcelable) new ChooseEmployerBottomSheetFragment.Args(dropdownType, CollectionsKt.toList(industries.values())));
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        chooseEmployerBottomSheetFragment.show(childFragmentManager, BOTTOM_SHEET_TAG);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ChooseEmployerFragment.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bj\u0002\b\u0005j\u0002\b\u0006¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/employment/ui/ChooseEmployerFragment$DropdownType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "OCCUPATION", "INDUSTRY", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-employment_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DropdownType implements Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ DropdownType[] $VALUES;
        public static final Parcelable.Creator<DropdownType> CREATOR;
        public static final DropdownType OCCUPATION = new DropdownType("OCCUPATION", 0);
        public static final DropdownType INDUSTRY = new DropdownType("INDUSTRY", 1);

        /* compiled from: ChooseEmployerFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<DropdownType> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DropdownType createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return DropdownType.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DropdownType[] newArray(int i) {
                return new DropdownType[i];
            }
        }

        private static final /* synthetic */ DropdownType[] $values() {
            return new DropdownType[]{OCCUPATION, INDUSTRY};
        }

        public static EnumEntries<DropdownType> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(name());
        }

        private DropdownType(String str, int i) {
        }

        static {
            DropdownType[] dropdownTypeArr$values = $values();
            $VALUES = dropdownTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(dropdownTypeArr$values);
            CREATOR = new Creator();
        }

        public static DropdownType valueOf(String str) {
            return (DropdownType) Enum.valueOf(DropdownType.class, str);
        }

        public static DropdownType[] values() {
            return (DropdownType[]) $VALUES.clone();
        }
    }

    /* compiled from: ChooseEmployerFragment.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J3\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0013\u0010\u001b\u001a\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001f\u001a\u00020\tHÖ\u0001J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001aR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/employment/ui/ChooseEmployerFragment$Args;", "Landroid/os/Parcelable;", "employerTypes", "Lcom/robinhood/models/ui/bonfire/UiEmployerType;", "employmentStatus", "Lcom/robinhood/models/api/identi/ApiEmploymentInfo$EmploymentStatus;", "shouldRouteToEmployerAddressUpdate", "", "initialEmployerName", "", "<init>", "(Lcom/robinhood/models/ui/bonfire/UiEmployerType;Lcom/robinhood/models/api/identi/ApiEmploymentInfo$EmploymentStatus;ZLjava/lang/String;)V", "getEmployerTypes", "()Lcom/robinhood/models/ui/bonfire/UiEmployerType;", "getEmploymentStatus", "()Lcom/robinhood/models/api/identi/ApiEmploymentInfo$EmploymentStatus;", "getShouldRouteToEmployerAddressUpdate", "()Z", "getInitialEmployerName", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-employment_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final UiEmployerType employerTypes;
        private final ApiEmploymentInfo.EmploymentStatus employmentStatus;
        private final String initialEmployerName;
        private final boolean shouldRouteToEmployerAddressUpdate;

        /* compiled from: ChooseEmployerFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((UiEmployerType) parcel.readParcelable(Args.class.getClassLoader()), (ApiEmploymentInfo.EmploymentStatus) parcel.readParcelable(Args.class.getClassLoader()), parcel.readInt() != 0, parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, UiEmployerType uiEmployerType, ApiEmploymentInfo.EmploymentStatus employmentStatus, boolean z, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                uiEmployerType = args.employerTypes;
            }
            if ((i & 2) != 0) {
                employmentStatus = args.employmentStatus;
            }
            if ((i & 4) != 0) {
                z = args.shouldRouteToEmployerAddressUpdate;
            }
            if ((i & 8) != 0) {
                str = args.initialEmployerName;
            }
            return args.copy(uiEmployerType, employmentStatus, z, str);
        }

        /* renamed from: component1, reason: from getter */
        public final UiEmployerType getEmployerTypes() {
            return this.employerTypes;
        }

        /* renamed from: component2, reason: from getter */
        public final ApiEmploymentInfo.EmploymentStatus getEmploymentStatus() {
            return this.employmentStatus;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getShouldRouteToEmployerAddressUpdate() {
            return this.shouldRouteToEmployerAddressUpdate;
        }

        /* renamed from: component4, reason: from getter */
        public final String getInitialEmployerName() {
            return this.initialEmployerName;
        }

        public final Args copy(UiEmployerType employerTypes, ApiEmploymentInfo.EmploymentStatus employmentStatus, boolean shouldRouteToEmployerAddressUpdate, String initialEmployerName) {
            Intrinsics.checkNotNullParameter(employerTypes, "employerTypes");
            Intrinsics.checkNotNullParameter(employmentStatus, "employmentStatus");
            return new Args(employerTypes, employmentStatus, shouldRouteToEmployerAddressUpdate, initialEmployerName);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return Intrinsics.areEqual(this.employerTypes, args.employerTypes) && this.employmentStatus == args.employmentStatus && this.shouldRouteToEmployerAddressUpdate == args.shouldRouteToEmployerAddressUpdate && Intrinsics.areEqual(this.initialEmployerName, args.initialEmployerName);
        }

        public int hashCode() {
            int iHashCode = ((((this.employerTypes.hashCode() * 31) + this.employmentStatus.hashCode()) * 31) + Boolean.hashCode(this.shouldRouteToEmployerAddressUpdate)) * 31;
            String str = this.initialEmployerName;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Args(employerTypes=" + this.employerTypes + ", employmentStatus=" + this.employmentStatus + ", shouldRouteToEmployerAddressUpdate=" + this.shouldRouteToEmployerAddressUpdate + ", initialEmployerName=" + this.initialEmployerName + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.employerTypes, flags);
            dest.writeParcelable(this.employmentStatus, flags);
            dest.writeInt(this.shouldRouteToEmployerAddressUpdate ? 1 : 0);
            dest.writeString(this.initialEmployerName);
        }

        public Args(UiEmployerType employerTypes, ApiEmploymentInfo.EmploymentStatus employmentStatus, boolean z, String str) {
            Intrinsics.checkNotNullParameter(employerTypes, "employerTypes");
            Intrinsics.checkNotNullParameter(employmentStatus, "employmentStatus");
            this.employerTypes = employerTypes;
            this.employmentStatus = employmentStatus;
            this.shouldRouteToEmployerAddressUpdate = z;
            this.initialEmployerName = str;
        }

        public /* synthetic */ Args(UiEmployerType uiEmployerType, ApiEmploymentInfo.EmploymentStatus employmentStatus, boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(uiEmployerType, employmentStatus, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : str);
        }

        public final UiEmployerType getEmployerTypes() {
            return this.employerTypes;
        }

        public final ApiEmploymentInfo.EmploymentStatus getEmploymentStatus() {
            return this.employmentStatus;
        }

        public final boolean getShouldRouteToEmployerAddressUpdate() {
            return this.shouldRouteToEmployerAddressUpdate;
        }

        public final String getInitialEmployerName() {
            return this.initialEmployerName;
        }
    }

    /* compiled from: ChooseEmployerFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/employment/ui/ChooseEmployerFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/employment/ui/ChooseEmployerFragment;", "Lcom/robinhood/android/employment/ui/ChooseEmployerFragment$Args;", "<init>", "()V", "BOTTOM_SHEET_TAG", "", "feature-employment_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<ChooseEmployerFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(ChooseEmployerFragment chooseEmployerFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, chooseEmployerFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public ChooseEmployerFragment newInstance(Args args) {
            return (ChooseEmployerFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(ChooseEmployerFragment chooseEmployerFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, chooseEmployerFragment, args);
        }
    }
}
