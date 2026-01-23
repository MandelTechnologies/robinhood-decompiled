package com.robinhood.android.directipo.disclosure.p105ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.directipo.disclosure.C14217R;
import com.robinhood.android.directipo.disclosure.databinding.FragmentDirectIpoNotificationDisclosureBinding;
import com.robinhood.android.directipo.disclosure.p105ui.DirectIpoNotificationDisclosureFragment;
import com.robinhood.android.regiongate.IpoAccessRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.serverclientcomponents.actionbutton.ClientComponentButtonView;
import com.robinhood.directipo.models.api.ApiDirectIpoNotificationDisclosure;
import com.robinhood.models.serverdriven.p347db.ServerDrivenButton;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.recyclerview.CompositeAdapter;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import com.robinhood.utils.p409ui.view.recyclerview.SingleItemAdapter;
import io.noties.markwon.Markwon;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: DirectIpoNotificationDisclosureFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 92\u00020\u00012\u00020\u00022\u00020\u0003:\u000289B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\u0010\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201H\u0016J\t\u00102\u001a\u00020/H\u0096\u0001R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 0\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010!\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 0\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020'X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u00103\u001a\b\u0012\u0004\u0012\u00020504X\u0096\u0005¢\u0006\u0006\u001a\u0004\b6\u00107¨\u0006:"}, m3636d2 = {"Lcom/robinhood/android/directipo/disclosure/ui/DirectIpoNotificationDisclosureFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/serverclientcomponents/actionbutton/ClientComponentButtonView$Callbacks;", "<init>", "()V", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "viewBinding", "Lcom/robinhood/android/directipo/disclosure/databinding/FragmentDirectIpoNotificationDisclosureBinding;", "getViewBinding", "()Lcom/robinhood/android/directipo/disclosure/databinding/FragmentDirectIpoNotificationDisclosureBinding;", "viewBinding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/directipo/disclosure/ui/DirectIpoNotificationDisclosureFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/directipo/disclosure/ui/DirectIpoNotificationDisclosureFragment$Callbacks;", "callbacks$delegate", "titleAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/SingleItemAdapter;", "Landroid/widget/TextView;", "", "rowsAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/designsystem/row/RdsRowView;", "Lcom/robinhood/directipo/models/api/ApiDirectIpoNotificationDisclosure$Row;", "disclosureAdapter", "contentAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/CompositeAdapter;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onActionClicked", "", "button", "Lcom/robinhood/models/serverdriven/db/ServerDrivenButton;", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Companion", "feature-direct-ipo-notification-disclosure_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes27.dex */
public final class DirectIpoNotificationDisclosureFragment extends BaseFragment implements RegionGated, ClientComponentButtonView.Callbacks {
    private final /* synthetic */ RegionGated2 $$delegate_0;
    public AnalyticsLogger analytics;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    private final CompositeAdapter contentAdapter;
    private final SingleItemAdapter<TextView, CharSequence> disclosureAdapter;
    public Markwon markwon;
    private final GenericListAdapter<RdsRowView, ApiDirectIpoNotificationDisclosure.Row> rowsAdapter;
    private final SingleItemAdapter<TextView, CharSequence> titleAdapter;

