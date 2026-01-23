package com.robinhood.android.rhymigration.p245ui.agreements;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.core.text.PrecomputedTextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.jakewharton.rxbinding3.view.RxView;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.designsystem.progress.RdsSegmentedProgressBar;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.rhymigration.C27577R;
import com.robinhood.android.rhymigration.databinding.FragmentRhyAgreementBinding;
import com.robinhood.android.rhymigration.model.UiFancyAgreementBrief;
import com.robinhood.android.rhymigration.p245ui.PageDataCallbacks;
import com.robinhood.android.rhymigration.p245ui.RhyOnboardingLoggingUtils;
import com.robinhood.android.rhymigration.p245ui.agreements.RhyAgreementFragment;
import com.robinhood.android.rhymigration.p245ui.agreements.RhyAgreementState;
import com.robinhood.contentful.model.AssetResource;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.rosetta.eventlogging.AgreementContext;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.common.agreementview.RdsAgreementView;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.ContextsUiExtensions;
import com.robinhood.utils.extensions.Files;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.SinglesAndroid;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import io.reactivex.Single;
import io.reactivex.functions.Action;
import java.io.File;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: RhyAgreementFragment.kt */
@Metadata(m3635d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 K2\u00020\u00012\u00020\u00022\u00020\u0003:\u0003IJKB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u0010\u0010+\u001a\u00020&2\u0006\u0010,\u001a\u00020-H\u0016J\b\u0010.\u001a\u00020&H\u0016J\u0018\u0010/\u001a\u00020&2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u000203H\u0014J\u0010\u00104\u001a\u0002052\u0006\u00106\u001a\u000207H\u0016J\u0010\u00108\u001a\u00020&2\u0006\u00109\u001a\u00020:H\u0002J\u0010\u0010;\u001a\u00020&2\u0006\u0010<\u001a\u000205H\u0002J\b\u0010=\u001a\u00020&H\u0002J\u001c\u0010>\u001a\u00020&2\n\u0010?\u001a\u0006\u0012\u0002\b\u00030@2\u0006\u0010A\u001a\u00020BH\u0002J\t\u0010C\u001a\u000205H\u0096\u0001R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0018\u0010D\u001a\b\u0012\u0004\u0012\u00020F0EX\u0096\u0005¢\u0006\u0006\u001a\u0004\bG\u0010H¨\u0006L"}, m3636d2 = {"Lcom/robinhood/android/rhymigration/ui/agreements/RhyAgreementFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/rhymigration/ui/agreements/RhyAgreementFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/rhymigration/ui/agreements/RhyAgreementFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "binding", "Lcom/robinhood/android/rhymigration/databinding/FragmentRhyAgreementBinding;", "getBinding", "()Lcom/robinhood/android/rhymigration/databinding/FragmentRhyAgreementBinding;", "binding$delegate", "duxo", "Lcom/robinhood/android/rhymigration/ui/agreements/RhyAgreementDuxo;", "getDuxo", "()Lcom/robinhood/android/rhymigration/ui/agreements/RhyAgreementDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "screenName", "", "getScreenName", "()Ljava/lang/String;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onStart", "createOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onOptionsItemSelected", "", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Landroid/view/MenuItem;", "handleStates", "state", "Lcom/robinhood/android/rhymigration/ui/agreements/RhyAgreementState;", "onLoading", "isLoading", "downloadAgreement", "openExportFile", "assetFile", "Lcom/robinhood/contentful/model/AssetResource$File;", "destinationFile", "Ljava/io/File;", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Args", "Companion", "feature-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class RhyAgreementFragment extends BaseFragment implements RegionGated, AutoLoggableFragment {
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public EventLogger eventLogger;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RhyAgreementFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/rhymigration/ui/agreements/RhyAgreementFragment$Callbacks;", 0)), Reflection.property1(new PropertyReference1Impl(RhyAgreementFragment.class, "binding", "getBinding()Lcom/robinhood/android/rhymigration/databinding/FragmentRhyAgreementBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: RhyAgreementFragment.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\u0003H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\bH&¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/rhymigration/ui/agreements/RhyAgreementFragment$Callbacks;", "Lcom/robinhood/android/rhymigration/ui/PageDataCallbacks;", "onFirstAgreementAccepted", "", "isLastAgreement", "", "onAgreementError", "throwable", "", "onApplicationSubmitted", "onApplicationSubmissionError", "error", "feature-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks extends PageDataCallbacks {
        void onAgreementError(Throwable throwable);

        void onApplicationSubmissionError(Throwable error);

        void onApplicationSubmitted();

        void onFirstAgreementAccepted(boolean isLastAgreement);
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

    public RhyAgreementFragment() {
        super(C27577R.layout.fragment_rhy_agreement);
        this.$$delegate_0 = new RegionGated2(SpendingRegionGate.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.rhymigration.ui.agreements.RhyAgreementFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (android.content.Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof RhyAgreementFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
        this.binding = ViewBinding5.viewBinding(this, RhyAgreementFragment2.INSTANCE);
        this.duxo = OldDuxos.oldDuxo(this, RhyAgreementDuxo.class);
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    private final FragmentRhyAgreementBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[1]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentRhyAgreementBinding) value;
    }

    private final RhyAgreementDuxo getDuxo() {
        return (RhyAgreementDuxo) this.duxo.getValue();
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
        return new Screen(Screen.Name.RHY_MIGRATION_AGREEMENT, null, ((Args) INSTANCE.getArgs((Fragment) this)).getAgreementBrief().getId(), null, 10, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenName() {
        return getEventScreen().getName().name();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setHasOptionsMenu(true);
        EventLogger.DefaultImpls.logAppear$default(getEventLogger(), null, getEventScreen(), null, null, RhyOnboardingLoggingUtils.getEventContext$default(this, (AgreementContext) null, (String) null, 3, (Object) null), 13, null);
        final RdsAgreementView rhyAgreementView = getBinding().rhyAgreementView;
        Intrinsics.checkNotNullExpressionValue(rhyAgreementView, "rhyAgreementView");
        LifecycleHost.DefaultImpls.bind$default(this, RxView.layoutChanges(requireToolbar()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.rhymigration.ui.agreements.RhyAgreementFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyAgreementFragment.onViewCreated$lambda$0(rhyAgreementView, this, (Unit) obj);
            }
        });
        rhyAgreementView.onAgreementAccepted(new Function1() { // from class: com.robinhood.android.rhymigration.ui.agreements.RhyAgreementFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyAgreementFragment.onViewCreated$lambda$1(this.f$0, (RdsAgreementView) obj);
            }
        });
        getDuxo().loadMarkdown(rhyAgreementView.getTextMetricsParams());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(RdsAgreementView rdsAgreementView, RhyAgreementFragment rhyAgreementFragment, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        RhToolbar rhToolbar = rhyAgreementFragment.getRhToolbar();
        ViewsKt.setMarginTop(rdsAgreementView, rhToolbar != null ? rhToolbar.getBottom() : 0);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(RhyAgreementFragment rhyAgreementFragment, RdsAgreementView onAgreementAccepted) {
        Intrinsics.checkNotNullParameter(onAgreementAccepted, "$this$onAgreementAccepted");
        EventLogger.DefaultImpls.logTap$default(rhyAgreementFragment.getEventLogger(), UserInteractionEventData.Action.RHY_MIGRATION_AGREE, rhyAgreementFragment.getEventScreen(), null, null, RhyOnboardingLoggingUtils.getEventContext$default(rhyAgreementFragment, new AgreementContext(((Args) INSTANCE.getArgs((Fragment) rhyAgreementFragment)).getAgreementBrief().getId(), null, null, 6, null), (String) null, 2, (Object) null), false, 44, null);
        rhyAgreementFragment.getDuxo().reportUserSignedAgreement();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(final RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        Companion companion = INSTANCE;
        toolbar.setTitle(((Args) companion.getArgs((Fragment) this)).getAgreementBrief().getTitle());
        if (((Args) companion.getArgs((Fragment) this)).getIsInCmSunset()) {
            toolbar.getProgressBar().setNumSegments(3);
            LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getBinding().rhyAgreementView.scrollDepthPercentChanges()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.rhymigration.ui.agreements.RhyAgreementFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RhyAgreementFragment.configureToolbar$lambda$2(toolbar, ((Float) obj).floatValue());
                }
            });
            toolbar.getProgressBar().setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit configureToolbar$lambda$2(RhToolbar rhToolbar, float f) {
        RdsSegmentedProgressBar.setProgress$default(rhToolbar.getProgressBar(), 2, f, false, 4, null);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C276031(this));
    }

    /* compiled from: RhyAgreementFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.rhymigration.ui.agreements.RhyAgreementFragment$onStart$1 */
    /* synthetic */ class C276031 extends FunctionReferenceImpl implements Function1<RhyAgreementState, Unit> {
        C276031(Object obj) {
            super(1, obj, RhyAgreementFragment.class, "handleStates", "handleStates(Lcom/robinhood/android/rhymigration/ui/agreements/RhyAgreementState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RhyAgreementState rhyAgreementState) {
            invoke2(rhyAgreementState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(RhyAgreementState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((RhyAgreementFragment) this.receiver).handleStates(p0);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    protected void createOptionsMenu(Menu menu, MenuInflater inflater) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        super.createOptionsMenu(menu, inflater);
        inflater.inflate(C27577R.menu.menu_rhy_agreement, menu);
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() == C27577R.id.action_download_agreement) {
            downloadAgreement();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleStates(RhyAgreementState state) {
        Throwable thConsume;
        onLoading(state instanceof RhyAgreementState.Loading);
        if (Intrinsics.areEqual(state, RhyAgreementState.AgreementAcceptanceReported.INSTANCE)) {
            Companion companion = INSTANCE;
            if (!((Args) companion.getArgs((Fragment) this)).getIsLastAgreement()) {
                getCallbacks().onFirstAgreementAccepted(((Args) companion.getArgs((Fragment) this)).getIsLastAgreement());
                return;
            } else {
                getDuxo().submitApplication();
                return;
            }
        }
        if (state instanceof RhyAgreementState.AgreementLoaded) {
            PrecomputedTextCompat precomputedTextCompatConsume = ((RhyAgreementState.AgreementLoaded) state).getContent().consume();
            if (precomputedTextCompatConsume != null) {
                getBinding().rhyAgreementView.loadFromString(precomputedTextCompatConsume);
                return;
            }
            return;
        }
        if (state instanceof RhyAgreementState.Error) {
            Throwable thConsume2 = ((RhyAgreementState.Error) state).getThrowable().consume();
            if (thConsume2 != null) {
                getCallbacks().onAgreementError(thConsume2);
                return;
            }
            return;
        }
        if (Intrinsics.areEqual(state, RhyAgreementState.Loading.INSTANCE)) {
            return;
        }
        if (!(state instanceof RhyAgreementState.ApplicationSubmitted)) {
            throw new NoWhenBranchMatchedException();
        }
        RhyAgreementState.ApplicationSubmitted applicationSubmitted = (RhyAgreementState.ApplicationSubmitted) state;
        onLoading(applicationSubmitted.getIsSubmittingApplication());
        UiEvent<Unit> proceedToOpenAccountPolling = applicationSubmitted.getProceedToOpenAccountPolling();
        if ((proceedToOpenAccountPolling != null ? proceedToOpenAccountPolling.consume() : null) != null) {
            getCallbacks().onApplicationSubmitted();
        }
        UiEvent<Throwable> applicationError = applicationSubmitted.getApplicationError();
        if (applicationError == null || (thConsume = applicationError.consume()) == null) {
            return;
        }
        getCallbacks().onApplicationSubmissionError(thConsume);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onLoading(boolean isLoading) {
        IdlingResourceCounters2.setBusy(IdlingResourceType.RHY_MIGRATION_AGREEMENT_LOADING, isLoading);
        requireToolbar().setLoadingViewVisible(isLoading);
        getBinding().rhyAgreementView.updateAcceptButtonLoading(isLoading);
    }

    private final void downloadAgreement() {
        onLoading(true);
        RhyAgreementDuxo duxo = getDuxo();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Single singleDoFinally = SinglesAndroid.observeOnMainThread(duxo.downloadAgreement(contextRequireContext)).doFinally(new Action() { // from class: com.robinhood.android.rhymigration.ui.agreements.RhyAgreementFragment.downloadAgreement.1
            @Override // io.reactivex.functions.Action
            public final void run() {
                RhyAgreementFragment.this.onLoading(false);
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleDoFinally, "doFinally(...)");
        LifecycleHost.DefaultImpls.bind$default(this, singleDoFinally, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.rhymigration.ui.agreements.RhyAgreementFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyAgreementFragment.downloadAgreement$lambda$5(this.f$0, (Tuples2) obj);
            }
        }, getActivityErrorHandler());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit downloadAgreement$lambda$5(RhyAgreementFragment rhyAgreementFragment, Tuples2 tuples2) throws Resources.NotFoundException {
        rhyAgreementFragment.openExportFile((AssetResource.File) tuples2.component1(), (File) tuples2.component2());
        return Unit.INSTANCE;
    }

    private final void openExportFile(AssetResource.File<?> assetFile, File destinationFile) throws Resources.NotFoundException {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        Intent openOrShareIntent = Files.getOpenOrShareIntent(destinationFile, fragmentActivityRequireActivity, C27577R.string.rhy_agreement_asset_export, assetFile.getMediaType().getMediaType());
        if (openOrShareIntent == null) {
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            ContextsUiExtensions.showShortToast(contextRequireContext, C11048R.string.general_error_no_browser_found);
            return;
        }
        startActivity(openOrShareIntent);
    }

    /* compiled from: RhyAgreementFragment.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/rhymigration/ui/agreements/RhyAgreementFragment$Args;", "Landroid/os/Parcelable;", "agreementBrief", "Lcom/robinhood/android/rhymigration/model/UiFancyAgreementBrief;", "isLastAgreement", "", "isInCmSunset", "<init>", "(Lcom/robinhood/android/rhymigration/model/UiFancyAgreementBrief;ZZ)V", "getAgreementBrief", "()Lcom/robinhood/android/rhymigration/model/UiFancyAgreementBrief;", "()Z", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final UiFancyAgreementBrief agreementBrief;
        private final boolean isInCmSunset;
        private final boolean isLastAgreement;

        /* compiled from: RhyAgreementFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(UiFancyAgreementBrief.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.agreementBrief.writeToParcel(dest, flags);
            dest.writeInt(this.isLastAgreement ? 1 : 0);
            dest.writeInt(this.isInCmSunset ? 1 : 0);
        }

        public Args(UiFancyAgreementBrief agreementBrief, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(agreementBrief, "agreementBrief");
            this.agreementBrief = agreementBrief;
            this.isLastAgreement = z;
            this.isInCmSunset = z2;
        }

        public /* synthetic */ Args(UiFancyAgreementBrief uiFancyAgreementBrief, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(uiFancyAgreementBrief, z, (i & 4) != 0 ? false : z2);
        }

        public final UiFancyAgreementBrief getAgreementBrief() {
            return this.agreementBrief;
        }

        /* renamed from: isLastAgreement, reason: from getter */
        public final boolean getIsLastAgreement() {
            return this.isLastAgreement;
        }

        /* renamed from: isInCmSunset, reason: from getter */
        public final boolean getIsInCmSunset() {
            return this.isInCmSunset;
        }
    }

    /* compiled from: RhyAgreementFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/rhymigration/ui/agreements/RhyAgreementFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/rhymigration/ui/agreements/RhyAgreementFragment;", "Lcom/robinhood/android/rhymigration/ui/agreements/RhyAgreementFragment$Args;", "<init>", "()V", "feature-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<RhyAgreementFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(RhyAgreementFragment rhyAgreementFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, rhyAgreementFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public RhyAgreementFragment newInstance(Args args) {
            return (RhyAgreementFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(RhyAgreementFragment rhyAgreementFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, rhyAgreementFragment, args);
        }
    }
}
