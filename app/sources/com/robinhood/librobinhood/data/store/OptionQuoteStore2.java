package com.robinhood.librobinhood.data.store;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.api.options.retrofit.OptionsApi;
import com.robinhood.models.CommaSeparatedList;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.ApiOptionQuote;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: OptionQuoteStore.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/ApiOptionQuote;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionQuoteStore$createListNetworkObservable$1$1$1", m3645f = "OptionQuoteStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.OptionQuoteStore$createListNetworkObservable$1$1$1, reason: use source file name */
/* loaded from: classes13.dex */
final class OptionQuoteStore2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super PaginatedResult<? extends ApiOptionQuote>>, Object> {
    final /* synthetic */ CommaSeparatedList<UUID> $csl;
    final /* synthetic */ String $cursor;
    final /* synthetic */ Boolean $isIndexOptionsExtendedHoursEnabled;
    int label;
    final /* synthetic */ OptionQuoteStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OptionQuoteStore2(OptionQuoteStore optionQuoteStore, CommaSeparatedList<UUID> commaSeparatedList, Boolean bool, String str, Continuation<? super OptionQuoteStore2> continuation) {
        super(2, continuation);
        this.this$0 = optionQuoteStore;
        this.$csl = commaSeparatedList;
        this.$isIndexOptionsExtendedHoursEnabled = bool;
        this.$cursor = str;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OptionQuoteStore2(this.this$0, this.$csl, this.$isIndexOptionsExtendedHoursEnabled, this.$cursor, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super PaginatedResult<? extends ApiOptionQuote>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super PaginatedResult<ApiOptionQuote>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super PaginatedResult<ApiOptionQuote>> continuation) {
        return ((OptionQuoteStore2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        OptionsApi optionsApi = this.this$0.optionsApi;
        CommaSeparatedList<UUID> commaSeparatedList = this.$csl;
        Boolean bool = this.$isIndexOptionsExtendedHoursEnabled;
        Intrinsics.checkNotNull(bool);
        boolean zBooleanValue = bool.booleanValue();
        String str = this.$cursor;
        this.label = 1;
        Object optionQuotes = optionsApi.getOptionQuotes(commaSeparatedList, zBooleanValue, str, this);
        return optionQuotes == coroutine_suspended ? coroutine_suspended : optionQuotes;
    }
}
