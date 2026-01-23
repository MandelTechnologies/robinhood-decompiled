package com.robinhood.android.support.call;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.jakewharton.rxbinding3.widget.RxTextView;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.AutoLoggingConfig;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.autoeventlogging.ViewsKt;
import com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.InternationalInfo;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.button.RdsTextButton;
import com.robinhood.android.designsystem.textinput.RdsFormattedEditText;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.rosetta.eventlogging.CXInquiryContext;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.common.contracts.SelectCountryCodeFragmentKey;
import com.robinhood.shared.support.C39996R;
import com.robinhood.shared.support.databinding.FragmentPhoneEditBottomSheetBinding;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsAndCallbacksCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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

/* compiled from: PhoneEditBottomSheetFragment.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 02\u00020\u00012\u00020\u00022\u00020\u0003:\u0003./0B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010!\u001a\u00020\"H\u0016J\u001a\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\u0010\u0010(\u001a\u00020\"2\u0006\u0010)\u001a\u00020*H\u0016J\u0010\u0010+\u001a\u00020\"2\u0006\u0010,\u001a\u00020-H\u0002R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u001cX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u001cX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001e¨\u00061"}, m3636d2 = {"Lcom/robinhood/android/support/call/PhoneEditBottomSheetFragment;", "Lcom/robinhood/android/common/ui/BaseBottomSheetDialogFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "Lcom/robinhood/shared/common/contracts/SelectCountryCodeFragmentKey$Callbacks;", "<init>", "()V", "duxo", "Lcom/robinhood/android/support/call/PhoneEditBottomSheetDuxo;", "getDuxo", "()Lcom/robinhood/android/support/call/PhoneEditBottomSheetDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "binding", "Lcom/robinhood/shared/support/databinding/FragmentPhoneEditBottomSheetBinding;", "getBinding", "()Lcom/robinhood/shared/support/databinding/FragmentPhoneEditBottomSheetBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/support/call/PhoneEditBottomSheetFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/support/call/PhoneEditBottomSheetFragment$Callbacks;", "callbacks$delegate", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "excludeFromAutoScreenEventLogging", "", "getExcludeFromAutoScreenEventLogging", "()Z", "excludeFromSourceLogging", "getExcludeFromSourceLogging", "onStart", "", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onCountryCodeSelected", "countryCode", "Lcom/robinhood/iso/countrycode/CountryCode;", "bind", "state", "Lcom/robinhood/android/support/call/PhoneEditBottomSheetViewState;", "Callbacks", "Args", "Companion", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class PhoneEditBottomSheetFragment extends BaseBottomSheetDialogFragment implements AutoLoggableFragment, SelectCountryCodeFragmentKey.Callbacks {
    private static final String SELECT_COUNTRY_CODE_BOTTOM_SHEET_TAG = "selectCountryCodeBottomSheetTag";

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private final boolean excludeFromAutoScreenEventLogging;
    private final boolean excludeFromSourceLogging;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(PhoneEditBottomSheetFragment.class, "binding", "getBinding()Lcom/robinhood/shared/support/databinding/FragmentPhoneEditBottomSheetBinding;", 0)), Reflection.property1(new PropertyReference1Impl(PhoneEditBottomSheetFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/support/call/PhoneEditBottomSheetFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InternationalInfo US_INFO = InternationalInfo.Companion.fromCountryCode$default(InternationalInfo.INSTANCE, null, CountryCode.Supported.UnitedStates.INSTANCE, 1, null);

    /* compiled from: PhoneEditBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/support/call/PhoneEditBottomSheetFragment$Callbacks;", "", "onPhoneNumberEdited", "", "phoneNumber", "", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onPhoneNumberEdited(String phoneNumber);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenAppearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenAppearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenDisappearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenDisappearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenSourceEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenSourceEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Component getScreenEventComponent() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventComponent(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Context getScreenEventContext() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventContext(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    public PhoneEditBottomSheetFragment() {
        super(C39996R.layout.fragment_phone_edit_bottom_sheet);
        this.duxo = OldDuxos.oldDuxo(this, PhoneEditBottomSheetDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, PhoneEditBottomSheetFragment2.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.support.call.PhoneEditBottomSheetFragment$special$$inlined$targetFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment targetFragment = CallbacksProperty.getTargetFragment();
                if (targetFragment != null) {
                    return targetFragment;
                }
                throw new IllegalStateException("Required value was null.");
            }
        });
        this.excludeFromAutoScreenEventLogging = true;
        this.excludeFromSourceLogging = true;
    }

    private final PhoneEditBottomSheetDuxo getDuxo() {
        return (PhoneEditBottomSheetDuxo) this.duxo.getValue();
    }

    private final FragmentPhoneEditBottomSheetBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentPhoneEditBottomSheetBinding) value;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return ((Args) INSTANCE.getArgs((Fragment) this)).getScreen();
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenEventLogging() {
        return this.excludeFromAutoScreenEventLogging;
    }

    @Override // com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public boolean getExcludeFromSourceLogging() {
        return this.excludeFromSourceLogging;
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        getDuxo().setInternationalInfo(US_INFO);
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C288851(this));
    }

    /* compiled from: PhoneEditBottomSheetFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.support.call.PhoneEditBottomSheetFragment$onStart$1 */
    /* synthetic */ class C288851 extends FunctionReferenceImpl implements Function1<PhoneEditBottomSheetViewState, Unit> {
        C288851(Object obj) {
            super(1, obj, PhoneEditBottomSheetFragment.class, "bind", "bind(Lcom/robinhood/android/support/call/PhoneEditBottomSheetViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PhoneEditBottomSheetViewState phoneEditBottomSheetViewState) {
            invoke2(phoneEditBottomSheetViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PhoneEditBottomSheetViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((PhoneEditBottomSheetFragment) this.receiver).bind(p0);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        RdsFormattedEditText rdsFormattedEditText = getBinding().phoneEditInput;
        InternationalInfo internationalInfo = US_INFO;
        rdsFormattedEditText.setTemplate(internationalInfo.getCountryCodePhoneNumberTemplate(), internationalInfo.getCountryCodePhoneNumberHint());
        RdsFormattedEditText phoneEditInput = getBinding().phoneEditInput;
        Intrinsics.checkNotNullExpressionValue(phoneEditInput, "phoneEditInput");
        LifecycleHost.DefaultImpls.bind$default(this, RxTextView.textChanges(phoneEditInput), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.support.call.PhoneEditBottomSheetFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PhoneEditBottomSheetFragment.onViewCreated$lambda$0(this.f$0, (CharSequence) obj);
            }
        });
        RdsTextButton phoneEditChangeCountryCodeBtn = getBinding().phoneEditChangeCountryCodeBtn;
        Intrinsics.checkNotNullExpressionValue(phoneEditChangeCountryCodeBtn, "phoneEditChangeCountryCodeBtn");
        OnClickListeners.onClick(phoneEditChangeCountryCodeBtn, new Function0() { // from class: com.robinhood.android.support.call.PhoneEditBottomSheetFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PhoneEditBottomSheetFragment.onViewCreated$lambda$2(this.f$0);
            }
        });
        RdsButton phoneEditCancelBtn = getBinding().phoneEditCancelBtn;
        Intrinsics.checkNotNullExpressionValue(phoneEditCancelBtn, "phoneEditCancelBtn");
        OnClickListeners.onClick(phoneEditCancelBtn, new Function0() { // from class: com.robinhood.android.support.call.PhoneEditBottomSheetFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PhoneEditBottomSheetFragment.onViewCreated$lambda$3(this.f$0);
            }
        });
        RdsFormattedEditText phoneEditInput2 = getBinding().phoneEditInput;
        Intrinsics.checkNotNullExpressionValue(phoneEditInput2, "phoneEditInput");
        keyboardFocusOn(phoneEditInput2);
        ViewsKt.setLoggingConfig(view, new AutoLoggingConfig(false, false, 2, null));
        ViewsKt.eventData$default(view, false, new Function0() { // from class: com.robinhood.android.support.call.PhoneEditBottomSheetFragment$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PhoneEditBottomSheetFragment.onViewCreated$lambda$4(this.f$0);
            }
        }, 1, null);
        RdsButton phoneEditSaveBtn = getBinding().phoneEditSaveBtn;
        Intrinsics.checkNotNullExpressionValue(phoneEditSaveBtn, "phoneEditSaveBtn");
        ViewsKt.eventData$default(phoneEditSaveBtn, false, new Function0() { // from class: com.robinhood.android.support.call.PhoneEditBottomSheetFragment$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PhoneEditBottomSheetFragment.onViewCreated$lambda$5();
            }
        }, 1, null);
        RdsButton phoneEditCancelBtn2 = getBinding().phoneEditCancelBtn;
        Intrinsics.checkNotNullExpressionValue(phoneEditCancelBtn2, "phoneEditCancelBtn");
        ViewsKt.eventData$default(phoneEditCancelBtn2, false, new Function0() { // from class: com.robinhood.android.support.call.PhoneEditBottomSheetFragment$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PhoneEditBottomSheetFragment.onViewCreated$lambda$6();
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(PhoneEditBottomSheetFragment phoneEditBottomSheetFragment, CharSequence it) {
        Intrinsics.checkNotNullParameter(it, "it");
        phoneEditBottomSheetFragment.getDuxo().setPhoneNumberTypedText(phoneEditBottomSheetFragment.getBinding().phoneEditInput.getTypedText());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$2(PhoneEditBottomSheetFragment phoneEditBottomSheetFragment) {
        Navigator navigator = phoneEditBottomSheetFragment.getNavigator();
        List<InternationalInfo> sortedInternationalInfos = InternationalInfo.INSTANCE.getSortedInternationalInfos();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(sortedInternationalInfos, 10));
        Iterator<T> it = sortedInternationalInfos.iterator();
        while (it.hasNext()) {
            arrayList.add(((InternationalInfo) it.next()).getCountryCode());
        }
        Navigator.DefaultImpls.createDialogFragment$default(navigator, new SelectCountryCodeFragmentKey(arrayList, false, 2, null), null, 2, null).show(phoneEditBottomSheetFragment.getChildFragmentManager(), SELECT_COUNTRY_CODE_BOTTOM_SHEET_TAG);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3(PhoneEditBottomSheetFragment phoneEditBottomSheetFragment) {
        phoneEditBottomSheetFragment.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor onViewCreated$lambda$4(PhoneEditBottomSheetFragment phoneEditBottomSheetFragment) {
        Component component = new Component(Component.ComponentType.CX_UPDATE_PHONE_NUMBER_BOTTOM_SHEET, null, null, 6, null);
        String string2 = ((Args) INSTANCE.getArgs((Fragment) phoneEditBottomSheetFragment)).getInquiryId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return new UserInteractionEventDescriptor(null, null, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new CXInquiryContext(string2, null, 2, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -65, -1, -1, -1, 16383, null), component, null, 39, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor onViewCreated$lambda$5() {
        return new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.SAVE, null, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 43, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor onViewCreated$lambda$6() {
        return new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.DISMISS, null, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 43, null);
    }

    @Override // com.robinhood.shared.common.contracts.SelectCountryCodeFragmentKey.Callbacks
    public void onCountryCodeSelected(CountryCode countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        InternationalInfo internationalInfoFromCountryCode$default = InternationalInfo.Companion.fromCountryCode$default(InternationalInfo.INSTANCE, null, countryCode, 1, null);
        getBinding().phoneEditInput.setTemplate(internationalInfoFromCountryCode$default.getCountryCodePhoneNumberTemplate(), internationalInfoFromCountryCode$default.getCountryCodePhoneNumberHint());
        getDuxo().setInternationalInfo(internationalInfoFromCountryCode$default);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bind(final PhoneEditBottomSheetViewState state) {
        getBinding().phoneEditSaveBtn.setEnabled(state.getEnableSaveButton());
        RdsButton phoneEditSaveBtn = getBinding().phoneEditSaveBtn;
        Intrinsics.checkNotNullExpressionValue(phoneEditSaveBtn, "phoneEditSaveBtn");
        OnClickListeners.onClick(phoneEditSaveBtn, new Function0() { // from class: com.robinhood.android.support.call.PhoneEditBottomSheetFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PhoneEditBottomSheetFragment.bind$lambda$7(this.f$0, state);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$7(PhoneEditBottomSheetFragment phoneEditBottomSheetFragment, PhoneEditBottomSheetViewState phoneEditBottomSheetViewState) {
        Callbacks callbacks = phoneEditBottomSheetFragment.getCallbacks();
        String phoneNumberWithCountryCode = phoneEditBottomSheetViewState.getPhoneNumberWithCountryCode();
        Intrinsics.checkNotNull(phoneNumberWithCountryCode);
        callbacks.onPhoneNumberEdited(phoneNumberWithCountryCode);
        phoneEditBottomSheetFragment.dismiss();
        return Unit.INSTANCE;
    }

    /* compiled from: PhoneEditBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/support/call/PhoneEditBottomSheetFragment$Args;", "Landroid/os/Parcelable;", "inquiryId", "Ljava/util/UUID;", "screen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/rosetta/eventlogging/Screen;)V", "getInquiryId", "()Ljava/util/UUID;", "getScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final UUID inquiryId;
        private final Screen screen;

        /* compiled from: PhoneEditBottomSheetFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((UUID) parcel.readSerializable(), (Screen) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, UUID uuid, Screen screen, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = args.inquiryId;
            }
            if ((i & 2) != 0) {
                screen = args.screen;
            }
            return args.copy(uuid, screen);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getInquiryId() {
            return this.inquiryId;
        }

        /* renamed from: component2, reason: from getter */
        public final Screen getScreen() {
            return this.screen;
        }

        public final Args copy(UUID inquiryId, Screen screen) {
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(screen, "screen");
            return new Args(inquiryId, screen);
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
            return Intrinsics.areEqual(this.inquiryId, args.inquiryId) && Intrinsics.areEqual(this.screen, args.screen);
        }

        public int hashCode() {
            return (this.inquiryId.hashCode() * 31) + this.screen.hashCode();
        }

        public String toString() {
            return "Args(inquiryId=" + this.inquiryId + ", screen=" + this.screen + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.inquiryId);
            dest.writeSerializable(this.screen);
        }

        public Args(UUID inquiryId, Screen screen) {
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(screen, "screen");
            this.inquiryId = inquiryId;
            this.screen = screen;
        }

        public final UUID getInquiryId() {
            return this.inquiryId;
        }

        public final Screen getScreen() {
            return this.screen;
        }
    }

    /* compiled from: PhoneEditBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/support/call/PhoneEditBottomSheetFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsAndCallbacksCompanion;", "Lcom/robinhood/android/support/call/PhoneEditBottomSheetFragment;", "Lcom/robinhood/android/support/call/PhoneEditBottomSheetFragment$Args;", "Lcom/robinhood/android/support/call/PhoneEditBottomSheetFragment$Callbacks;", "<init>", "()V", "SELECT_COUNTRY_CODE_BOTTOM_SHEET_TAG", "", "US_INFO", "Lcom/robinhood/android/common/util/InternationalInfo;", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsAndCallbacksCompanion<PhoneEditBottomSheetFragment, Args, Callbacks> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(PhoneEditBottomSheetFragment phoneEditBottomSheetFragment) {
            return (Args) FragmentWithArgsAndCallbacksCompanion.DefaultImpls.getArgs(this, phoneEditBottomSheetFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsAndCallbacksCompanion
        public /* bridge */ /* synthetic */ DialogFragment newInstance(Parcelable parcelable, Fragment fragment, int i) {
            return newInstance((Args) parcelable, (Args) fragment, i);
        }

        public <C extends Fragment & Callbacks> PhoneEditBottomSheetFragment newInstance(Args args, C c, int i) {
            return (PhoneEditBottomSheetFragment) FragmentWithArgsAndCallbacksCompanion.DefaultImpls.newInstance(this, args, c, i);
        }
    }
}
