package com.robinhood.android.options.p208ui.detail;

import com.robinhood.android.options.p208ui.bottomsheet.LateCloseBottomSheetDialogFragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: OptionsDetailPageFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
/* synthetic */ class OptionsDetailPageFragment$ComposeContent$5$2$1$1$2$1$5$1$3$1 extends FunctionReferenceImpl implements Function1<LateCloseBottomSheetDialogFragment.Args, Unit> {
    OptionsDetailPageFragment$ComposeContent$5$2$1$1$2$1$5$1$3$1(Object obj) {
        super(1, obj, OptionsDetailPageFragment.class, "onLateCloseInfoClicked", "onLateCloseInfoClicked(Lcom/robinhood/android/options/ui/bottomsheet/LateCloseBottomSheetDialogFragment$Args;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(LateCloseBottomSheetDialogFragment.Args args) {
        invoke2(args);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(LateCloseBottomSheetDialogFragment.Args args) {
        ((OptionsDetailPageFragment) this.receiver).onLateCloseInfoClicked(args);
    }
}
