package defpackage;

import com.robinhood.android.advisory.onboarding.firstdeposit.AdvisoryFirstDepositTransferDuxo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: AdvisoryFirstDepositTransferComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: AdvisoryFirstDepositTransferComposableKt$AdvisoryFirstDepositComposable$2$3$1 */
/* loaded from: classes24.dex */
/* synthetic */ class C0032x876a59fa extends FunctionReferenceImpl implements Function0<Unit> {
    C0032x876a59fa(Object obj) {
        super(0, obj, AdvisoryFirstDepositTransferDuxo.class, "onContinueCtaClicked", "onContinueCtaClicked()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((AdvisoryFirstDepositTransferDuxo) this.receiver).onContinueCtaClicked();
    }
}
