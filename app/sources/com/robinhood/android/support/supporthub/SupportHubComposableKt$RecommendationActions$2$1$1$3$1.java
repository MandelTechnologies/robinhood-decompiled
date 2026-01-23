package com.robinhood.android.support.supporthub;

import com.robinhood.models.p355ui.supporthub.GetSupportAction;
import com.robinhood.models.p355ui.supporthub.RecommendationCard;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: SupportHubComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
final class SupportHubComposableKt$RecommendationActions$2$1$1$3$1 implements Function0<Unit> {
    final /* synthetic */ RecommendationCard $action;
    final /* synthetic */ Function1<GetSupportAction, Unit> $onClickCta;

    /* JADX WARN: Multi-variable type inference failed */
    SupportHubComposableKt$RecommendationActions$2$1$1$3$1(Function1<? super GetSupportAction, Unit> function1, RecommendationCard recommendationCard) {
        this.$onClickCta = function1;
        this.$action = recommendationCard;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onClickCta.invoke(this.$action.getCtaAction());
    }
}
