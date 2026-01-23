package com.robinhood.android.cash.disputes.view.transaction;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import com.robinhood.android.cash.disputes.C10007R;
import com.robinhood.android.cash.disputes.databinding.MergeTransactionSingleSelectionRowViewBinding;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.disposer.ViewDisposerKt;
import com.robinhood.models.p320db.mcduckling.SettledCardTransaction;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.utils.resource.StringResource;
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

/* compiled from: TransactionSingleSelectionRowView.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 52\u00020\u00012\u00020\u0002:\u00015B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010(\u001a\u00020)H\u0014J\u0010\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0014J\b\u0010'\u001a\u00020\u0016H\u0016J\u0010\u0010.\u001a\u00020)2\u0006\u0010/\u001a\u00020\u0016H\u0016J\b\u00100\u001a\u00020)H\u0016J\u0018\u00101\u001a\u00020)2\u0006\u00102\u001a\u0002032\b\b\u0002\u00104\u001a\u00020\u0016R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R$\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00168F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR(\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u001b8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R(\u0010!\u001a\u0004\u0018\u00010\u001b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u001b8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b\"\u0010\u001e\"\u0004\b#\u0010 R(\u0010$\u001a\u0004\u0018\u00010\u001b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u001b8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b%\u0010\u001e\"\u0004\b&\u0010 R\u000e\u0010'\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00066"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/view/transaction/TransactionSingleSelectionRowView;", "Lcom/robinhood/android/designsystem/container/RdsRippleContainerView;", "Landroid/widget/Checkable;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "duxo", "Lcom/robinhood/android/cash/disputes/view/transaction/TransactionRowDuxo;", "getDuxo", "()Lcom/robinhood/android/cash/disputes/view/transaction/TransactionRowDuxo;", "setDuxo", "(Lcom/robinhood/android/cash/disputes/view/transaction/TransactionRowDuxo;)V", "binding", "Lcom/robinhood/android/cash/disputes/databinding/MergeTransactionSingleSelectionRowViewBinding;", "getBinding", "()Lcom/robinhood/android/cash/disputes/databinding/MergeTransactionSingleSelectionRowViewBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "value", "", "isDividerVisible", "()Z", "setDividerVisible", "(Z)V", "", "primaryText", "getPrimaryText", "()Ljava/lang/CharSequence;", "setPrimaryText", "(Ljava/lang/CharSequence;)V", "secondaryText", "getSecondaryText", "setSecondaryText", "metadataText", "getMetadataText", "setMetadataText", "isChecked", "onAttachedToWindow", "", "onCreateDrawableState", "", "extraSpace", "", "setChecked", "checked", AnalyticsStrings.BUTTON_FRIDAY_TRADING_SETTING_TOGGLE, "bindCardTransaction", "cardTransaction", "Lcom/robinhood/models/db/mcduckling/SettledCardTransaction;", "isDuplicateTransaction", "Companion", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class TransactionSingleSelectionRowView extends Hammer_TransactionSingleSelectionRowView implements Checkable {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    public TransactionRowDuxo duxo;
    private boolean isChecked;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(TransactionSingleSelectionRowView.class, "binding", "getBinding()Lcom/robinhood/android/cash/disputes/databinding/MergeTransactionSingleSelectionRowViewBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final int[] CHECKED_STATE_SET = {R.attr.state_checked};

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionSingleSelectionRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        this.binding = ViewBinding5.viewBinding(this, TransactionSingleSelectionRowView2.INSTANCE);
        ViewGroups.inflate(this, C10007R.layout.merge_transaction_single_selection_row_view, true);
    }

    public final TransactionRowDuxo getDuxo() {
        TransactionRowDuxo transactionRowDuxo = this.duxo;
        if (transactionRowDuxo != null) {
            return transactionRowDuxo;
        }
        Intrinsics.throwUninitializedPropertyAccessException("duxo");
        return null;
    }

    public final void setDuxo(TransactionRowDuxo transactionRowDuxo) {
        Intrinsics.checkNotNullParameter(transactionRowDuxo, "<set-?>");
        this.duxo = transactionRowDuxo;
    }

    private final MergeTransactionSingleSelectionRowViewBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeTransactionSingleSelectionRowViewBinding) value;
    }

    public final boolean isDividerVisible() {
        View transactionSingleSelectionBottomDivider = getBinding().transactionSingleSelectionBottomDivider;
        Intrinsics.checkNotNullExpressionValue(transactionSingleSelectionBottomDivider, "transactionSingleSelectionBottomDivider");
        return transactionSingleSelectionBottomDivider.getVisibility() == 0;
    }

    public final void setDividerVisible(boolean z) {
        View transactionSingleSelectionBottomDivider = getBinding().transactionSingleSelectionBottomDivider;
        Intrinsics.checkNotNullExpressionValue(transactionSingleSelectionBottomDivider, "transactionSingleSelectionBottomDivider");
        transactionSingleSelectionBottomDivider.setVisibility(z ? 0 : 8);
    }

    private final CharSequence getPrimaryText() {
        return getBinding().transactionSingleSelectionTextContainer.getPrimaryText();
    }

    private final void setPrimaryText(CharSequence charSequence) {
        getBinding().transactionSingleSelectionTextContainer.setPrimaryText(charSequence);
    }

    private final CharSequence getSecondaryText() {
        return getBinding().transactionSingleSelectionTextContainer.getSecondaryText();
    }

    private final void setSecondaryText(CharSequence charSequence) {
        getBinding().transactionSingleSelectionTextContainer.setSecondaryText(charSequence);
    }

    private final CharSequence getMetadataText() {
        return getBinding().transactionSingleSelectionMetadataContainer.getPrimaryText();
    }

    private final void setMetadataText(CharSequence charSequence) {
        getBinding().transactionSingleSelectionMetadataContainer.setPrimaryText(charSequence);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewDisposerKt.bindTo$default(ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.disputes.view.transaction.TransactionSingleSelectionRowView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TransactionSingleSelectionRowView.onAttachedToWindow$lambda$0(this.f$0, (TransactionRowViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$0(TransactionSingleSelectionRowView transactionSingleSelectionRowView, TransactionRowViewState viewState) throws Resources.NotFoundException {
        CharSequence text;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        transactionSingleSelectionRowView.setPrimaryText(viewState.getPrimaryText());
        StringResource secondaryText = viewState.getSecondaryText();
        if (secondaryText != null) {
            Resources resources = transactionSingleSelectionRowView.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            text = secondaryText.getText(resources);
        } else {
            text = null;
        }
        transactionSingleSelectionRowView.setSecondaryText(text);
        transactionSingleSelectionRowView.setMetadataText(viewState.getMetadataText());
        return Unit.INSTANCE;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int extraSpace) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(extraSpace + 1);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, CHECKED_STATE_SET);
        }
        Intrinsics.checkNotNull(iArrOnCreateDrawableState);
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.isChecked;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean checked) {
        if (this.isChecked != checked) {
            this.isChecked = checked;
            refreshDrawableState();
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        if (this.isChecked) {
            return;
        }
        setChecked(true);
    }

    public static /* synthetic */ void bindCardTransaction$default(TransactionSingleSelectionRowView transactionSingleSelectionRowView, SettledCardTransaction settledCardTransaction, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        transactionSingleSelectionRowView.bindCardTransaction(settledCardTransaction, z);
    }

    public final void bindCardTransaction(SettledCardTransaction cardTransaction, boolean isDuplicateTransaction) {
        Intrinsics.checkNotNullParameter(cardTransaction, "cardTransaction");
        getDuxo().setCardTransaction(cardTransaction, isDuplicateTransaction);
    }

    /* compiled from: TransactionSingleSelectionRowView.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\tH\u0096\u0001R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/view/transaction/TransactionSingleSelectionRowView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/cash/disputes/view/transaction/TransactionSingleSelectionRowView;", "<init>", "()V", "CHECKED_STATE_SET", "", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<TransactionSingleSelectionRowView> {
        private final /* synthetic */ Inflater<TransactionSingleSelectionRowView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public TransactionSingleSelectionRowView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (TransactionSingleSelectionRowView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C10007R.layout.include_transaction_single_selection_row_view);
        }
    }
}
