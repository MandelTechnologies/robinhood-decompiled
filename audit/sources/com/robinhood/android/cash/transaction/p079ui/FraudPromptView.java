package com.robinhood.android.cash.transaction.p079ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.robinhood.android.cash.transaction.C10421R;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: FraudPromptView.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0011B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/cash/transaction/ui/FraudPromptView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "negativeBtn", "Landroid/widget/Button;", "positiveBtn", "callbacks", "Lcom/robinhood/android/cash/transaction/ui/FraudPromptView$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/cash/transaction/ui/FraudPromptView$Callbacks;", "setCallbacks", "(Lcom/robinhood/android/cash/transaction/ui/FraudPromptView$Callbacks;)V", "Callbacks", "feature-cash-transaction_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class FraudPromptView extends ConstraintLayout {
    public static final int $stable = 8;
    private Callbacks callbacks;
    private final Button negativeBtn;
    private final Button positiveBtn;

    /* compiled from: FraudPromptView.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/cash/transaction/ui/FraudPromptView$Callbacks;", "", "onConfirmTransaction", "", "onDenyTransaction", "feature-cash-transaction_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onConfirmTransaction();

        void onDenyTransaction();
    }

    public /* synthetic */ FraudPromptView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FraudPromptView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewGroups.inflate(this, C10421R.layout.merge_fraud_prompt_view, true);
        View viewFindViewById = findViewById(C10421R.id.fraud_prompt_negative_btn);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        Button button = (Button) viewFindViewById;
        this.negativeBtn = button;
        View viewFindViewById2 = findViewById(C10421R.id.fraud_prompt_positive_btn);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        Button button2 = (Button) viewFindViewById2;
        this.positiveBtn = button2;
        OnClickListeners.onClick(button, new Function0() { // from class: com.robinhood.android.cash.transaction.ui.FraudPromptView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FraudPromptView._init_$lambda$0(this.f$0);
            }
        });
        OnClickListeners.onClick(button2, new Function0() { // from class: com.robinhood.android.cash.transaction.ui.FraudPromptView$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FraudPromptView._init_$lambda$1(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$0(FraudPromptView fraudPromptView) {
        Callbacks callbacks = fraudPromptView.callbacks;
        if (callbacks != null) {
            callbacks.onDenyTransaction();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$1(FraudPromptView fraudPromptView) {
        Callbacks callbacks = fraudPromptView.callbacks;
        if (callbacks != null) {
            callbacks.onConfirmTransaction();
        }
        return Unit.INSTANCE;
    }

    public final Callbacks getCallbacks() {
        return this.callbacks;
    }

    public final void setCallbacks(Callbacks callbacks) {
        this.callbacks = callbacks;
    }
}
