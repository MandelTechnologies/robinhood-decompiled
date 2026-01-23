package com.robinhood.android.cash.disputes.view.transaction;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.robinhood.android.cash.disputes.C10007R;
import com.robinhood.disposer.ViewDisposerKt;
import com.robinhood.models.p320db.mcduckling.SettledCardTransaction;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TransactionReviewRowView.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0010\u001a\u00020\u0011H\u0014J\u000e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/view/transaction/TransactionReviewRowView;", "Lcom/robinhood/android/designsystem/row/RdsRowView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "duxo", "Lcom/robinhood/android/cash/disputes/view/transaction/TransactionRowDuxo;", "getDuxo", "()Lcom/robinhood/android/cash/disputes/view/transaction/TransactionRowDuxo;", "setDuxo", "(Lcom/robinhood/android/cash/disputes/view/transaction/TransactionRowDuxo;)V", "showTransactionDate", "", "onAttachedToWindow", "", "bindCardTransaction", "cardTransaction", "Lcom/robinhood/models/db/mcduckling/SettledCardTransaction;", "Companion", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class TransactionReviewRowView extends Hammer_TransactionReviewRowView {
    public TransactionRowDuxo duxo;
    private boolean showTransactionDate;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionReviewRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, null);
        Intrinsics.checkNotNullParameter(context, "context");
        int[] TransactionReviewRowView = C10007R.styleable.TransactionReviewRowView;
        Intrinsics.checkNotNullExpressionValue(TransactionReviewRowView, "TransactionReviewRowView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, TransactionReviewRowView, 0, 0);
        this.showTransactionDate = typedArrayObtainStyledAttributes.getBoolean(C10007R.styleable.TransactionReviewRowView_showTransactionDate, false);
        typedArrayObtainStyledAttributes.recycle();
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

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewDisposerKt.bindTo$default(ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.disputes.view.transaction.TransactionReviewRowView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TransactionReviewRowView.onAttachedToWindow$lambda$1(this.f$0, (TransactionRowViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$1(TransactionReviewRowView transactionReviewRowView, TransactionRowViewState viewState) throws Resources.NotFoundException {
        StringResource secondaryText;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        transactionReviewRowView.setPrimaryText(viewState.getPrimaryText());
        transactionReviewRowView.setMetadataPrimaryText(viewState.getMetadataText());
        CharSequence text = null;
        if (transactionReviewRowView.showTransactionDate && (secondaryText = viewState.getSecondaryText()) != null) {
            Resources resources = transactionReviewRowView.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            text = secondaryText.getText(resources);
        }
        transactionReviewRowView.setSecondaryText(text);
        return Unit.INSTANCE;
    }

    public final void bindCardTransaction(SettledCardTransaction cardTransaction) {
        Intrinsics.checkNotNullParameter(cardTransaction, "cardTransaction");
        TransactionRowDuxo.setCardTransaction$default(getDuxo(), cardTransaction, false, 2, null);
    }

    /* compiled from: TransactionReviewRowView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/view/transaction/TransactionReviewRowView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/cash/disputes/view/transaction/TransactionReviewRowView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<TransactionReviewRowView> {
        private final /* synthetic */ Inflater<TransactionReviewRowView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public TransactionReviewRowView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (TransactionReviewRowView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C10007R.layout.include_transaction_review_row_view);
        }
    }
}
