package com.robinhood.android.options.portfolioriskanalyzer.components.search;

import androidx.compose.p011ui.focus.FocusRequester;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;

/* compiled from: OptionsPortfolioRiskAnalyzerSearchPageComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchPageComposableKt$SearchBarComposable$4$2$1", m3645f = "OptionsPortfolioRiskAnalyzerSearchPageComposable.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchPageComposableKt$SearchBarComposable$4$2$1, reason: use source file name */
/* loaded from: classes11.dex */
final class OptionsPortfolioRiskAnalyzerSearchPageComposable7 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FocusRequester $focusRequester;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OptionsPortfolioRiskAnalyzerSearchPageComposable7(FocusRequester focusRequester, Continuation<? super OptionsPortfolioRiskAnalyzerSearchPageComposable7> continuation) {
        super(2, continuation);
        this.$focusRequester = focusRequester;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OptionsPortfolioRiskAnalyzerSearchPageComposable7 optionsPortfolioRiskAnalyzerSearchPageComposable7 = new OptionsPortfolioRiskAnalyzerSearchPageComposable7(this.$focusRequester, continuation);
        optionsPortfolioRiskAnalyzerSearchPageComposable7.L$0 = obj;
        return optionsPortfolioRiskAnalyzerSearchPageComposable7;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OptionsPortfolioRiskAnalyzerSearchPageComposable7) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        final CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        Job job = JobKt.getJob(coroutineScope.getCoroutineContext());
        final FocusRequester focusRequester = this.$focusRequester;
        job.invokeOnCompletion(new Function1() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchPageComposableKt$SearchBarComposable$4$2$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return OptionsPortfolioRiskAnalyzerSearchPageComposable7.invokeSuspend$lambda$1(coroutineScope, focusRequester, (Throwable) obj2);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1(CoroutineScope coroutineScope, FocusRequester focusRequester, Throwable th) {
        try {
            Result.Companion companion = Result.INSTANCE;
            Result.m28550constructorimpl(Boolean.valueOf(FocusRequester.m6497requestFocus3ESFkO8$default(focusRequester, 0, 1, null)));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m28550constructorimpl(ResultKt.createFailure(th2));
        }
        return Unit.INSTANCE;
    }
}
