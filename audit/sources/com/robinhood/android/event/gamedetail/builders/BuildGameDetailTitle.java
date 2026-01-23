package com.robinhood.android.event.gamedetail.builders;

import com.robinhood.android.event.gamedetail.C16283R;
import com.robinhood.android.eventcontracts.trade.EventStartTimeStringUtil;
import com.robinhood.android.models.event.p186db.predictionmarkets.PredictionMarketEventState;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Clock;
import p479j$.time.Duration;
import p479j$.time.Instant;

/* compiled from: BuildGameDetailTitle.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ)\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J:\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\u00152\u0006\u0010\u0018\u001a\u00020\u00172\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0086\u0002¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/event/gamedetail/builders/StreamLiveDataTitleUseCase;", "", "<init>", "()V", "j$/time/Instant", "gameStartTimestamp", "now", "", "isStartingWithin24Hours", "(Lj$/time/Instant;Lj$/time/Instant;)Z", "Lcom/robinhood/android/models/event/db/predictionmarkets/PredictionMarketEventState;", "eventState", "Lcom/robinhood/utils/resource/StringResource;", "countdownTitle", "Lcom/robinhood/android/event/gamedetail/builders/TitleState;", "buildCountdownTitle", "(Lcom/robinhood/android/models/event/db/predictionmarkets/PredictionMarketEventState;Lj$/time/Instant;Lcom/robinhood/utils/resource/StringResource;)Lcom/robinhood/android/event/gamedetail/builders/TitleState;", "buildPreGameTitle", "(Lcom/robinhood/android/models/event/db/predictionmarkets/PredictionMarketEventState;Lj$/time/Instant;)Lcom/robinhood/android/event/gamedetail/builders/TitleState;", "buildLiveGameTitle", "(Lcom/robinhood/android/models/event/db/predictionmarkets/PredictionMarketEventState;)Lcom/robinhood/android/event/gamedetail/builders/TitleState;", "Lkotlinx/coroutines/flow/Flow;", "eventStateFlow", "j$/time/Clock", Card.Icon.CLOCK, "Lkotlin/Function0;", "", "forceRefreshEventState", "invoke", "(Lkotlinx/coroutines/flow/Flow;Lj$/time/Clock;Lkotlin/jvm/functions/Function0;)Lkotlinx/coroutines/flow/Flow;", "feature-game-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.event.gamedetail.builders.StreamLiveDataTitleUseCase, reason: use source file name */
/* loaded from: classes3.dex */
public final class BuildGameDetailTitle {
    public static final int $stable = 0;

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isStartingWithin24Hours(Instant gameStartTimestamp, Instant now) {
        if (gameStartTimestamp == null) {
            return false;
        }
        Duration durationBetween = Duration.between(now, gameStartTimestamp);
        return !durationBetween.isNegative() && durationBetween.toHours() < 24;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TitleState buildCountdownTitle(PredictionMarketEventState eventState, Instant gameStartTimestamp, StringResource countdownTitle) {
        return new TitleState(StringResource.INSTANCE.invoke(C16283R.string.live_game_toolbar_title_with_countdown, EventStartTimeStringUtil.getEventStartTimeText(gameStartTimestamp, eventState.getGameStartFormat()), countdownTitle), eventState.getGdpTitle());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TitleState buildPreGameTitle(PredictionMarketEventState eventState, Instant gameStartTimestamp) {
        return new TitleState(EventStartTimeStringUtil.getEventStartTimeText(gameStartTimestamp, eventState.getGameStartFormat()), eventState.getGdpTitle());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TitleState buildLiveGameTitle(PredictionMarketEventState eventState) {
        StringResource stringResourceInvoke;
        String edpLiveDataSecondaryLabel = eventState.getEdpLiveDataSecondaryLabel();
        if (edpLiveDataSecondaryLabel != null && !StringsKt.isBlank(edpLiveDataSecondaryLabel)) {
            StringResource.Companion companion = StringResource.INSTANCE;
            int i = C16283R.string.live_game_toolbar_title;
            String edpLiveDataPrimaryLabel = eventState.getEdpLiveDataPrimaryLabel();
            if (edpLiveDataPrimaryLabel == null) {
                edpLiveDataPrimaryLabel = "";
            }
            String edpLiveDataSecondaryLabel2 = eventState.getEdpLiveDataSecondaryLabel();
            stringResourceInvoke = companion.invoke(i, edpLiveDataPrimaryLabel, edpLiveDataSecondaryLabel2 != null ? edpLiveDataSecondaryLabel2 : "");
        } else {
            StringResource.Companion companion2 = StringResource.INSTANCE;
            String edpLiveDataPrimaryLabel2 = eventState.getEdpLiveDataPrimaryLabel();
            stringResourceInvoke = companion2.invoke(edpLiveDataPrimaryLabel2 != null ? edpLiveDataPrimaryLabel2 : "");
        }
        return new TitleState(stringResourceInvoke, eventState.getGdpTitle());
    }

    public final Flow<TitleState> invoke(Flow<PredictionMarketEventState> eventStateFlow, Clock clock, Function0<Unit> forceRefreshEventState) {
        Intrinsics.checkNotNullParameter(eventStateFlow, "eventStateFlow");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(forceRefreshEventState, "forceRefreshEventState");
        return FlowKt.transformLatest(eventStateFlow, new StreamLiveDataTitleUseCase$invoke$$inlined$flatMapLatest$1(null, clock, this, forceRefreshEventState));
    }
}
