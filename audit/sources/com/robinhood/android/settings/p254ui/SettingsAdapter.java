package com.robinhood.android.settings.p254ui;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.robinhood.android.designsystem.selectioncontrol.RdsToggleView;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.android.settings.models.p253ui.TypedSettingsItem;
import com.robinhood.android.settings.p254ui.DataRowItemView;
import com.robinhood.android.settings.p254ui.SettingsRowItemView;
import com.robinhood.android.settings.p254ui.TextButtonView;
import com.robinhood.models.serverdriven.p347db.GenericAction;
import com.robinhood.test.idler.TrackedListAdapter;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericViewHolder;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SettingsAdapter.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001:\u0002\u0013\u0014B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u001e\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0011\u001a\u00020\rH\u0016J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\rH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/SettingsAdapter;", "Lcom/robinhood/test/idler/TrackedListAdapter;", "Lcom/robinhood/android/settings/models/ui/TypedSettingsItem;", "Lcom/robinhood/utils/ui/view/recyclerview/GenericViewHolder;", "Landroid/view/View;", "callbacks", "Lcom/robinhood/android/settings/ui/SettingsAdapter$Callbacks;", "<init>", "(Lcom/robinhood/android/settings/ui/SettingsAdapter$Callbacks;)V", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", "", "holder", "position", "getItemViewType", "Callbacks", "ViewType", "feature-lib-settings_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class SettingsAdapter extends TrackedListAdapter<TypedSettingsItem, GenericViewHolder<? extends View>> {
    public static final int $stable = 8;
    private final Callbacks callbacks;

    /* compiled from: SettingsAdapter.kt */
    @Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J \u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0018\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H&J\u0018\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\rH\u0016J&\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u001eH&¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/SettingsAdapter$Callbacks;", "", "onSettingsActionTriggered", "", "action", "Lcom/robinhood/models/serverdriven/db/GenericAction;", "settingsItem", "Lcom/robinhood/android/settings/models/ui/TypedSettingsItem;", "onSettingsActionAppeared", "onToggleClicked", "toggleItem", "Lcom/robinhood/android/settings/models/ui/TypedSettingsItem$ToggleItem;", "newToggleState", "", "toggleView", "Lcom/robinhood/android/designsystem/selectioncontrol/RdsToggleView;", "onValueItemClicked", "valueItem", "Lcom/robinhood/android/settings/models/ui/TypedSettingsItem$ValueItem;", "rowView", "Landroid/view/View;", "onAccordionItemExpandedStateChanged", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Lcom/robinhood/android/settings/models/ui/TypedSettingsItem$AccordionItem;", "expanded", "onSelectOneItemClicked", "Lcom/robinhood/android/settings/models/ui/TypedSettingsItem$SelectOneItem;", "selection", "Lcom/robinhood/android/settings/models/ui/TypedSettingsItem$SelectOneItem$Option;", "stopLoading", "Lkotlin/Function0;", "feature-lib-settings_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {

        /* compiled from: SettingsAdapter.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class DefaultImpls {
            public static void onAccordionItemExpandedStateChanged(Callbacks callbacks, TypedSettingsItem.AccordionItem item, boolean z) {
                Intrinsics.checkNotNullParameter(item, "item");
            }

            public static void onSettingsActionAppeared(Callbacks callbacks, TypedSettingsItem settingsItem) {
                Intrinsics.checkNotNullParameter(settingsItem, "settingsItem");
            }
        }

        void onAccordionItemExpandedStateChanged(TypedSettingsItem.AccordionItem item, boolean expanded);

        void onSelectOneItemClicked(TypedSettingsItem.SelectOneItem item, TypedSettingsItem.SelectOneItem.Option selection, Function0<Unit> stopLoading);

        void onSettingsActionAppeared(TypedSettingsItem settingsItem);

        void onSettingsActionTriggered(GenericAction action, TypedSettingsItem settingsItem);

        void onToggleClicked(TypedSettingsItem.ToggleItem toggleItem, boolean newToggleState, RdsToggleView toggleView);

        void onValueItemClicked(TypedSettingsItem.ValueItem valueItem, View rowView);
    }

    /* compiled from: SettingsAdapter.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TypedSettingsItem.TextButtonItem.Size.values().length];
            try {
                iArr[TypedSettingsItem.TextButtonItem.Size.SMALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TypedSettingsItem.TextButtonItem.Size.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsAdapter(Callbacks callbacks) {
        super(DiffCallbacks.INSTANCE.byEquality(new Function1() { // from class: com.robinhood.android.settings.ui.SettingsAdapter$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingsAdapter._init_$lambda$0((TypedSettingsItem) obj);
            }
        }));
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        this.callbacks = callbacks;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object _init_$lambda$0(TypedSettingsItem byEquality) {
        Intrinsics.checkNotNullParameter(byEquality, "$this$byEquality");
        return byEquality.getId();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public GenericViewHolder<View> onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new GenericViewHolder<>(ViewType.getEntries().get(viewType).getInflater().inflate(parent));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(GenericViewHolder<? extends View> holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        KeyEvent.Callback view = holder.getView();
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.robinhood.android.settings.ui.BaseSettingsView");
        ((BaseSettingsView) view).setCallbacks(this.callbacks);
        KeyEvent.Callback view2 = holder.getView();
        Intrinsics.checkNotNull(view2, "null cannot be cast to non-null type com.robinhood.utils.ui.view.Bindable<com.robinhood.android.settings.models.ui.TypedSettingsItem>");
        TypedSettingsItem item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        ((Bindable) view2).bind(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        ViewType viewType;
        TypedSettingsItem item = getItem(position);
        if (item instanceof TypedSettingsItem.TitleSubtitleItem) {
            viewType = ViewType.TITLE_SUBTITLE_ITEM;
        } else if (item instanceof TypedSettingsItem.MarkdownItem) {
            viewType = ViewType.MARKDOWN_ITEM;
        } else if (item instanceof TypedSettingsItem.ButtonItem) {
            viewType = ViewType.BUTTON_ITEM;
        } else if (item instanceof TypedSettingsItem.TextButtonItem) {
            int i = WhenMappings.$EnumSwitchMapping$0[((TypedSettingsItem.TextButtonItem) item).getStyle().getSize().ordinal()];
            if (i == 1) {
                viewType = ViewType.SMALL_TEXT_BUTTON_ITEM;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                viewType = ViewType.MEDIUM_TEXT_BUTTON_ITEM;
            }
        } else if (item instanceof TypedSettingsItem.SectionHeaderItem) {
            viewType = ViewType.SECTION_HEADER_ITEM;
        } else if (item instanceof TypedSettingsItem.StackedDataRowItem) {
            viewType = ViewType.STACKED_DATA_ROW_ITEM;
        } else if (item instanceof TypedSettingsItem.CondensedDataRowItem) {
            viewType = ViewType.CONDENSED_DATA_ROW_ITEM;
        } else if (item instanceof TypedSettingsItem.StackedSettingsRowItem) {
            viewType = ViewType.STACKED_SETTINGS_ROW_ITEM;
        } else if (item instanceof TypedSettingsItem.CondensedSettingsRowItem) {
            viewType = ViewType.CONDENSED_SETTINGS_ROW_ITEM;
        } else if (item instanceof TypedSettingsItem.ToggleItem) {
            viewType = ViewType.TOGGLE_ITEM;
        } else if (item instanceof TypedSettingsItem.AccordionItem) {
            viewType = ViewType.ACCORDION_ITEM;
        } else if (item instanceof TypedSettingsItem.BannerItem) {
            viewType = ViewType.BANNER_ITEM;
        } else {
            if (!(item instanceof TypedSettingsItem.SelectOneItem)) {
                if (item instanceof TypedSettingsItem.CustomItem) {
                    throw new IllegalStateException("Unsupported custom settings item");
                }
                throw new NoWhenBranchMatchedException();
            }
            viewType = ViewType.SELECT_ONE_ITEM;
        }
        return viewType.ordinal();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SettingsAdapter.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/SettingsAdapter$ViewType;", "", "inflater", "Lcom/robinhood/utils/ui/view/Inflater;", "Landroid/view/View;", "<init>", "(Ljava/lang/String;ILcom/robinhood/utils/ui/view/Inflater;)V", "getInflater", "()Lcom/robinhood/utils/ui/view/Inflater;", "TITLE_SUBTITLE_ITEM", "MARKDOWN_ITEM", "BUTTON_ITEM", "SMALL_TEXT_BUTTON_ITEM", "MEDIUM_TEXT_BUTTON_ITEM", "SECTION_HEADER_ITEM", "STACKED_SETTINGS_ROW_ITEM", "CONDENSED_SETTINGS_ROW_ITEM", "STACKED_DATA_ROW_ITEM", "CONDENSED_DATA_ROW_ITEM", "TOGGLE_ITEM", "ACCORDION_ITEM", "BANNER_ITEM", "SELECT_ONE_ITEM", "feature-lib-settings_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class ViewType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ViewType[] $VALUES;
        private final Inflater<View> inflater;
        public static final ViewType TITLE_SUBTITLE_ITEM = new ViewType("TITLE_SUBTITLE_ITEM", 0, TitleSubtitleView.INSTANCE);
        public static final ViewType MARKDOWN_ITEM = new ViewType("MARKDOWN_ITEM", 1, MarkdownView.INSTANCE);
        public static final ViewType BUTTON_ITEM = new ViewType("BUTTON_ITEM", 2, ButtonView.INSTANCE);
        public static final ViewType SMALL_TEXT_BUTTON_ITEM = new ViewType("SMALL_TEXT_BUTTON_ITEM", 3, TextButtonView.Small.INSTANCE);
        public static final ViewType MEDIUM_TEXT_BUTTON_ITEM = new ViewType("MEDIUM_TEXT_BUTTON_ITEM", 4, TextButtonView.Medium.INSTANCE);
        public static final ViewType SECTION_HEADER_ITEM = new ViewType("SECTION_HEADER_ITEM", 5, SectionHeaderView.INSTANCE);
        public static final ViewType STACKED_SETTINGS_ROW_ITEM = new ViewType("STACKED_SETTINGS_ROW_ITEM", 6, SettingsRowItemView.Stacked.INSTANCE);
        public static final ViewType CONDENSED_SETTINGS_ROW_ITEM = new ViewType("CONDENSED_SETTINGS_ROW_ITEM", 7, SettingsRowItemView.Condensed.INSTANCE);
        public static final ViewType STACKED_DATA_ROW_ITEM = new ViewType("STACKED_DATA_ROW_ITEM", 8, DataRowItemView.Stacked.INSTANCE);
        public static final ViewType CONDENSED_DATA_ROW_ITEM = new ViewType("CONDENSED_DATA_ROW_ITEM", 9, DataRowItemView.Condensed.INSTANCE);
        public static final ViewType TOGGLE_ITEM = new ViewType("TOGGLE_ITEM", 10, ToggleView.INSTANCE);
        public static final ViewType ACCORDION_ITEM = new ViewType("ACCORDION_ITEM", 11, AccordionView.INSTANCE);
        public static final ViewType BANNER_ITEM = new ViewType("BANNER_ITEM", 12, BannerItemView.INSTANCE);
        public static final ViewType SELECT_ONE_ITEM = new ViewType("SELECT_ONE_ITEM", 13, SelectOneItemView.INSTANCE);

        private static final /* synthetic */ ViewType[] $values() {
            return new ViewType[]{TITLE_SUBTITLE_ITEM, MARKDOWN_ITEM, BUTTON_ITEM, SMALL_TEXT_BUTTON_ITEM, MEDIUM_TEXT_BUTTON_ITEM, SECTION_HEADER_ITEM, STACKED_SETTINGS_ROW_ITEM, CONDENSED_SETTINGS_ROW_ITEM, STACKED_DATA_ROW_ITEM, CONDENSED_DATA_ROW_ITEM, TOGGLE_ITEM, ACCORDION_ITEM, BANNER_ITEM, SELECT_ONE_ITEM};
        }

        public static EnumEntries<ViewType> getEntries() {
            return $ENTRIES;
        }

        private ViewType(String str, int i, Inflater inflater) {
            this.inflater = inflater;
        }

        public final Inflater<View> getInflater() {
            return this.inflater;
        }

        static {
            ViewType[] viewTypeArr$values = $values();
            $VALUES = viewTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(viewTypeArr$values);
        }

        public static ViewType valueOf(String str) {
            return (ViewType) Enum.valueOf(ViewType.class, str);
        }

        public static ViewType[] values() {
            return (ViewType[]) $VALUES.clone();
        }
    }
}
