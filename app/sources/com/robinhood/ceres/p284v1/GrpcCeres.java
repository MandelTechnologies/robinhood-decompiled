package com.robinhood.ceres.p284v1;

import com.plaid.internal.EnumC7081g;
import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import com.robinhood.idl.Response2;
import com.robinhood.idl.RhGenerated;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GrpcCeres.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000°\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\nJ\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010\u000e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u000fH\u0096@¢\u0006\u0002\u0010\u0010J\"\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u000f0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u0013H\u0096@¢\u0006\u0002\u0010\u0014J\"\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00130\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\u0017H\u0096@¢\u0006\u0002\u0010\u0018J\"\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00170\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\b\u001a\u00020\u001bH\u0096@¢\u0006\u0002\u0010\u001cJ\"\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u001b0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\b\u001a\u00020\u001fH\u0096@¢\u0006\u0002\u0010 J\"\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u001f0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010!\u001a\u00020\"2\u0006\u0010\b\u001a\u00020#H\u0096@¢\u0006\u0002\u0010$J\"\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020#0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010%\u001a\u00020&2\u0006\u0010\b\u001a\u00020'H\u0096@¢\u0006\u0002\u0010(J\"\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020'0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010)\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020*H\u0096@¢\u0006\u0002\u0010+J\"\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020*0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010,\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020*H\u0096@¢\u0006\u0002\u0010+J\"\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020*0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010-\u001a\u00020.2\u0006\u0010\b\u001a\u00020/H\u0096@¢\u0006\u0002\u00100J\"\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020/0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u00101\u001a\u0002022\u0006\u0010\b\u001a\u000203H\u0096@¢\u0006\u0002\u00104J\"\u00101\u001a\b\u0012\u0004\u0012\u0002020\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002030\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u00105\u001a\u0002062\u0006\u0010\b\u001a\u000207H\u0096@¢\u0006\u0002\u00108J\"\u00105\u001a\b\u0012\u0004\u0012\u0002060\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002070\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u00109\u001a\u00020.2\u0006\u0010\b\u001a\u00020/H\u0096@¢\u0006\u0002\u00100J\"\u00109\u001a\b\u0012\u0004\u0012\u00020.0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020/0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010:\u001a\u00020;2\u0006\u0010\b\u001a\u00020<H\u0096@¢\u0006\u0002\u0010=J\"\u0010:\u001a\b\u0012\u0004\u0012\u00020;0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020<0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010>\u001a\u00020?2\u0006\u0010\b\u001a\u00020@H\u0096@¢\u0006\u0002\u0010AJ\"\u0010>\u001a\b\u0012\u0004\u0012\u00020?0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020@0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010B\u001a\u00020C2\u0006\u0010\b\u001a\u00020DH\u0096@¢\u0006\u0002\u0010EJ\"\u0010B\u001a\b\u0012\u0004\u0012\u00020C0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020D0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010F\u001a\u00020G2\u0006\u0010\b\u001a\u00020HH\u0096@¢\u0006\u0002\u0010IJ\"\u0010F\u001a\b\u0012\u0004\u0012\u00020G0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020H0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010J\u001a\u00020K2\u0006\u0010\b\u001a\u00020LH\u0096@¢\u0006\u0002\u0010MJ\"\u0010J\u001a\b\u0012\u0004\u0012\u00020K0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020L0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010N\u001a\u00020O2\u0006\u0010\b\u001a\u00020PH\u0096@¢\u0006\u0002\u0010QJ\"\u0010N\u001a\b\u0012\u0004\u0012\u00020O0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020P0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010R\u001a\u00020S2\u0006\u0010\b\u001a\u00020TH\u0096@¢\u0006\u0002\u0010UJ\"\u0010R\u001a\b\u0012\u0004\u0012\u00020S0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020T0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010V\u001a\u00020W2\u0006\u0010\b\u001a\u00020XH\u0096@¢\u0006\u0002\u0010YJ\"\u0010V\u001a\b\u0012\u0004\u0012\u00020W0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020X0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010Z\u001a\u00020[2\u0006\u0010\b\u001a\u00020\\H\u0096@¢\u0006\u0002\u0010]J\"\u0010Z\u001a\b\u0012\u0004\u0012\u00020[0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\\0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010^\u001a\u00020_2\u0006\u0010\b\u001a\u00020`H\u0096@¢\u0006\u0002\u0010aJ\"\u0010^\u001a\b\u0012\u0004\u0012\u00020_0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020`0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010b\u001a\u00020c2\u0006\u0010\b\u001a\u00020`H\u0096@¢\u0006\u0002\u0010aJ\"\u0010b\u001a\b\u0012\u0004\u0012\u00020c0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020`0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010d\u001a\u00020e2\u0006\u0010\b\u001a\u00020fH\u0096@¢\u0006\u0002\u0010gJ\"\u0010d\u001a\b\u0012\u0004\u0012\u00020e0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020f0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010h\u001a\u00020i2\u0006\u0010\b\u001a\u00020jH\u0096@¢\u0006\u0002\u0010kJ\"\u0010h\u001a\b\u0012\u0004\u0012\u00020i0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020j0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010l\u001a\u00020m2\u0006\u0010\b\u001a\u00020nH\u0096@¢\u0006\u0002\u0010oJ\"\u0010l\u001a\b\u0012\u0004\u0012\u00020m0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020n0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010p\u001a\u00020q2\u0006\u0010\b\u001a\u00020rH\u0096@¢\u0006\u0002\u0010sJ\"\u0010p\u001a\b\u0012\u0004\u0012\u00020q0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020r0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010t\u001a\u00020u2\u0006\u0010\b\u001a\u00020vH\u0096@¢\u0006\u0002\u0010wJ\"\u0010t\u001a\b\u0012\u0004\u0012\u00020u0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020v0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010x\u001a\u00020y2\u0006\u0010\b\u001a\u00020zH\u0096@¢\u0006\u0002\u0010{J\"\u0010x\u001a\b\u0012\u0004\u0012\u00020y0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020z0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010|\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020}H\u0096@¢\u0006\u0002\u0010~J\"\u0010|\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020}0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0019\u0010\u007f\u001a\u00030\u0080\u00012\u0007\u0010\b\u001a\u00030\u0081\u0001H\u0096@¢\u0006\u0003\u0010\u0082\u0001J$\u0010\u007f\u001a\t\u0012\u0005\u0012\u00030\u0080\u00010\u000b2\r\u0010\b\u001a\t\u0012\u0005\u0012\u00030\u0081\u00010\fH\u0096@¢\u0006\u0002\u0010\rJ\u001a\u0010\u0083\u0001\u001a\u00030\u0084\u00012\u0007\u0010\b\u001a\u00030\u0085\u0001H\u0096@¢\u0006\u0003\u0010\u0086\u0001J%\u0010\u0083\u0001\u001a\t\u0012\u0005\u0012\u00030\u0084\u00010\u000b2\r\u0010\b\u001a\t\u0012\u0005\u0012\u00030\u0085\u00010\fH\u0096@¢\u0006\u0002\u0010\rJ\u001a\u0010\u0087\u0001\u001a\u00030\u0088\u00012\u0007\u0010\b\u001a\u00030\u0089\u0001H\u0096@¢\u0006\u0003\u0010\u008a\u0001J%\u0010\u0087\u0001\u001a\t\u0012\u0005\u0012\u00030\u0088\u00010\u000b2\r\u0010\b\u001a\t\u0012\u0005\u0012\u00030\u0089\u00010\fH\u0096@¢\u0006\u0002\u0010\rJ\u001a\u0010\u008b\u0001\u001a\u00030\u008c\u00012\u0007\u0010\b\u001a\u00030\u008d\u0001H\u0096@¢\u0006\u0003\u0010\u008e\u0001J%\u0010\u008b\u0001\u001a\t\u0012\u0005\u0012\u00030\u008c\u00010\u000b2\r\u0010\b\u001a\t\u0012\u0005\u0012\u00030\u008d\u00010\fH\u0096@¢\u0006\u0002\u0010\rJ\u001a\u0010\u008f\u0001\u001a\u00030\u0090\u00012\u0007\u0010\b\u001a\u00030\u0091\u0001H\u0096@¢\u0006\u0003\u0010\u0092\u0001J%\u0010\u008f\u0001\u001a\t\u0012\u0005\u0012\u00030\u0090\u00010\u000b2\r\u0010\b\u001a\t\u0012\u0005\u0012\u00030\u0091\u00010\fH\u0096@¢\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0093\u0001"}, m3636d2 = {"Lcom/robinhood/ceres/v1/GrpcCeres;", "Lcom/robinhood/ceres/v1/Ceres;", "grpcClient", "Lcom/robinhood/ceres/v1/CeresClient;", "<init>", "(Lcom/robinhood/ceres/v1/CeresClient;)V", "CreateFuturesOrder", "Lcom/robinhood/ceres/v1/FuturesOrderDto;", "request", "Lcom/robinhood/ceres/v1/CreateFuturesOrderRequestDto;", "(Lcom/robinhood/ceres/v1/CreateFuturesOrderRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/idl/Response;", "Lcom/robinhood/idl/Request;", "(Lcom/robinhood/idl/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "CreateEventContractOrder", "Lcom/robinhood/ceres/v1/CreateEventContractOrderRequestDto;", "(Lcom/robinhood/ceres/v1/CreateEventContractOrderRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "CreateFuturesAccount", "Lcom/robinhood/ceres/v1/CreateFuturesAccountResponseDto;", "Lcom/robinhood/ceres/v1/CreateFuturesAccountRequestDto;", "(Lcom/robinhood/ceres/v1/CreateFuturesAccountRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "CheckAccountFuturesEligibility", "Lcom/robinhood/ceres/v1/CheckAccountFuturesEligibilityResponseDto;", "Lcom/robinhood/ceres/v1/CheckAccountFuturesEligibilityRequestDto;", "(Lcom/robinhood/ceres/v1/CheckAccountFuturesEligibilityRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetCheckpointSuitability", "Lcom/robinhood/ceres/v1/GetCheckpointSuitabilityResponseDto;", "Lcom/robinhood/ceres/v1/GetCheckpointSuitabilityRequestDto;", "(Lcom/robinhood/ceres/v1/GetCheckpointSuitabilityRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "EvaluateCheckpointSuitability", "Lcom/robinhood/ceres/v1/EvaluateCheckpointSuitabilityResponseDto;", "Lcom/robinhood/ceres/v1/EvaluateCheckpointSuitabilityRequestDto;", "(Lcom/robinhood/ceres/v1/EvaluateCheckpointSuitabilityRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetAgreementType", "Lcom/robinhood/ceres/v1/GetAgreementTypeResponseDto;", "Lcom/robinhood/ceres/v1/GetAgreementTypeRequestDto;", "(Lcom/robinhood/ceres/v1/GetAgreementTypeRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetPresubmitOrderValidation", "Lcom/robinhood/ceres/v1/GetPresubmitOrderValidationResponseDto;", "Lcom/robinhood/ceres/v1/GetPresubmitOrderValidationRequestDto;", "(Lcom/robinhood/ceres/v1/GetPresubmitOrderValidationRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetOrderByAccountIDAndOrderID", "Lcom/robinhood/ceres/v1/GetOrderByIDRequestDto;", "(Lcom/robinhood/ceres/v1/GetOrderByIDRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetOrderByID", "GetOrdersByAccountID", "Lcom/robinhood/ceres/v1/GetOrdersResponseDto;", "Lcom/robinhood/ceres/v1/GetOrdersRequestDto;", "(Lcom/robinhood/ceres/v1/GetOrdersRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetCashSettlementExecutionByID", "Lcom/robinhood/ceres/v1/FuturesExecutionDto;", "Lcom/robinhood/ceres/v1/GetCashSettlementExecutionByIDRequestDto;", "(Lcom/robinhood/ceres/v1/GetCashSettlementExecutionByIDRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetCashSettlementExecutions", "Lcom/robinhood/ceres/v1/GetCashSettlementExecutionsResponseDto;", "Lcom/robinhood/ceres/v1/GetCashSettlementExecutionsRequestDto;", "(Lcom/robinhood/ceres/v1/GetCashSettlementExecutionsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetOrders", "CancelFuturesOrder", "Lcom/robinhood/ceres/v1/CancelFuturesOrderResponseDto;", "Lcom/robinhood/ceres/v1/CancelFuturesOrderRequestDto;", "(Lcom/robinhood/ceres/v1/CancelFuturesOrderRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "CancelEventContractOrder", "Lcom/robinhood/ceres/v1/CancelEventContractOrderResponseDto;", "Lcom/robinhood/ceres/v1/CancelEventContractOrderRequestDto;", "(Lcom/robinhood/ceres/v1/CancelEventContractOrderRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetAccounts", "Lcom/robinhood/ceres/v1/GetAccountsResponseDto;", "Lcom/robinhood/ceres/v1/GetAccountsRequestDto;", "(Lcom/robinhood/ceres/v1/GetAccountsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetCurrentCashBalance", "Lcom/robinhood/ceres/v1/CashBalanceDto;", "Lcom/robinhood/ceres/v1/GetCurrentCashBalanceRequestDto;", "(Lcom/robinhood/ceres/v1/GetCurrentCashBalanceRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetCurrentPositions", "Lcom/robinhood/ceres/v1/GetCurrentPositionsResponseDto;", "Lcom/robinhood/ceres/v1/GetCurrentPositionsRequestDto;", "(Lcom/robinhood/ceres/v1/GetCurrentPositionsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetCurrentPositionsByContractID", "Lcom/robinhood/ceres/v1/GetCurrentPositionsByContractIDResponseDto;", "Lcom/robinhood/ceres/v1/GetCurrentPositionsByContractIDRequestDto;", "(Lcom/robinhood/ceres/v1/GetCurrentPositionsByContractIDRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetCurrentAggregatedPositions", "Lcom/robinhood/ceres/v1/GetCurrentAggregatedPositionsResponseDto;", "Lcom/robinhood/ceres/v1/GetCurrentAggregatedPositionsRequestDto;", "(Lcom/robinhood/ceres/v1/GetCurrentAggregatedPositionsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetContractQuantities", "Lcom/robinhood/ceres/v1/GetContractQuantitiesResponseDto;", "Lcom/robinhood/ceres/v1/GetContractQuantitiesRequestDto;", "(Lcom/robinhood/ceres/v1/GetContractQuantitiesRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "CreatePositionSellout", "Lcom/robinhood/ceres/v1/CreatePositionSelloutResponseDto;", "Lcom/robinhood/ceres/v1/CreatePositionSelloutRequestDto;", "(Lcom/robinhood/ceres/v1/CreatePositionSelloutRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetPnL", "Lcom/robinhood/ceres/v1/PnLDto;", "Lcom/robinhood/ceres/v1/GetPnLRequestDto;", "(Lcom/robinhood/ceres/v1/GetPnLRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetPnLCostBasis", "Lcom/robinhood/ceres/v1/PnLCostBasisDto;", "GetBuyingPowerEffect", "Lcom/robinhood/ceres/v1/GetBuyingPowerEffectResponseDto;", "Lcom/robinhood/ceres/v1/GetBuyingPowerEffectRequestDto;", "(Lcom/robinhood/ceres/v1/GetBuyingPowerEffectRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetFeesForTentativeOrder", "Lcom/robinhood/ceres/v1/GetFeesForTentativeOrderResponseDto;", "Lcom/robinhood/ceres/v1/GetFeesForTentativeOrderRequestDto;", "(Lcom/robinhood/ceres/v1/GetFeesForTentativeOrderRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ValidateOrder", "Lcom/robinhood/ceres/v1/ValidateOrderResponseDto;", "Lcom/robinhood/ceres/v1/ValidateOrderRequestDto;", "(Lcom/robinhood/ceres/v1/ValidateOrderRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetRealizedPnlForOrders", "Lcom/robinhood/ceres/v1/GetRealizedPnlForOrdersResponseDto;", "Lcom/robinhood/ceres/v1/GetRealizedPnlForOrdersRequestDto;", "(Lcom/robinhood/ceres/v1/GetRealizedPnlForOrdersRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetEventContractRealizedPnlByContract", "Lcom/robinhood/ceres/v1/GetEventContractRealizedPnlByContractResponseDto;", "Lcom/robinhood/ceres/v1/GetEventContractRealizedPnlByContractRequestDto;", "(Lcom/robinhood/ceres/v1/GetEventContractRealizedPnlByContractRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "FlattenPositions", "Lcom/robinhood/ceres/v1/FlattenPositionsResponseDto;", "Lcom/robinhood/ceres/v1/FlattenPositionsRequestDto;", "(Lcom/robinhood/ceres/v1/FlattenPositionsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ReplaceFuturesOrder", "Lcom/robinhood/ceres/v1/ReplaceFuturesOrderRequestDto;", "(Lcom/robinhood/ceres/v1/ReplaceFuturesOrderRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ListManualCashCorrections", "Lcom/robinhood/ceres/v1/ListManualCashCorrectionsResponseDto;", "Lcom/robinhood/ceres/v1/ListManualCashCorrectionsRequestDto;", "(Lcom/robinhood/ceres/v1/ListManualCashCorrectionsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "MarkAttestationsSigned", "Lcom/robinhood/ceres/v1/MarkAttestationsSignedResponseDto;", "Lcom/robinhood/ceres/v1/MarkAttestationsSignedRequestDto;", "(Lcom/robinhood/ceres/v1/MarkAttestationsSignedRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetUserSettings", "Lcom/robinhood/ceres/v1/GetUserSettingsResponseDto;", "Lcom/robinhood/ceres/v1/GetUserSettingsRequestDto;", "(Lcom/robinhood/ceres/v1/GetUserSettingsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "UpdateUserSettings", "Lcom/robinhood/ceres/v1/UpdateUserSettingsResponseDto;", "Lcom/robinhood/ceres/v1/UpdateUserSettingsRequestDto;", "(Lcom/robinhood/ceres/v1/UpdateUserSettingsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetFuturesIntervalPerformance", "Lcom/robinhood/ceres/v1/GetFuturesIntervalPerformanceResponseDto;", "Lcom/robinhood/ceres/v1/GetFuturesIntervalPerformanceRequestDto;", "(Lcom/robinhood/ceres/v1/GetFuturesIntervalPerformanceRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class GrpcCeres implements Ceres {
    private final CeresClient grpcClient;

    /* compiled from: GrpcCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.GrpcCeres", m3645f = "GrpcCeres.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE}, m3647m = "CancelEventContractOrder")
    /* renamed from: com.robinhood.ceres.v1.GrpcCeres$CancelEventContractOrder$1 */
    static final class C321151 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C321151(Continuation<? super C321151> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GrpcCeres.this.CancelEventContractOrder((CancelEventContractOrderRequestDto) null, this);
        }
    }

    /* compiled from: GrpcCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.GrpcCeres", m3645f = "GrpcCeres.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_ETH_WITH_PLAID_VALUE}, m3647m = "CancelFuturesOrder")
    /* renamed from: com.robinhood.ceres.v1.GrpcCeres$CancelFuturesOrder$1 */
    static final class C321161 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C321161(Continuation<? super C321161> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GrpcCeres.this.CancelFuturesOrder((CancelFuturesOrderRequestDto) null, this);
        }
    }

    /* compiled from: GrpcCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.GrpcCeres", m3645f = "GrpcCeres.kt", m3646l = {56}, m3647m = "CheckAccountFuturesEligibility")
    /* renamed from: com.robinhood.ceres.v1.GrpcCeres$CheckAccountFuturesEligibility$1 */
    static final class C321171 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C321171(Continuation<? super C321171> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GrpcCeres.this.CheckAccountFuturesEligibility((CheckAccountFuturesEligibilityRequestDto) null, this);
        }
    }

    /* compiled from: GrpcCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.GrpcCeres", m3645f = "GrpcCeres.kt", m3646l = {36}, m3647m = "CreateEventContractOrder")
    /* renamed from: com.robinhood.ceres.v1.GrpcCeres$CreateEventContractOrder$1 */
    static final class C321181 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C321181(Continuation<? super C321181> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GrpcCeres.this.CreateEventContractOrder((CreateEventContractOrderRequestDto) null, this);
        }
    }

    /* compiled from: GrpcCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.GrpcCeres", m3645f = "GrpcCeres.kt", m3646l = {46}, m3647m = "CreateFuturesAccount")
    /* renamed from: com.robinhood.ceres.v1.GrpcCeres$CreateFuturesAccount$1 */
    static final class C321191 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C321191(Continuation<? super C321191> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GrpcCeres.this.CreateFuturesAccount((CreateFuturesAccountRequestDto) null, this);
        }
    }

    /* compiled from: GrpcCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.GrpcCeres", m3645f = "GrpcCeres.kt", m3646l = {23}, m3647m = "CreateFuturesOrder")
    /* renamed from: com.robinhood.ceres.v1.GrpcCeres$CreateFuturesOrder$1 */
    static final class C321201 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C321201(Continuation<? super C321201> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GrpcCeres.this.CreateFuturesOrder((CreateFuturesOrderRequestDto) null, this);
        }
    }

    /* compiled from: GrpcCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.GrpcCeres", m3645f = "GrpcCeres.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE}, m3647m = "CreatePositionSellout")
    /* renamed from: com.robinhood.ceres.v1.GrpcCeres$CreatePositionSellout$1 */
    static final class C321211 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C321211(Continuation<? super C321211> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GrpcCeres.this.CreatePositionSellout((CreatePositionSelloutRequestDto) null, this);
        }
    }

    /* compiled from: GrpcCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.GrpcCeres", m3645f = "GrpcCeres.kt", m3646l = {76}, m3647m = "EvaluateCheckpointSuitability")
    /* renamed from: com.robinhood.ceres.v1.GrpcCeres$EvaluateCheckpointSuitability$1 */
    static final class C321221 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C321221(Continuation<? super C321221> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GrpcCeres.this.EvaluateCheckpointSuitability((EvaluateCheckpointSuitabilityRequestDto) null, this);
        }
    }

    /* compiled from: GrpcCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.GrpcCeres", m3645f = "GrpcCeres.kt", m3646l = {367}, m3647m = "FlattenPositions")
    /* renamed from: com.robinhood.ceres.v1.GrpcCeres$FlattenPositions$1 */
    static final class C321231 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C321231(Continuation<? super C321231> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GrpcCeres.this.FlattenPositions((FlattenPositionsRequestDto) null, this);
        }
    }

    /* compiled from: GrpcCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.GrpcCeres", m3645f = "GrpcCeres.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_TEXT_VALUE}, m3647m = "GetAccounts")
    /* renamed from: com.robinhood.ceres.v1.GrpcCeres$GetAccounts$1 */
    static final class C321241 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C321241(Continuation<? super C321241> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GrpcCeres.this.GetAccounts((GetAccountsRequestDto) null, this);
        }
    }

    /* compiled from: GrpcCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.GrpcCeres", m3645f = "GrpcCeres.kt", m3646l = {86}, m3647m = "GetAgreementType")
    /* renamed from: com.robinhood.ceres.v1.GrpcCeres$GetAgreementType$1 */
    static final class C321251 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C321251(Continuation<? super C321251> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GrpcCeres.this.GetAgreementType((GetAgreementTypeRequestDto) null, this);
        }
    }

    /* compiled from: GrpcCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.GrpcCeres", m3645f = "GrpcCeres.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_INLINE_LIGHTNING_VALUE}, m3647m = "GetBuyingPowerEffect")
    /* renamed from: com.robinhood.ceres.v1.GrpcCeres$GetBuyingPowerEffect$1 */
    static final class C321261 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C321261(Continuation<? super C321261> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GrpcCeres.this.GetBuyingPowerEffect((GetBuyingPowerEffectRequestDto) null, this);
        }
    }

    /* compiled from: GrpcCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.GrpcCeres", m3645f = "GrpcCeres.kt", m3646l = {136}, m3647m = "GetCashSettlementExecutionByID")
    /* renamed from: com.robinhood.ceres.v1.GrpcCeres$GetCashSettlementExecutionByID$1 */
    static final class C321271 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C321271(Continuation<? super C321271> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GrpcCeres.this.GetCashSettlementExecutionByID((GetCashSettlementExecutionByIDRequestDto) null, this);
        }
    }

    /* compiled from: GrpcCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.GrpcCeres", m3645f = "GrpcCeres.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_PERSON_VALUE}, m3647m = "GetCashSettlementExecutions")
    /* renamed from: com.robinhood.ceres.v1.GrpcCeres$GetCashSettlementExecutions$1 */
    static final class C321281 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C321281(Continuation<? super C321281> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GrpcCeres.this.GetCashSettlementExecutions((GetCashSettlementExecutionsRequestDto) null, this);
        }
    }

    /* compiled from: GrpcCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.GrpcCeres", m3645f = "GrpcCeres.kt", m3646l = {66}, m3647m = "GetCheckpointSuitability")
    /* renamed from: com.robinhood.ceres.v1.GrpcCeres$GetCheckpointSuitability$1 */
    static final class C321291 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C321291(Continuation<? super C321291> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GrpcCeres.this.GetCheckpointSuitability((GetCheckpointSuitabilityRequestDto) null, this);
        }
    }

    /* compiled from: GrpcCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.GrpcCeres", m3645f = "GrpcCeres.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE}, m3647m = "GetContractQuantities")
    /* renamed from: com.robinhood.ceres.v1.GrpcCeres$GetContractQuantities$1 */
    static final class C321301 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C321301(Continuation<? super C321301> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GrpcCeres.this.GetContractQuantities((GetContractQuantitiesRequestDto) null, this);
        }
    }

    /* compiled from: GrpcCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.GrpcCeres", m3645f = "GrpcCeres.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_01_CIRCLE_VALUE}, m3647m = "GetCurrentAggregatedPositions")
    /* renamed from: com.robinhood.ceres.v1.GrpcCeres$GetCurrentAggregatedPositions$1 */
    static final class C321311 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C321311(Continuation<? super C321311> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GrpcCeres.this.GetCurrentAggregatedPositions((GetCurrentAggregatedPositionsRequestDto) null, this);
        }
    }

    /* compiled from: GrpcCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.GrpcCeres", m3645f = "GrpcCeres.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_ARROW_DOWN_VALUE}, m3647m = "GetCurrentCashBalance")
    /* renamed from: com.robinhood.ceres.v1.GrpcCeres$GetCurrentCashBalance$1 */
    static final class C321321 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C321321(Continuation<? super C321321> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GrpcCeres.this.GetCurrentCashBalance((GetCurrentCashBalanceRequestDto) null, this);
        }
    }

    /* compiled from: GrpcCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.GrpcCeres", m3645f = "GrpcCeres.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CLOCK_VALUE}, m3647m = "GetCurrentPositions")
    /* renamed from: com.robinhood.ceres.v1.GrpcCeres$GetCurrentPositions$1 */
    static final class C321331 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C321331(Continuation<? super C321331> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GrpcCeres.this.GetCurrentPositions((GetCurrentPositionsRequestDto) null, this);
        }
    }

    /* compiled from: GrpcCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.GrpcCeres", m3645f = "GrpcCeres.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE}, m3647m = "GetCurrentPositionsByContractID")
    /* renamed from: com.robinhood.ceres.v1.GrpcCeres$GetCurrentPositionsByContractID$1 */
    static final class C321341 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C321341(Continuation<? super C321341> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GrpcCeres.this.GetCurrentPositionsByContractID((GetCurrentPositionsByContractIDRequestDto) null, this);
        }
    }

    /* compiled from: GrpcCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.GrpcCeres", m3645f = "GrpcCeres.kt", m3646l = {360}, m3647m = "GetEventContractRealizedPnlByContract")
    /* renamed from: com.robinhood.ceres.v1.GrpcCeres$GetEventContractRealizedPnlByContract$1 */
    static final class C321351 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C321351(Continuation<? super C321351> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GrpcCeres.this.GetEventContractRealizedPnlByContract((GetEventContractRealizedPnlByContractRequestDto) null, this);
        }
    }

    /* compiled from: GrpcCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.GrpcCeres", m3645f = "GrpcCeres.kt", m3646l = {EnumC7081g.f2775xbcb7e6f3}, m3647m = "GetFeesForTentativeOrder")
    /* renamed from: com.robinhood.ceres.v1.GrpcCeres$GetFeesForTentativeOrder$1 */
    static final class C321361 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C321361(Continuation<? super C321361> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GrpcCeres.this.GetFeesForTentativeOrder((GetFeesForTentativeOrderRequestDto) null, this);
        }
    }

    /* compiled from: GrpcCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.GrpcCeres", m3645f = "GrpcCeres.kt", m3646l = {413}, m3647m = "GetFuturesIntervalPerformance")
    /* renamed from: com.robinhood.ceres.v1.GrpcCeres$GetFuturesIntervalPerformance$1 */
    static final class C321371 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C321371(Continuation<? super C321371> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GrpcCeres.this.GetFuturesIntervalPerformance((GetFuturesIntervalPerformanceRequestDto) null, this);
        }
    }

    /* compiled from: GrpcCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.GrpcCeres", m3645f = "GrpcCeres.kt", m3646l = {106}, m3647m = "GetOrderByAccountIDAndOrderID")
    /* renamed from: com.robinhood.ceres.v1.GrpcCeres$GetOrderByAccountIDAndOrderID$1 */
    static final class C321381 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C321381(Continuation<? super C321381> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GrpcCeres.this.GetOrderByAccountIDAndOrderID((GetOrderByIDRequestDto) null, this);
        }
    }

    /* compiled from: GrpcCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.GrpcCeres", m3645f = "GrpcCeres.kt", m3646l = {116}, m3647m = "GetOrderByID")
    /* renamed from: com.robinhood.ceres.v1.GrpcCeres$GetOrderByID$1 */
    static final class C321391 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C321391(Continuation<? super C321391> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GrpcCeres.this.GetOrderByID((GetOrderByIDRequestDto) null, this);
        }
    }

    /* compiled from: GrpcCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.GrpcCeres", m3645f = "GrpcCeres.kt", m3646l = {156}, m3647m = "GetOrders")
    /* renamed from: com.robinhood.ceres.v1.GrpcCeres$GetOrders$1 */
    static final class C321401 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C321401(Continuation<? super C321401> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GrpcCeres.this.GetOrders((GetOrdersRequestDto) null, this);
        }
    }

    /* compiled from: GrpcCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.GrpcCeres", m3645f = "GrpcCeres.kt", m3646l = {EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE}, m3647m = "GetOrdersByAccountID")
    /* renamed from: com.robinhood.ceres.v1.GrpcCeres$GetOrdersByAccountID$1 */
    static final class C321411 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C321411(Continuation<? super C321411> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GrpcCeres.this.GetOrdersByAccountID((GetOrdersRequestDto) null, this);
        }
    }

    /* compiled from: GrpcCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.GrpcCeres", m3645f = "GrpcCeres.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_FINAL_ENROLLMENT_SUCCESS_VALUE}, m3647m = "GetPnL")
    /* renamed from: com.robinhood.ceres.v1.GrpcCeres$GetPnL$1 */
    static final class C321421 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C321421(Continuation<? super C321421> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GrpcCeres.this.GetPnL((GetPnLRequestDto) null, this);
        }
    }

    /* compiled from: GrpcCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.GrpcCeres", m3645f = "GrpcCeres.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_BANK_VALUE}, m3647m = "GetPnLCostBasis")
    /* renamed from: com.robinhood.ceres.v1.GrpcCeres$GetPnLCostBasis$1 */
    static final class C321431 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C321431(Continuation<? super C321431> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GrpcCeres.this.GetPnLCostBasis((GetPnLRequestDto) null, this);
        }
    }

    /* compiled from: GrpcCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.GrpcCeres", m3645f = "GrpcCeres.kt", m3646l = {96}, m3647m = "GetPresubmitOrderValidation")
    /* renamed from: com.robinhood.ceres.v1.GrpcCeres$GetPresubmitOrderValidation$1 */
    static final class C321441 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C321441(Continuation<? super C321441> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GrpcCeres.this.GetPresubmitOrderValidation((GetPresubmitOrderValidationRequestDto) null, this);
        }
    }

    /* compiled from: GrpcCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.GrpcCeres", m3645f = "GrpcCeres.kt", m3646l = {350}, m3647m = "GetRealizedPnlForOrders")
    /* renamed from: com.robinhood.ceres.v1.GrpcCeres$GetRealizedPnlForOrders$1 */
    static final class C321451 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C321451(Continuation<? super C321451> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GrpcCeres.this.GetRealizedPnlForOrders((GetRealizedPnlForOrdersRequestDto) null, this);
        }
    }

    /* compiled from: GrpcCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.GrpcCeres", m3645f = "GrpcCeres.kt", m3646l = {405}, m3647m = "GetUserSettings")
    /* renamed from: com.robinhood.ceres.v1.GrpcCeres$GetUserSettings$1 */
    static final class C321461 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C321461(Continuation<? super C321461> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GrpcCeres.this.GetUserSettings((GetUserSettingsRequestDto) null, this);
        }
    }

    /* compiled from: GrpcCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.GrpcCeres", m3645f = "GrpcCeres.kt", m3646l = {388}, m3647m = "ListManualCashCorrections")
    /* renamed from: com.robinhood.ceres.v1.GrpcCeres$ListManualCashCorrections$1 */
    static final class C321471 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C321471(Continuation<? super C321471> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GrpcCeres.this.ListManualCashCorrections((ListManualCashCorrectionsRequestDto) null, this);
        }
    }

    /* compiled from: GrpcCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.GrpcCeres", m3645f = "GrpcCeres.kt", m3646l = {398}, m3647m = "MarkAttestationsSigned")
    /* renamed from: com.robinhood.ceres.v1.GrpcCeres$MarkAttestationsSigned$1 */
    static final class C321481 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C321481(Continuation<? super C321481> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GrpcCeres.this.MarkAttestationsSigned((MarkAttestationsSignedRequestDto) null, this);
        }
    }

    /* compiled from: GrpcCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.GrpcCeres", m3645f = "GrpcCeres.kt", m3646l = {376}, m3647m = "ReplaceFuturesOrder")
    /* renamed from: com.robinhood.ceres.v1.GrpcCeres$ReplaceFuturesOrder$1 */
    static final class C321491 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C321491(Continuation<? super C321491> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GrpcCeres.this.ReplaceFuturesOrder((ReplaceFuturesOrderRequestDto) null, this);
        }
    }

    /* compiled from: GrpcCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.GrpcCeres", m3645f = "GrpcCeres.kt", m3646l = {409}, m3647m = "UpdateUserSettings")
    /* renamed from: com.robinhood.ceres.v1.GrpcCeres$UpdateUserSettings$1 */
    static final class C321501 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C321501(Continuation<? super C321501> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GrpcCeres.this.UpdateUserSettings((UpdateUserSettingsRequestDto) null, this);
        }
    }

    /* compiled from: GrpcCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.GrpcCeres", m3645f = "GrpcCeres.kt", m3646l = {339}, m3647m = "ValidateOrder")
    /* renamed from: com.robinhood.ceres.v1.GrpcCeres$ValidateOrder$1 */
    static final class C321511 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C321511(Continuation<? super C321511> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GrpcCeres.this.ValidateOrder((ValidateOrderRequestDto) null, this);
        }
    }

    public GrpcCeres(CeresClient grpcClient) {
        Intrinsics.checkNotNullParameter(grpcClient, "grpcClient");
        this.grpcClient = grpcClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object CreateFuturesOrder(CreateFuturesOrderRequestDto createFuturesOrderRequestDto, Continuation<? super FuturesOrderDto> continuation) {
        C321201 c321201;
        if (continuation instanceof C321201) {
            c321201 = (C321201) continuation;
            int i = c321201.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c321201.label = i - Integer.MIN_VALUE;
            } else {
                c321201 = new C321201(continuation);
            }
        }
        Object objCreateFuturesOrder = c321201.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c321201.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCreateFuturesOrder);
            Request<CreateFuturesOrderRequestDto> request = new Request<>(createFuturesOrderRequestDto, null, 2, null);
            c321201.label = 1;
            objCreateFuturesOrder = CreateFuturesOrder(request, c321201);
            if (objCreateFuturesOrder == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCreateFuturesOrder);
        }
        return ((Response) objCreateFuturesOrder).getData();
    }

    @Override // com.robinhood.ceres.p284v1.Ceres
    public Object CreateFuturesOrder(Request<CreateFuturesOrderRequestDto> request, Continuation<? super Response<FuturesOrderDto>> continuation) {
        return Response2.handleGrpcCall(request, FuturesOrderDto.INSTANCE, this.grpcClient.CreateFuturesOrder(), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object CreateEventContractOrder(CreateEventContractOrderRequestDto createEventContractOrderRequestDto, Continuation<? super FuturesOrderDto> continuation) {
        C321181 c321181;
        if (continuation instanceof C321181) {
            c321181 = (C321181) continuation;
            int i = c321181.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c321181.label = i - Integer.MIN_VALUE;
            } else {
                c321181 = new C321181(continuation);
            }
        }
        Object objCreateEventContractOrder = c321181.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c321181.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCreateEventContractOrder);
            Request<CreateEventContractOrderRequestDto> request = new Request<>(createEventContractOrderRequestDto, null, 2, null);
            c321181.label = 1;
            objCreateEventContractOrder = CreateEventContractOrder(request, c321181);
            if (objCreateEventContractOrder == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCreateEventContractOrder);
        }
        return ((Response) objCreateEventContractOrder).getData();
    }

    @Override // com.robinhood.ceres.p284v1.Ceres
    public Object CreateEventContractOrder(Request<CreateEventContractOrderRequestDto> request, Continuation<? super Response<FuturesOrderDto>> continuation) {
        return Response2.handleGrpcCall(request, FuturesOrderDto.INSTANCE, this.grpcClient.CreateEventContractOrder(), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object CreateFuturesAccount(CreateFuturesAccountRequestDto createFuturesAccountRequestDto, Continuation<? super CreateFuturesAccountResponseDto> continuation) {
        C321191 c321191;
        if (continuation instanceof C321191) {
            c321191 = (C321191) continuation;
            int i = c321191.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c321191.label = i - Integer.MIN_VALUE;
            } else {
                c321191 = new C321191(continuation);
            }
        }
        Object objCreateFuturesAccount = c321191.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c321191.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCreateFuturesAccount);
            Request<CreateFuturesAccountRequestDto> request = new Request<>(createFuturesAccountRequestDto, null, 2, null);
            c321191.label = 1;
            objCreateFuturesAccount = CreateFuturesAccount(request, c321191);
            if (objCreateFuturesAccount == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCreateFuturesAccount);
        }
        return ((Response) objCreateFuturesAccount).getData();
    }

    @Override // com.robinhood.ceres.p284v1.Ceres
    public Object CreateFuturesAccount(Request<CreateFuturesAccountRequestDto> request, Continuation<? super Response<CreateFuturesAccountResponseDto>> continuation) {
        return Response2.handleGrpcCall(request, CreateFuturesAccountResponseDto.INSTANCE, this.grpcClient.CreateFuturesAccount(), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object CheckAccountFuturesEligibility(CheckAccountFuturesEligibilityRequestDto checkAccountFuturesEligibilityRequestDto, Continuation<? super CheckAccountFuturesEligibilityResponseDto> continuation) {
        C321171 c321171;
        if (continuation instanceof C321171) {
            c321171 = (C321171) continuation;
            int i = c321171.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c321171.label = i - Integer.MIN_VALUE;
            } else {
                c321171 = new C321171(continuation);
            }
        }
        Object objCheckAccountFuturesEligibility = c321171.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c321171.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCheckAccountFuturesEligibility);
            Request<CheckAccountFuturesEligibilityRequestDto> request = new Request<>(checkAccountFuturesEligibilityRequestDto, null, 2, null);
            c321171.label = 1;
            objCheckAccountFuturesEligibility = CheckAccountFuturesEligibility(request, c321171);
            if (objCheckAccountFuturesEligibility == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCheckAccountFuturesEligibility);
        }
        return ((Response) objCheckAccountFuturesEligibility).getData();
    }

    @Override // com.robinhood.ceres.p284v1.Ceres
    public Object CheckAccountFuturesEligibility(Request<CheckAccountFuturesEligibilityRequestDto> request, Continuation<? super Response<CheckAccountFuturesEligibilityResponseDto>> continuation) {
        return Response2.handleGrpcCall(request, CheckAccountFuturesEligibilityResponseDto.INSTANCE, this.grpcClient.CheckAccountFuturesEligibility(), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetCheckpointSuitability(GetCheckpointSuitabilityRequestDto getCheckpointSuitabilityRequestDto, Continuation<? super GetCheckpointSuitabilityResponseDto> continuation) {
        C321291 c321291;
        if (continuation instanceof C321291) {
            c321291 = (C321291) continuation;
            int i = c321291.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c321291.label = i - Integer.MIN_VALUE;
            } else {
                c321291 = new C321291(continuation);
            }
        }
        Object objGetCheckpointSuitability = c321291.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c321291.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetCheckpointSuitability);
            Request<GetCheckpointSuitabilityRequestDto> request = new Request<>(getCheckpointSuitabilityRequestDto, null, 2, null);
            c321291.label = 1;
            objGetCheckpointSuitability = GetCheckpointSuitability(request, c321291);
            if (objGetCheckpointSuitability == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetCheckpointSuitability);
        }
        return ((Response) objGetCheckpointSuitability).getData();
    }

    @Override // com.robinhood.ceres.p284v1.Ceres
    public Object GetCheckpointSuitability(Request<GetCheckpointSuitabilityRequestDto> request, Continuation<? super Response<GetCheckpointSuitabilityResponseDto>> continuation) {
        return Response2.handleGrpcCall(request, GetCheckpointSuitabilityResponseDto.INSTANCE, this.grpcClient.GetCheckpointSuitability(), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object EvaluateCheckpointSuitability(EvaluateCheckpointSuitabilityRequestDto evaluateCheckpointSuitabilityRequestDto, Continuation<? super EvaluateCheckpointSuitabilityResponseDto> continuation) {
        C321221 c321221;
        if (continuation instanceof C321221) {
            c321221 = (C321221) continuation;
            int i = c321221.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c321221.label = i - Integer.MIN_VALUE;
            } else {
                c321221 = new C321221(continuation);
            }
        }
        Object objEvaluateCheckpointSuitability = c321221.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c321221.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objEvaluateCheckpointSuitability);
            Request<EvaluateCheckpointSuitabilityRequestDto> request = new Request<>(evaluateCheckpointSuitabilityRequestDto, null, 2, null);
            c321221.label = 1;
            objEvaluateCheckpointSuitability = EvaluateCheckpointSuitability(request, c321221);
            if (objEvaluateCheckpointSuitability == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objEvaluateCheckpointSuitability);
        }
        return ((Response) objEvaluateCheckpointSuitability).getData();
    }

    @Override // com.robinhood.ceres.p284v1.Ceres
    public Object EvaluateCheckpointSuitability(Request<EvaluateCheckpointSuitabilityRequestDto> request, Continuation<? super Response<EvaluateCheckpointSuitabilityResponseDto>> continuation) {
        return Response2.handleGrpcCall(request, EvaluateCheckpointSuitabilityResponseDto.INSTANCE, this.grpcClient.EvaluateCheckpointSuitability(), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetAgreementType(GetAgreementTypeRequestDto getAgreementTypeRequestDto, Continuation<? super GetAgreementTypeResponseDto> continuation) {
        C321251 c321251;
        if (continuation instanceof C321251) {
            c321251 = (C321251) continuation;
            int i = c321251.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c321251.label = i - Integer.MIN_VALUE;
            } else {
                c321251 = new C321251(continuation);
            }
        }
        Object objGetAgreementType = c321251.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c321251.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetAgreementType);
            Request<GetAgreementTypeRequestDto> request = new Request<>(getAgreementTypeRequestDto, null, 2, null);
            c321251.label = 1;
            objGetAgreementType = GetAgreementType(request, c321251);
            if (objGetAgreementType == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetAgreementType);
        }
        return ((Response) objGetAgreementType).getData();
    }

    @Override // com.robinhood.ceres.p284v1.Ceres
    public Object GetAgreementType(Request<GetAgreementTypeRequestDto> request, Continuation<? super Response<GetAgreementTypeResponseDto>> continuation) {
        return Response2.handleGrpcCall(request, GetAgreementTypeResponseDto.INSTANCE, this.grpcClient.GetAgreementType(), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetPresubmitOrderValidation(GetPresubmitOrderValidationRequestDto getPresubmitOrderValidationRequestDto, Continuation<? super GetPresubmitOrderValidationResponseDto> continuation) {
        C321441 c321441;
        if (continuation instanceof C321441) {
            c321441 = (C321441) continuation;
            int i = c321441.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c321441.label = i - Integer.MIN_VALUE;
            } else {
                c321441 = new C321441(continuation);
            }
        }
        Object objGetPresubmitOrderValidation = c321441.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c321441.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetPresubmitOrderValidation);
            Request<GetPresubmitOrderValidationRequestDto> request = new Request<>(getPresubmitOrderValidationRequestDto, null, 2, null);
            c321441.label = 1;
            objGetPresubmitOrderValidation = GetPresubmitOrderValidation(request, c321441);
            if (objGetPresubmitOrderValidation == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetPresubmitOrderValidation);
        }
        return ((Response) objGetPresubmitOrderValidation).getData();
    }

    @Override // com.robinhood.ceres.p284v1.Ceres
    public Object GetPresubmitOrderValidation(Request<GetPresubmitOrderValidationRequestDto> request, Continuation<? super Response<GetPresubmitOrderValidationResponseDto>> continuation) {
        return Response2.handleGrpcCall(request, GetPresubmitOrderValidationResponseDto.INSTANCE, this.grpcClient.GetPresubmitOrderValidation(), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetOrderByAccountIDAndOrderID(GetOrderByIDRequestDto getOrderByIDRequestDto, Continuation<? super FuturesOrderDto> continuation) {
        C321381 c321381;
        if (continuation instanceof C321381) {
            c321381 = (C321381) continuation;
            int i = c321381.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c321381.label = i - Integer.MIN_VALUE;
            } else {
                c321381 = new C321381(continuation);
            }
        }
        Object objGetOrderByAccountIDAndOrderID = c321381.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c321381.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetOrderByAccountIDAndOrderID);
            Request<GetOrderByIDRequestDto> request = new Request<>(getOrderByIDRequestDto, null, 2, null);
            c321381.label = 1;
            objGetOrderByAccountIDAndOrderID = GetOrderByAccountIDAndOrderID(request, c321381);
            if (objGetOrderByAccountIDAndOrderID == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetOrderByAccountIDAndOrderID);
        }
        return ((Response) objGetOrderByAccountIDAndOrderID).getData();
    }

    @Override // com.robinhood.ceres.p284v1.Ceres
    public Object GetOrderByAccountIDAndOrderID(Request<GetOrderByIDRequestDto> request, Continuation<? super Response<FuturesOrderDto>> continuation) {
        return Response2.handleGrpcCall(request, FuturesOrderDto.INSTANCE, this.grpcClient.GetOrderByAccountIDAndOrderID(), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetOrderByID(GetOrderByIDRequestDto getOrderByIDRequestDto, Continuation<? super FuturesOrderDto> continuation) {
        C321391 c321391;
        if (continuation instanceof C321391) {
            c321391 = (C321391) continuation;
            int i = c321391.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c321391.label = i - Integer.MIN_VALUE;
            } else {
                c321391 = new C321391(continuation);
            }
        }
        Object objGetOrderByID = c321391.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c321391.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetOrderByID);
            Request<GetOrderByIDRequestDto> request = new Request<>(getOrderByIDRequestDto, null, 2, null);
            c321391.label = 1;
            objGetOrderByID = GetOrderByID(request, c321391);
            if (objGetOrderByID == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetOrderByID);
        }
        return ((Response) objGetOrderByID).getData();
    }

    @Override // com.robinhood.ceres.p284v1.Ceres
    public Object GetOrderByID(Request<GetOrderByIDRequestDto> request, Continuation<? super Response<FuturesOrderDto>> continuation) {
        return Response2.handleGrpcCall(request, FuturesOrderDto.INSTANCE, this.grpcClient.GetOrderByID(), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetOrdersByAccountID(GetOrdersRequestDto getOrdersRequestDto, Continuation<? super GetOrdersResponseDto> continuation) {
        C321411 c321411;
        if (continuation instanceof C321411) {
            c321411 = (C321411) continuation;
            int i = c321411.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c321411.label = i - Integer.MIN_VALUE;
            } else {
                c321411 = new C321411(continuation);
            }
        }
        Object objGetOrdersByAccountID = c321411.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c321411.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetOrdersByAccountID);
            Request<GetOrdersRequestDto> request = new Request<>(getOrdersRequestDto, null, 2, null);
            c321411.label = 1;
            objGetOrdersByAccountID = GetOrdersByAccountID(request, c321411);
            if (objGetOrdersByAccountID == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetOrdersByAccountID);
        }
        return ((Response) objGetOrdersByAccountID).getData();
    }

    @Override // com.robinhood.ceres.p284v1.Ceres
    public Object GetOrdersByAccountID(Request<GetOrdersRequestDto> request, Continuation<? super Response<GetOrdersResponseDto>> continuation) {
        return Response2.handleGrpcCall(request, GetOrdersResponseDto.INSTANCE, this.grpcClient.GetOrdersByAccountID(), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetCashSettlementExecutionByID(GetCashSettlementExecutionByIDRequestDto getCashSettlementExecutionByIDRequestDto, Continuation<? super FuturesExecutionDto> continuation) {
        C321271 c321271;
        if (continuation instanceof C321271) {
            c321271 = (C321271) continuation;
            int i = c321271.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c321271.label = i - Integer.MIN_VALUE;
            } else {
                c321271 = new C321271(continuation);
            }
        }
        Object objGetCashSettlementExecutionByID = c321271.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c321271.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetCashSettlementExecutionByID);
            Request<GetCashSettlementExecutionByIDRequestDto> request = new Request<>(getCashSettlementExecutionByIDRequestDto, null, 2, null);
            c321271.label = 1;
            objGetCashSettlementExecutionByID = GetCashSettlementExecutionByID(request, c321271);
            if (objGetCashSettlementExecutionByID == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetCashSettlementExecutionByID);
        }
        return ((Response) objGetCashSettlementExecutionByID).getData();
    }

    @Override // com.robinhood.ceres.p284v1.Ceres
    public Object GetCashSettlementExecutionByID(Request<GetCashSettlementExecutionByIDRequestDto> request, Continuation<? super Response<FuturesExecutionDto>> continuation) {
        return Response2.handleGrpcCall(request, FuturesExecutionDto.INSTANCE, this.grpcClient.GetCashSettlementExecutionByID(), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetCashSettlementExecutions(GetCashSettlementExecutionsRequestDto getCashSettlementExecutionsRequestDto, Continuation<? super GetCashSettlementExecutionsResponseDto> continuation) {
        C321281 c321281;
        if (continuation instanceof C321281) {
            c321281 = (C321281) continuation;
            int i = c321281.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c321281.label = i - Integer.MIN_VALUE;
            } else {
                c321281 = new C321281(continuation);
            }
        }
        Object objGetCashSettlementExecutions = c321281.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c321281.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetCashSettlementExecutions);
            Request<GetCashSettlementExecutionsRequestDto> request = new Request<>(getCashSettlementExecutionsRequestDto, null, 2, null);
            c321281.label = 1;
            objGetCashSettlementExecutions = GetCashSettlementExecutions(request, c321281);
            if (objGetCashSettlementExecutions == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetCashSettlementExecutions);
        }
        return ((Response) objGetCashSettlementExecutions).getData();
    }

    @Override // com.robinhood.ceres.p284v1.Ceres
    public Object GetCashSettlementExecutions(Request<GetCashSettlementExecutionsRequestDto> request, Continuation<? super Response<GetCashSettlementExecutionsResponseDto>> continuation) {
        return Response2.handleGrpcCall(request, GetCashSettlementExecutionsResponseDto.INSTANCE, this.grpcClient.GetCashSettlementExecutions(), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetOrders(GetOrdersRequestDto getOrdersRequestDto, Continuation<? super GetOrdersResponseDto> continuation) {
        C321401 c321401;
        if (continuation instanceof C321401) {
            c321401 = (C321401) continuation;
            int i = c321401.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c321401.label = i - Integer.MIN_VALUE;
            } else {
                c321401 = new C321401(continuation);
            }
        }
        Object objGetOrders = c321401.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c321401.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetOrders);
            Request<GetOrdersRequestDto> request = new Request<>(getOrdersRequestDto, null, 2, null);
            c321401.label = 1;
            objGetOrders = GetOrders(request, c321401);
            if (objGetOrders == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetOrders);
        }
        return ((Response) objGetOrders).getData();
    }

    @Override // com.robinhood.ceres.p284v1.Ceres
    public Object GetOrders(Request<GetOrdersRequestDto> request, Continuation<? super Response<GetOrdersResponseDto>> continuation) {
        return Response2.handleGrpcCall(request, GetOrdersResponseDto.INSTANCE, this.grpcClient.GetOrders(), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object CancelFuturesOrder(CancelFuturesOrderRequestDto cancelFuturesOrderRequestDto, Continuation<? super CancelFuturesOrderResponseDto> continuation) {
        C321161 c321161;
        if (continuation instanceof C321161) {
            c321161 = (C321161) continuation;
            int i = c321161.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c321161.label = i - Integer.MIN_VALUE;
            } else {
                c321161 = new C321161(continuation);
            }
        }
        Object objCancelFuturesOrder = c321161.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c321161.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCancelFuturesOrder);
            Request<CancelFuturesOrderRequestDto> request = new Request<>(cancelFuturesOrderRequestDto, null, 2, null);
            c321161.label = 1;
            objCancelFuturesOrder = CancelFuturesOrder(request, c321161);
            if (objCancelFuturesOrder == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCancelFuturesOrder);
        }
        return ((Response) objCancelFuturesOrder).getData();
    }

    @Override // com.robinhood.ceres.p284v1.Ceres
    public Object CancelFuturesOrder(Request<CancelFuturesOrderRequestDto> request, Continuation<? super Response<CancelFuturesOrderResponseDto>> continuation) {
        return Response2.handleGrpcCall(request, CancelFuturesOrderResponseDto.INSTANCE, this.grpcClient.CancelFuturesOrder(), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object CancelEventContractOrder(CancelEventContractOrderRequestDto cancelEventContractOrderRequestDto, Continuation<? super CancelEventContractOrderResponseDto> continuation) {
        C321151 c321151;
        if (continuation instanceof C321151) {
            c321151 = (C321151) continuation;
            int i = c321151.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c321151.label = i - Integer.MIN_VALUE;
            } else {
                c321151 = new C321151(continuation);
            }
        }
        Object objCancelEventContractOrder = c321151.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c321151.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCancelEventContractOrder);
            Request<CancelEventContractOrderRequestDto> request = new Request<>(cancelEventContractOrderRequestDto, null, 2, null);
            c321151.label = 1;
            objCancelEventContractOrder = CancelEventContractOrder(request, c321151);
            if (objCancelEventContractOrder == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCancelEventContractOrder);
        }
        return ((Response) objCancelEventContractOrder).getData();
    }

    @Override // com.robinhood.ceres.p284v1.Ceres
    public Object CancelEventContractOrder(Request<CancelEventContractOrderRequestDto> request, Continuation<? super Response<CancelEventContractOrderResponseDto>> continuation) {
        return Response2.handleGrpcCall(request, CancelEventContractOrderResponseDto.INSTANCE, this.grpcClient.CancelEventContractOrder(), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetAccounts(GetAccountsRequestDto getAccountsRequestDto, Continuation<? super GetAccountsResponseDto> continuation) {
        C321241 c321241;
        if (continuation instanceof C321241) {
            c321241 = (C321241) continuation;
            int i = c321241.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c321241.label = i - Integer.MIN_VALUE;
            } else {
                c321241 = new C321241(continuation);
            }
        }
        Object objGetAccounts = c321241.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c321241.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetAccounts);
            Request<GetAccountsRequestDto> request = new Request<>(getAccountsRequestDto, null, 2, null);
            c321241.label = 1;
            objGetAccounts = GetAccounts(request, c321241);
            if (objGetAccounts == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetAccounts);
        }
        return ((Response) objGetAccounts).getData();
    }

    @Override // com.robinhood.ceres.p284v1.Ceres
    public Object GetAccounts(Request<GetAccountsRequestDto> request, Continuation<? super Response<GetAccountsResponseDto>> continuation) {
        return Response2.handleGrpcCall(request, GetAccountsResponseDto.INSTANCE, this.grpcClient.GetAccounts(), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetCurrentCashBalance(GetCurrentCashBalanceRequestDto getCurrentCashBalanceRequestDto, Continuation<? super CashBalanceDto> continuation) {
        C321321 c321321;
        if (continuation instanceof C321321) {
            c321321 = (C321321) continuation;
            int i = c321321.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c321321.label = i - Integer.MIN_VALUE;
            } else {
                c321321 = new C321321(continuation);
            }
        }
        Object objGetCurrentCashBalance = c321321.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c321321.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetCurrentCashBalance);
            Request<GetCurrentCashBalanceRequestDto> request = new Request<>(getCurrentCashBalanceRequestDto, null, 2, null);
            c321321.label = 1;
            objGetCurrentCashBalance = GetCurrentCashBalance(request, c321321);
            if (objGetCurrentCashBalance == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetCurrentCashBalance);
        }
        return ((Response) objGetCurrentCashBalance).getData();
    }

    @Override // com.robinhood.ceres.p284v1.Ceres
    public Object GetCurrentCashBalance(Request<GetCurrentCashBalanceRequestDto> request, Continuation<? super Response<CashBalanceDto>> continuation) {
        return Response2.handleGrpcCall(request, CashBalanceDto.INSTANCE, this.grpcClient.GetCurrentCashBalance(), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetCurrentPositions(GetCurrentPositionsRequestDto getCurrentPositionsRequestDto, Continuation<? super GetCurrentPositionsResponseDto> continuation) {
        C321331 c321331;
        if (continuation instanceof C321331) {
            c321331 = (C321331) continuation;
            int i = c321331.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c321331.label = i - Integer.MIN_VALUE;
            } else {
                c321331 = new C321331(continuation);
            }
        }
        Object objGetCurrentPositions = c321331.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c321331.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetCurrentPositions);
            Request<GetCurrentPositionsRequestDto> request = new Request<>(getCurrentPositionsRequestDto, null, 2, null);
            c321331.label = 1;
            objGetCurrentPositions = GetCurrentPositions(request, c321331);
            if (objGetCurrentPositions == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetCurrentPositions);
        }
        return ((Response) objGetCurrentPositions).getData();
    }

    @Override // com.robinhood.ceres.p284v1.Ceres
    public Object GetCurrentPositions(Request<GetCurrentPositionsRequestDto> request, Continuation<? super Response<GetCurrentPositionsResponseDto>> continuation) {
        return Response2.handleGrpcCall(request, GetCurrentPositionsResponseDto.INSTANCE, this.grpcClient.GetCurrentPositions(), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetCurrentPositionsByContractID(GetCurrentPositionsByContractIDRequestDto getCurrentPositionsByContractIDRequestDto, Continuation<? super GetCurrentPositionsByContractIDResponseDto> continuation) {
        C321341 c321341;
        if (continuation instanceof C321341) {
            c321341 = (C321341) continuation;
            int i = c321341.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c321341.label = i - Integer.MIN_VALUE;
            } else {
                c321341 = new C321341(continuation);
            }
        }
        Object objGetCurrentPositionsByContractID = c321341.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c321341.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetCurrentPositionsByContractID);
            Request<GetCurrentPositionsByContractIDRequestDto> request = new Request<>(getCurrentPositionsByContractIDRequestDto, null, 2, null);
            c321341.label = 1;
            objGetCurrentPositionsByContractID = GetCurrentPositionsByContractID(request, c321341);
            if (objGetCurrentPositionsByContractID == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetCurrentPositionsByContractID);
        }
        return ((Response) objGetCurrentPositionsByContractID).getData();
    }

    @Override // com.robinhood.ceres.p284v1.Ceres
    public Object GetCurrentPositionsByContractID(Request<GetCurrentPositionsByContractIDRequestDto> request, Continuation<? super Response<GetCurrentPositionsByContractIDResponseDto>> continuation) {
        return Response2.handleGrpcCall(request, GetCurrentPositionsByContractIDResponseDto.INSTANCE, this.grpcClient.GetCurrentPositionsByContractID(), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetCurrentAggregatedPositions(GetCurrentAggregatedPositionsRequestDto getCurrentAggregatedPositionsRequestDto, Continuation<? super GetCurrentAggregatedPositionsResponseDto> continuation) {
        C321311 c321311;
        if (continuation instanceof C321311) {
            c321311 = (C321311) continuation;
            int i = c321311.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c321311.label = i - Integer.MIN_VALUE;
            } else {
                c321311 = new C321311(continuation);
            }
        }
        Object objGetCurrentAggregatedPositions = c321311.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c321311.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetCurrentAggregatedPositions);
            Request<GetCurrentAggregatedPositionsRequestDto> request = new Request<>(getCurrentAggregatedPositionsRequestDto, null, 2, null);
            c321311.label = 1;
            objGetCurrentAggregatedPositions = GetCurrentAggregatedPositions(request, c321311);
            if (objGetCurrentAggregatedPositions == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetCurrentAggregatedPositions);
        }
        return ((Response) objGetCurrentAggregatedPositions).getData();
    }

    @Override // com.robinhood.ceres.p284v1.Ceres
    public Object GetCurrentAggregatedPositions(Request<GetCurrentAggregatedPositionsRequestDto> request, Continuation<? super Response<GetCurrentAggregatedPositionsResponseDto>> continuation) {
        return Response2.handleGrpcCall(request, GetCurrentAggregatedPositionsResponseDto.INSTANCE, this.grpcClient.GetCurrentAggregatedPositions(), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetContractQuantities(GetContractQuantitiesRequestDto getContractQuantitiesRequestDto, Continuation<? super GetContractQuantitiesResponseDto> continuation) {
        C321301 c321301;
        if (continuation instanceof C321301) {
            c321301 = (C321301) continuation;
            int i = c321301.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c321301.label = i - Integer.MIN_VALUE;
            } else {
                c321301 = new C321301(continuation);
            }
        }
        Object objGetContractQuantities = c321301.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c321301.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetContractQuantities);
            Request<GetContractQuantitiesRequestDto> request = new Request<>(getContractQuantitiesRequestDto, null, 2, null);
            c321301.label = 1;
            objGetContractQuantities = GetContractQuantities(request, c321301);
            if (objGetContractQuantities == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetContractQuantities);
        }
        return ((Response) objGetContractQuantities).getData();
    }

    @Override // com.robinhood.ceres.p284v1.Ceres
    public Object GetContractQuantities(Request<GetContractQuantitiesRequestDto> request, Continuation<? super Response<GetContractQuantitiesResponseDto>> continuation) {
        return Response2.handleGrpcCall(request, GetContractQuantitiesResponseDto.INSTANCE, this.grpcClient.GetContractQuantities(), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object CreatePositionSellout(CreatePositionSelloutRequestDto createPositionSelloutRequestDto, Continuation<? super CreatePositionSelloutResponseDto> continuation) {
        C321211 c321211;
        if (continuation instanceof C321211) {
            c321211 = (C321211) continuation;
            int i = c321211.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c321211.label = i - Integer.MIN_VALUE;
            } else {
                c321211 = new C321211(continuation);
            }
        }
        Object objCreatePositionSellout = c321211.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c321211.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCreatePositionSellout);
            Request<CreatePositionSelloutRequestDto> request = new Request<>(createPositionSelloutRequestDto, null, 2, null);
            c321211.label = 1;
            objCreatePositionSellout = CreatePositionSellout(request, c321211);
            if (objCreatePositionSellout == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCreatePositionSellout);
        }
        return ((Response) objCreatePositionSellout).getData();
    }

    @Override // com.robinhood.ceres.p284v1.Ceres
    public Object CreatePositionSellout(Request<CreatePositionSelloutRequestDto> request, Continuation<? super Response<CreatePositionSelloutResponseDto>> continuation) {
        return Response2.handleGrpcCall(request, CreatePositionSelloutResponseDto.INSTANCE, this.grpcClient.CreatePositionSellout(), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetPnL(GetPnLRequestDto getPnLRequestDto, Continuation<? super PnLDto> continuation) {
        C321421 c321421;
        if (continuation instanceof C321421) {
            c321421 = (C321421) continuation;
            int i = c321421.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c321421.label = i - Integer.MIN_VALUE;
            } else {
                c321421 = new C321421(continuation);
            }
        }
        Object objGetPnL = c321421.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c321421.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetPnL);
            Request<GetPnLRequestDto> request = new Request<>(getPnLRequestDto, null, 2, null);
            c321421.label = 1;
            objGetPnL = GetPnL(request, c321421);
            if (objGetPnL == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetPnL);
        }
        return ((Response) objGetPnL).getData();
    }

    @Override // com.robinhood.ceres.p284v1.Ceres
    public Object GetPnL(Request<GetPnLRequestDto> request, Continuation<? super Response<PnLDto>> continuation) {
        return Response2.handleGrpcCall(request, PnLDto.INSTANCE, this.grpcClient.GetPnL(), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetPnLCostBasis(GetPnLRequestDto getPnLRequestDto, Continuation<? super PnLCostBasisDto> continuation) {
        C321431 c321431;
        if (continuation instanceof C321431) {
            c321431 = (C321431) continuation;
            int i = c321431.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c321431.label = i - Integer.MIN_VALUE;
            } else {
                c321431 = new C321431(continuation);
            }
        }
        Object objGetPnLCostBasis = c321431.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c321431.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetPnLCostBasis);
            Request<GetPnLRequestDto> request = new Request<>(getPnLRequestDto, null, 2, null);
            c321431.label = 1;
            objGetPnLCostBasis = GetPnLCostBasis(request, c321431);
            if (objGetPnLCostBasis == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetPnLCostBasis);
        }
        return ((Response) objGetPnLCostBasis).getData();
    }

    @Override // com.robinhood.ceres.p284v1.Ceres
    public Object GetPnLCostBasis(Request<GetPnLRequestDto> request, Continuation<? super Response<PnLCostBasisDto>> continuation) {
        return Response2.handleGrpcCall(request, PnLCostBasisDto.INSTANCE, this.grpcClient.GetPnLCostBasis(), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetBuyingPowerEffect(GetBuyingPowerEffectRequestDto getBuyingPowerEffectRequestDto, Continuation<? super GetBuyingPowerEffectResponseDto> continuation) {
        C321261 c321261;
        if (continuation instanceof C321261) {
            c321261 = (C321261) continuation;
            int i = c321261.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c321261.label = i - Integer.MIN_VALUE;
            } else {
                c321261 = new C321261(continuation);
            }
        }
        Object objGetBuyingPowerEffect = c321261.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c321261.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetBuyingPowerEffect);
            Request<GetBuyingPowerEffectRequestDto> request = new Request<>(getBuyingPowerEffectRequestDto, null, 2, null);
            c321261.label = 1;
            objGetBuyingPowerEffect = GetBuyingPowerEffect(request, c321261);
            if (objGetBuyingPowerEffect == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetBuyingPowerEffect);
        }
        return ((Response) objGetBuyingPowerEffect).getData();
    }

    @Override // com.robinhood.ceres.p284v1.Ceres
    public Object GetBuyingPowerEffect(Request<GetBuyingPowerEffectRequestDto> request, Continuation<? super Response<GetBuyingPowerEffectResponseDto>> continuation) {
        return Response2.handleGrpcCall(request, GetBuyingPowerEffectResponseDto.INSTANCE, this.grpcClient.GetBuyingPowerEffect(), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetFeesForTentativeOrder(GetFeesForTentativeOrderRequestDto getFeesForTentativeOrderRequestDto, Continuation<? super GetFeesForTentativeOrderResponseDto> continuation) {
        C321361 c321361;
        if (continuation instanceof C321361) {
            c321361 = (C321361) continuation;
            int i = c321361.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c321361.label = i - Integer.MIN_VALUE;
            } else {
                c321361 = new C321361(continuation);
            }
        }
        Object objGetFeesForTentativeOrder = c321361.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c321361.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetFeesForTentativeOrder);
            Request<GetFeesForTentativeOrderRequestDto> request = new Request<>(getFeesForTentativeOrderRequestDto, null, 2, null);
            c321361.label = 1;
            objGetFeesForTentativeOrder = GetFeesForTentativeOrder(request, c321361);
            if (objGetFeesForTentativeOrder == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetFeesForTentativeOrder);
        }
        return ((Response) objGetFeesForTentativeOrder).getData();
    }

    @Override // com.robinhood.ceres.p284v1.Ceres
    public Object GetFeesForTentativeOrder(Request<GetFeesForTentativeOrderRequestDto> request, Continuation<? super Response<GetFeesForTentativeOrderResponseDto>> continuation) {
        return Response2.handleGrpcCall(request, GetFeesForTentativeOrderResponseDto.INSTANCE, this.grpcClient.GetFeesForTentativeOrder(), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object ValidateOrder(ValidateOrderRequestDto validateOrderRequestDto, Continuation<? super ValidateOrderResponseDto> continuation) {
        C321511 c321511;
        if (continuation instanceof C321511) {
            c321511 = (C321511) continuation;
            int i = c321511.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c321511.label = i - Integer.MIN_VALUE;
            } else {
                c321511 = new C321511(continuation);
            }
        }
        Object objValidateOrder = c321511.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c321511.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objValidateOrder);
            Request<ValidateOrderRequestDto> request = new Request<>(validateOrderRequestDto, null, 2, null);
            c321511.label = 1;
            objValidateOrder = ValidateOrder(request, c321511);
            if (objValidateOrder == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objValidateOrder);
        }
        return ((Response) objValidateOrder).getData();
    }

    @Override // com.robinhood.ceres.p284v1.Ceres
    public Object ValidateOrder(Request<ValidateOrderRequestDto> request, Continuation<? super Response<ValidateOrderResponseDto>> continuation) {
        return Response2.handleGrpcCall(request, ValidateOrderResponseDto.INSTANCE, this.grpcClient.ValidateOrder(), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetRealizedPnlForOrders(GetRealizedPnlForOrdersRequestDto getRealizedPnlForOrdersRequestDto, Continuation<? super GetRealizedPnlForOrdersResponseDto> continuation) {
        C321451 c321451;
        if (continuation instanceof C321451) {
            c321451 = (C321451) continuation;
            int i = c321451.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c321451.label = i - Integer.MIN_VALUE;
            } else {
                c321451 = new C321451(continuation);
            }
        }
        Object objGetRealizedPnlForOrders = c321451.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c321451.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetRealizedPnlForOrders);
            Request<GetRealizedPnlForOrdersRequestDto> request = new Request<>(getRealizedPnlForOrdersRequestDto, null, 2, null);
            c321451.label = 1;
            objGetRealizedPnlForOrders = GetRealizedPnlForOrders(request, c321451);
            if (objGetRealizedPnlForOrders == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetRealizedPnlForOrders);
        }
        return ((Response) objGetRealizedPnlForOrders).getData();
    }

    @Override // com.robinhood.ceres.p284v1.Ceres
    public Object GetRealizedPnlForOrders(Request<GetRealizedPnlForOrdersRequestDto> request, Continuation<? super Response<GetRealizedPnlForOrdersResponseDto>> continuation) {
        return Response2.handleGrpcCall(request, GetRealizedPnlForOrdersResponseDto.INSTANCE, this.grpcClient.GetRealizedPnlForOrders(), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetEventContractRealizedPnlByContract(GetEventContractRealizedPnlByContractRequestDto getEventContractRealizedPnlByContractRequestDto, Continuation<? super GetEventContractRealizedPnlByContractResponseDto> continuation) {
        C321351 c321351;
        if (continuation instanceof C321351) {
            c321351 = (C321351) continuation;
            int i = c321351.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c321351.label = i - Integer.MIN_VALUE;
            } else {
                c321351 = new C321351(continuation);
            }
        }
        Object objGetEventContractRealizedPnlByContract = c321351.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c321351.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetEventContractRealizedPnlByContract);
            Request<GetEventContractRealizedPnlByContractRequestDto> request = new Request<>(getEventContractRealizedPnlByContractRequestDto, null, 2, null);
            c321351.label = 1;
            objGetEventContractRealizedPnlByContract = GetEventContractRealizedPnlByContract(request, c321351);
            if (objGetEventContractRealizedPnlByContract == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetEventContractRealizedPnlByContract);
        }
        return ((Response) objGetEventContractRealizedPnlByContract).getData();
    }

    @Override // com.robinhood.ceres.p284v1.Ceres
    public Object GetEventContractRealizedPnlByContract(Request<GetEventContractRealizedPnlByContractRequestDto> request, Continuation<? super Response<GetEventContractRealizedPnlByContractResponseDto>> continuation) {
        return Response2.handleGrpcCall(request, GetEventContractRealizedPnlByContractResponseDto.INSTANCE, this.grpcClient.GetEventContractRealizedPnlByContract(), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object FlattenPositions(FlattenPositionsRequestDto flattenPositionsRequestDto, Continuation<? super FlattenPositionsResponseDto> continuation) {
        C321231 c321231;
        if (continuation instanceof C321231) {
            c321231 = (C321231) continuation;
            int i = c321231.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c321231.label = i - Integer.MIN_VALUE;
            } else {
                c321231 = new C321231(continuation);
            }
        }
        Object objFlattenPositions = c321231.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c321231.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFlattenPositions);
            Request<FlattenPositionsRequestDto> request = new Request<>(flattenPositionsRequestDto, null, 2, null);
            c321231.label = 1;
            objFlattenPositions = FlattenPositions(request, c321231);
            if (objFlattenPositions == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objFlattenPositions);
        }
        return ((Response) objFlattenPositions).getData();
    }

    @Override // com.robinhood.ceres.p284v1.Ceres
    public Object FlattenPositions(Request<FlattenPositionsRequestDto> request, Continuation<? super Response<FlattenPositionsResponseDto>> continuation) {
        return Response2.handleGrpcCall(request, FlattenPositionsResponseDto.INSTANCE, this.grpcClient.FlattenPositions(), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object ReplaceFuturesOrder(ReplaceFuturesOrderRequestDto replaceFuturesOrderRequestDto, Continuation<? super FuturesOrderDto> continuation) {
        C321491 c321491;
        if (continuation instanceof C321491) {
            c321491 = (C321491) continuation;
            int i = c321491.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c321491.label = i - Integer.MIN_VALUE;
            } else {
                c321491 = new C321491(continuation);
            }
        }
        Object objReplaceFuturesOrder = c321491.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c321491.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objReplaceFuturesOrder);
            Request<ReplaceFuturesOrderRequestDto> request = new Request<>(replaceFuturesOrderRequestDto, null, 2, null);
            c321491.label = 1;
            objReplaceFuturesOrder = ReplaceFuturesOrder(request, c321491);
            if (objReplaceFuturesOrder == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objReplaceFuturesOrder);
        }
        return ((Response) objReplaceFuturesOrder).getData();
    }

    @Override // com.robinhood.ceres.p284v1.Ceres
    public Object ReplaceFuturesOrder(Request<ReplaceFuturesOrderRequestDto> request, Continuation<? super Response<FuturesOrderDto>> continuation) {
        return Response2.handleGrpcCall(request, FuturesOrderDto.INSTANCE, this.grpcClient.ReplaceFuturesOrder(), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object ListManualCashCorrections(ListManualCashCorrectionsRequestDto listManualCashCorrectionsRequestDto, Continuation<? super ListManualCashCorrectionsResponseDto> continuation) {
        C321471 c321471;
        if (continuation instanceof C321471) {
            c321471 = (C321471) continuation;
            int i = c321471.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c321471.label = i - Integer.MIN_VALUE;
            } else {
                c321471 = new C321471(continuation);
            }
        }
        Object objListManualCashCorrections = c321471.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c321471.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objListManualCashCorrections);
            Request<ListManualCashCorrectionsRequestDto> request = new Request<>(listManualCashCorrectionsRequestDto, null, 2, null);
            c321471.label = 1;
            objListManualCashCorrections = ListManualCashCorrections(request, c321471);
            if (objListManualCashCorrections == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objListManualCashCorrections);
        }
        return ((Response) objListManualCashCorrections).getData();
    }

    @Override // com.robinhood.ceres.p284v1.Ceres
    public Object ListManualCashCorrections(Request<ListManualCashCorrectionsRequestDto> request, Continuation<? super Response<ListManualCashCorrectionsResponseDto>> continuation) {
        return Response2.handleGrpcCall(request, ListManualCashCorrectionsResponseDto.INSTANCE, this.grpcClient.ListManualCashCorrections(), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object MarkAttestationsSigned(MarkAttestationsSignedRequestDto markAttestationsSignedRequestDto, Continuation<? super MarkAttestationsSignedResponseDto> continuation) {
        C321481 c321481;
        if (continuation instanceof C321481) {
            c321481 = (C321481) continuation;
            int i = c321481.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c321481.label = i - Integer.MIN_VALUE;
            } else {
                c321481 = new C321481(continuation);
            }
        }
        Object objMarkAttestationsSigned = c321481.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c321481.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objMarkAttestationsSigned);
            Request<MarkAttestationsSignedRequestDto> request = new Request<>(markAttestationsSignedRequestDto, null, 2, null);
            c321481.label = 1;
            objMarkAttestationsSigned = MarkAttestationsSigned(request, c321481);
            if (objMarkAttestationsSigned == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objMarkAttestationsSigned);
        }
        return ((Response) objMarkAttestationsSigned).getData();
    }

    @Override // com.robinhood.ceres.p284v1.Ceres
    public Object MarkAttestationsSigned(Request<MarkAttestationsSignedRequestDto> request, Continuation<? super Response<MarkAttestationsSignedResponseDto>> continuation) {
        return Response2.handleGrpcCall(request, MarkAttestationsSignedResponseDto.INSTANCE, this.grpcClient.MarkAttestationsSigned(), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetUserSettings(GetUserSettingsRequestDto getUserSettingsRequestDto, Continuation<? super GetUserSettingsResponseDto> continuation) {
        C321461 c321461;
        if (continuation instanceof C321461) {
            c321461 = (C321461) continuation;
            int i = c321461.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c321461.label = i - Integer.MIN_VALUE;
            } else {
                c321461 = new C321461(continuation);
            }
        }
        Object objGetUserSettings = c321461.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c321461.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetUserSettings);
            Request<GetUserSettingsRequestDto> request = new Request<>(getUserSettingsRequestDto, null, 2, null);
            c321461.label = 1;
            objGetUserSettings = GetUserSettings(request, c321461);
            if (objGetUserSettings == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetUserSettings);
        }
        return ((Response) objGetUserSettings).getData();
    }

    @Override // com.robinhood.ceres.p284v1.Ceres
    public Object GetUserSettings(Request<GetUserSettingsRequestDto> request, Continuation<? super Response<GetUserSettingsResponseDto>> continuation) {
        return Response2.handleGrpcCall(request, GetUserSettingsResponseDto.INSTANCE, this.grpcClient.GetUserSettings(), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object UpdateUserSettings(UpdateUserSettingsRequestDto updateUserSettingsRequestDto, Continuation<? super UpdateUserSettingsResponseDto> continuation) {
        C321501 c321501;
        if (continuation instanceof C321501) {
            c321501 = (C321501) continuation;
            int i = c321501.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c321501.label = i - Integer.MIN_VALUE;
            } else {
                c321501 = new C321501(continuation);
            }
        }
        Object objUpdateUserSettings = c321501.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c321501.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objUpdateUserSettings);
            Request<UpdateUserSettingsRequestDto> request = new Request<>(updateUserSettingsRequestDto, null, 2, null);
            c321501.label = 1;
            objUpdateUserSettings = UpdateUserSettings(request, c321501);
            if (objUpdateUserSettings == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objUpdateUserSettings);
        }
        return ((Response) objUpdateUserSettings).getData();
    }

    @Override // com.robinhood.ceres.p284v1.Ceres
    public Object UpdateUserSettings(Request<UpdateUserSettingsRequestDto> request, Continuation<? super Response<UpdateUserSettingsResponseDto>> continuation) {
        return Response2.handleGrpcCall(request, UpdateUserSettingsResponseDto.INSTANCE, this.grpcClient.UpdateUserSettings(), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetFuturesIntervalPerformance(GetFuturesIntervalPerformanceRequestDto getFuturesIntervalPerformanceRequestDto, Continuation<? super GetFuturesIntervalPerformanceResponseDto> continuation) {
        C321371 c321371;
        if (continuation instanceof C321371) {
            c321371 = (C321371) continuation;
            int i = c321371.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c321371.label = i - Integer.MIN_VALUE;
            } else {
                c321371 = new C321371(continuation);
            }
        }
        Object objGetFuturesIntervalPerformance = c321371.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c321371.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetFuturesIntervalPerformance);
            Request<GetFuturesIntervalPerformanceRequestDto> request = new Request<>(getFuturesIntervalPerformanceRequestDto, null, 2, null);
            c321371.label = 1;
            objGetFuturesIntervalPerformance = GetFuturesIntervalPerformance(request, c321371);
            if (objGetFuturesIntervalPerformance == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetFuturesIntervalPerformance);
        }
        return ((Response) objGetFuturesIntervalPerformance).getData();
    }

    @Override // com.robinhood.ceres.p284v1.Ceres
    public Object GetFuturesIntervalPerformance(Request<GetFuturesIntervalPerformanceRequestDto> request, Continuation<? super Response<GetFuturesIntervalPerformanceResponseDto>> continuation) {
        return Response2.handleGrpcCall(request, GetFuturesIntervalPerformanceResponseDto.INSTANCE, this.grpcClient.GetFuturesIntervalPerformance(), continuation);
    }
}
