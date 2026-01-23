package com.robinhood.android.equity.ordercheck.p122ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.equityvalidation.C16020R;
import com.robinhood.android.equityvalidation.databinding.MergeEquityOrderChecksBreakdownSectionViewBinding;
import com.robinhood.models.p320db.VisibleEquityOrderChecksAlert;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: EquityOrderChecksBreakdownSectionView.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00172\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0017B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0003H\u0016R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/equity/ordercheck/ui/EquityOrderChecksBreakdownSectionView;", "Landroid/widget/LinearLayout;", "Lcom/robinhood/utils/ui/view/Bindable;", "Lcom/robinhood/models/db/VisibleEquityOrderChecksAlert$Section$BreakdownSection;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/robinhood/android/equityvalidation/databinding/MergeEquityOrderChecksBreakdownSectionViewBinding;", "getBinding", "()Lcom/robinhood/android/equityvalidation/databinding/MergeEquityOrderChecksBreakdownSectionViewBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "breakdownAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/equity/ordercheck/ui/EquityOrderChecksBreakdownRowView;", "Lcom/robinhood/android/equity/ordercheck/ui/State;", "bind", "", "state", "Companion", "lib-equity-validation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class EquityOrderChecksBreakdownSectionView extends LinearLayout implements Bindable<VisibleEquityOrderChecksAlert.Section.BreakdownSection> {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private final GenericListAdapter<EquityOrderChecksBreakdownRowView, State> breakdownAdapter;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(EquityOrderChecksBreakdownSectionView.class, "binding", "getBinding()Lcom/robinhood/android/equityvalidation/databinding/MergeEquityOrderChecksBreakdownSectionViewBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EquityOrderChecksBreakdownSectionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.binding = ViewBinding5.viewBinding(this, EquityOrderChecksBreakdownSectionView2.INSTANCE);
        GenericListAdapter<EquityOrderChecksBreakdownRowView, State> genericListAdapterM2987of = GenericListAdapter.INSTANCE.m2987of(EquityOrderChecksBreakdownRowView.INSTANCE, DiffCallbacks.Equality.INSTANCE, new Function2() { // from class: com.robinhood.android.equity.ordercheck.ui.EquityOrderChecksBreakdownSectionView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return EquityOrderChecksBreakdownSectionView.breakdownAdapter$lambda$0((EquityOrderChecksBreakdownRowView) obj, (State) obj2);
            }
        });
        this.breakdownAdapter = genericListAdapterM2987of;
        setOrientation(1);
        ViewGroups.inflate(this, C16020R.layout.merge_equity_order_checks_breakdown_section_view, true);
        getBinding().breakdownRecyclerView.setAdapter(genericListAdapterM2987of);
    }

    private final MergeEquityOrderChecksBreakdownSectionViewBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeEquityOrderChecksBreakdownSectionViewBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit breakdownAdapter$lambda$0(EquityOrderChecksBreakdownRowView of, State row) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(row, "row");
        of.bind(row);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.utils.p409ui.view.Bindable
    public void bind(VisibleEquityOrderChecksAlert.Section.BreakdownSection state) {
        Intrinsics.checkNotNullParameter(state, "state");
        RhTextView titleTxt = getBinding().titleTxt;
        Intrinsics.checkNotNullExpressionValue(titleTxt, "titleTxt");
        TextViewsKt.setVisibilityText(titleTxt, state.getTitle());
        GenericListAdapter<EquityOrderChecksBreakdownRowView, State> genericListAdapter = this.breakdownAdapter;
        List<VisibleEquityOrderChecksAlert.Section.BreakdownRow> rows = state.getRows();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(rows, 10));
        int i = 0;
        for (Object obj : rows) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            VisibleEquityOrderChecksAlert.Section.BreakdownRow breakdownRow = (VisibleEquityOrderChecksAlert.Section.BreakdownRow) obj;
            boolean z = true;
            if (i != state.getRows().size() - 1) {
                z = false;
            }
            arrayList.add(new State(breakdownRow, z));
            i = i2;
        }
        genericListAdapter.submitList(arrayList);
    }

    /* compiled from: EquityOrderChecksBreakdownSectionView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/equity/ordercheck/ui/EquityOrderChecksBreakdownSectionView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/equity/ordercheck/ui/EquityOrderChecksBreakdownSectionView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "lib-equity-validation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<EquityOrderChecksBreakdownSectionView> {
        private final /* synthetic */ Inflater<EquityOrderChecksBreakdownSectionView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public EquityOrderChecksBreakdownSectionView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (EquityOrderChecksBreakdownSectionView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C16020R.layout.include_equity_order_checks_breakdown_section_view);
        }
    }
}
