package com.robinhood.android.advanced.alert.alerthub;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.advanced.alert.AdvancedAlertCreateBottomSheetArgs;
import com.robinhood.android.advanced.alert.AdvancedAlertCreateBottomSheetFragment;
import com.robinhood.android.advanced.alert.C8387R;
import com.robinhood.android.advanced.alert.databinding.FragmentAlertHubPriceAlertSelectorBottomsheetBinding;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.AutoLoggingConfig;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.autoeventlogging.ViewsKt;
import com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.container.RdsRippleContainerView;
import com.robinhood.models.advanced.alert.api.ApiAdvancedAlert2;
import com.robinhood.models.advanced.alert.api.ApiAlertHubSettingItem;
import com.robinhood.models.advanced.alert.api.PriceAlertDisplayResources;
import com.robinhood.models.advanced.alert.api.PriceDisplayResources;
import com.robinhood.models.advanced.alert.p302db.AlertHubSettingItem;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.parceler.EitherParceler;
import com.robinhood.rosetta.eventlogging.Asset;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.utils.Either;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsAndCallbacksCompanion;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: AlertHubPriceAlertSelectorBottomSheetFragment.kt */
@Metadata(m3635d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 E2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002DEB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:H\u0016J\u001a\u0010;\u001a\u0002082\u0006\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u00010?H\u0016J\b\u0010@\u001a\u000208H\u0016J\b\u0010A\u001a\u000208H\u0002J\b\u0010B\u001a\u000208H\u0002J\b\u0010C\u001a\u000208H\u0016R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u0011X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0018\u001a\u00060\u0019j\u0002`\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020$8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020(8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020,8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0016\u0010/\u001a\u0004\u0018\u0001008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0016\u00103\u001a\u0004\u0018\u0001048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b5\u00106¨\u0006F"}, m3636d2 = {"Lcom/robinhood/android/advanced/alert/alerthub/AlertHubPriceAlertSelectorBottomSheetFragment;", "Lcom/robinhood/android/common/ui/BaseBottomSheetDialogFragment;", "Lcom/robinhood/android/advanced/alert/AdvancedAlertCreateBottomSheetFragment$DismissCallback;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "excludeFromAutoScreenEventLogging", "", "getExcludeFromAutoScreenEventLogging", "()Z", "eventComponent", "Lcom/robinhood/rosetta/eventlogging/Component;", "getEventComponent", "()Lcom/robinhood/rosetta/eventlogging/Component;", "eventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "getEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "binding", "Lcom/robinhood/android/advanced/alert/databinding/FragmentAlertHubPriceAlertSelectorBottomsheetBinding;", "getBinding", "()Lcom/robinhood/android/advanced/alert/databinding/FragmentAlertHubPriceAlertSelectorBottomsheetBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "entityType", "Lcom/robinhood/models/advanced/alert/api/AdvancedAlertEntityType;", "getEntityType", "()Lcom/robinhood/models/advanced/alert/api/AdvancedAlertEntityType;", "assetType", "Lcom/robinhood/rosetta/eventlogging/Asset$AssetType;", "getAssetType", "()Lcom/robinhood/rosetta/eventlogging/Asset$AssetType;", "entityUuid", "Ljava/util/UUID;", "getEntityUuid", "()Ljava/util/UUID;", "currencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "getCurrencyPair", "()Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "uiResource", "Lcom/robinhood/models/advanced/alert/api/PriceDisplayResources;", "getUiResource", "()Lcom/robinhood/models/advanced/alert/api/PriceDisplayResources;", "onAttach", "", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "bindView", "bindLoggingEvent", "onDismiss", "Args", "Companion", "feature-lib-advanced-alert_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class AlertHubPriceAlertSelectorBottomSheetFragment extends BaseBottomSheetDialogFragment implements AdvancedAlertCreateBottomSheetFragment.DismissCallback, AutoLoggableFragment {
    public static final String TAG = "alert_hub_price_alert_selector_fragment";

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    public EventLogger eventLogger;
    private final boolean excludeFromAutoScreenEventLogging;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AlertHubPriceAlertSelectorBottomSheetFragment.class, "binding", "getBinding()Lcom/robinhood/android/advanced/alert/databinding/FragmentAlertHubPriceAlertSelectorBottomsheetBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

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

    public AlertHubPriceAlertSelectorBottomSheetFragment() {
        super(C8387R.layout.fragment_alert_hub_price_alert_selector_bottomsheet);
        this.excludeFromAutoScreenEventLogging = true;
        this.binding = ViewBinding5.viewBinding(this, AlertHubPriceAlertSelectorBottomSheetFragment2.INSTANCE);
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

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        Screen.Name name = Screen.Name.ADVANCED_ALERT_HUB;
        String string2 = getEntityUuid().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return new Screen(name, null, string2, null, 10, null);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenEventLogging() {
        return this.excludeFromAutoScreenEventLogging;
    }

    private final Component getEventComponent() {
        return new Component(Component.ComponentType.PRICE_ALERT_TYPE_SELECTOR, null, null, 6, null);
    }

    private final Context getEventContext() {
        String string2 = getEntityUuid().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, new Asset(string2, getAssetType(), null, null, 12, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -16385, -1, -1, -1, -1, -1, 16383, null);
    }

    private final FragmentAlertHubPriceAlertSelectorBottomsheetBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentAlertHubPriceAlertSelectorBottomsheetBinding) value;
    }

    private final ApiAdvancedAlert2 getEntityType() {
        Either<Instrument, UiCurrencyPair> entity = ((Args) INSTANCE.getArgs((Fragment) this)).getEntity();
        if (!(entity instanceof Either.Left)) {
            if (!(entity instanceof Either.Right)) {
                throw new NoWhenBranchMatchedException();
            }
            return ApiAdvancedAlert2.CRYPTO;
        }
        return ApiAdvancedAlert2.INSTRUMENTS;
    }

    private final Asset.AssetType getAssetType() {
        Either<Instrument, UiCurrencyPair> entity = ((Args) INSTANCE.getArgs((Fragment) this)).getEntity();
        if (!(entity instanceof Either.Left)) {
            if (!(entity instanceof Either.Right)) {
                throw new NoWhenBranchMatchedException();
            }
            return Asset.AssetType.CURRENCY_PAIR;
        }
        return Asset.AssetType.INSTRUMENT;
    }

    private final UUID getEntityUuid() {
        Either<Instrument, UiCurrencyPair> entity = ((Args) INSTANCE.getArgs((Fragment) this)).getEntity();
        if (!(entity instanceof Either.Left)) {
            if (!(entity instanceof Either.Right)) {
                throw new NoWhenBranchMatchedException();
            }
            return ((UiCurrencyPair) ((Either.Right) entity).getValue()).getId();
        }
        return ((Instrument) ((Either.Left) entity).getValue()).getId();
    }

    private final UiCurrencyPair getCurrencyPair() {
        Either<Instrument, UiCurrencyPair> entity = ((Args) INSTANCE.getArgs((Fragment) this)).getEntity();
        Either.Right right = entity instanceof Either.Right ? (Either.Right) entity : null;
        if (right != null) {
            return (UiCurrencyPair) right.getValue();
        }
        return null;
    }

    private final PriceDisplayResources getUiResource() {
        return ((Args) INSTANCE.getArgs((Fragment) this)).getUiResource();
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, com.robinhood.hammer.android.fragment.HammerDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        bindView();
        bindLoggingEvent();
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        EventLogger.DefaultImpls.logDisappear$default(getEventLogger(), UserInteractionEventData.Action.DISMISS, getEventScreen(), getEventComponent(), null, getEventContext(), 8, null);
    }

    private final void bindView() {
        RdsRippleContainerView priceAboveContainer = getBinding().priceAboveContainer;
        Intrinsics.checkNotNullExpressionValue(priceAboveContainer, "priceAboveContainer");
        OnClickListeners.onClick(priceAboveContainer, new Function0() { // from class: com.robinhood.android.advanced.alert.alerthub.AlertHubPriceAlertSelectorBottomSheetFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AlertHubPriceAlertSelectorBottomSheetFragment.bindView$lambda$7(this.f$0);
            }
        });
        RdsRippleContainerView priceBelowContainer = getBinding().priceBelowContainer;
        Intrinsics.checkNotNullExpressionValue(priceBelowContainer, "priceBelowContainer");
        OnClickListeners.onClick(priceBelowContainer, new Function0() { // from class: com.robinhood.android.advanced.alert.alerthub.AlertHubPriceAlertSelectorBottomSheetFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AlertHubPriceAlertSelectorBottomSheetFragment.bindView$lambda$8(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$7(AlertHubPriceAlertSelectorBottomSheetFragment alertHubPriceAlertSelectorBottomSheetFragment) {
        PriceAlertDisplayResources movesAboveValue;
        BigDecimal minOrderPriceIncrement;
        AdvancedAlertCreateBottomSheetFragment.Companion companion = AdvancedAlertCreateBottomSheetFragment.INSTANCE;
        ApiAdvancedAlert2 entityType = alertHubPriceAlertSelectorBottomSheetFragment.getEntityType();
        UUID entityUuid = alertHubPriceAlertSelectorBottomSheetFragment.getEntityUuid();
        UiCurrencyPair currencyPair = alertHubPriceAlertSelectorBottomSheetFragment.getCurrencyPair();
        String editorTitle = null;
        Integer numValueOf = (currencyPair == null || (minOrderPriceIncrement = currencyPair.getMinOrderPriceIncrement()) == null) ? null : Integer.valueOf(BigDecimals7.getNumberOfDecimalPlaces(minOrderPriceIncrement));
        ApiAlertHubSettingItem.Type type2 = ApiAlertHubSettingItem.Type.PRICE_ABOVE;
        PriceDisplayResources uiResource = alertHubPriceAlertSelectorBottomSheetFragment.getUiResource();
        if (uiResource != null && (movesAboveValue = uiResource.getMovesAboveValue()) != null) {
            editorTitle = movesAboveValue.getEditorTitle();
        }
        AdvancedAlertCreateBottomSheetFragment advancedAlertCreateBottomSheetFragment = (AdvancedAlertCreateBottomSheetFragment) FragmentWithArgsAndCallbacksCompanion.DefaultImpls.newInstance$default(companion, new AdvancedAlertCreateBottomSheetArgs(entityType, entityUuid, numValueOf, new AlertHubSettingItem.PriceAbove(null, type2, false, null, editorTitle, null, null), Screen.Name.NAME_UNSPECIFIED), alertHubPriceAlertSelectorBottomSheetFragment, 0, 4, null);
        FragmentManager parentFragmentManager = alertHubPriceAlertSelectorBottomSheetFragment.getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
        advancedAlertCreateBottomSheetFragment.show(parentFragmentManager, "advanced_alert_create_bottomsheet_fragment");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$8(AlertHubPriceAlertSelectorBottomSheetFragment alertHubPriceAlertSelectorBottomSheetFragment) {
        PriceAlertDisplayResources movesBelowValue;
        BigDecimal minOrderPriceIncrement;
        AdvancedAlertCreateBottomSheetFragment.Companion companion = AdvancedAlertCreateBottomSheetFragment.INSTANCE;
        ApiAdvancedAlert2 entityType = alertHubPriceAlertSelectorBottomSheetFragment.getEntityType();
        UUID entityUuid = alertHubPriceAlertSelectorBottomSheetFragment.getEntityUuid();
        UiCurrencyPair currencyPair = alertHubPriceAlertSelectorBottomSheetFragment.getCurrencyPair();
        String editorTitle = null;
        Integer numValueOf = (currencyPair == null || (minOrderPriceIncrement = currencyPair.getMinOrderPriceIncrement()) == null) ? null : Integer.valueOf(BigDecimals7.getNumberOfDecimalPlaces(minOrderPriceIncrement));
        ApiAlertHubSettingItem.Type type2 = ApiAlertHubSettingItem.Type.PRICE_BELOW;
        PriceDisplayResources uiResource = alertHubPriceAlertSelectorBottomSheetFragment.getUiResource();
        if (uiResource != null && (movesBelowValue = uiResource.getMovesBelowValue()) != null) {
            editorTitle = movesBelowValue.getEditorTitle();
        }
        AdvancedAlertCreateBottomSheetFragment advancedAlertCreateBottomSheetFragment = (AdvancedAlertCreateBottomSheetFragment) FragmentWithArgsAndCallbacksCompanion.DefaultImpls.newInstance$default(companion, new AdvancedAlertCreateBottomSheetArgs(entityType, entityUuid, numValueOf, new AlertHubSettingItem.PriceAbove(null, type2, false, null, editorTitle, null, null), Screen.Name.NAME_UNSPECIFIED), alertHubPriceAlertSelectorBottomSheetFragment, 0, 4, null);
        FragmentManager parentFragmentManager = alertHubPriceAlertSelectorBottomSheetFragment.getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
        advancedAlertCreateBottomSheetFragment.show(parentFragmentManager, "advanced_alert_create_bottomsheet_fragment");
        return Unit.INSTANCE;
    }

    private final void bindLoggingEvent() {
        ConstraintLayout root = getBinding().getRoot();
        Intrinsics.checkNotNull(root);
        ViewsKt.eventData$default(root, false, new Function0() { // from class: com.robinhood.android.advanced.alert.alerthub.AlertHubPriceAlertSelectorBottomSheetFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AlertHubPriceAlertSelectorBottomSheetFragment.bindLoggingEvent$lambda$10$lambda$9(this.f$0);
            }
        }, 1, null);
        ViewsKt.setLoggingConfig(root, new AutoLoggingConfig(false, true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor bindLoggingEvent$lambda$10$lambda$9(AlertHubPriceAlertSelectorBottomSheetFragment alertHubPriceAlertSelectorBottomSheetFragment) {
        return new UserInteractionEventDescriptor(null, null, null, alertHubPriceAlertSelectorBottomSheetFragment.getEventContext(), alertHubPriceAlertSelectorBottomSheetFragment.getEventComponent(), null, 39, null);
    }

    /* compiled from: AlertHubPriceAlertSelectorBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0010\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0006\u0010\u0011\u001a\u00020\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0012R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/advanced/alert/alerthub/AlertHubPriceAlertSelectorBottomSheetFragment$Args;", "Landroid/os/Parcelable;", "entity", "Lcom/robinhood/utils/Either;", "Lcom/robinhood/models/db/Instrument;", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "uiResource", "Lcom/robinhood/models/advanced/alert/api/PriceDisplayResources;", "<init>", "(Lcom/robinhood/utils/Either;Lcom/robinhood/models/advanced/alert/api/PriceDisplayResources;)V", "getEntity", "()Lcom/robinhood/utils/Either;", "getUiResource", "()Lcom/robinhood/models/advanced/alert/api/PriceDisplayResources;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-lib-advanced-alert_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final Either<Instrument, UiCurrencyPair> entity;
        private final PriceDisplayResources uiResource;

        /* compiled from: AlertHubPriceAlertSelectorBottomSheetFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(EitherParceler.INSTANCE.m23663create(parcel), (PriceDisplayResources) parcel.readParcelable(Args.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Args copy$default(Args args, Either either, PriceDisplayResources priceDisplayResources, int i, Object obj) {
            if ((i & 1) != 0) {
                either = args.entity;
            }
            if ((i & 2) != 0) {
                priceDisplayResources = args.uiResource;
            }
            return args.copy(either, priceDisplayResources);
        }

        public final Either<Instrument, UiCurrencyPair> component1() {
            return this.entity;
        }

        /* renamed from: component2, reason: from getter */
        public final PriceDisplayResources getUiResource() {
            return this.uiResource;
        }

        public final Args copy(Either<Instrument, UiCurrencyPair> entity, PriceDisplayResources uiResource) {
            Intrinsics.checkNotNullParameter(entity, "entity");
            return new Args(entity, uiResource);
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
            return Intrinsics.areEqual(this.entity, args.entity) && Intrinsics.areEqual(this.uiResource, args.uiResource);
        }

        public int hashCode() {
            int iHashCode = this.entity.hashCode() * 31;
            PriceDisplayResources priceDisplayResources = this.uiResource;
            return iHashCode + (priceDisplayResources == null ? 0 : priceDisplayResources.hashCode());
        }

        public String toString() {
            return "Args(entity=" + this.entity + ", uiResource=" + this.uiResource + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            EitherParceler.INSTANCE.write((Either<?, ?>) this.entity, dest, flags);
            dest.writeParcelable(this.uiResource, flags);
        }

        public Args(Either<Instrument, UiCurrencyPair> entity, PriceDisplayResources priceDisplayResources) {
            Intrinsics.checkNotNullParameter(entity, "entity");
            this.entity = entity;
            this.uiResource = priceDisplayResources;
        }

        public final Either<Instrument, UiCurrencyPair> getEntity() {
            return this.entity;
        }

        public final PriceDisplayResources getUiResource() {
            return this.uiResource;
        }
    }

    @Override // com.robinhood.android.advanced.alert.AdvancedAlertCreateBottomSheetFragment.DismissCallback
    public void onDismiss() {
        dismiss();
    }

    /* compiled from: AlertHubPriceAlertSelectorBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/advanced/alert/alerthub/AlertHubPriceAlertSelectorBottomSheetFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/advanced/alert/alerthub/AlertHubPriceAlertSelectorBottomSheetFragment;", "Lcom/robinhood/android/advanced/alert/alerthub/AlertHubPriceAlertSelectorBottomSheetFragment$Args;", "<init>", "()V", "TAG", "", "feature-lib-advanced-alert_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<AlertHubPriceAlertSelectorBottomSheetFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(AlertHubPriceAlertSelectorBottomSheetFragment alertHubPriceAlertSelectorBottomSheetFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, alertHubPriceAlertSelectorBottomSheetFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public AlertHubPriceAlertSelectorBottomSheetFragment newInstance(Args args) {
            return (AlertHubPriceAlertSelectorBottomSheetFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(AlertHubPriceAlertSelectorBottomSheetFragment alertHubPriceAlertSelectorBottomSheetFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, alertHubPriceAlertSelectorBottomSheetFragment, args);
        }
    }
}
