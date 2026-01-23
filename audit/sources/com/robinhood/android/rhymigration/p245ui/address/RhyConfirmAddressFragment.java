package com.robinhood.android.rhymigration.p245ui.address;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.jakewharton.rxbinding3.view.RxView;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.autoeventlogging.ViewsKt;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.rhymigration.p086ui.callbacks.RhyConfirmAddressCallbacks;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.progress.RdsSegmentedProgressBar;
import com.robinhood.android.designsystem.row.RdsSettingsRowView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.navigation.app.keys.data.ChooseAddressResult;
import com.robinhood.android.navigation.app.keys.data.ChooseAddressSource;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.rhymigration.C27577R;
import com.robinhood.android.rhymigration.databinding.FragmentRhyConfirmAddressBinding;
import com.robinhood.android.rhymigration.p245ui.RhyOnboardingLoggingUtils;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.p355ui.identi.ShippingAddress;
import com.robinhood.models.p355ui.identi.UiAddress;
import com.robinhood.models.p355ui.identi.UsAddress;
import com.robinhood.rosetta.eventlogging.AgreementContext;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.PerformanceMetricEventData;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
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

/* compiled from: RhyConfirmAddressFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 =2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001=B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010!\u001a\u00020\"H\u0016J\u001a\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\u0010\u0010(\u001a\u00020\"2\u0006\u0010)\u001a\u00020*H\u0016J\u0010\u0010+\u001a\u00020\"2\u0006\u0010,\u001a\u00020-H\u0002J\"\u0010.\u001a\u00020\"2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002002\b\u00102\u001a\u0004\u0018\u000103H\u0016J\u0010\u00104\u001a\u00020\"2\u0006\u00105\u001a\u000206H\u0002J\t\u00107\u001a\u000206H\u0096\u0001R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0018\u00108\u001a\b\u0012\u0004\u0012\u00020:09X\u0096\u0005¢\u0006\u0006\u001a\u0004\b;\u0010<¨\u0006>"}, m3636d2 = {"Lcom/robinhood/android/rhymigration/ui/address/RhyConfirmAddressFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "duxo", "Lcom/robinhood/android/rhymigration/ui/address/RhyConfirmAddressDuxo;", "getDuxo", "()Lcom/robinhood/android/rhymigration/ui/address/RhyConfirmAddressDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "binding", "Lcom/robinhood/android/rhymigration/databinding/FragmentRhyConfirmAddressBinding;", "getBinding", "()Lcom/robinhood/android/rhymigration/databinding/FragmentRhyConfirmAddressBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/common/rhymigration/ui/callbacks/RhyConfirmAddressCallbacks;", "getCallbacks", "()Lcom/robinhood/android/common/rhymigration/ui/callbacks/RhyConfirmAddressCallbacks;", "callbacks$delegate", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "onStart", "", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "bind", "state", "Lcom/robinhood/android/rhymigration/ui/address/RhyConfirmAddressViewState;", "onActivityResult", "requestCode", "", "resultCode", WebsocketGatewayConstants.DATA_KEY, "Landroid/content/Intent;", "onLoading", "isLoading", "", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class RhyConfirmAddressFragment extends BaseFragment implements RegionGated, AutoLoggableFragment {
    public static final int SHIPPING_ADDRESS_REQUEST_CODE = 1;
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public EventLogger eventLogger;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RhyConfirmAddressFragment.class, "binding", "getBinding()Lcom/robinhood/android/rhymigration/databinding/FragmentRhyConfirmAddressBinding;", 0)), Reflection.property1(new PropertyReference1Impl(RhyConfirmAddressFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/common/rhymigration/ui/callbacks/RhyConfirmAddressCallbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
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
    public boolean getExcludeFromAutoScreenEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenEventLogging(this);
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

    public RhyConfirmAddressFragment() {
        super(C27577R.layout.fragment_rhy_confirm_address);
        this.$$delegate_0 = new RegionGated2(SpendingRegionGate.INSTANCE);
        this.duxo = OldDuxos.oldDuxo(this, RhyConfirmAddressDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, RhyConfirmAddressFragment2.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(RhyConfirmAddressCallbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.rhymigration.ui.address.RhyConfirmAddressFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (android.content.Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof RhyConfirmAddressCallbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
    }

    public final EventLogger getEventLogger() {
        EventLogger eventLogger = this.eventLogger;
        if (eventLogger != null) {
            return eventLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final void setEventLogger(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "<set-?>");
        this.eventLogger = eventLogger;
    }

    private final RhyConfirmAddressDuxo getDuxo() {
        return (RhyConfirmAddressDuxo) this.duxo.getValue();
    }

    private final FragmentRhyConfirmAddressBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentRhyConfirmAddressBinding) value;
    }

    private final RhyConfirmAddressCallbacks getCallbacks() {
        return (RhyConfirmAddressCallbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return new Screen(Screen.Name.RHY_MIGRATION_CONFIRM_ADDRESS, null, null, null, 14, null);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        EventLogger.DefaultImpls.logAppear$default(getEventLogger(), null, getEventScreen(), null, null, RhyOnboardingLoggingUtils.getEventContext$default(this, (AgreementContext) null, (String) null, 3, (Object) null), 13, null);
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C275971(this));
    }

    /* compiled from: RhyConfirmAddressFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.rhymigration.ui.address.RhyConfirmAddressFragment$onStart$1 */
    /* synthetic */ class C275971 extends FunctionReferenceImpl implements Function1<RhyConfirmAddressViewState, Unit> {
        C275971(Object obj) {
            super(1, obj, RhyConfirmAddressFragment.class, "bind", "bind(Lcom/robinhood/android/rhymigration/ui/address/RhyConfirmAddressViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RhyConfirmAddressViewState rhyConfirmAddressViewState) {
            invoke2(rhyConfirmAddressViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(RhyConfirmAddressViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((RhyConfirmAddressFragment) this.receiver).bind(p0);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        LifecycleHost.DefaultImpls.bind$default(this, RxView.layoutChanges(requireToolbar()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.rhymigration.ui.address.RhyConfirmAddressFragment$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyConfirmAddressFragment.onViewCreated$lambda$0(this.f$0, (Unit) obj);
            }
        });
        requireToolbar().setTitle("");
        RdsButton rhyConfirmAddressCta = getBinding().rhyConfirmAddressCta;
        Intrinsics.checkNotNullExpressionValue(rhyConfirmAddressCta, "rhyConfirmAddressCta");
        ViewsKt.eventData$default(rhyConfirmAddressCta, false, new Function0() { // from class: com.robinhood.android.rhymigration.ui.address.RhyConfirmAddressFragment$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RhyConfirmAddressFragment.onViewCreated$lambda$1(this.f$0);
            }
        }, 1, null);
        RhTextView rhTextView = getBinding().rhyConfirmAddressTitle;
        Companion companion = INSTANCE;
        if (((LegacyFragmentKey.RhyConfirmAddress) companion.getArgs((Fragment) this)).getShowShippingAddress()) {
            i = C27577R.string.rhy_confirm_address_title;
        } else {
            i = C27577R.string.rhy_confirm_address_residential_title;
        }
        rhTextView.setText(i);
        RhTextView rhTextView2 = getBinding().rhyConfirmAddressSubtitle;
        if (((LegacyFragmentKey.RhyConfirmAddress) companion.getArgs((Fragment) this)).getShowShippingAddress()) {
            i2 = C27577R.string.rhy_confirm_address_subtitle;
        } else {
            i2 = C27577R.string.rhy_confirm_address_residential_subtitle;
        }
        rhTextView2.setText(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(RhyConfirmAddressFragment rhyConfirmAddressFragment, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ScrollView rhyConfirmAddressScrollView = rhyConfirmAddressFragment.getBinding().rhyConfirmAddressScrollView;
        Intrinsics.checkNotNullExpressionValue(rhyConfirmAddressScrollView, "rhyConfirmAddressScrollView");
        RhToolbar rhToolbar = rhyConfirmAddressFragment.getRhToolbar();
        com.robinhood.utils.extensions.ViewsKt.setMarginTop(rhyConfirmAddressScrollView, rhToolbar != null ? rhToolbar.getBottom() : 0);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor onViewCreated$lambda$1(RhyConfirmAddressFragment rhyConfirmAddressFragment) {
        return new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.RHY_MIGRATION_CONFIRM_ADDRESS, RhyOnboardingLoggingUtils.getEventContext$default(rhyConfirmAddressFragment, (AgreementContext) null, (String) null, 3, (Object) null), null, null, 51, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        if (((LegacyFragmentKey.RhyConfirmAddress) INSTANCE.getArgs((Fragment) this)).getIsInCmSunset()) {
            toolbar.getProgressBar().setNumSegments(3);
            RdsSegmentedProgressBar.setProgress$default(toolbar.getProgressBar(), 1, 0.5f, false, 4, null);
            toolbar.getProgressBar().setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bind(final RhyConfirmAddressViewState state) {
        final UiAddress address;
        Throwable thConsume;
        UiEvent<Throwable> shippingAddressError = state.getShippingAddressError();
        if (shippingAddressError != null && (thConsume = shippingAddressError.consume()) != null) {
            getCallbacks().onAddressError(thConsume);
        }
        onLoading(state.getIsLoading());
        RdsSettingsRowView rdsSettingsRowView = getBinding().rhyConfirmAddressRow;
        final UiAddress address2 = state.getAddress();
        if (address2 != null) {
            rdsSettingsRowView.setValueText(address2.getDisplayMultiline());
            Intrinsics.checkNotNull(rdsSettingsRowView);
            ViewsKt.eventData$default(rdsSettingsRowView, false, new Function0() { // from class: com.robinhood.android.rhymigration.ui.address.RhyConfirmAddressFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RhyConfirmAddressFragment.bind$lambda$5$lambda$3(this.f$0);
                }
            }, 1, null);
            OnClickListeners.onClick(rdsSettingsRowView, new Function0() { // from class: com.robinhood.android.rhymigration.ui.address.RhyConfirmAddressFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RhyConfirmAddressFragment.bind$lambda$5$lambda$4(this.f$0, address2);
                }
            });
        }
        RdsSettingsRowView rdsSettingsRowView2 = getBinding().rhyConfirmShippingAddressRow;
        ShippingAddress shippingAddress = state.getShippingAddress();
        if (shippingAddress != null && (address = shippingAddress.getAddress()) != null) {
            rdsSettingsRowView2.setValueText(address.getDisplayMultiline());
            rdsSettingsRowView2.setVisibility(0);
            Intrinsics.checkNotNull(rdsSettingsRowView2);
            ViewsKt.eventData$default(rdsSettingsRowView2, false, new Function0() { // from class: com.robinhood.android.rhymigration.ui.address.RhyConfirmAddressFragment$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RhyConfirmAddressFragment.bind$lambda$8$lambda$6(this.f$0);
                }
            }, 1, null);
            OnClickListeners.onClick(rdsSettingsRowView2, new Function0() { // from class: com.robinhood.android.rhymigration.ui.address.RhyConfirmAddressFragment$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RhyConfirmAddressFragment.bind$lambda$8$lambda$7(this.f$0, address);
                }
            });
        }
        RdsButton rhyConfirmAddressCta = getBinding().rhyConfirmAddressCta;
        Intrinsics.checkNotNullExpressionValue(rhyConfirmAddressCta, "rhyConfirmAddressCta");
        OnClickListeners.onClick(rhyConfirmAddressCta, new Function0() { // from class: com.robinhood.android.rhymigration.ui.address.RhyConfirmAddressFragment$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RhyConfirmAddressFragment.bind$lambda$9(this.f$0, state);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor bind$lambda$5$lambda$3(RhyConfirmAddressFragment rhyConfirmAddressFragment) {
        return new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.RHY_MIGRATION_EDIT_ADDRESS, RhyOnboardingLoggingUtils.getEventContext$default(rhyConfirmAddressFragment, (AgreementContext) null, (String) null, 3, (Object) null), null, null, 51, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$5$lambda$4(RhyConfirmAddressFragment rhyConfirmAddressFragment, UiAddress uiAddress) {
        Navigator navigator = rhyConfirmAddressFragment.getNavigator();
        android.content.Context contextRequireContext = rhyConfirmAddressFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new LegacyIntentKey.ChooseAddress(ChooseAddressSource.SETTINGS_MODIFY_RESIDENTIAL, uiAddress.getCountry(), null, null, true, 12, null), null, false, null, null, 60, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor bind$lambda$8$lambda$6(RhyConfirmAddressFragment rhyConfirmAddressFragment) {
        return new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.RHY_MIGRATION_EDIT_ADDRESS, RhyOnboardingLoggingUtils.getEventContext$default(rhyConfirmAddressFragment, (AgreementContext) null, (String) null, 3, (Object) null), null, null, 51, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$8$lambda$7(RhyConfirmAddressFragment rhyConfirmAddressFragment, UiAddress uiAddress) {
        Navigator.DefaultImpls.startActivityForResult$default(rhyConfirmAddressFragment.getNavigator(), (Fragment) rhyConfirmAddressFragment, (IntentKey) new LegacyIntentKey.ChooseAddress(ChooseAddressSource.CASH_MANAGEMENT_SHIPPING, uiAddress.getCountry(), null, null, true, 12, null), 1, (PerformanceMetricEventData.Source) null, false, (Function1) null, (NavigationType) null, 120, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$9(RhyConfirmAddressFragment rhyConfirmAddressFragment, RhyConfirmAddressViewState rhyConfirmAddressViewState) {
        rhyConfirmAddressFragment.getCallbacks().onAddressConfirmed(rhyConfirmAddressViewState.getShippingAddress());
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 1 && resultCode == -1) {
            Intrinsics.checkNotNull(data);
            Parcelable parcelableExtra = data.getParcelableExtra(ChooseAddressResult.EXTRA_ADDRESS_RESULT);
            Intrinsics.checkNotNull(parcelableExtra);
            UiAddress address = ((ChooseAddressResult) parcelableExtra).getAddress();
            if (address instanceof UsAddress) {
                getDuxo().submitShippingAddress((UsAddress) address);
                return;
            }
            RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            RhDialogFragment.Builder message = companion.create(contextRequireContext).setTitle(C11048R.string.general_error_title, new Object[0]).setMessage(C11048R.string.general_error_feature_not_available_in_region, new Object[0]);
            FragmentManager parentFragmentManager = getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
            RhDialogFragment.Builder.show$default(message, parentFragmentManager, "country-not-available", false, 4, null);
        }
    }

    private final void onLoading(boolean isLoading) {
        requireToolbar().setLoadingViewVisible(isLoading);
        getBinding().rhyConfirmAddressCta.setLoading(isLoading);
    }

    /* compiled from: RhyConfirmAddressFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/rhymigration/ui/address/RhyConfirmAddressFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/rhymigration/ui/address/RhyConfirmAddressFragment;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$RhyConfirmAddress;", "<init>", "()V", "SHIPPING_ADDRESS_REQUEST_CODE", "", "feature-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<RhyConfirmAddressFragment, LegacyFragmentKey.RhyConfirmAddress> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(LegacyFragmentKey.RhyConfirmAddress rhyConfirmAddress) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, rhyConfirmAddress);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public LegacyFragmentKey.RhyConfirmAddress getArgs(RhyConfirmAddressFragment rhyConfirmAddressFragment) {
            return (LegacyFragmentKey.RhyConfirmAddress) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, rhyConfirmAddressFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public RhyConfirmAddressFragment newInstance(LegacyFragmentKey.RhyConfirmAddress rhyConfirmAddress) {
            return (RhyConfirmAddressFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, rhyConfirmAddress);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(RhyConfirmAddressFragment rhyConfirmAddressFragment, LegacyFragmentKey.RhyConfirmAddress rhyConfirmAddress) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, rhyConfirmAddressFragment, rhyConfirmAddress);
        }
    }
}
