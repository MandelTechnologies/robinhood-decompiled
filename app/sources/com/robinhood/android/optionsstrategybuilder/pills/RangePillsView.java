package com.robinhood.android.optionsstrategybuilder.pills;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.optionsstrategybuilder.C24876R;
import com.robinhood.android.optionsstrategybuilder.databinding.MergeRangePillsBinding;
import com.robinhood.android.optionsstrategybuilder.pills.PillView;
import com.robinhood.models.p320db.OptionStrategyChainTemplate;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.p409ui.view.Inflater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: RangePillsView.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00152\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001\u0015B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ$\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u0014H\u0016R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/optionsstrategybuilder/pills/RangePillsView;", "Lcom/robinhood/android/optionsstrategybuilder/pills/PillView;", "Lcom/robinhood/android/optionsstrategybuilder/pills/PillView$State;", "Lcom/robinhood/models/db/OptionStrategyChainTemplate$FilterGroup$RangeFilterGroup;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "bindings", "Lcom/robinhood/android/optionsstrategybuilder/databinding/MergeRangePillsBinding;", "getBindings", "()Lcom/robinhood/android/optionsstrategybuilder/databinding/MergeRangePillsBinding;", "bindings$delegate", "Lkotlin/properties/ReadOnlyProperty;", "bind", "", "state", "initialNearDateExpand", "Lcom/robinhood/udf/UiEvent;", "Companion", "feature-options-strategy-builder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class RangePillsView extends PillView<PillView.State<OptionStrategyChainTemplate.FilterGroup.RangeFilterGroup>> {

    /* renamed from: bindings$delegate, reason: from kotlin metadata */
    private final Interfaces2 bindings;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RangePillsView.class, "bindings", "getBindings()Lcom/robinhood/android/optionsstrategybuilder/databinding/MergeRangePillsBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ RangePillsView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RangePillsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, C24876R.layout.merge_range_pills, this);
        this.bindings = ViewBinding5.viewBinding(this, RangePillsView2.INSTANCE);
        getBindings().startPill.getDropdownIcon().setVisibility(8);
        getBindings().endPill.getDropdownIcon().setVisibility(8);
    }

    private final MergeRangePillsBinding getBindings() {
        Object value = this.bindings.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeRangePillsBinding) value;
    }

    @Override // com.robinhood.android.optionsstrategybuilder.pills.PillView
    public void bind(PillView.State<OptionStrategyChainTemplate.FilterGroup.RangeFilterGroup> state, UiEvent<Unit> initialNearDateExpand) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(initialNearDateExpand, "initialNearDateExpand");
        StrategyBuilderChip startPill = getBindings().startPill;
        Intrinsics.checkNotNullExpressionValue(startPill, "startPill");
        bind(startPill, state, new Function1() { // from class: com.robinhood.android.optionsstrategybuilder.pills.RangePillsView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RangePillsView.bind$lambda$0((PillView.State) obj);
            }
        }, initialNearDateExpand);
        StrategyBuilderChip endPill = getBindings().endPill;
        Intrinsics.checkNotNullExpressionValue(endPill, "endPill");
        bind(endPill, state, new Function1() { // from class: com.robinhood.android.optionsstrategybuilder.pills.RangePillsView$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RangePillsView.bind$lambda$1((PillView.State) obj);
            }
        }, initialNearDateExpand);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionStrategyChainTemplate.Filter bind$lambda$0(PillView.State it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return ((OptionStrategyChainTemplate.FilterGroup.RangeFilterGroup) it.getFilterGroup()).getStartFilter();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionStrategyChainTemplate.Filter bind$lambda$1(PillView.State it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return ((OptionStrategyChainTemplate.FilterGroup.RangeFilterGroup) it.getFilterGroup()).getEndFilter();
    }

    /* compiled from: RangePillsView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/optionsstrategybuilder/pills/RangePillsView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/optionsstrategybuilder/pills/RangePillsView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-options-strategy-builder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<RangePillsView> {
        private final /* synthetic */ Inflater<RangePillsView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public RangePillsView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (RangePillsView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C24876R.layout.include_range_rds_chips);
        }
    }
}
