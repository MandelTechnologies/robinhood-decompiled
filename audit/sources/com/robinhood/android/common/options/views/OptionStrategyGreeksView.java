package com.robinhood.android.common.options.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.gridlayout.widget.GridLayout;
import com.robinhood.android.common.options.C11303R;
import com.robinhood.android.common.options.databinding.MergeOptionStrategyGreeksViewBinding;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.models.p320db.OptionQuote;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.p409ui.view.Inflater;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: OptionStrategyGreeksView.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00132\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002:\u0001\u0013B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u0016R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/common/options/views/OptionStrategyGreeksView;", "Landroidx/gridlayout/widget/GridLayout;", "Lcom/robinhood/utils/ui/view/Bindable;", "Lcom/robinhood/models/db/OptionQuote;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "bindings", "Lcom/robinhood/android/common/options/databinding/MergeOptionStrategyGreeksViewBinding;", "getBindings", "()Lcom/robinhood/android/common/options/databinding/MergeOptionStrategyGreeksViewBinding;", "bindings$delegate", "Lkotlin/properties/ReadOnlyProperty;", "bind", "", "state", "Companion", "feature-lib-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class OptionStrategyGreeksView extends GridLayout implements Bindable<OptionQuote> {

    /* renamed from: bindings$delegate, reason: from kotlin metadata */
    private final Interfaces2 bindings;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(OptionStrategyGreeksView.class, "bindings", "getBindings()Lcom/robinhood/android/common/options/databinding/MergeOptionStrategyGreeksViewBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ OptionStrategyGreeksView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionStrategyGreeksView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewGroups.inflate(this, C11303R.layout.merge_option_strategy_greeks_view, true);
        setColumnCount(3);
        this.bindings = ViewBinding5.viewBinding(this, OptionStrategyGreeksView2.INSTANCE);
    }

    private final MergeOptionStrategyGreeksViewBinding getBindings() {
        Object value = this.bindings.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeOptionStrategyGreeksViewBinding) value;
    }

    @Override // com.robinhood.utils.p409ui.view.Bindable
    public void bind(OptionQuote state) {
        MergeOptionStrategyGreeksViewBinding bindings = getBindings();
        bindings.deltaRow.setValueText(NumberFormatter.DefaultImpls.formatNullable$default(Formats.getSensitivityFormat(), state != null ? state.getDelta() : null, null, 2, null));
        bindings.gammaRow.setValueText(NumberFormatter.DefaultImpls.formatNullable$default(Formats.getSensitivityFormat(), state != null ? state.getGamma() : null, null, 2, null));
        bindings.thetaRow.setValueText(NumberFormatter.DefaultImpls.formatNullable$default(Formats.getSensitivityFormat(), state != null ? state.getTheta() : null, null, 2, null));
        bindings.vegaRow.setValueText(NumberFormatter.DefaultImpls.formatNullable$default(Formats.getSensitivityFormat(), state != null ? state.getVega() : null, null, 2, null));
        bindings.rhoRow.setValueText(NumberFormatter.DefaultImpls.formatNullable$default(Formats.getSensitivityFormat(), state != null ? state.getRho() : null, null, 2, null));
    }

    /* compiled from: OptionStrategyGreeksView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/common/options/views/OptionStrategyGreeksView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/common/options/views/OptionStrategyGreeksView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-lib-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<OptionStrategyGreeksView> {
        private final /* synthetic */ Inflater<OptionStrategyGreeksView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public OptionStrategyGreeksView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (OptionStrategyGreeksView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C11303R.layout.include_option_strategy_greeks_view);
        }
    }
}
