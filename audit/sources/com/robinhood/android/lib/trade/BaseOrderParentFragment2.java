package com.robinhood.android.lib.trade;

import androidx.view.result.ActivityResultCallback;
import com.robinhood.android.common.contracts.CarContract;
import com.robinhood.android.lib.trade.util.HandleCarResult;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: BaseOrderParentFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.lib.trade.BaseOrderParentFragment$carLauncher$2, reason: use source file name */
/* loaded from: classes8.dex */
final class BaseOrderParentFragment2<O> implements ActivityResultCallback {
    final /* synthetic */ BaseOrderParentFragment<OrderManagerT> this$0;

    BaseOrderParentFragment2(BaseOrderParentFragment<OrderManagerT> baseOrderParentFragment) {
        this.this$0 = baseOrderParentFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onActivityResult$lambda$0(BaseOrderParentFragment baseOrderParentFragment) {
        baseOrderParentFragment.finish();
        return Unit.INSTANCE;
    }

    @Override // androidx.view.result.ActivityResultCallback
    public final void onActivityResult(CarContract.Result result) {
        final BaseOrderParentFragment<OrderManagerT> baseOrderParentFragment = this.this$0;
        HandleCarResult.handleCarResult(result, new Function0() { // from class: com.robinhood.android.lib.trade.BaseOrderParentFragment$carLauncher$2$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseOrderParentFragment2.onActivityResult$lambda$0(baseOrderParentFragment);
            }
        });
    }
}
