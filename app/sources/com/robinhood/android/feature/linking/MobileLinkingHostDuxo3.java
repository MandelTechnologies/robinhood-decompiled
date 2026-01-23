package com.robinhood.android.feature.linking;

import androidx.compose.p011ui.graphics.Color;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.linking.AuraColors;
import com.robinhood.models.p320db.MarketHours;
import com.robinhood.models.p320db.TradingSession;
import hippo.model.p469v1.BackgroundAuraVariantDto;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples3;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: MobileLinkingHostDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.feature.linking.MobileLinkingHostDuxo$onCreate$1$2$1", m3645f = "MobileLinkingHostDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_SUBTRACT_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.feature.linking.MobileLinkingHostDuxo$onCreate$1$2$1, reason: use source file name */
/* loaded from: classes3.dex */
final class MobileLinkingHostDuxo3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Flow<BackgroundAuraVariantDto> $sharedAuraFlow;
    int label;
    final /* synthetic */ MobileLinkingHostDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    MobileLinkingHostDuxo3(Flow<? extends BackgroundAuraVariantDto> flow, MobileLinkingHostDuxo mobileLinkingHostDuxo, Continuation<? super MobileLinkingHostDuxo3> continuation) {
        super(2, continuation);
        this.$sharedAuraFlow = flow;
        this.this$0 = mobileLinkingHostDuxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MobileLinkingHostDuxo3(this.$sharedAuraFlow, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MobileLinkingHostDuxo3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final Flow flowCombine = FlowKt.combine(this.$sharedAuraFlow, this.this$0.marketHoursManager.getCurrentTradingSession(), Context7.buffer$default(RxConvert.asFlow(this.this$0.marketHoursManager.getCurrentMarketHoursObservable()), Integer.MAX_VALUE, null, 2, null), new C167451(null));
            Flow<Tuples3<? extends BackgroundAuraVariantDto, ? extends TradingSession, ? extends MarketHours>> flow = new Flow<Tuples3<? extends BackgroundAuraVariantDto, ? extends TradingSession, ? extends MarketHours>>() { // from class: com.robinhood.android.feature.linking.MobileLinkingHostDuxo$onCreate$1$2$1$invokeSuspend$$inlined$filter$1
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super Tuples3<? extends BackgroundAuraVariantDto, ? extends TradingSession, ? extends MarketHours>> flowCollector, Continuation continuation) {
                    Object objCollect = flowCombine.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.feature.linking.MobileLinkingHostDuxo$onCreate$1$2$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.feature.linking.MobileLinkingHostDuxo$onCreate$1$2$1$invokeSuspend$$inlined$filter$1$2", m3645f = "MobileLinkingHostDuxo.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.android.feature.linking.MobileLinkingHostDuxo$onCreate$1$2$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        Object L$1;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector) {
                        this.$this_unsafeFlow = flowCollector;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            int i = anonymousClass1.label;
                            if ((i & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                        }
                        Object obj2 = anonymousClass1.result;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i2 = anonymousClass1.label;
                        if (i2 == 0) {
                            ResultKt.throwOnFailure(obj2);
                            FlowCollector flowCollector = this.$this_unsafeFlow;
                            if (((BackgroundAuraVariantDto) ((Tuples3) obj).component1()) == BackgroundAuraVariantDto.BACKGROUND_AURA_VARIANT_TRADING_SESSION) {
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj2);
                        }
                        return Unit.INSTANCE;
                    }
                }
            };
            C167463 c167463 = new C167463(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(flow, c167463, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: MobileLinkingHostDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "Lkotlin/Triple;", "Lhippo/model/v1/BackgroundAuraVariantDto;", "Lcom/robinhood/models/db/TradingSession;", "Lcom/robinhood/models/db/MarketHours;", "aura", "session", "hours"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.feature.linking.MobileLinkingHostDuxo$onCreate$1$2$1$1", m3645f = "MobileLinkingHostDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.feature.linking.MobileLinkingHostDuxo$onCreate$1$2$1$1 */
    static final class C167451 extends ContinuationImpl7 implements Function4<BackgroundAuraVariantDto, TradingSession, MarketHours, Continuation<? super Tuples3<? extends BackgroundAuraVariantDto, ? extends TradingSession, ? extends MarketHours>>, Object> {
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ Object L$2;
        int label;

        C167451(Continuation<? super C167451> continuation) {
            super(4, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(BackgroundAuraVariantDto backgroundAuraVariantDto, TradingSession tradingSession, MarketHours marketHours, Continuation<? super Tuples3<? extends BackgroundAuraVariantDto, ? extends TradingSession, MarketHours>> continuation) {
            C167451 c167451 = new C167451(continuation);
            c167451.L$0 = backgroundAuraVariantDto;
            c167451.L$1 = tradingSession;
            c167451.L$2 = marketHours;
            return c167451.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Object invoke(BackgroundAuraVariantDto backgroundAuraVariantDto, TradingSession tradingSession, MarketHours marketHours, Continuation<? super Tuples3<? extends BackgroundAuraVariantDto, ? extends TradingSession, ? extends MarketHours>> continuation) {
            return invoke2(backgroundAuraVariantDto, tradingSession, marketHours, (Continuation<? super Tuples3<? extends BackgroundAuraVariantDto, ? extends TradingSession, MarketHours>>) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return new Tuples3((BackgroundAuraVariantDto) this.L$0, (TradingSession) this.L$1, (MarketHours) this.L$2);
        }
    }

    /* compiled from: MobileLinkingHostDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0018\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Triple;", "Lhippo/model/v1/BackgroundAuraVariantDto;", "Lcom/robinhood/models/db/TradingSession;", "Lcom/robinhood/models/db/MarketHours;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.feature.linking.MobileLinkingHostDuxo$onCreate$1$2$1$3", m3645f = "MobileLinkingHostDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.feature.linking.MobileLinkingHostDuxo$onCreate$1$2$1$3 */
    static final class C167463 extends ContinuationImpl7 implements Function2<Tuples3<? extends BackgroundAuraVariantDto, ? extends TradingSession, ? extends MarketHours>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ MobileLinkingHostDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C167463(MobileLinkingHostDuxo mobileLinkingHostDuxo, Continuation<? super C167463> continuation) {
            super(2, continuation);
            this.this$0 = mobileLinkingHostDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C167463 c167463 = new C167463(this.this$0, continuation);
            c167463.L$0 = obj;
            return c167463;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Tuples3<? extends BackgroundAuraVariantDto, ? extends TradingSession, ? extends MarketHours> tuples3, Continuation<? super Unit> continuation) {
            return invoke2((Tuples3<? extends BackgroundAuraVariantDto, ? extends TradingSession, MarketHours>) tuples3, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Tuples3<? extends BackgroundAuraVariantDto, ? extends TradingSession, MarketHours> tuples3, Continuation<? super Unit> continuation) {
            return ((C167463) create(tuples3, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            List<Color> marketHourOvernight;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Tuples3 tuples3 = (Tuples3) this.L$0;
            TradingSession tradingSession = (TradingSession) tuples3.component2();
            if (!((MarketHours) tuples3.component3()).isOpen()) {
                marketHourOvernight = AuraColors.INSTANCE.getMarketHourClosed();
            } else if (tradingSession instanceof TradingSession.Regular) {
                marketHourOvernight = AuraColors.INSTANCE.getMarketHourStandard();
            } else if (tradingSession instanceof TradingSession.Extended.PreMarket) {
                marketHourOvernight = AuraColors.INSTANCE.getMarketHourExtendedMorning();
            } else if (tradingSession instanceof TradingSession.Extended.AfterHours) {
                marketHourOvernight = AuraColors.INSTANCE.getMarketHourExtendedEvening();
            } else {
                marketHourOvernight = tradingSession instanceof TradingSession.Overnight ? AuraColors.INSTANCE.getMarketHourOvernight() : null;
            }
            this.this$0.applyMutation(new AnonymousClass1(marketHourOvernight, null));
            return Unit.INSTANCE;
        }

        /* compiled from: MobileLinkingHostDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/feature/linking/MobileLinkingHostState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.feature.linking.MobileLinkingHostDuxo$onCreate$1$2$1$3$1", m3645f = "MobileLinkingHostDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.feature.linking.MobileLinkingHostDuxo$onCreate$1$2$1$3$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<MobileLinkingHostState, Continuation<? super MobileLinkingHostState>, Object> {
            final /* synthetic */ List<Color> $colors;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(List<Color> list, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$colors = list;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$colors, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(MobileLinkingHostState mobileLinkingHostState, Continuation<? super MobileLinkingHostState> continuation) {
                return ((AnonymousClass1) create(mobileLinkingHostState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return MobileLinkingHostState.copy$default((MobileLinkingHostState) this.L$0, null, null, null, this.$colors, 7, null);
            }
        }
    }
}
