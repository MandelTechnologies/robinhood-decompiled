package com.robinhood.android.feature.linking;

import androidx.compose.p011ui.graphics.Color;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.linking.AuraColors;
import com.robinhood.librobinhood.data.store.CryptoQuoteStore;
import com.robinhood.models.crypto.p314db.CryptoQuote;
import hippo.model.p469v1.BackgroundAuraVariantDto;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Duration;

/* compiled from: MobileLinkingHostDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.feature.linking.MobileLinkingHostDuxo$onCreate$1$2$3", m3645f = "MobileLinkingHostDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_DARK_APPEARANCE_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.feature.linking.MobileLinkingHostDuxo$onCreate$1$2$3, reason: use source file name */
/* loaded from: classes3.dex */
final class MobileLinkingHostDuxo6 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Flow<BackgroundAuraVariantDto> $sharedAuraFlow;
    int label;
    final /* synthetic */ MobileLinkingHostDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    MobileLinkingHostDuxo6(Flow<? extends BackgroundAuraVariantDto> flow, MobileLinkingHostDuxo mobileLinkingHostDuxo, Continuation<? super MobileLinkingHostDuxo6> continuation) {
        super(2, continuation);
        this.$sharedAuraFlow = flow;
        this.this$0 = mobileLinkingHostDuxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MobileLinkingHostDuxo6(this.$sharedAuraFlow, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MobileLinkingHostDuxo6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Flow<BackgroundAuraVariantDto> flow = this.$sharedAuraFlow;
            CryptoQuoteStore cryptoQuoteStore = this.this$0.cryptoQuoteStore;
            Duration durationOfMillis = Duration.ofMillis(2500L);
            Intrinsics.checkNotNullExpressionValue(durationOfMillis, "ofMillis(...)");
            final Flow flowCombine = FlowKt.combine(flow, cryptoQuoteStore.pollCryptoQuotes(durationOfMillis).asFlow(CollectionsKt.listOf(UUID.fromString("3d961844-d360-45fc-989b-f6fca761d511"))), new C167491(null));
            final Flow<Tuples2<? extends BackgroundAuraVariantDto, ? extends List<? extends CryptoQuote>>> flow2 = new Flow<Tuples2<? extends BackgroundAuraVariantDto, ? extends List<? extends CryptoQuote>>>() { // from class: com.robinhood.android.feature.linking.MobileLinkingHostDuxo$onCreate$1$2$3$invokeSuspend$$inlined$filter$1
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super Tuples2<? extends BackgroundAuraVariantDto, ? extends List<? extends CryptoQuote>>> flowCollector, Continuation continuation) {
                    Object objCollect = flowCombine.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.feature.linking.MobileLinkingHostDuxo$onCreate$1$2$3$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.feature.linking.MobileLinkingHostDuxo$onCreate$1$2$3$invokeSuspend$$inlined$filter$1$2", m3645f = "MobileLinkingHostDuxo.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.android.feature.linking.MobileLinkingHostDuxo$onCreate$1$2$3$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
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
                            if (((BackgroundAuraVariantDto) ((Tuples2) obj).component1()) == BackgroundAuraVariantDto.BACKGROUND_AURA_VARIANT_BTC_PERFORMANCE) {
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
            Flow<Boolean> flow3 = new Flow<Boolean>() { // from class: com.robinhood.android.feature.linking.MobileLinkingHostDuxo$onCreate$1$2$3$invokeSuspend$$inlined$map$1
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
                    Object objCollect = flow2.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.feature.linking.MobileLinkingHostDuxo$onCreate$1$2$3$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.feature.linking.MobileLinkingHostDuxo$onCreate$1$2$3$invokeSuspend$$inlined$map$1$2", m3645f = "MobileLinkingHostDuxo.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.android.feature.linking.MobileLinkingHostDuxo$onCreate$1$2$3$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
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
                        Boolean boolBoxBoolean;
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
                            CryptoQuote cryptoQuote = (CryptoQuote) CollectionsKt.getOrNull((List) ((Tuples2) obj).component2(), 0);
                            if (cryptoQuote != null) {
                                boolBoxBoolean = boxing.boxBoolean(cryptoQuote.getAskPrice().getDecimalValue().compareTo(cryptoQuote.getOpenPrice().getDecimalValue()) >= 0);
                            } else {
                                boolBoxBoolean = null;
                            }
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(boolBoxBoolean, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
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
            C167504 c167504 = new C167504(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(flow3, c167504, this) == coroutine_suspended) {
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
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00012\u0006\u0010\u0005\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "Lkotlin/Pair;", "Lhippo/model/v1/BackgroundAuraVariantDto;", "", "Lcom/robinhood/models/crypto/db/CryptoQuote;", "aura", "quotes"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.feature.linking.MobileLinkingHostDuxo$onCreate$1$2$3$1", m3645f = "MobileLinkingHostDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.feature.linking.MobileLinkingHostDuxo$onCreate$1$2$3$1 */
    static final class C167491 extends ContinuationImpl7 implements Function3<BackgroundAuraVariantDto, List<? extends CryptoQuote>, Continuation<? super Tuples2<? extends BackgroundAuraVariantDto, ? extends List<? extends CryptoQuote>>>, Object> {
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        C167491(Continuation<? super C167491> continuation) {
            super(3, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(BackgroundAuraVariantDto backgroundAuraVariantDto, List<CryptoQuote> list, Continuation<? super Tuples2<? extends BackgroundAuraVariantDto, ? extends List<CryptoQuote>>> continuation) {
            C167491 c167491 = new C167491(continuation);
            c167491.L$0 = backgroundAuraVariantDto;
            c167491.L$1 = list;
            return c167491.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(BackgroundAuraVariantDto backgroundAuraVariantDto, List<? extends CryptoQuote> list, Continuation<? super Tuples2<? extends BackgroundAuraVariantDto, ? extends List<? extends CryptoQuote>>> continuation) {
            return invoke2(backgroundAuraVariantDto, (List<CryptoQuote>) list, (Continuation<? super Tuples2<? extends BackgroundAuraVariantDto, ? extends List<CryptoQuote>>>) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Tuples4.m3642to((BackgroundAuraVariantDto) this.L$0, (List) this.L$1);
        }
    }

    /* compiled from: MobileLinkingHostDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "isUp", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.feature.linking.MobileLinkingHostDuxo$onCreate$1$2$3$4", m3645f = "MobileLinkingHostDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.feature.linking.MobileLinkingHostDuxo$onCreate$1$2$3$4 */
    static final class C167504 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ MobileLinkingHostDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C167504(MobileLinkingHostDuxo mobileLinkingHostDuxo, Continuation<? super C167504> continuation) {
            super(2, continuation);
            this.this$0 = mobileLinkingHostDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C167504 c167504 = new C167504(this.this$0, continuation);
            c167504.L$0 = obj;
            return c167504;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return ((C167504) create(bool, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            List<Color> down;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Boolean bool = (Boolean) this.L$0;
            if (Intrinsics.areEqual(bool, boxing.boxBoolean(true))) {
                down = AuraColors.INSTANCE.getUp();
            } else if (Intrinsics.areEqual(bool, boxing.boxBoolean(false))) {
                down = AuraColors.INSTANCE.getDown();
            } else {
                if (bool != null) {
                    throw new NoWhenBranchMatchedException();
                }
                down = null;
            }
            this.this$0.applyMutation(new AnonymousClass1(down, null));
            return Unit.INSTANCE;
        }

        /* compiled from: MobileLinkingHostDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/feature/linking/MobileLinkingHostState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.feature.linking.MobileLinkingHostDuxo$onCreate$1$2$3$4$1", m3645f = "MobileLinkingHostDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.feature.linking.MobileLinkingHostDuxo$onCreate$1$2$3$4$1, reason: invalid class name */
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
