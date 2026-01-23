package com.robinhood.android.markethours.util;

import com.plaid.internal.EnumC7081g;
import com.robinhood.models.p320db.EquityOrderSession;
import com.robinhood.models.p320db.MarketHours;
import com.robinhood.models.p320db.OrderMarketHours;
import com.robinhood.models.p320db.SessionBehavior;
import com.robinhood.models.p320db.TradingSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples3;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import kotlinx.coroutines.flow.FlowCollector;
import p479j$.time.Instant;

/* compiled from: TraderMarketHoursManager.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/robinhood/models/db/TradingSession;", "<destruct>", "Lkotlin/Triple;", "Lcom/robinhood/models/db/MarketHours;", "Lcom/robinhood/models/db/EquityOrderSession;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.markethours.util.TraderMarketHoursManager$_currentTradingSession$2", m3645f = "TraderMarketHoursManager.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_DARK_APPEARANCE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_2_VALUE, EnumC7081g.SDK_ASSET_ICON_EXTERNAL_VALUE, 202, EnumC7081g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S2_VALUE, EnumC7081g.SDK_ASSET_ICON_PRODUCT_IDV_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.markethours.util.TraderMarketHoursManager$_currentTradingSession$2, reason: use source file name */
/* loaded from: classes8.dex */
final class TraderMarketHoursManager3 extends ContinuationImpl7 implements Function3<FlowCollector<? super TradingSession>, Tuples3<? extends MarketHours, ? extends MarketHours, ? extends EquityOrderSession>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ TraderMarketHoursManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TraderMarketHoursManager3(TraderMarketHoursManager traderMarketHoursManager, Continuation<? super TraderMarketHoursManager3> continuation) {
        super(3, continuation);
        this.this$0 = traderMarketHoursManager;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super TradingSession> flowCollector, Tuples3<? extends MarketHours, ? extends MarketHours, ? extends EquityOrderSession> tuples3, Continuation<? super Unit> continuation) {
        return invoke2(flowCollector, (Tuples3<MarketHours, MarketHours, EquityOrderSession>) tuples3, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(FlowCollector<? super TradingSession> flowCollector, Tuples3<MarketHours, MarketHours, EquityOrderSession> tuples3, Continuation<? super Unit> continuation) {
        TraderMarketHoursManager3 traderMarketHoursManager3 = new TraderMarketHoursManager3(this.this$0, continuation);
        traderMarketHoursManager3.L$0 = flowCollector;
        traderMarketHoursManager3.L$1 = tuples3;
        return traderMarketHoursManager3.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x031e, code lost:
    
        if (r9.delayUntilNearestTime(r1, r14) == r0) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x034f, code lost:
    
        if (r15.emit(r2, r14) == r0) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0158, code lost:
    
        if (r9.delayUntilNearestTime(r1, r14) == r0) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x015c, code lost:
    
        r1 = r6;
        r6 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01f1, code lost:
    
        if (r9.delayUntilNearestTime(r1, r14) == r0) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0287, code lost:
    
        if (r9.delayUntilNearestTime(r1, r14) == r0) goto L109;
     */
    /* JADX WARN: Path cross not found for [B:21:0x00fe, B:31:0x0137], limit reached: 118 */
    /* JADX WARN: Path cross not found for [B:31:0x0137, B:21:0x00fe], limit reached: 118 */
    /* JADX WARN: Path cross not found for [B:44:0x0196, B:54:0x01cf], limit reached: 118 */
    /* JADX WARN: Path cross not found for [B:54:0x01cf, B:44:0x0196], limit reached: 118 */
    /* JADX WARN: Path cross not found for [B:66:0x022c, B:76:0x0265], limit reached: 118 */
    /* JADX WARN: Path cross not found for [B:76:0x0265, B:66:0x022c], limit reached: 118 */
    /* JADX WARN: Path cross not found for [B:88:0x02c2, B:98:0x02fb], limit reached: 118 */
    /* JADX WARN: Path cross not found for [B:98:0x02fb, B:88:0x02c2], limit reached: 118 */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02c2  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0158 -> B:35:0x015c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x01f1 -> B:35:0x015c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x0287 -> B:35:0x015c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:85:0x02a4 -> B:86:0x02a8). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        MarketHours marketHours;
        MarketHours marketHours2;
        EquityOrderSession equityOrderSession;
        TradingSession tradingSession;
        EquityOrderSession equityOrderSession2;
        MarketHours marketHours3;
        TradingSession tradingSession2;
        TradingSession tradingSession3;
        Map<OrderMarketHours, SessionBehavior> currentShortSellSessions;
        Instant[] instantArr;
        Map<OrderMarketHours, SessionBehavior> currentShortSellSessions2;
        Instant[] instantArr2;
        Map<OrderMarketHours, SessionBehavior> currentShortSellSessions3;
        Instant[] instantArr3;
        TradingSession currentTradingSession;
        Map<OrderMarketHours, SessionBehavior> currentSessionBehaviors;
        TradingSession tradingSession4;
        Map<OrderMarketHours, SessionBehavior> currentShortSellSessions4;
        Instant[] instantArr4;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                flowCollector = (FlowCollector) this.L$0;
                Tuples3 tuples3 = (Tuples3) this.L$1;
                marketHours = (MarketHours) tuples3.component1();
                marketHours2 = (MarketHours) tuples3.component2();
                equityOrderSession = (EquityOrderSession) tuples3.component3();
                currentTradingSession = this.this$0.getCurrentTradingSession(marketHours, marketHours2, equityOrderSession);
                if (currentTradingSession instanceof TradingSession.Overnight) {
                    this.L$0 = flowCollector;
                    this.L$1 = marketHours;
                    this.L$2 = marketHours2;
                    this.L$3 = equityOrderSession;
                    this.L$4 = currentTradingSession;
                    this.label = 1;
                    if (flowCollector.emit(currentTradingSession, this) != coroutine_suspended) {
                        MarketHours marketHours4 = marketHours;
                        equityOrderSession2 = equityOrderSession;
                        tradingSession = currentTradingSession;
                        marketHours3 = marketHours4;
                        TraderMarketHoursManager traderMarketHoursManager = this.this$0;
                        SpreadBuilder spreadBuilder = new SpreadBuilder(3);
                        TradingSession.Overnight overnight = (TradingSession.Overnight) tradingSession;
                        spreadBuilder.add(overnight.getCurrentMarketHours().getRegularOpensAt());
                        spreadBuilder.add(overnight.getCurrentMarketHours().getExtendedOpensAt());
                        currentShortSellSessions3 = overnight.getCurrentShortSellSessions();
                        if (currentShortSellSessions3 != null) {
                            ArrayList arrayList = new ArrayList(currentShortSellSessions3.size());
                            Iterator<Map.Entry<OrderMarketHours, SessionBehavior>> it = currentShortSellSessions3.entrySet().iterator();
                            while (it.hasNext()) {
                                SessionBehavior value = it.next().getValue();
                                arrayList.add(value != null ? value.getEndTime() : null);
                            }
                            instantArr3 = (Instant[]) arrayList.toArray(new Instant[0]);
                            if (instantArr3 == null) {
                            }
                            spreadBuilder.addSpread(instantArr3);
                            Instant[] instantArr5 = (Instant[]) spreadBuilder.toArray(new Instant[spreadBuilder.size()]);
                            this.L$0 = flowCollector;
                            this.L$1 = marketHours3;
                            this.L$2 = marketHours2;
                            this.L$3 = equityOrderSession2;
                            this.L$4 = null;
                            this.label = 2;
                            break;
                        }
                        instantArr3 = new Instant[0];
                        spreadBuilder.addSpread(instantArr3);
                        Instant[] instantArr52 = (Instant[]) spreadBuilder.toArray(new Instant[spreadBuilder.size()]);
                        this.L$0 = flowCollector;
                        this.L$1 = marketHours3;
                        this.L$2 = marketHours2;
                        this.L$3 = equityOrderSession2;
                        this.L$4 = null;
                        this.label = 2;
                    }
                } else if (currentTradingSession instanceof TradingSession.Extended.PreMarket) {
                    this.L$0 = flowCollector;
                    this.L$1 = marketHours;
                    this.L$2 = marketHours2;
                    this.L$3 = equityOrderSession;
                    this.L$4 = currentTradingSession;
                    this.label = 3;
                    if (flowCollector.emit(currentTradingSession, this) != coroutine_suspended) {
                        MarketHours marketHours5 = marketHours;
                        equityOrderSession2 = equityOrderSession;
                        tradingSession2 = currentTradingSession;
                        marketHours3 = marketHours5;
                        TraderMarketHoursManager traderMarketHoursManager2 = this.this$0;
                        SpreadBuilder spreadBuilder2 = new SpreadBuilder(2);
                        TradingSession.Extended.PreMarket preMarket = (TradingSession.Extended.PreMarket) tradingSession2;
                        spreadBuilder2.add(preMarket.getCurrentMarketHours().getRegularOpensAt());
                        currentShortSellSessions2 = preMarket.getCurrentShortSellSessions();
                        if (currentShortSellSessions2 != null) {
                            ArrayList arrayList2 = new ArrayList(currentShortSellSessions2.size());
                            Iterator<Map.Entry<OrderMarketHours, SessionBehavior>> it2 = currentShortSellSessions2.entrySet().iterator();
                            while (it2.hasNext()) {
                                SessionBehavior value2 = it2.next().getValue();
                                arrayList2.add(value2 != null ? value2.getEndTime() : null);
                            }
                            instantArr2 = (Instant[]) arrayList2.toArray(new Instant[0]);
                            if (instantArr2 == null) {
                            }
                            spreadBuilder2.addSpread(instantArr2);
                            Instant[] instantArr6 = (Instant[]) spreadBuilder2.toArray(new Instant[spreadBuilder2.size()]);
                            this.L$0 = flowCollector;
                            this.L$1 = marketHours3;
                            this.L$2 = marketHours2;
                            this.L$3 = equityOrderSession2;
                            this.L$4 = null;
                            this.label = 4;
                            break;
                        }
                        instantArr2 = new Instant[0];
                        spreadBuilder2.addSpread(instantArr2);
                        Instant[] instantArr62 = (Instant[]) spreadBuilder2.toArray(new Instant[spreadBuilder2.size()]);
                        this.L$0 = flowCollector;
                        this.L$1 = marketHours3;
                        this.L$2 = marketHours2;
                        this.L$3 = equityOrderSession2;
                        this.L$4 = null;
                        this.label = 4;
                    }
                } else if (currentTradingSession instanceof TradingSession.Regular) {
                    this.L$0 = flowCollector;
                    this.L$1 = marketHours;
                    this.L$2 = marketHours2;
                    this.L$3 = equityOrderSession;
                    this.L$4 = currentTradingSession;
                    this.label = 5;
                    if (flowCollector.emit(currentTradingSession, this) != coroutine_suspended) {
                        MarketHours marketHours6 = marketHours;
                        equityOrderSession2 = equityOrderSession;
                        tradingSession3 = currentTradingSession;
                        marketHours3 = marketHours6;
                        TraderMarketHoursManager traderMarketHoursManager3 = this.this$0;
                        SpreadBuilder spreadBuilder3 = new SpreadBuilder(2);
                        TradingSession.Regular regular = (TradingSession.Regular) tradingSession3;
                        spreadBuilder3.add(regular.getCurrentMarketHours().getRegularClosesAt());
                        currentShortSellSessions = regular.getCurrentShortSellSessions();
                        if (currentShortSellSessions != null) {
                            ArrayList arrayList3 = new ArrayList(currentShortSellSessions.size());
                            Iterator<Map.Entry<OrderMarketHours, SessionBehavior>> it3 = currentShortSellSessions.entrySet().iterator();
                            while (it3.hasNext()) {
                                SessionBehavior value3 = it3.next().getValue();
                                arrayList3.add(value3 != null ? value3.getEndTime() : null);
                            }
                            instantArr = (Instant[]) arrayList3.toArray(new Instant[0]);
                            if (instantArr == null) {
                            }
                            spreadBuilder3.addSpread(instantArr);
                            Instant[] instantArr7 = (Instant[]) spreadBuilder3.toArray(new Instant[spreadBuilder3.size()]);
                            this.L$0 = flowCollector;
                            this.L$1 = marketHours3;
                            this.L$2 = marketHours2;
                            this.L$3 = equityOrderSession2;
                            this.L$4 = null;
                            this.label = 6;
                            break;
                        }
                        instantArr = new Instant[0];
                        spreadBuilder3.addSpread(instantArr);
                        Instant[] instantArr72 = (Instant[]) spreadBuilder3.toArray(new Instant[spreadBuilder3.size()]);
                        this.L$0 = flowCollector;
                        this.L$1 = marketHours3;
                        this.L$2 = marketHours2;
                        this.L$3 = equityOrderSession2;
                        this.L$4 = null;
                        this.label = 6;
                    }
                } else if (currentTradingSession instanceof TradingSession.Extended.AfterHours) {
                    this.L$0 = flowCollector;
                    this.L$1 = marketHours;
                    this.L$2 = marketHours2;
                    this.L$3 = equityOrderSession;
                    this.L$4 = currentTradingSession;
                    this.label = 7;
                    if (flowCollector.emit(currentTradingSession, this) != coroutine_suspended) {
                        MarketHours marketHours7 = marketHours;
                        equityOrderSession2 = equityOrderSession;
                        tradingSession4 = currentTradingSession;
                        marketHours3 = marketHours7;
                        TraderMarketHoursManager traderMarketHoursManager4 = this.this$0;
                        SpreadBuilder spreadBuilder4 = new SpreadBuilder(2);
                        TradingSession.Extended.AfterHours afterHours = (TradingSession.Extended.AfterHours) tradingSession4;
                        spreadBuilder4.add(afterHours.getCurrentMarketHours().getExtendedClosesAt());
                        currentShortSellSessions4 = afterHours.getCurrentShortSellSessions();
                        if (currentShortSellSessions4 != null) {
                            ArrayList arrayList4 = new ArrayList(currentShortSellSessions4.size());
                            Iterator<Map.Entry<OrderMarketHours, SessionBehavior>> it4 = currentShortSellSessions4.entrySet().iterator();
                            while (it4.hasNext()) {
                                SessionBehavior value4 = it4.next().getValue();
                                arrayList4.add(value4 != null ? value4.getEndTime() : null);
                            }
                            instantArr4 = (Instant[]) arrayList4.toArray(new Instant[0]);
                            if (instantArr4 == null) {
                            }
                            spreadBuilder4.addSpread(instantArr4);
                            Instant[] instantArr8 = (Instant[]) spreadBuilder4.toArray(new Instant[spreadBuilder4.size()]);
                            this.L$0 = flowCollector;
                            this.L$1 = marketHours3;
                            this.L$2 = marketHours2;
                            this.L$3 = equityOrderSession2;
                            this.L$4 = null;
                            this.label = 8;
                            break;
                        }
                        instantArr4 = new Instant[0];
                        spreadBuilder4.addSpread(instantArr4);
                        Instant[] instantArr82 = (Instant[]) spreadBuilder4.toArray(new Instant[spreadBuilder4.size()]);
                        this.L$0 = flowCollector;
                        this.L$1 = marketHours3;
                        this.L$2 = marketHours2;
                        this.L$3 = equityOrderSession2;
                        this.L$4 = null;
                        this.label = 8;
                    }
                } else {
                    if (currentTradingSession != null) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (equityOrderSession != null) {
                        Instant instant = this.this$0.clock.instant();
                        Intrinsics.checkNotNullExpressionValue(instant, "instant(...)");
                        currentSessionBehaviors = equityOrderSession.getCurrentSessionBehaviors(instant);
                    } else {
                        currentSessionBehaviors = null;
                    }
                    TradingSession.Overnight overnight2 = new TradingSession.Overnight(marketHours, marketHours2, currentSessionBehaviors);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.label = 9;
                    break;
                }
                return coroutine_suspended;
            case 1:
                tradingSession = (TradingSession) this.L$4;
                equityOrderSession2 = (EquityOrderSession) this.L$3;
                marketHours2 = (MarketHours) this.L$2;
                marketHours3 = (MarketHours) this.L$1;
                FlowCollector flowCollector2 = (FlowCollector) this.L$0;
                ResultKt.throwOnFailure(obj);
                flowCollector = flowCollector2;
                TraderMarketHoursManager traderMarketHoursManager5 = this.this$0;
                SpreadBuilder spreadBuilder5 = new SpreadBuilder(3);
                TradingSession.Overnight overnight3 = (TradingSession.Overnight) tradingSession;
                spreadBuilder5.add(overnight3.getCurrentMarketHours().getRegularOpensAt());
                spreadBuilder5.add(overnight3.getCurrentMarketHours().getExtendedOpensAt());
                currentShortSellSessions3 = overnight3.getCurrentShortSellSessions();
                if (currentShortSellSessions3 != null) {
                }
                instantArr3 = new Instant[0];
                spreadBuilder5.addSpread(instantArr3);
                Instant[] instantArr522 = (Instant[]) spreadBuilder5.toArray(new Instant[spreadBuilder5.size()]);
                this.L$0 = flowCollector;
                this.L$1 = marketHours3;
                this.L$2 = marketHours2;
                this.L$3 = equityOrderSession2;
                this.L$4 = null;
                this.label = 2;
                break;
            case 2:
            case 4:
            case 6:
            case 8:
                equityOrderSession = (EquityOrderSession) this.L$3;
                MarketHours marketHours8 = (MarketHours) this.L$2;
                MarketHours marketHours9 = (MarketHours) this.L$1;
                FlowCollector flowCollector3 = (FlowCollector) this.L$0;
                ResultKt.throwOnFailure(obj);
                marketHours2 = marketHours8;
                marketHours = marketHours9;
                flowCollector = flowCollector3;
                currentTradingSession = this.this$0.getCurrentTradingSession(marketHours, marketHours2, equityOrderSession);
                if (currentTradingSession instanceof TradingSession.Overnight) {
                }
                return coroutine_suspended;
            case 3:
                tradingSession2 = (TradingSession) this.L$4;
                equityOrderSession2 = (EquityOrderSession) this.L$3;
                marketHours2 = (MarketHours) this.L$2;
                marketHours3 = (MarketHours) this.L$1;
                FlowCollector flowCollector4 = (FlowCollector) this.L$0;
                ResultKt.throwOnFailure(obj);
                flowCollector = flowCollector4;
                TraderMarketHoursManager traderMarketHoursManager22 = this.this$0;
                SpreadBuilder spreadBuilder22 = new SpreadBuilder(2);
                TradingSession.Extended.PreMarket preMarket2 = (TradingSession.Extended.PreMarket) tradingSession2;
                spreadBuilder22.add(preMarket2.getCurrentMarketHours().getRegularOpensAt());
                currentShortSellSessions2 = preMarket2.getCurrentShortSellSessions();
                if (currentShortSellSessions2 != null) {
                }
                instantArr2 = new Instant[0];
                spreadBuilder22.addSpread(instantArr2);
                Instant[] instantArr622 = (Instant[]) spreadBuilder22.toArray(new Instant[spreadBuilder22.size()]);
                this.L$0 = flowCollector;
                this.L$1 = marketHours3;
                this.L$2 = marketHours2;
                this.L$3 = equityOrderSession2;
                this.L$4 = null;
                this.label = 4;
                break;
            case 5:
                tradingSession3 = (TradingSession) this.L$4;
                equityOrderSession2 = (EquityOrderSession) this.L$3;
                marketHours2 = (MarketHours) this.L$2;
                marketHours3 = (MarketHours) this.L$1;
                FlowCollector flowCollector5 = (FlowCollector) this.L$0;
                ResultKt.throwOnFailure(obj);
                flowCollector = flowCollector5;
                TraderMarketHoursManager traderMarketHoursManager32 = this.this$0;
                SpreadBuilder spreadBuilder32 = new SpreadBuilder(2);
                TradingSession.Regular regular2 = (TradingSession.Regular) tradingSession3;
                spreadBuilder32.add(regular2.getCurrentMarketHours().getRegularClosesAt());
                currentShortSellSessions = regular2.getCurrentShortSellSessions();
                if (currentShortSellSessions != null) {
                }
                instantArr = new Instant[0];
                spreadBuilder32.addSpread(instantArr);
                Instant[] instantArr722 = (Instant[]) spreadBuilder32.toArray(new Instant[spreadBuilder32.size()]);
                this.L$0 = flowCollector;
                this.L$1 = marketHours3;
                this.L$2 = marketHours2;
                this.L$3 = equityOrderSession2;
                this.L$4 = null;
                this.label = 6;
                break;
            case 7:
                tradingSession4 = (TradingSession) this.L$4;
                equityOrderSession2 = (EquityOrderSession) this.L$3;
                marketHours2 = (MarketHours) this.L$2;
                marketHours3 = (MarketHours) this.L$1;
                FlowCollector flowCollector6 = (FlowCollector) this.L$0;
                ResultKt.throwOnFailure(obj);
                flowCollector = flowCollector6;
                TraderMarketHoursManager traderMarketHoursManager42 = this.this$0;
                SpreadBuilder spreadBuilder42 = new SpreadBuilder(2);
                TradingSession.Extended.AfterHours afterHours2 = (TradingSession.Extended.AfterHours) tradingSession4;
                spreadBuilder42.add(afterHours2.getCurrentMarketHours().getExtendedClosesAt());
                currentShortSellSessions4 = afterHours2.getCurrentShortSellSessions();
                if (currentShortSellSessions4 != null) {
                }
                instantArr4 = new Instant[0];
                spreadBuilder42.addSpread(instantArr4);
                Instant[] instantArr822 = (Instant[]) spreadBuilder42.toArray(new Instant[spreadBuilder42.size()]);
                this.L$0 = flowCollector;
                this.L$1 = marketHours3;
                this.L$2 = marketHours2;
                this.L$3 = equityOrderSession2;
                this.L$4 = null;
                this.label = 8;
                break;
            case 9:
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
