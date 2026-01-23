package defpackage;

import com.robinhood.android.advisory.onboarding.firstdeposit.AdvisoryFirstDepositTransferDuxo;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvisoryFirstDepositTransferComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: AdvisoryFirstDepositTransferComposableKt$AdvisoryFirstDepositComposable$2$2$1 */
/* loaded from: classes24.dex */
/* synthetic */ class C0031x876a5639 extends FunctionReferenceImpl implements Function1<BigDecimal, Unit> {
    C0031x876a5639(Object obj) {
        super(1, obj, AdvisoryFirstDepositTransferDuxo.class, "onQuickAmountSelected", "onQuickAmountSelected(Ljava/math/BigDecimal;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(BigDecimal bigDecimal) {
        invoke2(bigDecimal);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(BigDecimal p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((AdvisoryFirstDepositTransferDuxo) this.receiver).onQuickAmountSelected(p0);
    }
}
