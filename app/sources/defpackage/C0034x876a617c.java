package defpackage;

import com.robinhood.android.advisory.onboarding.firstdeposit.AdvisoryFirstDepositTransferDuxo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: AdvisoryFirstDepositTransferComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: AdvisoryFirstDepositTransferComposableKt$AdvisoryFirstDepositComposable$2$5$1 */
/* loaded from: classes24.dex */
/* synthetic */ class C0034x876a617c extends FunctionReferenceImpl implements Function0<Unit> {
    C0034x876a617c(Object obj) {
        super(0, obj, AdvisoryFirstDepositTransferDuxo.class, "resetShake", "resetShake()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((AdvisoryFirstDepositTransferDuxo) this.receiver).resetShake();
    }
}
