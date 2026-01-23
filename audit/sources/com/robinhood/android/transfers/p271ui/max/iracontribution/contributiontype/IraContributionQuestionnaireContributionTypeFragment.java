package com.robinhood.android.transfers.p271ui.max.iracontribution.contributiontype;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.jakewharton.rxbinding3.recyclerview.RecyclerViewScrollEvent;
import com.jakewharton.rxbinding3.recyclerview.RxRecyclerView;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.autoeventlogging.ViewsKt;
import com.robinhood.android.autoeventlogging.VisibleAutoLoggableViewManager;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.BaseRhBottomSheetDialogHostFragment;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.p088ui.RhBottomSheetDialogFragmentHost;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.designsystem.compose.ScarletComposeInterop;
import com.robinhood.android.designsystem.compose.ThemesFromScarlet;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.RetirementRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.transfers.C30065R;
import com.robinhood.android.transfers.databinding.FragmentIraContributionQuestionnaireBinding;
import com.robinhood.android.transfers.p271ui.max.iracontribution.contributiontype.IraContributionQuestionnaireContributionTypeFragment;
import com.robinhood.android.transfers.p271ui.max.iracontribution.contributiontype.IraContributionQuestionnaireContributionTypeViewState;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.bonfire.ApiIraContributionQuestionnaire;
import com.robinhood.models.api.bonfire.IraContributionType;
import com.robinhood.models.serverdriven.experimental.api.Button;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import io.noties.markwon.Markwon;
import io.reactivex.Observable;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.ExceptionsH;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
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
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces;
import kotlin.properties.Interfaces2;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: IraContributionQuestionnaireContributionTypeFragment.kt */
@Metadata(m3635d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \\2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002[\\B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010@\u001a\u00020A2\b\u0010B\u001a\u0004\u0018\u00010CH\u0016J\u001a\u0010D\u001a\u00020A2\u0006\u0010E\u001a\u00020F2\b\u0010B\u001a\u0004\u0018\u00010CH\u0016J\b\u0010G\u001a\u00020AH\u0016J\u001a\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020K2\b\u0010L\u001a\u0004\u0018\u00010CH\u0016J\u0010\u0010M\u001a\u00020A2\u0006\u0010N\u001a\u00020OH\u0002J\b\u0010P\u001a\u00020AH\u0016J\u0016\u0010Q\u001a\u00020R2\f\u0010S\u001a\b\u0012\u0004\u0012\u00020)0TH\u0002J\t\u0010U\u001a\u00020IH\u0096\u0001R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010\"\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u001b\u001a\u0004\b$\u0010%R\u0014\u0010'\u001a\b\u0012\u0004\u0012\u00020)0(X\u0082\u0004¢\u0006\u0002\n\u0000R/\u0010,\u001a\u0004\u0018\u00010+2\b\u0010*\u001a\u0004\u0018\u00010+8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R/\u00104\u001a\u0004\u0018\u0001032\b\u0010*\u001a\u0004\u0018\u0001038B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b9\u00102\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001a\u0010:\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020=0;X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010>\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020=0?X\u0082.¢\u0006\u0002\n\u0000R\u0018\u0010V\u001a\b\u0012\u0004\u0012\u00020X0WX\u0096\u0005¢\u0006\u0006\u001a\u0004\bY\u0010Z¨\u0006]"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/iracontribution/contributiontype/IraContributionQuestionnaireContributionTypeFragment;", "Lcom/robinhood/android/common/ui/BaseRhBottomSheetDialogHostFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "callbacks", "Lcom/robinhood/android/transfers/ui/max/iracontribution/contributiontype/IraContributionQuestionnaireContributionTypeFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/transfers/ui/max/iracontribution/contributiontype/IraContributionQuestionnaireContributionTypeFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/transfers/ui/max/iracontribution/contributiontype/IraContributionQuestionnaireContributionTypeDuxo;", "getDuxo", "()Lcom/robinhood/android/transfers/ui/max/iracontribution/contributiontype/IraContributionQuestionnaireContributionTypeDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "viewBinding", "Lcom/robinhood/android/transfers/databinding/FragmentIraContributionQuestionnaireBinding;", "getViewBinding", "()Lcom/robinhood/android/transfers/databinding/FragmentIraContributionQuestionnaireBinding;", "viewBinding$delegate", "actionHandler", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "<set-?>", "Lcom/robinhood/models/api/bonfire/IraContributionType;", "selectedContributionType", "getSelectedContributionType", "()Lcom/robinhood/models/api/bonfire/IraContributionType;", "setSelectedContributionType", "(Lcom/robinhood/models/api/bonfire/IraContributionType;)V", "selectedContributionType$delegate", "Lkotlin/properties/ReadWriteProperty;", "", "buttonLoggingIdentifier", "getButtonLoggingIdentifier", "()Ljava/lang/String;", "setButtonLoggingIdentifier", "(Ljava/lang/String;)V", "buttonLoggingIdentifier$delegate", "contributionTypeAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/designsystem/row/RdsRowView;", "Lcom/robinhood/android/transfers/ui/max/iracontribution/contributiontype/IraContributionQuestionnaireContributionTypeViewState$RowState;", "contributionTypeVisibleItemsManager", "Lcom/robinhood/android/autoeventlogging/VisibleAutoLoggableViewManager;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "onStart", "onPrimaryButtonClicked", "", "dialogId", "", "passthroughArgs", "setViewState", "viewState", "Lcom/robinhood/android/transfers/ui/max/iracontribution/contributiontype/IraContributionQuestionnaireContributionTypeViewState;", "onStop", "showSduiAlertSheet", "Lcom/robinhood/android/common/ui/RhBottomSheetDialogFragmentHost$SheetListener;", "alert", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Companion", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class IraContributionQuestionnaireContributionTypeFragment extends BaseRhBottomSheetDialogHostFragment implements RegionGated, AutoLoggableFragment {
    private final /* synthetic */ RegionGated2 $$delegate_0;
    private final SduiActionHandler<GenericAction> actionHandler;

    /* renamed from: buttonLoggingIdentifier$delegate, reason: from kotlin metadata */
    private final Interfaces3 buttonLoggingIdentifier;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    private final GenericListAdapter<RdsRowView, IraContributionQuestionnaireContributionTypeViewState.RowState> contributionTypeAdapter;
    private VisibleAutoLoggableViewManager<IraContributionType, IraContributionQuestionnaireContributionTypeViewState.RowState> contributionTypeVisibleItemsManager;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public EventLogger eventLogger;
    public Markwon markwon;

    /* renamed from: selectedContributionType$delegate, reason: from kotlin metadata */
    private final Interfaces3 selectedContributionType;

    /* renamed from: viewBinding$delegate, reason: from kotlin metadata */
    private final Interfaces2 viewBinding;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(IraContributionQuestionnaireContributionTypeFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/transfers/ui/max/iracontribution/contributiontype/IraContributionQuestionnaireContributionTypeFragment$Callbacks;", 0)), Reflection.property1(new PropertyReference1Impl(IraContributionQuestionnaireContributionTypeFragment.class, "viewBinding", "getViewBinding()Lcom/robinhood/android/transfers/databinding/FragmentIraContributionQuestionnaireBinding;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(IraContributionQuestionnaireContributionTypeFragment.class, "selectedContributionType", "getSelectedContributionType()Lcom/robinhood/models/api/bonfire/IraContributionType;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(IraContributionQuestionnaireContributionTypeFragment.class, "buttonLoggingIdentifier", "getButtonLoggingIdentifier()Ljava/lang/String;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: IraContributionQuestionnaireContributionTypeFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/iracontribution/contributiontype/IraContributionQuestionnaireContributionTypeFragment$Callbacks;", "", "onContributionTypeSelected", "", "contributionType", "Lcom/robinhood/models/api/bonfire/IraContributionType;", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onContributionTypeSelected(IraContributionType contributionType);
    }

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

    public IraContributionQuestionnaireContributionTypeFragment() {
        super(C30065R.layout.fragment_ira_contribution_questionnaire);
        this.$$delegate_0 = new RegionGated2(RetirementRegionGate.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.transfers.ui.max.iracontribution.contributiontype.IraContributionQuestionnaireContributionTypeFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (android.content.Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof IraContributionQuestionnaireContributionTypeFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
        this.duxo = DuxosKt.duxo(this, IraContributionQuestionnaireContributionTypeDuxo.class);
        this.viewBinding = ViewBinding5.viewBinding(this, IraContributionQuestionnaireContributionTypeFragment3.INSTANCE);
        this.actionHandler = new SduiActionHandler() { // from class: com.robinhood.android.transfers.ui.max.iracontribution.contributiontype.IraContributionQuestionnaireContributionTypeFragment$actionHandler$1
            @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
            /* renamed from: handle, reason: merged with bridge method [inline-methods] */
            public final boolean mo15941handle(GenericAction action) {
                Intrinsics.checkNotNullParameter(action, "action");
                if (!(action instanceof GenericAction.Deeplink)) {
                    return false;
                }
                Navigator navigator = this.this$0.getNavigator();
                android.content.Context contextRequireContext = this.this$0.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                return Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, Uri.parse(((GenericAction.Deeplink) action).getValue2().getUri()), null, null, false, null, 60, null);
            }
        };
        Interfaces interfacesSavedSerializable = BindSavedState2.savedSerializable(this);
        KProperty<?>[] kPropertyArr = $$delegatedProperties;
        this.selectedContributionType = (Interfaces3) interfacesSavedSerializable.provideDelegate(this, kPropertyArr[2]);
        this.buttonLoggingIdentifier = BindSavedState2.savedString(this).provideDelegate(this, kPropertyArr[3]);
        this.contributionTypeAdapter = GenericListAdapter.INSTANCE.m2987of(RdsRowView.INSTANCE, DiffCallbacks.INSTANCE.byEquality(new Function1() { // from class: com.robinhood.android.transfers.ui.max.iracontribution.contributiontype.IraContributionQuestionnaireContributionTypeFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IraContributionQuestionnaireContributionTypeFragment.contributionTypeAdapter$lambda$0((IraContributionQuestionnaireContributionTypeViewState.RowState) obj);
            }
        }), new Function2() { // from class: com.robinhood.android.transfers.ui.max.iracontribution.contributiontype.IraContributionQuestionnaireContributionTypeFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return IraContributionQuestionnaireContributionTypeFragment.contributionTypeAdapter$lambda$3(this.f$0, (RdsRowView) obj, (IraContributionQuestionnaireContributionTypeViewState.RowState) obj2);
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

    public final Markwon getMarkwon() {
        Markwon markwon = this.markwon;
        if (markwon != null) {
            return markwon;
        }
        Intrinsics.throwUninitializedPropertyAccessException("markwon");
        return null;
    }

    public final void setMarkwon(Markwon markwon) {
        Intrinsics.checkNotNullParameter(markwon, "<set-?>");
        this.markwon = markwon;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return new Screen(Screen.Name.SELECT_RETIREMENT_CONTRIBUTION_TYPE, null, null, null, 14, null);
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IraContributionQuestionnaireContributionTypeDuxo getDuxo() {
        return (IraContributionQuestionnaireContributionTypeDuxo) this.duxo.getValue();
    }

    private final FragmentIraContributionQuestionnaireBinding getViewBinding() {
        Object value = this.viewBinding.getValue(this, $$delegatedProperties[1]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentIraContributionQuestionnaireBinding) value;
    }

    private final IraContributionType getSelectedContributionType() {
        return (IraContributionType) this.selectedContributionType.getValue(this, $$delegatedProperties[2]);
    }

    private final void setSelectedContributionType(IraContributionType iraContributionType) {
        this.selectedContributionType.setValue(this, $$delegatedProperties[2], iraContributionType);
    }

    private final String getButtonLoggingIdentifier() {
        return (String) this.buttonLoggingIdentifier.getValue(this, $$delegatedProperties[3]);
    }

    private final void setButtonLoggingIdentifier(String str) {
        this.buttonLoggingIdentifier.setValue(this, $$delegatedProperties[3], str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object contributionTypeAdapter$lambda$0(IraContributionQuestionnaireContributionTypeViewState.RowState byEquality) {
        Intrinsics.checkNotNullParameter(byEquality, "$this$byEquality");
        return byEquality.getRow().getContribution_type();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit contributionTypeAdapter$lambda$3(final IraContributionQuestionnaireContributionTypeFragment iraContributionQuestionnaireContributionTypeFragment, RdsRowView of, IraContributionQuestionnaireContributionTypeViewState.RowState rowState) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(rowState, "rowState");
        final ApiIraContributionQuestionnaire.ContributionTypeRow row = rowState.getRow();
        of.setLeadingIconDrawable(ContextCompat.getDrawable(of.getContext(), row.getIcon().getResourceId()));
        of.setPrimaryText(row.getTitle());
        of.setSecondaryText(row.getSubtitle());
        of.setEnabled(row.is_enabled() && rowState.isRowEnabled());
        ViewsKt.eventData$default(of, false, new Function0() { // from class: com.robinhood.android.transfers.ui.max.iracontribution.contributiontype.IraContributionQuestionnaireContributionTypeFragment$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IraContributionQuestionnaireContributionTypeFragment.contributionTypeAdapter$lambda$3$lambda$1(row);
            }
        }, 1, null);
        OnClickListeners.onClick(of, new Function0() { // from class: com.robinhood.android.transfers.ui.max.iracontribution.contributiontype.IraContributionQuestionnaireContributionTypeFragment$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IraContributionQuestionnaireContributionTypeFragment.contributionTypeAdapter$lambda$3$lambda$2(this.f$0, row);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor contributionTypeAdapter$lambda$3$lambda$1(ApiIraContributionQuestionnaire.ContributionTypeRow contributionTypeRow) {
        return new UserInteractionEventDescriptor(contributionTypeRow.getLogging_identifier(), null, null, null, new Component(Component.ComponentType.ROW, contributionTypeRow.getLogging_identifier(), null, 4, null), null, 46, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit contributionTypeAdapter$lambda$3$lambda$2(IraContributionQuestionnaireContributionTypeFragment iraContributionQuestionnaireContributionTypeFragment, ApiIraContributionQuestionnaire.ContributionTypeRow contributionTypeRow) {
        iraContributionQuestionnaireContributionTypeFragment.getDuxo().validateContributionType(contributionTypeRow.getContribution_type());
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.contributionTypeAdapter.registerAdapterDataObserver(new RecyclerView.AdapterDataObserver() { // from class: com.robinhood.android.transfers.ui.max.iracontribution.contributiontype.IraContributionQuestionnaireContributionTypeFragment.onCreate.1
            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onItemRangeChanged(int positionStart, int itemCount) {
                VisibleAutoLoggableViewManager visibleAutoLoggableViewManager = IraContributionQuestionnaireContributionTypeFragment.this.contributionTypeVisibleItemsManager;
                if (visibleAutoLoggableViewManager == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("contributionTypeVisibleItemsManager");
                    visibleAutoLoggableViewManager = null;
                }
                visibleAutoLoggableViewManager.update();
            }
        });
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        RecyclerView iraContributionQuestionnaireRecyclerview = getViewBinding().iraContributionQuestionnaireRecyclerview;
        Intrinsics.checkNotNullExpressionValue(iraContributionQuestionnaireRecyclerview, "iraContributionQuestionnaireRecyclerview");
        RecyclerView.LayoutManager layoutManager = iraContributionQuestionnaireRecyclerview.getLayoutManager();
        Intrinsics.checkNotNull(layoutManager);
        this.contributionTypeVisibleItemsManager = new VisibleAutoLoggableViewManager<>(layoutManager, new C308751(this.contributionTypeAdapter), new C308762(this.contributionTypeAdapter), new Function1() { // from class: com.robinhood.android.transfers.ui.max.iracontribution.contributiontype.IraContributionQuestionnaireContributionTypeFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IraContributionQuestionnaireContributionTypeFragment.onViewCreated$lambda$4((IraContributionQuestionnaireContributionTypeViewState.RowState) obj);
            }
        }, true, false, 32, null);
        RhTextView rhTextView = getViewBinding().iraContributionQuestionnaireTitle;
        Companion companion = INSTANCE;
        rhTextView.setText(((ApiIraContributionQuestionnaire.ContributionTypeViewModel) companion.getArgs((Fragment) this)).getTitle());
        if (!((ApiIraContributionQuestionnaire.ContributionTypeViewModel) companion.getArgs((Fragment) this)).getPre_rows_content().isEmpty()) {
            ComposeView iraContributionQuestionnaireComposeView = getViewBinding().iraContributionQuestionnaireComposeView;
            Intrinsics.checkNotNullExpressionValue(iraContributionQuestionnaireComposeView, "iraContributionQuestionnaireComposeView");
            iraContributionQuestionnaireComposeView.setVisibility(0);
            getViewBinding().iraContributionQuestionnaireComposeView.setContent(ComposableLambda3.composableLambdaInstance(-425850540, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ui.max.iracontribution.contributiontype.IraContributionQuestionnaireContributionTypeFragment.onViewCreated.4
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
                        ComposerKt.traceEventStart(-425850540, i, -1, "com.robinhood.android.transfers.ui.max.iracontribution.contributiontype.IraContributionQuestionnaireContributionTypeFragment.onViewCreated.<anonymous> (IraContributionQuestionnaireContributionTypeFragment.kt:142)");
                    }
                    UserInteractionEventDescriptor userInteractionEventDescriptor = new UserInteractionEventDescriptor(null, IraContributionQuestionnaireContributionTypeFragment.this.getEventScreen(), null, null, null, null, 61, null);
                    final IraContributionQuestionnaireContributionTypeFragment iraContributionQuestionnaireContributionTypeFragment = IraContributionQuestionnaireContributionTypeFragment.this;
                    AutoLoggingCompositionLocals.EventLoggable(userInteractionEventDescriptor, ComposableLambda3.rememberComposableLambda(1350106825, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ui.max.iracontribution.contributiontype.IraContributionQuestionnaireContributionTypeFragment.onViewCreated.4.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i2) {
                            if ((i2 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1350106825, i2, -1, "com.robinhood.android.transfers.ui.max.iracontribution.contributiontype.IraContributionQuestionnaireContributionTypeFragment.onViewCreated.<anonymous>.<anonymous> (IraContributionQuestionnaireContributionTypeFragment.kt:147)");
                            }
                            Observable<ThemesFromScarlet> observableThemeChangesForCompose = ScarletComposeInterop.themeChangesForCompose(iraContributionQuestionnaireContributionTypeFragment.getScarletManager());
                            final IraContributionQuestionnaireContributionTypeFragment iraContributionQuestionnaireContributionTypeFragment2 = iraContributionQuestionnaireContributionTypeFragment;
                            BentoTheme2.BentoTheme(observableThemeChangesForCompose, null, ComposableLambda3.rememberComposableLambda(764911995, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ui.max.iracontribution.contributiontype.IraContributionQuestionnaireContributionTypeFragment.onViewCreated.4.1.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i3) {
                                    if ((i3 & 3) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(764911995, i3, -1, "com.robinhood.android.transfers.ui.max.iracontribution.contributiontype.IraContributionQuestionnaireContributionTypeFragment.onViewCreated.<anonymous>.<anonymous>.<anonymous> (IraContributionQuestionnaireContributionTypeFragment.kt:148)");
                                    }
                                    ImmutableList immutableList = extensions2.toImmutableList(((ApiIraContributionQuestionnaire.ContributionTypeViewModel) IraContributionQuestionnaireContributionTypeFragment.INSTANCE.getArgs((Fragment) iraContributionQuestionnaireContributionTypeFragment2)).getPre_rows_content());
                                    SduiActionHandler sduiActionHandler = iraContributionQuestionnaireContributionTypeFragment2.actionHandler;
                                    composer3.startReplaceGroup(-1772220517);
                                    SduiColumns.SduiColumn(immutableList, GenericAction.class, Modifier.INSTANCE, null, sduiActionHandler, HorizontalPadding.Default, Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), false, composer3, 100663296, 0);
                                    composer3.endReplaceGroup();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer2, 54), composer2, 384, 2);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer, 54), composer, 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
        }
        iraContributionQuestionnaireRecyclerview.setAdapter(this.contributionTypeAdapter);
        LifecycleHost.DefaultImpls.bind$default(this, RxRecyclerView.scrollEvents(iraContributionQuestionnaireRecyclerview), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.ui.max.iracontribution.contributiontype.IraContributionQuestionnaireContributionTypeFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IraContributionQuestionnaireContributionTypeFragment.onViewCreated$lambda$6$lambda$5(this.f$0, (RecyclerViewScrollEvent) obj);
            }
        });
        BaseFragment.collectDuxoState$default(this, null, new C308786(null), 1, null);
        BaseFragment.collectDuxoState$default(this, null, new C308797(null), 1, null);
    }

    /* compiled from: IraContributionQuestionnaireContributionTypeFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.ui.max.iracontribution.contributiontype.IraContributionQuestionnaireContributionTypeFragment$onViewCreated$1 */
    /* synthetic */ class C308751 extends FunctionReferenceImpl implements Function0<Integer> {
        C308751(Object obj) {
            super(0, obj, GenericListAdapter.class, "getItemCount", "getItemCount()I", 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return Integer.valueOf(((GenericListAdapter) this.receiver).getSize());
        }
    }

    /* compiled from: IraContributionQuestionnaireContributionTypeFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.ui.max.iracontribution.contributiontype.IraContributionQuestionnaireContributionTypeFragment$onViewCreated$2 */
    /* synthetic */ class C308762 extends FunctionReferenceImpl implements Function1<Integer, IraContributionQuestionnaireContributionTypeViewState.RowState> {
        C308762(Object obj) {
            super(1, obj, GenericListAdapter.class, "getItem", "getItem(I)Ljava/lang/Object;", 0);
        }

        public final IraContributionQuestionnaireContributionTypeViewState.RowState invoke(int i) {
            return (IraContributionQuestionnaireContributionTypeViewState.RowState) ((GenericListAdapter) this.receiver).getItem(i);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ IraContributionQuestionnaireContributionTypeViewState.RowState invoke(Integer num) {
            return invoke(num.intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IraContributionType onViewCreated$lambda$4(IraContributionQuestionnaireContributionTypeViewState.RowState VisibleAutoLoggableViewManager) {
        Intrinsics.checkNotNullParameter(VisibleAutoLoggableViewManager, "$this$VisibleAutoLoggableViewManager");
        return VisibleAutoLoggableViewManager.getRow().getContribution_type();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$6$lambda$5(IraContributionQuestionnaireContributionTypeFragment iraContributionQuestionnaireContributionTypeFragment, RecyclerViewScrollEvent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        VisibleAutoLoggableViewManager<IraContributionType, IraContributionQuestionnaireContributionTypeViewState.RowState> visibleAutoLoggableViewManager = iraContributionQuestionnaireContributionTypeFragment.contributionTypeVisibleItemsManager;
        if (visibleAutoLoggableViewManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contributionTypeVisibleItemsManager");
            visibleAutoLoggableViewManager = null;
        }
        visibleAutoLoggableViewManager.update();
        return Unit.INSTANCE;
    }

    /* compiled from: IraContributionQuestionnaireContributionTypeFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.iracontribution.contributiontype.IraContributionQuestionnaireContributionTypeFragment$onViewCreated$6", m3645f = "IraContributionQuestionnaireContributionTypeFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.max.iracontribution.contributiontype.IraContributionQuestionnaireContributionTypeFragment$onViewCreated$6 */
    static final class C308786 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C308786(Continuation<? super C308786> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return IraContributionQuestionnaireContributionTypeFragment.this.new C308786(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C308786) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: IraContributionQuestionnaireContributionTypeFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.transfers.ui.max.iracontribution.contributiontype.IraContributionQuestionnaireContributionTypeFragment$onViewCreated$6$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ IraContributionQuestionnaireContributionTypeFragment $tmp0;

            AnonymousClass1(IraContributionQuestionnaireContributionTypeFragment iraContributionQuestionnaireContributionTypeFragment) {
                this.$tmp0 = iraContributionQuestionnaireContributionTypeFragment;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, IraContributionQuestionnaireContributionTypeFragment.class, "setViewState", "setViewState(Lcom/robinhood/android/transfers/ui/max/iracontribution/contributiontype/IraContributionQuestionnaireContributionTypeViewState;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(IraContributionQuestionnaireContributionTypeViewState iraContributionQuestionnaireContributionTypeViewState, Continuation<? super Unit> continuation) throws Throwable {
                Object objInvokeSuspend$setViewState = C308786.invokeSuspend$setViewState(this.$tmp0, iraContributionQuestionnaireContributionTypeViewState, continuation);
                return objInvokeSuspend$setViewState == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$setViewState : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((IraContributionQuestionnaireContributionTypeViewState) obj, (Continuation<? super Unit>) continuation);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<IraContributionQuestionnaireContributionTypeViewState> stateFlow = IraContributionQuestionnaireContributionTypeFragment.this.getDuxo().getStateFlow();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(IraContributionQuestionnaireContributionTypeFragment.this);
                this.label = 1;
                if (stateFlow.collect(anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new ExceptionsH();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$setViewState(IraContributionQuestionnaireContributionTypeFragment iraContributionQuestionnaireContributionTypeFragment, IraContributionQuestionnaireContributionTypeViewState iraContributionQuestionnaireContributionTypeViewState, Continuation continuation) throws Throwable {
            iraContributionQuestionnaireContributionTypeFragment.setViewState(iraContributionQuestionnaireContributionTypeViewState);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: IraContributionQuestionnaireContributionTypeFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.iracontribution.contributiontype.IraContributionQuestionnaireContributionTypeFragment$onViewCreated$7", m3645f = "IraContributionQuestionnaireContributionTypeFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.transfers.ui.max.iracontribution.contributiontype.IraContributionQuestionnaireContributionTypeFragment$onViewCreated$7 */
    static final class C308797 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C308797(Continuation<? super C308797> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return IraContributionQuestionnaireContributionTypeFragment.this.new C308797(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C308797) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<IraContributionQuestionnaireContributionTypeViewState> stateFlow = IraContributionQuestionnaireContributionTypeFragment.this.getDuxo().getStateFlow();
                Flow<List<? extends IraContributionQuestionnaireContributionTypeViewState.RowState>> flow = new Flow<List<? extends IraContributionQuestionnaireContributionTypeViewState.RowState>>() { // from class: com.robinhood.android.transfers.ui.max.iracontribution.contributiontype.IraContributionQuestionnaireContributionTypeFragment$onViewCreated$7$invokeSuspend$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super List<? extends IraContributionQuestionnaireContributionTypeViewState.RowState>> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.transfers.ui.max.iracontribution.contributiontype.IraContributionQuestionnaireContributionTypeFragment$onViewCreated$7$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.iracontribution.contributiontype.IraContributionQuestionnaireContributionTypeFragment$onViewCreated$7$invokeSuspend$$inlined$map$1$2", m3645f = "IraContributionQuestionnaireContributionTypeFragment.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.transfers.ui.max.iracontribution.contributiontype.IraContributionQuestionnaireContributionTypeFragment$onViewCreated$7$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                List<IraContributionQuestionnaireContributionTypeViewState.RowState> rowStates = ((IraContributionQuestionnaireContributionTypeViewState) obj).getRowStates();
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(rowStates, anonymousClass1) == coroutine_suspended) {
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
                };
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(IraContributionQuestionnaireContributionTypeFragment.this.contributionTypeAdapter);
                this.label = 1;
                if (flow.collect(anonymousClass2, this) == coroutine_suspended) {
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

        /* compiled from: IraContributionQuestionnaireContributionTypeFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.transfers.ui.max.iracontribution.contributiontype.IraContributionQuestionnaireContributionTypeFragment$onViewCreated$7$2, reason: invalid class name */
        /* synthetic */ class AnonymousClass2 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ GenericListAdapter<RdsRowView, IraContributionQuestionnaireContributionTypeViewState.RowState> $tmp0;

            AnonymousClass2(GenericListAdapter<RdsRowView, IraContributionQuestionnaireContributionTypeViewState.RowState> genericListAdapter) {
                this.$tmp0 = genericListAdapter;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, GenericListAdapter.class, "submitList", "submitList(Ljava/util/List;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((List<IraContributionQuestionnaireContributionTypeViewState.RowState>) obj, (Continuation<? super Unit>) continuation);
            }

            public final Object emit(List<IraContributionQuestionnaireContributionTypeViewState.RowState> list, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$submitList = C308797.invokeSuspend$submitList(this.$tmp0, list, continuation);
                return objInvokeSuspend$submitList == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$submitList : Unit.INSTANCE;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$submitList(GenericListAdapter genericListAdapter, List list, Continuation continuation) {
            genericListAdapter.submitList(list);
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        VisibleAutoLoggableViewManager<IraContributionType, IraContributionQuestionnaireContributionTypeViewState.RowState> visibleAutoLoggableViewManager = this.contributionTypeVisibleItemsManager;
        if (visibleAutoLoggableViewManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contributionTypeVisibleItemsManager");
            visibleAutoLoggableViewManager = null;
        }
        visibleAutoLoggableViewManager.update();
    }

    @Override // com.robinhood.android.common.p088ui.BaseRhBottomSheetDialogHostFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhBottomSheetDialogFragment.OnClickListener
    public boolean onPrimaryButtonClicked(int dialogId, Bundle passthroughArgs) {
        String buttonLoggingIdentifier;
        if (!super.onPrimaryButtonClicked(dialogId, passthroughArgs)) {
            return false;
        }
        IraContributionType selectedContributionType = getSelectedContributionType();
        if (selectedContributionType == null || (buttonLoggingIdentifier = getButtonLoggingIdentifier()) == null) {
            return true;
        }
        EventLogger.DefaultImpls.logTap$default(getEventLogger(), null, getEventScreen(), new Component(Component.ComponentType.BUTTON, buttonLoggingIdentifier, null, 4, null), null, null, false, 57, null);
        getCallbacks().onContributionTypeSelected(selectedContributionType);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setViewState(IraContributionQuestionnaireContributionTypeViewState viewState) throws Throwable {
        Tuples2<IraContributionType, GenericAlertContent<GenericAction>> tuples2Consume;
        List<Button<ActionT>> action_buttons;
        Button button;
        Throwable thConsume;
        RhToolbar rhToolbar = getRhToolbar();
        if (rhToolbar != null) {
            rhToolbar.setLoadingViewVisible(viewState.isLoading());
        }
        UiEvent<Throwable> error = viewState.getError();
        String logging_identifier = null;
        if (error != null && (thConsume = error.consume()) != null && !AbsErrorHandler.handleError$default(getActivityErrorHandler(), thConsume, false, 2, null)) {
            throw thConsume;
        }
        UiEvent<Tuples2<IraContributionType, GenericAlertContent<GenericAction>>> success = viewState.getSuccess();
        if (success == null || (tuples2Consume = success.consume()) == null) {
            return;
        }
        IraContributionType iraContributionTypeComponent1 = tuples2Consume.component1();
        GenericAlertContent<GenericAction> genericAlertContentComponent2 = tuples2Consume.component2();
        setSelectedContributionType(iraContributionTypeComponent1);
        if (genericAlertContentComponent2 != null && (action_buttons = genericAlertContentComponent2.getAction_buttons()) != 0 && (button = (Button) CollectionsKt.firstOrNull((List) action_buttons)) != null) {
            logging_identifier = button.getLogging_identifier();
        }
        setButtonLoggingIdentifier(logging_identifier);
        if (genericAlertContentComponent2 == null) {
            getCallbacks().onContributionTypeSelected(iraContributionTypeComponent1);
        } else {
            setSheetListener(showSduiAlertSheet(genericAlertContentComponent2));
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        VisibleAutoLoggableViewManager<IraContributionType, IraContributionQuestionnaireContributionTypeViewState.RowState> visibleAutoLoggableViewManager = this.contributionTypeVisibleItemsManager;
        if (visibleAutoLoggableViewManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contributionTypeVisibleItemsManager");
            visibleAutoLoggableViewManager = null;
        }
        visibleAutoLoggableViewManager.clear();
    }

    private final RhBottomSheetDialogFragmentHost.SheetListener showSduiAlertSheet(GenericAlertContent<? extends GenericAction> alert) {
        SduiAlert sduiAlert = SduiAlert.INSTANCE;
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        return sduiAlert.sheetListener(childFragmentManager, getMarkwon(), alert, this.actionHandler, (Function0<Unit>) new Function0() { // from class: com.robinhood.android.transfers.ui.max.iracontribution.contributiontype.IraContributionQuestionnaireContributionTypeFragment$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        }, (Function1<? super String, Unit>) ((2016 & 32) != 0 ? 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0024: RETURN 
              (wrap:com.robinhood.android.common.ui.RhBottomSheetDialogFragmentHost$SheetListener:0x0020: INVOKE 
              (r0v0 'sduiAlert' com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert)
              (r1v0 'childFragmentManager' androidx.fragment.app.FragmentManager)
              (wrap:io.noties.markwon.Markwon:0x000b: INVOKE 
              (r14v0 'this' com.robinhood.android.transfers.ui.max.iracontribution.contributiontype.IraContributionQuestionnaireContributionTypeFragment A[IMMUTABLE_TYPE, THIS])
             VIRTUAL call: com.robinhood.android.transfers.ui.max.iracontribution.contributiontype.IraContributionQuestionnaireContributionTypeFragment.getMarkwon():io.noties.markwon.Markwon A[MD:():io.noties.markwon.Markwon (m), WRAPPED] (LINE:248))
              (r15v0 'alert' com.robinhood.models.serverdriven.experimental.api.GenericAlertContent<? extends com.robinhood.models.serverdriven.experimental.api.GenericAction>)
              (wrap:com.robinhood.android.libdesignsystem.serverui.experimental.compose.ActionHandler<com.robinhood.models.serverdriven.experimental.api.GenericAction>:0x000f: IGET 
              (r14v0 'this' com.robinhood.android.transfers.ui.max.iracontribution.contributiontype.IraContributionQuestionnaireContributionTypeFragment A[IMMUTABLE_TYPE, THIS])
             A[WRAPPED] (LINE:250) com.robinhood.android.transfers.ui.max.iracontribution.contributiontype.IraContributionQuestionnaireContributionTypeFragment.actionHandler com.robinhood.android.libdesignsystem.serverui.experimental.compose.ActionHandler)
              (wrap:kotlin.jvm.functions.Function0<kotlin.Unit>:?: CAST (kotlin.jvm.functions.Function0<kotlin.Unit>) (wrap:kotlin.jvm.functions.Function0:0x0013: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: com.robinhood.android.transfers.ui.max.iracontribution.contributiontype.IraContributionQuestionnaireContributionTypeFragment$$ExternalSyntheticLambda4.<init>():void type: CONSTRUCTOR))
              (wrap:kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>:?: CAST (kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>) (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0002: ARITH (2016 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x000b: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:354) call: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert$$ExternalSyntheticLambda12.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function1)))
              (wrap:kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>:?: CAST (kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>) (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x000f: ARITH (2016 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0018: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:355) call: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert$$ExternalSyntheticLambda13.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function1)))
              (wrap:boolean:?: TERNARY null = ((wrap:int:0x001c: ARITH (2016 int) & (128 int) A[WRAPPED]) != (0 int)) ? false : false)
              (wrap:boolean:?: TERNARY null = ((wrap:int:0x0025: ARITH (2016 int) & (256 int) A[WRAPPED]) != (0 int)) ? false : false)
              (wrap:boolean:?: TERNARY null = ((wrap:int:0x002d: ARITH (2016 int) & (512 int) A[WRAPPED]) != (0 int)) ? true : false)
              (wrap:com.robinhood.android.common.ui.RhButtonType:?: TERNARY null = ((wrap:int:0x0036: ARITH (2016 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null com.robinhood.android.common.ui.RhButtonType) : (null com.robinhood.android.common.ui.RhButtonType))
             VIRTUAL call: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert.sheetListener(androidx.fragment.app.FragmentManager, io.noties.markwon.Markwon, com.robinhood.models.serverdriven.experimental.api.GenericAlertContent, com.robinhood.android.libdesignsystem.serverui.experimental.compose.ActionHandler, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, boolean, boolean, boolean, com.robinhood.android.common.ui.RhButtonType):com.robinhood.android.common.ui.RhBottomSheetDialogFragmentHost$SheetListener A[MD:<ActionT extends android.os.Parcelable>:(androidx.fragment.app.FragmentManager, io.noties.markwon.Markwon, com.robinhood.models.serverdriven.experimental.api.GenericAlertContent<? extends ActionT extends android.os.Parcelable>, com.robinhood.android.libdesignsystem.serverui.experimental.compose.ActionHandler<? super ActionT extends android.os.Parcelable>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>, boolean, boolean, boolean, com.robinhood.android.common.ui.RhButtonType):com.robinhood.android.common.ui.RhBottomSheetDialogFragmentHost$SheetListener (m), WRAPPED] (LINE:348))
             (LINE:348) in method: com.robinhood.android.transfers.ui.max.iracontribution.contributiontype.IraContributionQuestionnaireContributionTypeFragment.showSduiAlertSheet(com.robinhood.models.serverdriven.experimental.api.GenericAlertContent<? extends com.robinhood.models.serverdriven.experimental.api.GenericAction>):com.robinhood.android.common.ui.RhBottomSheetDialogFragmentHost$SheetListener, file: classes9.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert$$ExternalSyntheticLambda12, state: NOT_LOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
            	at jadx.core.codegen.InsnGen.makeTernary(InsnGen.java:1187)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:536)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:345)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
            	... 15 more
            */
        /*
            this = this;
            com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert r0 = com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert.INSTANCE
            androidx.fragment.app.FragmentManager r1 = r14.getChildFragmentManager()
            java.lang.String r2 = "getChildFragmentManager(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            io.noties.markwon.Markwon r2 = r14.getMarkwon()
            com.robinhood.android.libdesignsystem.serverui.experimental.compose.ActionHandler<com.robinhood.models.serverdriven.experimental.api.GenericAction> r4 = r14.actionHandler
            com.robinhood.android.transfers.ui.max.iracontribution.contributiontype.IraContributionQuestionnaireContributionTypeFragment$$ExternalSyntheticLambda4 r5 = new com.robinhood.android.transfers.ui.max.iracontribution.contributiontype.IraContributionQuestionnaireContributionTypeFragment$$ExternalSyntheticLambda4
            r5.<init>()
            r12 = 2016(0x7e0, float:2.825E-42)
            r13 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r3 = r15
            com.robinhood.android.common.ui.RhBottomSheetDialogFragmentHost$SheetListener r15 = com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert.sheetListener$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.transfers.p271ui.max.iracontribution.contributiontype.IraContributionQuestionnaireContributionTypeFragment.showSduiAlertSheet(com.robinhood.models.serverdriven.experimental.api.GenericAlertContent):com.robinhood.android.common.ui.RhBottomSheetDialogFragmentHost$SheetListener");
    }

    /* compiled from: IraContributionQuestionnaireContributionTypeFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/iracontribution/contributiontype/IraContributionQuestionnaireContributionTypeFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/transfers/ui/max/iracontribution/contributiontype/IraContributionQuestionnaireContributionTypeFragment;", "Lcom/robinhood/models/api/bonfire/ApiIraContributionQuestionnaire$ContributionTypeViewModel;", "<init>", "()V", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<IraContributionQuestionnaireContributionTypeFragment, ApiIraContributionQuestionnaire.ContributionTypeViewModel> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public ApiIraContributionQuestionnaire.ContributionTypeViewModel getArgs(IraContributionQuestionnaireContributionTypeFragment iraContributionQuestionnaireContributionTypeFragment) {
            return (ApiIraContributionQuestionnaire.ContributionTypeViewModel) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, iraContributionQuestionnaireContributionTypeFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public IraContributionQuestionnaireContributionTypeFragment newInstance(ApiIraContributionQuestionnaire.ContributionTypeViewModel contributionTypeViewModel) {
            return (IraContributionQuestionnaireContributionTypeFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, contributionTypeViewModel);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(IraContributionQuestionnaireContributionTypeFragment iraContributionQuestionnaireContributionTypeFragment, ApiIraContributionQuestionnaire.ContributionTypeViewModel contributionTypeViewModel) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, iraContributionQuestionnaireContributionTypeFragment, contributionTypeViewModel);
        }
    }
}
