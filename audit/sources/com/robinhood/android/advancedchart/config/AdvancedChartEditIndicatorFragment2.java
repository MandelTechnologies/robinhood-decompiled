package com.robinhood.android.advancedchart.config;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.jakewharton.rxbinding3.widget.RxTextView;
import com.robinhood.android.advancedchart.config.AdvancedChartEditIndicatorFragment;
import com.robinhood.android.advancedchart.databinding.IncludeEditIndicatorRowBinding;
import com.robinhood.android.common.p088ui.view.RhEditText;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.shared.chart.contracts.advancedChart.AdvancedChartEditIndicatorFragmentKey;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks3;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import com.robinhood.utils.p409ui.view.recyclerview.GenericViewHolder;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: AdvancedChartEditIndicatorFragment.kt */
@Metadata(m3635d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u001e\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, m3636d2 = {"com/robinhood/android/advancedchart/config/AdvancedChartEditIndicatorFragment$attributeListAdapter$1", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/designsystem/row/RdsRowView;", "Lcom/robinhood/android/advancedchart/config/TechnicalIndicatorConfigAttribute;", "onBindViewHolder", "", "holder", "Lcom/robinhood/utils/ui/view/recyclerview/GenericViewHolder;", "position", "", "feature-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advancedchart.config.AdvancedChartEditIndicatorFragment$attributeListAdapter$1, reason: use source file name */
/* loaded from: classes24.dex */
public final class AdvancedChartEditIndicatorFragment2 extends GenericListAdapter<RdsRowView, TechnicalIndicatorConfigAttribute> {
    final /* synthetic */ AdvancedChartEditIndicatorFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdvancedChartEditIndicatorFragment2(AdvancedChartEditIndicatorFragment advancedChartEditIndicatorFragment, Inflater<? extends RdsRowView> inflater, DiffCallbacks3<? super TechnicalIndicatorConfigAttribute> diffCallbacks3) {
        super(inflater, diffCallbacks3);
        this.this$0 = advancedChartEditIndicatorFragment;
    }

    @Override // com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(GenericViewHolder<? extends RdsRowView> holder, final int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        final TechnicalIndicatorConfigAttribute item = getItem(position);
        final IncludeEditIndicatorRowBinding includeEditIndicatorRowBindingBind = IncludeEditIndicatorRowBinding.bind(holder.getView());
        final AdvancedChartEditIndicatorFragment advancedChartEditIndicatorFragment = this.this$0;
        ConstraintLayout root = includeEditIndicatorRowBindingBind.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        OnClickListeners.onClick(root, new Function0() { // from class: com.robinhood.android.advancedchart.config.AdvancedChartEditIndicatorFragment$attributeListAdapter$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AdvancedChartEditIndicatorFragment2.onBindViewHolder$lambda$4$lambda$0(includeEditIndicatorRowBindingBind);
            }
        });
        includeEditIndicatorRowBindingBind.label.setText(advancedChartEditIndicatorFragment.getString(item.getTitleRes()));
        final RhEditText rhEditText = includeEditIndicatorRowBindingBind.editText;
        rhEditText.setInputType(item.getInputType());
        AdvancedChartEditIndicatorFragment.Companion companion = AdvancedChartEditIndicatorFragment.INSTANCE;
        rhEditText.setHint(item.getHint(((AdvancedChartEditIndicatorFragmentKey) companion.getArgs((Fragment) advancedChartEditIndicatorFragment)).getLaunchMode()));
        rhEditText.setText(item.getFieldValue(((AdvancedChartEditIndicatorFragmentKey) companion.getArgs((Fragment) advancedChartEditIndicatorFragment)).getLaunchMode()));
        if (position == 0) {
            rhEditText.requestFocus();
        }
        Intrinsics.checkNotNull(rhEditText);
        rhEditText.addTextChangedListener(new TextWatcher() { // from class: com.robinhood.android.advancedchart.config.AdvancedChartEditIndicatorFragment$attributeListAdapter$1$onBindViewHolder$lambda$4$lambda$3$$inlined$addTextChangedListener$default$1
            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence text, int start, int before, int count) {
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s) {
                String string2;
                String string3;
                String str = "";
                if (s == null || (string2 = s.toString()) == null) {
                    string2 = "";
                }
                BigDecimal bigDecimalOrNull = StringsKt.toBigDecimalOrNull(string2);
                if (bigDecimalOrNull != null && (string3 = bigDecimalOrNull.toString()) != null) {
                    str = string3;
                }
                if (StringsKt.endsWith$default(string2, ".", false, 2, (Object) null)) {
                    str = str + ".";
                }
                if (Intrinsics.areEqual(str, string2)) {
                    return;
                }
                if (s != null) {
                    s.clear();
                }
                if (s != null) {
                    s.append((CharSequence) str);
                }
            }
        });
        rhEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.robinhood.android.advancedchart.config.AdvancedChartEditIndicatorFragment$attributeListAdapter$1$onBindViewHolder$1$2$2
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                if (z) {
                    advancedChartEditIndicatorFragment.getBinding().numpad.setDelimiterEnabled(item.getDelimiterEnabled());
                }
            }
        });
        LifecycleHost.DefaultImpls.bind$default(advancedChartEditIndicatorFragment, RxTextView.textChanges(rhEditText), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.advancedchart.config.AdvancedChartEditIndicatorFragment$attributeListAdapter$1$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdvancedChartEditIndicatorFragment2.onBindViewHolder$lambda$4$lambda$3$lambda$2(rhEditText, advancedChartEditIndicatorFragment, position, (CharSequence) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$4$lambda$0(IncludeEditIndicatorRowBinding includeEditIndicatorRowBinding) {
        includeEditIndicatorRowBinding.editText.requestFocus();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$4$lambda$3$lambda$2(RhEditText rhEditText, AdvancedChartEditIndicatorFragment advancedChartEditIndicatorFragment, int i, CharSequence text) {
        Intrinsics.checkNotNullParameter(text, "text");
        BigDecimal bigDecimalOrNull = StringsKt.toBigDecimalOrNull(text.toString());
        if (bigDecimalOrNull == null) {
            bigDecimalOrNull = new BigDecimal(rhEditText.getHint().toString());
        }
        advancedChartEditIndicatorFragment.getDuxo().setConfigAttribute(bigDecimalOrNull, i);
        return Unit.INSTANCE;
    }
}
