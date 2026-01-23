package com.robinhood.android.trade.configuration;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.content.res.AppCompatResources;
import com.robinhood.android.designsystem.row.RdsHeaderRowView;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.trade.configuration.OrderConfigurationDisclosureView;
import com.robinhood.android.trade.configuration.OrderConfigurationRow;
import com.robinhood.android.trading.contracts.configuration.DirectOrder;
import com.robinhood.android.trading.contracts.configuration.DollarBased4;
import com.robinhood.android.trading.contracts.configuration.ShareOrder;
import com.robinhood.android.util.extensions.IconExtensions;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.Icon;
import com.robinhood.models.serverdriven.experimental.api.IconWithAction;
import com.robinhood.test.idler.TrackedListAdapter;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.p409ui.color.ThemeColors;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericViewHolder;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OrderConfigurationSelectionAdapter.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001b2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001:\u0002\u001a\u001bB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\fH\u0016J\u001e\u0010\u0015\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0018\u001a\u00020\fH\u0016J\u0010\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\fH\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR$\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f@BX\u0082\u000e¢\u0006\n\n\u0002\u0010\u0010\"\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/trade/configuration/OrderConfigurationSelectionAdapter;", "Lcom/robinhood/test/idler/TrackedListAdapter;", "Lcom/robinhood/android/trade/configuration/OrderConfigurationRow;", "Lcom/robinhood/utils/ui/view/recyclerview/GenericViewHolder;", "Landroid/view/View;", "callbacks", "Lcom/robinhood/android/trade/configuration/OrderConfigurationSelectionAdapter$Callbacks;", "<init>", "(Lcom/robinhood/android/trade/configuration/OrderConfigurationSelectionAdapter$Callbacks;)V", "getCallbacks", "()Lcom/robinhood/android/trade/configuration/OrderConfigurationSelectionAdapter$Callbacks;", "value", "", "selectedRow", "setSelectedRow", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onBindViewHolder", "", "holder", "position", "getItemViewType", "Callbacks", "Companion", "feature-lib-trade-configuration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class OrderConfigurationSelectionAdapter extends TrackedListAdapter<OrderConfigurationRow, GenericViewHolder<? extends View>> {
    private static final int HEADER_VIEW_TYPE = 4;
    private static final int OPTION_HOOK_VIEW_TYPE = 5;
    private static final int ROW_DISCLOSURE_VIEW_TYPE = 8;
    private static final int ROW_DOLLAR_BASED_VIEW_TYPE = 3;
    private static final int ROW_OPTION_SECTION_HEADER_VIEW_TYPE = 9;
    private static final int ROW_OPTION_VIEW_TYPE = 2;
    private static final int ROW_ORDER_RADIO_GROUP_TYPE = 7;
    private static final int ROW_ORDER_VIEW_TYPE = 1;
    private static final int ROW_RECURRING_ORDER_VIEW_TYPE = 6;
    private final Callbacks callbacks;
    private Integer selectedRow;
    public static final int $stable = 8;

    /* compiled from: OrderConfigurationSelectionAdapter.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\u0003H&¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/trade/configuration/OrderConfigurationSelectionAdapter$Callbacks;", "", "onHeaderClicked", "", "action", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "forAchromatic", "", "onUpsellClicked", "upsellType", "Lcom/robinhood/android/trade/configuration/OrderConfigurationUpsellOption;", "onOrderConfigurationRowClicked", "row", "Lcom/robinhood/android/trade/configuration/OrderConfigurationRow;", "onDisclosureClicked", "feature-lib-trade-configuration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {

        /* compiled from: OrderConfigurationSelectionAdapter.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class DefaultImpls {
            public static void onHeaderClicked(Callbacks callbacks, GenericAction action, boolean z) {
                Intrinsics.checkNotNullParameter(action, "action");
            }
        }

        void onDisclosureClicked();

        void onHeaderClicked(GenericAction action, boolean forAchromatic);

        void onOrderConfigurationRowClicked(OrderConfigurationRow row);

        void onUpsellClicked(OrderConfigurationUpsellOption upsellType);
    }

    public final Callbacks getCallbacks() {
        return this.callbacks;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderConfigurationSelectionAdapter(Callbacks callbacks) {
        super(DiffCallbacks.Equality.INSTANCE);
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        DiffCallbacks diffCallbacks = DiffCallbacks.INSTANCE;
        this.callbacks = callbacks;
    }

    private final void setSelectedRow(Integer num) {
        if (num != null && num.intValue() == -1) {
            num = null;
        }
        Integer num2 = this.selectedRow;
        this.selectedRow = num;
        if (num != null) {
            int iIntValue = num.intValue();
            notifyItemChanged(iIntValue, getItem(iIntValue));
        }
        if (num2 != null) {
            int iIntValue2 = num2.intValue();
            notifyItemChanged(iIntValue2, getItem(iIntValue2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreateViewHolder$lambda$2(OrderConfigurationSelectionAdapter orderConfigurationSelectionAdapter) {
        orderConfigurationSelectionAdapter.callbacks.onUpsellClicked(OrderConfigurationUpsellOption.OPTION_HOOK);
        return Unit.INSTANCE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public GenericViewHolder<View> onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        switch (viewType) {
            case 1:
            case 2:
            case 3:
            case 6:
                return new GenericViewHolder<>(OrderConfigurationRowView.INSTANCE.inflate(parent));
            case 4:
                Context context = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                return new GenericViewHolder<>(new RdsHeaderRowView(context, null));
            case 5:
                OptionHookRowView optionHookRowViewInflate = OptionHookRowView.INSTANCE.inflate(parent);
                OnClickListeners.onClick(optionHookRowViewInflate.getUpsellContainer(), new Function0() { // from class: com.robinhood.android.trade.configuration.OrderConfigurationSelectionAdapter$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OrderConfigurationSelectionAdapter.onCreateViewHolder$lambda$2(this.f$0);
                    }
                });
                return new GenericViewHolder<>(optionHookRowViewInflate);
            case 7:
                return new GenericViewHolder<>(OrderConfigurationRadioView.INSTANCE.inflate(parent));
            case 8:
                OrderConfigurationDisclosureView orderConfigurationDisclosureViewInflate = OrderConfigurationDisclosureView.INSTANCE.inflate(parent);
                orderConfigurationDisclosureViewInflate.bind(new OrderConfigurationDisclosureView.Callbacks() { // from class: com.robinhood.android.trade.configuration.OrderConfigurationSelectionAdapter.onCreateViewHolder.2
                    @Override // com.robinhood.android.trade.configuration.OrderConfigurationDisclosureView.Callbacks
                    public void onDisclosureClicked() {
                        OrderConfigurationSelectionAdapter.this.getCallbacks().onDisclosureClicked();
                    }
                });
                return new GenericViewHolder<>(orderConfigurationDisclosureViewInflate);
            case 9:
                return new GenericViewHolder<>(OrderConfigurationOptionSectionHeaderView.INSTANCE.inflate(parent));
            default:
                Preconditions.INSTANCE.failUnexpectedItemKotlin(Integer.valueOf(viewType));
                throw new ExceptionsH();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(final GenericViewHolder<? extends View> holder, int position) throws Resources.NotFoundException {
        final GenericAction genericAction;
        Icon icon;
        Intrinsics.checkNotNullParameter(holder, "holder");
        View view = holder.getView();
        final OrderConfigurationRow item = getItem(position);
        drawable = null;
        Drawable drawable = null;
        if (item instanceof OrderConfigurationRow.Header) {
            OrderConfigurationRow.Header header = (OrderConfigurationRow.Header) item;
            String string2 = holder.getView().getResources().getString(header.getTitleRes());
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            IconWithAction<GenericAction> iconWithAction = header.getIconWithAction();
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.robinhood.android.designsystem.row.RdsHeaderRowView");
            RdsHeaderRowView rdsHeaderRowView = (RdsHeaderRowView) view;
            boolean zIsInTopPosition = header.isInTopPosition();
            if (iconWithAction != null && (icon = iconWithAction.getIcon()) != null) {
                drawable = AppCompatResources.getDrawable(rdsHeaderRowView.getContext(), IconExtensions.getResourceId(icon));
            }
            Drawable drawable2 = drawable;
            Context context = rdsHeaderRowView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            rdsHeaderRowView.bind(string2, zIsInTopPosition, true, drawable2, ColorStateList.valueOf(ThemeColors.getThemeColor(context, C20690R.attr.colorForeground1)));
            if (iconWithAction != null && (genericAction = (GenericAction) iconWithAction.getAction()) != null) {
                OnClickListeners.onClick(view, new Function0() { // from class: com.robinhood.android.trade.configuration.OrderConfigurationSelectionAdapter$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OrderConfigurationSelectionAdapter.onBindViewHolder$lambda$5$lambda$4(this.f$0, holder, genericAction, item);
                    }
                });
                return;
            } else {
                OnClickListeners.onClick(view, new Function0() { // from class: com.robinhood.android.trade.configuration.OrderConfigurationSelectionAdapter$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OrderConfigurationSelectionAdapter.onBindViewHolder$lambda$6(this.f$0, holder);
                    }
                });
                return;
            }
        }
        if (item instanceof OrderConfigurationRow.Recurring) {
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.robinhood.utils.ui.view.Bindable<com.robinhood.android.trade.configuration.OrderConfigurationResource>");
            OrderConfigurationRow.Recurring recurring = (OrderConfigurationRow.Recurring) item;
            ((Bindable) view).bind(recurring.getResourceConfig());
            if (recurring.isRecurringTradable()) {
                OnClickListeners.onClick(view, new Function0() { // from class: com.robinhood.android.trade.configuration.OrderConfigurationSelectionAdapter$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OrderConfigurationSelectionAdapter.onBindViewHolder$lambda$7(this.f$0, holder, item);
                    }
                });
                return;
            } else {
                view.setOnClickListener(null);
                return;
            }
        }
        if (item instanceof OrderConfigurationRow.RowWithResourceConfig) {
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.robinhood.utils.ui.view.Bindable<com.robinhood.android.trade.configuration.OrderConfigurationResource>");
            ((Bindable) view).bind(((OrderConfigurationRow.RowWithResourceConfig) item).getResourceConfig());
            boolean z = view instanceof OrderConfigurationRowView;
            OrderConfigurationRowView orderConfigurationRowView = z ? (OrderConfigurationRowView) view : null;
            if (orderConfigurationRowView != null) {
                orderConfigurationRowView.setCallbacks(this.callbacks);
            }
            OrderConfigurationRowView orderConfigurationRowView2 = z ? (OrderConfigurationRowView) view : null;
            if (orderConfigurationRowView2 != null) {
                orderConfigurationRowView2.setItem(item);
            }
            OnClickListeners.onClick(view, new Function0() { // from class: com.robinhood.android.trade.configuration.OrderConfigurationSelectionAdapter$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OrderConfigurationSelectionAdapter.onBindViewHolder$lambda$8(this.f$0, holder, item);
                }
            });
            return;
        }
        if (item instanceof OrderConfigurationRow.RowWithRadioGroupConfig) {
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.robinhood.utils.ui.view.Bindable<com.robinhood.android.trade.configuration.OrderConfigurationRadioGroupResource>");
            ((Bindable) view).bind(((OrderConfigurationRow.RowWithRadioGroupConfig) item).getRadioGroupConfig());
            ((OrderConfigurationRadioView) view).setOnCheckedListener(new Function1() { // from class: com.robinhood.android.trade.configuration.OrderConfigurationSelectionAdapter$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OrderConfigurationSelectionAdapter.onBindViewHolder$lambda$10(this.f$0, item, ((Integer) obj).intValue());
                }
            });
        } else if (item instanceof OrderConfigurationRow.OptionSectionHeader) {
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.robinhood.android.trade.configuration.OrderConfigurationOptionSectionHeaderView");
            ((OrderConfigurationOptionSectionHeaderView) view).bind((OrderConfigurationRow.OptionSectionHeader) item);
        } else if (item instanceof OrderConfigurationRow.OptionUpsell) {
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.robinhood.android.trade.configuration.OptionHookRowView");
            ((OptionHookRowView) view).bind(((OrderConfigurationRow.OptionUpsell) item).isUk());
        } else if (!(item instanceof OrderConfigurationRow.Disclosure) && !(item instanceof OrderConfigurationRow.Option) && !(item instanceof OrderConfigurationRow.RadioGroupBased) && !(item instanceof OrderConfigurationRow.EquityDirectOrder)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$5$lambda$4(OrderConfigurationSelectionAdapter orderConfigurationSelectionAdapter, GenericViewHolder genericViewHolder, GenericAction genericAction, OrderConfigurationRow orderConfigurationRow) {
        orderConfigurationSelectionAdapter.setSelectedRow(Integer.valueOf(genericViewHolder.getAbsoluteAdapterPosition()));
        orderConfigurationSelectionAdapter.callbacks.onHeaderClicked(genericAction, ((OrderConfigurationRow.Header) orderConfigurationRow).getForAchromatic());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$6(OrderConfigurationSelectionAdapter orderConfigurationSelectionAdapter, GenericViewHolder genericViewHolder) {
        orderConfigurationSelectionAdapter.setSelectedRow(Integer.valueOf(genericViewHolder.getAbsoluteAdapterPosition()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$7(OrderConfigurationSelectionAdapter orderConfigurationSelectionAdapter, GenericViewHolder genericViewHolder, OrderConfigurationRow orderConfigurationRow) {
        orderConfigurationSelectionAdapter.setSelectedRow(Integer.valueOf(genericViewHolder.getAbsoluteAdapterPosition()));
        orderConfigurationSelectionAdapter.callbacks.onOrderConfigurationRowClicked(orderConfigurationRow);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$8(OrderConfigurationSelectionAdapter orderConfigurationSelectionAdapter, GenericViewHolder genericViewHolder, OrderConfigurationRow orderConfigurationRow) {
        orderConfigurationSelectionAdapter.setSelectedRow(Integer.valueOf(genericViewHolder.getAbsoluteAdapterPosition()));
        orderConfigurationSelectionAdapter.callbacks.onOrderConfigurationRowClicked(orderConfigurationRow);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onBindViewHolder$lambda$10(OrderConfigurationSelectionAdapter orderConfigurationSelectionAdapter, OrderConfigurationRow orderConfigurationRow, int i) {
        Callbacks callbacks = orderConfigurationSelectionAdapter.callbacks;
        ((OrderConfigurationRow.RowWithRadioGroupConfig) orderConfigurationRow).getRadioGroupConfig().setSelectedRadioButtonIndex(i);
        callbacks.onOrderConfigurationRowClicked(orderConfigurationRow);
        return Unit.INSTANCE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        OrderConfigurationRow orderConfigurationRow = getCurrentList().get(position);
        if (orderConfigurationRow instanceof OrderConfigurationRow.OptionSectionHeader) {
            return 9;
        }
        if (orderConfigurationRow instanceof OrderConfigurationRow.Option) {
            return 2;
        }
        if (orderConfigurationRow instanceof OrderConfigurationRow.EquityDirectOrder) {
            DirectOrder orderConfig = ((OrderConfigurationRow.EquityDirectOrder) orderConfigurationRow).getOrderConfig();
            if (orderConfig instanceof ShareOrder) {
                return 1;
            }
            if (orderConfig instanceof DollarBased4) {
                return 3;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (orderConfigurationRow instanceof OrderConfigurationRow.Recurring) {
            return 6;
        }
        if (orderConfigurationRow instanceof OrderConfigurationRow.Header) {
            return 4;
        }
        if (orderConfigurationRow instanceof OrderConfigurationRow.OptionUpsell) {
            return 5;
        }
        if (orderConfigurationRow instanceof OrderConfigurationRow.RadioGroupBased) {
            return 7;
        }
        if (orderConfigurationRow instanceof OrderConfigurationRow.Disclosure) {
            return 8;
        }
        throw new NoWhenBranchMatchedException();
    }
}
