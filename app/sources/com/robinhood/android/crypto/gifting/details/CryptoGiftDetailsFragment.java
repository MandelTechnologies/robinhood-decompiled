package com.robinhood.android.crypto.gifting.details;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.AutoLoggingConfig;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.extensions.RichTexts;
import com.robinhood.android.crypto.gifting.C12906R;
import com.robinhood.android.crypto.gifting.databinding.FragmentCryptoGiftDetailsBinding;
import com.robinhood.android.crypto.gifting.details.p092ui.DetailsItemListDecorator;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.growth.util.ErrorHandlingExtensions;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.regiongate.CryptoRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.serverclientcomponents.actionbutton.ClientComponentButtonView;
import com.robinhood.android.serverclientcomponents.alert.ClientComponentAlertFragment;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.p355ui.bonfire.cryptogifting.CryptoGiftDetails;
import com.robinhood.models.serverdriven.p347db.GenericAction;
import com.robinhood.models.serverdriven.p347db.RichText;
import com.robinhood.models.serverdriven.p347db.ServerDrivenButton;
import com.robinhood.rosetta.converters.platform.Booleans2;
import com.robinhood.rosetta.eventlogging.Boolean;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.CryptoGiftContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.ThemedResourceReference;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: CryptoGiftDetailsFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 82\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u00018B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0016J\u001a\u0010#\u001a\u00020 2\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\b\u0010(\u001a\u00020 H\u0016J\u0010\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0002J\f\u0010-\u001a\u00020 *\u00020\u0018H\u0002J\u0010\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201H\u0016J\t\u00102\u001a\u00020/H\u0096\u0001R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u00103\u001a\b\u0012\u0004\u0012\u00020504X\u0096\u0005¢\u0006\u0006\u001a\u0004\b6\u00107¨\u00069"}, m3636d2 = {"Lcom/robinhood/android/crypto/gifting/details/CryptoGiftDetailsFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "Lcom/robinhood/android/serverclientcomponents/alert/ClientComponentAlertFragment$Callbacks;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "duxo", "Lcom/robinhood/android/crypto/gifting/details/CryptoGiftDetailsDuxo;", "getDuxo", "()Lcom/robinhood/android/crypto/gifting/details/CryptoGiftDetailsDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "binding", "Lcom/robinhood/android/crypto/gifting/databinding/FragmentCryptoGiftDetailsBinding;", "getBinding", "()Lcom/robinhood/android/crypto/gifting/databinding/FragmentCryptoGiftDetailsBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "itemAdapter", "Lcom/robinhood/android/crypto/gifting/details/CryptoGiftDetailsAdapter;", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "getGiftStatusContext", "Lcom/robinhood/rosetta/eventlogging/CryptoGiftContext;", "viewState", "Lcom/robinhood/android/crypto/gifting/details/CryptoGiftDetailsViewState;", "initViews", "onActionClicked", "", "button", "Lcom/robinhood/models/serverdriven/db/ServerDrivenButton;", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-crypto-gifting_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class CryptoGiftDetailsFragment extends BaseFragment implements AutoLoggableFragment, ClientComponentAlertFragment.Callbacks, RegionGated {
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public EventLogger eventLogger;
    private final Screen eventScreen;
    private final CryptoGiftDetailsAdapter itemAdapter;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(CryptoGiftDetailsFragment.class, "binding", "getBinding()Lcom/robinhood/android/crypto/gifting/databinding/FragmentCryptoGiftDetailsBinding;", 0))};

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

    public CryptoGiftDetailsFragment() {
        super(C12906R.layout.fragment_crypto_gift_details);
        this.$$delegate_0 = new RegionGated2(CryptoRegionGate.INSTANCE);
        this.eventScreen = new Screen(Screen.Name.CRYPTO_GIFT_PURCHASE_DETAILS, getScreenName(), null, null, 12, null);
        this.duxo = OldDuxos.oldDuxo(this, CryptoGiftDetailsDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, CryptoGiftDetailsFragment2.INSTANCE);
        this.itemAdapter = new CryptoGiftDetailsAdapter(new Function1() { // from class: com.robinhood.android.crypto.gifting.details.CryptoGiftDetailsFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoGiftDetailsFragment.itemAdapter$lambda$0(this.f$0, (GenericAction) obj);
            }
        });
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return this.eventScreen;
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

    private final CryptoGiftDetailsDuxo getDuxo() {
        return (CryptoGiftDetailsDuxo) this.duxo.getValue();
    }

    private final FragmentCryptoGiftDetailsBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentCryptoGiftDetailsBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit itemAdapter$lambda$0(CryptoGiftDetailsFragment cryptoGiftDetailsFragment, GenericAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof GenericAction.InfoAlertAction) {
            ErrorHandlingExtensions.showAlert(cryptoGiftDetailsFragment, ((GenericAction.InfoAlertAction) action).getAlert(), "crypto-gift-details-dialog");
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        Toolbar toolbar2 = toolbar.getToolbar();
        setHasOptionsMenu(true);
        toolbar2.setNavigationIcon(ViewsKt.getDrawable(toolbar2, C20690R.drawable.ic_rds_close_24dp));
        toolbar.setColorControlNormalOverride(new ThemedResourceReference(ResourceType.COLOR_STATE_LIST.INSTANCE, C20690R.attr.colorForeground1));
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        initViews(getBinding());
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.crypto.gifting.details.CryptoGiftDetailsFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoGiftDetailsFragment.onResume$lambda$7(this.f$0, (CryptoGiftDetailsViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$7(final CryptoGiftDetailsFragment cryptoGiftDetailsFragment, final CryptoGiftDetailsViewState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        FragmentCryptoGiftDetailsBinding binding = cryptoGiftDetailsFragment.getBinding();
        RhToolbar rhToolbar = cryptoGiftDetailsFragment.getRhToolbar();
        if (rhToolbar != null) {
            rhToolbar.setTitle(state.getScreenHeader());
        }
        cryptoGiftDetailsFragment.itemAdapter.submitList(state.getListItems());
        if (state.getPrimaryCta() == null) {
            binding.primaryCta.setVisibility(8);
        } else {
            ClientComponentButtonView clientComponentButtonView = binding.primaryCta;
            Intrinsics.checkNotNull(clientComponentButtonView);
            com.robinhood.android.autoeventlogging.ViewsKt.setLoggingConfig(clientComponentButtonView, new AutoLoggingConfig(false, true));
            com.robinhood.android.autoeventlogging.ViewsKt.eventData$default(clientComponentButtonView, false, new Function0() { // from class: com.robinhood.android.crypto.gifting.details.CryptoGiftDetailsFragment$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CryptoGiftDetailsFragment.onResume$lambda$7$lambda$6$lambda$3$lambda$2(this.f$0, state);
                }
            }, 1, null);
            RdsButton button = binding.primaryCta.getViewBinding().button;
            Intrinsics.checkNotNullExpressionValue(button, "button");
            ScarletManager2.overrideStyle$default(button, new ThemedResourceReference(ResourceType.STYLE.INSTANCE, C20690R.attr.primaryMonochromeButtonStyle), false, 2, null);
            binding.primaryCta.bind(ServerDrivenButton.INSTANCE.from(state.getPrimaryCta()));
            binding.primaryCta.setVisibility(0);
        }
        if (state.getFooterDisclaimer() == null) {
            binding.footer.setVisibility(8);
        } else {
            RhTextView rhTextView = binding.footer;
            RichText footerDisclaimer = state.getFooterDisclaimer();
            android.content.Context contextRequireContext = cryptoGiftDetailsFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            rhTextView.setText(RichTexts.toSpannableString$default(footerDisclaimer, contextRequireContext, null, false, null, 14, null));
            binding.footer.setVisibility(0);
        }
        RdsButton rdsButton = binding.dismissCta;
        if (state.getDismissCtaText() == null) {
            rdsButton.setVisibility(8);
        } else {
            rdsButton.setText(state.getDismissCtaText());
            rdsButton.setVisibility(0);
            Intrinsics.checkNotNull(rdsButton);
            OnClickListeners.onClick(rdsButton, new Function0() { // from class: com.robinhood.android.crypto.gifting.details.CryptoGiftDetailsFragment$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CryptoGiftDetailsFragment.onResume$lambda$7$lambda$6$lambda$5$lambda$4(this.f$0);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor onResume$lambda$7$lambda$6$lambda$3$lambda$2(CryptoGiftDetailsFragment cryptoGiftDetailsFragment, CryptoGiftDetailsViewState cryptoGiftDetailsDuxo2) {
        return new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.PRIMARY_CTA, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, cryptoGiftDetailsFragment.getGiftStatusContext(cryptoGiftDetailsDuxo2), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -513, -1, -1, -1, 16383, null), new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 35, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$7$lambda$6$lambda$5$lambda$4(CryptoGiftDetailsFragment cryptoGiftDetailsFragment) {
        cryptoGiftDetailsFragment.requireActivity().onBackPressed();
        return Unit.INSTANCE;
    }

    private final CryptoGiftContext getGiftStatusContext(CryptoGiftDetailsViewState viewState) {
        Boolean boolValueOf;
        Companion companion = INSTANCE;
        String string2 = ((CryptoGiftDetails) companion.getArgs((Fragment) this)).getCardDesign().getId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        double giftAmount = ((CryptoGiftDetails) companion.getArgs((Fragment) this)).getGiftAmount();
        String string3 = ((CryptoGiftDetails) companion.getArgs((Fragment) this)).getCurrency().getCurrencyId().toString();
        Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
        String giftMessage = ((CryptoGiftDetails) companion.getArgs((Fragment) this)).getGiftMessage();
        if (giftMessage != null) {
            boolValueOf = Boolean.valueOf(giftMessage.length() > 0);
        } else {
            boolValueOf = null;
        }
        Boolean protobuf = Booleans2.toProtobuf(boolValueOf);
        String dismissCtaText = viewState.getDismissCtaText();
        if (dismissCtaText == null) {
            dismissCtaText = "";
        }
        return new CryptoGiftContext(string2, giftAmount, string3, protobuf, dismissCtaText, null, null, 96, null);
    }

    private final void initViews(FragmentCryptoGiftDetailsBinding fragmentCryptoGiftDetailsBinding) {
        RecyclerView recyclerView = fragmentCryptoGiftDetailsBinding.recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(this.itemAdapter);
        Resources resources = recyclerView.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        recyclerView.addItemDecoration(new DetailsItemListDecorator(resources));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.android.serverclientcomponents.actionbutton.ClientComponentButtonView.Callbacks
    public boolean onActionClicked(ServerDrivenButton button) {
        Intrinsics.checkNotNullParameter(button, "button");
        if (button.getTypedAction() instanceof GenericAction.DeeplinkAction) {
            Object[] objArr = 0 == true ? 1 : 0;
            EventLogger.DefaultImpls.logTap$default(getEventLogger(), UserInteractionEventData.Action.PRIMARY_CTA, getEventScreen(), new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, new Context(0, 0, 0, objArr, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -1, -1, 16383, null), false, 40, null);
            return false;
        }
        if (!(button.getTypedAction() instanceof GenericAction.DismissAction)) {
            return false;
        }
        Object[] objArr2 = 0 == true ? 1 : 0;
        EventLogger.DefaultImpls.logTap$default(getEventLogger(), UserInteractionEventData.Action.DISMISS, getEventScreen(), new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, new Context(0, 0, 0, objArr2, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -1, -1, 16383, null), false, 40, null);
        return false;
    }

    /* compiled from: CryptoGiftDetailsFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/crypto/gifting/details/CryptoGiftDetailsFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/crypto/gifting/details/CryptoGiftDetailsFragment;", "Lcom/robinhood/models/ui/bonfire/cryptogifting/CryptoGiftDetails;", "<init>", "()V", "feature-crypto-gifting_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<CryptoGiftDetailsFragment, CryptoGiftDetails> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public CryptoGiftDetails getArgs(CryptoGiftDetailsFragment cryptoGiftDetailsFragment) {
            return (CryptoGiftDetails) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, cryptoGiftDetailsFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public CryptoGiftDetailsFragment newInstance(CryptoGiftDetails cryptoGiftDetails) {
            return (CryptoGiftDetailsFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, cryptoGiftDetails);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(CryptoGiftDetailsFragment cryptoGiftDetailsFragment, CryptoGiftDetails cryptoGiftDetails) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, cryptoGiftDetailsFragment, cryptoGiftDetails);
        }
    }
}
