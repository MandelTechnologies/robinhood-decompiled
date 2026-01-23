package com.robinhood.ceres.p284v1;

import com.plaid.internal.EnumC7081g;
import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import com.robinhood.idl.RhGenerated;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Ceres.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000¨\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0006J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\bH\u0096@¢\u0006\u0002\u0010\tJ\u0016\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u000bH¦@¢\u0006\u0002\u0010\fJ\"\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u000b0\bH\u0096@¢\u0006\u0002\u0010\tJ\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u000fH¦@¢\u0006\u0002\u0010\u0010J\"\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u000f0\bH\u0096@¢\u0006\u0002\u0010\tJ\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u0013H¦@¢\u0006\u0002\u0010\u0014J\"\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00130\bH\u0096@¢\u0006\u0002\u0010\tJ\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u0017H¦@¢\u0006\u0002\u0010\u0018J\"\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00170\bH\u0096@¢\u0006\u0002\u0010\tJ\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0004\u001a\u00020\u001bH¦@¢\u0006\u0002\u0010\u001cJ\"\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u001b0\bH\u0096@¢\u0006\u0002\u0010\tJ\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0004\u001a\u00020\u001fH¦@¢\u0006\u0002\u0010 J\"\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u001f0\bH\u0096@¢\u0006\u0002\u0010\tJ\u0016\u0010!\u001a\u00020\"2\u0006\u0010\u0004\u001a\u00020#H¦@¢\u0006\u0002\u0010$J\"\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020#0\bH\u0096@¢\u0006\u0002\u0010\tJ\u0016\u0010%\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020&H¦@¢\u0006\u0002\u0010'J\"\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020&0\bH\u0096@¢\u0006\u0002\u0010\tJ\u0016\u0010(\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020&H¦@¢\u0006\u0002\u0010'J\"\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020&0\bH\u0096@¢\u0006\u0002\u0010\tJ\u0016\u0010)\u001a\u00020*2\u0006\u0010\u0004\u001a\u00020+H¦@¢\u0006\u0002\u0010,J\"\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020+0\bH\u0096@¢\u0006\u0002\u0010\tJ\u0016\u0010-\u001a\u00020.2\u0006\u0010\u0004\u001a\u00020/H¦@¢\u0006\u0002\u00100J\"\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020/0\bH\u0096@¢\u0006\u0002\u0010\tJ\u0016\u00101\u001a\u0002022\u0006\u0010\u0004\u001a\u000203H¦@¢\u0006\u0002\u00104J\"\u00101\u001a\b\u0012\u0004\u0012\u0002020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002030\bH\u0096@¢\u0006\u0002\u0010\tJ\u0016\u00105\u001a\u00020*2\u0006\u0010\u0004\u001a\u00020+H¦@¢\u0006\u0002\u0010,J\"\u00105\u001a\b\u0012\u0004\u0012\u00020*0\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020+0\bH\u0096@¢\u0006\u0002\u0010\tJ\u0016\u00106\u001a\u0002072\u0006\u0010\u0004\u001a\u000208H¦@¢\u0006\u0002\u00109J\"\u00106\u001a\b\u0012\u0004\u0012\u0002070\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002080\bH\u0096@¢\u0006\u0002\u0010\tJ\u0016\u0010:\u001a\u00020;2\u0006\u0010\u0004\u001a\u00020<H¦@¢\u0006\u0002\u0010=J\"\u0010:\u001a\b\u0012\u0004\u0012\u00020;0\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020<0\bH\u0096@¢\u0006\u0002\u0010\tJ\u0016\u0010>\u001a\u00020?2\u0006\u0010\u0004\u001a\u00020@H¦@¢\u0006\u0002\u0010AJ\"\u0010>\u001a\b\u0012\u0004\u0012\u00020?0\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020@0\bH\u0096@¢\u0006\u0002\u0010\tJ\u0016\u0010B\u001a\u00020C2\u0006\u0010\u0004\u001a\u00020DH¦@¢\u0006\u0002\u0010EJ\"\u0010B\u001a\b\u0012\u0004\u0012\u00020C0\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020D0\bH\u0096@¢\u0006\u0002\u0010\tJ\u0016\u0010F\u001a\u00020G2\u0006\u0010\u0004\u001a\u00020HH¦@¢\u0006\u0002\u0010IJ\"\u0010F\u001a\b\u0012\u0004\u0012\u00020G0\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020H0\bH\u0096@¢\u0006\u0002\u0010\tJ\u0016\u0010J\u001a\u00020K2\u0006\u0010\u0004\u001a\u00020LH¦@¢\u0006\u0002\u0010MJ\"\u0010J\u001a\b\u0012\u0004\u0012\u00020K0\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020L0\bH\u0096@¢\u0006\u0002\u0010\tJ\u0016\u0010N\u001a\u00020O2\u0006\u0010\u0004\u001a\u00020PH¦@¢\u0006\u0002\u0010QJ\"\u0010N\u001a\b\u0012\u0004\u0012\u00020O0\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020P0\bH\u0096@¢\u0006\u0002\u0010\tJ\u0016\u0010R\u001a\u00020S2\u0006\u0010\u0004\u001a\u00020TH¦@¢\u0006\u0002\u0010UJ\"\u0010R\u001a\b\u0012\u0004\u0012\u00020S0\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020T0\bH\u0096@¢\u0006\u0002\u0010\tJ\u0016\u0010V\u001a\u00020W2\u0006\u0010\u0004\u001a\u00020XH¦@¢\u0006\u0002\u0010YJ\"\u0010V\u001a\b\u0012\u0004\u0012\u00020W0\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020X0\bH\u0096@¢\u0006\u0002\u0010\tJ\u0016\u0010Z\u001a\u00020[2\u0006\u0010\u0004\u001a\u00020\\H¦@¢\u0006\u0002\u0010]J\"\u0010Z\u001a\b\u0012\u0004\u0012\u00020[0\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\\0\bH\u0096@¢\u0006\u0002\u0010\tJ\u0016\u0010^\u001a\u00020_2\u0006\u0010\u0004\u001a\u00020\\H¦@¢\u0006\u0002\u0010]J\"\u0010^\u001a\b\u0012\u0004\u0012\u00020_0\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\\0\bH\u0096@¢\u0006\u0002\u0010\tJ\u0016\u0010`\u001a\u00020a2\u0006\u0010\u0004\u001a\u00020bH¦@¢\u0006\u0002\u0010cJ\"\u0010`\u001a\b\u0012\u0004\u0012\u00020a0\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020b0\bH\u0096@¢\u0006\u0002\u0010\tJ\u0016\u0010d\u001a\u00020e2\u0006\u0010\u0004\u001a\u00020fH¦@¢\u0006\u0002\u0010gJ\"\u0010d\u001a\b\u0012\u0004\u0012\u00020e0\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020f0\bH\u0096@¢\u0006\u0002\u0010\tJ\u0016\u0010h\u001a\u00020i2\u0006\u0010\u0004\u001a\u00020jH¦@¢\u0006\u0002\u0010kJ\"\u0010h\u001a\b\u0012\u0004\u0012\u00020i0\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020j0\bH\u0096@¢\u0006\u0002\u0010\tJ\u0016\u0010l\u001a\u00020m2\u0006\u0010\u0004\u001a\u00020nH¦@¢\u0006\u0002\u0010oJ\"\u0010l\u001a\b\u0012\u0004\u0012\u00020m0\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020n0\bH\u0096@¢\u0006\u0002\u0010\tJ\u0016\u0010p\u001a\u00020q2\u0006\u0010\u0004\u001a\u00020rH¦@¢\u0006\u0002\u0010sJ\"\u0010p\u001a\b\u0012\u0004\u0012\u00020q0\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020r0\bH\u0096@¢\u0006\u0002\u0010\tJ\u0016\u0010t\u001a\u00020u2\u0006\u0010\u0004\u001a\u00020vH¦@¢\u0006\u0002\u0010wJ\"\u0010t\u001a\b\u0012\u0004\u0012\u00020u0\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020v0\bH\u0096@¢\u0006\u0002\u0010\tJ\u0016\u0010x\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020yH¦@¢\u0006\u0002\u0010zJ\"\u0010x\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020y0\bH\u0096@¢\u0006\u0002\u0010\tJ\u0016\u0010{\u001a\u00020|2\u0006\u0010\u0004\u001a\u00020}H¦@¢\u0006\u0002\u0010~J\"\u0010{\u001a\b\u0012\u0004\u0012\u00020|0\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020}0\bH\u0096@¢\u0006\u0002\u0010\tJ\u0019\u0010\u007f\u001a\u00030\u0080\u00012\u0007\u0010\u0004\u001a\u00030\u0081\u0001H¦@¢\u0006\u0003\u0010\u0082\u0001J$\u0010\u007f\u001a\t\u0012\u0005\u0012\u00030\u0080\u00010\u00072\r\u0010\u0004\u001a\t\u0012\u0005\u0012\u00030\u0081\u00010\bH\u0096@¢\u0006\u0002\u0010\tJ\u001a\u0010\u0083\u0001\u001a\u00030\u0084\u00012\u0007\u0010\u0004\u001a\u00030\u0085\u0001H¦@¢\u0006\u0003\u0010\u0086\u0001J%\u0010\u0083\u0001\u001a\t\u0012\u0005\u0012\u00030\u0084\u00010\u00072\r\u0010\u0004\u001a\t\u0012\u0005\u0012\u00030\u0085\u00010\bH\u0096@¢\u0006\u0002\u0010\tJ\u001a\u0010\u0087\u0001\u001a\u00030\u0088\u00012\u0007\u0010\u0004\u001a\u00030\u0089\u0001H¦@¢\u0006\u0003\u0010\u008a\u0001J%\u0010\u0087\u0001\u001a\t\u0012\u0005\u0012\u00030\u0088\u00010\u00072\r\u0010\u0004\u001a\t\u0012\u0005\u0012\u00030\u0089\u00010\bH\u0096@¢\u0006\u0002\u0010\tJ\u001a\u0010\u008b\u0001\u001a\u00030\u008c\u00012\u0007\u0010\u0004\u001a\u00030\u008d\u0001H¦@¢\u0006\u0003\u0010\u008e\u0001J%\u0010\u008b\u0001\u001a\t\u0012\u0005\u0012\u00030\u008c\u00010\u00072\r\u0010\u0004\u001a\t\u0012\u0005\u0012\u00030\u008d\u00010\bH\u0096@¢\u0006\u0002\u0010\t¨\u0006\u008f\u0001"}, m3636d2 = {"Lcom/robinhood/ceres/v1/Ceres;", "", "CreateFuturesOrder", "Lcom/robinhood/ceres/v1/FuturesOrderDto;", "request", "Lcom/robinhood/ceres/v1/CreateFuturesOrderRequestDto;", "(Lcom/robinhood/ceres/v1/CreateFuturesOrderRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/idl/Response;", "Lcom/robinhood/idl/Request;", "(Lcom/robinhood/idl/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "CreateEventContractOrder", "Lcom/robinhood/ceres/v1/CreateEventContractOrderRequestDto;", "(Lcom/robinhood/ceres/v1/CreateEventContractOrderRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "CreateFuturesAccount", "Lcom/robinhood/ceres/v1/CreateFuturesAccountResponseDto;", "Lcom/robinhood/ceres/v1/CreateFuturesAccountRequestDto;", "(Lcom/robinhood/ceres/v1/CreateFuturesAccountRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "CheckAccountFuturesEligibility", "Lcom/robinhood/ceres/v1/CheckAccountFuturesEligibilityResponseDto;", "Lcom/robinhood/ceres/v1/CheckAccountFuturesEligibilityRequestDto;", "(Lcom/robinhood/ceres/v1/CheckAccountFuturesEligibilityRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetCheckpointSuitability", "Lcom/robinhood/ceres/v1/GetCheckpointSuitabilityResponseDto;", "Lcom/robinhood/ceres/v1/GetCheckpointSuitabilityRequestDto;", "(Lcom/robinhood/ceres/v1/GetCheckpointSuitabilityRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "EvaluateCheckpointSuitability", "Lcom/robinhood/ceres/v1/EvaluateCheckpointSuitabilityResponseDto;", "Lcom/robinhood/ceres/v1/EvaluateCheckpointSuitabilityRequestDto;", "(Lcom/robinhood/ceres/v1/EvaluateCheckpointSuitabilityRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetAgreementType", "Lcom/robinhood/ceres/v1/GetAgreementTypeResponseDto;", "Lcom/robinhood/ceres/v1/GetAgreementTypeRequestDto;", "(Lcom/robinhood/ceres/v1/GetAgreementTypeRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetPresubmitOrderValidation", "Lcom/robinhood/ceres/v1/GetPresubmitOrderValidationResponseDto;", "Lcom/robinhood/ceres/v1/GetPresubmitOrderValidationRequestDto;", "(Lcom/robinhood/ceres/v1/GetPresubmitOrderValidationRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetOrderByAccountIDAndOrderID", "Lcom/robinhood/ceres/v1/GetOrderByIDRequestDto;", "(Lcom/robinhood/ceres/v1/GetOrderByIDRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetOrderByID", "GetOrdersByAccountID", "Lcom/robinhood/ceres/v1/GetOrdersResponseDto;", "Lcom/robinhood/ceres/v1/GetOrdersRequestDto;", "(Lcom/robinhood/ceres/v1/GetOrdersRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetCashSettlementExecutionByID", "Lcom/robinhood/ceres/v1/FuturesExecutionDto;", "Lcom/robinhood/ceres/v1/GetCashSettlementExecutionByIDRequestDto;", "(Lcom/robinhood/ceres/v1/GetCashSettlementExecutionByIDRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetCashSettlementExecutions", "Lcom/robinhood/ceres/v1/GetCashSettlementExecutionsResponseDto;", "Lcom/robinhood/ceres/v1/GetCashSettlementExecutionsRequestDto;", "(Lcom/robinhood/ceres/v1/GetCashSettlementExecutionsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetOrders", "CancelFuturesOrder", "Lcom/robinhood/ceres/v1/CancelFuturesOrderResponseDto;", "Lcom/robinhood/ceres/v1/CancelFuturesOrderRequestDto;", "(Lcom/robinhood/ceres/v1/CancelFuturesOrderRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "CancelEventContractOrder", "Lcom/robinhood/ceres/v1/CancelEventContractOrderResponseDto;", "Lcom/robinhood/ceres/v1/CancelEventContractOrderRequestDto;", "(Lcom/robinhood/ceres/v1/CancelEventContractOrderRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetAccounts", "Lcom/robinhood/ceres/v1/GetAccountsResponseDto;", "Lcom/robinhood/ceres/v1/GetAccountsRequestDto;", "(Lcom/robinhood/ceres/v1/GetAccountsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetCurrentCashBalance", "Lcom/robinhood/ceres/v1/CashBalanceDto;", "Lcom/robinhood/ceres/v1/GetCurrentCashBalanceRequestDto;", "(Lcom/robinhood/ceres/v1/GetCurrentCashBalanceRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetCurrentPositions", "Lcom/robinhood/ceres/v1/GetCurrentPositionsResponseDto;", "Lcom/robinhood/ceres/v1/GetCurrentPositionsRequestDto;", "(Lcom/robinhood/ceres/v1/GetCurrentPositionsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetCurrentPositionsByContractID", "Lcom/robinhood/ceres/v1/GetCurrentPositionsByContractIDResponseDto;", "Lcom/robinhood/ceres/v1/GetCurrentPositionsByContractIDRequestDto;", "(Lcom/robinhood/ceres/v1/GetCurrentPositionsByContractIDRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetCurrentAggregatedPositions", "Lcom/robinhood/ceres/v1/GetCurrentAggregatedPositionsResponseDto;", "Lcom/robinhood/ceres/v1/GetCurrentAggregatedPositionsRequestDto;", "(Lcom/robinhood/ceres/v1/GetCurrentAggregatedPositionsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetContractQuantities", "Lcom/robinhood/ceres/v1/GetContractQuantitiesResponseDto;", "Lcom/robinhood/ceres/v1/GetContractQuantitiesRequestDto;", "(Lcom/robinhood/ceres/v1/GetContractQuantitiesRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "CreatePositionSellout", "Lcom/robinhood/ceres/v1/CreatePositionSelloutResponseDto;", "Lcom/robinhood/ceres/v1/CreatePositionSelloutRequestDto;", "(Lcom/robinhood/ceres/v1/CreatePositionSelloutRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetPnL", "Lcom/robinhood/ceres/v1/PnLDto;", "Lcom/robinhood/ceres/v1/GetPnLRequestDto;", "(Lcom/robinhood/ceres/v1/GetPnLRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetPnLCostBasis", "Lcom/robinhood/ceres/v1/PnLCostBasisDto;", "GetBuyingPowerEffect", "Lcom/robinhood/ceres/v1/GetBuyingPowerEffectResponseDto;", "Lcom/robinhood/ceres/v1/GetBuyingPowerEffectRequestDto;", "(Lcom/robinhood/ceres/v1/GetBuyingPowerEffectRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetFeesForTentativeOrder", "Lcom/robinhood/ceres/v1/GetFeesForTentativeOrderResponseDto;", "Lcom/robinhood/ceres/v1/GetFeesForTentativeOrderRequestDto;", "(Lcom/robinhood/ceres/v1/GetFeesForTentativeOrderRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ValidateOrder", "Lcom/robinhood/ceres/v1/ValidateOrderResponseDto;", "Lcom/robinhood/ceres/v1/ValidateOrderRequestDto;", "(Lcom/robinhood/ceres/v1/ValidateOrderRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetRealizedPnlForOrders", "Lcom/robinhood/ceres/v1/GetRealizedPnlForOrdersResponseDto;", "Lcom/robinhood/ceres/v1/GetRealizedPnlForOrdersRequestDto;", "(Lcom/robinhood/ceres/v1/GetRealizedPnlForOrdersRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetEventContractRealizedPnlByContract", "Lcom/robinhood/ceres/v1/GetEventContractRealizedPnlByContractResponseDto;", "Lcom/robinhood/ceres/v1/GetEventContractRealizedPnlByContractRequestDto;", "(Lcom/robinhood/ceres/v1/GetEventContractRealizedPnlByContractRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "FlattenPositions", "Lcom/robinhood/ceres/v1/FlattenPositionsResponseDto;", "Lcom/robinhood/ceres/v1/FlattenPositionsRequestDto;", "(Lcom/robinhood/ceres/v1/FlattenPositionsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ReplaceFuturesOrder", "Lcom/robinhood/ceres/v1/ReplaceFuturesOrderRequestDto;", "(Lcom/robinhood/ceres/v1/ReplaceFuturesOrderRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ListManualCashCorrections", "Lcom/robinhood/ceres/v1/ListManualCashCorrectionsResponseDto;", "Lcom/robinhood/ceres/v1/ListManualCashCorrectionsRequestDto;", "(Lcom/robinhood/ceres/v1/ListManualCashCorrectionsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "MarkAttestationsSigned", "Lcom/robinhood/ceres/v1/MarkAttestationsSignedResponseDto;", "Lcom/robinhood/ceres/v1/MarkAttestationsSignedRequestDto;", "(Lcom/robinhood/ceres/v1/MarkAttestationsSignedRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetUserSettings", "Lcom/robinhood/ceres/v1/GetUserSettingsResponseDto;", "Lcom/robinhood/ceres/v1/GetUserSettingsRequestDto;", "(Lcom/robinhood/ceres/v1/GetUserSettingsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "UpdateUserSettings", "Lcom/robinhood/ceres/v1/UpdateUserSettingsResponseDto;", "Lcom/robinhood/ceres/v1/UpdateUserSettingsRequestDto;", "(Lcom/robinhood/ceres/v1/UpdateUserSettingsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetFuturesIntervalPerformance", "Lcom/robinhood/ceres/v1/GetFuturesIntervalPerformanceResponseDto;", "Lcom/robinhood/ceres/v1/GetFuturesIntervalPerformanceRequestDto;", "(Lcom/robinhood/ceres/v1/GetFuturesIntervalPerformanceRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public interface Ceres {

    /* compiled from: Ceres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.Ceres$DefaultImpls", m3645f = "Ceres.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_ARROW_DOWN_VALUE}, m3647m = "CancelEventContractOrder")
    /* renamed from: com.robinhood.ceres.v1.Ceres$CancelEventContractOrder$1 */
    static final class C319201 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C319201(Continuation<? super C319201> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.CancelEventContractOrder(null, null, this);
        }
    }

    /* compiled from: Ceres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.Ceres$DefaultImpls", m3645f = "Ceres.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_TEXT_VALUE}, m3647m = "CancelFuturesOrder")
    /* renamed from: com.robinhood.ceres.v1.Ceres$CancelFuturesOrder$1 */
    static final class C319211 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C319211(Continuation<? super C319211> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.CancelFuturesOrder(null, null, this);
        }
    }

    /* compiled from: Ceres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.Ceres$DefaultImpls", m3645f = "Ceres.kt", m3646l = {76}, m3647m = "CheckAccountFuturesEligibility")
    /* renamed from: com.robinhood.ceres.v1.Ceres$CheckAccountFuturesEligibility$1 */
    static final class C319221 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C319221(Continuation<? super C319221> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.CheckAccountFuturesEligibility(null, null, this);
        }
    }

    /* compiled from: Ceres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.Ceres$DefaultImpls", m3645f = "Ceres.kt", m3646l = {56}, m3647m = "CreateEventContractOrder")
    /* renamed from: com.robinhood.ceres.v1.Ceres$CreateEventContractOrder$1 */
    static final class C319231 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C319231(Continuation<? super C319231> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.CreateEventContractOrder(null, null, this);
        }
    }

    /* compiled from: Ceres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.Ceres$DefaultImpls", m3645f = "Ceres.kt", m3646l = {66}, m3647m = "CreateFuturesAccount")
    /* renamed from: com.robinhood.ceres.v1.Ceres$CreateFuturesAccount$1 */
    static final class C319241 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C319241(Continuation<? super C319241> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.CreateFuturesAccount(null, null, this);
        }
    }

    /* compiled from: Ceres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.Ceres$DefaultImpls", m3645f = "Ceres.kt", m3646l = {46}, m3647m = "CreateFuturesOrder")
    /* renamed from: com.robinhood.ceres.v1.Ceres$CreateFuturesOrder$1 */
    static final class C319251 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C319251(Continuation<? super C319251> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.CreateFuturesOrder(null, null, this);
        }
    }

    /* compiled from: Ceres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.Ceres$DefaultImpls", m3645f = "Ceres.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE}, m3647m = "CreatePositionSellout")
    /* renamed from: com.robinhood.ceres.v1.Ceres$CreatePositionSellout$1 */
    static final class C319261 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C319261(Continuation<? super C319261> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.CreatePositionSellout(null, null, this);
        }
    }

    /* compiled from: Ceres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.Ceres$DefaultImpls", m3645f = "Ceres.kt", m3646l = {96}, m3647m = "EvaluateCheckpointSuitability")
    /* renamed from: com.robinhood.ceres.v1.Ceres$EvaluateCheckpointSuitability$1 */
    static final class C319271 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C319271(Continuation<? super C319271> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.EvaluateCheckpointSuitability(null, null, this);
        }
    }

    /* compiled from: Ceres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.Ceres$DefaultImpls", m3645f = "Ceres.kt", m3646l = {384}, m3647m = "FlattenPositions")
    /* renamed from: com.robinhood.ceres.v1.Ceres$FlattenPositions$1 */
    static final class C319281 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C319281(Continuation<? super C319281> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.FlattenPositions(null, null, this);
        }
    }

    /* compiled from: Ceres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.Ceres$DefaultImpls", m3645f = "Ceres.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CLOCK_VALUE}, m3647m = "GetAccounts")
    /* renamed from: com.robinhood.ceres.v1.Ceres$GetAccounts$1 */
    static final class C319291 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C319291(Continuation<? super C319291> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.GetAccounts(null, null, this);
        }
    }

    /* compiled from: Ceres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.Ceres$DefaultImpls", m3645f = "Ceres.kt", m3646l = {106}, m3647m = "GetAgreementType")
    /* renamed from: com.robinhood.ceres.v1.Ceres$GetAgreementType$1 */
    static final class C319301 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C319301(Continuation<? super C319301> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.GetAgreementType(null, null, this);
        }
    }

    /* compiled from: Ceres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.Ceres$DefaultImpls", m3645f = "Ceres.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_CONNECT_WITH_PLAID_DARK_APPEARANCE_VALUE}, m3647m = "GetBuyingPowerEffect")
    /* renamed from: com.robinhood.ceres.v1.Ceres$GetBuyingPowerEffect$1 */
    static final class C319311 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C319311(Continuation<? super C319311> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.GetBuyingPowerEffect(null, null, this);
        }
    }

    /* compiled from: Ceres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.Ceres$DefaultImpls", m3645f = "Ceres.kt", m3646l = {156}, m3647m = "GetCashSettlementExecutionByID")
    /* renamed from: com.robinhood.ceres.v1.Ceres$GetCashSettlementExecutionByID$1 */
    static final class C319321 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C319321(Continuation<? super C319321> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.GetCashSettlementExecutionByID(null, null, this);
        }
    }

    /* compiled from: Ceres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.Ceres$DefaultImpls", m3645f = "Ceres.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_ETH_WITH_PLAID_VALUE}, m3647m = "GetCashSettlementExecutions")
    /* renamed from: com.robinhood.ceres.v1.Ceres$GetCashSettlementExecutions$1 */
    static final class C319331 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C319331(Continuation<? super C319331> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.GetCashSettlementExecutions(null, null, this);
        }
    }

    /* compiled from: Ceres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.Ceres$DefaultImpls", m3645f = "Ceres.kt", m3646l = {86}, m3647m = "GetCheckpointSuitability")
    /* renamed from: com.robinhood.ceres.v1.Ceres$GetCheckpointSuitability$1 */
    static final class C319341 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C319341(Continuation<? super C319341> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.GetCheckpointSuitability(null, null, this);
        }
    }

    /* compiled from: Ceres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.Ceres$DefaultImpls", m3645f = "Ceres.kt", m3646l = {256}, m3647m = "GetContractQuantities")
    /* renamed from: com.robinhood.ceres.v1.Ceres$GetContractQuantities$1 */
    static final class C319351 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C319351(Continuation<? super C319351> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.GetContractQuantities(null, null, this);
        }
    }

    /* compiled from: Ceres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.Ceres$DefaultImpls", m3645f = "Ceres.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE}, m3647m = "GetCurrentAggregatedPositions")
    /* renamed from: com.robinhood.ceres.v1.Ceres$GetCurrentAggregatedPositions$1 */
    static final class C319361 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C319361(Continuation<? super C319361> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.GetCurrentAggregatedPositions(null, null, this);
        }
    }

    /* compiled from: Ceres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.Ceres$DefaultImpls", m3645f = "Ceres.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE}, m3647m = "GetCurrentCashBalance")
    /* renamed from: com.robinhood.ceres.v1.Ceres$GetCurrentCashBalance$1 */
    static final class C319371 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C319371(Continuation<? super C319371> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.GetCurrentCashBalance(null, null, this);
        }
    }

    /* compiled from: Ceres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.Ceres$DefaultImpls", m3645f = "Ceres.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_01_CIRCLE_VALUE}, m3647m = "GetCurrentPositions")
    /* renamed from: com.robinhood.ceres.v1.Ceres$GetCurrentPositions$1 */
    static final class C319381 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C319381(Continuation<? super C319381> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.GetCurrentPositions(null, null, this);
        }
    }

    /* compiled from: Ceres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.Ceres$DefaultImpls", m3645f = "Ceres.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE}, m3647m = "GetCurrentPositionsByContractID")
    /* renamed from: com.robinhood.ceres.v1.Ceres$GetCurrentPositionsByContractID$1 */
    static final class C319391 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C319391(Continuation<? super C319391> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.GetCurrentPositionsByContractID(null, null, this);
        }
    }

    /* compiled from: Ceres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.Ceres$DefaultImpls", m3645f = "Ceres.kt", m3646l = {380}, m3647m = "GetEventContractRealizedPnlByContract")
    /* renamed from: com.robinhood.ceres.v1.Ceres$GetEventContractRealizedPnlByContract$1 */
    static final class C319401 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C319401(Continuation<? super C319401> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.GetEventContractRealizedPnlByContract(null, null, this);
        }
    }

    /* compiled from: Ceres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.Ceres$DefaultImpls", m3645f = "Ceres.kt", m3646l = {348}, m3647m = "GetFeesForTentativeOrder")
    /* renamed from: com.robinhood.ceres.v1.Ceres$GetFeesForTentativeOrder$1 */
    static final class C319411 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C319411(Continuation<? super C319411> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.GetFeesForTentativeOrder(null, null, this);
        }
    }

    /* compiled from: Ceres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.Ceres$DefaultImpls", m3645f = "Ceres.kt", m3646l = {430}, m3647m = "GetFuturesIntervalPerformance")
    /* renamed from: com.robinhood.ceres.v1.Ceres$GetFuturesIntervalPerformance$1 */
    static final class C319421 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C319421(Continuation<? super C319421> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.GetFuturesIntervalPerformance(null, null, this);
        }
    }

    /* compiled from: Ceres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.Ceres$DefaultImpls", m3645f = "Ceres.kt", m3646l = {EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE}, m3647m = "GetOrderByAccountIDAndOrderID")
    /* renamed from: com.robinhood.ceres.v1.Ceres$GetOrderByAccountIDAndOrderID$1 */
    static final class C319431 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C319431(Continuation<? super C319431> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.GetOrderByAccountIDAndOrderID(null, null, this);
        }
    }

    /* compiled from: Ceres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.Ceres$DefaultImpls", m3645f = "Ceres.kt", m3646l = {136}, m3647m = "GetOrderByID")
    /* renamed from: com.robinhood.ceres.v1.Ceres$GetOrderByID$1 */
    static final class C319441 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C319441(Continuation<? super C319441> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.GetOrderByID(null, null, this);
        }
    }

    /* compiled from: Ceres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.Ceres$DefaultImpls", m3645f = "Ceres.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE}, m3647m = "GetOrders")
    /* renamed from: com.robinhood.ceres.v1.Ceres$GetOrders$1 */
    static final class C319451 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C319451(Continuation<? super C319451> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.GetOrders(null, null, this);
        }
    }

    /* compiled from: Ceres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.Ceres$DefaultImpls", m3645f = "Ceres.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_PERSON_VALUE}, m3647m = "GetOrdersByAccountID")
    /* renamed from: com.robinhood.ceres.v1.Ceres$GetOrdersByAccountID$1 */
    static final class C319461 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C319461(Continuation<? super C319461> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.GetOrdersByAccountID(null, null, this);
        }
    }

    /* compiled from: Ceres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.Ceres$DefaultImpls", m3645f = "Ceres.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_BANK_DARK_APPEARANCE_VALUE}, m3647m = "GetPnL")
    /* renamed from: com.robinhood.ceres.v1.Ceres$GetPnL$1 */
    static final class C319471 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C319471(Continuation<? super C319471> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.GetPnL(null, null, this);
        }
    }

    /* compiled from: Ceres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.Ceres$DefaultImpls", m3645f = "Ceres.kt", m3646l = {EnumC7081g.SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_SUCCESS_VALUE}, m3647m = "GetPnLCostBasis")
    /* renamed from: com.robinhood.ceres.v1.Ceres$GetPnLCostBasis$1 */
    static final class C319481 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C319481(Continuation<? super C319481> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.GetPnLCostBasis(null, null, this);
        }
    }

    /* compiled from: Ceres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.Ceres$DefaultImpls", m3645f = "Ceres.kt", m3646l = {116}, m3647m = "GetPresubmitOrderValidation")
    /* renamed from: com.robinhood.ceres.v1.Ceres$GetPresubmitOrderValidation$1 */
    static final class C319491 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C319491(Continuation<? super C319491> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.GetPresubmitOrderValidation(null, null, this);
        }
    }

    /* compiled from: Ceres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.Ceres$DefaultImpls", m3645f = "Ceres.kt", m3646l = {370}, m3647m = "GetRealizedPnlForOrders")
    /* renamed from: com.robinhood.ceres.v1.Ceres$GetRealizedPnlForOrders$1 */
    static final class C319501 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C319501(Continuation<? super C319501> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.GetRealizedPnlForOrders(null, null, this);
        }
    }

    /* compiled from: Ceres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.Ceres$DefaultImpls", m3645f = "Ceres.kt", m3646l = {422}, m3647m = "GetUserSettings")
    /* renamed from: com.robinhood.ceres.v1.Ceres$GetUserSettings$1 */
    static final class C319511 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C319511(Continuation<? super C319511> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.GetUserSettings(null, null, this);
        }
    }

    /* compiled from: Ceres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.Ceres$DefaultImpls", m3645f = "Ceres.kt", m3646l = {408}, m3647m = "ListManualCashCorrections")
    /* renamed from: com.robinhood.ceres.v1.Ceres$ListManualCashCorrections$1 */
    static final class C319521 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C319521(Continuation<? super C319521> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.ListManualCashCorrections(null, null, this);
        }
    }

    /* compiled from: Ceres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.Ceres$DefaultImpls", m3645f = "Ceres.kt", m3646l = {418}, m3647m = "MarkAttestationsSigned")
    /* renamed from: com.robinhood.ceres.v1.Ceres$MarkAttestationsSigned$1 */
    static final class C319531 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C319531(Continuation<? super C319531> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.MarkAttestationsSigned(null, null, this);
        }
    }

    /* compiled from: Ceres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.Ceres$DefaultImpls", m3645f = "Ceres.kt", m3646l = {398}, m3647m = "ReplaceFuturesOrder")
    /* renamed from: com.robinhood.ceres.v1.Ceres$ReplaceFuturesOrder$1 */
    static final class C319541 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C319541(Continuation<? super C319541> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.ReplaceFuturesOrder(null, null, this);
        }
    }

    /* compiled from: Ceres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.Ceres$DefaultImpls", m3645f = "Ceres.kt", m3646l = {426}, m3647m = "UpdateUserSettings")
    /* renamed from: com.robinhood.ceres.v1.Ceres$UpdateUserSettings$1 */
    static final class C319551 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C319551(Continuation<? super C319551> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.UpdateUserSettings(null, null, this);
        }
    }

    /* compiled from: Ceres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.Ceres$DefaultImpls", m3645f = "Ceres.kt", m3646l = {360}, m3647m = "ValidateOrder")
    /* renamed from: com.robinhood.ceres.v1.Ceres$ValidateOrder$1 */
    static final class C319561 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C319561(Continuation<? super C319561> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.ValidateOrder(null, null, this);
        }
    }

    Object CancelEventContractOrder(CancelEventContractOrderRequestDto cancelEventContractOrderRequestDto, Continuation<? super CancelEventContractOrderResponseDto> continuation);

    Object CancelEventContractOrder(Request<CancelEventContractOrderRequestDto> request, Continuation<? super Response<CancelEventContractOrderResponseDto>> continuation);

    Object CancelFuturesOrder(CancelFuturesOrderRequestDto cancelFuturesOrderRequestDto, Continuation<? super CancelFuturesOrderResponseDto> continuation);

    Object CancelFuturesOrder(Request<CancelFuturesOrderRequestDto> request, Continuation<? super Response<CancelFuturesOrderResponseDto>> continuation);

    Object CheckAccountFuturesEligibility(CheckAccountFuturesEligibilityRequestDto checkAccountFuturesEligibilityRequestDto, Continuation<? super CheckAccountFuturesEligibilityResponseDto> continuation);

    Object CheckAccountFuturesEligibility(Request<CheckAccountFuturesEligibilityRequestDto> request, Continuation<? super Response<CheckAccountFuturesEligibilityResponseDto>> continuation);

    Object CreateEventContractOrder(CreateEventContractOrderRequestDto createEventContractOrderRequestDto, Continuation<? super FuturesOrderDto> continuation);

    Object CreateEventContractOrder(Request<CreateEventContractOrderRequestDto> request, Continuation<? super Response<FuturesOrderDto>> continuation);

    Object CreateFuturesAccount(CreateFuturesAccountRequestDto createFuturesAccountRequestDto, Continuation<? super CreateFuturesAccountResponseDto> continuation);

    Object CreateFuturesAccount(Request<CreateFuturesAccountRequestDto> request, Continuation<? super Response<CreateFuturesAccountResponseDto>> continuation);

    Object CreateFuturesOrder(CreateFuturesOrderRequestDto createFuturesOrderRequestDto, Continuation<? super FuturesOrderDto> continuation);

    Object CreateFuturesOrder(Request<CreateFuturesOrderRequestDto> request, Continuation<? super Response<FuturesOrderDto>> continuation);

    Object CreatePositionSellout(CreatePositionSelloutRequestDto createPositionSelloutRequestDto, Continuation<? super CreatePositionSelloutResponseDto> continuation);

    Object CreatePositionSellout(Request<CreatePositionSelloutRequestDto> request, Continuation<? super Response<CreatePositionSelloutResponseDto>> continuation);

    Object EvaluateCheckpointSuitability(EvaluateCheckpointSuitabilityRequestDto evaluateCheckpointSuitabilityRequestDto, Continuation<? super EvaluateCheckpointSuitabilityResponseDto> continuation);

    Object EvaluateCheckpointSuitability(Request<EvaluateCheckpointSuitabilityRequestDto> request, Continuation<? super Response<EvaluateCheckpointSuitabilityResponseDto>> continuation);

    Object FlattenPositions(FlattenPositionsRequestDto flattenPositionsRequestDto, Continuation<? super FlattenPositionsResponseDto> continuation);

    Object FlattenPositions(Request<FlattenPositionsRequestDto> request, Continuation<? super Response<FlattenPositionsResponseDto>> continuation);

    Object GetAccounts(GetAccountsRequestDto getAccountsRequestDto, Continuation<? super GetAccountsResponseDto> continuation);

    Object GetAccounts(Request<GetAccountsRequestDto> request, Continuation<? super Response<GetAccountsResponseDto>> continuation);

    Object GetAgreementType(GetAgreementTypeRequestDto getAgreementTypeRequestDto, Continuation<? super GetAgreementTypeResponseDto> continuation);

    Object GetAgreementType(Request<GetAgreementTypeRequestDto> request, Continuation<? super Response<GetAgreementTypeResponseDto>> continuation);

    Object GetBuyingPowerEffect(GetBuyingPowerEffectRequestDto getBuyingPowerEffectRequestDto, Continuation<? super GetBuyingPowerEffectResponseDto> continuation);

    Object GetBuyingPowerEffect(Request<GetBuyingPowerEffectRequestDto> request, Continuation<? super Response<GetBuyingPowerEffectResponseDto>> continuation);

    Object GetCashSettlementExecutionByID(GetCashSettlementExecutionByIDRequestDto getCashSettlementExecutionByIDRequestDto, Continuation<? super FuturesExecutionDto> continuation);

    Object GetCashSettlementExecutionByID(Request<GetCashSettlementExecutionByIDRequestDto> request, Continuation<? super Response<FuturesExecutionDto>> continuation);

    Object GetCashSettlementExecutions(GetCashSettlementExecutionsRequestDto getCashSettlementExecutionsRequestDto, Continuation<? super GetCashSettlementExecutionsResponseDto> continuation);

    Object GetCashSettlementExecutions(Request<GetCashSettlementExecutionsRequestDto> request, Continuation<? super Response<GetCashSettlementExecutionsResponseDto>> continuation);

    Object GetCheckpointSuitability(GetCheckpointSuitabilityRequestDto getCheckpointSuitabilityRequestDto, Continuation<? super GetCheckpointSuitabilityResponseDto> continuation);

    Object GetCheckpointSuitability(Request<GetCheckpointSuitabilityRequestDto> request, Continuation<? super Response<GetCheckpointSuitabilityResponseDto>> continuation);

    Object GetContractQuantities(GetContractQuantitiesRequestDto getContractQuantitiesRequestDto, Continuation<? super GetContractQuantitiesResponseDto> continuation);

    Object GetContractQuantities(Request<GetContractQuantitiesRequestDto> request, Continuation<? super Response<GetContractQuantitiesResponseDto>> continuation);

    Object GetCurrentAggregatedPositions(GetCurrentAggregatedPositionsRequestDto getCurrentAggregatedPositionsRequestDto, Continuation<? super GetCurrentAggregatedPositionsResponseDto> continuation);

    Object GetCurrentAggregatedPositions(Request<GetCurrentAggregatedPositionsRequestDto> request, Continuation<? super Response<GetCurrentAggregatedPositionsResponseDto>> continuation);

    Object GetCurrentCashBalance(GetCurrentCashBalanceRequestDto getCurrentCashBalanceRequestDto, Continuation<? super CashBalanceDto> continuation);

    Object GetCurrentCashBalance(Request<GetCurrentCashBalanceRequestDto> request, Continuation<? super Response<CashBalanceDto>> continuation);

    Object GetCurrentPositions(GetCurrentPositionsRequestDto getCurrentPositionsRequestDto, Continuation<? super GetCurrentPositionsResponseDto> continuation);

    Object GetCurrentPositions(Request<GetCurrentPositionsRequestDto> request, Continuation<? super Response<GetCurrentPositionsResponseDto>> continuation);

    Object GetCurrentPositionsByContractID(GetCurrentPositionsByContractIDRequestDto getCurrentPositionsByContractIDRequestDto, Continuation<? super GetCurrentPositionsByContractIDResponseDto> continuation);

    Object GetCurrentPositionsByContractID(Request<GetCurrentPositionsByContractIDRequestDto> request, Continuation<? super Response<GetCurrentPositionsByContractIDResponseDto>> continuation);

    Object GetEventContractRealizedPnlByContract(GetEventContractRealizedPnlByContractRequestDto getEventContractRealizedPnlByContractRequestDto, Continuation<? super GetEventContractRealizedPnlByContractResponseDto> continuation);

    Object GetEventContractRealizedPnlByContract(Request<GetEventContractRealizedPnlByContractRequestDto> request, Continuation<? super Response<GetEventContractRealizedPnlByContractResponseDto>> continuation);

    Object GetFeesForTentativeOrder(GetFeesForTentativeOrderRequestDto getFeesForTentativeOrderRequestDto, Continuation<? super GetFeesForTentativeOrderResponseDto> continuation);

    Object GetFeesForTentativeOrder(Request<GetFeesForTentativeOrderRequestDto> request, Continuation<? super Response<GetFeesForTentativeOrderResponseDto>> continuation);

    Object GetFuturesIntervalPerformance(GetFuturesIntervalPerformanceRequestDto getFuturesIntervalPerformanceRequestDto, Continuation<? super GetFuturesIntervalPerformanceResponseDto> continuation);

    Object GetFuturesIntervalPerformance(Request<GetFuturesIntervalPerformanceRequestDto> request, Continuation<? super Response<GetFuturesIntervalPerformanceResponseDto>> continuation);

    Object GetOrderByAccountIDAndOrderID(GetOrderByIDRequestDto getOrderByIDRequestDto, Continuation<? super FuturesOrderDto> continuation);

    Object GetOrderByAccountIDAndOrderID(Request<GetOrderByIDRequestDto> request, Continuation<? super Response<FuturesOrderDto>> continuation);

    Object GetOrderByID(GetOrderByIDRequestDto getOrderByIDRequestDto, Continuation<? super FuturesOrderDto> continuation);

    Object GetOrderByID(Request<GetOrderByIDRequestDto> request, Continuation<? super Response<FuturesOrderDto>> continuation);

    Object GetOrders(GetOrdersRequestDto getOrdersRequestDto, Continuation<? super GetOrdersResponseDto> continuation);

    Object GetOrders(Request<GetOrdersRequestDto> request, Continuation<? super Response<GetOrdersResponseDto>> continuation);

    Object GetOrdersByAccountID(GetOrdersRequestDto getOrdersRequestDto, Continuation<? super GetOrdersResponseDto> continuation);

    Object GetOrdersByAccountID(Request<GetOrdersRequestDto> request, Continuation<? super Response<GetOrdersResponseDto>> continuation);

    Object GetPnL(GetPnLRequestDto getPnLRequestDto, Continuation<? super PnLDto> continuation);

    Object GetPnL(Request<GetPnLRequestDto> request, Continuation<? super Response<PnLDto>> continuation);

    Object GetPnLCostBasis(GetPnLRequestDto getPnLRequestDto, Continuation<? super PnLCostBasisDto> continuation);

    Object GetPnLCostBasis(Request<GetPnLRequestDto> request, Continuation<? super Response<PnLCostBasisDto>> continuation);

    Object GetPresubmitOrderValidation(GetPresubmitOrderValidationRequestDto getPresubmitOrderValidationRequestDto, Continuation<? super GetPresubmitOrderValidationResponseDto> continuation);

    Object GetPresubmitOrderValidation(Request<GetPresubmitOrderValidationRequestDto> request, Continuation<? super Response<GetPresubmitOrderValidationResponseDto>> continuation);

    Object GetRealizedPnlForOrders(GetRealizedPnlForOrdersRequestDto getRealizedPnlForOrdersRequestDto, Continuation<? super GetRealizedPnlForOrdersResponseDto> continuation);

    Object GetRealizedPnlForOrders(Request<GetRealizedPnlForOrdersRequestDto> request, Continuation<? super Response<GetRealizedPnlForOrdersResponseDto>> continuation);

    Object GetUserSettings(GetUserSettingsRequestDto getUserSettingsRequestDto, Continuation<? super GetUserSettingsResponseDto> continuation);

    Object GetUserSettings(Request<GetUserSettingsRequestDto> request, Continuation<? super Response<GetUserSettingsResponseDto>> continuation);

    Object ListManualCashCorrections(ListManualCashCorrectionsRequestDto listManualCashCorrectionsRequestDto, Continuation<? super ListManualCashCorrectionsResponseDto> continuation);

    Object ListManualCashCorrections(Request<ListManualCashCorrectionsRequestDto> request, Continuation<? super Response<ListManualCashCorrectionsResponseDto>> continuation);

    Object MarkAttestationsSigned(MarkAttestationsSignedRequestDto markAttestationsSignedRequestDto, Continuation<? super MarkAttestationsSignedResponseDto> continuation);

    Object MarkAttestationsSigned(Request<MarkAttestationsSignedRequestDto> request, Continuation<? super Response<MarkAttestationsSignedResponseDto>> continuation);

    Object ReplaceFuturesOrder(ReplaceFuturesOrderRequestDto replaceFuturesOrderRequestDto, Continuation<? super FuturesOrderDto> continuation);

    Object ReplaceFuturesOrder(Request<ReplaceFuturesOrderRequestDto> request, Continuation<? super Response<FuturesOrderDto>> continuation);

    Object UpdateUserSettings(UpdateUserSettingsRequestDto updateUserSettingsRequestDto, Continuation<? super UpdateUserSettingsResponseDto> continuation);

    Object UpdateUserSettings(Request<UpdateUserSettingsRequestDto> request, Continuation<? super Response<UpdateUserSettingsResponseDto>> continuation);

    Object ValidateOrder(ValidateOrderRequestDto validateOrderRequestDto, Continuation<? super ValidateOrderResponseDto> continuation);

    Object ValidateOrder(Request<ValidateOrderRequestDto> request, Continuation<? super Response<ValidateOrderResponseDto>> continuation);

    /* compiled from: Ceres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object CreateFuturesOrder(Ceres ceres, Request<CreateFuturesOrderRequestDto> request, Continuation<? super Response<FuturesOrderDto>> continuation) {
            C319251 c319251;
            if (continuation instanceof C319251) {
                c319251 = (C319251) continuation;
                int i = c319251.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c319251.label = i - Integer.MIN_VALUE;
                } else {
                    c319251 = new C319251(continuation);
                }
            }
            Object objCreateFuturesOrder = c319251.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c319251.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objCreateFuturesOrder);
                CreateFuturesOrderRequestDto data = request.getData();
                c319251.label = 1;
                objCreateFuturesOrder = ceres.CreateFuturesOrder(data, c319251);
                if (objCreateFuturesOrder == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objCreateFuturesOrder);
            }
            return new Response(objCreateFuturesOrder, null, 2, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object CreateEventContractOrder(Ceres ceres, Request<CreateEventContractOrderRequestDto> request, Continuation<? super Response<FuturesOrderDto>> continuation) {
            C319231 c319231;
            if (continuation instanceof C319231) {
                c319231 = (C319231) continuation;
                int i = c319231.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c319231.label = i - Integer.MIN_VALUE;
                } else {
                    c319231 = new C319231(continuation);
                }
            }
            Object objCreateEventContractOrder = c319231.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c319231.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objCreateEventContractOrder);
                CreateEventContractOrderRequestDto data = request.getData();
                c319231.label = 1;
                objCreateEventContractOrder = ceres.CreateEventContractOrder(data, c319231);
                if (objCreateEventContractOrder == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objCreateEventContractOrder);
            }
            return new Response(objCreateEventContractOrder, null, 2, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object CreateFuturesAccount(Ceres ceres, Request<CreateFuturesAccountRequestDto> request, Continuation<? super Response<CreateFuturesAccountResponseDto>> continuation) {
            C319241 c319241;
            if (continuation instanceof C319241) {
                c319241 = (C319241) continuation;
                int i = c319241.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c319241.label = i - Integer.MIN_VALUE;
                } else {
                    c319241 = new C319241(continuation);
                }
            }
            Object objCreateFuturesAccount = c319241.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c319241.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objCreateFuturesAccount);
                CreateFuturesAccountRequestDto data = request.getData();
                c319241.label = 1;
                objCreateFuturesAccount = ceres.CreateFuturesAccount(data, c319241);
                if (objCreateFuturesAccount == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objCreateFuturesAccount);
            }
            return new Response(objCreateFuturesAccount, null, 2, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object CheckAccountFuturesEligibility(Ceres ceres, Request<CheckAccountFuturesEligibilityRequestDto> request, Continuation<? super Response<CheckAccountFuturesEligibilityResponseDto>> continuation) {
            C319221 c319221;
            if (continuation instanceof C319221) {
                c319221 = (C319221) continuation;
                int i = c319221.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c319221.label = i - Integer.MIN_VALUE;
                } else {
                    c319221 = new C319221(continuation);
                }
            }
            Object objCheckAccountFuturesEligibility = c319221.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c319221.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objCheckAccountFuturesEligibility);
                CheckAccountFuturesEligibilityRequestDto data = request.getData();
                c319221.label = 1;
                objCheckAccountFuturesEligibility = ceres.CheckAccountFuturesEligibility(data, c319221);
                if (objCheckAccountFuturesEligibility == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objCheckAccountFuturesEligibility);
            }
            return new Response(objCheckAccountFuturesEligibility, null, 2, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object GetCheckpointSuitability(Ceres ceres, Request<GetCheckpointSuitabilityRequestDto> request, Continuation<? super Response<GetCheckpointSuitabilityResponseDto>> continuation) {
            C319341 c319341;
            if (continuation instanceof C319341) {
                c319341 = (C319341) continuation;
                int i = c319341.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c319341.label = i - Integer.MIN_VALUE;
                } else {
                    c319341 = new C319341(continuation);
                }
            }
            Object objGetCheckpointSuitability = c319341.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c319341.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objGetCheckpointSuitability);
                GetCheckpointSuitabilityRequestDto data = request.getData();
                c319341.label = 1;
                objGetCheckpointSuitability = ceres.GetCheckpointSuitability(data, c319341);
                if (objGetCheckpointSuitability == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objGetCheckpointSuitability);
            }
            return new Response(objGetCheckpointSuitability, null, 2, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object EvaluateCheckpointSuitability(Ceres ceres, Request<EvaluateCheckpointSuitabilityRequestDto> request, Continuation<? super Response<EvaluateCheckpointSuitabilityResponseDto>> continuation) {
            C319271 c319271;
            if (continuation instanceof C319271) {
                c319271 = (C319271) continuation;
                int i = c319271.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c319271.label = i - Integer.MIN_VALUE;
                } else {
                    c319271 = new C319271(continuation);
                }
            }
            Object objEvaluateCheckpointSuitability = c319271.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c319271.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objEvaluateCheckpointSuitability);
                EvaluateCheckpointSuitabilityRequestDto data = request.getData();
                c319271.label = 1;
                objEvaluateCheckpointSuitability = ceres.EvaluateCheckpointSuitability(data, c319271);
                if (objEvaluateCheckpointSuitability == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objEvaluateCheckpointSuitability);
            }
            return new Response(objEvaluateCheckpointSuitability, null, 2, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object GetAgreementType(Ceres ceres, Request<GetAgreementTypeRequestDto> request, Continuation<? super Response<GetAgreementTypeResponseDto>> continuation) {
            C319301 c319301;
            if (continuation instanceof C319301) {
                c319301 = (C319301) continuation;
                int i = c319301.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c319301.label = i - Integer.MIN_VALUE;
                } else {
                    c319301 = new C319301(continuation);
                }
            }
            Object objGetAgreementType = c319301.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c319301.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objGetAgreementType);
                GetAgreementTypeRequestDto data = request.getData();
                c319301.label = 1;
                objGetAgreementType = ceres.GetAgreementType(data, c319301);
                if (objGetAgreementType == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objGetAgreementType);
            }
            return new Response(objGetAgreementType, null, 2, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object GetPresubmitOrderValidation(Ceres ceres, Request<GetPresubmitOrderValidationRequestDto> request, Continuation<? super Response<GetPresubmitOrderValidationResponseDto>> continuation) {
            C319491 c319491;
            if (continuation instanceof C319491) {
                c319491 = (C319491) continuation;
                int i = c319491.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c319491.label = i - Integer.MIN_VALUE;
                } else {
                    c319491 = new C319491(continuation);
                }
            }
            Object objGetPresubmitOrderValidation = c319491.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c319491.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objGetPresubmitOrderValidation);
                GetPresubmitOrderValidationRequestDto data = request.getData();
                c319491.label = 1;
                objGetPresubmitOrderValidation = ceres.GetPresubmitOrderValidation(data, c319491);
                if (objGetPresubmitOrderValidation == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objGetPresubmitOrderValidation);
            }
            return new Response(objGetPresubmitOrderValidation, null, 2, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object GetOrderByAccountIDAndOrderID(Ceres ceres, Request<GetOrderByIDRequestDto> request, Continuation<? super Response<FuturesOrderDto>> continuation) {
            C319431 c319431;
            if (continuation instanceof C319431) {
                c319431 = (C319431) continuation;
                int i = c319431.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c319431.label = i - Integer.MIN_VALUE;
                } else {
                    c319431 = new C319431(continuation);
                }
            }
            Object objGetOrderByAccountIDAndOrderID = c319431.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c319431.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objGetOrderByAccountIDAndOrderID);
                GetOrderByIDRequestDto data = request.getData();
                c319431.label = 1;
                objGetOrderByAccountIDAndOrderID = ceres.GetOrderByAccountIDAndOrderID(data, c319431);
                if (objGetOrderByAccountIDAndOrderID == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objGetOrderByAccountIDAndOrderID);
            }
            return new Response(objGetOrderByAccountIDAndOrderID, null, 2, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object GetOrderByID(Ceres ceres, Request<GetOrderByIDRequestDto> request, Continuation<? super Response<FuturesOrderDto>> continuation) {
            C319441 c319441;
            if (continuation instanceof C319441) {
                c319441 = (C319441) continuation;
                int i = c319441.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c319441.label = i - Integer.MIN_VALUE;
                } else {
                    c319441 = new C319441(continuation);
                }
            }
            Object objGetOrderByID = c319441.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c319441.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objGetOrderByID);
                GetOrderByIDRequestDto data = request.getData();
                c319441.label = 1;
                objGetOrderByID = ceres.GetOrderByID(data, c319441);
                if (objGetOrderByID == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objGetOrderByID);
            }
            return new Response(objGetOrderByID, null, 2, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object GetOrdersByAccountID(Ceres ceres, Request<GetOrdersRequestDto> request, Continuation<? super Response<GetOrdersResponseDto>> continuation) {
            C319461 c319461;
            if (continuation instanceof C319461) {
                c319461 = (C319461) continuation;
                int i = c319461.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c319461.label = i - Integer.MIN_VALUE;
                } else {
                    c319461 = new C319461(continuation);
                }
            }
            Object objGetOrdersByAccountID = c319461.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c319461.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objGetOrdersByAccountID);
                GetOrdersRequestDto data = request.getData();
                c319461.label = 1;
                objGetOrdersByAccountID = ceres.GetOrdersByAccountID(data, c319461);
                if (objGetOrdersByAccountID == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objGetOrdersByAccountID);
            }
            return new Response(objGetOrdersByAccountID, null, 2, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object GetCashSettlementExecutionByID(Ceres ceres, Request<GetCashSettlementExecutionByIDRequestDto> request, Continuation<? super Response<FuturesExecutionDto>> continuation) {
            C319321 c319321;
            if (continuation instanceof C319321) {
                c319321 = (C319321) continuation;
                int i = c319321.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c319321.label = i - Integer.MIN_VALUE;
                } else {
                    c319321 = new C319321(continuation);
                }
            }
            Object objGetCashSettlementExecutionByID = c319321.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c319321.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objGetCashSettlementExecutionByID);
                GetCashSettlementExecutionByIDRequestDto data = request.getData();
                c319321.label = 1;
                objGetCashSettlementExecutionByID = ceres.GetCashSettlementExecutionByID(data, c319321);
                if (objGetCashSettlementExecutionByID == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objGetCashSettlementExecutionByID);
            }
            return new Response(objGetCashSettlementExecutionByID, null, 2, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object GetCashSettlementExecutions(Ceres ceres, Request<GetCashSettlementExecutionsRequestDto> request, Continuation<? super Response<GetCashSettlementExecutionsResponseDto>> continuation) {
            C319331 c319331;
            if (continuation instanceof C319331) {
                c319331 = (C319331) continuation;
                int i = c319331.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c319331.label = i - Integer.MIN_VALUE;
                } else {
                    c319331 = new C319331(continuation);
                }
            }
            Object objGetCashSettlementExecutions = c319331.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c319331.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objGetCashSettlementExecutions);
                GetCashSettlementExecutionsRequestDto data = request.getData();
                c319331.label = 1;
                objGetCashSettlementExecutions = ceres.GetCashSettlementExecutions(data, c319331);
                if (objGetCashSettlementExecutions == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objGetCashSettlementExecutions);
            }
            return new Response(objGetCashSettlementExecutions, null, 2, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object GetOrders(Ceres ceres, Request<GetOrdersRequestDto> request, Continuation<? super Response<GetOrdersResponseDto>> continuation) {
            C319451 c319451;
            if (continuation instanceof C319451) {
                c319451 = (C319451) continuation;
                int i = c319451.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c319451.label = i - Integer.MIN_VALUE;
                } else {
                    c319451 = new C319451(continuation);
                }
            }
            Object objGetOrders = c319451.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c319451.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objGetOrders);
                GetOrdersRequestDto data = request.getData();
                c319451.label = 1;
                objGetOrders = ceres.GetOrders(data, c319451);
                if (objGetOrders == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objGetOrders);
            }
            return new Response(objGetOrders, null, 2, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object CancelFuturesOrder(Ceres ceres, Request<CancelFuturesOrderRequestDto> request, Continuation<? super Response<CancelFuturesOrderResponseDto>> continuation) {
            C319211 c319211;
            if (continuation instanceof C319211) {
                c319211 = (C319211) continuation;
                int i = c319211.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c319211.label = i - Integer.MIN_VALUE;
                } else {
                    c319211 = new C319211(continuation);
                }
            }
            Object objCancelFuturesOrder = c319211.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c319211.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objCancelFuturesOrder);
                CancelFuturesOrderRequestDto data = request.getData();
                c319211.label = 1;
                objCancelFuturesOrder = ceres.CancelFuturesOrder(data, c319211);
                if (objCancelFuturesOrder == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objCancelFuturesOrder);
            }
            return new Response(objCancelFuturesOrder, null, 2, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object CancelEventContractOrder(Ceres ceres, Request<CancelEventContractOrderRequestDto> request, Continuation<? super Response<CancelEventContractOrderResponseDto>> continuation) {
            C319201 c319201;
            if (continuation instanceof C319201) {
                c319201 = (C319201) continuation;
                int i = c319201.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c319201.label = i - Integer.MIN_VALUE;
                } else {
                    c319201 = new C319201(continuation);
                }
            }
            Object objCancelEventContractOrder = c319201.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c319201.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objCancelEventContractOrder);
                CancelEventContractOrderRequestDto data = request.getData();
                c319201.label = 1;
                objCancelEventContractOrder = ceres.CancelEventContractOrder(data, c319201);
                if (objCancelEventContractOrder == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objCancelEventContractOrder);
            }
            return new Response(objCancelEventContractOrder, null, 2, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object GetAccounts(Ceres ceres, Request<GetAccountsRequestDto> request, Continuation<? super Response<GetAccountsResponseDto>> continuation) {
            C319291 c319291;
            if (continuation instanceof C319291) {
                c319291 = (C319291) continuation;
                int i = c319291.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c319291.label = i - Integer.MIN_VALUE;
                } else {
                    c319291 = new C319291(continuation);
                }
            }
            Object objGetAccounts = c319291.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c319291.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objGetAccounts);
                GetAccountsRequestDto data = request.getData();
                c319291.label = 1;
                objGetAccounts = ceres.GetAccounts(data, c319291);
                if (objGetAccounts == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objGetAccounts);
            }
            return new Response(objGetAccounts, null, 2, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object GetCurrentCashBalance(Ceres ceres, Request<GetCurrentCashBalanceRequestDto> request, Continuation<? super Response<CashBalanceDto>> continuation) {
            C319371 c319371;
            if (continuation instanceof C319371) {
                c319371 = (C319371) continuation;
                int i = c319371.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c319371.label = i - Integer.MIN_VALUE;
                } else {
                    c319371 = new C319371(continuation);
                }
            }
            Object objGetCurrentCashBalance = c319371.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c319371.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objGetCurrentCashBalance);
                GetCurrentCashBalanceRequestDto data = request.getData();
                c319371.label = 1;
                objGetCurrentCashBalance = ceres.GetCurrentCashBalance(data, c319371);
                if (objGetCurrentCashBalance == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objGetCurrentCashBalance);
            }
            return new Response(objGetCurrentCashBalance, null, 2, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object GetCurrentPositions(Ceres ceres, Request<GetCurrentPositionsRequestDto> request, Continuation<? super Response<GetCurrentPositionsResponseDto>> continuation) {
            C319381 c319381;
            if (continuation instanceof C319381) {
                c319381 = (C319381) continuation;
                int i = c319381.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c319381.label = i - Integer.MIN_VALUE;
                } else {
                    c319381 = new C319381(continuation);
                }
            }
            Object objGetCurrentPositions = c319381.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c319381.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objGetCurrentPositions);
                GetCurrentPositionsRequestDto data = request.getData();
                c319381.label = 1;
                objGetCurrentPositions = ceres.GetCurrentPositions(data, c319381);
                if (objGetCurrentPositions == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objGetCurrentPositions);
            }
            return new Response(objGetCurrentPositions, null, 2, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object GetCurrentPositionsByContractID(Ceres ceres, Request<GetCurrentPositionsByContractIDRequestDto> request, Continuation<? super Response<GetCurrentPositionsByContractIDResponseDto>> continuation) {
            C319391 c319391;
            if (continuation instanceof C319391) {
                c319391 = (C319391) continuation;
                int i = c319391.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c319391.label = i - Integer.MIN_VALUE;
                } else {
                    c319391 = new C319391(continuation);
                }
            }
            Object objGetCurrentPositionsByContractID = c319391.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c319391.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objGetCurrentPositionsByContractID);
                GetCurrentPositionsByContractIDRequestDto data = request.getData();
                c319391.label = 1;
                objGetCurrentPositionsByContractID = ceres.GetCurrentPositionsByContractID(data, c319391);
                if (objGetCurrentPositionsByContractID == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objGetCurrentPositionsByContractID);
            }
            return new Response(objGetCurrentPositionsByContractID, null, 2, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object GetCurrentAggregatedPositions(Ceres ceres, Request<GetCurrentAggregatedPositionsRequestDto> request, Continuation<? super Response<GetCurrentAggregatedPositionsResponseDto>> continuation) {
            C319361 c319361;
            if (continuation instanceof C319361) {
                c319361 = (C319361) continuation;
                int i = c319361.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c319361.label = i - Integer.MIN_VALUE;
                } else {
                    c319361 = new C319361(continuation);
                }
            }
            Object objGetCurrentAggregatedPositions = c319361.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c319361.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objGetCurrentAggregatedPositions);
                GetCurrentAggregatedPositionsRequestDto data = request.getData();
                c319361.label = 1;
                objGetCurrentAggregatedPositions = ceres.GetCurrentAggregatedPositions(data, c319361);
                if (objGetCurrentAggregatedPositions == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objGetCurrentAggregatedPositions);
            }
            return new Response(objGetCurrentAggregatedPositions, null, 2, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object GetContractQuantities(Ceres ceres, Request<GetContractQuantitiesRequestDto> request, Continuation<? super Response<GetContractQuantitiesResponseDto>> continuation) {
            C319351 c319351;
            if (continuation instanceof C319351) {
                c319351 = (C319351) continuation;
                int i = c319351.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c319351.label = i - Integer.MIN_VALUE;
                } else {
                    c319351 = new C319351(continuation);
                }
            }
            Object objGetContractQuantities = c319351.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c319351.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objGetContractQuantities);
                GetContractQuantitiesRequestDto data = request.getData();
                c319351.label = 1;
                objGetContractQuantities = ceres.GetContractQuantities(data, c319351);
                if (objGetContractQuantities == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objGetContractQuantities);
            }
            return new Response(objGetContractQuantities, null, 2, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object CreatePositionSellout(Ceres ceres, Request<CreatePositionSelloutRequestDto> request, Continuation<? super Response<CreatePositionSelloutResponseDto>> continuation) {
            C319261 c319261;
            if (continuation instanceof C319261) {
                c319261 = (C319261) continuation;
                int i = c319261.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c319261.label = i - Integer.MIN_VALUE;
                } else {
                    c319261 = new C319261(continuation);
                }
            }
            Object objCreatePositionSellout = c319261.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c319261.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objCreatePositionSellout);
                CreatePositionSelloutRequestDto data = request.getData();
                c319261.label = 1;
                objCreatePositionSellout = ceres.CreatePositionSellout(data, c319261);
                if (objCreatePositionSellout == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objCreatePositionSellout);
            }
            return new Response(objCreatePositionSellout, null, 2, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object GetPnL(Ceres ceres, Request<GetPnLRequestDto> request, Continuation<? super Response<PnLDto>> continuation) {
            C319471 c319471;
            if (continuation instanceof C319471) {
                c319471 = (C319471) continuation;
                int i = c319471.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c319471.label = i - Integer.MIN_VALUE;
                } else {
                    c319471 = new C319471(continuation);
                }
            }
            Object objGetPnL = c319471.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c319471.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objGetPnL);
                GetPnLRequestDto data = request.getData();
                c319471.label = 1;
                objGetPnL = ceres.GetPnL(data, c319471);
                if (objGetPnL == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objGetPnL);
            }
            return new Response(objGetPnL, null, 2, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object GetPnLCostBasis(Ceres ceres, Request<GetPnLRequestDto> request, Continuation<? super Response<PnLCostBasisDto>> continuation) {
            C319481 c319481;
            if (continuation instanceof C319481) {
                c319481 = (C319481) continuation;
                int i = c319481.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c319481.label = i - Integer.MIN_VALUE;
                } else {
                    c319481 = new C319481(continuation);
                }
            }
            Object objGetPnLCostBasis = c319481.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c319481.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objGetPnLCostBasis);
                GetPnLRequestDto data = request.getData();
                c319481.label = 1;
                objGetPnLCostBasis = ceres.GetPnLCostBasis(data, c319481);
                if (objGetPnLCostBasis == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objGetPnLCostBasis);
            }
            return new Response(objGetPnLCostBasis, null, 2, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object GetBuyingPowerEffect(Ceres ceres, Request<GetBuyingPowerEffectRequestDto> request, Continuation<? super Response<GetBuyingPowerEffectResponseDto>> continuation) {
            C319311 c319311;
            if (continuation instanceof C319311) {
                c319311 = (C319311) continuation;
                int i = c319311.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c319311.label = i - Integer.MIN_VALUE;
                } else {
                    c319311 = new C319311(continuation);
                }
            }
            Object objGetBuyingPowerEffect = c319311.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c319311.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objGetBuyingPowerEffect);
                GetBuyingPowerEffectRequestDto data = request.getData();
                c319311.label = 1;
                objGetBuyingPowerEffect = ceres.GetBuyingPowerEffect(data, c319311);
                if (objGetBuyingPowerEffect == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objGetBuyingPowerEffect);
            }
            return new Response(objGetBuyingPowerEffect, null, 2, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object GetFeesForTentativeOrder(Ceres ceres, Request<GetFeesForTentativeOrderRequestDto> request, Continuation<? super Response<GetFeesForTentativeOrderResponseDto>> continuation) {
            C319411 c319411;
            if (continuation instanceof C319411) {
                c319411 = (C319411) continuation;
                int i = c319411.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c319411.label = i - Integer.MIN_VALUE;
                } else {
                    c319411 = new C319411(continuation);
                }
            }
            Object objGetFeesForTentativeOrder = c319411.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c319411.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objGetFeesForTentativeOrder);
                GetFeesForTentativeOrderRequestDto data = request.getData();
                c319411.label = 1;
                objGetFeesForTentativeOrder = ceres.GetFeesForTentativeOrder(data, c319411);
                if (objGetFeesForTentativeOrder == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objGetFeesForTentativeOrder);
            }
            return new Response(objGetFeesForTentativeOrder, null, 2, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object ValidateOrder(Ceres ceres, Request<ValidateOrderRequestDto> request, Continuation<? super Response<ValidateOrderResponseDto>> continuation) {
            C319561 c319561;
            if (continuation instanceof C319561) {
                c319561 = (C319561) continuation;
                int i = c319561.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c319561.label = i - Integer.MIN_VALUE;
                } else {
                    c319561 = new C319561(continuation);
                }
            }
            Object objValidateOrder = c319561.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c319561.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objValidateOrder);
                ValidateOrderRequestDto data = request.getData();
                c319561.label = 1;
                objValidateOrder = ceres.ValidateOrder(data, c319561);
                if (objValidateOrder == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objValidateOrder);
            }
            return new Response(objValidateOrder, null, 2, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object GetRealizedPnlForOrders(Ceres ceres, Request<GetRealizedPnlForOrdersRequestDto> request, Continuation<? super Response<GetRealizedPnlForOrdersResponseDto>> continuation) {
            C319501 c319501;
            if (continuation instanceof C319501) {
                c319501 = (C319501) continuation;
                int i = c319501.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c319501.label = i - Integer.MIN_VALUE;
                } else {
                    c319501 = new C319501(continuation);
                }
            }
            Object objGetRealizedPnlForOrders = c319501.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c319501.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objGetRealizedPnlForOrders);
                GetRealizedPnlForOrdersRequestDto data = request.getData();
                c319501.label = 1;
                objGetRealizedPnlForOrders = ceres.GetRealizedPnlForOrders(data, c319501);
                if (objGetRealizedPnlForOrders == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objGetRealizedPnlForOrders);
            }
            return new Response(objGetRealizedPnlForOrders, null, 2, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object GetEventContractRealizedPnlByContract(Ceres ceres, Request<GetEventContractRealizedPnlByContractRequestDto> request, Continuation<? super Response<GetEventContractRealizedPnlByContractResponseDto>> continuation) {
            C319401 c319401;
            if (continuation instanceof C319401) {
                c319401 = (C319401) continuation;
                int i = c319401.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c319401.label = i - Integer.MIN_VALUE;
                } else {
                    c319401 = new C319401(continuation);
                }
            }
            Object objGetEventContractRealizedPnlByContract = c319401.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c319401.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objGetEventContractRealizedPnlByContract);
                GetEventContractRealizedPnlByContractRequestDto data = request.getData();
                c319401.label = 1;
                objGetEventContractRealizedPnlByContract = ceres.GetEventContractRealizedPnlByContract(data, c319401);
                if (objGetEventContractRealizedPnlByContract == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objGetEventContractRealizedPnlByContract);
            }
            return new Response(objGetEventContractRealizedPnlByContract, null, 2, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object FlattenPositions(Ceres ceres, Request<FlattenPositionsRequestDto> request, Continuation<? super Response<FlattenPositionsResponseDto>> continuation) {
            C319281 c319281;
            if (continuation instanceof C319281) {
                c319281 = (C319281) continuation;
                int i = c319281.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c319281.label = i - Integer.MIN_VALUE;
                } else {
                    c319281 = new C319281(continuation);
                }
            }
            Object objFlattenPositions = c319281.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c319281.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objFlattenPositions);
                FlattenPositionsRequestDto data = request.getData();
                c319281.label = 1;
                objFlattenPositions = ceres.FlattenPositions(data, c319281);
                if (objFlattenPositions == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objFlattenPositions);
            }
            return new Response(objFlattenPositions, null, 2, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object ReplaceFuturesOrder(Ceres ceres, Request<ReplaceFuturesOrderRequestDto> request, Continuation<? super Response<FuturesOrderDto>> continuation) {
            C319541 c319541;
            if (continuation instanceof C319541) {
                c319541 = (C319541) continuation;
                int i = c319541.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c319541.label = i - Integer.MIN_VALUE;
                } else {
                    c319541 = new C319541(continuation);
                }
            }
            Object objReplaceFuturesOrder = c319541.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c319541.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objReplaceFuturesOrder);
                ReplaceFuturesOrderRequestDto data = request.getData();
                c319541.label = 1;
                objReplaceFuturesOrder = ceres.ReplaceFuturesOrder(data, c319541);
                if (objReplaceFuturesOrder == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objReplaceFuturesOrder);
            }
            return new Response(objReplaceFuturesOrder, null, 2, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object ListManualCashCorrections(Ceres ceres, Request<ListManualCashCorrectionsRequestDto> request, Continuation<? super Response<ListManualCashCorrectionsResponseDto>> continuation) {
            C319521 c319521;
            if (continuation instanceof C319521) {
                c319521 = (C319521) continuation;
                int i = c319521.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c319521.label = i - Integer.MIN_VALUE;
                } else {
                    c319521 = new C319521(continuation);
                }
            }
            Object objListManualCashCorrections = c319521.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c319521.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objListManualCashCorrections);
                ListManualCashCorrectionsRequestDto data = request.getData();
                c319521.label = 1;
                objListManualCashCorrections = ceres.ListManualCashCorrections(data, c319521);
                if (objListManualCashCorrections == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objListManualCashCorrections);
            }
            return new Response(objListManualCashCorrections, null, 2, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object MarkAttestationsSigned(Ceres ceres, Request<MarkAttestationsSignedRequestDto> request, Continuation<? super Response<MarkAttestationsSignedResponseDto>> continuation) {
            C319531 c319531;
            if (continuation instanceof C319531) {
                c319531 = (C319531) continuation;
                int i = c319531.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c319531.label = i - Integer.MIN_VALUE;
                } else {
                    c319531 = new C319531(continuation);
                }
            }
            Object objMarkAttestationsSigned = c319531.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c319531.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objMarkAttestationsSigned);
                MarkAttestationsSignedRequestDto data = request.getData();
                c319531.label = 1;
                objMarkAttestationsSigned = ceres.MarkAttestationsSigned(data, c319531);
                if (objMarkAttestationsSigned == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objMarkAttestationsSigned);
            }
            return new Response(objMarkAttestationsSigned, null, 2, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object GetUserSettings(Ceres ceres, Request<GetUserSettingsRequestDto> request, Continuation<? super Response<GetUserSettingsResponseDto>> continuation) {
            C319511 c319511;
            if (continuation instanceof C319511) {
                c319511 = (C319511) continuation;
                int i = c319511.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c319511.label = i - Integer.MIN_VALUE;
                } else {
                    c319511 = new C319511(continuation);
                }
            }
            Object objGetUserSettings = c319511.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c319511.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objGetUserSettings);
                GetUserSettingsRequestDto data = request.getData();
                c319511.label = 1;
                objGetUserSettings = ceres.GetUserSettings(data, c319511);
                if (objGetUserSettings == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objGetUserSettings);
            }
            return new Response(objGetUserSettings, null, 2, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object UpdateUserSettings(Ceres ceres, Request<UpdateUserSettingsRequestDto> request, Continuation<? super Response<UpdateUserSettingsResponseDto>> continuation) {
            C319551 c319551;
            if (continuation instanceof C319551) {
                c319551 = (C319551) continuation;
                int i = c319551.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c319551.label = i - Integer.MIN_VALUE;
                } else {
                    c319551 = new C319551(continuation);
                }
            }
            Object objUpdateUserSettings = c319551.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c319551.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objUpdateUserSettings);
                UpdateUserSettingsRequestDto data = request.getData();
                c319551.label = 1;
                objUpdateUserSettings = ceres.UpdateUserSettings(data, c319551);
                if (objUpdateUserSettings == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objUpdateUserSettings);
            }
            return new Response(objUpdateUserSettings, null, 2, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object GetFuturesIntervalPerformance(Ceres ceres, Request<GetFuturesIntervalPerformanceRequestDto> request, Continuation<? super Response<GetFuturesIntervalPerformanceResponseDto>> continuation) {
            C319421 c319421;
            if (continuation instanceof C319421) {
                c319421 = (C319421) continuation;
                int i = c319421.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c319421.label = i - Integer.MIN_VALUE;
                } else {
                    c319421 = new C319421(continuation);
                }
            }
            Object objGetFuturesIntervalPerformance = c319421.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c319421.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objGetFuturesIntervalPerformance);
                GetFuturesIntervalPerformanceRequestDto data = request.getData();
                c319421.label = 1;
                objGetFuturesIntervalPerformance = ceres.GetFuturesIntervalPerformance(data, c319421);
                if (objGetFuturesIntervalPerformance == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objGetFuturesIntervalPerformance);
            }
            return new Response(objGetFuturesIntervalPerformance, null, 2, null);
        }
    }
}
