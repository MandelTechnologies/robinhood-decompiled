package com.robinhood.android.microdeposits.p182ui;

import com.robinhood.android.microdeposits.p182ui.VerifyMicrodepositsViewState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.store.achrelationship.MicrodepositsStore;
import com.robinhood.udf.UiEvent;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: VerifyMicrodepositsDuxo.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u001e\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/microdeposits/ui/VerifyMicrodepositsDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/microdeposits/ui/VerifyMicrodepositsViewState;", "microdepositsStore", "Lcom/robinhood/store/achrelationship/MicrodepositsStore;", "<init>", "(Lcom/robinhood/store/achrelationship/MicrodepositsStore;)V", "updateAmountOne", "", "amount", "", "updateAmountTwo", "verifyMicrodeposits", "relationshipId", "Ljava/util/UUID;", "amountOne", "amountTwo", "feature-microdeposits_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class VerifyMicrodepositsDuxo extends OldBaseDuxo<VerifyMicrodepositsViewState> {
    public static final int $stable = 8;
    private final MicrodepositsStore microdepositsStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public VerifyMicrodepositsDuxo(MicrodepositsStore microdepositsStore) {
        super(new VerifyMicrodepositsViewState(null, null, null, null, false, 31, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(microdepositsStore, "microdepositsStore");
        this.microdepositsStore = microdepositsStore;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VerifyMicrodepositsViewState updateAmountOne$lambda$0(String str, VerifyMicrodepositsViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return VerifyMicrodepositsViewState.copy$default(applyMutation, new VerifyMicrodepositsViewState.MicrodepositInput.Input(StringsKt.toIntOrNull(str)), null, null, null, false, 30, null);
    }

    public final void updateAmountOne(final String amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        applyMutation(new Function1() { // from class: com.robinhood.android.microdeposits.ui.VerifyMicrodepositsDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VerifyMicrodepositsDuxo.updateAmountOne$lambda$0(amount, (VerifyMicrodepositsViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VerifyMicrodepositsViewState updateAmountTwo$lambda$1(String str, VerifyMicrodepositsViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return VerifyMicrodepositsViewState.copy$default(applyMutation, null, new VerifyMicrodepositsViewState.MicrodepositInput.Input(StringsKt.toIntOrNull(str)), null, null, false, 29, null);
    }

    public final void updateAmountTwo(final String amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        applyMutation(new Function1() { // from class: com.robinhood.android.microdeposits.ui.VerifyMicrodepositsDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VerifyMicrodepositsDuxo.updateAmountTwo$lambda$1(amount, (VerifyMicrodepositsViewState) obj);
            }
        });
    }

    public final void verifyMicrodeposits(UUID relationshipId, String amountOne, String amountTwo) {
        Intrinsics.checkNotNullParameter(relationshipId, "relationshipId");
        Intrinsics.checkNotNullParameter(amountOne, "amountOne");
        Intrinsics.checkNotNullParameter(amountTwo, "amountTwo");
        final Integer intOrNull = StringsKt.toIntOrNull(amountOne);
        final Integer intOrNull2 = StringsKt.toIntOrNull(amountTwo);
        applyMutation(new Function1() { // from class: com.robinhood.android.microdeposits.ui.VerifyMicrodepositsDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VerifyMicrodepositsDuxo.verifyMicrodeposits$lambda$2(intOrNull, intOrNull2, (VerifyMicrodepositsViewState) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.microdepositsStore.verify(relationshipId, intOrNull, intOrNull2), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function0() { // from class: com.robinhood.android.microdeposits.ui.VerifyMicrodepositsDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return VerifyMicrodepositsDuxo.verifyMicrodeposits$lambda$4(this.f$0);
            }
        }, new Function1() { // from class: com.robinhood.android.microdeposits.ui.VerifyMicrodepositsDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VerifyMicrodepositsDuxo.verifyMicrodeposits$lambda$6(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VerifyMicrodepositsViewState verifyMicrodeposits$lambda$2(Integer num, Integer num2, VerifyMicrodepositsViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return VerifyMicrodepositsViewState.copy$default(applyMutation, new VerifyMicrodepositsViewState.MicrodepositInput.Input(num), new VerifyMicrodepositsViewState.MicrodepositInput.Input(num2), null, null, true, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit verifyMicrodeposits$lambda$4(VerifyMicrodepositsDuxo verifyMicrodepositsDuxo) {
        verifyMicrodepositsDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.microdeposits.ui.VerifyMicrodepositsDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VerifyMicrodepositsDuxo.verifyMicrodeposits$lambda$4$lambda$3((VerifyMicrodepositsViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VerifyMicrodepositsViewState verifyMicrodeposits$lambda$4$lambda$3(VerifyMicrodepositsViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return VerifyMicrodepositsViewState.copy$default(applyMutation, null, null, new UiEvent(Unit.INSTANCE), null, false, 11, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit verifyMicrodeposits$lambda$6(VerifyMicrodepositsDuxo verifyMicrodepositsDuxo, final Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        verifyMicrodepositsDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.microdeposits.ui.VerifyMicrodepositsDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VerifyMicrodepositsDuxo.verifyMicrodeposits$lambda$6$lambda$5(it, (VerifyMicrodepositsViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VerifyMicrodepositsViewState verifyMicrodeposits$lambda$6$lambda$5(Throwable th, VerifyMicrodepositsViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return VerifyMicrodepositsViewState.copy$default(applyMutation, null, null, null, new UiEvent(th), false, 7, null);
    }
}
