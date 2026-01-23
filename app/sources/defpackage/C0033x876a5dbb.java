package defpackage;

import android.view.KeyEvent;
import com.robinhood.android.advisory.onboarding.firstdeposit.AdvisoryFirstDepositTransferDuxo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvisoryFirstDepositTransferComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: AdvisoryFirstDepositTransferComposableKt$AdvisoryFirstDepositComposable$2$4$1 */
/* loaded from: classes24.dex */
/* synthetic */ class C0033x876a5dbb extends FunctionReferenceImpl implements Function1<KeyEvent, Unit> {
    C0033x876a5dbb(Object obj) {
        super(1, obj, AdvisoryFirstDepositTransferDuxo.class, "onKeyPress", "onKeyPress(Landroid/view/KeyEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(KeyEvent keyEvent) {
        invoke2(keyEvent);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(KeyEvent p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((AdvisoryFirstDepositTransferDuxo) this.receiver).onKeyPress(p0);
    }
}
