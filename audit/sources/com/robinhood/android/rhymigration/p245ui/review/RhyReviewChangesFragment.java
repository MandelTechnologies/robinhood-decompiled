package com.robinhood.android.rhymigration.p245ui.review;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.autoeventlogging.ViewsKt;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.button.RdsTextButton;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.rhymigration.C27577R;
import com.robinhood.android.rhymigration.databinding.FragmentRhyReviewChangesBinding;
import com.robinhood.android.rhymigration.model.UiRhyMigrationReviewPage;
import com.robinhood.android.rhymigration.p245ui.PageDataCallbacks;
import com.robinhood.android.rhymigration.p245ui.RhyOnboardingLoggingUtils;
import com.robinhood.android.rhymigration.p245ui.review.RhyReviewChangesFragment;
import com.robinhood.rosetta.eventlogging.AgreementContext;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.staticcontent.model.TitleAndBody;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import io.noties.markwon.Markwon;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: RhyReviewChangesFragment.kt */
@Metadata(m3635d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 72\u00020\u00012\u00020\u00022\u00020\u0003:\u000267B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\t\u0010/\u001a\u000200H\u0096\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001d\u001a\u00020\u001e8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010#\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0$X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010'\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020&0$X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u00101\u001a\b\u0012\u0004\u0012\u00020302X\u0096\u0005¢\u0006\u0006\u001a\u0004\b4\u00105¨\u00068"}, m3636d2 = {"Lcom/robinhood/android/rhymigration/ui/review/RhyReviewChangesFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "screenName", "", "getScreenName", "()Ljava/lang/String;", "page", "Lcom/robinhood/android/rhymigration/model/UiRhyMigrationReviewPage;", "getPage", "()Lcom/robinhood/android/rhymigration/model/UiRhyMigrationReviewPage;", "binding", "Lcom/robinhood/android/rhymigration/databinding/FragmentRhyReviewChangesBinding;", "getBinding", "()Lcom/robinhood/android/rhymigration/databinding/FragmentRhyReviewChangesBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/rhymigration/ui/review/RhyReviewChangesFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/rhymigration/ui/review/RhyReviewChangesFragment$Callbacks;", "callbacks$delegate", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "valuePropsAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/designsystem/row/RdsRowView;", "Lcom/robinhood/staticcontent/model/TitleAndBody;", "faqAdapter", "Lcom/robinhood/android/rhymigration/ui/review/ExpandableTitleAndBodyView;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Companion", "feature-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class RhyReviewChangesFragment extends BaseFragment implements RegionGated, AutoLoggableFragment {
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    private final Screen eventScreen;
    private final GenericListAdapter<ExpandableTitleAndBodyView, TitleAndBody> faqAdapter;
    public Markwon markwon;
    private final GenericListAdapter<RdsRowView, TitleAndBody> valuePropsAdapter;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RhyReviewChangesFragment.class, "binding", "getBinding()Lcom/robinhood/android/rhymigration/databinding/FragmentRhyReviewChangesBinding;", 0)), Reflection.property1(new PropertyReference1Impl(RhyReviewChangesFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/rhymigration/ui/review/RhyReviewChangesFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: RhyReviewChangesFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/rhymigration/ui/review/RhyReviewChangesFragment$Callbacks;", "Lcom/robinhood/android/rhymigration/ui/PageDataCallbacks;", "onReviewChangesContinueClicked", "", "feature-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks extends PageDataCallbacks {
        void onReviewChangesContinueClicked();
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

    public RhyReviewChangesFragment() {
        super(C27577R.layout.fragment_rhy_review_changes);
        this.$$delegate_0 = new RegionGated2(SpendingRegionGate.INSTANCE);
        this.eventScreen = new Screen(Screen.Name.RHY_MIGRATION_AGREEMENT, null, null, null, 14, null);
        this.binding = ViewBinding5.viewBinding(this, RhyReviewChangesFragment2.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.rhymigration.ui.review.RhyReviewChangesFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (android.content.Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof RhyReviewChangesFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
        GenericListAdapter.Companion companion = GenericListAdapter.INSTANCE;
        int i = C27577R.layout.include_review_changes_value_prop_rds_row;
        DiffCallbacks diffCallbacks = DiffCallbacks.INSTANCE;
        DiffCallbacks.Equality equality = DiffCallbacks.Equality.INSTANCE;
        this.valuePropsAdapter = companion.m2985of(i, equality, new Function2() { // from class: com.robinhood.android.rhymigration.ui.review.RhyReviewChangesFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return RhyReviewChangesFragment.valuePropsAdapter$lambda$0(this.f$0, (RdsRowView) obj, (TitleAndBody) obj2);
            }
        });
        this.faqAdapter = companion.m2987of(ExpandableTitleAndBodyView.INSTANCE, equality, new Function2() { // from class: com.robinhood.android.rhymigration.ui.review.RhyReviewChangesFragment$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return RhyReviewChangesFragment.faqAdapter$lambda$1((ExpandableTitleAndBodyView) obj, (TitleAndBody) obj2);
            }
        });
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return this.eventScreen;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenName() {
        return getEventScreen().getName().name();
    }

    private final UiRhyMigrationReviewPage getPage() {
        return getCallbacks().getReviewPage();
    }

    private final FragmentRhyReviewChangesBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentRhyReviewChangesBinding) value;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit valuePropsAdapter$lambda$0(RhyReviewChangesFragment rhyReviewChangesFragment, RdsRowView of, TitleAndBody valueProp) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(valueProp, "valueProp");
        String title = valueProp.getTitle();
        Markwon markwon = rhyReviewChangesFragment.getMarkwon();
        String body = valueProp.getBody();
        if (body == null) {
            body = "";
        }
        RdsRowView.bind$default(of, title, markwon.toMarkdown(body), null, null, null, 28, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit faqAdapter$lambda$1(ExpandableTitleAndBodyView of, TitleAndBody titleAndBody) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(titleAndBody, "titleAndBody");
        of.bind(titleAndBody);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        this.valuePropsAdapter.submitList(getPage().getValueProps());
        RecyclerView rhyReviewChangesValuePropsRecyclerView = getBinding().rhyReviewChangesValuePropsRecyclerView;
        Intrinsics.checkNotNullExpressionValue(rhyReviewChangesValuePropsRecyclerView, "rhyReviewChangesValuePropsRecyclerView");
        bindAdapter(rhyReviewChangesValuePropsRecyclerView, this.valuePropsAdapter);
        this.faqAdapter.submitList(getPage().getDropdowns());
        RecyclerView rhyReviewChangesFaqRecyclerView = getBinding().rhyReviewChangesFaqRecyclerView;
        Intrinsics.checkNotNullExpressionValue(rhyReviewChangesFaqRecyclerView, "rhyReviewChangesFaqRecyclerView");
        bindAdapter(rhyReviewChangesFaqRecyclerView, this.faqAdapter);
        getBinding().rhyReviewChangesTitle.setText(getPage().getTitle());
        getBinding().rhyReviewChangesFaqShowAll.setText(getPage().getShowAllTitle());
        RdsTextButton rhyReviewChangesFaqShowAll = getBinding().rhyReviewChangesFaqShowAll;
        Intrinsics.checkNotNullExpressionValue(rhyReviewChangesFaqShowAll, "rhyReviewChangesFaqShowAll");
        OnClickListeners.onClick(rhyReviewChangesFaqShowAll, new Function0() { // from class: com.robinhood.android.rhymigration.ui.review.RhyReviewChangesFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RhyReviewChangesFragment.onViewCreated$lambda$2(this.f$0);
            }
        });
        RdsButton rdsButton = getBinding().rhyReviewChangesContinueBtn;
        rdsButton.setText(getPage().getCtaTitle());
        Intrinsics.checkNotNull(rdsButton);
        ViewsKt.eventData$default(rdsButton, false, new Function0() { // from class: com.robinhood.android.rhymigration.ui.review.RhyReviewChangesFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RhyReviewChangesFragment.onViewCreated$lambda$5$lambda$3(this.f$0);
            }
        }, 1, null);
        OnClickListeners.onClick(rdsButton, new Function0() { // from class: com.robinhood.android.rhymigration.ui.review.RhyReviewChangesFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RhyReviewChangesFragment.onViewCreated$lambda$5$lambda$4(this.f$0);
            }
        });
        getBinding().rhyReviewChangesFaqTitle.setText(getPage().getFaqTitle());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$2(RhyReviewChangesFragment rhyReviewChangesFragment) {
        Navigator navigator = rhyReviewChangesFragment.getNavigator();
        android.content.Context contextRequireContext = rhyReviewChangesFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, Uri.parse(rhyReviewChangesFragment.getPage().getShowAllLink()), null, null, false, null, 60, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor onViewCreated$lambda$5$lambda$3(RhyReviewChangesFragment rhyReviewChangesFragment) {
        return new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.CONTINUE, RhyOnboardingLoggingUtils.getEventContext$default(rhyReviewChangesFragment, (AgreementContext) null, (String) null, 3, (Object) null), new Component(Component.ComponentType.CONTINUE_BUTTON, null, null, 6, null), null, 35, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$5$lambda$4(RhyReviewChangesFragment rhyReviewChangesFragment) {
        rhyReviewChangesFragment.getCallbacks().onReviewChangesContinueClicked();
        return Unit.INSTANCE;
    }

    /* compiled from: RhyReviewChangesFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/rhymigration/ui/review/RhyReviewChangesFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/robinhood/android/rhymigration/ui/review/RhyReviewChangesFragment;", "feature-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final RhyReviewChangesFragment newInstance() {
            return new RhyReviewChangesFragment();
        }
    }
}
