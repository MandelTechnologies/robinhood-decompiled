package com.robinhood.android.options.portfolioriskanalyzer.components.position;

import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.OptionCurrentOrNextMarketDates;
import com.robinhood.models.p320db.OptionSettings;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples3;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function4;

/* compiled from: OptionsPortfolioRiskAnalyzerPositionDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "Lkotlin/Triple;", "Lcom/robinhood/models/db/Account;", "Lcom/robinhood/models/db/OptionCurrentOrNextMarketDates;", "Lcom/robinhood/models/db/OptionSettings;", "account", "currentOrNextMarketDates", "optionSettings"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo$computeTradeActionUiState$tradeActionUiStateFlow$1", m3645f = "OptionsPortfolioRiskAnalyzerPositionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.position.OptionsPortfolioRiskAnalyzerPositionDuxo$computeTradeActionUiState$tradeActionUiStateFlow$1 */
/* loaded from: classes11.dex */
final class C23567x29fb763c extends ContinuationImpl7 implements Function4<Account, OptionCurrentOrNextMarketDates, OptionSettings, Continuation<? super Tuples3<? extends Account, ? extends OptionCurrentOrNextMarketDates, ? extends OptionSettings>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;

    C23567x29fb763c(Continuation<? super C23567x29fb763c> continuation) {
        super(4, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Account account, OptionCurrentOrNextMarketDates optionCurrentOrNextMarketDates, OptionSettings optionSettings, Continuation<? super Tuples3<Account, OptionCurrentOrNextMarketDates, OptionSettings>> continuation) {
        C23567x29fb763c c23567x29fb763c = new C23567x29fb763c(continuation);
        c23567x29fb763c.L$0 = account;
        c23567x29fb763c.L$1 = optionCurrentOrNextMarketDates;
        c23567x29fb763c.L$2 = optionSettings;
        return c23567x29fb763c.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Object invoke(Account account, OptionCurrentOrNextMarketDates optionCurrentOrNextMarketDates, OptionSettings optionSettings, Continuation<? super Tuples3<? extends Account, ? extends OptionCurrentOrNextMarketDates, ? extends OptionSettings>> continuation) {
        return invoke2(account, optionCurrentOrNextMarketDates, optionSettings, (Continuation<? super Tuples3<Account, OptionCurrentOrNextMarketDates, OptionSettings>>) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return new Tuples3((Account) this.L$0, (OptionCurrentOrNextMarketDates) this.L$1, (OptionSettings) this.L$2);
    }
}
