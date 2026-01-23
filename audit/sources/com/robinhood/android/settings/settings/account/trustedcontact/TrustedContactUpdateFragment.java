package com.robinhood.android.settings.settings.account.trustedcontact;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.Window;
import android.widget.ScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.InternationalInfo;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.common.util.transition.ToolbarScrollAnimator;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.numpad.RdsNumpadView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.navigation.FragmentResolver;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.navigation.app.keys.data.ChooseAddressResult;
import com.robinhood.android.navigation.app.keys.data.ChooseAddressSource;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.settings.settings.C28321R;
import com.robinhood.android.settings.settings.account.trustedcontact.TrustedContactUpdateViewState2;
import com.robinhood.android.settings.settings.databinding.FragmentTrustedContactUpdateBinding;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.models.api.identi.ApiTrustedContact;
import com.robinhood.models.p355ui.identi.UiAddress;
import com.robinhood.models.p355ui.identi.UiAddressKt;
import com.robinhood.rosetta.eventlogging.PerformanceMetricEventData;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.shared.common.contracts.SelectCountryCodeFragmentKey;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.Activity;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;

/* compiled from: TrustedContactUpdateFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 P2\u00020\u00012\u00020\u0002:\u0001PB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0016J\u001a\u0010)\u001a\u00020&2\u0006\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\u0010\u0010.\u001a\u00020&2\u0006\u0010/\u001a\u000200H\u0016J\b\u00101\u001a\u00020&H\u0016J\b\u00102\u001a\u00020&H\u0016J\b\u00103\u001a\u00020&H\u0002J\b\u00104\u001a\u00020&H\u0002J\u0010\u00105\u001a\u00020&2\u0006\u00106\u001a\u000207H\u0002J\u0010\u00108\u001a\u00020&2\u0006\u00109\u001a\u00020\u001bH\u0002J\u0010\u0010:\u001a\u00020&2\u0006\u0010;\u001a\u00020<H\u0002J\u0018\u0010=\u001a\u00020&2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020AH\u0002J\b\u0010B\u001a\u00020&H\u0002J\b\u0010C\u001a\u00020&H\u0002J\u0010\u0010D\u001a\u00020&2\u0006\u0010\u001e\u001a\u00020EH\u0016J\b\u0010F\u001a\u00020&H\u0002J\u001a\u0010G\u001a\u00020\u001b2\u0006\u0010H\u001a\u00020\u00122\b\u0010I\u001a\u0004\u0018\u00010-H\u0016J\b\u0010J\u001a\u00020\u001bH\u0016J\"\u0010K\u001a\u00020&2\u0006\u0010L\u001a\u00020\u00122\u0006\u0010M\u001a\u00020\u00122\b\u0010N\u001a\u0004\u0018\u00010OH\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR/\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u00128B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u001bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010 \u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u0010\u001a\u0004\b\"\u0010#¨\u0006Q"}, m3636d2 = {"Lcom/robinhood/android/settings/settings/account/trustedcontact/TrustedContactUpdateFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/shared/common/contracts/SelectCountryCodeFragmentKey$Callbacks;", "<init>", "()V", "binding", "Lcom/robinhood/android/settings/settings/databinding/FragmentTrustedContactUpdateBinding;", "getBinding", "()Lcom/robinhood/android/settings/settings/databinding/FragmentTrustedContactUpdateBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/settings/settings/account/trustedcontact/TrustedContactUpdateDuxo;", "getDuxo", "()Lcom/robinhood/android/settings/settings/account/trustedcontact/TrustedContactUpdateDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "<set-?>", "", "softInputMode", "getSoftInputMode", "()Ljava/lang/Integer;", "setSoftInputMode", "(Ljava/lang/Integer;)V", "softInputMode$delegate", "Lkotlin/properties/ReadWriteProperty;", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "countryCode", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "toolbarScrollAnimator", "Lcom/robinhood/android/common/util/transition/ToolbarScrollAnimator;", "getToolbarScrollAnimator", "()Lcom/robinhood/android/common/util/transition/ToolbarScrollAnimator;", "toolbarScrollAnimator$delegate", "onAttach", "", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onResume", "onPause", "primeFields", "setupPhoneView", "bindViewState", "viewState", "Lcom/robinhood/android/settings/settings/account/trustedcontact/TrustedContactUpdateViewState;", "onLoading", "loading", "populateFields", "event", "Lcom/robinhood/android/settings/settings/account/trustedcontact/TrustedContactUpdateEvent$SetInputs;", "bindTextInputToNumpad", "input", "Lcom/robinhood/android/settings/settings/account/trustedcontact/TrustedContactTextInput;", "numpad", "Lcom/robinhood/android/designsystem/numpad/RdsNumpadView;", "launchAddressSelection", "removeAddress", "onCountryCodeSelected", "Lcom/robinhood/iso/countrycode/CountryCode;", "showDiscardConfirmation", "onPositiveButtonClicked", "id", "passthroughArgs", "onBackPressed", "onActivityResult", "requestCode", "resultCode", WebsocketGatewayConstants.DATA_KEY, "Landroid/content/Intent;", "Companion", "feature-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class TrustedContactUpdateFragment extends BaseFragment implements SelectCountryCodeFragmentKey.Callbacks {
    private static final String DISCARD_TAG = "discardTrustedContactChanges";
    private static final String FIELD_EMAIL = "email";
    private static final String FIELD_PHONE_NUMBER = "phone_number";
    private static final String SELECT_COUNTRY_CODE_BOTTOM_SHEET_TAG = "selectCountryCode";
    private static final int TRUSTED_CONTACT_ADDRESS_SELECTION = 1;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private CountryCode.Supported countryCode;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;

    /* renamed from: softInputMode$delegate, reason: from kotlin metadata */
    private final Interfaces3 softInputMode;

    /* renamed from: toolbarScrollAnimator$delegate, reason: from kotlin metadata */
    private final Lazy toolbarScrollAnimator;
    private final boolean useDesignSystemToolbar;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(TrustedContactUpdateFragment.class, "binding", "getBinding()Lcom/robinhood/android/settings/settings/databinding/FragmentTrustedContactUpdateBinding;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(TrustedContactUpdateFragment.class, "softInputMode", "getSoftInputMode()Ljava/lang/Integer;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final List<String> expectedErrorFields = CollectionsKt.listOf((Object[]) new String[]{"email", "phone_number"});

    public TrustedContactUpdateFragment() {
        super(C28321R.layout.fragment_trusted_contact_update);
        this.binding = ViewBinding5.viewBinding(this, TrustedContactUpdateFragment2.INSTANCE);
        this.duxo = OldDuxos.oldDuxo(this, TrustedContactUpdateDuxo.class);
        this.softInputMode = BindSavedState2.savedInt(this).provideDelegate(this, $$delegatedProperties[1]);
        this.useDesignSystemToolbar = true;
        this.toolbarScrollAnimator = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.settings.settings.account.trustedcontact.TrustedContactUpdateFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TrustedContactUpdateFragment.toolbarScrollAnimator_delegate$lambda$0(this.f$0);
            }
        });
    }

    private final FragmentTrustedContactUpdateBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentTrustedContactUpdateBinding) value;
    }

    private final TrustedContactUpdateDuxo getDuxo() {
        return (TrustedContactUpdateDuxo) this.duxo.getValue();
    }

    private final Integer getSoftInputMode() {
        return (Integer) this.softInputMode.getValue(this, $$delegatedProperties[1]);
    }

    private final void setSoftInputMode(Integer num) {
        this.softInputMode.setValue(this, $$delegatedProperties[1], num);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    private final ToolbarScrollAnimator getToolbarScrollAnimator() {
        return (ToolbarScrollAnimator) this.toolbarScrollAnimator.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ToolbarScrollAnimator toolbarScrollAnimator_delegate$lambda$0(TrustedContactUpdateFragment trustedContactUpdateFragment) {
        return new ToolbarScrollAnimator(trustedContactUpdateFragment.requireToolbar(), trustedContactUpdateFragment.getResources().getDimension(C11048R.dimen.toolbar_scroll_height), false, false, false, (Float) null, 60, (DefaultConstructorMarker) null);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        ToolbarScrollAnimator toolbarScrollAnimator = getToolbarScrollAnimator();
        ScrollView trustedAccountScrollView = getBinding().trustedAccountScrollView;
        Intrinsics.checkNotNullExpressionValue(trustedAccountScrollView, "trustedAccountScrollView");
        toolbarScrollAnimator.subscribe(trustedAccountScrollView, this);
        primeFields();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C283401(this));
        getBinding().numpad.useDefaultKeyHandler();
        RdsButton trustedContactPrimaryCta = getBinding().trustedContactPrimaryCta;
        Intrinsics.checkNotNullExpressionValue(trustedContactPrimaryCta, "trustedContactPrimaryCta");
        OnClickListeners.onClick(trustedContactPrimaryCta, new C283412(getDuxo()));
        getBinding().trustedContactAddressSelectContainer.setTextOnClick(new C283423(this));
        getBinding().trustedContactAddressSelectContainer.setButtonOnClick(new C283434(this));
    }

    /* compiled from: TrustedContactUpdateFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.settings.settings.account.trustedcontact.TrustedContactUpdateFragment$onViewCreated$1 */
    /* synthetic */ class C283401 extends FunctionReferenceImpl implements Function1<TrustedContactUpdateViewState, Unit> {
        C283401(Object obj) {
            super(1, obj, TrustedContactUpdateFragment.class, "bindViewState", "bindViewState(Lcom/robinhood/android/settings/settings/account/trustedcontact/TrustedContactUpdateViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(TrustedContactUpdateViewState trustedContactUpdateViewState) throws Throwable {
            invoke2(trustedContactUpdateViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(TrustedContactUpdateViewState p0) throws Throwable {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((TrustedContactUpdateFragment) this.receiver).bindViewState(p0);
        }
    }

    /* compiled from: TrustedContactUpdateFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.settings.settings.account.trustedcontact.TrustedContactUpdateFragment$onViewCreated$2 */
    /* synthetic */ class C283412 extends FunctionReferenceImpl implements Function0<Unit> {
        C283412(Object obj) {
            super(0, obj, TrustedContactUpdateDuxo.class, "submitTrustedContact", "submitTrustedContact()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((TrustedContactUpdateDuxo) this.receiver).submitTrustedContact();
        }
    }

    /* compiled from: TrustedContactUpdateFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.settings.settings.account.trustedcontact.TrustedContactUpdateFragment$onViewCreated$3 */
    /* synthetic */ class C283423 extends FunctionReferenceImpl implements Function0<Unit> {
        C283423(Object obj) {
            super(0, obj, TrustedContactUpdateFragment.class, "launchAddressSelection", "launchAddressSelection()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((TrustedContactUpdateFragment) this.receiver).launchAddressSelection();
        }
    }

    /* compiled from: TrustedContactUpdateFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.settings.settings.account.trustedcontact.TrustedContactUpdateFragment$onViewCreated$4 */
    /* synthetic */ class C283434 extends FunctionReferenceImpl implements Function0<Unit> {
        C283434(Object obj) {
            super(0, obj, TrustedContactUpdateFragment.class, "removeAddress", "removeAddress()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((TrustedContactUpdateFragment) this.receiver).removeAddress();
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setTitle(C28321R.string.trusted_contact_title);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        ToolbarScrollAnimator toolbarScrollAnimator = getToolbarScrollAnimator();
        ScrollView trustedAccountScrollView = getBinding().trustedAccountScrollView;
        Intrinsics.checkNotNullExpressionValue(trustedAccountScrollView, "trustedAccountScrollView");
        toolbarScrollAnimator.dispatchScroll(trustedAccountScrollView);
        Window window = requireActivity().getWindow();
        setSoftInputMode(Integer.valueOf(window.getAttributes().softInputMode));
        window.setSoftInputMode(2);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        Integer softInputMode = getSoftInputMode();
        if (softInputMode != null) {
            requireActivity().getWindow().setSoftInputMode(softInputMode.intValue());
        }
        setSoftInputMode(null);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        Activity.hideKeyboard$default(fragmentActivityRequireActivity, false, 1, null);
    }

    private final void primeFields() {
        FragmentTrustedContactUpdateBinding binding = getBinding();
        for (Tuples2 tuples2 : CollectionsKt.listOf((Object[]) new Tuples2[]{Tuples4.m3642to(TrustedContactField.FIRST_NAME, binding.trustedContactFirstNameInput), Tuples4.m3642to(TrustedContactField.LAST_NAME, binding.trustedContactLastNameInput), Tuples4.m3642to(TrustedContactField.EMAIL, binding.trustedContactEmailInput), Tuples4.m3642to(TrustedContactField.PHONE_NUMBER, binding.trustedContactPhoneInput)})) {
            final TrustedContactField trustedContactField = (TrustedContactField) tuples2.component1();
            Object objComponent2 = tuples2.component2();
            Intrinsics.checkNotNullExpressionValue(objComponent2, "component2(...)");
            TrustedContactTextInput trustedContactTextInput = (TrustedContactTextInput) objComponent2;
            trustedContactTextInput.bindTrustedContactField(trustedContactField);
            LifecycleHost.DefaultImpls.bind$default(this, trustedContactTextInput.textChanges(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.settings.settings.account.trustedcontact.TrustedContactUpdateFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TrustedContactUpdateFragment.primeFields$lambda$6$lambda$5$lambda$4(this.f$0, trustedContactField, (CharSequence) obj);
                }
            });
        }
        setupPhoneView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit primeFields$lambda$6$lambda$5$lambda$4(TrustedContactUpdateFragment trustedContactUpdateFragment, TrustedContactField trustedContactField, CharSequence it) {
        Intrinsics.checkNotNullParameter(it, "it");
        trustedContactUpdateFragment.getDuxo().acceptChange(trustedContactField, it.toString());
        return Unit.INSTANCE;
    }

    private final void setupPhoneView() {
        TrustedContactTextInput trustedContactTextInput = getBinding().trustedContactPhoneInput;
        Intrinsics.checkNotNull(trustedContactTextInput);
        RdsNumpadView numpad = getBinding().numpad;
        Intrinsics.checkNotNullExpressionValue(numpad, "numpad");
        bindTextInputToNumpad(trustedContactTextInput, numpad);
        trustedContactTextInput.setTrailingText(trustedContactTextInput.getResources().getString(C28321R.string.trusted_contact_change_country_code));
        trustedContactTextInput.onTrailingButtonClicked(new Function0() { // from class: com.robinhood.android.settings.settings.account.trustedcontact.TrustedContactUpdateFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TrustedContactUpdateFragment.setupPhoneView$lambda$9$lambda$8(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setupPhoneView$lambda$9$lambda$8(TrustedContactUpdateFragment trustedContactUpdateFragment) {
        Navigator navigator = trustedContactUpdateFragment.getNavigator();
        List<InternationalInfo> sortedInternationalInfos = InternationalInfo.INSTANCE.getSortedInternationalInfos();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(sortedInternationalInfos, 10));
        Iterator<T> it = sortedInternationalInfos.iterator();
        while (it.hasNext()) {
            arrayList.add(((InternationalInfo) it.next()).getCountryCode());
        }
        Navigator.DefaultImpls.createDialogFragment$default(navigator, new SelectCountryCodeFragmentKey(arrayList, false, 2, null), null, 2, null).show(trustedContactUpdateFragment.getChildFragmentManager(), SELECT_COUNTRY_CODE_BOTTOM_SHEET_TAG);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindViewState(TrustedContactUpdateViewState viewState) throws Throwable {
        UiEvent<InternationalInfo> initializeInternationalInfoEvent;
        InternationalInfo internationalInfoConsume;
        InternationalInfo internationalInfoConsume2;
        this.countryCode = viewState.getCountryCode();
        FragmentTrustedContactUpdateBinding binding = getBinding();
        binding.trustedContactPrimaryCta.setEnabled(viewState.getSubmittable());
        onLoading(viewState.getLoading());
        RhTextView trustedContactInputTextTitle = binding.trustedContactInputTextTitle;
        Intrinsics.checkNotNullExpressionValue(trustedContactInputTextTitle, "trustedContactInputTextTitle");
        trustedContactInputTextTitle.setVisibility(viewState.getShowAddressInput() ? 0 : 8);
        TrustedContactAddressInput trustedContactAddressSelectContainer = binding.trustedContactAddressSelectContainer;
        Intrinsics.checkNotNullExpressionValue(trustedContactAddressSelectContainer, "trustedContactAddressSelectContainer");
        trustedContactAddressSelectContainer.setVisibility(viewState.getShowAddressInput() ? 0 : 8);
        TrustedContactAddressInput trustedContactAddressInput = binding.trustedContactAddressSelectContainer;
        UiAddress address = viewState.getAddress();
        trustedContactAddressInput.setText(address != null ? address.getCombinedAddressLines() : null);
        binding.trustedContactAddressSelectContainer.setShowButton(!UiAddressKt.isNullOrEmpty(viewState.getAddress()));
        UiEvent<InternationalInfo> initializeInternationalInfoEvent2 = viewState.getInitializeInternationalInfoEvent();
        if (initializeInternationalInfoEvent2 != null && (internationalInfoConsume2 = initializeInternationalInfoEvent2.consume()) != null && ((LegacyFragmentKey.TrustedContactUpdate) INSTANCE.getArgs((Fragment) this)).getTrustedContact() == null) {
            binding.trustedContactPhoneInput.setInternationalInfo(internationalInfoConsume2);
        }
        if (((LegacyFragmentKey.TrustedContactUpdate) INSTANCE.getArgs((Fragment) this)).getTrustedContact() == null && (initializeInternationalInfoEvent = viewState.getInitializeInternationalInfoEvent()) != null && (internationalInfoConsume = initializeInternationalInfoEvent.consume()) != null) {
            getBinding().trustedContactPhoneInput.setInternationalInfo(internationalInfoConsume);
        }
        UiEvent<TrustedContactUpdateViewState2> event = viewState.getEvent();
        TrustedContactUpdateViewState2 trustedContactUpdateViewState2Consume = event != null ? event.consume() : null;
        if (trustedContactUpdateViewState2Consume instanceof TrustedContactUpdateViewState2.SetInputs) {
            populateFields((TrustedContactUpdateViewState2.SetInputs) trustedContactUpdateViewState2Consume);
            return;
        }
        if ((trustedContactUpdateViewState2Consume instanceof TrustedContactUpdateViewState2.SuccessfulSubmission) || Intrinsics.areEqual(trustedContactUpdateViewState2Consume, TrustedContactUpdateViewState2.PopBack.INSTANCE)) {
            requireActivity().finish();
            return;
        }
        if (trustedContactUpdateViewState2Consume instanceof TrustedContactUpdateViewState2.Error) {
            ActivityErrorHandler.Companion companion = ActivityErrorHandler.INSTANCE;
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            ActivityErrorHandler.Companion.handle$default(companion, fragmentActivityRequireActivity, ((TrustedContactUpdateViewState2.Error) trustedContactUpdateViewState2Consume).getError(), true, false, 0, null, 56, null);
            return;
        }
        if (Intrinsics.areEqual(trustedContactUpdateViewState2Consume, TrustedContactUpdateViewState2.ConfirmDiscard.INSTANCE)) {
            showDiscardConfirmation();
        } else if (trustedContactUpdateViewState2Consume != null) {
            throw new NoWhenBranchMatchedException();
        }
    }

    private final void onLoading(boolean loading) {
        requireBaseActivity().showProgressBar(loading);
        getBinding().trustedContactPrimaryCta.setLoading(loading);
    }

    private final void populateFields(TrustedContactUpdateViewState2.SetInputs event) {
        ApiTrustedContact model = event.getModel();
        FragmentTrustedContactUpdateBinding binding = getBinding();
        binding.trustedContactFirstNameInput.setText(model.getFirst_name());
        binding.trustedContactLastNameInput.setText(model.getLast_name());
        binding.trustedContactEmailInput.setText(model.getEmail());
        binding.trustedContactPhoneInput.setInternationalInfo(event.getInternationalInfo());
        binding.trustedContactPhoneInput.setText(event.getPhoneNumberWithoutInternationalInfo());
    }

    private final void bindTextInputToNumpad(TrustedContactTextInput input, final RdsNumpadView numpad) {
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(input.focusChanges()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.settings.settings.account.trustedcontact.TrustedContactUpdateFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TrustedContactUpdateFragment.bindTextInputToNumpad$lambda$14(this.f$0, numpad, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindTextInputToNumpad$lambda$14(TrustedContactUpdateFragment trustedContactUpdateFragment, RdsNumpadView rdsNumpadView, boolean z) {
        if (z) {
            FragmentActivity fragmentActivityRequireActivity = trustedContactUpdateFragment.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            Activity.hideKeyboard$default(fragmentActivityRequireActivity, false, 1, null);
        }
        rdsNumpadView.setVisibility(z ? 0 : 8);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void launchAddressSelection() {
        Navigator navigator = getNavigator();
        ChooseAddressSource chooseAddressSource = ChooseAddressSource.SETTINGS_TRUSTED_CONTACT;
        CountryCode.Supported supported = this.countryCode;
        if (supported == null) {
            return;
        }
        Navigator.DefaultImpls.startActivityForResult$default(navigator, (Fragment) this, (IntentKey) new LegacyIntentKey.ChooseAddress(chooseAddressSource, supported, null, null, false, 28, null), 1, (PerformanceMetricEventData.Source) null, false, (Function1) null, (NavigationType) null, 120, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeAddress() {
        getDuxo().clearAddress();
    }

    @Override // com.robinhood.shared.common.contracts.SelectCountryCodeFragmentKey.Callbacks
    public void onCountryCodeSelected(CountryCode countryCode) {
        Object next;
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Iterator<T> it = InternationalInfo.INSTANCE.getInternationalInfos().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (Intrinsics.areEqual(((InternationalInfo) next).getCountryCode(), countryCode)) {
                    break;
                }
            }
        }
        InternationalInfo internationalInfo = (InternationalInfo) next;
        if (internationalInfo == null) {
            return;
        }
        getBinding().trustedContactPhoneInput.setText("");
        getBinding().trustedContactPhoneInput.setInternationalInfo(internationalInfo);
        getDuxo().onInternationalInfoSelected(internationalInfo);
    }

    private final void showDiscardConfirmation() {
        RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        RhDialogFragment.Builder negativeButton = companion.create(contextRequireContext).setId(C28321R.id.dialog_id_trusted_contact_discard_changes).setUseDesignSystemOverlay(true).setTitle(C28321R.string.trusted_contact_discard_title, new Object[0]).setMessage(C28321R.string.trusted_contact_discard_message, new Object[0]).setPositiveButton(C28321R.string.trusted_contact_discard_action, new Object[0]).setNegativeButton(C11048R.string.general_label_cancel, new Object[0]);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        RhDialogFragment.Builder.show$default(negativeButton, childFragmentManager, DISCARD_TAG, false, 4, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C11048R.id.dialog_id_generic_error) {
            return super.onPositiveButtonClicked(id, passthroughArgs);
        }
        requireActivity().finish();
        return true;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        getDuxo().checkBeforeGoingBack();
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1 && resultCode == -1) {
            ChooseAddressResult chooseAddressResult = data != null ? (ChooseAddressResult) data.getParcelableExtra(ChooseAddressResult.EXTRA_ADDRESS_RESULT) : null;
            Intrinsics.checkNotNull(chooseAddressResult);
            getDuxo().setAddress(chooseAddressResult.getAddress());
        }
    }

    /* compiled from: TrustedContactUpdateFragment.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00030\u0004B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0003H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/settings/settings/account/trustedcontact/TrustedContactUpdateFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/settings/settings/account/trustedcontact/TrustedContactUpdateFragment;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$TrustedContactUpdate;", "Lcom/robinhood/android/navigation/FragmentResolver;", "<init>", "()V", "TRUSTED_CONTACT_ADDRESS_SELECTION", "", "DISCARD_TAG", "", "SELECT_COUNTRY_CODE_BOTTOM_SHEET_TAG", "FIELD_EMAIL", "FIELD_PHONE_NUMBER", "expectedErrorFields", "", "createFragment", "Landroidx/fragment/app/Fragment;", "key", "feature-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<TrustedContactUpdateFragment, LegacyFragmentKey.TrustedContactUpdate>, FragmentResolver<LegacyFragmentKey.TrustedContactUpdate> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public LegacyFragmentKey.TrustedContactUpdate getArgs(TrustedContactUpdateFragment trustedContactUpdateFragment) {
            return (LegacyFragmentKey.TrustedContactUpdate) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, trustedContactUpdateFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public TrustedContactUpdateFragment newInstance(LegacyFragmentKey.TrustedContactUpdate trustedContactUpdate) {
            return (TrustedContactUpdateFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, trustedContactUpdate);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(TrustedContactUpdateFragment trustedContactUpdateFragment, LegacyFragmentKey.TrustedContactUpdate trustedContactUpdate) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, trustedContactUpdateFragment, trustedContactUpdate);
        }

        @Override // com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(LegacyFragmentKey.TrustedContactUpdate key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return newInstance((Parcelable) key);
        }
    }
}
