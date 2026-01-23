package com.robinhood.android.equitytradeladder.marketing;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.regiongate.EtfRegionGate;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.search.contracts.SearchSelector;
import com.robinhood.android.search.contracts.SearchSelectorLaunchMode;
import com.robinhood.models.api.search.SearchContentType;
import com.robinhood.rosetta.eventlogging.Screen;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: EquityTradingLadderMarketingFragment.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.marketing.EquityTradingLaderMarketingFragment$ComposeContent$1$1$1$1", m3645f = "EquityTradingLadderMarketingFragment.kt", m3646l = {65}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.equitytradeladder.marketing.EquityTradingLaderMarketingFragment$ComposeContent$1$1$1$1, reason: use source file name */
/* loaded from: classes3.dex */
final class EquityTradingLadderMarketingFragment4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ EquityTradingLadderMarketingFragment3 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EquityTradingLadderMarketingFragment4(EquityTradingLadderMarketingFragment3 equityTradingLadderMarketingFragment3, Continuation<? super EquityTradingLadderMarketingFragment4> continuation) {
        super(2, continuation);
        this.this$0 = equityTradingLadderMarketingFragment3;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EquityTradingLadderMarketingFragment4(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EquityTradingLadderMarketingFragment4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object regionGateState$default;
        List listListOf;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            RegionGateProvider regionGateProvider = this.this$0.getRegionGateProvider();
            EtfRegionGate etfRegionGate = EtfRegionGate.INSTANCE;
            this.label = 1;
            regionGateState$default = RegionGateProvider.DefaultImpls.getRegionGateState$default(regionGateProvider, etfRegionGate, false, this, 2, null);
            if (regionGateState$default == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            regionGateState$default = obj;
        }
        if (((Boolean) regionGateState$default).booleanValue()) {
            listListOf = CollectionsKt.listOf((Object[]) new SearchContentType[]{SearchContentType.INSTRUMENTS, SearchContentType.MARKET_INDEXES});
        } else {
            listListOf = CollectionsKt.listOf(SearchContentType.INSTRUMENTS);
        }
        Navigator navigator = this.this$0.getNavigator();
        Context contextRequireContext = this.this$0.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, contextRequireContext, new SearchSelector(new SearchSelectorLaunchMode.Ladder(listListOf), new Screen(Screen.Name.LADDER_MARKETING_SEARCH, ((EquityTradeLadderMarketingFragmentKey) EquityTradingLadderMarketingFragment3.INSTANCE.getArgs((Fragment) this.this$0)).getSource(), null, null, 12, null), null, 4, null), false, false, false, false, null, true, null, null, 892, null);
        return Unit.INSTANCE;
    }
}
