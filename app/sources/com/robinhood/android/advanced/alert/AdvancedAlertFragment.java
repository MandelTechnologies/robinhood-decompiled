package com.robinhood.android.advanced.alert;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.core.app.NotificationManagerCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.advanced.alert.AdvancedAlertCreateBottomSheetFragment;
import com.robinhood.android.advanced.alert.AdvancedAlertEvent;
import com.robinhood.android.advanced.alert.AdvancedAlertFragment;
import com.robinhood.android.advanced.alert.AdvancedAlertViewState;
import com.robinhood.android.advanced.alert.alerthub.AlertHubPriceAlertSelectorBottomSheetFragment;
import com.robinhood.android.advanced.alert.databinding.FragmentAdvancedAlertV2Binding;
import com.robinhood.android.advanced.alert.view.AddAlertButtonView;
import com.robinhood.android.advanced.alert.view.AdvancedAlertSettingItemRowView;
import com.robinhood.android.advanced.chart.AdvancedChartIndicatorListItemTouchHelperCallbacks;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.AutoLoggingConfig;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.autoeventlogging.ViewsKt;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.designsystem.banner.RdsInfoBannerView;
import com.robinhood.android.designsystem.button.RdsTextButton;
import com.robinhood.android.designsystem.compose.ScarletComposeInterop;
import com.robinhood.android.education.contracts.AdvancedAlert4;
import com.robinhood.android.education.contracts.AlertHubCreateIndicatorAlert;
import com.robinhood.android.education.contracts.AlertHubIndicatorList;
import com.robinhood.android.education.contracts.AlertHubSettingsKey;
import com.robinhood.android.navigation.FragmentResolver;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.compose.bento.component.BentoSegmentedControl2;
import com.robinhood.compose.bento.component.Segment;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.librobinhood.data.store.alert.AdvancedAlertEntryPoint;
import com.robinhood.models.advanced.alert.api.ApiAdvancedAlert2;
import com.robinhood.models.advanced.alert.api.ApiAlertHubSettingItem;
import com.robinhood.models.advanced.alert.p302db.AdvancedAlert;
import com.robinhood.models.advanced.alert.p302db.AlertHubSettingItem;
import com.robinhood.models.advanced.alert.p302db.AlertHubSettings2;
import com.robinhood.models.advanced.alert.p302db.AlertHubUiResources;
import com.robinhood.models.advanced.alert.p302db.AlertHubUiResourcesContent;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p355ui.Historical;
import com.robinhood.models.parceler.EitherParceler;
import com.robinhood.rosetta.eventlogging.Asset;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.models.advancedChart.api.ApiTechnicalIndicator;
import com.robinhood.utils.Either;
import com.robinhood.utils.extensions.ContextSystemServices;
import com.robinhood.utils.extensions.Contexts8;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsAndCallbacksCompanion;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.CompositeAdapter;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import com.robinhood.utils.p409ui.view.recyclerview.SingleItemAdapter;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: AdvancedAlertFragment.kt */
@Metadata(m3635d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 i2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002hiB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010Q\u001a\u00020R2\u0006\u0010S\u001a\u00020T2\b\u0010U\u001a\u0004\u0018\u00010VH\u0016J\b\u0010W\u001a\u00020RH\u0016J\u0010\u0010X\u001a\u00020R2\u0006\u0010Y\u001a\u00020ZH\u0016J\u0016\u0010[\u001a\u00020R2\f\u0010\\\u001a\b\u0012\u0004\u0012\u00020N0]H\u0002J\b\u0010^\u001a\u00020RH\u0002J\u0010\u0010_\u001a\u00020R2\u0006\u0010`\u001a\u00020aH\u0002J\u0010\u0010b\u001a\u00020R2\u0006\u0010c\u001a\u00020dH\u0002J\u0010\u0010e\u001a\u00020R2\u0006\u0010c\u001a\u00020JH\u0002J\b\u0010f\u001a\u00020RH\u0016J\b\u0010g\u001a\u00020RH\u0003R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\rX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0016\u001a\u00060\u0017j\u0002`\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010!\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b#\u0010$R \u0010'\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*0(8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0016\u0010-\u001a\u0004\u0018\u00010)8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0016\u00100\u001a\u0004\u0018\u00010*8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0014\u00103\u001a\u0002048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u0014\u00107\u001a\u0002088BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0014\u0010;\u001a\u00020<8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0014\u0010?\u001a\u00020@8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bA\u0010BR\u000e\u0010C\u001a\u00020DX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020FX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010G\u001a\u000e\u0012\u0004\u0012\u00020I\u0012\u0004\u0012\u00020J0HX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010K\u001a\u000e\u0012\u0004\u0012\u00020M\u0012\u0004\u0012\u00020N0LX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010O\u001a\u00020PX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006j"}, m3636d2 = {"Lcom/robinhood/android/advanced/alert/AdvancedAlertFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/advanced/alert/AdvancedAlertCreateBottomSheetFragment$DismissCallback;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "childFragmentsShouldNotConfigureToolbar", "getChildFragmentsShouldNotConfigureToolbar", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "eventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "getEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "duxo", "Lcom/robinhood/android/advanced/alert/AdvancedAlertDuxo;", "getDuxo", "()Lcom/robinhood/android/advanced/alert/AdvancedAlertDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "binding", "Lcom/robinhood/android/advanced/alert/databinding/FragmentAdvancedAlertV2Binding;", "getBinding", "()Lcom/robinhood/android/advanced/alert/databinding/FragmentAdvancedAlertV2Binding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "entity", "Lcom/robinhood/utils/Either;", "Lcom/robinhood/models/db/Instrument;", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "getEntity", "()Lcom/robinhood/utils/Either;", "instrument", "getInstrument", "()Lcom/robinhood/models/db/Instrument;", "currencyPair", "getCurrencyPair", "()Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "entityType", "Lcom/robinhood/models/advanced/alert/api/AdvancedAlertEntityType;", "getEntityType", "()Lcom/robinhood/models/advanced/alert/api/AdvancedAlertEntityType;", "assetType", "Lcom/robinhood/rosetta/eventlogging/Asset$AssetType;", "getAssetType", "()Lcom/robinhood/rosetta/eventlogging/Asset$AssetType;", "entityUuid", "Ljava/util/UUID;", "getEntityUuid", "()Ljava/util/UUID;", "entitySymbol", "", "getEntitySymbol", "()Ljava/lang/String;", "handler", "Landroid/os/Handler;", "loadingRunnable", "Ljava/lang/Runnable;", "addAlertAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/SingleItemAdapter;", "Lcom/robinhood/android/advanced/alert/view/AddAlertButtonView;", "Lcom/robinhood/android/advanced/alert/AdvancedAlertViewState$AddAlertTypeState;", "listAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/advanced/alert/view/AdvancedAlertSettingItemRowView;", "Lcom/robinhood/android/advanced/alert/AdvancedAlertViewState$AlertSettingWithResource;", "compositeAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/CompositeAdapter;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "setPriceAlertViewState", "list", "", "bindView", "updateUiString", "uiResource", "Lcom/robinhood/models/advanced/alert/db/AlertHubUiResources;", "bindSegmentedControl", "state", "Lcom/robinhood/android/advanced/alert/AdvancedAlertViewState$SegmentedControlState;", "updateAddAlertButton", "onDismiss", "bindNotificationInfoBanner", "Args", "Companion", "feature-lib-advanced-alert_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class AdvancedAlertFragment extends BaseFragment implements AdvancedAlertCreateBottomSheetFragment.DismissCallback, AutoLoggableFragment {
    private final SingleItemAdapter<AddAlertButtonView, AdvancedAlertViewState.AddAlertTypeState> addAlertAdapter;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private final boolean childFragmentsShouldNotConfigureToolbar;
    private final CompositeAdapter compositeAdapter;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public EventLogger eventLogger;
    private final Handler handler;
    private final GenericListAdapter<AdvancedAlertSettingItemRowView, AdvancedAlertViewState.AlertSettingWithResource> listAdapter;
    private final Runnable loadingRunnable;
    private final boolean useDesignSystemToolbar;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AdvancedAlertFragment.class, "binding", "getBinding()Lcom/robinhood/android/advanced/alert/databinding/FragmentAdvancedAlertV2Binding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: AdvancedAlertFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiAdvancedAlert2.values().length];
            try {
                iArr[ApiAdvancedAlert2.INSTRUMENTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiAdvancedAlert2.CRYPTO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.advanced.alert.AdvancedAlertCreateBottomSheetFragment.DismissCallback
    public void onDismiss() {
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

    public AdvancedAlertFragment() {
        super(C8387R.layout.fragment_advanced_alert_v2);
        this.useDesignSystemToolbar = true;
        this.childFragmentsShouldNotConfigureToolbar = true;
        this.duxo = DuxosKt.duxo(this, AdvancedAlertDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, AdvancedAlertFragment2.INSTANCE);
        this.handler = new Handler(Looper.getMainLooper());
        this.loadingRunnable = new Runnable() { // from class: com.robinhood.android.advanced.alert.AdvancedAlertFragment$loadingRunnable$1
            @Override // java.lang.Runnable
            public final void run() {
                if (!this.this$0.isResumed() || this.this$0.isRemoving() || this.this$0.getBaseActivity() == null) {
                    return;
                }
                this.this$0.getBinding().advancedAlertLoadingView.setVisibility(0);
            }
        };
        SingleItemAdapter<AddAlertButtonView, AdvancedAlertViewState.AddAlertTypeState> singleItemAdapterM2991of = SingleItemAdapter.INSTANCE.m2991of(C8387R.layout.include_add_alert_button_view, DiffCallbacks.Equality.INSTANCE, new Function2() { // from class: com.robinhood.android.advanced.alert.AdvancedAlertFragment$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AdvancedAlertFragment.addAlertAdapter$lambda$11(this.f$0, (AddAlertButtonView) obj, (AdvancedAlertViewState.AddAlertTypeState) obj2);
            }
        });
        this.addAlertAdapter = singleItemAdapterM2991of;
        GenericListAdapter<AdvancedAlertSettingItemRowView, AdvancedAlertViewState.AlertSettingWithResource> genericListAdapterM2987of = GenericListAdapter.INSTANCE.m2987of(AdvancedAlertSettingItemRowView.INSTANCE, DiffCallbacks.INSTANCE.byEquality(new PropertyReference1Impl() { // from class: com.robinhood.android.advanced.alert.AdvancedAlertFragment$listAdapter$1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return ((AdvancedAlertViewState.AlertSettingWithResource) obj).getId();
            }
        }), new Function2() { // from class: com.robinhood.android.advanced.alert.AdvancedAlertFragment$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AdvancedAlertFragment.listAdapter$lambda$18(this.f$0, (AdvancedAlertSettingItemRowView) obj, (AdvancedAlertViewState.AlertSettingWithResource) obj2);
            }
        });
        this.listAdapter = genericListAdapterM2987of;
        this.compositeAdapter = new CompositeAdapter((RecyclerView.Adapter<?>[]) new RecyclerView.Adapter[]{genericListAdapterM2987of, singleItemAdapterM2991of});
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

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getChildFragmentsShouldNotConfigureToolbar() {
        return this.childFragmentsShouldNotConfigureToolbar;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        Screen.Name name = Screen.Name.ADVANCED_ALERT_HUB;
        String string2 = getEntityUuid().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return new Screen(name, null, string2, null, 10, null);
    }

    private final Context getEventContext() {
        String string2 = getEntityUuid().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        String str = null;
        Asset asset = new Asset(string2, getAssetType(), null, null, 12, null);
        return new Context(0, 0, 0, str, null, null, null, null, 0, null, ((Args) INSTANCE.getArgs((Fragment) this)).getEntryPoint().getServerValue(), null, null, null, asset, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -17409, -1, -1, -1, -1, -1, 16383, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AdvancedAlertDuxo getDuxo() {
        return (AdvancedAlertDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentAdvancedAlertV2Binding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentAdvancedAlertV2Binding) value;
    }

    private final Either<Instrument, UiCurrencyPair> getEntity() {
        return ((Args) INSTANCE.getArgs((Fragment) this)).getEntity();
    }

    private final Instrument getInstrument() {
        Either<Instrument, UiCurrencyPair> entity = ((Args) INSTANCE.getArgs((Fragment) this)).getEntity();
        Either.Left left = entity instanceof Either.Left ? (Either.Left) entity : null;
        if (left != null) {
            return (Instrument) left.getValue();
        }
        return null;
    }

    private final UiCurrencyPair getCurrencyPair() {
        Either<Instrument, UiCurrencyPair> entity = ((Args) INSTANCE.getArgs((Fragment) this)).getEntity();
        Either.Right right = entity instanceof Either.Right ? (Either.Right) entity : null;
        if (right != null) {
            return (UiCurrencyPair) right.getValue();
        }
        return null;
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

    /* JADX INFO: Access modifiers changed from: private */
    public final Asset.AssetType getAssetType() {
        Either<Instrument, UiCurrencyPair> entity = ((Args) INSTANCE.getArgs((Fragment) this)).getEntity();
        if (!(entity instanceof Either.Left)) {
            if (!(entity instanceof Either.Right)) {
                throw new NoWhenBranchMatchedException();
            }
            return Asset.AssetType.CURRENCY_PAIR;
        }
        return Asset.AssetType.INSTRUMENT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UUID getEntityUuid() {
        Either<Instrument, UiCurrencyPair> entity = ((Args) INSTANCE.getArgs((Fragment) this)).getEntity();
        if (!(entity instanceof Either.Left)) {
            if (!(entity instanceof Either.Right)) {
                throw new NoWhenBranchMatchedException();
            }
            return ((UiCurrencyPair) ((Either.Right) entity).getValue()).getId();
        }
        return ((Instrument) ((Either.Left) entity).getValue()).getId();
    }

    private final String getEntitySymbol() {
        Either<Instrument, UiCurrencyPair> entity = ((Args) INSTANCE.getArgs((Fragment) this)).getEntity();
        if (!(entity instanceof Either.Left)) {
            if (!(entity instanceof Either.Right)) {
                throw new NoWhenBranchMatchedException();
            }
            return ((UiCurrencyPair) ((Either.Right) entity).getValue()).getAssetCurrency().getCode();
        }
        return ((Instrument) ((Either.Left) entity).getValue()).getSymbol();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addAlertAdapter$lambda$11(final AdvancedAlertFragment advancedAlertFragment, AddAlertButtonView of, AdvancedAlertViewState.AddAlertTypeState state) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(state, "state");
        of.bind(state.getAddAlertText(), state.getAddAlertSubtitleText(), state.getMaximumAlertReached());
        of.getAddAlertBtn().setEnabled(state.isAppNotificationEnabled() && !state.getMaximumAlertReached());
        OnClickListeners.onClick(of.getAddAlertBtn(), new Function0() { // from class: com.robinhood.android.advanced.alert.AdvancedAlertFragment$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AdvancedAlertFragment.addAlertAdapter$lambda$11$lambda$10(this.f$0);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addAlertAdapter$lambda$11$lambda$10(AdvancedAlertFragment advancedAlertFragment) {
        String str;
        AdvancedAlertViewState.PriceAlertSelectorState priceAlertSelectorState = advancedAlertFragment.getDuxo().getStateFlow().getValue().getPriceAlertSelectorState();
        if (priceAlertSelectorState.isPriceSelected()) {
            AlertHubPriceAlertSelectorBottomSheetFragment alertHubPriceAlertSelectorBottomSheetFragment = (AlertHubPriceAlertSelectorBottomSheetFragment) AlertHubPriceAlertSelectorBottomSheetFragment.INSTANCE.newInstance((Parcelable) new AlertHubPriceAlertSelectorBottomSheetFragment.Args(advancedAlertFragment.getEntity(), priceAlertSelectorState.getUiResource()));
            FragmentManager childFragmentManager = advancedAlertFragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            alertHubPriceAlertSelectorBottomSheetFragment.show(childFragmentManager, AlertHubPriceAlertSelectorBottomSheetFragment.TAG);
        } else {
            Instrument instrument = advancedAlertFragment.getInstrument();
            if (instrument != null) {
                Navigator navigator = advancedAlertFragment.getNavigator();
                android.content.Context contextRequireContext = advancedAlertFragment.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                advancedAlertFragment.startActivity(Navigator.DefaultImpls.createIntentForFragment$default(navigator, contextRequireContext, new AlertHubIndicatorList(instrument.getId(), ((Args) INSTANCE.getArgs((Fragment) advancedAlertFragment)).getChartInterval()), false, false, false, null, false, false, false, false, false, null, false, 8180, null));
            }
        }
        EventLogger eventLogger = advancedAlertFragment.getEventLogger();
        Screen eventScreen = advancedAlertFragment.getEventScreen();
        Component.ComponentType componentType = Component.ComponentType.BUTTON;
        if (priceAlertSelectorState.isPriceSelected()) {
            str = "add-price-alert";
        } else {
            str = "add-indicator-alert";
        }
        EventLogger.DefaultImpls.logTap$default(eventLogger, null, eventScreen, new Component(componentType, str, null, 4, null), null, advancedAlertFragment.getEventContext(), false, 41, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit listAdapter$lambda$18(final AdvancedAlertFragment advancedAlertFragment, final AdvancedAlertSettingItemRowView of, final AdvancedAlertViewState.AlertSettingWithResource alertWithResource) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(alertWithResource, "alertWithResource");
        final AlertHubSettingItem alert = alertWithResource.getAlert();
        of.setEnabled(alertWithResource.isAppNotificationEnabled());
        of.bind(alert, alertWithResource.getTitle(), alertWithResource.getSubtitle());
        of.onCheckedChanged(new Function1() { // from class: com.robinhood.android.advanced.alert.AdvancedAlertFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdvancedAlertFragment.listAdapter$lambda$18$lambda$13(alert, of, advancedAlertFragment, ((Boolean) obj).booleanValue());
            }
        });
        OnClickListeners.onClick(of, new Function0() { // from class: com.robinhood.android.advanced.alert.AdvancedAlertFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AdvancedAlertFragment.listAdapter$lambda$18$lambda$16(alert, advancedAlertFragment, alertWithResource);
            }
        });
        ViewsKt.eventData$default(of, false, new Function0() { // from class: com.robinhood.android.advanced.alert.AdvancedAlertFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AdvancedAlertFragment.listAdapter$lambda$18$lambda$17(alert, advancedAlertFragment);
            }
        }, 1, null);
        ViewsKt.setLoggingConfig(of, new AutoLoggingConfig(false, true));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit listAdapter$lambda$18$lambda$13(AlertHubSettingItem alertHubSettingItem, AdvancedAlertSettingItemRowView advancedAlertSettingItemRowView, AdvancedAlertFragment advancedAlertFragment, boolean z) throws Resources.NotFoundException {
        BigDecimal price;
        AdvancedAlertFragment advancedAlertFragment2;
        BigDecimal minOrderPriceIncrement;
        if (alertHubSettingItem instanceof AlertHubSettingItem.PriceAbove) {
            price = ((AlertHubSettingItem.PriceAbove) alertHubSettingItem).getPrice();
        } else {
            price = alertHubSettingItem instanceof AlertHubSettingItem.PriceBelow ? ((AlertHubSettingItem.PriceBelow) alertHubSettingItem).getPrice() : null;
        }
        if (CollectionsKt.contains(AdvancedAlertViewState.INSTANCE.getPRICE_ALERT_TYPES(), alertHubSettingItem.getSettingType())) {
            String id = alertHubSettingItem.getId();
            if (id != null && id.length() != 0 && price != null) {
                String id2 = alertHubSettingItem.getId();
                if (id2 != null) {
                    AdvancedAlertDuxo duxo = advancedAlertFragment.getDuxo();
                    String string2 = price.toString();
                    Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                    duxo.updateSetting(id2, string2, z);
                }
                advancedAlertFragment2 = advancedAlertFragment;
            } else {
                advancedAlertSettingItemRowView.setChecked(!z);
                AdvancedAlertCreateBottomSheetFragment.Companion companion = AdvancedAlertCreateBottomSheetFragment.INSTANCE;
                ApiAdvancedAlert2 entityType = advancedAlertFragment.getEntityType();
                UUID entityUuid = advancedAlertFragment.getEntityUuid();
                UiCurrencyPair currencyPair = advancedAlertFragment.getCurrencyPair();
                AdvancedAlertCreateBottomSheetArgs advancedAlertCreateBottomSheetArgs = new AdvancedAlertCreateBottomSheetArgs(entityType, entityUuid, (currencyPair == null || (minOrderPriceIncrement = currencyPair.getMinOrderPriceIncrement()) == null) ? null : Integer.valueOf(BigDecimals7.getNumberOfDecimalPlaces(minOrderPriceIncrement)), alertHubSettingItem, Screen.Name.NAME_UNSPECIFIED);
                advancedAlertFragment2 = advancedAlertFragment;
                AdvancedAlertCreateBottomSheetFragment advancedAlertCreateBottomSheetFragment = (AdvancedAlertCreateBottomSheetFragment) FragmentWithArgsAndCallbacksCompanion.DefaultImpls.newInstance$default(companion, advancedAlertCreateBottomSheetArgs, advancedAlertFragment2, 0, 4, null);
                FragmentManager parentFragmentManager = advancedAlertFragment2.getParentFragmentManager();
                Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
                advancedAlertCreateBottomSheetFragment.show(parentFragmentManager, "advanced_alert_create_bottomsheet_fragment");
            }
        } else {
            advancedAlertFragment2 = advancedAlertFragment;
            advancedAlertFragment2.getDuxo().toggleIndicatorAdvancedAlert(alertHubSettingItem);
        }
        EventLogger eventLogger = advancedAlertFragment2.getEventLogger();
        AdvancedAlertFragment advancedAlertFragment3 = advancedAlertFragment2;
        Screen eventScreen = advancedAlertFragment3.getEventScreen();
        Component.ComponentType componentType = Component.ComponentType.ALERT_SETTING_TOGGLE;
        ApiAlertHubSettingItem.Type settingType = alertHubSettingItem.getSettingType();
        String serverValue = settingType != null ? settingType.getServerValue() : null;
        if (serverValue == null) {
            serverValue = "";
        }
        EventLogger.DefaultImpls.logTap$default(eventLogger, z ? UserInteractionEventData.Action.ENABLE_ALERT : UserInteractionEventData.Action.DISABLE_ALERT, eventScreen, new Component(componentType, serverValue, null, 4, null), null, advancedAlertFragment3.getEventContext(), false, 40, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit listAdapter$lambda$18$lambda$16(AlertHubSettingItem alertHubSettingItem, AdvancedAlertFragment advancedAlertFragment, AdvancedAlertViewState.AlertSettingWithResource alertSettingWithResource) {
        Instrument instrument;
        BigDecimal minOrderPriceIncrement;
        if (CollectionsKt.contains(AdvancedAlertViewState.INSTANCE.getPRICE_ALERT_TYPES(), alertHubSettingItem.getSettingType())) {
            AdvancedAlertCreateBottomSheetFragment.Companion companion = AdvancedAlertCreateBottomSheetFragment.INSTANCE;
            ApiAdvancedAlert2 entityType = advancedAlertFragment.getEntityType();
            UUID entityUuid = advancedAlertFragment.getEntityUuid();
            UiCurrencyPair currencyPair = advancedAlertFragment.getCurrencyPair();
            AdvancedAlertCreateBottomSheetFragment advancedAlertCreateBottomSheetFragment = (AdvancedAlertCreateBottomSheetFragment) FragmentWithArgsAndCallbacksCompanion.DefaultImpls.newInstance$default(companion, new AdvancedAlertCreateBottomSheetArgs(entityType, entityUuid, (currencyPair == null || (minOrderPriceIncrement = currencyPair.getMinOrderPriceIncrement()) == null) ? null : Integer.valueOf(BigDecimals7.getNumberOfDecimalPlaces(minOrderPriceIncrement)), alertHubSettingItem, Screen.Name.NAME_UNSPECIFIED), advancedAlertFragment, 0, 4, null);
            FragmentManager parentFragmentManager = advancedAlertFragment.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
            advancedAlertCreateBottomSheetFragment.show(parentFragmentManager, "advanced_alert_create_bottomsheet_fragment");
        } else {
            ApiTechnicalIndicator indicator = alertSettingWithResource.getIndicator();
            if (indicator != null && (instrument = advancedAlertFragment.getInstrument()) != null) {
                Navigator navigator = advancedAlertFragment.getNavigator();
                android.content.Context contextRequireContext = advancedAlertFragment.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                advancedAlertFragment.startActivity(Navigator.DefaultImpls.createIntentForFragment$default(navigator, contextRequireContext, new AlertHubCreateIndicatorAlert(instrument.getId(), String.valueOf(alertHubSettingItem.getSettingType()), indicator, alertHubSettingItem, ((Args) INSTANCE.getArgs((Fragment) advancedAlertFragment)).getChartInterval()), false, false, false, null, false, false, false, false, false, null, false, 8180, null));
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor listAdapter$lambda$18$lambda$17(AlertHubSettingItem alertHubSettingItem, AdvancedAlertFragment advancedAlertFragment) {
        ApiAlertHubSettingItem.Type settingType = alertHubSettingItem.getSettingType();
        String serverValue = settingType != null ? settingType.getServerValue() : null;
        String str = serverValue == null ? "" : serverValue;
        Component.ComponentType componentType = Component.ComponentType.ALERT_SETTING_ROW;
        ApiAlertHubSettingItem.Type settingType2 = alertHubSettingItem.getSettingType();
        String serverValue2 = settingType2 != null ? settingType2.getServerValue() : null;
        return new UserInteractionEventDescriptor(str, null, null, advancedAlertFragment.getEventContext(), new Component(componentType, serverValue2 == null ? "" : serverValue2, null, 4, null), null, 38, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (((Args) INSTANCE.getArgs((Fragment) this)).getEntryPoint() != AdvancedAlertEntryPoint.ALERT_HUB_SETTING) {
            requireBaseActivity().showCloseIcon();
        }
        bindView();
        BaseFragment.collectDuxoState$default(this, null, new C83851(null), 1, null);
    }

    /* compiled from: AdvancedAlertFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advanced.alert.AdvancedAlertFragment$onViewCreated$1", m3645f = "AdvancedAlertFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advanced.alert.AdvancedAlertFragment$onViewCreated$1 */
    static final class C83851 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C83851(Continuation<? super C83851> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C83851 c83851 = AdvancedAlertFragment.this.new C83851(continuation);
            c83851.L$0 = obj;
            return c83851;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C83851) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: AdvancedAlertFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.advanced.alert.AdvancedAlertFragment$onViewCreated$1$1", m3645f = "AdvancedAlertFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ANIMATION_MOBILE_AUTH_LOADING_DARK_APPEARANCE_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.advanced.alert.AdvancedAlertFragment$onViewCreated$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ AdvancedAlertFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(AdvancedAlertFragment advancedAlertFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = advancedAlertFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowFilterNotNull = FlowKt.filterNotNull(this.this$0.getDuxo().getEventFlow());
                    final AdvancedAlertFragment advancedAlertFragment = this.this$0;
                    FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.advanced.alert.AdvancedAlertFragment.onViewCreated.1.1.1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                            return emit((Event<AdvancedAlertEvent>) obj2, (Continuation<? super Unit>) continuation);
                        }

                        public final Object emit(final Event<AdvancedAlertEvent> event, Continuation<? super Unit> continuation) {
                            EventConsumer<AdvancedAlertEvent> eventConsumerInvoke;
                            EventConsumer<AdvancedAlertEvent> eventConsumerInvoke2;
                            final AdvancedAlertFragment advancedAlertFragment2 = advancedAlertFragment;
                            if ((event.getData() instanceof AdvancedAlertEvent.LoadingEvent) && (eventConsumerInvoke2 = event.getGetEventConsumer().invoke()) != null) {
                                eventConsumerInvoke2.consume(event, new Function1() { // from class: com.robinhood.android.advanced.alert.AdvancedAlertFragment$onViewCreated$1$1$1$emit$$inlined$consumeIfType$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                        m10919invoke(obj2);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m10919invoke(Object it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        if (((AdvancedAlertEvent.LoadingEvent) event.getData()).isLoading()) {
                                            advancedAlertFragment2.handler.postDelayed(advancedAlertFragment2.loadingRunnable, 1000L);
                                        } else {
                                            advancedAlertFragment2.getBinding().advancedAlertLoadingView.setVisibility(4);
                                            advancedAlertFragment2.handler.removeCallbacksAndMessages(null);
                                        }
                                    }
                                });
                            }
                            final AdvancedAlertFragment advancedAlertFragment3 = advancedAlertFragment;
                            if ((event.getData() instanceof AdvancedAlertEvent.ErrorEvent) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                                eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.advanced.alert.AdvancedAlertFragment$onViewCreated$1$1$1$emit$$inlined$consumeIfType$2
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                        m10920invoke(obj2);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m10920invoke(Object it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        AbsErrorHandler.handleError$default(advancedAlertFragment3.getActivityErrorHandler(), ((AdvancedAlertEvent.ErrorEvent) event.getData()).getThrowable(), false, 2, null);
                                    }
                                });
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (flowFilterNotNull.collect(flowCollector, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(AdvancedAlertFragment.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(AdvancedAlertFragment.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(AdvancedAlertFragment.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass4(AdvancedAlertFragment.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass5(AdvancedAlertFragment.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass6(AdvancedAlertFragment.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass7(AdvancedAlertFragment.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: AdvancedAlertFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.advanced.alert.AdvancedAlertFragment$onViewCreated$1$2", m3645f = "AdvancedAlertFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_PLAID_PROFILE_CIRCLE_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.advanced.alert.AdvancedAlertFragment$onViewCreated$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ AdvancedAlertFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(AdvancedAlertFragment advancedAlertFragment, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = advancedAlertFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    final StateFlow<AdvancedAlertViewState> stateFlow = this.this$0.getDuxo().getStateFlow();
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<List<? extends AdvancedAlertViewState.AlertSettingWithResource>>() { // from class: com.robinhood.android.advanced.alert.AdvancedAlertFragment$onViewCreated$1$2$invokeSuspend$$inlined$map$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super List<? extends AdvancedAlertViewState.AlertSettingWithResource>> flowCollector, Continuation continuation) {
                            Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.advanced.alert.AdvancedAlertFragment$onViewCreated$1$2$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.advanced.alert.AdvancedAlertFragment$onViewCreated$1$2$invokeSuspend$$inlined$map$1$2", m3645f = "AdvancedAlertFragment.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.advanced.alert.AdvancedAlertFragment$onViewCreated$1$2$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(FlowCollector flowCollector) {
                                this.$this_unsafeFlow = flowCollector;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i = anonymousClass1.label;
                                    if ((i & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                    }
                                }
                                Object obj2 = anonymousClass1.result;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i2 = anonymousClass1.label;
                                if (i2 == 0) {
                                    ResultKt.throwOnFailure(obj2);
                                    FlowCollector flowCollector = this.$this_unsafeFlow;
                                    List<AdvancedAlertViewState.AlertSettingWithResource> selectedAlertSettingsWithResource = ((AdvancedAlertViewState) obj).getSelectedAlertSettingsWithResource();
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(selectedAlertSettingsWithResource, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else {
                                    if (i2 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj2);
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    });
                    final AdvancedAlertFragment advancedAlertFragment = this.this$0;
                    FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.advanced.alert.AdvancedAlertFragment.onViewCreated.1.2.2
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                            return emit((List<AdvancedAlertViewState.AlertSettingWithResource>) obj2, (Continuation<? super Unit>) continuation);
                        }

                        public final Object emit(List<AdvancedAlertViewState.AlertSettingWithResource> list, Continuation<? super Unit> continuation) {
                            advancedAlertFragment.setPriceAlertViewState(list);
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (flowDistinctUntilChanged.collect(flowCollector, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* compiled from: AdvancedAlertFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.advanced.alert.AdvancedAlertFragment$onViewCreated$1$3", m3645f = "AdvancedAlertFragment.kt", m3646l = {331}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.advanced.alert.AdvancedAlertFragment$onViewCreated$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ AdvancedAlertFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(AdvancedAlertFragment advancedAlertFragment, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = advancedAlertFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    final StateFlow<AdvancedAlertViewState> stateFlow = this.this$0.getDuxo().getStateFlow();
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<String>() { // from class: com.robinhood.android.advanced.alert.AdvancedAlertFragment$onViewCreated$1$3$invokeSuspend$$inlined$mapNotNull$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super String> flowCollector, Continuation continuation) {
                            Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.advanced.alert.AdvancedAlertFragment$onViewCreated$1$3$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.advanced.alert.AdvancedAlertFragment$onViewCreated$1$3$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "AdvancedAlertFragment.kt", m3646l = {52}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.advanced.alert.AdvancedAlertFragment$onViewCreated$1$3$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(FlowCollector flowCollector) {
                                this.$this_unsafeFlow = flowCollector;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i = anonymousClass1.label;
                                    if ((i & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                    }
                                }
                                Object obj2 = anonymousClass1.result;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i2 = anonymousClass1.label;
                                if (i2 == 0) {
                                    ResultKt.throwOnFailure(obj2);
                                    FlowCollector flowCollector = this.$this_unsafeFlow;
                                    String digestId = ((AdvancedAlertViewState) obj).getDigestId();
                                    if (digestId != null) {
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(digestId, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    }
                                } else {
                                    if (i2 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj2);
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    });
                    final AdvancedAlertFragment advancedAlertFragment = this.this$0;
                    FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.advanced.alert.AdvancedAlertFragment.onViewCreated.1.3.2
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                            return emit((String) obj2, (Continuation<? super Unit>) continuation);
                        }

                        public final Object emit(String str, Continuation<? super Unit> continuation) {
                            advancedAlertFragment.getDuxo().fetchUiResource(str);
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (flowDistinctUntilChanged.collect(flowCollector, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* compiled from: AdvancedAlertFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.advanced.alert.AdvancedAlertFragment$onViewCreated$1$4", m3645f = "AdvancedAlertFragment.kt", m3646l = {340}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.advanced.alert.AdvancedAlertFragment$onViewCreated$1$4, reason: invalid class name */
        static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ AdvancedAlertFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(AdvancedAlertFragment advancedAlertFragment, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = advancedAlertFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass4(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    final StateFlow<AdvancedAlertViewState> stateFlow = this.this$0.getDuxo().getStateFlow();
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<AlertHubUiResources>() { // from class: com.robinhood.android.advanced.alert.AdvancedAlertFragment$onViewCreated$1$4$invokeSuspend$$inlined$mapNotNull$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super AlertHubUiResources> flowCollector, Continuation continuation) {
                            Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.advanced.alert.AdvancedAlertFragment$onViewCreated$1$4$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.advanced.alert.AdvancedAlertFragment$onViewCreated$1$4$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "AdvancedAlertFragment.kt", m3646l = {52}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.advanced.alert.AdvancedAlertFragment$onViewCreated$1$4$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(FlowCollector flowCollector) {
                                this.$this_unsafeFlow = flowCollector;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i = anonymousClass1.label;
                                    if ((i & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                    }
                                }
                                Object obj2 = anonymousClass1.result;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i2 = anonymousClass1.label;
                                if (i2 == 0) {
                                    ResultKt.throwOnFailure(obj2);
                                    FlowCollector flowCollector = this.$this_unsafeFlow;
                                    AlertHubUiResources uiResource = ((AdvancedAlertViewState) obj).getUiResource();
                                    if (uiResource != null) {
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(uiResource, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    }
                                } else {
                                    if (i2 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj2);
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    });
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0);
                    this.label = 1;
                    if (flowDistinctUntilChanged.collect(anonymousClass2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: AdvancedAlertFragment.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.advanced.alert.AdvancedAlertFragment$onViewCreated$1$4$2, reason: invalid class name */
            /* synthetic */ class AnonymousClass2 implements FlowCollector, FunctionAdapter {
                final /* synthetic */ AdvancedAlertFragment $tmp0;

                AnonymousClass2(AdvancedAlertFragment advancedAlertFragment) {
                    this.$tmp0 = advancedAlertFragment;
                }

                public final boolean equals(Object obj) {
                    if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                        return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                    }
                    return false;
                }

                @Override // kotlin.jvm.internal.FunctionAdapter
                public final Function<?> getFunctionDelegate() {
                    return new AdaptedFunctionReference(2, this.$tmp0, AdvancedAlertFragment.class, "updateUiString", "updateUiString(Lcom/robinhood/models/advanced/alert/db/AlertHubUiResources;)V", 4);
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }

                public final Object emit(AlertHubUiResources alertHubUiResources, Continuation<? super Unit> continuation) {
                    Object objInvokeSuspend$updateUiString = AnonymousClass4.invokeSuspend$updateUiString(this.$tmp0, alertHubUiResources, continuation);
                    return objInvokeSuspend$updateUiString == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$updateUiString : Unit.INSTANCE;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                    return emit((AlertHubUiResources) obj, (Continuation<? super Unit>) continuation);
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ Object invokeSuspend$updateUiString(AdvancedAlertFragment advancedAlertFragment, AlertHubUiResources alertHubUiResources, Continuation continuation) {
                advancedAlertFragment.updateUiString(alertHubUiResources);
                return Unit.INSTANCE;
            }
        }

        /* compiled from: AdvancedAlertFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.advanced.alert.AdvancedAlertFragment$onViewCreated$1$5", m3645f = "AdvancedAlertFragment.kt", m3646l = {347}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.advanced.alert.AdvancedAlertFragment$onViewCreated$1$5, reason: invalid class name */
        static final class AnonymousClass5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ AdvancedAlertFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(AdvancedAlertFragment advancedAlertFragment, Continuation<? super AnonymousClass5> continuation) {
                super(2, continuation);
                this.this$0 = advancedAlertFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass5(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    final StateFlow<AdvancedAlertViewState> stateFlow = this.this$0.getDuxo().getStateFlow();
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<AdvancedAlertViewState.SegmentedControlState>() { // from class: com.robinhood.android.advanced.alert.AdvancedAlertFragment$onViewCreated$1$5$invokeSuspend$$inlined$mapNotNull$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super AdvancedAlertViewState.SegmentedControlState> flowCollector, Continuation continuation) {
                            Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.advanced.alert.AdvancedAlertFragment$onViewCreated$1$5$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.advanced.alert.AdvancedAlertFragment$onViewCreated$1$5$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "AdvancedAlertFragment.kt", m3646l = {52}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.advanced.alert.AdvancedAlertFragment$onViewCreated$1$5$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(FlowCollector flowCollector) {
                                this.$this_unsafeFlow = flowCollector;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i = anonymousClass1.label;
                                    if ((i & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                    }
                                }
                                Object obj2 = anonymousClass1.result;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i2 = anonymousClass1.label;
                                if (i2 == 0) {
                                    ResultKt.throwOnFailure(obj2);
                                    FlowCollector flowCollector = this.$this_unsafeFlow;
                                    AdvancedAlertViewState.SegmentedControlState segmentedControlState = ((AdvancedAlertViewState) obj).getSegmentedControlState();
                                    if (segmentedControlState != null) {
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(segmentedControlState, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    }
                                } else {
                                    if (i2 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj2);
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    });
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0);
                    this.label = 1;
                    if (flowDistinctUntilChanged.collect(anonymousClass2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: AdvancedAlertFragment.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.advanced.alert.AdvancedAlertFragment$onViewCreated$1$5$2, reason: invalid class name */
            /* synthetic */ class AnonymousClass2 implements FlowCollector, FunctionAdapter {
                final /* synthetic */ AdvancedAlertFragment $tmp0;

                AnonymousClass2(AdvancedAlertFragment advancedAlertFragment) {
                    this.$tmp0 = advancedAlertFragment;
                }

                public final boolean equals(Object obj) {
                    if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                        return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                    }
                    return false;
                }

                @Override // kotlin.jvm.internal.FunctionAdapter
                public final Function<?> getFunctionDelegate() {
                    return new AdaptedFunctionReference(2, this.$tmp0, AdvancedAlertFragment.class, "bindSegmentedControl", "bindSegmentedControl(Lcom/robinhood/android/advanced/alert/AdvancedAlertViewState$SegmentedControlState;)V", 4);
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }

                public final Object emit(AdvancedAlertViewState.SegmentedControlState segmentedControlState, Continuation<? super Unit> continuation) {
                    Object objInvokeSuspend$bindSegmentedControl = AnonymousClass5.invokeSuspend$bindSegmentedControl(this.$tmp0, segmentedControlState, continuation);
                    return objInvokeSuspend$bindSegmentedControl == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$bindSegmentedControl : Unit.INSTANCE;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                    return emit((AdvancedAlertViewState.SegmentedControlState) obj, (Continuation<? super Unit>) continuation);
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ Object invokeSuspend$bindSegmentedControl(AdvancedAlertFragment advancedAlertFragment, AdvancedAlertViewState.SegmentedControlState segmentedControlState, Continuation continuation) {
                advancedAlertFragment.bindSegmentedControl(segmentedControlState);
                return Unit.INSTANCE;
            }
        }

        /* compiled from: AdvancedAlertFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.advanced.alert.AdvancedAlertFragment$onViewCreated$1$6", m3645f = "AdvancedAlertFragment.kt", m3646l = {354}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.advanced.alert.AdvancedAlertFragment$onViewCreated$1$6, reason: invalid class name */
        static final class AnonymousClass6 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ AdvancedAlertFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass6(AdvancedAlertFragment advancedAlertFragment, Continuation<? super AnonymousClass6> continuation) {
                super(2, continuation);
                this.this$0 = advancedAlertFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass6(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    final StateFlow<AdvancedAlertViewState> stateFlow = this.this$0.getDuxo().getStateFlow();
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<AdvancedAlertViewState.AddAlertTypeState>() { // from class: com.robinhood.android.advanced.alert.AdvancedAlertFragment$onViewCreated$1$6$invokeSuspend$$inlined$map$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super AdvancedAlertViewState.AddAlertTypeState> flowCollector, Continuation continuation) {
                            Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.advanced.alert.AdvancedAlertFragment$onViewCreated$1$6$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.advanced.alert.AdvancedAlertFragment$onViewCreated$1$6$invokeSuspend$$inlined$map$1$2", m3645f = "AdvancedAlertFragment.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.advanced.alert.AdvancedAlertFragment$onViewCreated$1$6$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(FlowCollector flowCollector) {
                                this.$this_unsafeFlow = flowCollector;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i = anonymousClass1.label;
                                    if ((i & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                    }
                                }
                                Object obj2 = anonymousClass1.result;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i2 = anonymousClass1.label;
                                if (i2 == 0) {
                                    ResultKt.throwOnFailure(obj2);
                                    FlowCollector flowCollector = this.$this_unsafeFlow;
                                    AdvancedAlertViewState.AddAlertTypeState addAlertTypeState = ((AdvancedAlertViewState) obj).getAddAlertTypeState();
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(addAlertTypeState, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else {
                                    if (i2 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj2);
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    });
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0);
                    this.label = 1;
                    if (flowDistinctUntilChanged.collect(anonymousClass2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: AdvancedAlertFragment.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.advanced.alert.AdvancedAlertFragment$onViewCreated$1$6$2, reason: invalid class name */
            /* synthetic */ class AnonymousClass2 implements FlowCollector, FunctionAdapter {
                final /* synthetic */ AdvancedAlertFragment $tmp0;

                AnonymousClass2(AdvancedAlertFragment advancedAlertFragment) {
                    this.$tmp0 = advancedAlertFragment;
                }

                public final boolean equals(Object obj) {
                    if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                        return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                    }
                    return false;
                }

                @Override // kotlin.jvm.internal.FunctionAdapter
                public final Function<?> getFunctionDelegate() {
                    return new AdaptedFunctionReference(2, this.$tmp0, AdvancedAlertFragment.class, "updateAddAlertButton", "updateAddAlertButton(Lcom/robinhood/android/advanced/alert/AdvancedAlertViewState$AddAlertTypeState;)V", 4);
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }

                public final Object emit(AdvancedAlertViewState.AddAlertTypeState addAlertTypeState, Continuation<? super Unit> continuation) {
                    Object objInvokeSuspend$updateAddAlertButton = AnonymousClass6.invokeSuspend$updateAddAlertButton(this.$tmp0, addAlertTypeState, continuation);
                    return objInvokeSuspend$updateAddAlertButton == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$updateAddAlertButton : Unit.INSTANCE;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                    return emit((AdvancedAlertViewState.AddAlertTypeState) obj, (Continuation<? super Unit>) continuation);
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ Object invokeSuspend$updateAddAlertButton(AdvancedAlertFragment advancedAlertFragment, AdvancedAlertViewState.AddAlertTypeState addAlertTypeState, Continuation continuation) {
                advancedAlertFragment.updateAddAlertButton(addAlertTypeState);
                return Unit.INSTANCE;
            }
        }

        /* compiled from: AdvancedAlertFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.advanced.alert.AdvancedAlertFragment$onViewCreated$1$7", m3645f = "AdvancedAlertFragment.kt", m3646l = {361}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.advanced.alert.AdvancedAlertFragment$onViewCreated$1$7, reason: invalid class name */
        static final class AnonymousClass7 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ AdvancedAlertFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass7(AdvancedAlertFragment advancedAlertFragment, Continuation<? super AnonymousClass7> continuation) {
                super(2, continuation);
                this.this$0 = advancedAlertFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass7(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass7) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    final StateFlow<AdvancedAlertViewState> stateFlow = this.this$0.getDuxo().getStateFlow();
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<AdvancedAlertViewState.AlertSelectorState>() { // from class: com.robinhood.android.advanced.alert.AdvancedAlertFragment$onViewCreated$1$7$invokeSuspend$$inlined$map$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super AdvancedAlertViewState.AlertSelectorState> flowCollector, Continuation continuation) {
                            Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.advanced.alert.AdvancedAlertFragment$onViewCreated$1$7$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.advanced.alert.AdvancedAlertFragment$onViewCreated$1$7$invokeSuspend$$inlined$map$1$2", m3645f = "AdvancedAlertFragment.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.advanced.alert.AdvancedAlertFragment$onViewCreated$1$7$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(FlowCollector flowCollector) {
                                this.$this_unsafeFlow = flowCollector;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i = anonymousClass1.label;
                                    if ((i & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                    }
                                }
                                Object obj2 = anonymousClass1.result;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i2 = anonymousClass1.label;
                                if (i2 == 0) {
                                    ResultKt.throwOnFailure(obj2);
                                    FlowCollector flowCollector = this.$this_unsafeFlow;
                                    AdvancedAlertViewState.AlertSelectorState alertSelectorState = ((AdvancedAlertViewState) obj).getAlertSelectorState();
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(alertSelectorState, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else {
                                    if (i2 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj2);
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    });
                    final AdvancedAlertFragment advancedAlertFragment = this.this$0;
                    FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.advanced.alert.AdvancedAlertFragment.onViewCreated.1.7.2
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                            return emit((AdvancedAlertViewState.AlertSelectorState) obj2, (Continuation<? super Unit>) continuation);
                        }

                        public final Object emit(AdvancedAlertViewState.AlertSelectorState alertSelectorState, Continuation<? super Unit> continuation) {
                            AlertHubUiResourcesContent content;
                            int i2;
                            AlertHubUiResourcesContent content2;
                            String indicatorAlertsEmptyStateMessage = null;
                            if (alertSelectorState.isPriceSelected()) {
                                AlertHubUiResources uiResource = alertSelectorState.getUiResource();
                                if (uiResource != null && (content2 = uiResource.getContent()) != null) {
                                    indicatorAlertsEmptyStateMessage = content2.getPriceAlertsEmptyStateMessage();
                                }
                            } else {
                                AlertHubUiResources uiResource2 = alertSelectorState.getUiResource();
                                if (uiResource2 != null && (content = uiResource2.getContent()) != null) {
                                    indicatorAlertsEmptyStateMessage = content.getIndicatorAlertsEmptyStateMessage();
                                }
                            }
                            if (indicatorAlertsEmptyStateMessage != null) {
                                advancedAlertFragment.getBinding().emptyViewTextMessage.setText(indicatorAlertsEmptyStateMessage);
                            }
                            if (alertSelectorState.isPriceSelected()) {
                                i2 = C8387R.drawable.alert_hub_price_empty_state_image;
                            } else {
                                i2 = C8387R.drawable.alert_hub_indicator_empty_state_image;
                            }
                            advancedAlertFragment.getBinding().emptyImageView.setImageResource(i2);
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (flowDistinctUntilChanged.collect(flowCollector, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        bindNotificationInfoBanner();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setElevation(0.0f);
        if (((Args) INSTANCE.getArgs((Fragment) this)).getEntryPoint() == AdvancedAlertEntryPoint.ALERT_HUB_SETTING) {
            return;
        }
        RhToolbar.addCustomView$default(toolbar, C8387R.layout.toolbar_all_custom_alerts_button, false, 8388613, 2, null);
        RdsTextButton rdsTextButton = (RdsTextButton) toolbar.findViewById(C8387R.id.all_custom_alerts_button);
        if (rdsTextButton != null) {
            OnClickListeners.onClick(rdsTextButton, new Function0() { // from class: com.robinhood.android.advanced.alert.AdvancedAlertFragment$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AdvancedAlertFragment.configureToolbar$lambda$19(this.f$0);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit configureToolbar$lambda$19(AdvancedAlertFragment advancedAlertFragment) {
        AlertHubSettings2 alertHubSettings2;
        Navigator navigator = advancedAlertFragment.getNavigator();
        android.content.Context contextRequireContext = advancedAlertFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        int i = WhenMappings.$EnumSwitchMapping$0[advancedAlertFragment.getEntityType().ordinal()];
        if (i == 1) {
            alertHubSettings2 = AlertHubSettings2.STOCK;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            alertHubSettings2 = AlertHubSettings2.CRYPTO;
        }
        Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, new AlertHubSettingsKey(alertHubSettings2, AdvancedAlert4.ADVANCED_ALERT), false, false, false, null, false, null, false, false, null, null, 4084, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setPriceAlertViewState(List<AdvancedAlertViewState.AlertSettingWithResource> list) {
        this.listAdapter.submitList(list);
        LinearLayout emptyView = getBinding().emptyView;
        Intrinsics.checkNotNullExpressionValue(emptyView, "emptyView");
        emptyView.setVisibility(list.isEmpty() ? 0 : 8);
    }

    private final void bindView() {
        getBinding().advancedAlertTitle.setText(getString(C8387R.string.advanced_alert_v2_title, getEntitySymbol()));
        getBinding().advancedAlertSubtitle.setText(getString(C8387R.string.advanced_alert_v2_subtitle, getEntitySymbol()));
        int i = WhenMappings.$EnumSwitchMapping$0[getEntityType().ordinal()];
        if (i == 1) {
            View topDivider = getBinding().topDivider;
            Intrinsics.checkNotNullExpressionValue(topDivider, "topDivider");
            topDivider.setVisibility(0);
            ComposeView advancedAlertSegmentedControl = getBinding().advancedAlertSegmentedControl;
            Intrinsics.checkNotNullExpressionValue(advancedAlertSegmentedControl, "advancedAlertSegmentedControl");
            advancedAlertSegmentedControl.setVisibility(0);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            View topDivider2 = getBinding().topDivider;
            Intrinsics.checkNotNullExpressionValue(topDivider2, "topDivider");
            topDivider2.setVisibility(8);
            ComposeView advancedAlertSegmentedControl2 = getBinding().advancedAlertSegmentedControl;
            Intrinsics.checkNotNullExpressionValue(advancedAlertSegmentedControl2, "advancedAlertSegmentedControl");
            advancedAlertSegmentedControl2.setVisibility(8);
        }
        RecyclerView recyclerView = getBinding().recyclerView;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        bindAdapter(recyclerView, this.compositeAdapter);
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        new ItemTouchHelper(new AdvancedChartIndicatorListItemTouchHelperCallbacks(contextRequireContext, this.listAdapter, new Function2() { // from class: com.robinhood.android.advanced.alert.AdvancedAlertFragment$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AdvancedAlertFragment.bindView$lambda$20((String) obj, ((Integer) obj2).intValue());
            }
        }, new Function1() { // from class: com.robinhood.android.advanced.alert.AdvancedAlertFragment$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdvancedAlertFragment.bindView$lambda$23(this.f$0, (String) obj);
            }
        }, false, true)).attachToRecyclerView(getBinding().recyclerView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$20(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$23(AdvancedAlertFragment advancedAlertFragment, String id) {
        List<AlertHubSettingItem> settings;
        Object next;
        Intrinsics.checkNotNullParameter(id, "id");
        advancedAlertFragment.getDuxo().deleteSetting(id);
        AdvancedAlert advancedAlert = advancedAlertFragment.getDuxo().getStateFlow().getValue().getAdvancedAlert();
        if (advancedAlert != null && (settings = advancedAlert.getSettings()) != null) {
            Iterator<T> it = settings.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                AlertHubSettingItem alertHubSettingItem = (AlertHubSettingItem) next;
                if (Intrinsics.areEqual(alertHubSettingItem != null ? alertHubSettingItem.getId() : null, id)) {
                    break;
                }
            }
            AlertHubSettingItem alertHubSettingItem2 = (AlertHubSettingItem) next;
            if (alertHubSettingItem2 != null) {
                EventLogger eventLogger = advancedAlertFragment.getEventLogger();
                UserInteractionEventData.Action action = UserInteractionEventData.Action.DELETE_ALERT;
                Screen eventScreen = advancedAlertFragment.getEventScreen();
                Component.ComponentType componentType = Component.ComponentType.ALERT_SETTING_ROW;
                ApiAlertHubSettingItem.Type settingType = alertHubSettingItem2.getSettingType();
                String serverValue = settingType != null ? settingType.getServerValue() : null;
                if (serverValue == null) {
                    serverValue = "";
                }
                EventLogger.DefaultImpls.logTap$default(eventLogger, action, eventScreen, new Component(componentType, serverValue, null, 4, null), null, advancedAlertFragment.getEventContext(), false, 40, null);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateUiString(AlertHubUiResources uiResource) {
        AlertHubUiResourcesContent content = uiResource.getContent();
        getBinding().advancedAlertTitle.setText(StringsKt.replace$default(content.getAlertHubTitle(), AlertHubUiResources.SYMBOL_PARAM, getEntitySymbol(), false, 4, (Object) null));
        getBinding().advancedAlertSubtitle.setText(StringsKt.replace$default(content.getAlertHubSubtitle(), AlertHubUiResources.SYMBOL_PARAM, getEntitySymbol(), false, 4, (Object) null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindSegmentedControl(final AdvancedAlertViewState.SegmentedControlState state) {
        final AlertType[] alertTypeArrValues = AlertType.values();
        getBinding().advancedAlertSegmentedControl.setContent(ComposableLambda3.composableLambdaInstance(1899290912, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advanced.alert.AdvancedAlertFragment.bindSegmentedControl.1

            /* compiled from: AdvancedAlertFragment.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.advanced.alert.AdvancedAlertFragment$bindSegmentedControl$1$1, reason: invalid class name */
            static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                final /* synthetic */ AlertType[] $alertTypes;
                final /* synthetic */ AdvancedAlertViewState.SegmentedControlState $state;
                final /* synthetic */ AdvancedAlertFragment this$0;

                AnonymousClass1(AdvancedAlertViewState.SegmentedControlState segmentedControlState, AlertType[] alertTypeArr, AdvancedAlertFragment advancedAlertFragment) {
                    this.$state = segmentedControlState;
                    this.$alertTypes = alertTypeArr;
                    this.this$0 = advancedAlertFragment;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer, int i) {
                    if ((i & 3) == 2 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2091127250, i, -1, "com.robinhood.android.advanced.alert.AdvancedAlertFragment.bindSegmentedControl.<anonymous>.<anonymous> (AdvancedAlertFragment.kt:469)");
                    }
                    String priceRadioBtnTxt = this.$state.getPriceRadioBtnTxt();
                    composer.startReplaceGroup(471412136);
                    if (priceRadioBtnTxt == null) {
                        priceRadioBtnTxt = StringResources_androidKt.stringResource(C8387R.string.advanced_alert_price_alert_radio_button, composer, 0);
                    }
                    composer.endReplaceGroup();
                    Segment segment = new Segment(null, priceRadioBtnTxt, null, 5, null);
                    String indicatorRadioBtnTxt = this.$state.getIndicatorRadioBtnTxt();
                    composer.startReplaceGroup(471419152);
                    if (indicatorRadioBtnTxt == null) {
                        indicatorRadioBtnTxt = StringResources_androidKt.stringResource(C8387R.string.advanced_alert_indicator_alert_radio_button, composer, 0);
                    }
                    composer.endReplaceGroup();
                    List listListOf = CollectionsKt.listOf((Object[]) new Segment[]{segment, new Segment(null, indicatorRadioBtnTxt, null, 5, null)});
                    int iIndexOf = ArraysKt.indexOf(this.$alertTypes, this.$state.getActiveAlertType());
                    composer.startReplaceGroup(-1746271574);
                    boolean zChangedInstance = composer.changedInstance(this.$alertTypes) | composer.changedInstance(this.this$0) | composer.changed(this.$state);
                    final AlertType[] alertTypeArr = this.$alertTypes;
                    final AdvancedAlertFragment advancedAlertFragment = this.this$0;
                    final AdvancedAlertViewState.SegmentedControlState segmentedControlState = this.$state;
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1() { // from class: com.robinhood.android.advanced.alert.AdvancedAlertFragment$bindSegmentedControl$1$1$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AdvancedAlertFragment.C83841.AnonymousClass1.invoke$lambda$1$lambda$0(alertTypeArr, advancedAlertFragment, segmentedControlState, ((Integer) obj).intValue());
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    composer.endReplaceGroup();
                    BentoSegmentedControl2.BentoSegmentedControl(listListOf, iIndexOf, (Function1) objRememberedValue, null, false, composer, Segment.$stable, 24);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit invoke$lambda$1$lambda$0(AlertType[] alertTypeArr, AdvancedAlertFragment advancedAlertFragment, AdvancedAlertViewState.SegmentedControlState segmentedControlState, int i) {
                    advancedAlertFragment.getDuxo().updateSelectedSegment(alertTypeArr[i]);
                    EventLogger eventLogger = advancedAlertFragment.getEventLogger();
                    UserInteractionEventData.Action action = UserInteractionEventData.Action.SELECT;
                    Screen eventScreen = advancedAlertFragment.getEventScreen();
                    Component component = new Component(Component.ComponentType.TAB, segmentedControlState.getActiveAlertType().getLoggingIdentifier(), null, 4, null);
                    String string2 = advancedAlertFragment.getEntityUuid().toString();
                    Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                    Asset asset = new Asset(string2, advancedAlertFragment.getAssetType(), null, null, 12, null);
                    String serverValue = ((Args) AdvancedAlertFragment.INSTANCE.getArgs((Fragment) advancedAlertFragment)).getEntryPoint().getServerValue();
                    int i2 = 0;
                    EventLogger.DefaultImpls.logTap$default(eventLogger, action, eventScreen, component, null, new Context(i2, segmentedControlState.getItemCount(), 0, null, null, null, null, null, 0, null, serverValue, null, null, null, asset, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -17411, -1, -1, -1, -1, -1, 16383, null), false, 40, null);
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                if ((i & 3) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1899290912, i, -1, "com.robinhood.android.advanced.alert.AdvancedAlertFragment.bindSegmentedControl.<anonymous> (AdvancedAlertFragment.kt:468)");
                }
                BentoTheme2.BentoTheme(ScarletComposeInterop.themeChangesForCompose(AdvancedAlertFragment.this.getScarletManager()), null, ComposableLambda3.rememberComposableLambda(-2091127250, true, new AnonymousClass1(state, alertTypeArrValues, AdvancedAlertFragment.this), composer, 54), composer, 384, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateAddAlertButton(AdvancedAlertViewState.AddAlertTypeState state) {
        this.addAlertAdapter.setData(state);
    }

    @SuppressLint({"InlinedApi", "NewApi"})
    private final void bindNotificationInfoBanner() {
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        NotificationManagerCompat notificationManager = ContextSystemServices.getNotificationManager(contextRequireContext);
        RdsInfoBannerView rdsInfoBannerView = getBinding().notificationInfoBanner;
        Intrinsics.checkNotNull(rdsInfoBannerView);
        rdsInfoBannerView.setVisibility(!notificationManager.areNotificationsEnabled() ? 0 : 8);
        OnClickListeners.onClick(rdsInfoBannerView, new Function0() { // from class: com.robinhood.android.advanced.alert.AdvancedAlertFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AdvancedAlertFragment.bindNotificationInfoBanner$lambda$25$lambda$24(this.f$0);
            }
        });
        rdsInfoBannerView.setArrowVisible(false);
        getDuxo().updateNotificationRelayEnabled(notificationManager.areNotificationsEnabled());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindNotificationInfoBanner$lambda$25$lambda$24(AdvancedAlertFragment advancedAlertFragment) {
        Intent intent = new Intent("android.settings.APP_NOTIFICATION_SETTINGS");
        android.content.Context contextRequireContext = advancedAlertFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Intent intentPutExtra = intent.putExtra("android.provider.extra.APP_PACKAGE", Contexts8.getPackageInfo$default(contextRequireContext, 0, 1, null).packageName);
        Intrinsics.checkNotNullExpressionValue(intentPutExtra, "putExtra(...)");
        advancedAlertFragment.startActivity(intentPutExtra);
        return Unit.INSTANCE;
    }

    /* compiled from: AdvancedAlertFragment.kt */
    @Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\u0019\u001a\u00020\u000bHÆ\u0003J?\u0010\u001a\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0006\u0010\u001b\u001a\u00020\u001cJ\u0013\u0010\u001d\u001a\u00020\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u001cHÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001J\u0016\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001cR\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/advanced/alert/AdvancedAlertFragment$Args;", "Landroid/os/Parcelable;", "entity", "Lcom/robinhood/utils/Either;", "Lcom/robinhood/models/db/Instrument;", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "defaultToPriceAlert", "", "chartInterval", "Lcom/robinhood/models/ui/Historical$Interval;", "entryPoint", "Lcom/robinhood/librobinhood/data/store/alert/AdvancedAlertEntryPoint;", "<init>", "(Lcom/robinhood/utils/Either;ZLcom/robinhood/models/ui/Historical$Interval;Lcom/robinhood/librobinhood/data/store/alert/AdvancedAlertEntryPoint;)V", "getEntity", "()Lcom/robinhood/utils/Either;", "getDefaultToPriceAlert", "()Z", "getChartInterval", "()Lcom/robinhood/models/ui/Historical$Interval;", "getEntryPoint", "()Lcom/robinhood/librobinhood/data/store/alert/AdvancedAlertEntryPoint;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-lib-advanced-alert_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final Historical.Interval chartInterval;
        private final boolean defaultToPriceAlert;
        private final Either<Instrument, UiCurrencyPair> entity;
        private final AdvancedAlertEntryPoint entryPoint;

        /* compiled from: AdvancedAlertFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(EitherParceler.INSTANCE.m23663create(parcel), parcel.readInt() != 0, parcel.readInt() == 0 ? null : Historical.Interval.valueOf(parcel.readString()), AdvancedAlertEntryPoint.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Args copy$default(Args args, Either either, boolean z, Historical.Interval interval, AdvancedAlertEntryPoint advancedAlertEntryPoint, int i, Object obj) {
            if ((i & 1) != 0) {
                either = args.entity;
            }
            if ((i & 2) != 0) {
                z = args.defaultToPriceAlert;
            }
            if ((i & 4) != 0) {
                interval = args.chartInterval;
            }
            if ((i & 8) != 0) {
                advancedAlertEntryPoint = args.entryPoint;
            }
            return args.copy(either, z, interval, advancedAlertEntryPoint);
        }

        public final Either<Instrument, UiCurrencyPair> component1() {
            return this.entity;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getDefaultToPriceAlert() {
            return this.defaultToPriceAlert;
        }

        /* renamed from: component3, reason: from getter */
        public final Historical.Interval getChartInterval() {
            return this.chartInterval;
        }

        /* renamed from: component4, reason: from getter */
        public final AdvancedAlertEntryPoint getEntryPoint() {
            return this.entryPoint;
        }

        public final Args copy(Either<Instrument, UiCurrencyPair> entity, boolean defaultToPriceAlert, Historical.Interval chartInterval, AdvancedAlertEntryPoint entryPoint) {
            Intrinsics.checkNotNullParameter(entity, "entity");
            Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
            return new Args(entity, defaultToPriceAlert, chartInterval, entryPoint);
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
            return Intrinsics.areEqual(this.entity, args.entity) && this.defaultToPriceAlert == args.defaultToPriceAlert && this.chartInterval == args.chartInterval && this.entryPoint == args.entryPoint;
        }

        public int hashCode() {
            int iHashCode = ((this.entity.hashCode() * 31) + Boolean.hashCode(this.defaultToPriceAlert)) * 31;
            Historical.Interval interval = this.chartInterval;
            return ((iHashCode + (interval == null ? 0 : interval.hashCode())) * 31) + this.entryPoint.hashCode();
        }

        public String toString() {
            return "Args(entity=" + this.entity + ", defaultToPriceAlert=" + this.defaultToPriceAlert + ", chartInterval=" + this.chartInterval + ", entryPoint=" + this.entryPoint + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            EitherParceler.INSTANCE.write((Either<?, ?>) this.entity, dest, flags);
            dest.writeInt(this.defaultToPriceAlert ? 1 : 0);
            Historical.Interval interval = this.chartInterval;
            if (interval == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(interval.name());
            }
            dest.writeString(this.entryPoint.name());
        }

        public Args(Either<Instrument, UiCurrencyPair> entity, boolean z, Historical.Interval interval, AdvancedAlertEntryPoint entryPoint) {
            Intrinsics.checkNotNullParameter(entity, "entity");
            Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
            this.entity = entity;
            this.defaultToPriceAlert = z;
            this.chartInterval = interval;
            this.entryPoint = entryPoint;
        }

        public final Either<Instrument, UiCurrencyPair> getEntity() {
            return this.entity;
        }

        public final boolean getDefaultToPriceAlert() {
            return this.defaultToPriceAlert;
        }

        public final Historical.Interval getChartInterval() {
            return this.chartInterval;
        }

        public /* synthetic */ Args(Either either, boolean z, Historical.Interval interval, AdvancedAlertEntryPoint advancedAlertEntryPoint, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(either, (i & 2) != 0 ? true : z, (i & 4) != 0 ? null : interval, (i & 8) != 0 ? AdvancedAlertEntryPoint.NONE : advancedAlertEntryPoint);
        }

        public final AdvancedAlertEntryPoint getEntryPoint() {
            return this.entryPoint;
        }
    }

    /* compiled from: AdvancedAlertFragment.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/advanced/alert/AdvancedAlertFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolver;", "Lcom/robinhood/android/education/contracts/AdvancedAlert;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/advanced/alert/AdvancedAlertFragment;", "Lcom/robinhood/android/advanced/alert/AdvancedAlertFragment$Args;", "<init>", "()V", "createFragment", "Landroidx/fragment/app/Fragment;", "key", "feature-lib-advanced-alert_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolver<com.robinhood.android.education.contracts.AdvancedAlert>, FragmentWithArgsCompanion<AdvancedAlertFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(AdvancedAlertFragment advancedAlertFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, advancedAlertFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public AdvancedAlertFragment newInstance(Args args) {
            return (AdvancedAlertFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(AdvancedAlertFragment advancedAlertFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, advancedAlertFragment, args);
        }

        @Override // com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(com.robinhood.android.education.contracts.AdvancedAlert key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return newInstance((Parcelable) new Args(key.getEntity(), key.getDefaultToPriceAlert(), key.getChartInterval(), key.getEntryPoint()));
        }
    }
}
