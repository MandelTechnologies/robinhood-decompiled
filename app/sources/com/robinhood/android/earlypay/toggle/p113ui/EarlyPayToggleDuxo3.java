package com.robinhood.android.earlypay.toggle.p113ui;

import io.reactivex.functions.Action;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EarlyPayToggleDuxo.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.earlypay.toggle.ui.EarlyPayToggleDuxo$onEarlyPayEnrollmentChangeConfirmed$1$2, reason: use source file name */
/* loaded from: classes7.dex */
final class EarlyPayToggleDuxo3 implements Action {
    final /* synthetic */ EarlyPayToggleDuxo this$0;

    EarlyPayToggleDuxo3(EarlyPayToggleDuxo earlyPayToggleDuxo) {
        this.this$0 = earlyPayToggleDuxo;
    }

    @Override // io.reactivex.functions.Action
    public final void run() {
        this.this$0.applyMutation(new Function1() { // from class: com.robinhood.android.earlypay.toggle.ui.EarlyPayToggleDuxo$onEarlyPayEnrollmentChangeConfirmed$1$2$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EarlyPayToggleDuxo3.run$lambda$0((EarlyPayToggleViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EarlyPayToggleViewState run$lambda$0(EarlyPayToggleViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return EarlyPayToggleViewState.copy$default(applyMutation, false, true, null, null, null, 24, null);
    }
}
