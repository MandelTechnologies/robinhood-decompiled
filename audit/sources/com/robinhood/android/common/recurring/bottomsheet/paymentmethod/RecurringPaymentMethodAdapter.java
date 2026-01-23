package com.robinhood.android.common.recurring.bottomsheet.paymentmethod;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.ListAdapter;
import com.robinhood.android.common.recurring.bottomsheet.paymentmethod.RecurringPaymentMethodBottomSheet;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.designsystem.selectioncontrol.RdsRadioButtonRowView;
import com.robinhood.android.designsystem.selectioncontrol.RdsSelectionRowView;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericViewHolder;
import com.robinhood.utils.resource.StringResource;
import java.util.List;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecurringPaymentMethodAdapter.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00162\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001:\u0001\u0016B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u001e\u0010\u0010\u001a\u00020\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000eH\u0016R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/bottomsheet/paymentmethod/RecurringPaymentMethodAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/robinhood/android/common/recurring/bottomsheet/paymentmethod/RecurringPaymentMethodBottomSheet$Row;", "Lcom/robinhood/utils/ui/view/recyclerview/GenericViewHolder;", "Landroid/view/View;", "onRowClicked", "Lkotlin/Function1;", "", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "state", "Lcom/robinhood/android/common/recurring/bottomsheet/paymentmethod/RecurringPaymentMethodViewState;", "setState", "getItemViewType", "", "position", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class RecurringPaymentMethodAdapter extends ListAdapter<RecurringPaymentMethodBottomSheet.Row, GenericViewHolder<? extends View>> {
    private static final int VIEW_TYPE_ADD_REMOVE = 0;
    private static final int VIEW_TYPE_RELATIONSHIP_BP = 1;
    private final Function1<RecurringPaymentMethodBottomSheet.Row, Unit> onRowClicked;
    private RecurringPaymentMethodViewState state;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RecurringPaymentMethodAdapter(Function1<? super RecurringPaymentMethodBottomSheet.Row, Unit> onRowClicked) {
        super(DiffCallbacks.INSTANCE.byEquality(new Function1() { // from class: com.robinhood.android.common.recurring.bottomsheet.paymentmethod.RecurringPaymentMethodAdapter$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ((RecurringPaymentMethodBottomSheet.Row) obj).getTitle();
            }
        }));
        Intrinsics.checkNotNullParameter(onRowClicked, "onRowClicked");
        this.onRowClicked = onRowClicked;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void setState(RecurringPaymentMethodViewState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.state = state;
        List<RecurringPaymentMethodBottomSheet.Row> rows = state.getRows();
        if (getSize() != rows.size()) {
            submitList(rows);
        } else {
            notifyDataSetChanged();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        RecurringPaymentMethodBottomSheet.Row item = getItem(position);
        if ((item instanceof RecurringPaymentMethodBottomSheet.Row.GenericBuyingPower) || (item instanceof RecurringPaymentMethodBottomSheet.Row.CryptoBuyingPower) || (item instanceof RecurringPaymentMethodBottomSheet.Row.EquityBuyingPower) || (item instanceof RecurringPaymentMethodBottomSheet.Row.AchRelationship)) {
            return 1;
        }
        if ((item instanceof RecurringPaymentMethodBottomSheet.Row.AddAccount) || (item instanceof RecurringPaymentMethodBottomSheet.Row.RemoveBackup)) {
            return 0;
        }
        Preconditions.INSTANCE.failUnexpectedItemKotlin(item);
        throw new ExceptionsH();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(GenericViewHolder<? extends View> holder, int position) throws Resources.NotFoundException {
        CharSequence text;
        Intrinsics.checkNotNullParameter(holder, "holder");
        final RecurringPaymentMethodBottomSheet.Row item = getItem(position);
        View view = holder.getView();
        CharSequence text2 = null;
        if (view instanceof RdsRadioButtonRowView) {
            View view2 = holder.getView();
            Intrinsics.checkNotNull(view2, "null cannot be cast to non-null type com.robinhood.android.designsystem.selectioncontrol.RdsRadioButtonRowView");
            RdsRadioButtonRowView rdsRadioButtonRowView = (RdsRadioButtonRowView) view2;
            StringResource title = item.getTitle();
            Resources resources = rdsRadioButtonRowView.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            rdsRadioButtonRowView.setPrimaryText(title.getText(resources));
            StringResource subtitle = item.getSubtitle();
            if (subtitle != null) {
                Resources resources2 = rdsRadioButtonRowView.getResources();
                Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
                text = subtitle.getText(resources2);
            } else {
                text = null;
            }
            rdsRadioButtonRowView.setSecondaryText(text);
            if (item.getHighlightText() != null) {
                rdsRadioButtonRowView.setLeadingIconDrawable(rdsRadioButtonRowView.getContext().getDrawable(C20690R.drawable.ic_rds_retirement_12dp));
                rdsRadioButtonRowView.setLeadingIconTint(rdsRadioButtonRowView.getContext().getColorStateList(C20690R.color.mobius_prime_day));
                StringResource highlightText = item.getHighlightText();
                Resources resources3 = rdsRadioButtonRowView.getResources();
                Intrinsics.checkNotNullExpressionValue(resources3, "getResources(...)");
                rdsRadioButtonRowView.setSecondaryHighlightText(highlightText.getText(resources3));
            } else {
                rdsRadioButtonRowView.setLeadingIconDrawable(null);
                rdsRadioButtonRowView.setLeadingIconTint(null);
                rdsRadioButtonRowView.setSecondaryHighlightText(null);
            }
            RecurringPaymentMethodViewState recurringPaymentMethodViewState = this.state;
            if (recurringPaymentMethodViewState == null) {
                Intrinsics.throwUninitializedPropertyAccessException("state");
                recurringPaymentMethodViewState = null;
            }
            RecurringPaymentMethodBottomSheet.Row selectedRow = recurringPaymentMethodViewState.getSelectedRow();
            rdsRadioButtonRowView.setChecked(Intrinsics.areEqual(selectedRow != null ? selectedRow.getTitle() : null, item.getTitle()));
            rdsRadioButtonRowView.onCheckedChange(new Function2() { // from class: com.robinhood.android.common.recurring.bottomsheet.paymentmethod.RecurringPaymentMethodAdapter$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RecurringPaymentMethodAdapter.onBindViewHolder$lambda$3$lambda$2(this.f$0, item, (RdsSelectionRowView) obj, ((Boolean) obj2).booleanValue());
                }
            });
            return;
        }
        if (view instanceof RdsRowView) {
            View view3 = holder.getView();
            Intrinsics.checkNotNull(view3, "null cannot be cast to non-null type com.robinhood.android.designsystem.row.RdsRowView");
            RdsRowView rdsRowView = (RdsRowView) view3;
            StringResource title2 = item.getTitle();
            Resources resources4 = rdsRowView.getResources();
            Intrinsics.checkNotNullExpressionValue(resources4, "getResources(...)");
            rdsRowView.setPrimaryText(title2.getText(resources4));
            StringResource subtitle2 = item.getSubtitle();
            if (subtitle2 != null) {
                Resources resources5 = rdsRowView.getResources();
                Intrinsics.checkNotNullExpressionValue(resources5, "getResources(...)");
                text2 = subtitle2.getText(resources5);
            }
            rdsRowView.setSecondaryText(text2);
            Integer leadingDrawableId = item.getLeadingDrawableId();
            if (leadingDrawableId != null) {
                rdsRowView.setLeadingIconDrawable(ViewsKt.getDrawable(rdsRowView, leadingDrawableId.intValue()));
            }
            OnClickListeners.onClick(rdsRowView, new Function0() { // from class: com.robinhood.android.common.recurring.bottomsheet.paymentmethod.RecurringPaymentMethodAdapter$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RecurringPaymentMethodAdapter.onBindViewHolder$lambda$6$lambda$5(this.f$0, item);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$3$lambda$2(RecurringPaymentMethodAdapter recurringPaymentMethodAdapter, RecurringPaymentMethodBottomSheet.Row row, RdsSelectionRowView rdsSelectionRowView, boolean z) {
        Intrinsics.checkNotNullParameter(rdsSelectionRowView, "<unused var>");
        if (z) {
            Function1<RecurringPaymentMethodBottomSheet.Row, Unit> function1 = recurringPaymentMethodAdapter.onRowClicked;
            Intrinsics.checkNotNull(row);
            function1.invoke(row);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$6$lambda$5(RecurringPaymentMethodAdapter recurringPaymentMethodAdapter, RecurringPaymentMethodBottomSheet.Row row) {
        Function1<RecurringPaymentMethodBottomSheet.Row, Unit> function1 = recurringPaymentMethodAdapter.onRowClicked;
        Intrinsics.checkNotNull(row);
        function1.invoke(row);
        return Unit.INSTANCE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public GenericViewHolder<View> onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == 0) {
            return new GenericViewHolder<>(RdsRowView.INSTANCE.inflate(parent));
        }
        if (viewType == 1) {
            return new GenericViewHolder<>(RdsRadioButtonRowView.INSTANCE.inflate(parent));
        }
        throw new IllegalStateException("viewType unknown");
    }
}
