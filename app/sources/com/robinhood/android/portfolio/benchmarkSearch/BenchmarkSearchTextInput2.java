package com.robinhood.android.portfolio.benchmarkSearch;

import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.models.portfolio.BenchmarkingSearchResults;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: BenchmarkSearchTextInput.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchTextInputKt$BenchmarkSearchTextInput$1$1", m3645f = "BenchmarkSearchTextInput.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchTextInputKt$BenchmarkSearchTextInput$1$1, reason: use source file name */
/* loaded from: classes11.dex */
final class BenchmarkSearchTextInput2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $eventContext;
    final /* synthetic */ UserInteractionEventDescriptor $eventDescriptor;
    final /* synthetic */ EventLogger $eventLogger;
    final /* synthetic */ BenchmarkingSearchResults $searchResults;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BenchmarkSearchTextInput2(BenchmarkingSearchResults benchmarkingSearchResults, EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, Context context, Continuation<? super BenchmarkSearchTextInput2> continuation) {
        super(2, continuation);
        this.$searchResults = benchmarkingSearchResults;
        this.$eventLogger = eventLogger;
        this.$eventDescriptor = userInteractionEventDescriptor;
        this.$eventContext = context;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BenchmarkSearchTextInput2(this.$searchResults, this.$eventLogger, this.$eventDescriptor, this.$eventContext, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BenchmarkSearchTextInput2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (!StringsKt.isBlank(this.$searchResults.getQuery())) {
            EventLogger.DefaultImpls.logType$default(this.$eventLogger, UserInteractionEventData.Action.TYPE_SEARCH_QUERY, this.$eventDescriptor.getScreen(), new Component(Component.ComponentType.SEARCH_BAR, BenchmarkSearchTextInput.RETURNS_COMPARISON_SEARCH_IDENTIFIER, null, 4, null), null, this.$eventContext, 8, null);
        }
        return Unit.INSTANCE;
    }
}
