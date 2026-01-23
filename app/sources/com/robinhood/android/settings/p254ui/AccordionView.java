package com.robinhood.android.settings.p254ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.selectioncontrol.RdsToggleView;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.android.settings.models.p253ui.TypedSettingsItem;
import com.robinhood.android.settings.p254ui.SettingsAdapter;
import com.robinhood.models.serverdriven.p347db.GenericAction;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.p409ui.view.Inflater;
import io.noties.markwon.Markwon;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AccordionView.kt */
@Metadata(m3635d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 :2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u00042\u00020\u0005:\u0001:B\u001b\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0003H\u0016J\u0018\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0016J \u0010$\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0016J\u0018\u0010+\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u0016J\u0018\u00100\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u00101\u001a\u00020(H\u0016J&\u00102\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u0002032\u0006\u00104\u001a\u0002052\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u001d07H\u0016J\b\u00108\u001a\u00020\u001dH\u0014J\b\u00109\u001a\u00020\u001dH\u0002R\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006;"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/AccordionView;", "Lcom/robinhood/android/designsystem/accordion/RdsAccordionRowView;", "Lcom/robinhood/utils/ui/view/Bindable;", "Lcom/robinhood/android/settings/models/ui/TypedSettingsItem$AccordionItem;", "Lcom/robinhood/android/settings/ui/SettingsAdapter$Callbacks;", "Lcom/robinhood/android/settings/ui/BaseSettingsView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "childrenAdapter", "Lcom/robinhood/android/settings/ui/SettingsAdapter;", "summaryTxt", "Landroid/widget/TextView;", "callbacks", "getCallbacks", "()Lcom/robinhood/android/settings/ui/SettingsAdapter$Callbacks;", "setCallbacks", "(Lcom/robinhood/android/settings/ui/SettingsAdapter$Callbacks;)V", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "bind", "", "state", "onSettingsActionTriggered", "action", "Lcom/robinhood/models/serverdriven/db/GenericAction;", "settingsItem", "Lcom/robinhood/android/settings/models/ui/TypedSettingsItem;", "onToggleClicked", "toggleItem", "Lcom/robinhood/android/settings/models/ui/TypedSettingsItem$ToggleItem;", "newToggleState", "", "toggleView", "Lcom/robinhood/android/designsystem/selectioncontrol/RdsToggleView;", "onValueItemClicked", "valueItem", "Lcom/robinhood/android/settings/models/ui/TypedSettingsItem$ValueItem;", "rowView", "Landroid/view/View;", "onAccordionItemExpandedStateChanged", "expanded", "onSelectOneItemClicked", "Lcom/robinhood/android/settings/models/ui/TypedSettingsItem$SelectOneItem;", "selection", "Lcom/robinhood/android/settings/models/ui/TypedSettingsItem$SelectOneItem$Option;", "stopLoading", "Lkotlin/Function0;", "onExpandedStateChanged", "refreshExpandedState", "Companion", "feature-lib-settings_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class AccordionView extends Hammer_AccordionView implements Bindable<TypedSettingsItem.AccordionItem>, SettingsAdapter.Callbacks, BaseSettingsView {
    private SettingsAdapter.Callbacks callbacks;
    private final SettingsAdapter childrenAdapter;
    private TypedSettingsItem.AccordionItem item;
    public Markwon markwon;
    private final TextView summaryTxt;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.settings.ui.SettingsAdapter.Callbacks
    public void onSettingsActionAppeared(TypedSettingsItem typedSettingsItem) {
        SettingsAdapter.Callbacks.DefaultImpls.onSettingsActionAppeared(this, typedSettingsItem);
    }

    public /* synthetic */ AccordionView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccordionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, null);
        Intrinsics.checkNotNullParameter(context, "context");
        inflateAccordionBody(C28356R.layout.merge_settings_accordion_item);
        SettingsAdapter settingsAdapter = new SettingsAdapter(this);
        this.childrenAdapter = settingsAdapter;
        View viewFindViewById = findViewById(C28356R.id.summary_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.summaryTxt = (TextView) viewFindViewById;
        ((RecyclerView) findViewById(C28356R.id.recycler_view)).setAdapter(settingsAdapter);
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

    @Override // com.robinhood.android.settings.p254ui.BaseSettingsView
    public SettingsAdapter.Callbacks getCallbacks() {
        return this.callbacks;
    }

    @Override // com.robinhood.android.settings.p254ui.BaseSettingsView
    public void setCallbacks(SettingsAdapter.Callbacks callbacks) {
        this.callbacks = callbacks;
    }

    @Override // com.robinhood.utils.p409ui.view.Bindable
    public void bind(TypedSettingsItem.AccordionItem state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.item = state;
        setPrimaryText(state.getTitle());
        setSecondaryText(state.getSubtitle());
        this.childrenAdapter.submitList(state.getItems());
        setExpanded(state.isExpanded());
        String summary = state.getSummary();
        if (summary == null) {
            this.summaryTxt.setVisibility(8);
        } else {
            this.summaryTxt.setVisibility(0);
            getMarkwon().mo17580setMarkdown(this.summaryTxt, summary);
        }
    }

    @Override // com.robinhood.android.settings.ui.SettingsAdapter.Callbacks
    public void onSettingsActionTriggered(GenericAction action, TypedSettingsItem settingsItem) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(settingsItem, "settingsItem");
        SettingsAdapter.Callbacks callbacks = getCallbacks();
        if (callbacks == null) {
            throw new IllegalStateException("Required value was null.");
        }
        callbacks.onSettingsActionTriggered(action, settingsItem);
    }

    @Override // com.robinhood.android.settings.ui.SettingsAdapter.Callbacks
    public void onToggleClicked(TypedSettingsItem.ToggleItem toggleItem, boolean newToggleState, RdsToggleView toggleView) {
        Intrinsics.checkNotNullParameter(toggleItem, "toggleItem");
        Intrinsics.checkNotNullParameter(toggleView, "toggleView");
        SettingsAdapter.Callbacks callbacks = getCallbacks();
        if (callbacks == null) {
            throw new IllegalStateException("Required value was null.");
        }
        callbacks.onToggleClicked(toggleItem, newToggleState, toggleView);
    }

    @Override // com.robinhood.android.settings.ui.SettingsAdapter.Callbacks
    public void onValueItemClicked(TypedSettingsItem.ValueItem valueItem, View rowView) {
        Intrinsics.checkNotNullParameter(valueItem, "valueItem");
        Intrinsics.checkNotNullParameter(rowView, "rowView");
        SettingsAdapter.Callbacks callbacks = getCallbacks();
        if (callbacks == null) {
            throw new IllegalStateException("Required value was null.");
        }
        callbacks.onValueItemClicked(valueItem, rowView);
    }

    @Override // com.robinhood.android.settings.ui.SettingsAdapter.Callbacks
    public void onAccordionItemExpandedStateChanged(TypedSettingsItem.AccordionItem item, boolean expanded) {
        Intrinsics.checkNotNullParameter(item, "item");
        SettingsAdapter.Callbacks callbacks = getCallbacks();
        if (callbacks == null) {
            throw new IllegalStateException("Required value was null.");
        }
        callbacks.onAccordionItemExpandedStateChanged(item, expanded);
    }

    @Override // com.robinhood.android.settings.ui.SettingsAdapter.Callbacks
    public void onSelectOneItemClicked(TypedSettingsItem.SelectOneItem item, TypedSettingsItem.SelectOneItem.Option selection, Function0<Unit> stopLoading) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(selection, "selection");
        Intrinsics.checkNotNullParameter(stopLoading, "stopLoading");
        SettingsAdapter.Callbacks callbacks = getCallbacks();
        if (callbacks == null) {
            throw new IllegalStateException("Required value was null.");
        }
        callbacks.onSelectOneItemClicked(item, selection, stopLoading);
    }

    @Override // com.robinhood.android.designsystem.accordion.RdsAccordionRowView
    protected void onExpandedStateChanged() {
        super.onExpandedStateChanged();
        refreshExpandedState();
        TypedSettingsItem.AccordionItem accordionItem = this.item;
        if (accordionItem != null) {
            SettingsAdapter.Callbacks callbacks = getCallbacks();
            if (callbacks == null) {
                throw new IllegalStateException("Required value was null.");
            }
            callbacks.onAccordionItemExpandedStateChanged(accordionItem, getIsExpanded());
        }
    }

    private final void refreshExpandedState() {
        boolean z;
        List<TypedSettingsItem> items;
        TypedSettingsItem.AccordionItem accordionItem = this.item;
        TypedSettingsItem typedSettingsItem = (accordionItem == null || (items = accordionItem.getItems()) == null) ? null : (TypedSettingsItem) CollectionsKt.lastOrNull((List) items);
        if ((typedSettingsItem instanceof TypedSettingsItem.AccordionItem) || (typedSettingsItem instanceof TypedSettingsItem.ButtonItem) || (typedSettingsItem instanceof TypedSettingsItem.CustomItem) || (typedSettingsItem instanceof TypedSettingsItem.BannerItem) || (typedSettingsItem instanceof TypedSettingsItem.MarkdownItem) || (typedSettingsItem instanceof TypedSettingsItem.SectionHeaderItem) || (typedSettingsItem instanceof TypedSettingsItem.TextButtonItem) || (typedSettingsItem instanceof TypedSettingsItem.ToggleItem) || (typedSettingsItem instanceof TypedSettingsItem.ValueItem) || (typedSettingsItem instanceof TypedSettingsItem.SelectOneItem) || typedSettingsItem == null) {
            z = false;
        } else {
            if (!(typedSettingsItem instanceof TypedSettingsItem.TitleSubtitleItem)) {
                throw new NoWhenBranchMatchedException();
            }
            z = true;
        }
        if (getIsExpanded() && z) {
            ViewsKt.setBottomPadding(getBodyLayout(), 0);
            setShowBottomDivider(false);
        } else {
            ViewsKt.setBottomPadding(getBodyLayout(), ViewsKt.getDimensionPixelSize(this, C13997R.dimen.rds_spacing_small));
            setShowBottomDivider(true);
        }
    }

    /* compiled from: AccordionView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/AccordionView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/settings/ui/AccordionView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-lib-settings_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<AccordionView> {
        private final /* synthetic */ Inflater<AccordionView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public AccordionView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (AccordionView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C28356R.layout.include_settings_accordion_view);
        }
    }
}
