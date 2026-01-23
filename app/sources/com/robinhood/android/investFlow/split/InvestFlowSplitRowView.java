package com.robinhood.android.investFlow.split;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhMoneyInputView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.investFlow.C19349R;
import com.robinhood.android.investFlow.databinding.MergeInvestFlowSplitRowBinding;
import com.robinhood.android.investFlow.split.InvestFlowSplitViewState;
import com.robinhood.disposer.ViewDisposerKt;
import com.robinhood.models.util.Money;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Optional;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.resource.StringResource;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: InvestFlowSplitRowView.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001e\u001fB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0016\u001a\u00020\u0017H\u0014J\b\u0010\u0018\u001a\u00020\u0017H\u0014J\u0018\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dR\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\u0011X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/investFlow/split/InvestFlowSplitRowView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/robinhood/android/investFlow/databinding/MergeInvestFlowSplitRowBinding;", "getBinding", "()Lcom/robinhood/android/investFlow/databinding/MergeInvestFlowSplitRowBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "assetId", "Ljava/util/UUID;", "callbacks", "Lcom/robinhood/android/investFlow/split/InvestFlowSplitRowView$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/investFlow/split/InvestFlowSplitRowView$Callbacks;", "setCallbacks", "(Lcom/robinhood/android/investFlow/split/InvestFlowSplitRowView$Callbacks;)V", "onAttachedToWindow", "", "onDetachedFromWindow", "bind", "state", "Lcom/robinhood/android/investFlow/split/InvestFlowSplitViewState$Row;", "allocatedAmount", "Lcom/robinhood/models/util/Money;", "Callbacks", "Companion", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class InvestFlowSplitRowView extends ConstraintLayout {
    private UUID assetId;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    public Callbacks callbacks;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(InvestFlowSplitRowView.class, "binding", "getBinding()Lcom/robinhood/android/investFlow/databinding/MergeInvestFlowSplitRowBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: InvestFlowSplitRowView.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/investFlow/split/InvestFlowSplitRowView$Callbacks;", "", "onAmountChanged", "", "assetId", "Ljava/util/UUID;", "amount", "Lcom/robinhood/models/util/Money;", "onUntradableInstrumentClicked", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onAmountChanged(UUID assetId, Money amount);

        void onUntradableInstrumentClicked(UUID assetId);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestFlowSplitRowView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.binding = ViewBinding5.viewBinding(this, InvestFlowSplitRowView2.INSTANCE);
        ViewGroups.inflate(this, C19349R.layout.merge_invest_flow_split_row, true);
    }

    private final MergeInvestFlowSplitRowBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeInvestFlowSplitRowBinding) value;
    }

    public final Callbacks getCallbacks() {
        Callbacks callbacks = this.callbacks;
        if (callbacks != null) {
            return callbacks;
        }
        Intrinsics.throwUninitializedPropertyAccessException("callbacks");
        return null;
    }

    public final void setCallbacks(Callbacks callbacks) {
        Intrinsics.checkNotNullParameter(callbacks, "<set-?>");
        this.callbacks = callbacks;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewDisposerKt.bindTo$default(getBinding().moneyInput.getAmountObservable(), this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.investFlow.split.InvestFlowSplitRowView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowSplitRowView.onAttachedToWindow$lambda$1(this.f$0, (Optional) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$1(InvestFlowSplitRowView investFlowSplitRowView, Optional optional) {
        Intrinsics.checkNotNullParameter(optional, "<destruct>");
        Money money = (Money) optional.component1();
        UUID uuid = investFlowSplitRowView.assetId;
        if (uuid != null) {
            investFlowSplitRowView.getCallbacks().onAmountChanged(uuid, money);
        }
        return Unit.INSTANCE;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.assetId = null;
    }

    public final void bind(final InvestFlowSplitViewState.Row state, Money allocatedAmount) {
        Intrinsics.checkNotNullParameter(state, "state");
        MergeInvestFlowSplitRowBinding binding = getBinding();
        RhTextView rhTextView = binding.nameTxt;
        StringResource primaryText = state.getPrimaryText();
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        rhTextView.setText(primaryText.getText(resources));
        binding.nameTxt.setEnabled(state.getTradable());
        RhTextView sortInfoTxt = binding.sortInfoTxt;
        Intrinsics.checkNotNullExpressionValue(sortInfoTxt, "sortInfoTxt");
        TextViewsKt.setVisibilityText(sortInfoTxt, state.getSortInfo());
        RhMoneyInputView rhMoneyInputView = binding.moneyInput;
        rhMoneyInputView.setHint(state.getHint());
        if (!Intrinsics.areEqual(this.assetId, state.getAssetId())) {
            rhMoneyInputView.setAmount(allocatedAmount);
        }
        rhMoneyInputView.setAmountEnabled(state.getTradable());
        rhMoneyInputView.setSymbolEnabled(state.getTradable());
        UiEvent<Unit> requestFocusEvent = state.getRequestFocusEvent();
        if ((requestFocusEvent != null ? requestFocusEvent.consume() : null) != null) {
            getBinding().moneyInput.requestAmountTextFocus();
        }
        if (!state.getTradable()) {
            OnClickListeners.onClick(this, new Function0() { // from class: com.robinhood.android.investFlow.split.InvestFlowSplitRowView$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return InvestFlowSplitRowView.bind$lambda$4(this.f$0, state);
                }
            });
        } else {
            OnClickListeners.onClick(this, null);
        }
        this.assetId = state.getAssetId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$4(InvestFlowSplitRowView investFlowSplitRowView, InvestFlowSplitViewState.Row row) {
        investFlowSplitRowView.getCallbacks().onUntradableInstrumentClicked(row.getAssetId());
        return Unit.INSTANCE;
    }

    /* compiled from: InvestFlowSplitRowView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/investFlow/split/InvestFlowSplitRowView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/investFlow/split/InvestFlowSplitRowView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<InvestFlowSplitRowView> {
        private final /* synthetic */ Inflater<InvestFlowSplitRowView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public InvestFlowSplitRowView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (InvestFlowSplitRowView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C19349R.layout.include_invest_flow_split_row);
        }
    }
}
