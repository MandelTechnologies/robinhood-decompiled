package com.robinhood.android.options.p208ui.detail;

import com.robinhood.android.options.p208ui.detail.OptionsDetailPageBodyState2;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: OptionsDetailPageLateCloseUpsell.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageLateCloseUpsellKt$OptionsDetailPageLateCloseUpsell$1$1$1$5$1, reason: use source file name */
/* loaded from: classes11.dex */
final class OptionsDetailPageLateCloseUpsell6 implements Function0<Unit> {
    final /* synthetic */ Function1<UUID, Unit> $onLateCloseUpsellDismissed;
    final /* synthetic */ OptionsDetailPageBodyState2.Upsell.LateClose $state;

    /* JADX WARN: Multi-variable type inference failed */
    OptionsDetailPageLateCloseUpsell6(Function1<? super UUID, Unit> function1, OptionsDetailPageBodyState2.Upsell.LateClose lateClose) {
        this.$onLateCloseUpsellDismissed = function1;
        this.$state = lateClose;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onLateCloseUpsellDismissed.invoke(this.$state.getChainId());
    }
}
