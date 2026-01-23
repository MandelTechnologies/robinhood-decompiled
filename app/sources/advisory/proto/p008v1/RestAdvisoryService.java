package advisory.proto.p008v1;

import com.plaid.internal.EnumC7081g;
import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import com.robinhood.idl.Response2;
import com.robinhood.idl.RhGenerated;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.internal.Intrinsics;
import rosetta.account.BrokerageAccountTypeDto;
import yoda.service.insight.InsightTypeDto;

/* compiled from: RestAdvisoryService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000\u0080\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ$\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0096@¢\u0006\u0004\b\t\u0010\rJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bH\u0096@¢\u0006\u0004\b\u0010\u0010\rJ\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J$\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00120\u000bH\u0096@¢\u0006\u0004\b\u0014\u0010\rJ\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00160\u000bH\u0096@¢\u0006\u0004\b\u0018\u0010\rJ\u0018\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0007\u001a\u00020\u001aH\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ$\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000bH\u0096@¢\u0006\u0004\b\u001c\u0010\rJ\u0018\u0010 \u001a\u00020\u001f2\u0006\u0010\u0007\u001a\u00020\u001eH\u0096@¢\u0006\u0004\b \u0010!J$\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u001e0\u000bH\u0096@¢\u0006\u0004\b \u0010\rJ\u0018\u0010$\u001a\u00020#2\u0006\u0010\u0007\u001a\u00020\"H\u0096@¢\u0006\u0004\b$\u0010%J$\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\"0\u000bH\u0096@¢\u0006\u0004\b$\u0010\rJ\u0018\u0010(\u001a\u00020'2\u0006\u0010\u0007\u001a\u00020&H\u0096@¢\u0006\u0004\b(\u0010)J$\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020&0\u000bH\u0096@¢\u0006\u0004\b(\u0010\rJ\u0018\u0010,\u001a\u00020+2\u0006\u0010\u0007\u001a\u00020*H\u0096@¢\u0006\u0004\b,\u0010-J$\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020*0\u000bH\u0096@¢\u0006\u0004\b,\u0010\rJ\u0018\u00100\u001a\u00020/2\u0006\u0010\u0007\u001a\u00020.H\u0096@¢\u0006\u0004\b0\u00101J$\u00100\u001a\b\u0012\u0004\u0012\u00020/0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020.0\u000bH\u0096@¢\u0006\u0004\b0\u0010\rJ\u0018\u00104\u001a\u0002032\u0006\u0010\u0007\u001a\u000202H\u0096@¢\u0006\u0004\b4\u00105J$\u00104\u001a\b\u0012\u0004\u0012\u0002030\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002020\u000bH\u0096@¢\u0006\u0004\b4\u0010\rJ\u0018\u00108\u001a\u0002072\u0006\u0010\u0007\u001a\u000206H\u0096@¢\u0006\u0004\b8\u00109J$\u00108\u001a\b\u0012\u0004\u0012\u0002070\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002060\u000bH\u0096@¢\u0006\u0004\b8\u0010\rJ\u0018\u0010<\u001a\u00020;2\u0006\u0010\u0007\u001a\u00020:H\u0096@¢\u0006\u0004\b<\u0010=J$\u0010<\u001a\b\u0012\u0004\u0012\u00020;0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020:0\u000bH\u0096@¢\u0006\u0004\b<\u0010\rJ\u0018\u0010@\u001a\u00020?2\u0006\u0010\u0007\u001a\u00020>H\u0096@¢\u0006\u0004\b@\u0010AJ$\u0010@\u001a\b\u0012\u0004\u0012\u00020?0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020>0\u000bH\u0096@¢\u0006\u0004\b@\u0010\rJ\u0018\u0010C\u001a\u00020+2\u0006\u0010\u0007\u001a\u00020BH\u0096@¢\u0006\u0004\bC\u0010DJ$\u0010C\u001a\b\u0012\u0004\u0012\u00020+0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020B0\u000bH\u0096@¢\u0006\u0004\bC\u0010\rJ\u0018\u0010G\u001a\u00020F2\u0006\u0010\u0007\u001a\u00020EH\u0096@¢\u0006\u0004\bG\u0010HJ$\u0010G\u001a\b\u0012\u0004\u0012\u00020F0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020E0\u000bH\u0096@¢\u0006\u0004\bG\u0010\rJ\u0018\u0010K\u001a\u00020J2\u0006\u0010\u0007\u001a\u00020IH\u0096@¢\u0006\u0004\bK\u0010LJ$\u0010K\u001a\b\u0012\u0004\u0012\u00020J0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020I0\u000bH\u0096@¢\u0006\u0004\bK\u0010\rJ\u0018\u0010O\u001a\u00020N2\u0006\u0010\u0007\u001a\u00020MH\u0096@¢\u0006\u0004\bO\u0010PJ$\u0010O\u001a\b\u0012\u0004\u0012\u00020N0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020M0\u000bH\u0096@¢\u0006\u0004\bO\u0010\rJ\u0018\u0010S\u001a\u00020R2\u0006\u0010\u0007\u001a\u00020QH\u0096@¢\u0006\u0004\bS\u0010TJ$\u0010S\u001a\b\u0012\u0004\u0012\u00020R0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020Q0\u000bH\u0096@¢\u0006\u0004\bS\u0010\rJ\u0018\u0010W\u001a\u00020V2\u0006\u0010\u0007\u001a\u00020UH\u0096@¢\u0006\u0004\bW\u0010XJ$\u0010W\u001a\b\u0012\u0004\u0012\u00020V0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020U0\u000bH\u0096@¢\u0006\u0004\bW\u0010\rJ\u0018\u0010[\u001a\u00020Z2\u0006\u0010\u0007\u001a\u00020YH\u0096@¢\u0006\u0004\b[\u0010\\J$\u0010[\u001a\b\u0012\u0004\u0012\u00020Z0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020Y0\u000bH\u0096@¢\u0006\u0004\b[\u0010\rJ\u0018\u0010_\u001a\u00020^2\u0006\u0010\u0007\u001a\u00020]H\u0096@¢\u0006\u0004\b_\u0010`J$\u0010_\u001a\b\u0012\u0004\u0012\u00020^0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020]0\u000bH\u0096@¢\u0006\u0004\b_\u0010\rJ\u0018\u0010c\u001a\u00020b2\u0006\u0010\u0007\u001a\u00020aH\u0096@¢\u0006\u0004\bc\u0010dJ$\u0010c\u001a\b\u0012\u0004\u0012\u00020b0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020a0\u000bH\u0096@¢\u0006\u0004\bc\u0010\rJ\u0018\u0010g\u001a\u00020f2\u0006\u0010\u0007\u001a\u00020eH\u0096@¢\u0006\u0004\bg\u0010hJ$\u0010g\u001a\b\u0012\u0004\u0012\u00020f0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020e0\u000bH\u0096@¢\u0006\u0004\bg\u0010\rJ\u0018\u0010k\u001a\u00020j2\u0006\u0010\u0007\u001a\u00020iH\u0096@¢\u0006\u0004\bk\u0010lJ$\u0010k\u001a\b\u0012\u0004\u0012\u00020j0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020i0\u000bH\u0096@¢\u0006\u0004\bk\u0010\rJ\u0018\u0010o\u001a\u00020n2\u0006\u0010\u0007\u001a\u00020mH\u0096@¢\u0006\u0004\bo\u0010pJ$\u0010o\u001a\b\u0012\u0004\u0012\u00020n0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020m0\u000bH\u0096@¢\u0006\u0004\bo\u0010\rJ\u0018\u0010s\u001a\u00020r2\u0006\u0010\u0007\u001a\u00020qH\u0096@¢\u0006\u0004\bs\u0010tJ$\u0010s\u001a\b\u0012\u0004\u0012\u00020r0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020q0\u000bH\u0096@¢\u0006\u0004\bs\u0010\rJ\u0018\u0010w\u001a\u00020v2\u0006\u0010\u0007\u001a\u00020uH\u0096@¢\u0006\u0004\bw\u0010xJ$\u0010w\u001a\b\u0012\u0004\u0012\u00020v0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020u0\u000bH\u0096@¢\u0006\u0004\bw\u0010\rJ\u0018\u0010{\u001a\u00020z2\u0006\u0010\u0007\u001a\u00020yH\u0096@¢\u0006\u0004\b{\u0010|J$\u0010{\u001a\b\u0012\u0004\u0012\u00020z0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020y0\u000bH\u0096@¢\u0006\u0004\b{\u0010\rJ\u0019\u0010\u007f\u001a\u00020~2\u0006\u0010\u0007\u001a\u00020}H\u0096@¢\u0006\u0005\b\u007f\u0010\u0080\u0001J$\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020~0\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020}0\u000bH\u0096@¢\u0006\u0004\b\u007f\u0010\rR\u0015\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0003\u0010\u0081\u0001¨\u0006\u0082\u0001"}, m3636d2 = {"Ladvisory/proto/v1/RestAdvisoryService;", "Ladvisory/proto/v1/AdvisoryService;", "Ladvisory/proto/v1/AdvisoryServiceRetrofit;", "retrofit", "<init>", "(Ladvisory/proto/v1/AdvisoryServiceRetrofit;)V", "Ladvisory/proto/v1/GetManagedPortfolioRequestDto;", "request", "Ladvisory/proto/v1/GetManagedPortfolioResponseDto;", "GetManagedPortfolio", "(Ladvisory/proto/v1/GetManagedPortfolioRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/idl/Request;", "Lcom/robinhood/idl/Response;", "(Lcom/robinhood/idl/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ladvisory/proto/v1/GetReturnsBreakdownRequestDto;", "Ladvisory/proto/v1/GetReturnsBreakdownResponseDto;", "GetReturnsBreakdown", "(Ladvisory/proto/v1/GetReturnsBreakdownRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ladvisory/proto/v1/GetAdvisoryFeesListRequestDto;", "Ladvisory/proto/v1/GetAdvisoryFeesListResponseDto;", "GetAdvisoryFeesList", "(Ladvisory/proto/v1/GetAdvisoryFeesListRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ladvisory/proto/v1/GetFutureProjectionDisclosureRequestDto;", "Ladvisory/proto/v1/GetFutureProjectionDisclosureResponseDto;", "GetFutureProjectionDisclosure", "(Ladvisory/proto/v1/GetFutureProjectionDisclosureRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ladvisory/proto/v1/GetStrategiesValuePropsRequestDto;", "Ladvisory/proto/v1/GetStrategiesValuePropsResponseDto;", "GetStrategiesValueProps", "(Ladvisory/proto/v1/GetStrategiesValuePropsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ladvisory/proto/v1/GetAdvisoryInsightsRequestDto;", "Ladvisory/proto/v1/GetAdvisoryInsightsResponseDto;", "GetAdvisoryInsights", "(Ladvisory/proto/v1/GetAdvisoryInsightsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ladvisory/proto/v1/GetAdvisoryInsightDetailsRequestDto;", "Ladvisory/proto/v1/GetAdvisoryInsightDetailsResponseDto;", "GetAdvisoryInsightDetails", "(Ladvisory/proto/v1/GetAdvisoryInsightDetailsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ladvisory/proto/v1/GetUnseenAdvisoryInsightsRequestDto;", "Ladvisory/proto/v1/GetUnseenAdvisoryInsightsResponseDto;", "GetUnseenAdvisoryInsights", "(Ladvisory/proto/v1/GetUnseenAdvisoryInsightsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ladvisory/proto/v1/MarkAdvisoryInsightAsSeenRequestDto;", "", "MarkAdvisoryInsightAsSeen", "(Ladvisory/proto/v1/MarkAdvisoryInsightAsSeenRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ladvisory/proto/v1/GetAdvisoryDepositGoldValuePropRequestDto;", "Ladvisory/proto/v1/GetAdvisoryDepositGoldValuePropResponseDto;", "GetAdvisoryDepositGoldValueProp", "(Ladvisory/proto/v1/GetAdvisoryDepositGoldValuePropRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ladvisory/proto/v1/GetDepositPromoCardRequestDto;", "Ladvisory/proto/v1/GetDepositPromoCardResponseDto;", "GetDepositPromoCard", "(Ladvisory/proto/v1/GetDepositPromoCardRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ladvisory/proto/v1/GetDepositPromoDetailsRequestDto;", "Ladvisory/proto/v1/GetDepositPromoDetailsResponseDto;", "GetDepositPromoDetails", "(Ladvisory/proto/v1/GetDepositPromoDetailsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ladvisory/proto/v1/GetManagedPortfolioRestrictedStocksRequestDto;", "Ladvisory/proto/v1/GetManagedPortfolioRestrictedStocksResponseDto;", "GetManagedPortfolioRestrictedStocks", "(Ladvisory/proto/v1/GetManagedPortfolioRestrictedStocksRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ladvisory/proto/v1/SearchRestrictableStocksRequestDto;", "Ladvisory/proto/v1/SearchRestrictableStocksResponseDto;", "SearchRestrictableStocks", "(Ladvisory/proto/v1/SearchRestrictableStocksRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ladvisory/proto/v1/UpdateRestrictedStockRequestDto;", "UpdateRestrictedStock", "(Ladvisory/proto/v1/UpdateRestrictedStockRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ladvisory/proto/v1/GetDashboardDisclosureRequestDto;", "Ladvisory/proto/v1/GetDashboardDisclosureResponseDto;", "GetDashboardDisclosure", "(Ladvisory/proto/v1/GetDashboardDisclosureRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ladvisory/proto/v1/GetFullWithdrawalSummaryRequestDto;", "Ladvisory/proto/v1/GetFullWithdrawalSummaryResponseDto;", "GetFullWithdrawalSummary", "(Ladvisory/proto/v1/GetFullWithdrawalSummaryRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ladvisory/proto/v1/GetModelPortfolioChangeRequestDto;", "Ladvisory/proto/v1/GetModelPortfolioChangeResponseDto;", "GetModelPortfolioChange", "(Ladvisory/proto/v1/GetModelPortfolioChangeRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ladvisory/proto/v1/GetDepositsSummaryRequestDto;", "Ladvisory/proto/v1/GetDepositsSummaryResponseDto;", "GetDepositsSummary", "(Ladvisory/proto/v1/GetDepositsSummaryRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ladvisory/proto/v1/GetRXRStrategiesUpsellRequestDto;", "Ladvisory/proto/v1/GetRXRStrategiesUpsellResponseDto;", "GetRXRStrategiesUpsell", "(Ladvisory/proto/v1/GetRXRStrategiesUpsellRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ladvisory/proto/v1/GetIRAManagementStyleSelectionRequestDto;", "Ladvisory/proto/v1/GetIRAManagementStyleSelectionResponseDto;", "GetIRAManagementStyleSelection", "(Ladvisory/proto/v1/GetIRAManagementStyleSelectionRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ladvisory/proto/v1/GetReturnHubRequestDto;", "Ladvisory/proto/v1/GetReturnHubResponseDto;", "GetReturnHub", "(Ladvisory/proto/v1/GetReturnHubRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ladvisory/proto/v1/GetAdvisoryMultiPageInsightRequestDto;", "Ladvisory/proto/v1/GetAdvisoryMultiPageInsightResponseDto;", "GetAdvisoryMultiPageInsight", "(Ladvisory/proto/v1/GetAdvisoryMultiPageInsightRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ladvisory/proto/v1/GetTaxGainsAndLossesRequestDto;", "Ladvisory/proto/v1/GetTaxGainsAndLossesResponseDto;", "GetTaxGainsAndLosses", "(Ladvisory/proto/v1/GetTaxGainsAndLossesRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ladvisory/proto/v1/GetTaxLossHarvestDashboardRequestDto;", "Ladvisory/proto/v1/GetTaxLossHarvestDashboardResponseDto;", "GetTaxLossHarvestDashboard", "(Ladvisory/proto/v1/GetTaxLossHarvestDashboardRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ladvisory/proto/v1/GetTaxLossHarvestFlowRequestDto;", "Ladvisory/proto/v1/GetTaxLossHarvestFlowResponseDto;", "GetTaxLossHarvestFlow", "(Ladvisory/proto/v1/GetTaxLossHarvestFlowRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ladvisory/proto/v1/GetTaxLossHarvestStrategiesRequestDto;", "Ladvisory/proto/v1/GetTaxLossHarvestStrategiesResponseDto;", "GetTaxLossHarvestStrategies", "(Ladvisory/proto/v1/GetTaxLossHarvestStrategiesRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ladvisory/proto/v1/SubmitTaxLossHarvestStrategyRequestDto;", "Ladvisory/proto/v1/SubmitTaxLossHarvestStrategyResponseDto;", "SubmitTaxLossHarvestStrategy", "(Ladvisory/proto/v1/SubmitTaxLossHarvestStrategyRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ladvisory/proto/v1/TaxLossHarvestUpdateEnrollmentRequestDto;", "Ladvisory/proto/v1/TaxLossHarvestUpdateEnrollmentResponseDto;", "TaxLossHarvestUpdateEnrollment", "(Ladvisory/proto/v1/TaxLossHarvestUpdateEnrollmentRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ladvisory/proto/v1/GetDashboardCardRequestDto;", "Ladvisory/proto/v1/GetDashboardCardResponseDto;", "GetDashboardCard", "(Ladvisory/proto/v1/GetDashboardCardRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ladvisory/proto/v1/AdvisoryServiceRetrofit;", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class RestAdvisoryService implements AdvisoryService {
    private final AdvisoryServiceRetrofit retrofit;

    /* compiled from: RestAdvisoryService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "advisory.proto.v1.RestAdvisoryService", m3645f = "RestAdvisoryService.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_PERSON_VALUE}, m3647m = "GetAdvisoryDepositGoldValueProp")
    /* renamed from: advisory.proto.v1.RestAdvisoryService$GetAdvisoryDepositGoldValueProp$1 */
    static final class C04751 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C04751(Continuation<? super C04751> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestAdvisoryService.this.GetAdvisoryDepositGoldValueProp((GetAdvisoryDepositGoldValuePropRequestDto) null, this);
        }
    }

    /* compiled from: RestAdvisoryService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "advisory.proto.v1.RestAdvisoryService", m3645f = "RestAdvisoryService.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SDK_EMPTY_SVG_VALUE}, m3647m = "GetAdvisoryDepositGoldValueProp")
    /* renamed from: advisory.proto.v1.RestAdvisoryService$GetAdvisoryDepositGoldValueProp$2 */
    static final class C04762 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C04762(Continuation<? super C04762> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestAdvisoryService.this.GetAdvisoryDepositGoldValueProp((Request<GetAdvisoryDepositGoldValuePropRequestDto>) null, this);
        }
    }

    /* compiled from: RestAdvisoryService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "advisory.proto.v1.RestAdvisoryService", m3645f = "RestAdvisoryService.kt", m3646l = {46}, m3647m = "GetAdvisoryFeesList")
    /* renamed from: advisory.proto.v1.RestAdvisoryService$GetAdvisoryFeesList$1 */
    static final class C04771 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C04771(Continuation<? super C04771> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestAdvisoryService.this.GetAdvisoryFeesList((GetAdvisoryFeesListRequestDto) null, this);
        }
    }

    /* compiled from: RestAdvisoryService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "advisory.proto.v1.RestAdvisoryService", m3645f = "RestAdvisoryService.kt", m3646l = {49}, m3647m = "GetAdvisoryFeesList")
    /* renamed from: advisory.proto.v1.RestAdvisoryService$GetAdvisoryFeesList$2 */
    static final class C04782 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C04782(Continuation<? super C04782> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestAdvisoryService.this.GetAdvisoryFeesList((Request<GetAdvisoryFeesListRequestDto>) null, this);
        }
    }

    /* compiled from: RestAdvisoryService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "advisory.proto.v1.RestAdvisoryService", m3645f = "RestAdvisoryService.kt", m3646l = {113}, m3647m = "GetAdvisoryInsightDetails")
    /* renamed from: advisory.proto.v1.RestAdvisoryService$GetAdvisoryInsightDetails$1 */
    static final class C04791 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C04791(Continuation<? super C04791> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestAdvisoryService.this.GetAdvisoryInsightDetails((GetAdvisoryInsightDetailsRequestDto) null, this);
        }
    }

    /* compiled from: RestAdvisoryService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "advisory.proto.v1.RestAdvisoryService", m3645f = "RestAdvisoryService.kt", m3646l = {116}, m3647m = "GetAdvisoryInsightDetails")
    /* renamed from: advisory.proto.v1.RestAdvisoryService$GetAdvisoryInsightDetails$2 */
    static final class C04802 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C04802(Continuation<? super C04802> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestAdvisoryService.this.GetAdvisoryInsightDetails((Request<GetAdvisoryInsightDetailsRequestDto>) null, this);
        }
    }

    /* compiled from: RestAdvisoryService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "advisory.proto.v1.RestAdvisoryService", m3645f = "RestAdvisoryService.kt", m3646l = {100}, m3647m = "GetAdvisoryInsights")
    /* renamed from: advisory.proto.v1.RestAdvisoryService$GetAdvisoryInsights$1 */
    static final class C04811 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C04811(Continuation<? super C04811> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestAdvisoryService.this.GetAdvisoryInsights((GetAdvisoryInsightsRequestDto) null, this);
        }
    }

    /* compiled from: RestAdvisoryService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "advisory.proto.v1.RestAdvisoryService", m3645f = "RestAdvisoryService.kt", m3646l = {103}, m3647m = "GetAdvisoryInsights")
    /* renamed from: advisory.proto.v1.RestAdvisoryService$GetAdvisoryInsights$2 */
    static final class C04822 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C04822(Continuation<? super C04822> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestAdvisoryService.this.GetAdvisoryInsights((Request<GetAdvisoryInsightsRequestDto>) null, this);
        }
    }

    /* compiled from: RestAdvisoryService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "advisory.proto.v1.RestAdvisoryService", m3645f = "RestAdvisoryService.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_ERROR_BRUSHSTROKE_VALUE}, m3647m = "GetAdvisoryMultiPageInsight")
    /* renamed from: advisory.proto.v1.RestAdvisoryService$GetAdvisoryMultiPageInsight$1 */
    static final class C04831 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C04831(Continuation<? super C04831> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestAdvisoryService.this.GetAdvisoryMultiPageInsight((GetAdvisoryMultiPageInsightRequestDto) null, this);
        }
    }

    /* compiled from: RestAdvisoryService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "advisory.proto.v1.RestAdvisoryService", m3645f = "RestAdvisoryService.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_DARK_APPEARANCE_VALUE}, m3647m = "GetAdvisoryMultiPageInsight")
    /* renamed from: advisory.proto.v1.RestAdvisoryService$GetAdvisoryMultiPageInsight$2 */
    static final class C04842 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C04842(Continuation<? super C04842> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestAdvisoryService.this.GetAdvisoryMultiPageInsight((Request<GetAdvisoryMultiPageInsightRequestDto>) null, this);
        }
    }

    /* compiled from: RestAdvisoryService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "advisory.proto.v1.RestAdvisoryService", m3645f = "RestAdvisoryService.kt", m3646l = {362}, m3647m = "GetDashboardCard")
    /* renamed from: advisory.proto.v1.RestAdvisoryService$GetDashboardCard$1 */
    static final class C04851 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C04851(Continuation<? super C04851> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestAdvisoryService.this.GetDashboardCard((GetDashboardCardRequestDto) null, this);
        }
    }

    /* compiled from: RestAdvisoryService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "advisory.proto.v1.RestAdvisoryService", m3645f = "RestAdvisoryService.kt", m3646l = {365}, m3647m = "GetDashboardCard")
    /* renamed from: advisory.proto.v1.RestAdvisoryService$GetDashboardCard$2 */
    static final class C04862 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C04862(Continuation<? super C04862> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestAdvisoryService.this.GetDashboardCard((Request<GetDashboardCardRequestDto>) null, this);
        }
    }

    /* compiled from: RestAdvisoryService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "advisory.proto.v1.RestAdvisoryService", m3645f = "RestAdvisoryService.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_REJECTED_REC_VALUE}, m3647m = "GetDashboardDisclosure")
    /* renamed from: advisory.proto.v1.RestAdvisoryService$GetDashboardDisclosure$1 */
    static final class C04871 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C04871(Continuation<? super C04871> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestAdvisoryService.this.GetDashboardDisclosure((GetDashboardDisclosureRequestDto) null, this);
        }
    }

    /* compiled from: RestAdvisoryService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "advisory.proto.v1.RestAdvisoryService", m3645f = "RestAdvisoryService.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_SUBTRACT_VALUE}, m3647m = "GetDashboardDisclosure")
    /* renamed from: advisory.proto.v1.RestAdvisoryService$GetDashboardDisclosure$2 */
    static final class C04882 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C04882(Continuation<? super C04882> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestAdvisoryService.this.GetDashboardDisclosure((Request<GetDashboardDisclosureRequestDto>) null, this);
        }
    }

    /* compiled from: RestAdvisoryService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "advisory.proto.v1.RestAdvisoryService", m3645f = "RestAdvisoryService.kt", m3646l = {165}, m3647m = "GetDepositPromoCard")
    /* renamed from: advisory.proto.v1.RestAdvisoryService$GetDepositPromoCard$1 */
    static final class C04891 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C04891(Continuation<? super C04891> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestAdvisoryService.this.GetDepositPromoCard((GetDepositPromoCardRequestDto) null, this);
        }
    }

    /* compiled from: RestAdvisoryService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "advisory.proto.v1.RestAdvisoryService", m3645f = "RestAdvisoryService.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE}, m3647m = "GetDepositPromoCard")
    /* renamed from: advisory.proto.v1.RestAdvisoryService$GetDepositPromoCard$2 */
    static final class C04902 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C04902(Continuation<? super C04902> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestAdvisoryService.this.GetDepositPromoCard((Request<GetDepositPromoCardRequestDto>) null, this);
        }
    }

    /* compiled from: RestAdvisoryService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "advisory.proto.v1.RestAdvisoryService", m3645f = "RestAdvisoryService.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_DARK_APPEARANCE_VALUE}, m3647m = "GetDepositPromoDetails")
    /* renamed from: advisory.proto.v1.RestAdvisoryService$GetDepositPromoDetails$1 */
    static final class C04911 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C04911(Continuation<? super C04911> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestAdvisoryService.this.GetDepositPromoDetails((GetDepositPromoDetailsRequestDto) null, this);
        }
    }

    /* compiled from: RestAdvisoryService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "advisory.proto.v1.RestAdvisoryService", m3645f = "RestAdvisoryService.kt", m3646l = {EnumC7081g.f2773x8d9721ad}, m3647m = "GetDepositPromoDetails")
    /* renamed from: advisory.proto.v1.RestAdvisoryService$GetDepositPromoDetails$2 */
    static final class C04922 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C04922(Continuation<? super C04922> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestAdvisoryService.this.GetDepositPromoDetails((Request<GetDepositPromoDetailsRequestDto>) null, this);
        }
    }

    /* compiled from: RestAdvisoryService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "advisory.proto.v1.RestAdvisoryService", m3645f = "RestAdvisoryService.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE}, m3647m = "GetDepositsSummary")
    /* renamed from: advisory.proto.v1.RestAdvisoryService$GetDepositsSummary$1 */
    static final class C04931 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C04931(Continuation<? super C04931> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestAdvisoryService.this.GetDepositsSummary((GetDepositsSummaryRequestDto) null, this);
        }
    }

    /* compiled from: RestAdvisoryService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "advisory.proto.v1.RestAdvisoryService", m3645f = "RestAdvisoryService.kt", m3646l = {255}, m3647m = "GetDepositsSummary")
    /* renamed from: advisory.proto.v1.RestAdvisoryService$GetDepositsSummary$2 */
    static final class C04942 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C04942(Continuation<? super C04942> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestAdvisoryService.this.GetDepositsSummary((Request<GetDepositsSummaryRequestDto>) null, this);
        }
    }

    /* compiled from: RestAdvisoryService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "advisory.proto.v1.RestAdvisoryService", m3645f = "RestAdvisoryService.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE}, m3647m = "GetFullWithdrawalSummary")
    /* renamed from: advisory.proto.v1.RestAdvisoryService$GetFullWithdrawalSummary$1 */
    static final class C04951 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C04951(Continuation<? super C04951> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestAdvisoryService.this.GetFullWithdrawalSummary((GetFullWithdrawalSummaryRequestDto) null, this);
        }
    }

    /* compiled from: RestAdvisoryService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "advisory.proto.v1.RestAdvisoryService", m3645f = "RestAdvisoryService.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE}, m3647m = "GetFullWithdrawalSummary")
    /* renamed from: advisory.proto.v1.RestAdvisoryService$GetFullWithdrawalSummary$2 */
    static final class C04962 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C04962(Continuation<? super C04962> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestAdvisoryService.this.GetFullWithdrawalSummary((Request<GetFullWithdrawalSummaryRequestDto>) null, this);
        }
    }

    /* compiled from: RestAdvisoryService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "advisory.proto.v1.RestAdvisoryService", m3645f = "RestAdvisoryService.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_HOME_VALUE}, m3647m = "GetFutureProjectionDisclosure")
    /* renamed from: advisory.proto.v1.RestAdvisoryService$GetFutureProjectionDisclosure$1 */
    static final class C04971 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C04971(Continuation<? super C04971> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestAdvisoryService.this.GetFutureProjectionDisclosure((GetFutureProjectionDisclosureRequestDto) null, this);
        }
    }

    /* compiled from: RestAdvisoryService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "advisory.proto.v1.RestAdvisoryService", m3645f = "RestAdvisoryService.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_GUIDE_VALUE}, m3647m = "GetFutureProjectionDisclosure")
    /* renamed from: advisory.proto.v1.RestAdvisoryService$GetFutureProjectionDisclosure$2 */
    static final class C04982 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C04982(Continuation<? super C04982> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestAdvisoryService.this.GetFutureProjectionDisclosure((Request<GetFutureProjectionDisclosureRequestDto>) null, this);
        }
    }

    /* compiled from: RestAdvisoryService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "advisory.proto.v1.RestAdvisoryService", m3645f = "RestAdvisoryService.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE}, m3647m = "GetIRAManagementStyleSelection")
    /* renamed from: advisory.proto.v1.RestAdvisoryService$GetIRAManagementStyleSelection$1 */
    static final class C04991 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C04991(Continuation<? super C04991> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestAdvisoryService.this.GetIRAManagementStyleSelection((GetIRAManagementStyleSelectionRequestDto) null, this);
        }
    }

    /* compiled from: RestAdvisoryService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "advisory.proto.v1.RestAdvisoryService", m3645f = "RestAdvisoryService.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_SOLID_VALUE}, m3647m = "GetIRAManagementStyleSelection")
    /* renamed from: advisory.proto.v1.RestAdvisoryService$GetIRAManagementStyleSelection$2 */
    static final class C05002 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C05002(Continuation<? super C05002> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestAdvisoryService.this.GetIRAManagementStyleSelection((Request<GetIRAManagementStyleSelectionRequestDto>) null, this);
        }
    }

    /* compiled from: RestAdvisoryService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "advisory.proto.v1.RestAdvisoryService", m3645f = "RestAdvisoryService.kt", m3646l = {22}, m3647m = "GetManagedPortfolio")
    /* renamed from: advisory.proto.v1.RestAdvisoryService$GetManagedPortfolio$1 */
    static final class C05011 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C05011(Continuation<? super C05011> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestAdvisoryService.this.GetManagedPortfolio((GetManagedPortfolioRequestDto) null, this);
        }
    }

    /* compiled from: RestAdvisoryService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "advisory.proto.v1.RestAdvisoryService", m3645f = "RestAdvisoryService.kt", m3646l = {28}, m3647m = "GetManagedPortfolio")
    /* renamed from: advisory.proto.v1.RestAdvisoryService$GetManagedPortfolio$2 */
    static final class C05022 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C05022(Continuation<? super C05022> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestAdvisoryService.this.GetManagedPortfolio((Request<GetManagedPortfolioRequestDto>) null, this);
        }
    }

    /* compiled from: RestAdvisoryService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "advisory.proto.v1.RestAdvisoryService", m3645f = "RestAdvisoryService.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_TEXT_VALUE}, m3647m = "GetManagedPortfolioRestrictedStocks")
    /* renamed from: advisory.proto.v1.RestAdvisoryService$GetManagedPortfolioRestrictedStocks$1 */
    static final class C05031 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C05031(Continuation<? super C05031> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestAdvisoryService.this.GetManagedPortfolioRestrictedStocks((GetManagedPortfolioRestrictedStocksRequestDto) null, this);
        }
    }

    /* compiled from: RestAdvisoryService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "advisory.proto.v1.RestAdvisoryService", m3645f = "RestAdvisoryService.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE}, m3647m = "GetManagedPortfolioRestrictedStocks")
    /* renamed from: advisory.proto.v1.RestAdvisoryService$GetManagedPortfolioRestrictedStocks$2 */
    static final class C05042 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C05042(Continuation<? super C05042> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestAdvisoryService.this.GetManagedPortfolioRestrictedStocks((Request<GetManagedPortfolioRestrictedStocksRequestDto>) null, this);
        }
    }

    /* compiled from: RestAdvisoryService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "advisory.proto.v1.RestAdvisoryService", m3645f = "RestAdvisoryService.kt", m3646l = {EnumC7081g.f2778x3356acf6}, m3647m = "GetModelPortfolioChange")
    /* renamed from: advisory.proto.v1.RestAdvisoryService$GetModelPortfolioChange$1 */
    static final class C05051 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C05051(Continuation<? super C05051> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestAdvisoryService.this.GetModelPortfolioChange((GetModelPortfolioChangeRequestDto) null, this);
        }
    }

    /* compiled from: RestAdvisoryService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "advisory.proto.v1.RestAdvisoryService", m3645f = "RestAdvisoryService.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE}, m3647m = "GetModelPortfolioChange")
    /* renamed from: advisory.proto.v1.RestAdvisoryService$GetModelPortfolioChange$2 */
    static final class C05062 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C05062(Continuation<? super C05062> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestAdvisoryService.this.GetModelPortfolioChange((Request<GetModelPortfolioChangeRequestDto>) null, this);
        }
    }

    /* compiled from: RestAdvisoryService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "advisory.proto.v1.RestAdvisoryService", m3645f = "RestAdvisoryService.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE}, m3647m = "GetRXRStrategiesUpsell")
    /* renamed from: advisory.proto.v1.RestAdvisoryService$GetRXRStrategiesUpsell$1 */
    static final class C05071 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C05071(Continuation<? super C05071> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestAdvisoryService.this.GetRXRStrategiesUpsell((GetRXRStrategiesUpsellRequestDto) null, this);
        }
    }

    /* compiled from: RestAdvisoryService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "advisory.proto.v1.RestAdvisoryService", m3645f = "RestAdvisoryService.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_SHIELD_VALUE}, m3647m = "GetRXRStrategiesUpsell")
    /* renamed from: advisory.proto.v1.RestAdvisoryService$GetRXRStrategiesUpsell$2 */
    static final class C05082 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C05082(Continuation<? super C05082> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestAdvisoryService.this.GetRXRStrategiesUpsell((Request<GetRXRStrategiesUpsellRequestDto>) null, this);
        }
    }

    /* compiled from: RestAdvisoryService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "advisory.proto.v1.RestAdvisoryService", m3645f = "RestAdvisoryService.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_BANK_DARK_APPEARANCE_VALUE}, m3647m = "GetReturnHub")
    /* renamed from: advisory.proto.v1.RestAdvisoryService$GetReturnHub$1 */
    static final class C05091 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C05091(Continuation<? super C05091> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestAdvisoryService.this.GetReturnHub((GetReturnHubRequestDto) null, this);
        }
    }

    /* compiled from: RestAdvisoryService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "advisory.proto.v1.RestAdvisoryService", m3645f = "RestAdvisoryService.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_VALUE}, m3647m = "GetReturnHub")
    /* renamed from: advisory.proto.v1.RestAdvisoryService$GetReturnHub$2 */
    static final class C05102 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C05102(Continuation<? super C05102> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestAdvisoryService.this.GetReturnHub((Request<GetReturnHubRequestDto>) null, this);
        }
    }

    /* compiled from: RestAdvisoryService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "advisory.proto.v1.RestAdvisoryService", m3645f = "RestAdvisoryService.kt", m3646l = {35}, m3647m = "GetReturnsBreakdown")
    /* renamed from: advisory.proto.v1.RestAdvisoryService$GetReturnsBreakdown$1 */
    static final class C05111 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C05111(Continuation<? super C05111> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestAdvisoryService.this.GetReturnsBreakdown((GetReturnsBreakdownRequestDto) null, this);
        }
    }

    /* compiled from: RestAdvisoryService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "advisory.proto.v1.RestAdvisoryService", m3645f = "RestAdvisoryService.kt", m3646l = {38}, m3647m = "GetReturnsBreakdown")
    /* renamed from: advisory.proto.v1.RestAdvisoryService$GetReturnsBreakdown$2 */
    static final class C05122 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C05122(Continuation<? super C05122> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestAdvisoryService.this.GetReturnsBreakdown((Request<GetReturnsBreakdownRequestDto>) null, this);
        }
    }

    /* compiled from: RestAdvisoryService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "advisory.proto.v1.RestAdvisoryService", m3645f = "RestAdvisoryService.kt", m3646l = {90}, m3647m = "GetStrategiesValueProps")
    /* renamed from: advisory.proto.v1.RestAdvisoryService$GetStrategiesValueProps$1 */
    static final class C05131 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C05131(Continuation<? super C05131> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestAdvisoryService.this.GetStrategiesValueProps((GetStrategiesValuePropsRequestDto) null, this);
        }
    }

    /* compiled from: RestAdvisoryService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "advisory.proto.v1.RestAdvisoryService", m3645f = "RestAdvisoryService.kt", m3646l = {93}, m3647m = "GetStrategiesValueProps")
    /* renamed from: advisory.proto.v1.RestAdvisoryService$GetStrategiesValueProps$2 */
    static final class C05142 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C05142(Continuation<? super C05142> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestAdvisoryService.this.GetStrategiesValueProps((Request<GetStrategiesValuePropsRequestDto>) null, this);
        }
    }

    /* compiled from: RestAdvisoryService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "advisory.proto.v1.RestAdvisoryService", m3645f = "RestAdvisoryService.kt", m3646l = {EnumC7081g.SDK_ASSET_ANIMATION_MOBILE_AUTH_LOADING_DARK_APPEARANCE_VALUE}, m3647m = "GetTaxGainsAndLosses")
    /* renamed from: advisory.proto.v1.RestAdvisoryService$GetTaxGainsAndLosses$1 */
    static final class C05151 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C05151(Continuation<? super C05151> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestAdvisoryService.this.GetTaxGainsAndLosses((GetTaxGainsAndLossesRequestDto) null, this);
        }
    }

    /* compiled from: RestAdvisoryService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "advisory.proto.v1.RestAdvisoryService", m3645f = "RestAdvisoryService.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CLIPBOARD_CIRCLE_VALUE}, m3647m = "GetTaxGainsAndLosses")
    /* renamed from: advisory.proto.v1.RestAdvisoryService$GetTaxGainsAndLosses$2 */
    static final class C05162 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C05162(Continuation<? super C05162> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestAdvisoryService.this.GetTaxGainsAndLosses((Request<GetTaxGainsAndLossesRequestDto>) null, this);
        }
    }

    /* compiled from: RestAdvisoryService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "advisory.proto.v1.RestAdvisoryService", m3645f = "RestAdvisoryService.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CHECKMARK_FILLED_BLUE_VALUE}, m3647m = "GetTaxLossHarvestDashboard")
    /* renamed from: advisory.proto.v1.RestAdvisoryService$GetTaxLossHarvestDashboard$1 */
    static final class C05171 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C05171(Continuation<? super C05171> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestAdvisoryService.this.GetTaxLossHarvestDashboard((GetTaxLossHarvestDashboardRequestDto) null, this);
        }
    }

    /* compiled from: RestAdvisoryService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "advisory.proto.v1.RestAdvisoryService", m3645f = "RestAdvisoryService.kt", m3646l = {316}, m3647m = "GetTaxLossHarvestDashboard")
    /* renamed from: advisory.proto.v1.RestAdvisoryService$GetTaxLossHarvestDashboard$2 */
    static final class C05182 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C05182(Continuation<? super C05182> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestAdvisoryService.this.GetTaxLossHarvestDashboard((Request<GetTaxLossHarvestDashboardRequestDto>) null, this);
        }
    }

    /* compiled from: RestAdvisoryService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "advisory.proto.v1.RestAdvisoryService", m3645f = "RestAdvisoryService.kt", m3646l = {EnumC7081g.f2775xbcb7e6f3}, m3647m = "GetTaxLossHarvestFlow")
    /* renamed from: advisory.proto.v1.RestAdvisoryService$GetTaxLossHarvestFlow$1 */
    static final class C05191 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C05191(Continuation<? super C05191> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestAdvisoryService.this.GetTaxLossHarvestFlow((GetTaxLossHarvestFlowRequestDto) null, this);
        }
    }

    /* compiled from: RestAdvisoryService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "advisory.proto.v1.RestAdvisoryService", m3645f = "RestAdvisoryService.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_STEP_COMPLETE_VALUE}, m3647m = "GetTaxLossHarvestFlow")
    /* renamed from: advisory.proto.v1.RestAdvisoryService$GetTaxLossHarvestFlow$2 */
    static final class C05202 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C05202(Continuation<? super C05202> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestAdvisoryService.this.GetTaxLossHarvestFlow((Request<GetTaxLossHarvestFlowRequestDto>) null, this);
        }
    }

    /* compiled from: RestAdvisoryService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "advisory.proto.v1.RestAdvisoryService", m3645f = "RestAdvisoryService.kt", m3646l = {332}, m3647m = "GetTaxLossHarvestStrategies")
    /* renamed from: advisory.proto.v1.RestAdvisoryService$GetTaxLossHarvestStrategies$1 */
    static final class C05211 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C05211(Continuation<? super C05211> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestAdvisoryService.this.GetTaxLossHarvestStrategies((GetTaxLossHarvestStrategiesRequestDto) null, this);
        }
    }

    /* compiled from: RestAdvisoryService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "advisory.proto.v1.RestAdvisoryService", m3645f = "RestAdvisoryService.kt", m3646l = {335}, m3647m = "GetTaxLossHarvestStrategies")
    /* renamed from: advisory.proto.v1.RestAdvisoryService$GetTaxLossHarvestStrategies$2 */
    static final class C05222 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C05222(Continuation<? super C05222> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestAdvisoryService.this.GetTaxLossHarvestStrategies((Request<GetTaxLossHarvestStrategiesRequestDto>) null, this);
        }
    }

    /* compiled from: RestAdvisoryService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "advisory.proto.v1.RestAdvisoryService", m3645f = "RestAdvisoryService.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE}, m3647m = "GetUnseenAdvisoryInsights")
    /* renamed from: advisory.proto.v1.RestAdvisoryService$GetUnseenAdvisoryInsights$1 */
    static final class C05231 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C05231(Continuation<? super C05231> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestAdvisoryService.this.GetUnseenAdvisoryInsights((GetUnseenAdvisoryInsightsRequestDto) null, this);
        }
    }

    /* compiled from: RestAdvisoryService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "advisory.proto.v1.RestAdvisoryService", m3645f = "RestAdvisoryService.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE}, m3647m = "GetUnseenAdvisoryInsights")
    /* renamed from: advisory.proto.v1.RestAdvisoryService$GetUnseenAdvisoryInsights$2 */
    static final class C05242 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C05242(Continuation<? super C05242> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestAdvisoryService.this.GetUnseenAdvisoryInsights((Request<GetUnseenAdvisoryInsightsRequestDto>) null, this);
        }
    }

    /* compiled from: RestAdvisoryService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "advisory.proto.v1.RestAdvisoryService", m3645f = "RestAdvisoryService.kt", m3646l = {136}, m3647m = "MarkAdvisoryInsightAsSeen")
    /* renamed from: advisory.proto.v1.RestAdvisoryService$MarkAdvisoryInsightAsSeen$1 */
    static final class C05251 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C05251(Continuation<? super C05251> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestAdvisoryService.this.MarkAdvisoryInsightAsSeen((MarkAdvisoryInsightAsSeenRequestDto) null, this);
        }
    }

    /* compiled from: RestAdvisoryService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "advisory.proto.v1.RestAdvisoryService", m3645f = "RestAdvisoryService.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE}, m3647m = "MarkAdvisoryInsightAsSeen")
    /* renamed from: advisory.proto.v1.RestAdvisoryService$MarkAdvisoryInsightAsSeen$2 */
    static final class C05262 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C05262(Continuation<? super C05262> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestAdvisoryService.this.MarkAdvisoryInsightAsSeen((Request<MarkAdvisoryInsightAsSeenRequestDto>) null, this);
        }
    }

    /* compiled from: RestAdvisoryService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "advisory.proto.v1.RestAdvisoryService", m3645f = "RestAdvisoryService.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_ARROW_DOWN_VALUE}, m3647m = "SearchRestrictableStocks")
    /* renamed from: advisory.proto.v1.RestAdvisoryService$SearchRestrictableStocks$1 */
    static final class C05271 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C05271(Continuation<? super C05271> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestAdvisoryService.this.SearchRestrictableStocks((SearchRestrictableStocksRequestDto) null, this);
        }
    }

    /* compiled from: RestAdvisoryService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "advisory.proto.v1.RestAdvisoryService", m3645f = "RestAdvisoryService.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CANCEL_VALUE}, m3647m = "SearchRestrictableStocks")
    /* renamed from: advisory.proto.v1.RestAdvisoryService$SearchRestrictableStocks$2 */
    static final class C05282 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C05282(Continuation<? super C05282> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestAdvisoryService.this.SearchRestrictableStocks((Request<SearchRestrictableStocksRequestDto>) null, this);
        }
    }

    /* compiled from: RestAdvisoryService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "advisory.proto.v1.RestAdvisoryService", m3645f = "RestAdvisoryService.kt", m3646l = {342}, m3647m = "SubmitTaxLossHarvestStrategy")
    /* renamed from: advisory.proto.v1.RestAdvisoryService$SubmitTaxLossHarvestStrategy$1 */
    static final class C05291 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C05291(Continuation<? super C05291> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestAdvisoryService.this.SubmitTaxLossHarvestStrategy((SubmitTaxLossHarvestStrategyRequestDto) null, this);
        }
    }

    /* compiled from: RestAdvisoryService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "advisory.proto.v1.RestAdvisoryService", m3645f = "RestAdvisoryService.kt", m3646l = {345}, m3647m = "SubmitTaxLossHarvestStrategy")
    /* renamed from: advisory.proto.v1.RestAdvisoryService$SubmitTaxLossHarvestStrategy$2 */
    static final class C05302 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C05302(Continuation<? super C05302> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestAdvisoryService.this.SubmitTaxLossHarvestStrategy((Request<SubmitTaxLossHarvestStrategyRequestDto>) null, this);
        }
    }

    /* compiled from: RestAdvisoryService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "advisory.proto.v1.RestAdvisoryService", m3645f = "RestAdvisoryService.kt", m3646l = {352}, m3647m = "TaxLossHarvestUpdateEnrollment")
    /* renamed from: advisory.proto.v1.RestAdvisoryService$TaxLossHarvestUpdateEnrollment$1 */
    static final class C05311 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C05311(Continuation<? super C05311> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestAdvisoryService.this.TaxLossHarvestUpdateEnrollment((TaxLossHarvestUpdateEnrollmentRequestDto) null, this);
        }
    }

    /* compiled from: RestAdvisoryService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "advisory.proto.v1.RestAdvisoryService", m3645f = "RestAdvisoryService.kt", m3646l = {355}, m3647m = "TaxLossHarvestUpdateEnrollment")
    /* renamed from: advisory.proto.v1.RestAdvisoryService$TaxLossHarvestUpdateEnrollment$2 */
    static final class C05322 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C05322(Continuation<? super C05322> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestAdvisoryService.this.TaxLossHarvestUpdateEnrollment((Request<TaxLossHarvestUpdateEnrollmentRequestDto>) null, this);
        }
    }

    /* compiled from: RestAdvisoryService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "advisory.proto.v1.RestAdvisoryService", m3645f = "RestAdvisoryService.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_COMMENT_VALUE}, m3647m = "UpdateRestrictedStock")
    /* renamed from: advisory.proto.v1.RestAdvisoryService$UpdateRestrictedStock$1 */
    static final class C05331 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C05331(Continuation<? super C05331> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestAdvisoryService.this.UpdateRestrictedStock((UpdateRestrictedStockRequestDto) null, this);
        }
    }

    /* compiled from: RestAdvisoryService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "advisory.proto.v1.RestAdvisoryService", m3645f = "RestAdvisoryService.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_NEW_WINDOW_VALUE}, m3647m = "UpdateRestrictedStock")
    /* renamed from: advisory.proto.v1.RestAdvisoryService$UpdateRestrictedStock$2 */
    static final class C05342 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C05342(Continuation<? super C05342> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestAdvisoryService.this.UpdateRestrictedStock((Request<UpdateRestrictedStockRequestDto>) null, this);
        }
    }

    public RestAdvisoryService(AdvisoryServiceRetrofit retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        this.retrofit = retrofit;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // advisory.proto.p008v1.AdvisoryService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetManagedPortfolio(GetManagedPortfolioRequestDto getManagedPortfolioRequestDto, Continuation<? super GetManagedPortfolioResponseDto> continuation) {
        C05011 c05011;
        if (continuation instanceof C05011) {
            c05011 = (C05011) continuation;
            int i = c05011.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c05011.label = i - Integer.MIN_VALUE;
            } else {
                c05011 = new C05011(continuation);
            }
        }
        Object objGetManagedPortfolio = c05011.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c05011.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetManagedPortfolio);
            Request<GetManagedPortfolioRequestDto> request = new Request<>(getManagedPortfolioRequestDto, null, 2, null);
            c05011.label = 1;
            objGetManagedPortfolio = GetManagedPortfolio(request, c05011);
            if (objGetManagedPortfolio == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetManagedPortfolio);
        }
        return ((Response) objGetManagedPortfolio).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetManagedPortfolio(Request<GetManagedPortfolioRequestDto> request, Continuation<? super Response<GetManagedPortfolioResponseDto>> continuation) {
        C05022 c05022;
        if (continuation instanceof C05022) {
            c05022 = (C05022) continuation;
            int i = c05022.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c05022.label = i - Integer.MIN_VALUE;
            } else {
                c05022 = new C05022(continuation);
            }
        }
        Object objGetManagedPortfolio = c05022.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c05022.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetManagedPortfolio);
            AdvisoryServiceRetrofit advisoryServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String account_number = request.getData().getAccount_number();
            c05022.label = 1;
            objGetManagedPortfolio = advisoryServiceRetrofit.GetManagedPortfolio(metadata, account_number, c05022);
            if (objGetManagedPortfolio == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetManagedPortfolio);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetManagedPortfolio);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // advisory.proto.p008v1.AdvisoryService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetReturnsBreakdown(GetReturnsBreakdownRequestDto getReturnsBreakdownRequestDto, Continuation<? super GetReturnsBreakdownResponseDto> continuation) {
        C05111 c05111;
        if (continuation instanceof C05111) {
            c05111 = (C05111) continuation;
            int i = c05111.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c05111.label = i - Integer.MIN_VALUE;
            } else {
                c05111 = new C05111(continuation);
            }
        }
        Object objGetReturnsBreakdown = c05111.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c05111.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetReturnsBreakdown);
            Request<GetReturnsBreakdownRequestDto> request = new Request<>(getReturnsBreakdownRequestDto, null, 2, null);
            c05111.label = 1;
            objGetReturnsBreakdown = GetReturnsBreakdown(request, c05111);
            if (objGetReturnsBreakdown == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetReturnsBreakdown);
        }
        return ((Response) objGetReturnsBreakdown).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetReturnsBreakdown(Request<GetReturnsBreakdownRequestDto> request, Continuation<? super Response<GetReturnsBreakdownResponseDto>> continuation) {
        C05122 c05122;
        if (continuation instanceof C05122) {
            c05122 = (C05122) continuation;
            int i = c05122.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c05122.label = i - Integer.MIN_VALUE;
            } else {
                c05122 = new C05122(continuation);
            }
        }
        Object objGetReturnsBreakdown = c05122.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c05122.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetReturnsBreakdown);
            AdvisoryServiceRetrofit advisoryServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String account_number = request.getData().getAccount_number();
            String span = request.getData().getSpan();
            c05122.label = 1;
            objGetReturnsBreakdown = advisoryServiceRetrofit.GetReturnsBreakdown(metadata, account_number, span, c05122);
            if (objGetReturnsBreakdown == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetReturnsBreakdown);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetReturnsBreakdown);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetAdvisoryFeesList(GetAdvisoryFeesListRequestDto getAdvisoryFeesListRequestDto, Continuation<? super GetAdvisoryFeesListResponseDto> continuation) {
        C04771 c04771;
        if (continuation instanceof C04771) {
            c04771 = (C04771) continuation;
            int i = c04771.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c04771.label = i - Integer.MIN_VALUE;
            } else {
                c04771 = new C04771(continuation);
            }
        }
        Object objGetAdvisoryFeesList = c04771.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c04771.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetAdvisoryFeesList);
            Request<GetAdvisoryFeesListRequestDto> request = new Request<>(getAdvisoryFeesListRequestDto, null, 2, null);
            c04771.label = 1;
            objGetAdvisoryFeesList = GetAdvisoryFeesList(request, c04771);
            if (objGetAdvisoryFeesList == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetAdvisoryFeesList);
        }
        return ((Response) objGetAdvisoryFeesList).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetAdvisoryFeesList(Request<GetAdvisoryFeesListRequestDto> request, Continuation<? super Response<GetAdvisoryFeesListResponseDto>> continuation) {
        C04782 c04782;
        if (continuation instanceof C04782) {
            c04782 = (C04782) continuation;
            int i = c04782.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c04782.label = i - Integer.MIN_VALUE;
            } else {
                c04782 = new C04782(continuation);
            }
        }
        C04782 c047822 = c04782;
        Object objGetAdvisoryFeesList = c047822.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c047822.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetAdvisoryFeesList);
            AdvisoryServiceRetrofit advisoryServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String cursor = request.getData().getCursor();
            Integer page_size = request.getData().getPage_size();
            String account_number = request.getData().getAccount_number();
            c047822.label = 1;
            objGetAdvisoryFeesList = advisoryServiceRetrofit.GetAdvisoryFeesList(metadata, cursor, page_size, account_number, c047822);
            if (objGetAdvisoryFeesList == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetAdvisoryFeesList);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetAdvisoryFeesList);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // advisory.proto.p008v1.AdvisoryService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetFutureProjectionDisclosure(GetFutureProjectionDisclosureRequestDto getFutureProjectionDisclosureRequestDto, Continuation<? super GetFutureProjectionDisclosureResponseDto> continuation) {
        C04971 c04971;
        if (continuation instanceof C04971) {
            c04971 = (C04971) continuation;
            int i = c04971.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c04971.label = i - Integer.MIN_VALUE;
            } else {
                c04971 = new C04971(continuation);
            }
        }
        Object objGetFutureProjectionDisclosure = c04971.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c04971.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetFutureProjectionDisclosure);
            Request<GetFutureProjectionDisclosureRequestDto> request = new Request<>(getFutureProjectionDisclosureRequestDto, null, 2, null);
            c04971.label = 1;
            objGetFutureProjectionDisclosure = GetFutureProjectionDisclosure(request, c04971);
            if (objGetFutureProjectionDisclosure == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetFutureProjectionDisclosure);
        }
        return ((Response) objGetFutureProjectionDisclosure).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetFutureProjectionDisclosure(Request<GetFutureProjectionDisclosureRequestDto> request, Continuation<? super Response<GetFutureProjectionDisclosureResponseDto>> continuation) {
        C04982 c04982;
        if (continuation instanceof C04982) {
            c04982 = (C04982) continuation;
            int i = c04982.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c04982.label = i - Integer.MIN_VALUE;
            } else {
                c04982 = new C04982(continuation);
            }
        }
        Object objGetFutureProjectionDisclosure = c04982.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c04982.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetFutureProjectionDisclosure);
            AdvisoryServiceRetrofit advisoryServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String id = !Intrinsics.areEqual(request.getData().getId(), "") ? request.getData().getId() : null;
            String account_number = Intrinsics.areEqual(request.getData().getAccount_number(), "") ? null : request.getData().getAccount_number();
            c04982.label = 1;
            objGetFutureProjectionDisclosure = advisoryServiceRetrofit.GetFutureProjectionDisclosure(metadata, id, account_number, c04982);
            if (objGetFutureProjectionDisclosure == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetFutureProjectionDisclosure);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetFutureProjectionDisclosure);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // advisory.proto.p008v1.AdvisoryService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetStrategiesValueProps(GetStrategiesValuePropsRequestDto getStrategiesValuePropsRequestDto, Continuation<? super GetStrategiesValuePropsResponseDto> continuation) {
        C05131 c05131;
        if (continuation instanceof C05131) {
            c05131 = (C05131) continuation;
            int i = c05131.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c05131.label = i - Integer.MIN_VALUE;
            } else {
                c05131 = new C05131(continuation);
            }
        }
        Object objGetStrategiesValueProps = c05131.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c05131.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetStrategiesValueProps);
            Request<GetStrategiesValuePropsRequestDto> request = new Request<>(getStrategiesValuePropsRequestDto, null, 2, null);
            c05131.label = 1;
            objGetStrategiesValueProps = GetStrategiesValueProps(request, c05131);
            if (objGetStrategiesValueProps == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetStrategiesValueProps);
        }
        return ((Response) objGetStrategiesValueProps).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetStrategiesValueProps(Request<GetStrategiesValuePropsRequestDto> request, Continuation<? super Response<GetStrategiesValuePropsResponseDto>> continuation) {
        C05142 c05142;
        if (continuation instanceof C05142) {
            c05142 = (C05142) continuation;
            int i = c05142.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c05142.label = i - Integer.MIN_VALUE;
            } else {
                c05142 = new C05142(continuation);
            }
        }
        Object objGetStrategiesValueProps = c05142.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c05142.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetStrategiesValueProps);
            AdvisoryServiceRetrofit advisoryServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String campaign = request.getData().getCampaign();
            c05142.label = 1;
            objGetStrategiesValueProps = advisoryServiceRetrofit.GetStrategiesValueProps(metadata, campaign, c05142);
            if (objGetStrategiesValueProps == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetStrategiesValueProps);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetStrategiesValueProps);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // advisory.proto.p008v1.AdvisoryService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetAdvisoryInsights(GetAdvisoryInsightsRequestDto getAdvisoryInsightsRequestDto, Continuation<? super GetAdvisoryInsightsResponseDto> continuation) {
        C04811 c04811;
        if (continuation instanceof C04811) {
            c04811 = (C04811) continuation;
            int i = c04811.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c04811.label = i - Integer.MIN_VALUE;
            } else {
                c04811 = new C04811(continuation);
            }
        }
        Object objGetAdvisoryInsights = c04811.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c04811.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetAdvisoryInsights);
            Request<GetAdvisoryInsightsRequestDto> request = new Request<>(getAdvisoryInsightsRequestDto, null, 2, null);
            c04811.label = 1;
            objGetAdvisoryInsights = GetAdvisoryInsights(request, c04811);
            if (objGetAdvisoryInsights == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetAdvisoryInsights);
        }
        return ((Response) objGetAdvisoryInsights).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetAdvisoryInsights(Request<GetAdvisoryInsightsRequestDto> request, Continuation<? super Response<GetAdvisoryInsightsResponseDto>> continuation) {
        C04822 c04822;
        if (continuation instanceof C04822) {
            c04822 = (C04822) continuation;
            int i = c04822.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c04822.label = i - Integer.MIN_VALUE;
            } else {
                c04822 = new C04822(continuation);
            }
        }
        C04822 c048222 = c04822;
        Object objGetAdvisoryInsights = c048222.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c048222.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetAdvisoryInsights);
            AdvisoryServiceRetrofit advisoryServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String cursor = request.getData().getCursor();
            Integer page_size = request.getData().getPage_size();
            String account_number = !Intrinsics.areEqual(request.getData().getAccount_number(), "") ? request.getData().getAccount_number() : null;
            InsightTypeDto insight_type = request.getData().getInsight_type() != InsightTypeDto.INSTANCE.getZeroValue() ? request.getData().getInsight_type() : null;
            c048222.label = 1;
            objGetAdvisoryInsights = advisoryServiceRetrofit.GetAdvisoryInsights(metadata, cursor, page_size, account_number, insight_type, c048222);
            if (objGetAdvisoryInsights == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetAdvisoryInsights);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetAdvisoryInsights);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // advisory.proto.p008v1.AdvisoryService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetAdvisoryInsightDetails(GetAdvisoryInsightDetailsRequestDto getAdvisoryInsightDetailsRequestDto, Continuation<? super GetAdvisoryInsightDetailsResponseDto> continuation) {
        C04791 c04791;
        if (continuation instanceof C04791) {
            c04791 = (C04791) continuation;
            int i = c04791.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c04791.label = i - Integer.MIN_VALUE;
            } else {
                c04791 = new C04791(continuation);
            }
        }
        Object objGetAdvisoryInsightDetails = c04791.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c04791.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetAdvisoryInsightDetails);
            Request<GetAdvisoryInsightDetailsRequestDto> request = new Request<>(getAdvisoryInsightDetailsRequestDto, null, 2, null);
            c04791.label = 1;
            objGetAdvisoryInsightDetails = GetAdvisoryInsightDetails(request, c04791);
            if (objGetAdvisoryInsightDetails == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetAdvisoryInsightDetails);
        }
        return ((Response) objGetAdvisoryInsightDetails).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetAdvisoryInsightDetails(Request<GetAdvisoryInsightDetailsRequestDto> request, Continuation<? super Response<GetAdvisoryInsightDetailsResponseDto>> continuation) {
        C04802 c04802;
        if (continuation instanceof C04802) {
            c04802 = (C04802) continuation;
            int i = c04802.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c04802.label = i - Integer.MIN_VALUE;
            } else {
                c04802 = new C04802(continuation);
            }
        }
        Object objGetAdvisoryInsightDetails = c04802.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c04802.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetAdvisoryInsightDetails);
            AdvisoryServiceRetrofit advisoryServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String insight_id = request.getData().getInsight_id();
            String account_number = !Intrinsics.areEqual(request.getData().getAccount_number(), "") ? request.getData().getAccount_number() : null;
            c04802.label = 1;
            objGetAdvisoryInsightDetails = advisoryServiceRetrofit.GetAdvisoryInsightDetails(metadata, insight_id, account_number, c04802);
            if (objGetAdvisoryInsightDetails == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetAdvisoryInsightDetails);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetAdvisoryInsightDetails);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // advisory.proto.p008v1.AdvisoryService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetUnseenAdvisoryInsights(GetUnseenAdvisoryInsightsRequestDto getUnseenAdvisoryInsightsRequestDto, Continuation<? super GetUnseenAdvisoryInsightsResponseDto> continuation) {
        C05231 c05231;
        if (continuation instanceof C05231) {
            c05231 = (C05231) continuation;
            int i = c05231.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c05231.label = i - Integer.MIN_VALUE;
            } else {
                c05231 = new C05231(continuation);
            }
        }
        Object objGetUnseenAdvisoryInsights = c05231.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c05231.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetUnseenAdvisoryInsights);
            Request<GetUnseenAdvisoryInsightsRequestDto> request = new Request<>(getUnseenAdvisoryInsightsRequestDto, null, 2, null);
            c05231.label = 1;
            objGetUnseenAdvisoryInsights = GetUnseenAdvisoryInsights(request, c05231);
            if (objGetUnseenAdvisoryInsights == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetUnseenAdvisoryInsights);
        }
        return ((Response) objGetUnseenAdvisoryInsights).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetUnseenAdvisoryInsights(Request<GetUnseenAdvisoryInsightsRequestDto> request, Continuation<? super Response<GetUnseenAdvisoryInsightsResponseDto>> continuation) {
        C05242 c05242;
        if (continuation instanceof C05242) {
            c05242 = (C05242) continuation;
            int i = c05242.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c05242.label = i - Integer.MIN_VALUE;
            } else {
                c05242 = new C05242(continuation);
            }
        }
        C05242 c052422 = c05242;
        Object objGetUnseenAdvisoryInsights = c052422.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c052422.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetUnseenAdvisoryInsights);
            AdvisoryServiceRetrofit advisoryServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String cursor = request.getData().getCursor();
            Integer page_size = request.getData().getPage_size();
            String account_number = !Intrinsics.areEqual(request.getData().getAccount_number(), "") ? request.getData().getAccount_number() : null;
            c052422.label = 1;
            objGetUnseenAdvisoryInsights = advisoryServiceRetrofit.GetUnseenAdvisoryInsights(metadata, cursor, page_size, account_number, c052422);
            if (objGetUnseenAdvisoryInsights == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetUnseenAdvisoryInsights);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetUnseenAdvisoryInsights);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // advisory.proto.p008v1.AdvisoryService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object MarkAdvisoryInsightAsSeen(MarkAdvisoryInsightAsSeenRequestDto markAdvisoryInsightAsSeenRequestDto, Continuation<Object> continuation) {
        C05251 c05251;
        if (continuation instanceof C05251) {
            c05251 = (C05251) continuation;
            int i = c05251.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c05251.label = i - Integer.MIN_VALUE;
            } else {
                c05251 = new C05251(continuation);
            }
        }
        Object objMarkAdvisoryInsightAsSeen = c05251.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c05251.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objMarkAdvisoryInsightAsSeen);
            Request<MarkAdvisoryInsightAsSeenRequestDto> request = new Request<>(markAdvisoryInsightAsSeenRequestDto, null, 2, null);
            c05251.label = 1;
            objMarkAdvisoryInsightAsSeen = MarkAdvisoryInsightAsSeen(request, c05251);
            if (objMarkAdvisoryInsightAsSeen == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objMarkAdvisoryInsightAsSeen);
        }
        return ((Response) objMarkAdvisoryInsightAsSeen).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object MarkAdvisoryInsightAsSeen(Request<MarkAdvisoryInsightAsSeenRequestDto> request, Continuation<? super Response<Object>> continuation) {
        C05262 c05262;
        if (continuation instanceof C05262) {
            c05262 = (C05262) continuation;
            int i = c05262.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c05262.label = i - Integer.MIN_VALUE;
            } else {
                c05262 = new C05262(continuation);
            }
        }
        Object objMarkAdvisoryInsightAsSeen = c05262.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c05262.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objMarkAdvisoryInsightAsSeen);
            AdvisoryServiceRetrofit advisoryServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            MarkAdvisoryInsightAsSeenBodyDto body = request.getData().getBody();
            if (body != null) {
                c05262.label = 1;
                objMarkAdvisoryInsightAsSeen = advisoryServiceRetrofit.MarkAdvisoryInsightAsSeen(metadata, body, c05262);
                if (objMarkAdvisoryInsightAsSeen == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                throw new IllegalStateException("Missing body");
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objMarkAdvisoryInsightAsSeen);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objMarkAdvisoryInsightAsSeen);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // advisory.proto.p008v1.AdvisoryService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetAdvisoryDepositGoldValueProp(GetAdvisoryDepositGoldValuePropRequestDto getAdvisoryDepositGoldValuePropRequestDto, Continuation<? super GetAdvisoryDepositGoldValuePropResponseDto> continuation) {
        C04751 c04751;
        if (continuation instanceof C04751) {
            c04751 = (C04751) continuation;
            int i = c04751.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c04751.label = i - Integer.MIN_VALUE;
            } else {
                c04751 = new C04751(continuation);
            }
        }
        Object objGetAdvisoryDepositGoldValueProp = c04751.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c04751.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetAdvisoryDepositGoldValueProp);
            Request<GetAdvisoryDepositGoldValuePropRequestDto> request = new Request<>(getAdvisoryDepositGoldValuePropRequestDto, null, 2, null);
            c04751.label = 1;
            objGetAdvisoryDepositGoldValueProp = GetAdvisoryDepositGoldValueProp(request, c04751);
            if (objGetAdvisoryDepositGoldValueProp == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetAdvisoryDepositGoldValueProp);
        }
        return ((Response) objGetAdvisoryDepositGoldValueProp).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetAdvisoryDepositGoldValueProp(Request<GetAdvisoryDepositGoldValuePropRequestDto> request, Continuation<? super Response<GetAdvisoryDepositGoldValuePropResponseDto>> continuation) {
        C04762 c04762;
        if (continuation instanceof C04762) {
            c04762 = (C04762) continuation;
            int i = c04762.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c04762.label = i - Integer.MIN_VALUE;
            } else {
                c04762 = new C04762(continuation);
            }
        }
        Object objGetAdvisoryDepositGoldValueProp = c04762.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c04762.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetAdvisoryDepositGoldValueProp);
            AdvisoryServiceRetrofit advisoryServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String account_number = !Intrinsics.areEqual(request.getData().getAccount_number(), "") ? request.getData().getAccount_number() : null;
            c04762.label = 1;
            objGetAdvisoryDepositGoldValueProp = advisoryServiceRetrofit.GetAdvisoryDepositGoldValueProp(metadata, account_number, c04762);
            if (objGetAdvisoryDepositGoldValueProp == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetAdvisoryDepositGoldValueProp);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetAdvisoryDepositGoldValueProp);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // advisory.proto.p008v1.AdvisoryService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetDepositPromoCard(GetDepositPromoCardRequestDto getDepositPromoCardRequestDto, Continuation<? super GetDepositPromoCardResponseDto> continuation) {
        C04891 c04891;
        if (continuation instanceof C04891) {
            c04891 = (C04891) continuation;
            int i = c04891.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c04891.label = i - Integer.MIN_VALUE;
            } else {
                c04891 = new C04891(continuation);
            }
        }
        Object objGetDepositPromoCard = c04891.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c04891.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetDepositPromoCard);
            Request<GetDepositPromoCardRequestDto> request = new Request<>(getDepositPromoCardRequestDto, null, 2, null);
            c04891.label = 1;
            objGetDepositPromoCard = GetDepositPromoCard(request, c04891);
            if (objGetDepositPromoCard == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetDepositPromoCard);
        }
        return ((Response) objGetDepositPromoCard).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetDepositPromoCard(Request<GetDepositPromoCardRequestDto> request, Continuation<? super Response<GetDepositPromoCardResponseDto>> continuation) {
        C04902 c04902;
        if (continuation instanceof C04902) {
            c04902 = (C04902) continuation;
            int i = c04902.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c04902.label = i - Integer.MIN_VALUE;
            } else {
                c04902 = new C04902(continuation);
            }
        }
        Object objGetDepositPromoCard = c04902.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c04902.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetDepositPromoCard);
            AdvisoryServiceRetrofit advisoryServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String account_number = !Intrinsics.areEqual(request.getData().getAccount_number(), "") ? request.getData().getAccount_number() : null;
            c04902.label = 1;
            objGetDepositPromoCard = advisoryServiceRetrofit.GetDepositPromoCard(metadata, account_number, c04902);
            if (objGetDepositPromoCard == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetDepositPromoCard);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetDepositPromoCard);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // advisory.proto.p008v1.AdvisoryService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetDepositPromoDetails(GetDepositPromoDetailsRequestDto getDepositPromoDetailsRequestDto, Continuation<? super GetDepositPromoDetailsResponseDto> continuation) {
        C04911 c04911;
        if (continuation instanceof C04911) {
            c04911 = (C04911) continuation;
            int i = c04911.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c04911.label = i - Integer.MIN_VALUE;
            } else {
                c04911 = new C04911(continuation);
            }
        }
        Object objGetDepositPromoDetails = c04911.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c04911.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetDepositPromoDetails);
            Request<GetDepositPromoDetailsRequestDto> request = new Request<>(getDepositPromoDetailsRequestDto, null, 2, null);
            c04911.label = 1;
            objGetDepositPromoDetails = GetDepositPromoDetails(request, c04911);
            if (objGetDepositPromoDetails == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetDepositPromoDetails);
        }
        return ((Response) objGetDepositPromoDetails).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetDepositPromoDetails(Request<GetDepositPromoDetailsRequestDto> request, Continuation<? super Response<GetDepositPromoDetailsResponseDto>> continuation) {
        C04922 c04922;
        if (continuation instanceof C04922) {
            c04922 = (C04922) continuation;
            int i = c04922.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c04922.label = i - Integer.MIN_VALUE;
            } else {
                c04922 = new C04922(continuation);
            }
        }
        Object objGetDepositPromoDetails = c04922.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c04922.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetDepositPromoDetails);
            AdvisoryServiceRetrofit advisoryServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String campaign = request.getData().getCampaign();
            Boolean boolBoxBoolean = request.getData().is_ira_transfer() ? boxing.boxBoolean(request.getData().is_ira_transfer()) : null;
            c04922.label = 1;
            objGetDepositPromoDetails = advisoryServiceRetrofit.GetDepositPromoDetails(metadata, campaign, boolBoxBoolean, c04922);
            if (objGetDepositPromoDetails == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetDepositPromoDetails);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetDepositPromoDetails);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // advisory.proto.p008v1.AdvisoryService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetManagedPortfolioRestrictedStocks(GetManagedPortfolioRestrictedStocksRequestDto getManagedPortfolioRestrictedStocksRequestDto, Continuation<? super GetManagedPortfolioRestrictedStocksResponseDto> continuation) {
        C05031 c05031;
        if (continuation instanceof C05031) {
            c05031 = (C05031) continuation;
            int i = c05031.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c05031.label = i - Integer.MIN_VALUE;
            } else {
                c05031 = new C05031(continuation);
            }
        }
        Object objGetManagedPortfolioRestrictedStocks = c05031.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c05031.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetManagedPortfolioRestrictedStocks);
            Request<GetManagedPortfolioRestrictedStocksRequestDto> request = new Request<>(getManagedPortfolioRestrictedStocksRequestDto, null, 2, null);
            c05031.label = 1;
            objGetManagedPortfolioRestrictedStocks = GetManagedPortfolioRestrictedStocks(request, c05031);
            if (objGetManagedPortfolioRestrictedStocks == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetManagedPortfolioRestrictedStocks);
        }
        return ((Response) objGetManagedPortfolioRestrictedStocks).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetManagedPortfolioRestrictedStocks(Request<GetManagedPortfolioRestrictedStocksRequestDto> request, Continuation<? super Response<GetManagedPortfolioRestrictedStocksResponseDto>> continuation) {
        C05042 c05042;
        if (continuation instanceof C05042) {
            c05042 = (C05042) continuation;
            int i = c05042.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c05042.label = i - Integer.MIN_VALUE;
            } else {
                c05042 = new C05042(continuation);
            }
        }
        Object objGetManagedPortfolioRestrictedStocks = c05042.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c05042.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetManagedPortfolioRestrictedStocks);
            AdvisoryServiceRetrofit advisoryServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String account_number = !Intrinsics.areEqual(request.getData().getAccount_number(), "") ? request.getData().getAccount_number() : null;
            c05042.label = 1;
            objGetManagedPortfolioRestrictedStocks = advisoryServiceRetrofit.GetManagedPortfolioRestrictedStocks(metadata, account_number, c05042);
            if (objGetManagedPortfolioRestrictedStocks == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetManagedPortfolioRestrictedStocks);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetManagedPortfolioRestrictedStocks);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // advisory.proto.p008v1.AdvisoryService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object SearchRestrictableStocks(SearchRestrictableStocksRequestDto searchRestrictableStocksRequestDto, Continuation<? super SearchRestrictableStocksResponseDto> continuation) {
        C05271 c05271;
        if (continuation instanceof C05271) {
            c05271 = (C05271) continuation;
            int i = c05271.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c05271.label = i - Integer.MIN_VALUE;
            } else {
                c05271 = new C05271(continuation);
            }
        }
        Object objSearchRestrictableStocks = c05271.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c05271.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objSearchRestrictableStocks);
            Request<SearchRestrictableStocksRequestDto> request = new Request<>(searchRestrictableStocksRequestDto, null, 2, null);
            c05271.label = 1;
            objSearchRestrictableStocks = SearchRestrictableStocks(request, c05271);
            if (objSearchRestrictableStocks == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objSearchRestrictableStocks);
        }
        return ((Response) objSearchRestrictableStocks).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object SearchRestrictableStocks(Request<SearchRestrictableStocksRequestDto> request, Continuation<? super Response<SearchRestrictableStocksResponseDto>> continuation) {
        C05282 c05282;
        if (continuation instanceof C05282) {
            c05282 = (C05282) continuation;
            int i = c05282.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c05282.label = i - Integer.MIN_VALUE;
            } else {
                c05282 = new C05282(continuation);
            }
        }
        Object objSearchRestrictableStocks = c05282.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c05282.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objSearchRestrictableStocks);
            AdvisoryServiceRetrofit advisoryServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String query = !Intrinsics.areEqual(request.getData().getQuery(), "") ? request.getData().getQuery() : null;
            String user_origin = Intrinsics.areEqual(request.getData().getUser_origin(), "") ? null : request.getData().getUser_origin();
            c05282.label = 1;
            objSearchRestrictableStocks = advisoryServiceRetrofit.SearchRestrictableStocks(metadata, query, user_origin, c05282);
            if (objSearchRestrictableStocks == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objSearchRestrictableStocks);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objSearchRestrictableStocks);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // advisory.proto.p008v1.AdvisoryService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object UpdateRestrictedStock(UpdateRestrictedStockRequestDto updateRestrictedStockRequestDto, Continuation<Object> continuation) {
        C05331 c05331;
        if (continuation instanceof C05331) {
            c05331 = (C05331) continuation;
            int i = c05331.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c05331.label = i - Integer.MIN_VALUE;
            } else {
                c05331 = new C05331(continuation);
            }
        }
        Object objUpdateRestrictedStock = c05331.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c05331.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objUpdateRestrictedStock);
            Request<UpdateRestrictedStockRequestDto> request = new Request<>(updateRestrictedStockRequestDto, null, 2, null);
            c05331.label = 1;
            objUpdateRestrictedStock = UpdateRestrictedStock(request, c05331);
            if (objUpdateRestrictedStock == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objUpdateRestrictedStock);
        }
        return ((Response) objUpdateRestrictedStock).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object UpdateRestrictedStock(Request<UpdateRestrictedStockRequestDto> request, Continuation<? super Response<Object>> continuation) {
        C05342 c05342;
        if (continuation instanceof C05342) {
            c05342 = (C05342) continuation;
            int i = c05342.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c05342.label = i - Integer.MIN_VALUE;
            } else {
                c05342 = new C05342(continuation);
            }
        }
        C05342 c053422 = c05342;
        Object objUpdateRestrictedStock = c053422.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c053422.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objUpdateRestrictedStock);
            AdvisoryServiceRetrofit advisoryServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String account_number = !Intrinsics.areEqual(request.getData().getAccount_number(), "") ? request.getData().getAccount_number() : null;
            String id = !Intrinsics.areEqual(request.getData().getId(), "") ? request.getData().getId() : null;
            Boolean boolBoxBoolean = request.getData().is_restricted() ? boxing.boxBoolean(request.getData().is_restricted()) : null;
            c053422.label = 1;
            objUpdateRestrictedStock = advisoryServiceRetrofit.UpdateRestrictedStock(metadata, account_number, id, boolBoxBoolean, c053422);
            if (objUpdateRestrictedStock == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objUpdateRestrictedStock);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objUpdateRestrictedStock);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // advisory.proto.p008v1.AdvisoryService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetDashboardDisclosure(GetDashboardDisclosureRequestDto getDashboardDisclosureRequestDto, Continuation<? super GetDashboardDisclosureResponseDto> continuation) {
        C04871 c04871;
        if (continuation instanceof C04871) {
            c04871 = (C04871) continuation;
            int i = c04871.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c04871.label = i - Integer.MIN_VALUE;
            } else {
                c04871 = new C04871(continuation);
            }
        }
        Object objGetDashboardDisclosure = c04871.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c04871.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetDashboardDisclosure);
            Request<GetDashboardDisclosureRequestDto> request = new Request<>(getDashboardDisclosureRequestDto, null, 2, null);
            c04871.label = 1;
            objGetDashboardDisclosure = GetDashboardDisclosure(request, c04871);
            if (objGetDashboardDisclosure == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetDashboardDisclosure);
        }
        return ((Response) objGetDashboardDisclosure).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetDashboardDisclosure(Request<GetDashboardDisclosureRequestDto> request, Continuation<? super Response<GetDashboardDisclosureResponseDto>> continuation) {
        C04882 c04882;
        if (continuation instanceof C04882) {
            c04882 = (C04882) continuation;
            int i = c04882.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c04882.label = i - Integer.MIN_VALUE;
            } else {
                c04882 = new C04882(continuation);
            }
        }
        Object objGetDashboardDisclosure = c04882.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c04882.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetDashboardDisclosure);
            AdvisoryServiceRetrofit advisoryServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String account_number = !Intrinsics.areEqual(request.getData().getAccount_number(), "") ? request.getData().getAccount_number() : null;
            c04882.label = 1;
            objGetDashboardDisclosure = advisoryServiceRetrofit.GetDashboardDisclosure(metadata, account_number, c04882);
            if (objGetDashboardDisclosure == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetDashboardDisclosure);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetDashboardDisclosure);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // advisory.proto.p008v1.AdvisoryService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetFullWithdrawalSummary(GetFullWithdrawalSummaryRequestDto getFullWithdrawalSummaryRequestDto, Continuation<? super GetFullWithdrawalSummaryResponseDto> continuation) {
        C04951 c04951;
        if (continuation instanceof C04951) {
            c04951 = (C04951) continuation;
            int i = c04951.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c04951.label = i - Integer.MIN_VALUE;
            } else {
                c04951 = new C04951(continuation);
            }
        }
        Object objGetFullWithdrawalSummary = c04951.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c04951.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetFullWithdrawalSummary);
            Request<GetFullWithdrawalSummaryRequestDto> request = new Request<>(getFullWithdrawalSummaryRequestDto, null, 2, null);
            c04951.label = 1;
            objGetFullWithdrawalSummary = GetFullWithdrawalSummary(request, c04951);
            if (objGetFullWithdrawalSummary == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetFullWithdrawalSummary);
        }
        return ((Response) objGetFullWithdrawalSummary).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetFullWithdrawalSummary(Request<GetFullWithdrawalSummaryRequestDto> request, Continuation<? super Response<GetFullWithdrawalSummaryResponseDto>> continuation) {
        C04962 c04962;
        IRADistributionDataDto distribution_data;
        IRADistributionDataDto distribution_data2;
        IRADistributionDataDto distribution_data3;
        if (continuation instanceof C04962) {
            c04962 = (C04962) continuation;
            int i = c04962.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c04962.label = i - Integer.MIN_VALUE;
            } else {
                c04962 = new C04962(continuation);
            }
        }
        C04962 c049622 = c04962;
        Object objGetFullWithdrawalSummary = c049622.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c049622.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetFullWithdrawalSummary);
            AdvisoryServiceRetrofit advisoryServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String postal_state = null;
            String account_number = !Intrinsics.areEqual(request.getData().getAccount_number(), "") ? request.getData().getAccount_number() : null;
            IRADistributionDataDto distribution_data4 = request.getData().getDistribution_data();
            Double dBoxDouble = (Intrinsics.areEqual(distribution_data4 != null ? boxing.boxDouble(distribution_data4.getFederal_tax_withholding_rate()) : null, 0.0d) || (distribution_data3 = request.getData().getDistribution_data()) == null) ? null : boxing.boxDouble(distribution_data3.getFederal_tax_withholding_rate());
            IRADistributionDataDto distribution_data5 = request.getData().getDistribution_data();
            Double dBoxDouble2 = (Intrinsics.areEqual(distribution_data5 != null ? boxing.boxDouble(distribution_data5.getState_tax_withholding_rate()) : null, 0.0d) || (distribution_data2 = request.getData().getDistribution_data()) == null) ? null : boxing.boxDouble(distribution_data2.getState_tax_withholding_rate());
            IRADistributionDataDto distribution_data6 = request.getData().getDistribution_data();
            if (!Intrinsics.areEqual(distribution_data6 != null ? distribution_data6.getPostal_state() : null, "") && (distribution_data = request.getData().getDistribution_data()) != null) {
                postal_state = distribution_data.getPostal_state();
            }
            c049622.label = 1;
            objGetFullWithdrawalSummary = advisoryServiceRetrofit.GetFullWithdrawalSummary(metadata, account_number, dBoxDouble, dBoxDouble2, postal_state, c049622);
            if (objGetFullWithdrawalSummary == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetFullWithdrawalSummary);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetFullWithdrawalSummary);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // advisory.proto.p008v1.AdvisoryService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetModelPortfolioChange(GetModelPortfolioChangeRequestDto getModelPortfolioChangeRequestDto, Continuation<? super GetModelPortfolioChangeResponseDto> continuation) {
        C05051 c05051;
        if (continuation instanceof C05051) {
            c05051 = (C05051) continuation;
            int i = c05051.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c05051.label = i - Integer.MIN_VALUE;
            } else {
                c05051 = new C05051(continuation);
            }
        }
        Object objGetModelPortfolioChange = c05051.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c05051.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetModelPortfolioChange);
            Request<GetModelPortfolioChangeRequestDto> request = new Request<>(getModelPortfolioChangeRequestDto, null, 2, null);
            c05051.label = 1;
            objGetModelPortfolioChange = GetModelPortfolioChange(request, c05051);
            if (objGetModelPortfolioChange == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetModelPortfolioChange);
        }
        return ((Response) objGetModelPortfolioChange).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetModelPortfolioChange(Request<GetModelPortfolioChangeRequestDto> request, Continuation<? super Response<GetModelPortfolioChangeResponseDto>> continuation) {
        C05062 c05062;
        if (continuation instanceof C05062) {
            c05062 = (C05062) continuation;
            int i = c05062.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c05062.label = i - Integer.MIN_VALUE;
            } else {
                c05062 = new C05062(continuation);
            }
        }
        Object objGetModelPortfolioChange = c05062.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c05062.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetModelPortfolioChange);
            AdvisoryServiceRetrofit advisoryServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String account_number = !Intrinsics.areEqual(request.getData().getAccount_number(), "") ? request.getData().getAccount_number() : null;
            c05062.label = 1;
            objGetModelPortfolioChange = advisoryServiceRetrofit.GetModelPortfolioChange(metadata, account_number, c05062);
            if (objGetModelPortfolioChange == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetModelPortfolioChange);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetModelPortfolioChange);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // advisory.proto.p008v1.AdvisoryService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetDepositsSummary(GetDepositsSummaryRequestDto getDepositsSummaryRequestDto, Continuation<? super GetDepositsSummaryResponseDto> continuation) {
        C04931 c04931;
        if (continuation instanceof C04931) {
            c04931 = (C04931) continuation;
            int i = c04931.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c04931.label = i - Integer.MIN_VALUE;
            } else {
                c04931 = new C04931(continuation);
            }
        }
        Object objGetDepositsSummary = c04931.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c04931.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetDepositsSummary);
            Request<GetDepositsSummaryRequestDto> request = new Request<>(getDepositsSummaryRequestDto, null, 2, null);
            c04931.label = 1;
            objGetDepositsSummary = GetDepositsSummary(request, c04931);
            if (objGetDepositsSummary == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetDepositsSummary);
        }
        return ((Response) objGetDepositsSummary).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetDepositsSummary(Request<GetDepositsSummaryRequestDto> request, Continuation<? super Response<GetDepositsSummaryResponseDto>> continuation) {
        C04942 c04942;
        if (continuation instanceof C04942) {
            c04942 = (C04942) continuation;
            int i = c04942.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c04942.label = i - Integer.MIN_VALUE;
            } else {
                c04942 = new C04942(continuation);
            }
        }
        Object objGetDepositsSummary = c04942.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c04942.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetDepositsSummary);
            AdvisoryServiceRetrofit advisoryServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String account_number = !Intrinsics.areEqual(request.getData().getAccount_number(), "") ? request.getData().getAccount_number() : null;
            c04942.label = 1;
            objGetDepositsSummary = advisoryServiceRetrofit.GetDepositsSummary(metadata, account_number, c04942);
            if (objGetDepositsSummary == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetDepositsSummary);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetDepositsSummary);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // advisory.proto.p008v1.AdvisoryService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetRXRStrategiesUpsell(GetRXRStrategiesUpsellRequestDto getRXRStrategiesUpsellRequestDto, Continuation<? super GetRXRStrategiesUpsellResponseDto> continuation) {
        C05071 c05071;
        if (continuation instanceof C05071) {
            c05071 = (C05071) continuation;
            int i = c05071.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c05071.label = i - Integer.MIN_VALUE;
            } else {
                c05071 = new C05071(continuation);
            }
        }
        Object objGetRXRStrategiesUpsell = c05071.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c05071.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetRXRStrategiesUpsell);
            Request<GetRXRStrategiesUpsellRequestDto> request = new Request<>(getRXRStrategiesUpsellRequestDto, null, 2, null);
            c05071.label = 1;
            objGetRXRStrategiesUpsell = GetRXRStrategiesUpsell(request, c05071);
            if (objGetRXRStrategiesUpsell == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetRXRStrategiesUpsell);
        }
        return ((Response) objGetRXRStrategiesUpsell).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetRXRStrategiesUpsell(Request<GetRXRStrategiesUpsellRequestDto> request, Continuation<? super Response<GetRXRStrategiesUpsellResponseDto>> continuation) {
        C05082 c05082;
        if (continuation instanceof C05082) {
            c05082 = (C05082) continuation;
            int i = c05082.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c05082.label = i - Integer.MIN_VALUE;
            } else {
                c05082 = new C05082(continuation);
            }
        }
        Object objGetRXRStrategiesUpsell = c05082.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c05082.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetRXRStrategiesUpsell);
            AdvisoryServiceRetrofit advisoryServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String account_number = !Intrinsics.areEqual(request.getData().getAccount_number(), "") ? request.getData().getAccount_number() : null;
            c05082.label = 1;
            objGetRXRStrategiesUpsell = advisoryServiceRetrofit.GetRXRStrategiesUpsell(metadata, account_number, c05082);
            if (objGetRXRStrategiesUpsell == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetRXRStrategiesUpsell);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetRXRStrategiesUpsell);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // advisory.proto.p008v1.AdvisoryService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetIRAManagementStyleSelection(GetIRAManagementStyleSelectionRequestDto getIRAManagementStyleSelectionRequestDto, Continuation<? super GetIRAManagementStyleSelectionResponseDto> continuation) {
        C04991 c04991;
        if (continuation instanceof C04991) {
            c04991 = (C04991) continuation;
            int i = c04991.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c04991.label = i - Integer.MIN_VALUE;
            } else {
                c04991 = new C04991(continuation);
            }
        }
        Object objGetIRAManagementStyleSelection = c04991.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c04991.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetIRAManagementStyleSelection);
            Request<GetIRAManagementStyleSelectionRequestDto> request = new Request<>(getIRAManagementStyleSelectionRequestDto, null, 2, null);
            c04991.label = 1;
            objGetIRAManagementStyleSelection = GetIRAManagementStyleSelection(request, c04991);
            if (objGetIRAManagementStyleSelection == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetIRAManagementStyleSelection);
        }
        return ((Response) objGetIRAManagementStyleSelection).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetIRAManagementStyleSelection(Request<GetIRAManagementStyleSelectionRequestDto> request, Continuation<? super Response<GetIRAManagementStyleSelectionResponseDto>> continuation) {
        C05002 c05002;
        if (continuation instanceof C05002) {
            c05002 = (C05002) continuation;
            int i = c05002.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c05002.label = i - Integer.MIN_VALUE;
            } else {
                c05002 = new C05002(continuation);
            }
        }
        Object objGetIRAManagementStyleSelection = c05002.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c05002.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetIRAManagementStyleSelection);
            AdvisoryServiceRetrofit advisoryServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            BrokerageAccountTypeDto brokerage_account_type = request.getData().getBrokerage_account_type() != BrokerageAccountTypeDto.INSTANCE.getZeroValue() ? request.getData().getBrokerage_account_type() : null;
            c05002.label = 1;
            objGetIRAManagementStyleSelection = advisoryServiceRetrofit.GetIRAManagementStyleSelection(metadata, brokerage_account_type, c05002);
            if (objGetIRAManagementStyleSelection == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetIRAManagementStyleSelection);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetIRAManagementStyleSelection);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // advisory.proto.p008v1.AdvisoryService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetReturnHub(GetReturnHubRequestDto getReturnHubRequestDto, Continuation<? super GetReturnHubResponseDto> continuation) {
        C05091 c05091;
        if (continuation instanceof C05091) {
            c05091 = (C05091) continuation;
            int i = c05091.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c05091.label = i - Integer.MIN_VALUE;
            } else {
                c05091 = new C05091(continuation);
            }
        }
        Object objGetReturnHub = c05091.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c05091.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetReturnHub);
            Request<GetReturnHubRequestDto> request = new Request<>(getReturnHubRequestDto, null, 2, null);
            c05091.label = 1;
            objGetReturnHub = GetReturnHub(request, c05091);
            if (objGetReturnHub == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetReturnHub);
        }
        return ((Response) objGetReturnHub).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetReturnHub(Request<GetReturnHubRequestDto> request, Continuation<? super Response<GetReturnHubResponseDto>> continuation) {
        C05102 c05102;
        if (continuation instanceof C05102) {
            c05102 = (C05102) continuation;
            int i = c05102.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c05102.label = i - Integer.MIN_VALUE;
            } else {
                c05102 = new C05102(continuation);
            }
        }
        Object objGetReturnHub = c05102.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c05102.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetReturnHub);
            AdvisoryServiceRetrofit advisoryServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String account_number = !Intrinsics.areEqual(request.getData().getAccount_number(), "") ? request.getData().getAccount_number() : null;
            c05102.label = 1;
            objGetReturnHub = advisoryServiceRetrofit.GetReturnHub(metadata, account_number, c05102);
            if (objGetReturnHub == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetReturnHub);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetReturnHub);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // advisory.proto.p008v1.AdvisoryService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetAdvisoryMultiPageInsight(GetAdvisoryMultiPageInsightRequestDto getAdvisoryMultiPageInsightRequestDto, Continuation<? super GetAdvisoryMultiPageInsightResponseDto> continuation) {
        C04831 c04831;
        if (continuation instanceof C04831) {
            c04831 = (C04831) continuation;
            int i = c04831.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c04831.label = i - Integer.MIN_VALUE;
            } else {
                c04831 = new C04831(continuation);
            }
        }
        Object objGetAdvisoryMultiPageInsight = c04831.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c04831.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetAdvisoryMultiPageInsight);
            Request<GetAdvisoryMultiPageInsightRequestDto> request = new Request<>(getAdvisoryMultiPageInsightRequestDto, null, 2, null);
            c04831.label = 1;
            objGetAdvisoryMultiPageInsight = GetAdvisoryMultiPageInsight(request, c04831);
            if (objGetAdvisoryMultiPageInsight == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetAdvisoryMultiPageInsight);
        }
        return ((Response) objGetAdvisoryMultiPageInsight).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetAdvisoryMultiPageInsight(Request<GetAdvisoryMultiPageInsightRequestDto> request, Continuation<? super Response<GetAdvisoryMultiPageInsightResponseDto>> continuation) {
        C04842 c04842;
        if (continuation instanceof C04842) {
            c04842 = (C04842) continuation;
            int i = c04842.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c04842.label = i - Integer.MIN_VALUE;
            } else {
                c04842 = new C04842(continuation);
            }
        }
        Object objGetAdvisoryMultiPageInsight = c04842.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c04842.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetAdvisoryMultiPageInsight);
            AdvisoryServiceRetrofit advisoryServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String insight_id = request.getData().getInsight_id();
            String account_number = !Intrinsics.areEqual(request.getData().getAccount_number(), "") ? request.getData().getAccount_number() : null;
            c04842.label = 1;
            objGetAdvisoryMultiPageInsight = advisoryServiceRetrofit.GetAdvisoryMultiPageInsight(metadata, insight_id, account_number, c04842);
            if (objGetAdvisoryMultiPageInsight == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetAdvisoryMultiPageInsight);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetAdvisoryMultiPageInsight);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // advisory.proto.p008v1.AdvisoryService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetTaxGainsAndLosses(GetTaxGainsAndLossesRequestDto getTaxGainsAndLossesRequestDto, Continuation<? super GetTaxGainsAndLossesResponseDto> continuation) {
        C05151 c05151;
        if (continuation instanceof C05151) {
            c05151 = (C05151) continuation;
            int i = c05151.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c05151.label = i - Integer.MIN_VALUE;
            } else {
                c05151 = new C05151(continuation);
            }
        }
        Object objGetTaxGainsAndLosses = c05151.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c05151.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetTaxGainsAndLosses);
            Request<GetTaxGainsAndLossesRequestDto> request = new Request<>(getTaxGainsAndLossesRequestDto, null, 2, null);
            c05151.label = 1;
            objGetTaxGainsAndLosses = GetTaxGainsAndLosses(request, c05151);
            if (objGetTaxGainsAndLosses == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetTaxGainsAndLosses);
        }
        return ((Response) objGetTaxGainsAndLosses).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetTaxGainsAndLosses(Request<GetTaxGainsAndLossesRequestDto> request, Continuation<? super Response<GetTaxGainsAndLossesResponseDto>> continuation) {
        C05162 c05162;
        if (continuation instanceof C05162) {
            c05162 = (C05162) continuation;
            int i = c05162.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c05162.label = i - Integer.MIN_VALUE;
            } else {
                c05162 = new C05162(continuation);
            }
        }
        Object objGetTaxGainsAndLosses = c05162.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c05162.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetTaxGainsAndLosses);
            AdvisoryServiceRetrofit advisoryServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String year = request.getData().getYear();
            c05162.label = 1;
            objGetTaxGainsAndLosses = advisoryServiceRetrofit.GetTaxGainsAndLosses(metadata, year, c05162);
            if (objGetTaxGainsAndLosses == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetTaxGainsAndLosses);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetTaxGainsAndLosses);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // advisory.proto.p008v1.AdvisoryService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetTaxLossHarvestDashboard(GetTaxLossHarvestDashboardRequestDto getTaxLossHarvestDashboardRequestDto, Continuation<? super GetTaxLossHarvestDashboardResponseDto> continuation) {
        C05171 c05171;
        if (continuation instanceof C05171) {
            c05171 = (C05171) continuation;
            int i = c05171.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c05171.label = i - Integer.MIN_VALUE;
            } else {
                c05171 = new C05171(continuation);
            }
        }
        Object objGetTaxLossHarvestDashboard = c05171.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c05171.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetTaxLossHarvestDashboard);
            Request<GetTaxLossHarvestDashboardRequestDto> request = new Request<>(getTaxLossHarvestDashboardRequestDto, null, 2, null);
            c05171.label = 1;
            objGetTaxLossHarvestDashboard = GetTaxLossHarvestDashboard(request, c05171);
            if (objGetTaxLossHarvestDashboard == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetTaxLossHarvestDashboard);
        }
        return ((Response) objGetTaxLossHarvestDashboard).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetTaxLossHarvestDashboard(Request<GetTaxLossHarvestDashboardRequestDto> request, Continuation<? super Response<GetTaxLossHarvestDashboardResponseDto>> continuation) {
        C05182 c05182;
        if (continuation instanceof C05182) {
            c05182 = (C05182) continuation;
            int i = c05182.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c05182.label = i - Integer.MIN_VALUE;
            } else {
                c05182 = new C05182(continuation);
            }
        }
        Object objGetTaxLossHarvestDashboard = c05182.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c05182.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetTaxLossHarvestDashboard);
            AdvisoryServiceRetrofit advisoryServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String year = request.getData().getYear();
            c05182.label = 1;
            objGetTaxLossHarvestDashboard = advisoryServiceRetrofit.GetTaxLossHarvestDashboard(metadata, year, c05182);
            if (objGetTaxLossHarvestDashboard == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetTaxLossHarvestDashboard);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetTaxLossHarvestDashboard);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // advisory.proto.p008v1.AdvisoryService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetTaxLossHarvestFlow(GetTaxLossHarvestFlowRequestDto getTaxLossHarvestFlowRequestDto, Continuation<? super GetTaxLossHarvestFlowResponseDto> continuation) {
        C05191 c05191;
        if (continuation instanceof C05191) {
            c05191 = (C05191) continuation;
            int i = c05191.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c05191.label = i - Integer.MIN_VALUE;
            } else {
                c05191 = new C05191(continuation);
            }
        }
        Object objGetTaxLossHarvestFlow = c05191.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c05191.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetTaxLossHarvestFlow);
            Request<GetTaxLossHarvestFlowRequestDto> request = new Request<>(getTaxLossHarvestFlowRequestDto, null, 2, null);
            c05191.label = 1;
            objGetTaxLossHarvestFlow = GetTaxLossHarvestFlow(request, c05191);
            if (objGetTaxLossHarvestFlow == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetTaxLossHarvestFlow);
        }
        return ((Response) objGetTaxLossHarvestFlow).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetTaxLossHarvestFlow(Request<GetTaxLossHarvestFlowRequestDto> request, Continuation<? super Response<GetTaxLossHarvestFlowResponseDto>> continuation) {
        C05202 c05202;
        if (continuation instanceof C05202) {
            c05202 = (C05202) continuation;
            int i = c05202.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c05202.label = i - Integer.MIN_VALUE;
            } else {
                c05202 = new C05202(continuation);
            }
        }
        Object objGetTaxLossHarvestFlow = c05202.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c05202.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetTaxLossHarvestFlow);
            AdvisoryServiceRetrofit advisoryServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            c05202.label = 1;
            objGetTaxLossHarvestFlow = advisoryServiceRetrofit.GetTaxLossHarvestFlow(metadata, c05202);
            if (objGetTaxLossHarvestFlow == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetTaxLossHarvestFlow);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetTaxLossHarvestFlow);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // advisory.proto.p008v1.AdvisoryService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetTaxLossHarvestStrategies(GetTaxLossHarvestStrategiesRequestDto getTaxLossHarvestStrategiesRequestDto, Continuation<? super GetTaxLossHarvestStrategiesResponseDto> continuation) {
        C05211 c05211;
        if (continuation instanceof C05211) {
            c05211 = (C05211) continuation;
            int i = c05211.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c05211.label = i - Integer.MIN_VALUE;
            } else {
                c05211 = new C05211(continuation);
            }
        }
        Object objGetTaxLossHarvestStrategies = c05211.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c05211.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetTaxLossHarvestStrategies);
            Request<GetTaxLossHarvestStrategiesRequestDto> request = new Request<>(getTaxLossHarvestStrategiesRequestDto, null, 2, null);
            c05211.label = 1;
            objGetTaxLossHarvestStrategies = GetTaxLossHarvestStrategies(request, c05211);
            if (objGetTaxLossHarvestStrategies == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetTaxLossHarvestStrategies);
        }
        return ((Response) objGetTaxLossHarvestStrategies).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetTaxLossHarvestStrategies(Request<GetTaxLossHarvestStrategiesRequestDto> request, Continuation<? super Response<GetTaxLossHarvestStrategiesResponseDto>> continuation) {
        C05222 c05222;
        if (continuation instanceof C05222) {
            c05222 = (C05222) continuation;
            int i = c05222.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c05222.label = i - Integer.MIN_VALUE;
            } else {
                c05222 = new C05222(continuation);
            }
        }
        Object objGetTaxLossHarvestStrategies = c05222.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c05222.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetTaxLossHarvestStrategies);
            AdvisoryServiceRetrofit advisoryServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            List<String> account_numbers = request.getData().getAccount_numbers();
            c05222.label = 1;
            objGetTaxLossHarvestStrategies = advisoryServiceRetrofit.GetTaxLossHarvestStrategies(metadata, account_numbers, c05222);
            if (objGetTaxLossHarvestStrategies == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetTaxLossHarvestStrategies);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetTaxLossHarvestStrategies);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // advisory.proto.p008v1.AdvisoryService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object SubmitTaxLossHarvestStrategy(SubmitTaxLossHarvestStrategyRequestDto submitTaxLossHarvestStrategyRequestDto, Continuation<? super SubmitTaxLossHarvestStrategyResponseDto> continuation) {
        C05291 c05291;
        if (continuation instanceof C05291) {
            c05291 = (C05291) continuation;
            int i = c05291.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c05291.label = i - Integer.MIN_VALUE;
            } else {
                c05291 = new C05291(continuation);
            }
        }
        Object objSubmitTaxLossHarvestStrategy = c05291.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c05291.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objSubmitTaxLossHarvestStrategy);
            Request<SubmitTaxLossHarvestStrategyRequestDto> request = new Request<>(submitTaxLossHarvestStrategyRequestDto, null, 2, null);
            c05291.label = 1;
            objSubmitTaxLossHarvestStrategy = SubmitTaxLossHarvestStrategy(request, c05291);
            if (objSubmitTaxLossHarvestStrategy == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objSubmitTaxLossHarvestStrategy);
        }
        return ((Response) objSubmitTaxLossHarvestStrategy).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object SubmitTaxLossHarvestStrategy(Request<SubmitTaxLossHarvestStrategyRequestDto> request, Continuation<? super Response<SubmitTaxLossHarvestStrategyResponseDto>> continuation) {
        C05302 c05302;
        if (continuation instanceof C05302) {
            c05302 = (C05302) continuation;
            int i = c05302.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c05302.label = i - Integer.MIN_VALUE;
            } else {
                c05302 = new C05302(continuation);
            }
        }
        Object objSubmitTaxLossHarvestStrategy = c05302.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c05302.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objSubmitTaxLossHarvestStrategy);
            AdvisoryServiceRetrofit advisoryServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            SubmitTaxLossHarvestStrategyRequestDto data = request.getData();
            c05302.label = 1;
            objSubmitTaxLossHarvestStrategy = advisoryServiceRetrofit.SubmitTaxLossHarvestStrategy(metadata, data, c05302);
            if (objSubmitTaxLossHarvestStrategy == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objSubmitTaxLossHarvestStrategy);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objSubmitTaxLossHarvestStrategy);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // advisory.proto.p008v1.AdvisoryService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object TaxLossHarvestUpdateEnrollment(TaxLossHarvestUpdateEnrollmentRequestDto taxLossHarvestUpdateEnrollmentRequestDto, Continuation<? super TaxLossHarvestUpdateEnrollmentResponseDto> continuation) {
        C05311 c05311;
        if (continuation instanceof C05311) {
            c05311 = (C05311) continuation;
            int i = c05311.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c05311.label = i - Integer.MIN_VALUE;
            } else {
                c05311 = new C05311(continuation);
            }
        }
        Object objTaxLossHarvestUpdateEnrollment = c05311.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c05311.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objTaxLossHarvestUpdateEnrollment);
            Request<TaxLossHarvestUpdateEnrollmentRequestDto> request = new Request<>(taxLossHarvestUpdateEnrollmentRequestDto, null, 2, null);
            c05311.label = 1;
            objTaxLossHarvestUpdateEnrollment = TaxLossHarvestUpdateEnrollment(request, c05311);
            if (objTaxLossHarvestUpdateEnrollment == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objTaxLossHarvestUpdateEnrollment);
        }
        return ((Response) objTaxLossHarvestUpdateEnrollment).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object TaxLossHarvestUpdateEnrollment(Request<TaxLossHarvestUpdateEnrollmentRequestDto> request, Continuation<? super Response<TaxLossHarvestUpdateEnrollmentResponseDto>> continuation) {
        C05322 c05322;
        if (continuation instanceof C05322) {
            c05322 = (C05322) continuation;
            int i = c05322.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c05322.label = i - Integer.MIN_VALUE;
            } else {
                c05322 = new C05322(continuation);
            }
        }
        Object objTaxLossHarvestUpdateEnrollment = c05322.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c05322.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objTaxLossHarvestUpdateEnrollment);
            AdvisoryServiceRetrofit advisoryServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            TaxLossHarvestUpdateEnrollmentRequestDto data = request.getData();
            c05322.label = 1;
            objTaxLossHarvestUpdateEnrollment = advisoryServiceRetrofit.TaxLossHarvestUpdateEnrollment(metadata, data, c05322);
            if (objTaxLossHarvestUpdateEnrollment == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objTaxLossHarvestUpdateEnrollment);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objTaxLossHarvestUpdateEnrollment);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // advisory.proto.p008v1.AdvisoryService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetDashboardCard(GetDashboardCardRequestDto getDashboardCardRequestDto, Continuation<? super GetDashboardCardResponseDto> continuation) {
        C04851 c04851;
        if (continuation instanceof C04851) {
            c04851 = (C04851) continuation;
            int i = c04851.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c04851.label = i - Integer.MIN_VALUE;
            } else {
                c04851 = new C04851(continuation);
            }
        }
        Object objGetDashboardCard = c04851.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c04851.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetDashboardCard);
            Request<GetDashboardCardRequestDto> request = new Request<>(getDashboardCardRequestDto, null, 2, null);
            c04851.label = 1;
            objGetDashboardCard = GetDashboardCard(request, c04851);
            if (objGetDashboardCard == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetDashboardCard);
        }
        return ((Response) objGetDashboardCard).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetDashboardCard(Request<GetDashboardCardRequestDto> request, Continuation<? super Response<GetDashboardCardResponseDto>> continuation) {
        C04862 c04862;
        if (continuation instanceof C04862) {
            c04862 = (C04862) continuation;
            int i = c04862.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c04862.label = i - Integer.MIN_VALUE;
            } else {
                c04862 = new C04862(continuation);
            }
        }
        Object objGetDashboardCard = c04862.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c04862.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetDashboardCard);
            AdvisoryServiceRetrofit advisoryServiceRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String account_number = !Intrinsics.areEqual(request.getData().getAccount_number(), "") ? request.getData().getAccount_number() : null;
            c04862.label = 1;
            objGetDashboardCard = advisoryServiceRetrofit.GetDashboardCard(metadata, account_number, c04862);
            if (objGetDashboardCard == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetDashboardCard);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetDashboardCard);
    }
}