    /* renamed from: viewBinding$delegate, reason: from kotlin metadata */
    private final Interfaces2 viewBinding;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(DirectIpoNotificationDisclosureFragment.class, "viewBinding", "getViewBinding()Lcom/robinhood/android/directipo/disclosure/databinding/FragmentDirectIpoNotificationDisclosureBinding;", 0)), Reflection.property1(new PropertyReference1Impl(DirectIpoNotificationDisclosureFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/directipo/disclosure/ui/DirectIpoNotificationDisclosureFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: DirectIpoNotificationDisclosureFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/directipo/disclosure/ui/DirectIpoNotificationDisclosureFragment$Callbacks;", "", "onCompleteNotificationDisclosure", "", "feature-direct-ipo-notification-disclosure_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onCompleteNotificationDisclosure();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public DirectIpoNotificationDisclosureFragment() {
        super(C14217R.layout.fragment_direct_ipo_notification_disclosure);
        this.$$delegate_0 = new RegionGated2(IpoAccessRegionGate.INSTANCE);
        this.viewBinding = ViewBinding5.viewBinding(this, DirectIpoNotificationDisclosureFragment2.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.directipo.disclosure.ui.DirectIpoNotificationDisclosureFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof DirectIpoNotificationDisclosureFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
        SingleItemAdapter.Companion companion = SingleItemAdapter.INSTANCE;
        SingleItemAdapter<TextView, CharSequence> singleItemAdapterOf$default = SingleItemAdapter.Companion.of$default(companion, C14217R.layout.include_direct_ipo_disclosure_title, (DiffUtil.ItemCallback) null, new Function2() { // from class: com.robinhood.android.directipo.disclosure.ui.DirectIpoNotificationDisclosureFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return DirectIpoNotificationDisclosureFragment.titleAdapter$lambda$0((TextView) obj, (CharSequence) obj2);
            }
        }, 2, (Object) null);
        this.titleAdapter = singleItemAdapterOf$default;
        GenericListAdapter.Companion companion2 = GenericListAdapter.INSTANCE;
        RdsRowView.ValuePropRowInflater valuePropRowInflater = RdsRowView.ValuePropRowInflater.INSTANCE;
        DiffCallbacks diffCallbacks = DiffCallbacks.INSTANCE;
        GenericListAdapter<RdsRowView, ApiDirectIpoNotificationDisclosure.Row> genericListAdapterM2987of = companion2.m2987of(valuePropRowInflater, DiffCallbacks.Equality.INSTANCE, new Function2() { // from class: com.robinhood.android.directipo.disclosure.ui.DirectIpoNotificationDisclosureFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return DirectIpoNotificationDisclosureFragment.rowsAdapter$lambda$1(this.f$0, (RdsRowView) obj, (ApiDirectIpoNotificationDisclosure.Row) obj2);
            }
        });
        this.rowsAdapter = genericListAdapterM2987of;
        SingleItemAdapter<TextView, CharSequence> singleItemAdapterOf$default2 = SingleItemAdapter.Companion.of$default(companion, C14217R.layout.include_direct_ipo_disclosure_fine_print, (DiffUtil.ItemCallback) null, new Function2() { // from class: com.robinhood.android.directipo.disclosure.ui.DirectIpoNotificationDisclosureFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return DirectIpoNotificationDisclosureFragment.disclosureAdapter$lambda$2((TextView) obj, (CharSequence) obj2);
            }
        }, 2, (Object) null);
        this.disclosureAdapter = singleItemAdapterOf$default2;
        this.contentAdapter = new CompositeAdapter((RecyclerView.Adapter<?>[]) new RecyclerView.Adapter[]{singleItemAdapterOf$default, genericListAdapterM2987of, singleItemAdapterOf$default2});
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

    public final AnalyticsLogger getAnalytics() {
        AnalyticsLogger analyticsLogger = this.analytics;
        if (analyticsLogger != null) {
            return analyticsLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analytics");
        return null;
    }

    public final void setAnalytics(AnalyticsLogger analyticsLogger) {
        Intrinsics.checkNotNullParameter(analyticsLogger, "<set-?>");
        this.analytics = analyticsLogger;
    }

    private final FragmentDirectIpoNotificationDisclosureBinding getViewBinding() {
        Object value = this.viewBinding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentDirectIpoNotificationDisclosureBinding) value;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit titleAdapter$lambda$0(TextView of, CharSequence title) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(title, "title");
        of.setText(title);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit rowsAdapter$lambda$1(DirectIpoNotificationDisclosureFragment directIpoNotificationDisclosureFragment, RdsRowView of, ApiDirectIpoNotificationDisclosure.Row row) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(row, "row");
        of.setLeadingIconDrawable(ViewsKt.getDrawable(of, row.getIcon().getResourceId()));
        of.setPrimaryText(row.getTitle());
        of.setSecondaryText(directIpoNotificationDisclosureFragment.getMarkwon().toMarkdown(row.getSubtitle_markdown()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit disclosureAdapter$lambda$2(TextView of, CharSequence disclosure) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(disclosure, "disclosure");
        of.setText(disclosure);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        SingleItemAdapter<TextView, CharSequence> singleItemAdapter = this.titleAdapter;
        Companion companion = INSTANCE;
        singleItemAdapter.setData(((ApiDirectIpoNotificationDisclosure) companion.getArgs((Fragment) this)).getTitle());
        this.rowsAdapter.submitList(((ApiDirectIpoNotificationDisclosure) companion.getArgs((Fragment) this)).getRows());
        this.disclosureAdapter.setData(getMarkwon().toMarkdown(((ApiDirectIpoNotificationDisclosure) companion.getArgs((Fragment) this)).getDisclosure_markdown()));
        getViewBinding().notificationDisclosureRecyclerView.setAdapter(this.contentAdapter);
        getViewBinding().notificationDisclosureContinueButton.bind(ServerDrivenButton.INSTANCE.from(((ApiDirectIpoNotificationDisclosure) companion.getArgs((Fragment) this)).getContinue_button().toDbModel()));
        getViewBinding().notificationDisclosureContinueButton.setCallbacks(this);
    }

    @Override // com.robinhood.android.serverclientcomponents.actionbutton.ClientComponentButtonView.Callbacks
    public boolean onActionClicked(ServerDrivenButton button) {
        Intrinsics.checkNotNullParameter(button, "button");
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(getAnalytics(), AnalyticsStrings.BUTTON_GROUP_TITLE_IPO_ACCESS_NOTIFICATION_DISCLOSURE, button.getLoggingIdentifier(), null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
        getCallbacks().onCompleteNotificationDisclosure();
        return false;
    }

    /* compiled from: DirectIpoNotificationDisclosureFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/directipo/disclosure/ui/DirectIpoNotificationDisclosureFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/directipo/disclosure/ui/DirectIpoNotificationDisclosureFragment;", "Lcom/robinhood/directipo/models/api/ApiDirectIpoNotificationDisclosure;", "<init>", "()V", "feature-direct-ipo-notification-disclosure_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<DirectIpoNotificationDisclosureFragment, ApiDirectIpoNotificationDisclosure> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public ApiDirectIpoNotificationDisclosure getArgs(DirectIpoNotificationDisclosureFragment directIpoNotificationDisclosureFragment) {
            return (ApiDirectIpoNotificationDisclosure) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, directIpoNotificationDisclosureFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public DirectIpoNotificationDisclosureFragment newInstance(ApiDirectIpoNotificationDisclosure apiDirectIpoNotificationDisclosure) {
            return (DirectIpoNotificationDisclosureFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, apiDirectIpoNotificationDisclosure);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(DirectIpoNotificationDisclosureFragment directIpoNotificationDisclosureFragment, ApiDirectIpoNotificationDisclosure apiDirectIpoNotificationDisclosure) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, directIpoNotificationDisclosureFragment, apiDirectIpoNotificationDisclosure);
        }
    }
}
