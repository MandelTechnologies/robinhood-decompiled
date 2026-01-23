package com.robinhood.android.shareholderexperience.eventinfo;

import android.R;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.R$attr;
import androidx.core.view.MenuProvider;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.util.transition.ToolbarScrollAnimator;
import com.robinhood.android.designsystem.row.RdsSectionHeaderAdapter;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.designsystem.timeline.RdsTimelineRowView;
import com.robinhood.android.expandablecontent.p136ui.ExpandableContentSectionItemView;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.android.shareholderexperience.C28477R;
import com.robinhood.android.shareholderexperience.SduiExtensions;
import com.robinhood.android.shareholderexperience.UtilKt;
import com.robinhood.android.shareholderexperience.databinding.FragmentEventInfoBinding;
import com.robinhood.android.util.extensions.IconExtensions;
import com.robinhood.contentful.markdown.MarkdownContent;
import com.robinhood.models.p355ui.UiExpandableContentSection;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.RichText;
import com.robinhood.models.serverdriven.experimental.api.Timeline;
import com.robinhood.models.serverdriven.experimental.api.TimelineRow;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.util.resource.ResourceValue;
import com.robinhood.shareholderx.models.p401db.QaEventMetadata;
import com.robinhood.utils.p409ui.color.ThemeColors;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.view.recyclerview.CompositeAdapter;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: EventInfoFragment.kt */
@Metadata(m3635d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 B2\u00020\u00012\u00020\u0002:\u0001BB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J\b\u0010)\u001a\u00020$H\u0016J\u0010\u0010*\u001a\u00020$2\u0006\u0010+\u001a\u00020,H\u0016J\u0018\u0010-\u001a\u00020$2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201H\u0016J\u0010\u00102\u001a\u00020\u00062\u0006\u00103\u001a\u000204H\u0016J\u0010\u00105\u001a\u00020$2\u0006\u00106\u001a\u000207H\u0002J\u0012\u00108\u001a\u00020$2\b\u00109\u001a\u0004\u0018\u00010:H\u0002J\u0010\u0010;\u001a\u00020$2\u0006\u0010<\u001a\u00020=H\u0002J\u0018\u0010>\u001a\b\u0012\u0004\u0012\u00020@0?*\b\u0012\u0004\u0012\u00020A0?H\u0002R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082.¢\u0006\u0002\n\u0000¨\u0006C"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/eventinfo/EventInfoFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Landroidx/core/view/MenuProvider;", "<init>", "()V", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "binding", "Lcom/robinhood/android/shareholderexperience/databinding/FragmentEventInfoBinding;", "getBinding", "()Lcom/robinhood/android/shareholderexperience/databinding/FragmentEventInfoBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "toolbarScrollAnimator", "Lcom/robinhood/android/common/util/transition/ToolbarScrollAnimator;", "getToolbarScrollAnimator", "()Lcom/robinhood/android/common/util/transition/ToolbarScrollAnimator;", "toolbarScrollAnimator$delegate", "Lkotlin/Lazy;", "timelineHeader", "Lcom/robinhood/android/designsystem/row/RdsSectionHeaderAdapter;", "timelineAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/designsystem/timeline/RdsTimelineRowView;", "Lcom/robinhood/android/shareholderexperience/eventinfo/TimelineRowItem;", "disclosureAdapter", "Lcom/robinhood/android/designsystem/text/RhTextView;", "Lcom/robinhood/shareholderx/models/db/QaEventMetadata$Disclosure;", "faqHeader", "faqAdapter", "Lcom/robinhood/android/shareholderexperience/eventinfo/EventInfoFaqAdapter;", "compositeAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/CompositeAdapter;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onCreateMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onMenuItemSelected", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Landroid/view/MenuItem;", "setState", "eventMetadata", "Lcom/robinhood/shareholderx/models/db/QaEventMetadata;", "handleCtaAction", "genericAction", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "onRowItemClicked", "previousRowIndex", "", "toUiExpandableContentSections", "", "Lcom/robinhood/models/ui/UiExpandableContentSection;", "Lcom/robinhood/shareholderx/models/db/QaEventMetadata$QuestionItem;", "Companion", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class EventInfoFragment extends BaseFragment implements MenuProvider {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private CompositeAdapter compositeAdapter;
    private final GenericListAdapter<RhTextView, QaEventMetadata.Disclosure> disclosureAdapter;
    private final EventInfoFaqAdapter faqAdapter;
    private final RdsSectionHeaderAdapter faqHeader;
    private final GenericListAdapter<RdsTimelineRowView, TimelineRowItem> timelineAdapter;
    private final RdsSectionHeaderAdapter timelineHeader;

    /* renamed from: toolbarScrollAnimator$delegate, reason: from kotlin metadata */
    private final Lazy toolbarScrollAnimator;
    private final boolean useDesignSystemToolbar;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(EventInfoFragment.class, "binding", "getBinding()Lcom/robinhood/android/shareholderexperience/databinding/FragmentEventInfoBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // androidx.core.view.MenuProvider
    public /* bridge */ /* synthetic */ void onMenuClosed(Menu menu) {
        super.onMenuClosed(menu);
    }

    @Override // androidx.core.view.MenuProvider
    public /* bridge */ /* synthetic */ void onPrepareMenu(Menu menu) {
        super.onPrepareMenu(menu);
    }

    public EventInfoFragment() {
        super(C28477R.layout.fragment_event_info);
        this.useDesignSystemToolbar = true;
        this.binding = ViewBinding5.viewBinding(this, EventInfoFragment2.INSTANCE);
        this.toolbarScrollAnimator = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.shareholderexperience.eventinfo.EventInfoFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EventInfoFragment.toolbarScrollAnimator_delegate$lambda$0(this.f$0);
            }
        });
        this.timelineHeader = new RdsSectionHeaderAdapter(C28477R.string.event_info_timeline_text, false, true, (DiffUtil.ItemCallback) null, 10, (DefaultConstructorMarker) null);
        GenericListAdapter.Companion companion = GenericListAdapter.INSTANCE;
        RdsTimelineRowView.Companion companion2 = RdsTimelineRowView.INSTANCE;
        DiffCallbacks.Equality equality = DiffCallbacks.Equality.INSTANCE;
        this.timelineAdapter = companion.m2987of(companion2, equality, new Function2() { // from class: com.robinhood.android.shareholderexperience.eventinfo.EventInfoFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return EventInfoFragment.timelineAdapter$lambda$2(this.f$0, (RdsTimelineRowView) obj, (TimelineRowItem) obj2);
            }
        });
        int i = C28477R.layout.event_info_disclosure_view;
        DiffCallbacks diffCallbacks = DiffCallbacks.INSTANCE;
        this.disclosureAdapter = companion.m2985of(i, equality, new Function2() { // from class: com.robinhood.android.shareholderexperience.eventinfo.EventInfoFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return EventInfoFragment.disclosureAdapter$lambda$3(this.f$0, (RhTextView) obj, (QaEventMetadata.Disclosure) obj2);
            }
        });
        this.faqHeader = new RdsSectionHeaderAdapter(C28477R.string.event_info_faq_header_text, false, true, (DiffUtil.ItemCallback) null, 10, (DefaultConstructorMarker) null);
        this.faqAdapter = new EventInfoFaqAdapter(new EventInfoFragment3(this));
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    private final FragmentEventInfoBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentEventInfoBinding) value;
    }

    private final ToolbarScrollAnimator getToolbarScrollAnimator() {
        return (ToolbarScrollAnimator) this.toolbarScrollAnimator.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ToolbarScrollAnimator toolbarScrollAnimator_delegate$lambda$0(EventInfoFragment eventInfoFragment) {
        return new ToolbarScrollAnimator(eventInfoFragment.requireToolbar(), eventInfoFragment.getResources().getDimension(C11048R.dimen.toolbar_scroll_height), false, false, false, (Float) null, 52, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit timelineAdapter$lambda$2(final EventInfoFragment eventInfoFragment, RdsTimelineRowView of, TimelineRowItem item) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(item, "item");
        final TimelineRow<GenericAction> row = item.getRow();
        of.setPrimaryText(row.getPrimary_information());
        of.setMetadataText(row.getSecondary_information());
        of.setCtaButtonText(row.getDetail_text());
        of.setPosition(item.getPosition());
        RdsTimelineRowView.State viewState = item.getViewState();
        if (viewState == null) {
            viewState = RdsTimelineRowView.State.INCOMPLETE;
        }
        of.setState(viewState);
        of.onCtaButtonClick(new Function0() { // from class: com.robinhood.android.shareholderexperience.eventinfo.EventInfoFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EventInfoFragment.timelineAdapter$lambda$2$lambda$1(this.f$0, row);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit timelineAdapter$lambda$2$lambda$1(EventInfoFragment eventInfoFragment, TimelineRow timelineRow) {
        eventInfoFragment.handleCtaAction((GenericAction) timelineRow.getDetail_action());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit disclosureAdapter$lambda$3(EventInfoFragment eventInfoFragment, RhTextView of, QaEventMetadata.Disclosure disclosure) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(disclosure, "disclosure");
        RichText preview = disclosure.getPreview();
        Context contextRequireContext = eventInfoFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        of.setText(IconExtensions.toSpannableString$default(preview, contextRequireContext, null, false, null, 14, null));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        fragmentActivityRequireActivity.addMenuProvider(this, viewLifecycleOwner, Lifecycle.State.RESUMED);
        FragmentEventInfoBinding binding = getBinding();
        RecyclerView recyclerView = binding.eventInfoCompositeRecyclerview;
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setSupportsChangeAnimations(false);
        recyclerView.setItemAnimator(defaultItemAnimator);
        ToolbarScrollAnimator toolbarScrollAnimator = getToolbarScrollAnimator();
        NestedScrollView root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        toolbarScrollAnimator.subscribe(root, this);
        setState(((LegacyFragmentKey.ShareholderEventInfo) INSTANCE.getArgs((Fragment) this)).getQaEventMetadata());
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        ToolbarScrollAnimator toolbarScrollAnimator = getToolbarScrollAnimator();
        NestedScrollView root = getBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        toolbarScrollAnimator.dispatchScroll(root);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        ResourceValue.Companion companion = ResourceValue.INSTANCE;
        ScarletManager2.overrideAttribute(toolbar, R.attr.backgroundTint, companion.getEMPTY());
        ScarletManager2.overrideAttribute(toolbar.getToolbar(), R$attr.colorControlNormal, companion.getEMPTY());
        ScarletManager2.overrideAttribute(toolbar.getToolbar(), R$attr.titleTextAppearance, companion.getEMPTY());
        UtilKt.bindToolbar(this, ((LegacyFragmentKey.ShareholderEventInfo) INSTANCE.getArgs((Fragment) this)).getQaEventMetadata().getHeader());
    }

    @Override // androidx.core.view.MenuProvider
    public void onCreateMenu(Menu menu, MenuInflater inflater) {
        Boolean foregroundIsDark;
        int i;
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        super.createOptionsMenu(menu, inflater);
        Companion companion = INSTANCE;
        if (((LegacyFragmentKey.ShareholderEventInfo) companion.getArgs((Fragment) this)).getShareEnabled()) {
            inflater.inflate(C28477R.menu.menu_shareholder, menu);
        }
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        QaEventMetadata.Header.Branding branding = ((LegacyFragmentKey.ShareholderEventInfo) companion.getArgs((Fragment) this)).getQaEventMetadata().getHeader().getBranding();
        if (branding == null || (foregroundIsDark = branding.getForegroundIsDark()) == null) {
            return;
        }
        if (foregroundIsDark.booleanValue()) {
            i = C20690R.attr.colorBlack;
        } else {
            i = C20690R.attr.colorWhite;
        }
        overrideMenuItemTint(Integer.valueOf(ThemeColors.getThemeColor(contextRequireContext, i)));
    }

    @Override // androidx.core.view.MenuProvider
    public boolean onMenuItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() != C28477R.id.share_shareholder_experience) {
            return false;
        }
        String shareCopy = ((LegacyFragmentKey.ShareholderEventInfo) INSTANCE.getArgs((Fragment) this)).getQaEventMetadata().getShareCopy();
        if (shareCopy == null) {
            return true;
        }
        UtilKt.share(this, shareCopy);
        return true;
    }

    private final void setState(QaEventMetadata eventMetadata) {
        QaEventMetadata.EventInfo eventInfo = eventMetadata.getEventInfo();
        ArrayList arrayList = new ArrayList();
        Timeline<GenericAction> timeline = eventInfo.getTimeline();
        if (timeline != null) {
            arrayList.add(this.timelineHeader);
            this.timelineAdapter.submitList(SduiExtensions.toViewItems(timeline.getRows()));
            arrayList.add(this.timelineAdapter);
        }
        List<UiExpandableContentSection> uiExpandableContentSections = toUiExpandableContentSections(eventInfo.getFaq());
        if (!uiExpandableContentSections.isEmpty()) {
            arrayList.add(this.faqHeader);
            this.faqAdapter.submitList(uiExpandableContentSections);
            arrayList.add(this.faqAdapter);
        }
        this.disclosureAdapter.submitList(CollectionsKt.listOf(eventMetadata.getDisclosure()));
        arrayList.add(this.disclosureAdapter);
        if (arrayList.size() <= 0) {
            return;
        }
        this.compositeAdapter = new CompositeAdapter(arrayList);
        RecyclerView recyclerView = getBinding().eventInfoCompositeRecyclerview;
        CompositeAdapter compositeAdapter = this.compositeAdapter;
        if (compositeAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("compositeAdapter");
            compositeAdapter = null;
        }
        recyclerView.setAdapter(compositeAdapter);
    }

    private final void handleCtaAction(GenericAction genericAction) {
        if (genericAction instanceof GenericAction.Deeplink) {
            Navigator navigator = getNavigator();
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, Uri.parse(((GenericAction.Deeplink) genericAction).getValue2().getUri()), null, null, false, null, 60, null);
            return;
        }
        if (!(genericAction instanceof GenericAction.Dismiss) && !(genericAction instanceof GenericAction.InfoAlert) && genericAction != null) {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onRowItemClicked(int previousRowIndex) {
        if (previousRowIndex != -1) {
            CompositeAdapter compositeAdapter = this.compositeAdapter;
            if (compositeAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("compositeAdapter");
                compositeAdapter = null;
            }
            View itemView = getBinding().eventInfoCompositeRecyclerview.getChildViewHolder(getBinding().eventInfoCompositeRecyclerview.getChildAt(compositeAdapter.getFirstItemPositionOf(this.faqAdapter) + previousRowIndex)).itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            if (itemView instanceof ExpandableContentSectionItemView) {
                ((ExpandableContentSectionItemView) itemView).toggleContentSection();
            }
        }
    }

    private final List<UiExpandableContentSection> toUiExpandableContentSections(List<QaEventMetadata.QuestionItem> list) {
        List<QaEventMetadata.QuestionItem> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (QaEventMetadata.QuestionItem questionItem : list2) {
            MarkdownContent markdownContent = new MarkdownContent(questionItem.getSubject());
            RichText body = questionItem.getBody();
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            String string2 = IconExtensions.toSpannableString$default(body, contextRequireContext, null, false, null, 14, null).toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            arrayList.add(new UiExpandableContentSection(markdownContent, null, new MarkdownContent(string2), null, null, null, questionItem.getSubject(), 58, null));
        }
        return arrayList;
    }

    /* compiled from: EventInfoFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/eventinfo/EventInfoFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/shareholderexperience/eventinfo/EventInfoFragment;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$ShareholderEventInfo;", "<init>", "()V", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<EventInfoFragment, LegacyFragmentKey.ShareholderEventInfo> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(LegacyFragmentKey.ShareholderEventInfo shareholderEventInfo) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, shareholderEventInfo);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public LegacyFragmentKey.ShareholderEventInfo getArgs(EventInfoFragment eventInfoFragment) {
            return (LegacyFragmentKey.ShareholderEventInfo) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, eventInfoFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public EventInfoFragment newInstance(LegacyFragmentKey.ShareholderEventInfo shareholderEventInfo) {
            return (EventInfoFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, shareholderEventInfo);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(EventInfoFragment eventInfoFragment, LegacyFragmentKey.ShareholderEventInfo shareholderEventInfo) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, eventInfoFragment, shareholderEventInfo);
        }
    }
}
