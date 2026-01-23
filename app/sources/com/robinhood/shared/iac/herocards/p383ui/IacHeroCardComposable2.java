package com.robinhood.shared.iac.herocards.p383ui;

import com.robinhood.analytics.EventLogger;
import com.robinhood.models.p320db.herocard.IacHeroCard;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.iac.herocards.analytics.HeroCardLogging;
import com.robinhood.shared.iac.herocards.data.IacHeroCardDuxo;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: IacHeroCardComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.iac.herocards.ui.IacHeroCardComposableKt$IacHeroCardComposable$5$1", m3645f = "IacHeroCardComposable.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.iac.herocards.ui.IacHeroCardComposableKt$IacHeroCardComposable$5$1, reason: use source file name */
/* loaded from: classes6.dex */
final class IacHeroCardComposable2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ IacHeroCard $card;
    final /* synthetic */ IacHeroCardDuxo $duxo;
    final /* synthetic */ EventLogger $eventLogger;
    final /* synthetic */ Screen $eventScreen;
    final /* synthetic */ Function1<IacHeroCard, Unit> $onCardSeen;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    IacHeroCardComposable2(EventLogger eventLogger, Screen screen, IacHeroCard iacHeroCard, Function1<? super IacHeroCard, Unit> function1, IacHeroCardDuxo iacHeroCardDuxo, Continuation<? super IacHeroCardComposable2> continuation) {
        super(2, continuation);
        this.$eventLogger = eventLogger;
        this.$eventScreen = screen;
        this.$card = iacHeroCard;
        this.$onCardSeen = function1;
        this.$duxo = iacHeroCardDuxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new IacHeroCardComposable2(this.$eventLogger, this.$eventScreen, this.$card, this.$onCardSeen, this.$duxo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((IacHeroCardComposable2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        EventLogger eventLogger = this.$eventLogger;
        Screen screen = this.$eventScreen;
        IacHeroCard iacHeroCard = this.$card;
        UserInteractionEventData.EventType eventType = UserInteractionEventData.EventType.APPEAR;
        EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, HeroCardLogging.heroCardEventData(screen, iacHeroCard, eventType, HeroCardLogging.getLoggingCard(iacHeroCard)), false, false, 6, null);
        EventLogger eventLogger2 = this.$eventLogger;
        Screen screen2 = this.$eventScreen;
        IacHeroCard iacHeroCard2 = this.$card;
        EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger2, HeroCardLogging.heroCardEventData(screen2, iacHeroCard2, eventType, HeroCardLogging.getLoggingCtaBtn(iacHeroCard2)), false, false, 6, null);
        EventLogger eventLogger3 = this.$eventLogger;
        Screen screen3 = this.$eventScreen;
        IacHeroCard iacHeroCard3 = this.$card;
        EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger3, HeroCardLogging.heroCardEventData(screen3, iacHeroCard3, eventType, HeroCardLogging.getLoggingDismissBtn(iacHeroCard3)), false, false, 6, null);
        this.$onCardSeen.invoke(this.$card);
        this.$duxo.onHeroCardSeen(this.$card);
        return Unit.INSTANCE;
    }
}
