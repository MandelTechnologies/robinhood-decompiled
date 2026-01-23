package com.robinhood.android.advancedchart;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import androidx.recyclerview.widget.ListAdapter;
import com.robinhood.android.advanced.chart.IndicatorState;
import com.robinhood.android.advanced.chart.IndicatorState3;
import com.robinhood.android.advancedchart.AdvancedChartIndicatorsAdapter2;
import com.robinhood.android.designsystem.chip.RdsChip;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.color.ThemeColors;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.utils.p409ui.view.OnClickListeners;
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

/* compiled from: AdvancedChartIndicatorsAdapter.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001:\u0005\u0013\u0014\u0015\u0016\u0017B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u001e\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0011\u001a\u00020\rH\u0016J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\rH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/advancedchart/AdvancedChartIndicatorsAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/robinhood/android/advancedchart/ChartIndicatorListItem;", "Lcom/robinhood/utils/ui/view/recyclerview/GenericViewHolder;", "Landroid/view/View;", "callbacks", "Lcom/robinhood/android/advancedchart/AdvancedChartIndicatorsAdapter$Callbacks;", "<init>", "(Lcom/robinhood/android/advancedchart/AdvancedChartIndicatorsAdapter$Callbacks;)V", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", "", "holder", "position", "getItemViewType", "Callbacks", "ViewType", "IndicatorChipInflater", "ControlButtonInflater", "AddIndicatorHeaderInflater", "feature-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class AdvancedChartIndicatorsAdapter extends ListAdapter<AdvancedChartIndicatorsAdapter2, GenericViewHolder<? extends View>> {
    public static final int $stable = 8;
    private final Callbacks callbacks;

    /* compiled from: AdvancedChartIndicatorsAdapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\f\u001a\u00020\u0003H&J\b\u0010\r\u001a\u00020\u0003H&¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/advancedchart/AdvancedChartIndicatorsAdapter$Callbacks;", "", "onIndicatorTapped", "", "indicatorState", "Lcom/robinhood/android/advanced/chart/IndicatorState;", "position", "", "isScrollEnabled", "", "onInfoIconTapped", "onSettingsIconTapped", "onAddPlusButtonTapped", "onEmptyStateAddDataButtonTapped", "feature-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onAddPlusButtonTapped();

        void onEmptyStateAddDataButtonTapped();

        void onIndicatorTapped(IndicatorState indicatorState, int position, boolean isScrollEnabled);

        void onInfoIconTapped(IndicatorState indicatorState);

        void onSettingsIconTapped(IndicatorState indicatorState);
    }

    /* compiled from: AdvancedChartIndicatorsAdapter.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ViewType.values().length];
            try {
                iArr[ViewType.EMPTY_STATE_ADD_DATA_HEADER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ViewType.CONTROL_BUTTON_HEADER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ViewType.INDICATOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedChartIndicatorsAdapter(Callbacks callbacks) {
        super(DiffCallbacks.INSTANCE.byEquality(new Function1() { // from class: com.robinhood.android.advancedchart.AdvancedChartIndicatorsAdapter$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ((AdvancedChartIndicatorsAdapter2) obj).getId();
            }
        }));
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        this.callbacks = callbacks;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public GenericViewHolder<View> onCreateViewHolder(ViewGroup parent, int viewType) {
        View viewInflate;
        Intrinsics.checkNotNullParameter(parent, "parent");
        int i = WhenMappings.$EnumSwitchMapping$0[ViewType.values()[viewType].ordinal()];
        if (i == 1) {
            viewInflate = AddIndicatorHeaderInflater.INSTANCE.inflate(parent);
        } else if (i == 2) {
            viewInflate = ControlButtonInflater.INSTANCE.inflate(parent);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            viewInflate = IndicatorChipInflater.INSTANCE.inflate(parent);
        }
        return new GenericViewHolder<>(viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(GenericViewHolder<? extends View> holder, final int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        final AdvancedChartIndicatorsAdapter2 item = getItem(position);
        if (Intrinsics.areEqual(item, AdvancedChartIndicatorsAdapter2.EmptyStateAddDataHeader.INSTANCE)) {
            View view = holder.getView();
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.robinhood.android.designsystem.text.RhTextView");
            OnClickListeners.onClick((RhTextView) view, new Function0() { // from class: com.robinhood.android.advancedchart.AdvancedChartIndicatorsAdapter$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AdvancedChartIndicatorsAdapter.onBindViewHolder$lambda$1(this.f$0);
                }
            });
            return;
        }
        if (item instanceof AdvancedChartIndicatorsAdapter2.ControlButtonHeader) {
            View view2 = holder.getView();
            Intrinsics.checkNotNull(view2, "null cannot be cast to non-null type android.widget.ImageButton");
            ImageButton imageButton = (ImageButton) view2;
            OnClickListeners.onClick(imageButton, new Function0() { // from class: com.robinhood.android.advancedchart.AdvancedChartIndicatorsAdapter$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AdvancedChartIndicatorsAdapter.onBindViewHolder$lambda$2(this.f$0);
                }
            });
            if (((AdvancedChartIndicatorsAdapter2.ControlButtonHeader) item).isEditSurfaceIconEnabled()) {
                imageButton.setImageResource(ServerToBentoAssetMapper2.EDIT_SURFACE_24.getResourceId());
                return;
            } else {
                imageButton.setImageResource(ServerToBentoAssetMapper2.CONTROLS_24.getResourceId());
                return;
            }
        }
        if (!(item instanceof AdvancedChartIndicatorsAdapter2.IndicatorStateItem)) {
            throw new NoWhenBranchMatchedException();
        }
        View view3 = holder.getView();
        Intrinsics.checkNotNull(view3, "null cannot be cast to non-null type com.robinhood.android.designsystem.chip.RdsChip");
        RdsChip rdsChip = (RdsChip) view3;
        AdvancedChartIndicatorsAdapter2.IndicatorStateItem indicatorStateItem = (AdvancedChartIndicatorsAdapter2.IndicatorStateItem) item;
        final IndicatorState state = indicatorStateItem.getState();
        Resources resources = rdsChip.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        rdsChip.setText(state.getShortenedTitle(resources));
        Boolean selected = state.getSelected();
        Boolean bool = Boolean.TRUE;
        rdsChip.setIconDrawable(Intrinsics.areEqual(selected, bool) ? null : ViewsKt.getDrawable(rdsChip, C20690R.drawable.ic_rds_dot_16dp));
        Context context = rdsChip.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        rdsChip.setIconTint(ColorStateList.valueOf(ThemeColors.getThemeColor(context, indicatorStateItem.getState().getColorRes())));
        int colorRes = Intrinsics.areEqual(state.getSelected(), bool) ? state.getColorRes() : C20690R.attr.colorBackground1;
        int colorRes2 = Intrinsics.areEqual(state.getSelected(), bool) ? state.getColorRes() : C20690R.attr.colorBackground3;
        Context context2 = rdsChip.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        rdsChip.setBackgroundTintList(ColorStateList.valueOf(ThemeColors.getThemeColor(context2, colorRes)));
        Context context3 = rdsChip.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        rdsChip.setForegroundTintList(ColorStateList.valueOf(ThemeColors.getThemeColor(context3, colorRes2)));
        rdsChip.setSelected(Intrinsics.areEqual(state.getSelected(), bool));
        OnClickListeners.onClick(rdsChip, new Function0() { // from class: com.robinhood.android.advancedchart.AdvancedChartIndicatorsAdapter$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AdvancedChartIndicatorsAdapter.onBindViewHolder$lambda$7$lambda$3(this.f$0, state, position, item);
            }
        });
        if (rdsChip.isSelected() && state.getIndicatorIconType() == IndicatorState3.INFO) {
            rdsChip.setTrailingIcon(ViewsKt.getDrawable(rdsChip, C20690R.drawable.ic_rds_info_16dp));
            rdsChip.onTrailingIconClick(new Function0() { // from class: com.robinhood.android.advancedchart.AdvancedChartIndicatorsAdapter$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AdvancedChartIndicatorsAdapter.onBindViewHolder$lambda$7$lambda$4(this.f$0, state);
                }
            });
        } else if (rdsChip.isSelected() && state.getIndicatorIconType() == IndicatorState3.SETTINGS) {
            rdsChip.setTrailingIcon(ViewsKt.getDrawable(rdsChip, C20690R.drawable.ic_rds_settings_16dp));
            rdsChip.onTrailingIconClick(new Function0() { // from class: com.robinhood.android.advancedchart.AdvancedChartIndicatorsAdapter$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AdvancedChartIndicatorsAdapter.onBindViewHolder$lambda$7$lambda$5(this.f$0, state);
                }
            });
        } else {
            rdsChip.setTrailingIcon(null);
            rdsChip.onTrailingIconClick(new Function0() { // from class: com.robinhood.android.advancedchart.AdvancedChartIndicatorsAdapter$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            });
        }
        rdsChip.expandTrailingIconTappingAreaIfVisible();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$1(AdvancedChartIndicatorsAdapter advancedChartIndicatorsAdapter) {
        advancedChartIndicatorsAdapter.callbacks.onEmptyStateAddDataButtonTapped();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$2(AdvancedChartIndicatorsAdapter advancedChartIndicatorsAdapter) {
        advancedChartIndicatorsAdapter.callbacks.onAddPlusButtonTapped();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$7$lambda$3(AdvancedChartIndicatorsAdapter advancedChartIndicatorsAdapter, IndicatorState indicatorState, int i, AdvancedChartIndicatorsAdapter2 advancedChartIndicatorsAdapter2) {
        advancedChartIndicatorsAdapter.callbacks.onIndicatorTapped(indicatorState, i, ((AdvancedChartIndicatorsAdapter2.IndicatorStateItem) advancedChartIndicatorsAdapter2).isTapScrollEnabled());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$7$lambda$4(AdvancedChartIndicatorsAdapter advancedChartIndicatorsAdapter, IndicatorState indicatorState) {
        advancedChartIndicatorsAdapter.callbacks.onInfoIconTapped(indicatorState);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$7$lambda$5(AdvancedChartIndicatorsAdapter advancedChartIndicatorsAdapter, IndicatorState indicatorState) {
        advancedChartIndicatorsAdapter.callbacks.onSettingsIconTapped(indicatorState);
        return Unit.INSTANCE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        AdvancedChartIndicatorsAdapter2 item = getItem(position);
        if (Intrinsics.areEqual(item, AdvancedChartIndicatorsAdapter2.EmptyStateAddDataHeader.INSTANCE)) {
            return ViewType.EMPTY_STATE_ADD_DATA_HEADER.ordinal();
        }
        if (item instanceof AdvancedChartIndicatorsAdapter2.ControlButtonHeader) {
            return ViewType.CONTROL_BUTTON_HEADER.ordinal();
        }
        if (item instanceof AdvancedChartIndicatorsAdapter2.IndicatorStateItem) {
            return ViewType.INDICATOR.ordinal();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AdvancedChartIndicatorsAdapter.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/advancedchart/AdvancedChartIndicatorsAdapter$ViewType;", "", "<init>", "(Ljava/lang/String;I)V", "EMPTY_STATE_ADD_DATA_HEADER", "CONTROL_BUTTON_HEADER", "INDICATOR", "feature-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ViewType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ViewType[] $VALUES;
        public static final ViewType EMPTY_STATE_ADD_DATA_HEADER = new ViewType("EMPTY_STATE_ADD_DATA_HEADER", 0);
        public static final ViewType CONTROL_BUTTON_HEADER = new ViewType("CONTROL_BUTTON_HEADER", 1);
        public static final ViewType INDICATOR = new ViewType("INDICATOR", 2);

        private static final /* synthetic */ ViewType[] $values() {
            return new ViewType[]{EMPTY_STATE_ADD_DATA_HEADER, CONTROL_BUTTON_HEADER, INDICATOR};
        }

        public static EnumEntries<ViewType> getEntries() {
            return $ENTRIES;
        }

        private ViewType(String str, int i) {
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

    /* compiled from: AdvancedChartIndicatorsAdapter.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/advancedchart/AdvancedChartIndicatorsAdapter$IndicatorChipInflater;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/designsystem/chip/RdsChip;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class IndicatorChipInflater implements Inflater<RdsChip> {
        private final /* synthetic */ Inflater<RdsChip> $$delegate_0 = Inflater.INSTANCE.include(C8502R.layout.view_rds_chip);
        public static final IndicatorChipInflater INSTANCE = new IndicatorChipInflater();
        public static final int $stable = 8;

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public RdsChip inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (RdsChip) this.$$delegate_0.inflate(parent);
        }

        private IndicatorChipInflater() {
        }
    }

    /* compiled from: AdvancedChartIndicatorsAdapter.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/advancedchart/AdvancedChartIndicatorsAdapter$ControlButtonInflater;", "Lcom/robinhood/utils/ui/view/Inflater;", "Landroid/widget/ImageButton;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ControlButtonInflater implements Inflater<ImageButton> {
        private final /* synthetic */ Inflater<ImageButton> $$delegate_0 = Inflater.INSTANCE.include(C8502R.layout.view_control_button_header);
        public static final ControlButtonInflater INSTANCE = new ControlButtonInflater();
        public static final int $stable = 8;

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public ImageButton inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (ImageButton) this.$$delegate_0.inflate(parent);
        }

        private ControlButtonInflater() {
        }
    }

    /* compiled from: AdvancedChartIndicatorsAdapter.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/advancedchart/AdvancedChartIndicatorsAdapter$AddIndicatorHeaderInflater;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/designsystem/text/RhTextView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class AddIndicatorHeaderInflater implements Inflater<RhTextView> {
        private final /* synthetic */ Inflater<RhTextView> $$delegate_0 = Inflater.INSTANCE.include(C8502R.layout.view_empty_state_add_indicator_header);
        public static final AddIndicatorHeaderInflater INSTANCE = new AddIndicatorHeaderInflater();
        public static final int $stable = 8;

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public RhTextView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (RhTextView) this.$$delegate_0.inflate(parent);
        }

        private AddIndicatorHeaderInflater() {
        }
    }
}
