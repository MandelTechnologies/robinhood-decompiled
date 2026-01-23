package com.robinhood.android.search.highlights.p249ui.quicklinks;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.SnapshotStateKt;
import com.robinhood.analytics.EventLogger;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import search_coprocessor.p542v1.QuickLinksDto;

/* compiled from: SearchHighlightsQuickLinks.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.search.highlights.ui.quicklinks.SearchHighlightsQuickLinksKt$SearchHighlightsQuickLinks$1$1", m3645f = "SearchHighlightsQuickLinks.kt", m3646l = {53}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.search.highlights.ui.quicklinks.SearchHighlightsQuickLinksKt$SearchHighlightsQuickLinks$1$1, reason: use source file name */
/* loaded from: classes5.dex */
final class SearchHighlightsQuickLinks2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ EventLogger $eventLogger;
    final /* synthetic */ LazyListState $lazyListState;
    final /* synthetic */ QuickLinksDto $quickLinks;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SearchHighlightsQuickLinks2(LazyListState lazyListState, EventLogger eventLogger, QuickLinksDto quickLinksDto, Continuation<? super SearchHighlightsQuickLinks2> continuation) {
        super(2, continuation);
        this.$lazyListState = lazyListState;
        this.$eventLogger = eventLogger;
        this.$quickLinks = quickLinksDto;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SearchHighlightsQuickLinks2(this.$lazyListState, this.$eventLogger, this.$quickLinks, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SearchHighlightsQuickLinks2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final LazyListState lazyListState = this.$lazyListState;
            final Flow flowSnapshotFlow = SnapshotStateKt.snapshotFlow(new Function0() { // from class: com.robinhood.android.search.highlights.ui.quicklinks.SearchHighlightsQuickLinksKt$SearchHighlightsQuickLinks$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Boolean.valueOf(lazyListState.isScrollInProgress());
                }
            });
            Flow<Boolean> flow = new Flow<Boolean>() { // from class: com.robinhood.android.search.highlights.ui.quicklinks.SearchHighlightsQuickLinksKt$SearchHighlightsQuickLinks$1$1$invokeSuspend$$inlined$filter$1

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.search.highlights.ui.quicklinks.SearchHighlightsQuickLinksKt$SearchHighlightsQuickLinks$1$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.search.highlights.ui.quicklinks.SearchHighlightsQuickLinksKt$SearchHighlightsQuickLinks$1$1$invokeSuspend$$inlined$filter$1$2", m3645f = "SearchHighlightsQuickLinks.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.android.search.highlights.ui.quicklinks.SearchHighlightsQuickLinksKt$SearchHighlightsQuickLinks$1$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
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
                            if (((Boolean) obj).booleanValue()) {
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

                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
                    Object objCollect = flowSnapshotFlow.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            };
            C280043 c280043 = new C280043(this.$eventLogger, this.$quickLinks, null);
            this.label = 1;
            if (FlowKt.collectLatest(flow, c280043, this) == coroutine_suspended) {
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

    /* compiled from: SearchHighlightsQuickLinks.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.search.highlights.ui.quicklinks.SearchHighlightsQuickLinksKt$SearchHighlightsQuickLinks$1$1$3", m3645f = "SearchHighlightsQuickLinks.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.search.highlights.ui.quicklinks.SearchHighlightsQuickLinksKt$SearchHighlightsQuickLinks$1$1$3 */
    static final class C280043 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
        final /* synthetic */ EventLogger $eventLogger;
        final /* synthetic */ QuickLinksDto $quickLinks;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C280043(EventLogger eventLogger, QuickLinksDto quickLinksDto, Continuation<? super C280043> continuation) {
            super(2, continuation);
            this.$eventLogger = eventLogger;
            this.$quickLinks = quickLinksDto;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C280043(this.$eventLogger, this.$quickLinks, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return invoke(bool.booleanValue(), continuation);
        }

        public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
            return ((C280043) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            EventLogger.DefaultImpls.logScroll$default(this.$eventLogger, null, new Screen(Screen.Name.BROWSE_SEARCH, null, null, null, 14, null), new Component(null, "RD_SEARCH_QUICK_LINKS_" + this.$quickLinks.getId(), null, 5, null), null, null, 25, null);
            return Unit.INSTANCE;
        }
    }
}
