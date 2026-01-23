package com.robinhood.ceres.p284v1;

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
import kotlin.jvm.internal.Intrinsics;
import rosetta.mainst.OrderStateDto;
import rosetta.mainst.OrderTriggerDto;
import rosetta.mainst.OrderTypeDto;
import rosetta.mainst.SideDto;

/* compiled from: RestCeres.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000°\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\nJ\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010\u000e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u000fH\u0096@¢\u0006\u0002\u0010\u0010J\"\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u000f0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u0013H\u0096@¢\u0006\u0002\u0010\u0014J\"\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00130\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\u0017H\u0096@¢\u0006\u0002\u0010\u0018J\"\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00170\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\b\u001a\u00020\u001bH\u0096@¢\u0006\u0002\u0010\u001cJ\"\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u001b0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\b\u001a\u00020\u001fH\u0096@¢\u0006\u0002\u0010 J\"\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u001f0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010!\u001a\u00020\"2\u0006\u0010\b\u001a\u00020#H\u0096@¢\u0006\u0002\u0010$J\"\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020#0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010%\u001a\u00020&2\u0006\u0010\b\u001a\u00020'H\u0096@¢\u0006\u0002\u0010(J\"\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020'0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010)\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020*H\u0096@¢\u0006\u0002\u0010+J\"\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020*0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010,\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020*H\u0096@¢\u0006\u0002\u0010+J\"\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020*0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010-\u001a\u00020.2\u0006\u0010\b\u001a\u00020/H\u0096@¢\u0006\u0002\u00100J\"\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020/0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u00101\u001a\u0002022\u0006\u0010\b\u001a\u000203H\u0096@¢\u0006\u0002\u00104J\"\u00101\u001a\b\u0012\u0004\u0012\u0002020\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002030\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u00105\u001a\u0002062\u0006\u0010\b\u001a\u000207H\u0096@¢\u0006\u0002\u00108J\"\u00105\u001a\b\u0012\u0004\u0012\u0002060\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002070\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u00109\u001a\u00020.2\u0006\u0010\b\u001a\u00020/H\u0096@¢\u0006\u0002\u00100J\"\u00109\u001a\b\u0012\u0004\u0012\u00020.0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020/0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010:\u001a\u00020;2\u0006\u0010\b\u001a\u00020<H\u0096@¢\u0006\u0002\u0010=J\"\u0010:\u001a\b\u0012\u0004\u0012\u00020;0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020<0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010>\u001a\u00020?2\u0006\u0010\b\u001a\u00020@H\u0096@¢\u0006\u0002\u0010AJ\"\u0010>\u001a\b\u0012\u0004\u0012\u00020?0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020@0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010B\u001a\u00020C2\u0006\u0010\b\u001a\u00020DH\u0096@¢\u0006\u0002\u0010EJ\"\u0010B\u001a\b\u0012\u0004\u0012\u00020C0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020D0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010F\u001a\u00020G2\u0006\u0010\b\u001a\u00020HH\u0096@¢\u0006\u0002\u0010IJ\"\u0010F\u001a\b\u0012\u0004\u0012\u00020G0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020H0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010J\u001a\u00020K2\u0006\u0010\b\u001a\u00020LH\u0096@¢\u0006\u0002\u0010MJ\"\u0010J\u001a\b\u0012\u0004\u0012\u00020K0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020L0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010N\u001a\u00020O2\u0006\u0010\b\u001a\u00020PH\u0096@¢\u0006\u0002\u0010QJ\"\u0010N\u001a\b\u0012\u0004\u0012\u00020O0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020P0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010R\u001a\u00020S2\u0006\u0010\b\u001a\u00020TH\u0096@¢\u0006\u0002\u0010UJ\"\u0010R\u001a\b\u0012\u0004\u0012\u00020S0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020T0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010V\u001a\u00020W2\u0006\u0010\b\u001a\u00020XH\u0096@¢\u0006\u0002\u0010YJ\"\u0010V\u001a\b\u0012\u0004\u0012\u00020W0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020X0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010Z\u001a\u00020[2\u0006\u0010\b\u001a\u00020\\H\u0096@¢\u0006\u0002\u0010]J\"\u0010Z\u001a\b\u0012\u0004\u0012\u00020[0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\\0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010^\u001a\u00020_2\u0006\u0010\b\u001a\u00020`H\u0096@¢\u0006\u0002\u0010aJ\"\u0010^\u001a\b\u0012\u0004\u0012\u00020_0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020`0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010b\u001a\u00020c2\u0006\u0010\b\u001a\u00020`H\u0096@¢\u0006\u0002\u0010aJ\"\u0010b\u001a\b\u0012\u0004\u0012\u00020c0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020`0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010d\u001a\u00020e2\u0006\u0010\b\u001a\u00020fH\u0096@¢\u0006\u0002\u0010gJ\"\u0010d\u001a\b\u0012\u0004\u0012\u00020e0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020f0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010h\u001a\u00020i2\u0006\u0010\b\u001a\u00020jH\u0096@¢\u0006\u0002\u0010kJ\"\u0010h\u001a\b\u0012\u0004\u0012\u00020i0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020j0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010l\u001a\u00020m2\u0006\u0010\b\u001a\u00020nH\u0096@¢\u0006\u0002\u0010oJ\"\u0010l\u001a\b\u0012\u0004\u0012\u00020m0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020n0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010p\u001a\u00020q2\u0006\u0010\b\u001a\u00020rH\u0096@¢\u0006\u0002\u0010sJ\"\u0010p\u001a\b\u0012\u0004\u0012\u00020q0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020r0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010t\u001a\u00020u2\u0006\u0010\b\u001a\u00020vH\u0096@¢\u0006\u0002\u0010wJ\"\u0010t\u001a\b\u0012\u0004\u0012\u00020u0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020v0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010x\u001a\u00020y2\u0006\u0010\b\u001a\u00020zH\u0096@¢\u0006\u0002\u0010{J\"\u0010x\u001a\b\u0012\u0004\u0012\u00020y0\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020z0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0016\u0010|\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020}H\u0096@¢\u0006\u0002\u0010~J\"\u0010|\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020}0\fH\u0096@¢\u0006\u0002\u0010\rJ\u0019\u0010\u007f\u001a\u00030\u0080\u00012\u0007\u0010\b\u001a\u00030\u0081\u0001H\u0096@¢\u0006\u0003\u0010\u0082\u0001J$\u0010\u007f\u001a\t\u0012\u0005\u0012\u00030\u0080\u00010\u000b2\r\u0010\b\u001a\t\u0012\u0005\u0012\u00030\u0081\u00010\fH\u0096@¢\u0006\u0002\u0010\rJ\u001a\u0010\u0083\u0001\u001a\u00030\u0084\u00012\u0007\u0010\b\u001a\u00030\u0085\u0001H\u0096@¢\u0006\u0003\u0010\u0086\u0001J%\u0010\u0083\u0001\u001a\t\u0012\u0005\u0012\u00030\u0084\u00010\u000b2\r\u0010\b\u001a\t\u0012\u0005\u0012\u00030\u0085\u00010\fH\u0096@¢\u0006\u0002\u0010\rJ\u001a\u0010\u0087\u0001\u001a\u00030\u0088\u00012\u0007\u0010\b\u001a\u00030\u0089\u0001H\u0096@¢\u0006\u0003\u0010\u008a\u0001J%\u0010\u0087\u0001\u001a\t\u0012\u0005\u0012\u00030\u0088\u00010\u000b2\r\u0010\b\u001a\t\u0012\u0005\u0012\u00030\u0089\u00010\fH\u0096@¢\u0006\u0002\u0010\rJ\u001a\u0010\u008b\u0001\u001a\u00030\u008c\u00012\u0007\u0010\b\u001a\u00030\u008d\u0001H\u0096@¢\u0006\u0003\u0010\u008e\u0001J%\u0010\u008b\u0001\u001a\t\u0012\u0005\u0012\u00030\u008c\u00010\u000b2\r\u0010\b\u001a\t\u0012\u0005\u0012\u00030\u008d\u00010\fH\u0096@¢\u0006\u0002\u0010\rJ\u001a\u0010\u008f\u0001\u001a\u00030\u0090\u00012\u0007\u0010\b\u001a\u00030\u0091\u0001H\u0096@¢\u0006\u0003\u0010\u0092\u0001J%\u0010\u008f\u0001\u001a\t\u0012\u0005\u0012\u00030\u0090\u00010\u000b2\r\u0010\b\u001a\t\u0012\u0005\u0012\u00030\u0091\u00010\fH\u0096@¢\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0093\u0001"}, m3636d2 = {"Lcom/robinhood/ceres/v1/RestCeres;", "Lcom/robinhood/ceres/v1/Ceres;", "retrofit", "Lcom/robinhood/ceres/v1/CeresRetrofit;", "<init>", "(Lcom/robinhood/ceres/v1/CeresRetrofit;)V", "CreateFuturesOrder", "Lcom/robinhood/ceres/v1/FuturesOrderDto;", "request", "Lcom/robinhood/ceres/v1/CreateFuturesOrderRequestDto;", "(Lcom/robinhood/ceres/v1/CreateFuturesOrderRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/idl/Response;", "Lcom/robinhood/idl/Request;", "(Lcom/robinhood/idl/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "CreateEventContractOrder", "Lcom/robinhood/ceres/v1/CreateEventContractOrderRequestDto;", "(Lcom/robinhood/ceres/v1/CreateEventContractOrderRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "CreateFuturesAccount", "Lcom/robinhood/ceres/v1/CreateFuturesAccountResponseDto;", "Lcom/robinhood/ceres/v1/CreateFuturesAccountRequestDto;", "(Lcom/robinhood/ceres/v1/CreateFuturesAccountRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "CheckAccountFuturesEligibility", "Lcom/robinhood/ceres/v1/CheckAccountFuturesEligibilityResponseDto;", "Lcom/robinhood/ceres/v1/CheckAccountFuturesEligibilityRequestDto;", "(Lcom/robinhood/ceres/v1/CheckAccountFuturesEligibilityRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetCheckpointSuitability", "Lcom/robinhood/ceres/v1/GetCheckpointSuitabilityResponseDto;", "Lcom/robinhood/ceres/v1/GetCheckpointSuitabilityRequestDto;", "(Lcom/robinhood/ceres/v1/GetCheckpointSuitabilityRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "EvaluateCheckpointSuitability", "Lcom/robinhood/ceres/v1/EvaluateCheckpointSuitabilityResponseDto;", "Lcom/robinhood/ceres/v1/EvaluateCheckpointSuitabilityRequestDto;", "(Lcom/robinhood/ceres/v1/EvaluateCheckpointSuitabilityRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetAgreementType", "Lcom/robinhood/ceres/v1/GetAgreementTypeResponseDto;", "Lcom/robinhood/ceres/v1/GetAgreementTypeRequestDto;", "(Lcom/robinhood/ceres/v1/GetAgreementTypeRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetPresubmitOrderValidation", "Lcom/robinhood/ceres/v1/GetPresubmitOrderValidationResponseDto;", "Lcom/robinhood/ceres/v1/GetPresubmitOrderValidationRequestDto;", "(Lcom/robinhood/ceres/v1/GetPresubmitOrderValidationRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetOrderByAccountIDAndOrderID", "Lcom/robinhood/ceres/v1/GetOrderByIDRequestDto;", "(Lcom/robinhood/ceres/v1/GetOrderByIDRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetOrderByID", "GetOrdersByAccountID", "Lcom/robinhood/ceres/v1/GetOrdersResponseDto;", "Lcom/robinhood/ceres/v1/GetOrdersRequestDto;", "(Lcom/robinhood/ceres/v1/GetOrdersRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetCashSettlementExecutionByID", "Lcom/robinhood/ceres/v1/FuturesExecutionDto;", "Lcom/robinhood/ceres/v1/GetCashSettlementExecutionByIDRequestDto;", "(Lcom/robinhood/ceres/v1/GetCashSettlementExecutionByIDRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetCashSettlementExecutions", "Lcom/robinhood/ceres/v1/GetCashSettlementExecutionsResponseDto;", "Lcom/robinhood/ceres/v1/GetCashSettlementExecutionsRequestDto;", "(Lcom/robinhood/ceres/v1/GetCashSettlementExecutionsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetOrders", "CancelFuturesOrder", "Lcom/robinhood/ceres/v1/CancelFuturesOrderResponseDto;", "Lcom/robinhood/ceres/v1/CancelFuturesOrderRequestDto;", "(Lcom/robinhood/ceres/v1/CancelFuturesOrderRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "CancelEventContractOrder", "Lcom/robinhood/ceres/v1/CancelEventContractOrderResponseDto;", "Lcom/robinhood/ceres/v1/CancelEventContractOrderRequestDto;", "(Lcom/robinhood/ceres/v1/CancelEventContractOrderRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetAccounts", "Lcom/robinhood/ceres/v1/GetAccountsResponseDto;", "Lcom/robinhood/ceres/v1/GetAccountsRequestDto;", "(Lcom/robinhood/ceres/v1/GetAccountsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetCurrentCashBalance", "Lcom/robinhood/ceres/v1/CashBalanceDto;", "Lcom/robinhood/ceres/v1/GetCurrentCashBalanceRequestDto;", "(Lcom/robinhood/ceres/v1/GetCurrentCashBalanceRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetCurrentPositions", "Lcom/robinhood/ceres/v1/GetCurrentPositionsResponseDto;", "Lcom/robinhood/ceres/v1/GetCurrentPositionsRequestDto;", "(Lcom/robinhood/ceres/v1/GetCurrentPositionsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetCurrentPositionsByContractID", "Lcom/robinhood/ceres/v1/GetCurrentPositionsByContractIDResponseDto;", "Lcom/robinhood/ceres/v1/GetCurrentPositionsByContractIDRequestDto;", "(Lcom/robinhood/ceres/v1/GetCurrentPositionsByContractIDRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetCurrentAggregatedPositions", "Lcom/robinhood/ceres/v1/GetCurrentAggregatedPositionsResponseDto;", "Lcom/robinhood/ceres/v1/GetCurrentAggregatedPositionsRequestDto;", "(Lcom/robinhood/ceres/v1/GetCurrentAggregatedPositionsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetContractQuantities", "Lcom/robinhood/ceres/v1/GetContractQuantitiesResponseDto;", "Lcom/robinhood/ceres/v1/GetContractQuantitiesRequestDto;", "(Lcom/robinhood/ceres/v1/GetContractQuantitiesRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "CreatePositionSellout", "Lcom/robinhood/ceres/v1/CreatePositionSelloutResponseDto;", "Lcom/robinhood/ceres/v1/CreatePositionSelloutRequestDto;", "(Lcom/robinhood/ceres/v1/CreatePositionSelloutRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetPnL", "Lcom/robinhood/ceres/v1/PnLDto;", "Lcom/robinhood/ceres/v1/GetPnLRequestDto;", "(Lcom/robinhood/ceres/v1/GetPnLRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetPnLCostBasis", "Lcom/robinhood/ceres/v1/PnLCostBasisDto;", "GetBuyingPowerEffect", "Lcom/robinhood/ceres/v1/GetBuyingPowerEffectResponseDto;", "Lcom/robinhood/ceres/v1/GetBuyingPowerEffectRequestDto;", "(Lcom/robinhood/ceres/v1/GetBuyingPowerEffectRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetFeesForTentativeOrder", "Lcom/robinhood/ceres/v1/GetFeesForTentativeOrderResponseDto;", "Lcom/robinhood/ceres/v1/GetFeesForTentativeOrderRequestDto;", "(Lcom/robinhood/ceres/v1/GetFeesForTentativeOrderRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ValidateOrder", "Lcom/robinhood/ceres/v1/ValidateOrderResponseDto;", "Lcom/robinhood/ceres/v1/ValidateOrderRequestDto;", "(Lcom/robinhood/ceres/v1/ValidateOrderRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetRealizedPnlForOrders", "Lcom/robinhood/ceres/v1/GetRealizedPnlForOrdersResponseDto;", "Lcom/robinhood/ceres/v1/GetRealizedPnlForOrdersRequestDto;", "(Lcom/robinhood/ceres/v1/GetRealizedPnlForOrdersRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetEventContractRealizedPnlByContract", "Lcom/robinhood/ceres/v1/GetEventContractRealizedPnlByContractResponseDto;", "Lcom/robinhood/ceres/v1/GetEventContractRealizedPnlByContractRequestDto;", "(Lcom/robinhood/ceres/v1/GetEventContractRealizedPnlByContractRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "FlattenPositions", "Lcom/robinhood/ceres/v1/FlattenPositionsResponseDto;", "Lcom/robinhood/ceres/v1/FlattenPositionsRequestDto;", "(Lcom/robinhood/ceres/v1/FlattenPositionsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ReplaceFuturesOrder", "Lcom/robinhood/ceres/v1/ReplaceFuturesOrderRequestDto;", "(Lcom/robinhood/ceres/v1/ReplaceFuturesOrderRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ListManualCashCorrections", "Lcom/robinhood/ceres/v1/ListManualCashCorrectionsResponseDto;", "Lcom/robinhood/ceres/v1/ListManualCashCorrectionsRequestDto;", "(Lcom/robinhood/ceres/v1/ListManualCashCorrectionsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "MarkAttestationsSigned", "Lcom/robinhood/ceres/v1/MarkAttestationsSignedResponseDto;", "Lcom/robinhood/ceres/v1/MarkAttestationsSignedRequestDto;", "(Lcom/robinhood/ceres/v1/MarkAttestationsSignedRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetUserSettings", "Lcom/robinhood/ceres/v1/GetUserSettingsResponseDto;", "Lcom/robinhood/ceres/v1/GetUserSettingsRequestDto;", "(Lcom/robinhood/ceres/v1/GetUserSettingsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "UpdateUserSettings", "Lcom/robinhood/ceres/v1/UpdateUserSettingsResponseDto;", "Lcom/robinhood/ceres/v1/UpdateUserSettingsRequestDto;", "(Lcom/robinhood/ceres/v1/UpdateUserSettingsRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetFuturesIntervalPerformance", "Lcom/robinhood/ceres/v1/GetFuturesIntervalPerformanceResponseDto;", "Lcom/robinhood/ceres/v1/GetFuturesIntervalPerformanceRequestDto;", "(Lcom/robinhood/ceres/v1/GetFuturesIntervalPerformanceRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class RestCeres implements Ceres {
    private final CeresRetrofit retrofit;

    /* compiled from: RestCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.RestCeres", m3645f = "RestCeres.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_DATA_VALUE}, m3647m = "CancelEventContractOrder")
    /* renamed from: com.robinhood.ceres.v1.RestCeres$CancelEventContractOrder$1 */
    static final class C321801 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C321801(Continuation<? super C321801> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCeres.this.CancelEventContractOrder((CancelEventContractOrderRequestDto) null, this);
        }
    }

    /* compiled from: RestCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.RestCeres", m3645f = "RestCeres.kt", m3646l = {EnumC7081g.SDK_ASSET_BANK_ICON_CIRCLE_LIGHT_VALUE}, m3647m = "CancelEventContractOrder")
    /* renamed from: com.robinhood.ceres.v1.RestCeres$CancelEventContractOrder$2 */
    static final class C321812 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C321812(Continuation<? super C321812> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCeres.this.CancelEventContractOrder((Request<CancelEventContractOrderRequestDto>) null, this);
        }
    }

    /* compiled from: RestCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.RestCeres", m3645f = "RestCeres.kt", m3646l = {EnumC7081g.SDK_ASSET_BANK_ICON_CIRCLE_VALUE}, m3647m = "CancelFuturesOrder")
    /* renamed from: com.robinhood.ceres.v1.RestCeres$CancelFuturesOrder$1 */
    static final class C321821 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C321821(Continuation<? super C321821> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCeres.this.CancelFuturesOrder((CancelFuturesOrderRequestDto) null, this);
        }
    }

    /* compiled from: RestCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.RestCeres", m3645f = "RestCeres.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_INLINE_LIGHTNING_VALUE}, m3647m = "CancelFuturesOrder")
    /* renamed from: com.robinhood.ceres.v1.RestCeres$CancelFuturesOrder$2 */
    static final class C321832 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C321832(Continuation<? super C321832> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCeres.this.CancelFuturesOrder((Request<CancelFuturesOrderRequestDto>) null, this);
        }
    }

    /* compiled from: RestCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.RestCeres", m3645f = "RestCeres.kt", m3646l = {74}, m3647m = "CheckAccountFuturesEligibility")
    /* renamed from: com.robinhood.ceres.v1.RestCeres$CheckAccountFuturesEligibility$1 */
    static final class C321841 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C321841(Continuation<? super C321841> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCeres.this.CheckAccountFuturesEligibility((CheckAccountFuturesEligibilityRequestDto) null, this);
        }
    }

    /* compiled from: RestCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.RestCeres", m3645f = "RestCeres.kt", m3646l = {80}, m3647m = "CheckAccountFuturesEligibility")
    /* renamed from: com.robinhood.ceres.v1.RestCeres$CheckAccountFuturesEligibility$2 */
    static final class C321852 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C321852(Continuation<? super C321852> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCeres.this.CheckAccountFuturesEligibility((Request<CheckAccountFuturesEligibilityRequestDto>) null, this);
        }
    }

    /* compiled from: RestCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.RestCeres", m3645f = "RestCeres.kt", m3646l = {42}, m3647m = "CreateEventContractOrder")
    /* renamed from: com.robinhood.ceres.v1.RestCeres$CreateEventContractOrder$1 */
    static final class C321861 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C321861(Continuation<? super C321861> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCeres.this.CreateEventContractOrder((CreateEventContractOrderRequestDto) null, this);
        }
    }

    /* compiled from: RestCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.RestCeres", m3645f = "RestCeres.kt", m3646l = {48}, m3647m = "CreateEventContractOrder")
    /* renamed from: com.robinhood.ceres.v1.RestCeres$CreateEventContractOrder$2 */
    static final class C321872 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C321872(Continuation<? super C321872> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCeres.this.CreateEventContractOrder((Request<CreateEventContractOrderRequestDto>) null, this);
        }
    }

    /* compiled from: RestCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.RestCeres", m3645f = "RestCeres.kt", m3646l = {58}, m3647m = "CreateFuturesAccount")
    /* renamed from: com.robinhood.ceres.v1.RestCeres$CreateFuturesAccount$1 */
    static final class C321881 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C321881(Continuation<? super C321881> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCeres.this.CreateFuturesAccount((CreateFuturesAccountRequestDto) null, this);
        }
    }

    /* compiled from: RestCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.RestCeres", m3645f = "RestCeres.kt", m3646l = {64}, m3647m = "CreateFuturesAccount")
    /* renamed from: com.robinhood.ceres.v1.RestCeres$CreateFuturesAccount$2 */
    static final class C321892 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C321892(Continuation<? super C321892> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCeres.this.CreateFuturesAccount((Request<CreateFuturesAccountRequestDto>) null, this);
        }
    }

    /* compiled from: RestCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.RestCeres", m3645f = "RestCeres.kt", m3646l = {23}, m3647m = "CreateFuturesOrder")
    /* renamed from: com.robinhood.ceres.v1.RestCeres$CreateFuturesOrder$1 */
    static final class C321901 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C321901(Continuation<? super C321901> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCeres.this.CreateFuturesOrder((CreateFuturesOrderRequestDto) null, this);
        }
    }

    /* compiled from: RestCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.RestCeres", m3645f = "RestCeres.kt", m3646l = {32}, m3647m = "CreateFuturesOrder")
    /* renamed from: com.robinhood.ceres.v1.RestCeres$CreateFuturesOrder$2 */
    static final class C321912 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C321912(Continuation<? super C321912> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCeres.this.CreateFuturesOrder((Request<CreateFuturesOrderRequestDto>) null, this);
        }
    }

    /* compiled from: RestCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.RestCeres", m3645f = "RestCeres.kt", m3646l = {451}, m3647m = "CreatePositionSellout")
    /* renamed from: com.robinhood.ceres.v1.RestCeres$CreatePositionSellout$1 */
    static final class C321921 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C321921(Continuation<? super C321921> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCeres.this.CreatePositionSellout((CreatePositionSelloutRequestDto) null, this);
        }
    }

    /* compiled from: RestCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.RestCeres", m3645f = "RestCeres.kt", m3646l = {457}, m3647m = "CreatePositionSellout")
    /* renamed from: com.robinhood.ceres.v1.RestCeres$CreatePositionSellout$2 */
    static final class C321932 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C321932(Continuation<? super C321932> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCeres.this.CreatePositionSellout((Request<CreatePositionSelloutRequestDto>) null, this);
        }
    }

    /* compiled from: RestCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.RestCeres", m3645f = "RestCeres.kt", m3646l = {107}, m3647m = "EvaluateCheckpointSuitability")
    /* renamed from: com.robinhood.ceres.v1.RestCeres$EvaluateCheckpointSuitability$1 */
    static final class C321941 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C321941(Continuation<? super C321941> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCeres.this.EvaluateCheckpointSuitability((EvaluateCheckpointSuitabilityRequestDto) null, this);
        }
    }

    /* compiled from: RestCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.RestCeres", m3645f = "RestCeres.kt", m3646l = {113}, m3647m = "EvaluateCheckpointSuitability")
    /* renamed from: com.robinhood.ceres.v1.RestCeres$EvaluateCheckpointSuitability$2 */
    static final class C321952 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C321952(Continuation<? super C321952> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCeres.this.EvaluateCheckpointSuitability((Request<EvaluateCheckpointSuitabilityRequestDto>) null, this);
        }
    }

    /* compiled from: RestCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.RestCeres", m3645f = "RestCeres.kt", m3646l = {625}, m3647m = "FlattenPositions")
    /* renamed from: com.robinhood.ceres.v1.RestCeres$FlattenPositions$1 */
    static final class C321961 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C321961(Continuation<? super C321961> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCeres.this.FlattenPositions((FlattenPositionsRequestDto) null, this);
        }
    }

    /* compiled from: RestCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.RestCeres", m3645f = "RestCeres.kt", m3646l = {628}, m3647m = "FlattenPositions")
    /* renamed from: com.robinhood.ceres.v1.RestCeres$FlattenPositions$2 */
    static final class C321972 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C321972(Continuation<? super C321972> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCeres.this.FlattenPositions((Request<FlattenPositionsRequestDto>) null, this);
        }
    }

    /* compiled from: RestCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.RestCeres", m3645f = "RestCeres.kt", m3646l = {332}, m3647m = "GetAccounts")
    /* renamed from: com.robinhood.ceres.v1.RestCeres$GetAccounts$1 */
    static final class C321981 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C321981(Continuation<? super C321981> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCeres.this.GetAccounts((GetAccountsRequestDto) null, this);
        }
    }

    /* compiled from: RestCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.RestCeres", m3645f = "RestCeres.kt", m3646l = {338}, m3647m = "GetAccounts")
    /* renamed from: com.robinhood.ceres.v1.RestCeres$GetAccounts$2 */
    static final class C321992 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C321992(Continuation<? super C321992> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCeres.this.GetAccounts((Request<GetAccountsRequestDto>) null, this);
        }
    }

    /* compiled from: RestCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.RestCeres", m3645f = "RestCeres.kt", m3646l = {123}, m3647m = "GetAgreementType")
    /* renamed from: com.robinhood.ceres.v1.RestCeres$GetAgreementType$1 */
    static final class C322001 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C322001(Continuation<? super C322001> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCeres.this.GetAgreementType((GetAgreementTypeRequestDto) null, this);
        }
    }

    /* compiled from: RestCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.RestCeres", m3645f = "RestCeres.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_FORM_VALUE}, m3647m = "GetAgreementType")
    /* renamed from: com.robinhood.ceres.v1.RestCeres$GetAgreementType$2 */
    static final class C322012 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C322012(Continuation<? super C322012> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCeres.this.GetAgreementType((Request<GetAgreementTypeRequestDto>) null, this);
        }
    }

    /* compiled from: RestCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.RestCeres", m3645f = "RestCeres.kt", m3646l = {529}, m3647m = "GetBuyingPowerEffect")
    /* renamed from: com.robinhood.ceres.v1.RestCeres$GetBuyingPowerEffect$1 */
    static final class C322021 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C322021(Continuation<? super C322021> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCeres.this.GetBuyingPowerEffect((GetBuyingPowerEffectRequestDto) null, this);
        }
    }

    /* compiled from: RestCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.RestCeres", m3645f = "RestCeres.kt", m3646l = {539}, m3647m = "GetBuyingPowerEffect")
    /* renamed from: com.robinhood.ceres.v1.RestCeres$GetBuyingPowerEffect$2 */
    static final class C322032 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C322032(Continuation<? super C322032> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCeres.this.GetBuyingPowerEffect((Request<GetBuyingPowerEffectRequestDto>) null, this);
        }
    }

    /* compiled from: RestCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.RestCeres", m3645f = "RestCeres.kt", m3646l = {224}, m3647m = "GetCashSettlementExecutionByID")
    /* renamed from: com.robinhood.ceres.v1.RestCeres$GetCashSettlementExecutionByID$1 */
    static final class C322041 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C322041(Continuation<? super C322041> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCeres.this.GetCashSettlementExecutionByID((GetCashSettlementExecutionByIDRequestDto) null, this);
        }
    }

    /* compiled from: RestCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.RestCeres", m3645f = "RestCeres.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE}, m3647m = "GetCashSettlementExecutionByID")
    /* renamed from: com.robinhood.ceres.v1.RestCeres$GetCashSettlementExecutionByID$2 */
    static final class C322052 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C322052(Continuation<? super C322052> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCeres.this.GetCashSettlementExecutionByID((Request<GetCashSettlementExecutionByIDRequestDto>) null, this);
        }
    }

    /* compiled from: RestCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.RestCeres", m3645f = "RestCeres.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE}, m3647m = "GetCashSettlementExecutions")
    /* renamed from: com.robinhood.ceres.v1.RestCeres$GetCashSettlementExecutions$1 */
    static final class C322061 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C322061(Continuation<? super C322061> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCeres.this.GetCashSettlementExecutions((GetCashSettlementExecutionsRequestDto) null, this);
        }
    }

    /* compiled from: RestCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.RestCeres", m3645f = "RestCeres.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE}, m3647m = "GetCashSettlementExecutions")
    /* renamed from: com.robinhood.ceres.v1.RestCeres$GetCashSettlementExecutions$2 */
    static final class C322072 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C322072(Continuation<? super C322072> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCeres.this.GetCashSettlementExecutions((Request<GetCashSettlementExecutionsRequestDto>) null, this);
        }
    }

    /* compiled from: RestCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.RestCeres", m3645f = "RestCeres.kt", m3646l = {90}, m3647m = "GetCheckpointSuitability")
    /* renamed from: com.robinhood.ceres.v1.RestCeres$GetCheckpointSuitability$1 */
    static final class C322081 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C322081(Continuation<? super C322081> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCeres.this.GetCheckpointSuitability((GetCheckpointSuitabilityRequestDto) null, this);
        }
    }

    /* compiled from: RestCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.RestCeres", m3645f = "RestCeres.kt", m3646l = {96}, m3647m = "GetCheckpointSuitability")
    /* renamed from: com.robinhood.ceres.v1.RestCeres$GetCheckpointSuitability$2 */
    static final class C322092 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C322092(Continuation<? super C322092> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCeres.this.GetCheckpointSuitability((Request<GetCheckpointSuitabilityRequestDto>) null, this);
        }
    }

    /* compiled from: RestCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.RestCeres", m3645f = "RestCeres.kt", m3646l = {432}, m3647m = "GetContractQuantities")
    /* renamed from: com.robinhood.ceres.v1.RestCeres$GetContractQuantities$1 */
    static final class C322101 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C322101(Continuation<? super C322101> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCeres.this.GetContractQuantities((GetContractQuantitiesRequestDto) null, this);
        }
    }

    /* compiled from: RestCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.RestCeres", m3645f = "RestCeres.kt", m3646l = {438}, m3647m = "GetContractQuantities")
    /* renamed from: com.robinhood.ceres.v1.RestCeres$GetContractQuantities$2 */
    static final class C322112 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C322112(Continuation<? super C322112> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCeres.this.GetContractQuantities((Request<GetContractQuantitiesRequestDto>) null, this);
        }
    }

    /* compiled from: RestCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.RestCeres", m3645f = "RestCeres.kt", m3646l = {406}, m3647m = "GetCurrentAggregatedPositions")
    /* renamed from: com.robinhood.ceres.v1.RestCeres$GetCurrentAggregatedPositions$1 */
    static final class C322121 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C322121(Continuation<? super C322121> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCeres.this.GetCurrentAggregatedPositions((GetCurrentAggregatedPositionsRequestDto) null, this);
        }
    }

    /* compiled from: RestCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.RestCeres", m3645f = "RestCeres.kt", m3646l = {412}, m3647m = "GetCurrentAggregatedPositions")
    /* renamed from: com.robinhood.ceres.v1.RestCeres$GetCurrentAggregatedPositions$2 */
    static final class C322132 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C322132(Continuation<? super C322132> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCeres.this.GetCurrentAggregatedPositions((Request<GetCurrentAggregatedPositionsRequestDto>) null, this);
        }
    }

    /* compiled from: RestCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.RestCeres", m3645f = "RestCeres.kt", m3646l = {352}, m3647m = "GetCurrentCashBalance")
    /* renamed from: com.robinhood.ceres.v1.RestCeres$GetCurrentCashBalance$1 */
    static final class C322141 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C322141(Continuation<? super C322141> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCeres.this.GetCurrentCashBalance((GetCurrentCashBalanceRequestDto) null, this);
        }
    }

    /* compiled from: RestCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.RestCeres", m3645f = "RestCeres.kt", m3646l = {358}, m3647m = "GetCurrentCashBalance")
    /* renamed from: com.robinhood.ceres.v1.RestCeres$GetCurrentCashBalance$2 */
    static final class C322152 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C322152(Continuation<? super C322152> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCeres.this.GetCurrentCashBalance((Request<GetCurrentCashBalanceRequestDto>) null, this);
        }
    }

    /* compiled from: RestCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.RestCeres", m3645f = "RestCeres.kt", m3646l = {368}, m3647m = "GetCurrentPositions")
    /* renamed from: com.robinhood.ceres.v1.RestCeres$GetCurrentPositions$1 */
    static final class C322161 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C322161(Continuation<? super C322161> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCeres.this.GetCurrentPositions((GetCurrentPositionsRequestDto) null, this);
        }
    }

    /* compiled from: RestCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.RestCeres", m3645f = "RestCeres.kt", m3646l = {374}, m3647m = "GetCurrentPositions")
    /* renamed from: com.robinhood.ceres.v1.RestCeres$GetCurrentPositions$2 */
    static final class C322172 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C322172(Continuation<? super C322172> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCeres.this.GetCurrentPositions((Request<GetCurrentPositionsRequestDto>) null, this);
        }
    }

    /* compiled from: RestCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.RestCeres", m3645f = "RestCeres.kt", m3646l = {387}, m3647m = "GetCurrentPositionsByContractID")
    /* renamed from: com.robinhood.ceres.v1.RestCeres$GetCurrentPositionsByContractID$1 */
    static final class C322181 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C322181(Continuation<? super C322181> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCeres.this.GetCurrentPositionsByContractID((GetCurrentPositionsByContractIDRequestDto) null, this);
        }
    }

    /* compiled from: RestCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.RestCeres", m3645f = "RestCeres.kt", m3646l = {393}, m3647m = "GetCurrentPositionsByContractID")
    /* renamed from: com.robinhood.ceres.v1.RestCeres$GetCurrentPositionsByContractID$2 */
    static final class C322192 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C322192(Continuation<? super C322192> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCeres.this.GetCurrentPositionsByContractID((Request<GetCurrentPositionsByContractIDRequestDto>) null, this);
        }
    }

    /* compiled from: RestCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.RestCeres", m3645f = "RestCeres.kt", m3646l = {612}, m3647m = "GetEventContractRealizedPnlByContract")
    /* renamed from: com.robinhood.ceres.v1.RestCeres$GetEventContractRealizedPnlByContract$1 */
    static final class C322201 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C322201(Continuation<? super C322201> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCeres.this.GetEventContractRealizedPnlByContract((GetEventContractRealizedPnlByContractRequestDto) null, this);
        }
    }

    /* compiled from: RestCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.RestCeres", m3645f = "RestCeres.kt", m3646l = {618}, m3647m = "GetEventContractRealizedPnlByContract")
    /* renamed from: com.robinhood.ceres.v1.RestCeres$GetEventContractRealizedPnlByContract$2 */
    static final class C322212 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C322212(Continuation<? super C322212> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCeres.this.GetEventContractRealizedPnlByContract((Request<GetEventContractRealizedPnlByContractRequestDto>) null, this);
        }
    }

    /* compiled from: RestCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.RestCeres", m3645f = "RestCeres.kt", m3646l = {554}, m3647m = "GetFeesForTentativeOrder")
    /* renamed from: com.robinhood.ceres.v1.RestCeres$GetFeesForTentativeOrder$1 */
    static final class C322221 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C322221(Continuation<? super C322221> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCeres.this.GetFeesForTentativeOrder((GetFeesForTentativeOrderRequestDto) null, this);
        }
    }

    /* compiled from: RestCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.RestCeres", m3645f = "RestCeres.kt", m3646l = {565}, m3647m = "GetFeesForTentativeOrder")
    /* renamed from: com.robinhood.ceres.v1.RestCeres$GetFeesForTentativeOrder$2 */
    static final class C322232 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C322232(Continuation<? super C322232> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCeres.this.GetFeesForTentativeOrder((Request<GetFeesForTentativeOrderRequestDto>) null, this);
        }
    }

    /* compiled from: RestCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.RestCeres", m3645f = "RestCeres.kt", m3646l = {708}, m3647m = "GetFuturesIntervalPerformance")
    /* renamed from: com.robinhood.ceres.v1.RestCeres$GetFuturesIntervalPerformance$1 */
    static final class C322241 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C322241(Continuation<? super C322241> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCeres.this.GetFuturesIntervalPerformance((GetFuturesIntervalPerformanceRequestDto) null, this);
        }
    }

    /* compiled from: RestCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.RestCeres", m3645f = "RestCeres.kt", m3646l = {711}, m3647m = "GetFuturesIntervalPerformance")
    /* renamed from: com.robinhood.ceres.v1.RestCeres$GetFuturesIntervalPerformance$2 */
    static final class C322252 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C322252(Continuation<? super C322252> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCeres.this.GetFuturesIntervalPerformance((Request<GetFuturesIntervalPerformanceRequestDto>) null, this);
        }
    }

    /* compiled from: RestCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.RestCeres", m3645f = "RestCeres.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_UPLOAD_VALUE}, m3647m = "GetOrderByAccountIDAndOrderID")
    /* renamed from: com.robinhood.ceres.v1.RestCeres$GetOrderByAccountIDAndOrderID$1 */
    static final class C322261 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C322261(Continuation<? super C322261> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCeres.this.GetOrderByAccountIDAndOrderID((GetOrderByIDRequestDto) null, this);
        }
    }

    /* compiled from: RestCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.RestCeres", m3645f = "RestCeres.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE}, m3647m = "GetOrderByAccountIDAndOrderID")
    /* renamed from: com.robinhood.ceres.v1.RestCeres$GetOrderByAccountIDAndOrderID$2 */
    static final class C322272 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C322272(Continuation<? super C322272> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCeres.this.GetOrderByAccountIDAndOrderID((Request<GetOrderByIDRequestDto>) null, this);
        }
    }

    /* compiled from: RestCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.RestCeres", m3645f = "RestCeres.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_VALUE}, m3647m = "GetOrderByID")
    /* renamed from: com.robinhood.ceres.v1.RestCeres$GetOrderByID$1 */
    static final class C322281 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C322281(Continuation<? super C322281> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCeres.this.GetOrderByID((GetOrderByIDRequestDto) null, this);
        }
    }

    /* compiled from: RestCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.RestCeres", m3645f = "RestCeres.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE}, m3647m = "GetOrderByID")
    /* renamed from: com.robinhood.ceres.v1.RestCeres$GetOrderByID$2 */
    static final class C322292 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C322292(Continuation<? super C322292> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCeres.this.GetOrderByID((Request<GetOrderByIDRequestDto>) null, this);
        }
    }

    /* compiled from: RestCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.RestCeres", m3645f = "RestCeres.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE}, m3647m = "GetOrders")
    /* renamed from: com.robinhood.ceres.v1.RestCeres$GetOrders$1 */
    static final class C322301 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C322301(Continuation<? super C322301> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCeres.this.GetOrders((GetOrdersRequestDto) null, this);
        }
    }

    /* compiled from: RestCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.RestCeres", m3645f = "RestCeres.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE}, m3647m = "GetOrders")
    /* renamed from: com.robinhood.ceres.v1.RestCeres$GetOrders$2 */
    static final class C322312 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C322312(Continuation<? super C322312> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCeres.this.GetOrders((Request<GetOrdersRequestDto>) null, this);
        }
    }

    /* compiled from: RestCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.RestCeres", m3645f = "RestCeres.kt", m3646l = {188}, m3647m = "GetOrdersByAccountID")
    /* renamed from: com.robinhood.ceres.v1.RestCeres$GetOrdersByAccountID$1 */
    static final class C322321 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C322321(Continuation<? super C322321> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCeres.this.GetOrdersByAccountID((GetOrdersRequestDto) null, this);
        }
    }

    /* compiled from: RestCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.RestCeres", m3645f = "RestCeres.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_EXTERNAL_VALUE}, m3647m = "GetOrdersByAccountID")
    /* renamed from: com.robinhood.ceres.v1.RestCeres$GetOrdersByAccountID$2 */
    static final class C322332 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C322332(Continuation<? super C322332> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCeres.this.GetOrdersByAccountID((Request<GetOrdersRequestDto>) null, this);
        }
    }

    /* compiled from: RestCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.RestCeres", m3645f = "RestCeres.kt", m3646l = {470}, m3647m = "GetPnL")
    /* renamed from: com.robinhood.ceres.v1.RestCeres$GetPnL$1 */
    static final class C322341 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C322341(Continuation<? super C322341> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCeres.this.GetPnL((GetPnLRequestDto) null, this);
        }
    }

    /* compiled from: RestCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.RestCeres", m3645f = "RestCeres.kt", m3646l = {479}, m3647m = "GetPnL")
    /* renamed from: com.robinhood.ceres.v1.RestCeres$GetPnL$2 */
    static final class C322352 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C322352(Continuation<? super C322352> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCeres.this.GetPnL((Request<GetPnLRequestDto>) null, this);
        }
    }

    /* compiled from: RestCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.RestCeres", m3645f = "RestCeres.kt", m3646l = {499}, m3647m = "GetPnLCostBasis")
    /* renamed from: com.robinhood.ceres.v1.RestCeres$GetPnLCostBasis$1 */
    static final class C322361 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C322361(Continuation<? super C322361> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCeres.this.GetPnLCostBasis((GetPnLRequestDto) null, this);
        }
    }

    /* compiled from: RestCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.RestCeres", m3645f = "RestCeres.kt", m3646l = {514}, m3647m = "GetPnLCostBasis")
    /* renamed from: com.robinhood.ceres.v1.RestCeres$GetPnLCostBasis$2 */
    static final class C322372 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C322372(Continuation<? super C322372> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCeres.this.GetPnLCostBasis((Request<GetPnLRequestDto>) null, this);
        }
    }

    /* compiled from: RestCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.RestCeres", m3645f = "RestCeres.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE}, m3647m = "GetPresubmitOrderValidation")
    /* renamed from: com.robinhood.ceres.v1.RestCeres$GetPresubmitOrderValidation$1 */
    static final class C322381 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C322381(Continuation<? super C322381> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCeres.this.GetPresubmitOrderValidation((GetPresubmitOrderValidationRequestDto) null, this);
        }
    }

    /* compiled from: RestCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.RestCeres", m3645f = "RestCeres.kt", m3646l = {144}, m3647m = "GetPresubmitOrderValidation")
    /* renamed from: com.robinhood.ceres.v1.RestCeres$GetPresubmitOrderValidation$2 */
    static final class C322392 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C322392(Continuation<? super C322392> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCeres.this.GetPresubmitOrderValidation((Request<GetPresubmitOrderValidationRequestDto>) null, this);
        }
    }

    /* compiled from: RestCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.RestCeres", m3645f = "RestCeres.kt", m3646l = {594}, m3647m = "GetRealizedPnlForOrders")
    /* renamed from: com.robinhood.ceres.v1.RestCeres$GetRealizedPnlForOrders$1 */
    static final class C322401 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C322401(Continuation<? super C322401> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCeres.this.GetRealizedPnlForOrders((GetRealizedPnlForOrdersRequestDto) null, this);
        }
    }

    /* compiled from: RestCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.RestCeres", m3645f = "RestCeres.kt", m3646l = {600}, m3647m = "GetRealizedPnlForOrders")
    /* renamed from: com.robinhood.ceres.v1.RestCeres$GetRealizedPnlForOrders$2 */
    static final class C322412 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C322412(Continuation<? super C322412> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCeres.this.GetRealizedPnlForOrders((Request<GetRealizedPnlForOrdersRequestDto>) null, this);
        }
    }

    /* compiled from: RestCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.RestCeres", m3645f = "RestCeres.kt", m3646l = {689}, m3647m = "GetUserSettings")
    /* renamed from: com.robinhood.ceres.v1.RestCeres$GetUserSettings$1 */
    static final class C322421 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C322421(Continuation<? super C322421> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCeres.this.GetUserSettings((GetUserSettingsRequestDto) null, this);
        }
    }

    /* compiled from: RestCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.RestCeres", m3645f = "RestCeres.kt", m3646l = {692}, m3647m = "GetUserSettings")
    /* renamed from: com.robinhood.ceres.v1.RestCeres$GetUserSettings$2 */
    static final class C322432 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C322432(Continuation<? super C322432> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCeres.this.GetUserSettings((Request<GetUserSettingsRequestDto>) null, this);
        }
    }

    /* compiled from: RestCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.RestCeres", m3645f = "RestCeres.kt", m3646l = {660}, m3647m = "ListManualCashCorrections")
    /* renamed from: com.robinhood.ceres.v1.RestCeres$ListManualCashCorrections$1 */
    static final class C322441 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C322441(Continuation<? super C322441> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCeres.this.ListManualCashCorrections((ListManualCashCorrectionsRequestDto) null, this);
        }
    }

    /* compiled from: RestCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.RestCeres", m3645f = "RestCeres.kt", m3646l = {666}, m3647m = "ListManualCashCorrections")
    /* renamed from: com.robinhood.ceres.v1.RestCeres$ListManualCashCorrections$2 */
    static final class C322452 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C322452(Continuation<? super C322452> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCeres.this.ListManualCashCorrections((Request<ListManualCashCorrectionsRequestDto>) null, this);
        }
    }

    /* compiled from: RestCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.RestCeres", m3645f = "RestCeres.kt", m3646l = {676}, m3647m = "MarkAttestationsSigned")
    /* renamed from: com.robinhood.ceres.v1.RestCeres$MarkAttestationsSigned$1 */
    static final class C322461 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C322461(Continuation<? super C322461> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCeres.this.MarkAttestationsSigned((MarkAttestationsSignedRequestDto) null, this);
        }
    }

    /* compiled from: RestCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.RestCeres", m3645f = "RestCeres.kt", m3646l = {682}, m3647m = "MarkAttestationsSigned")
    /* renamed from: com.robinhood.ceres.v1.RestCeres$MarkAttestationsSigned$2 */
    static final class C322472 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C322472(Continuation<? super C322472> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCeres.this.MarkAttestationsSigned((Request<MarkAttestationsSignedRequestDto>) null, this);
        }
    }

    /* compiled from: RestCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.RestCeres", m3645f = "RestCeres.kt", m3646l = {641}, m3647m = "ReplaceFuturesOrder")
    /* renamed from: com.robinhood.ceres.v1.RestCeres$ReplaceFuturesOrder$1 */
    static final class C322481 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C322481(Continuation<? super C322481> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCeres.this.ReplaceFuturesOrder((ReplaceFuturesOrderRequestDto) null, this);
        }
    }

    /* compiled from: RestCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.RestCeres", m3645f = "RestCeres.kt", m3646l = {649}, m3647m = "ReplaceFuturesOrder")
    /* renamed from: com.robinhood.ceres.v1.RestCeres$ReplaceFuturesOrder$2 */
    static final class C322492 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C322492(Continuation<? super C322492> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCeres.this.ReplaceFuturesOrder((Request<ReplaceFuturesOrderRequestDto>) null, this);
        }
    }

    /* compiled from: RestCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.RestCeres", m3645f = "RestCeres.kt", m3646l = {698}, m3647m = "UpdateUserSettings")
    /* renamed from: com.robinhood.ceres.v1.RestCeres$UpdateUserSettings$1 */
    static final class C322501 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C322501(Continuation<? super C322501> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCeres.this.UpdateUserSettings((UpdateUserSettingsRequestDto) null, this);
        }
    }

    /* compiled from: RestCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.RestCeres", m3645f = "RestCeres.kt", m3646l = {701}, m3647m = "UpdateUserSettings")
    /* renamed from: com.robinhood.ceres.v1.RestCeres$UpdateUserSettings$2 */
    static final class C322512 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C322512(Continuation<? super C322512> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCeres.this.UpdateUserSettings((Request<UpdateUserSettingsRequestDto>) null, this);
        }
    }

    /* compiled from: RestCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.RestCeres", m3645f = "RestCeres.kt", m3646l = {576}, m3647m = "ValidateOrder")
    /* renamed from: com.robinhood.ceres.v1.RestCeres$ValidateOrder$1 */
    static final class C322521 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C322521(Continuation<? super C322521> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCeres.this.ValidateOrder((ValidateOrderRequestDto) null, this);
        }
    }

    /* compiled from: RestCeres.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.ceres.v1.RestCeres", m3645f = "RestCeres.kt", m3646l = {583}, m3647m = "ValidateOrder")
    /* renamed from: com.robinhood.ceres.v1.RestCeres$ValidateOrder$2 */
    static final class C322532 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C322532(Continuation<? super C322532> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RestCeres.this.ValidateOrder((Request<ValidateOrderRequestDto>) null, this);
        }
    }

    public RestCeres(CeresRetrofit retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        this.retrofit = retrofit;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object CreateFuturesOrder(CreateFuturesOrderRequestDto createFuturesOrderRequestDto, Continuation<? super FuturesOrderDto> continuation) {
        C321901 c321901;
        if (continuation instanceof C321901) {
            c321901 = (C321901) continuation;
            int i = c321901.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c321901.label = i - Integer.MIN_VALUE;
            } else {
                c321901 = new C321901(continuation);
            }
        }
        Object objCreateFuturesOrder = c321901.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c321901.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCreateFuturesOrder);
            Request<CreateFuturesOrderRequestDto> request = new Request<>(createFuturesOrderRequestDto, null, 2, null);
            c321901.label = 1;
            objCreateFuturesOrder = CreateFuturesOrder(request, c321901);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object CreateFuturesOrder(Request<CreateFuturesOrderRequestDto> request, Continuation<? super Response<FuturesOrderDto>> continuation) {
        C321912 c321912;
        if (continuation instanceof C321912) {
            c321912 = (C321912) continuation;
            int i = c321912.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c321912.label = i - Integer.MIN_VALUE;
            } else {
                c321912 = new C321912(continuation);
            }
        }
        Object objCreateFuturesOrder = c321912.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c321912.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCreateFuturesOrder);
            CeresRetrofit ceresRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            CreateFuturesOrderRequestDto data = request.getData();
            c321912.label = 1;
            objCreateFuturesOrder = ceresRetrofit.CreateFuturesOrder(metadata, data, c321912);
            if (objCreateFuturesOrder == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCreateFuturesOrder);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objCreateFuturesOrder);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object CreateEventContractOrder(CreateEventContractOrderRequestDto createEventContractOrderRequestDto, Continuation<? super FuturesOrderDto> continuation) {
        C321861 c321861;
        if (continuation instanceof C321861) {
            c321861 = (C321861) continuation;
            int i = c321861.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c321861.label = i - Integer.MIN_VALUE;
            } else {
                c321861 = new C321861(continuation);
            }
        }
        Object objCreateEventContractOrder = c321861.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c321861.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCreateEventContractOrder);
            Request<CreateEventContractOrderRequestDto> request = new Request<>(createEventContractOrderRequestDto, null, 2, null);
            c321861.label = 1;
            objCreateEventContractOrder = CreateEventContractOrder(request, c321861);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object CreateEventContractOrder(Request<CreateEventContractOrderRequestDto> request, Continuation<? super Response<FuturesOrderDto>> continuation) {
        C321872 c321872;
        if (continuation instanceof C321872) {
            c321872 = (C321872) continuation;
            int i = c321872.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c321872.label = i - Integer.MIN_VALUE;
            } else {
                c321872 = new C321872(continuation);
            }
        }
        Object objCreateEventContractOrder = c321872.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c321872.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCreateEventContractOrder);
            CeresRetrofit ceresRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            CreateEventContractOrderRequestDto data = request.getData();
            c321872.label = 1;
            objCreateEventContractOrder = ceresRetrofit.CreateEventContractOrder(metadata, data, c321872);
            if (objCreateEventContractOrder == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCreateEventContractOrder);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objCreateEventContractOrder);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object CreateFuturesAccount(CreateFuturesAccountRequestDto createFuturesAccountRequestDto, Continuation<? super CreateFuturesAccountResponseDto> continuation) {
        C321881 c321881;
        if (continuation instanceof C321881) {
            c321881 = (C321881) continuation;
            int i = c321881.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c321881.label = i - Integer.MIN_VALUE;
            } else {
                c321881 = new C321881(continuation);
            }
        }
        Object objCreateFuturesAccount = c321881.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c321881.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCreateFuturesAccount);
            Request<CreateFuturesAccountRequestDto> request = new Request<>(createFuturesAccountRequestDto, null, 2, null);
            c321881.label = 1;
            objCreateFuturesAccount = CreateFuturesAccount(request, c321881);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object CreateFuturesAccount(Request<CreateFuturesAccountRequestDto> request, Continuation<? super Response<CreateFuturesAccountResponseDto>> continuation) {
        C321892 c321892;
        if (continuation instanceof C321892) {
            c321892 = (C321892) continuation;
            int i = c321892.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c321892.label = i - Integer.MIN_VALUE;
            } else {
                c321892 = new C321892(continuation);
            }
        }
        Object objCreateFuturesAccount = c321892.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c321892.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCreateFuturesAccount);
            CeresRetrofit ceresRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            CreateFuturesAccountRequestDto data = request.getData();
            c321892.label = 1;
            objCreateFuturesAccount = ceresRetrofit.CreateFuturesAccount(metadata, data, c321892);
            if (objCreateFuturesAccount == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCreateFuturesAccount);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objCreateFuturesAccount);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object CheckAccountFuturesEligibility(CheckAccountFuturesEligibilityRequestDto checkAccountFuturesEligibilityRequestDto, Continuation<? super CheckAccountFuturesEligibilityResponseDto> continuation) {
        C321841 c321841;
        if (continuation instanceof C321841) {
            c321841 = (C321841) continuation;
            int i = c321841.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c321841.label = i - Integer.MIN_VALUE;
            } else {
                c321841 = new C321841(continuation);
            }
        }
        Object objCheckAccountFuturesEligibility = c321841.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c321841.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCheckAccountFuturesEligibility);
            Request<CheckAccountFuturesEligibilityRequestDto> request = new Request<>(checkAccountFuturesEligibilityRequestDto, null, 2, null);
            c321841.label = 1;
            objCheckAccountFuturesEligibility = CheckAccountFuturesEligibility(request, c321841);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object CheckAccountFuturesEligibility(Request<CheckAccountFuturesEligibilityRequestDto> request, Continuation<? super Response<CheckAccountFuturesEligibilityResponseDto>> continuation) {
        C321852 c321852;
        if (continuation instanceof C321852) {
            c321852 = (C321852) continuation;
            int i = c321852.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c321852.label = i - Integer.MIN_VALUE;
            } else {
                c321852 = new C321852(continuation);
            }
        }
        Object objCheckAccountFuturesEligibility = c321852.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c321852.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCheckAccountFuturesEligibility);
            CeresRetrofit ceresRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String rhs_account_number = request.getData().getRhs_account_number();
            c321852.label = 1;
            objCheckAccountFuturesEligibility = ceresRetrofit.CheckAccountFuturesEligibility(metadata, rhs_account_number, c321852);
            if (objCheckAccountFuturesEligibility == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCheckAccountFuturesEligibility);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objCheckAccountFuturesEligibility);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetCheckpointSuitability(GetCheckpointSuitabilityRequestDto getCheckpointSuitabilityRequestDto, Continuation<? super GetCheckpointSuitabilityResponseDto> continuation) {
        C322081 c322081;
        if (continuation instanceof C322081) {
            c322081 = (C322081) continuation;
            int i = c322081.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c322081.label = i - Integer.MIN_VALUE;
            } else {
                c322081 = new C322081(continuation);
            }
        }
        Object objGetCheckpointSuitability = c322081.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c322081.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetCheckpointSuitability);
            Request<GetCheckpointSuitabilityRequestDto> request = new Request<>(getCheckpointSuitabilityRequestDto, null, 2, null);
            c322081.label = 1;
            objGetCheckpointSuitability = GetCheckpointSuitability(request, c322081);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetCheckpointSuitability(Request<GetCheckpointSuitabilityRequestDto> request, Continuation<? super Response<GetCheckpointSuitabilityResponseDto>> continuation) {
        C322092 c322092;
        if (continuation instanceof C322092) {
            c322092 = (C322092) continuation;
            int i = c322092.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c322092.label = i - Integer.MIN_VALUE;
            } else {
                c322092 = new C322092(continuation);
            }
        }
        Object objGetCheckpointSuitability = c322092.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c322092.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetCheckpointSuitability);
            CeresRetrofit ceresRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String rhs_account_number = request.getData().getRhs_account_number();
            SuitabilityCheckpointDto checkpoint = request.getData().getCheckpoint();
            c322092.label = 1;
            objGetCheckpointSuitability = ceresRetrofit.GetCheckpointSuitability(metadata, rhs_account_number, checkpoint, c322092);
            if (objGetCheckpointSuitability == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetCheckpointSuitability);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetCheckpointSuitability);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object EvaluateCheckpointSuitability(EvaluateCheckpointSuitabilityRequestDto evaluateCheckpointSuitabilityRequestDto, Continuation<? super EvaluateCheckpointSuitabilityResponseDto> continuation) {
        C321941 c321941;
        if (continuation instanceof C321941) {
            c321941 = (C321941) continuation;
            int i = c321941.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c321941.label = i - Integer.MIN_VALUE;
            } else {
                c321941 = new C321941(continuation);
            }
        }
        Object objEvaluateCheckpointSuitability = c321941.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c321941.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objEvaluateCheckpointSuitability);
            Request<EvaluateCheckpointSuitabilityRequestDto> request = new Request<>(evaluateCheckpointSuitabilityRequestDto, null, 2, null);
            c321941.label = 1;
            objEvaluateCheckpointSuitability = EvaluateCheckpointSuitability(request, c321941);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object EvaluateCheckpointSuitability(Request<EvaluateCheckpointSuitabilityRequestDto> request, Continuation<? super Response<EvaluateCheckpointSuitabilityResponseDto>> continuation) {
        C321952 c321952;
        if (continuation instanceof C321952) {
            c321952 = (C321952) continuation;
            int i = c321952.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c321952.label = i - Integer.MIN_VALUE;
            } else {
                c321952 = new C321952(continuation);
            }
        }
        Object objEvaluateCheckpointSuitability = c321952.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c321952.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objEvaluateCheckpointSuitability);
            CeresRetrofit ceresRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            EvaluateCheckpointSuitabilityRequestDto data = request.getData();
            c321952.label = 1;
            objEvaluateCheckpointSuitability = ceresRetrofit.EvaluateCheckpointSuitability(metadata, data, c321952);
            if (objEvaluateCheckpointSuitability == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objEvaluateCheckpointSuitability);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objEvaluateCheckpointSuitability);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetAgreementType(GetAgreementTypeRequestDto getAgreementTypeRequestDto, Continuation<? super GetAgreementTypeResponseDto> continuation) {
        C322001 c322001;
        if (continuation instanceof C322001) {
            c322001 = (C322001) continuation;
            int i = c322001.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c322001.label = i - Integer.MIN_VALUE;
            } else {
                c322001 = new C322001(continuation);
            }
        }
        Object objGetAgreementType = c322001.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c322001.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetAgreementType);
            Request<GetAgreementTypeRequestDto> request = new Request<>(getAgreementTypeRequestDto, null, 2, null);
            c322001.label = 1;
            objGetAgreementType = GetAgreementType(request, c322001);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetAgreementType(Request<GetAgreementTypeRequestDto> request, Continuation<? super Response<GetAgreementTypeResponseDto>> continuation) {
        C322012 c322012;
        if (continuation instanceof C322012) {
            c322012 = (C322012) continuation;
            int i = c322012.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c322012.label = i - Integer.MIN_VALUE;
            } else {
                c322012 = new C322012(continuation);
            }
        }
        Object objGetAgreementType = c322012.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c322012.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetAgreementType);
            CeresRetrofit ceresRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            c322012.label = 1;
            objGetAgreementType = ceresRetrofit.GetAgreementType(metadata, c322012);
            if (objGetAgreementType == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetAgreementType);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetAgreementType);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetPresubmitOrderValidation(GetPresubmitOrderValidationRequestDto getPresubmitOrderValidationRequestDto, Continuation<? super GetPresubmitOrderValidationResponseDto> continuation) {
        C322381 c322381;
        if (continuation instanceof C322381) {
            c322381 = (C322381) continuation;
            int i = c322381.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c322381.label = i - Integer.MIN_VALUE;
            } else {
                c322381 = new C322381(continuation);
            }
        }
        Object objGetPresubmitOrderValidation = c322381.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c322381.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetPresubmitOrderValidation);
            Request<GetPresubmitOrderValidationRequestDto> request = new Request<>(getPresubmitOrderValidationRequestDto, null, 2, null);
            c322381.label = 1;
            objGetPresubmitOrderValidation = GetPresubmitOrderValidation(request, c322381);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetPresubmitOrderValidation(Request<GetPresubmitOrderValidationRequestDto> request, Continuation<? super Response<GetPresubmitOrderValidationResponseDto>> continuation) {
        C322392 c322392;
        if (continuation instanceof C322392) {
            c322392 = (C322392) continuation;
            int i = c322392.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c322392.label = i - Integer.MIN_VALUE;
            } else {
                c322392 = new C322392(continuation);
            }
        }
        Object objGetPresubmitOrderValidation = c322392.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c322392.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetPresubmitOrderValidation);
            CeresRetrofit ceresRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String account_id = request.getData().getAccount_id();
            c322392.label = 1;
            objGetPresubmitOrderValidation = ceresRetrofit.GetPresubmitOrderValidation(metadata, account_id, c322392);
            if (objGetPresubmitOrderValidation == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetPresubmitOrderValidation);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetPresubmitOrderValidation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetOrderByAccountIDAndOrderID(GetOrderByIDRequestDto getOrderByIDRequestDto, Continuation<? super FuturesOrderDto> continuation) {
        C322261 c322261;
        if (continuation instanceof C322261) {
            c322261 = (C322261) continuation;
            int i = c322261.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c322261.label = i - Integer.MIN_VALUE;
            } else {
                c322261 = new C322261(continuation);
            }
        }
        Object objGetOrderByAccountIDAndOrderID = c322261.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c322261.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetOrderByAccountIDAndOrderID);
            Request<GetOrderByIDRequestDto> request = new Request<>(getOrderByIDRequestDto, null, 2, null);
            c322261.label = 1;
            objGetOrderByAccountIDAndOrderID = GetOrderByAccountIDAndOrderID(request, c322261);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetOrderByAccountIDAndOrderID(Request<GetOrderByIDRequestDto> request, Continuation<? super Response<FuturesOrderDto>> continuation) {
        C322272 c322272;
        if (continuation instanceof C322272) {
            c322272 = (C322272) continuation;
            int i = c322272.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c322272.label = i - Integer.MIN_VALUE;
            } else {
                c322272 = new C322272(continuation);
            }
        }
        Object objGetOrderByAccountIDAndOrderID = c322272.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c322272.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetOrderByAccountIDAndOrderID);
            CeresRetrofit ceresRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String account_id = request.getData().getAccount_id();
            String order_id = request.getData().getOrder_id();
            c322272.label = 1;
            objGetOrderByAccountIDAndOrderID = ceresRetrofit.GetOrderByAccountIDAndOrderID(metadata, account_id, order_id, c322272);
            if (objGetOrderByAccountIDAndOrderID == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetOrderByAccountIDAndOrderID);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetOrderByAccountIDAndOrderID);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetOrderByID(GetOrderByIDRequestDto getOrderByIDRequestDto, Continuation<? super FuturesOrderDto> continuation) {
        C322281 c322281;
        if (continuation instanceof C322281) {
            c322281 = (C322281) continuation;
            int i = c322281.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c322281.label = i - Integer.MIN_VALUE;
            } else {
                c322281 = new C322281(continuation);
            }
        }
        Object objGetOrderByID = c322281.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c322281.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetOrderByID);
            Request<GetOrderByIDRequestDto> request = new Request<>(getOrderByIDRequestDto, null, 2, null);
            c322281.label = 1;
            objGetOrderByID = GetOrderByID(request, c322281);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetOrderByID(Request<GetOrderByIDRequestDto> request, Continuation<? super Response<FuturesOrderDto>> continuation) {
        C322292 c322292;
        if (continuation instanceof C322292) {
            c322292 = (C322292) continuation;
            int i = c322292.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c322292.label = i - Integer.MIN_VALUE;
            } else {
                c322292 = new C322292(continuation);
            }
        }
        Object objGetOrderByID = c322292.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c322292.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetOrderByID);
            CeresRetrofit ceresRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String order_id = request.getData().getOrder_id();
            String account_id = !Intrinsics.areEqual(request.getData().getAccount_id(), "") ? request.getData().getAccount_id() : null;
            c322292.label = 1;
            objGetOrderByID = ceresRetrofit.GetOrderByID(metadata, order_id, account_id, c322292);
            if (objGetOrderByID == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetOrderByID);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetOrderByID);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetOrdersByAccountID(GetOrdersRequestDto getOrdersRequestDto, Continuation<? super GetOrdersResponseDto> continuation) {
        C322321 c322321;
        if (continuation instanceof C322321) {
            c322321 = (C322321) continuation;
            int i = c322321.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c322321.label = i - Integer.MIN_VALUE;
            } else {
                c322321 = new C322321(continuation);
            }
        }
        Object objGetOrdersByAccountID = c322321.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c322321.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetOrdersByAccountID);
            Request<GetOrdersRequestDto> request = new Request<>(getOrdersRequestDto, null, 2, null);
            c322321.label = 1;
            objGetOrdersByAccountID = GetOrdersByAccountID(request, c322321);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetOrdersByAccountID(Request<GetOrdersRequestDto> request, Continuation<? super Response<GetOrdersResponseDto>> continuation) {
        C322332 c322332;
        if (continuation instanceof C322332) {
            c322332 = (C322332) continuation;
            int i = c322332.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c322332.label = i - Integer.MIN_VALUE;
            } else {
                c322332 = new C322332(continuation);
            }
        }
        Object obj = c322332.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c322332.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            CeresRetrofit ceresRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String account_id = request.getData().getAccount_id();
            List<OrderStateDto> order_state = request.getData().getOrder_state();
            String contract_id = request.getData().getContract_id();
            String cursor = request.getData().getCursor();
            Integer page_size = request.getData().getPage_size();
            String account_number = request.getData().getAccount_number();
            String order_id = request.getData().getOrder_id();
            OrderTypeDto order_type = request.getData().getOrder_type();
            SideDto order_side = request.getData().getOrder_side();
            String start_date = request.getData().getStart_date();
            String end_date = request.getData().getEnd_date();
            String comma_separated_order_state = request.getData().getComma_separated_order_state();
            String updated_at_start_time = request.getData().getUpdated_at_start_time();
            String updated_at_end_time = request.getData().getUpdated_at_end_time();
            OrderTriggerDto order_trigger = request.getData().getOrder_trigger();
            Boolean boolIs_download_csv = request.getData().is_download_csv();
            FuturesContractTypeDto contract_type = request.getData().getContract_type();
            OrderRejectReasonDto reject_reason = request.getData().getReject_reason();
            String rhs_account_number = request.getData().getRhs_account_number();
            ShardRegionDto shard_region = request.getData().getShard_region();
            ShardNumberDto shard_number = request.getData().getShard_number();
            c322332.label = 1;
            Object objGetOrdersByAccountID = ceresRetrofit.GetOrdersByAccountID(metadata, account_id, order_state, contract_id, cursor, page_size, account_number, order_id, order_type, order_side, start_date, end_date, comma_separated_order_state, updated_at_start_time, updated_at_end_time, order_trigger, boolIs_download_csv, contract_type, reject_reason, rhs_account_number, shard_region, shard_number, c322332);
            if (objGetOrdersByAccountID == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj = objGetOrdersByAccountID;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetCashSettlementExecutionByID(GetCashSettlementExecutionByIDRequestDto getCashSettlementExecutionByIDRequestDto, Continuation<? super FuturesExecutionDto> continuation) {
        C322041 c322041;
        if (continuation instanceof C322041) {
            c322041 = (C322041) continuation;
            int i = c322041.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c322041.label = i - Integer.MIN_VALUE;
            } else {
                c322041 = new C322041(continuation);
            }
        }
        Object objGetCashSettlementExecutionByID = c322041.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c322041.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetCashSettlementExecutionByID);
            Request<GetCashSettlementExecutionByIDRequestDto> request = new Request<>(getCashSettlementExecutionByIDRequestDto, null, 2, null);
            c322041.label = 1;
            objGetCashSettlementExecutionByID = GetCashSettlementExecutionByID(request, c322041);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetCashSettlementExecutionByID(Request<GetCashSettlementExecutionByIDRequestDto> request, Continuation<? super Response<FuturesExecutionDto>> continuation) {
        C322052 c322052;
        if (continuation instanceof C322052) {
            c322052 = (C322052) continuation;
            int i = c322052.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c322052.label = i - Integer.MIN_VALUE;
            } else {
                c322052 = new C322052(continuation);
            }
        }
        Object objGetCashSettlementExecutionByID = c322052.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c322052.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetCashSettlementExecutionByID);
            CeresRetrofit ceresRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String execution_id = request.getData().getExecution_id();
            c322052.label = 1;
            objGetCashSettlementExecutionByID = ceresRetrofit.GetCashSettlementExecutionByID(metadata, execution_id, c322052);
            if (objGetCashSettlementExecutionByID == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetCashSettlementExecutionByID);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetCashSettlementExecutionByID);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetCashSettlementExecutions(GetCashSettlementExecutionsRequestDto getCashSettlementExecutionsRequestDto, Continuation<? super GetCashSettlementExecutionsResponseDto> continuation) {
        C322061 c322061;
        if (continuation instanceof C322061) {
            c322061 = (C322061) continuation;
            int i = c322061.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c322061.label = i - Integer.MIN_VALUE;
            } else {
                c322061 = new C322061(continuation);
            }
        }
        Object objGetCashSettlementExecutions = c322061.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c322061.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetCashSettlementExecutions);
            Request<GetCashSettlementExecutionsRequestDto> request = new Request<>(getCashSettlementExecutionsRequestDto, null, 2, null);
            c322061.label = 1;
            objGetCashSettlementExecutions = GetCashSettlementExecutions(request, c322061);
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

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetCashSettlementExecutions(Request<GetCashSettlementExecutionsRequestDto> request, Continuation<? super Response<GetCashSettlementExecutionsResponseDto>> continuation) {
        C322072 c322072;
        if (continuation instanceof C322072) {
            c322072 = (C322072) continuation;
            int i = c322072.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c322072.label = i - Integer.MIN_VALUE;
            } else {
                c322072 = new C322072(continuation);
            }
        }
        C322072 c3220722 = c322072;
        Object objGetCashSettlementExecutions = c3220722.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3220722.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetCashSettlementExecutions);
            CeresRetrofit ceresRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String account_id = request.getData().getAccount_id();
            String cursor = request.getData().getCursor();
            Integer page_size = request.getData().getPage_size();
            String contract_id = request.getData().getContract_id();
            Boolean boolIs_download_csv = request.getData().is_download_csv();
            ShardRegionDto shard_region = request.getData().getShard_region();
            ShardNumberDto shard_number = request.getData().getShard_number();
            c3220722.label = 1;
            objGetCashSettlementExecutions = ceresRetrofit.GetCashSettlementExecutions(metadata, account_id, cursor, page_size, contract_id, boolIs_download_csv, shard_region, shard_number, c3220722);
            if (objGetCashSettlementExecutions == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetCashSettlementExecutions);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetCashSettlementExecutions);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetOrders(GetOrdersRequestDto getOrdersRequestDto, Continuation<? super GetOrdersResponseDto> continuation) {
        C322301 c322301;
        if (continuation instanceof C322301) {
            c322301 = (C322301) continuation;
            int i = c322301.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c322301.label = i - Integer.MIN_VALUE;
            } else {
                c322301 = new C322301(continuation);
            }
        }
        Object objGetOrders = c322301.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c322301.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetOrders);
            Request<GetOrdersRequestDto> request = new Request<>(getOrdersRequestDto, null, 2, null);
            c322301.label = 1;
            objGetOrders = GetOrders(request, c322301);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetOrders(Request<GetOrdersRequestDto> request, Continuation<? super Response<GetOrdersResponseDto>> continuation) {
        C322312 c322312;
        if (continuation instanceof C322312) {
            c322312 = (C322312) continuation;
            int i = c322312.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c322312.label = i - Integer.MIN_VALUE;
            } else {
                c322312 = new C322312(continuation);
            }
        }
        Object obj = c322312.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c322312.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            CeresRetrofit ceresRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String account_id = !Intrinsics.areEqual(request.getData().getAccount_id(), "") ? request.getData().getAccount_id() : null;
            List<OrderStateDto> order_state = request.getData().getOrder_state();
            String contract_id = request.getData().getContract_id();
            String cursor = request.getData().getCursor();
            Integer page_size = request.getData().getPage_size();
            String account_number = request.getData().getAccount_number();
            String order_id = request.getData().getOrder_id();
            OrderTypeDto order_type = request.getData().getOrder_type();
            SideDto order_side = request.getData().getOrder_side();
            String start_date = request.getData().getStart_date();
            String end_date = request.getData().getEnd_date();
            String comma_separated_order_state = request.getData().getComma_separated_order_state();
            String updated_at_start_time = request.getData().getUpdated_at_start_time();
            String updated_at_end_time = request.getData().getUpdated_at_end_time();
            OrderTriggerDto order_trigger = request.getData().getOrder_trigger();
            Boolean boolIs_download_csv = request.getData().is_download_csv();
            FuturesContractTypeDto contract_type = request.getData().getContract_type();
            OrderRejectReasonDto reject_reason = request.getData().getReject_reason();
            String rhs_account_number = request.getData().getRhs_account_number();
            ShardRegionDto shard_region = request.getData().getShard_region();
            ShardNumberDto shard_number = request.getData().getShard_number();
            c322312.label = 1;
            Object objGetOrders = ceresRetrofit.GetOrders(metadata, account_id, order_state, contract_id, cursor, page_size, account_number, order_id, order_type, order_side, start_date, end_date, comma_separated_order_state, updated_at_start_time, updated_at_end_time, order_trigger, boolIs_download_csv, contract_type, reject_reason, rhs_account_number, shard_region, shard_number, c322312);
            if (objGetOrders == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj = objGetOrders;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object CancelFuturesOrder(CancelFuturesOrderRequestDto cancelFuturesOrderRequestDto, Continuation<? super CancelFuturesOrderResponseDto> continuation) {
        C321821 c321821;
        if (continuation instanceof C321821) {
            c321821 = (C321821) continuation;
            int i = c321821.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c321821.label = i - Integer.MIN_VALUE;
            } else {
                c321821 = new C321821(continuation);
            }
        }
        Object objCancelFuturesOrder = c321821.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c321821.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCancelFuturesOrder);
            Request<CancelFuturesOrderRequestDto> request = new Request<>(cancelFuturesOrderRequestDto, null, 2, null);
            c321821.label = 1;
            objCancelFuturesOrder = CancelFuturesOrder(request, c321821);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object CancelFuturesOrder(Request<CancelFuturesOrderRequestDto> request, Continuation<? super Response<CancelFuturesOrderResponseDto>> continuation) {
        C321832 c321832;
        if (continuation instanceof C321832) {
            c321832 = (C321832) continuation;
            int i = c321832.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c321832.label = i - Integer.MIN_VALUE;
            } else {
                c321832 = new C321832(continuation);
            }
        }
        Object objCancelFuturesOrder = c321832.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c321832.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCancelFuturesOrder);
            CeresRetrofit ceresRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String order_id = request.getData().getOrder_id();
            CancelFuturesOrderRequestDto data = request.getData();
            c321832.label = 1;
            objCancelFuturesOrder = ceresRetrofit.CancelFuturesOrder(metadata, order_id, data, c321832);
            if (objCancelFuturesOrder == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCancelFuturesOrder);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objCancelFuturesOrder);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object CancelEventContractOrder(CancelEventContractOrderRequestDto cancelEventContractOrderRequestDto, Continuation<? super CancelEventContractOrderResponseDto> continuation) {
        C321801 c321801;
        if (continuation instanceof C321801) {
            c321801 = (C321801) continuation;
            int i = c321801.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c321801.label = i - Integer.MIN_VALUE;
            } else {
                c321801 = new C321801(continuation);
            }
        }
        Object objCancelEventContractOrder = c321801.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c321801.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCancelEventContractOrder);
            Request<CancelEventContractOrderRequestDto> request = new Request<>(cancelEventContractOrderRequestDto, null, 2, null);
            c321801.label = 1;
            objCancelEventContractOrder = CancelEventContractOrder(request, c321801);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object CancelEventContractOrder(Request<CancelEventContractOrderRequestDto> request, Continuation<? super Response<CancelEventContractOrderResponseDto>> continuation) {
        C321812 c321812;
        if (continuation instanceof C321812) {
            c321812 = (C321812) continuation;
            int i = c321812.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c321812.label = i - Integer.MIN_VALUE;
            } else {
                c321812 = new C321812(continuation);
            }
        }
        Object objCancelEventContractOrder = c321812.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c321812.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCancelEventContractOrder);
            CeresRetrofit ceresRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String order_id = request.getData().getOrder_id();
            CancelEventContractOrderRequestDto data = request.getData();
            c321812.label = 1;
            objCancelEventContractOrder = ceresRetrofit.CancelEventContractOrder(metadata, order_id, data, c321812);
            if (objCancelEventContractOrder == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCancelEventContractOrder);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objCancelEventContractOrder);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetAccounts(GetAccountsRequestDto getAccountsRequestDto, Continuation<? super GetAccountsResponseDto> continuation) {
        C321981 c321981;
        if (continuation instanceof C321981) {
            c321981 = (C321981) continuation;
            int i = c321981.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c321981.label = i - Integer.MIN_VALUE;
            } else {
                c321981 = new C321981(continuation);
            }
        }
        Object objGetAccounts = c321981.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c321981.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetAccounts);
            Request<GetAccountsRequestDto> request = new Request<>(getAccountsRequestDto, null, 2, null);
            c321981.label = 1;
            objGetAccounts = GetAccounts(request, c321981);
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

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetAccounts(Request<GetAccountsRequestDto> request, Continuation<? super Response<GetAccountsResponseDto>> continuation) {
        C321992 c321992;
        if (continuation instanceof C321992) {
            c321992 = (C321992) continuation;
            int i = c321992.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c321992.label = i - Integer.MIN_VALUE;
            } else {
                c321992 = new C321992(continuation);
            }
        }
        C321992 c3219922 = c321992;
        Object objGetAccounts = c3219922.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3219922.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetAccounts);
            CeresRetrofit ceresRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String rhs_account_number = request.getData().getRhs_account_number();
            String cursor = request.getData().getCursor();
            Integer page_size = request.getData().getPage_size();
            AccountClientTypeDto client_type = request.getData().getClient_type();
            String account_number = request.getData().getAccount_number();
            c3219922.label = 1;
            objGetAccounts = ceresRetrofit.GetAccounts(metadata, rhs_account_number, cursor, page_size, client_type, account_number, c3219922);
            if (objGetAccounts == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetAccounts);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetAccounts);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetCurrentCashBalance(GetCurrentCashBalanceRequestDto getCurrentCashBalanceRequestDto, Continuation<? super CashBalanceDto> continuation) {
        C322141 c322141;
        if (continuation instanceof C322141) {
            c322141 = (C322141) continuation;
            int i = c322141.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c322141.label = i - Integer.MIN_VALUE;
            } else {
                c322141 = new C322141(continuation);
            }
        }
        Object objGetCurrentCashBalance = c322141.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c322141.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetCurrentCashBalance);
            Request<GetCurrentCashBalanceRequestDto> request = new Request<>(getCurrentCashBalanceRequestDto, null, 2, null);
            c322141.label = 1;
            objGetCurrentCashBalance = GetCurrentCashBalance(request, c322141);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetCurrentCashBalance(Request<GetCurrentCashBalanceRequestDto> request, Continuation<? super Response<CashBalanceDto>> continuation) {
        C322152 c322152;
        if (continuation instanceof C322152) {
            c322152 = (C322152) continuation;
            int i = c322152.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c322152.label = i - Integer.MIN_VALUE;
            } else {
                c322152 = new C322152(continuation);
            }
        }
        Object objGetCurrentCashBalance = c322152.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c322152.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetCurrentCashBalance);
            CeresRetrofit ceresRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String account_id = request.getData().getAccount_id();
            c322152.label = 1;
            objGetCurrentCashBalance = ceresRetrofit.GetCurrentCashBalance(metadata, account_id, c322152);
            if (objGetCurrentCashBalance == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetCurrentCashBalance);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetCurrentCashBalance);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetCurrentPositions(GetCurrentPositionsRequestDto getCurrentPositionsRequestDto, Continuation<? super GetCurrentPositionsResponseDto> continuation) {
        C322161 c322161;
        if (continuation instanceof C322161) {
            c322161 = (C322161) continuation;
            int i = c322161.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c322161.label = i - Integer.MIN_VALUE;
            } else {
                c322161 = new C322161(continuation);
            }
        }
        Object objGetCurrentPositions = c322161.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c322161.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetCurrentPositions);
            Request<GetCurrentPositionsRequestDto> request = new Request<>(getCurrentPositionsRequestDto, null, 2, null);
            c322161.label = 1;
            objGetCurrentPositions = GetCurrentPositions(request, c322161);
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

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetCurrentPositions(Request<GetCurrentPositionsRequestDto> request, Continuation<? super Response<GetCurrentPositionsResponseDto>> continuation) {
        C322172 c322172;
        if (continuation instanceof C322172) {
            c322172 = (C322172) continuation;
            int i = c322172.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c322172.label = i - Integer.MIN_VALUE;
            } else {
                c322172 = new C322172(continuation);
            }
        }
        C322172 c3221722 = c322172;
        Object objGetCurrentPositions = c3221722.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3221722.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetCurrentPositions);
            CeresRetrofit ceresRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String account_id = request.getData().getAccount_id();
            String cursor = request.getData().getCursor();
            Integer page_size = request.getData().getPage_size();
            FuturesContractTypeDto contract_type = request.getData().getContract_type();
            c3221722.label = 1;
            objGetCurrentPositions = ceresRetrofit.GetCurrentPositions(metadata, account_id, cursor, page_size, contract_type, c3221722);
            if (objGetCurrentPositions == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetCurrentPositions);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetCurrentPositions);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetCurrentPositionsByContractID(GetCurrentPositionsByContractIDRequestDto getCurrentPositionsByContractIDRequestDto, Continuation<? super GetCurrentPositionsByContractIDResponseDto> continuation) {
        C322181 c322181;
        if (continuation instanceof C322181) {
            c322181 = (C322181) continuation;
            int i = c322181.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c322181.label = i - Integer.MIN_VALUE;
            } else {
                c322181 = new C322181(continuation);
            }
        }
        Object objGetCurrentPositionsByContractID = c322181.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c322181.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetCurrentPositionsByContractID);
            Request<GetCurrentPositionsByContractIDRequestDto> request = new Request<>(getCurrentPositionsByContractIDRequestDto, null, 2, null);
            c322181.label = 1;
            objGetCurrentPositionsByContractID = GetCurrentPositionsByContractID(request, c322181);
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

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetCurrentPositionsByContractID(Request<GetCurrentPositionsByContractIDRequestDto> request, Continuation<? super Response<GetCurrentPositionsByContractIDResponseDto>> continuation) {
        C322192 c322192;
        if (continuation instanceof C322192) {
            c322192 = (C322192) continuation;
            int i = c322192.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c322192.label = i - Integer.MIN_VALUE;
            } else {
                c322192 = new C322192(continuation);
            }
        }
        C322192 c3221922 = c322192;
        Object objGetCurrentPositionsByContractID = c3221922.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3221922.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetCurrentPositionsByContractID);
            CeresRetrofit ceresRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String account_id = request.getData().getAccount_id();
            String contract_id = request.getData().getContract_id();
            String cursor = request.getData().getCursor();
            Integer page_size = request.getData().getPage_size();
            c3221922.label = 1;
            objGetCurrentPositionsByContractID = ceresRetrofit.GetCurrentPositionsByContractID(metadata, account_id, contract_id, cursor, page_size, c3221922);
            if (objGetCurrentPositionsByContractID == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetCurrentPositionsByContractID);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetCurrentPositionsByContractID);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetCurrentAggregatedPositions(GetCurrentAggregatedPositionsRequestDto getCurrentAggregatedPositionsRequestDto, Continuation<? super GetCurrentAggregatedPositionsResponseDto> continuation) {
        C322121 c322121;
        if (continuation instanceof C322121) {
            c322121 = (C322121) continuation;
            int i = c322121.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c322121.label = i - Integer.MIN_VALUE;
            } else {
                c322121 = new C322121(continuation);
            }
        }
        Object objGetCurrentAggregatedPositions = c322121.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c322121.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetCurrentAggregatedPositions);
            Request<GetCurrentAggregatedPositionsRequestDto> request = new Request<>(getCurrentAggregatedPositionsRequestDto, null, 2, null);
            c322121.label = 1;
            objGetCurrentAggregatedPositions = GetCurrentAggregatedPositions(request, c322121);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetCurrentAggregatedPositions(Request<GetCurrentAggregatedPositionsRequestDto> request, Continuation<? super Response<GetCurrentAggregatedPositionsResponseDto>> continuation) {
        C322132 c322132;
        if (continuation instanceof C322132) {
            c322132 = (C322132) continuation;
            int i = c322132.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c322132.label = i - Integer.MIN_VALUE;
            } else {
                c322132 = new C322132(continuation);
            }
        }
        Object obj = c322132.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c322132.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            CeresRetrofit ceresRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String account_id = request.getData().getAccount_id();
            String contract_id = request.getData().getContract_id();
            String cursor = request.getData().getCursor();
            Integer page_size = request.getData().getPage_size();
            Boolean boolIs_download_csv = request.getData().is_download_csv();
            FuturesContractTypeDto contract_type = request.getData().getContract_type();
            String account_number = request.getData().getAccount_number();
            String start_oldest_event_date = request.getData().getStart_oldest_event_date();
            String end_oldest_event_date = request.getData().getEnd_oldest_event_date();
            ShardRegionDto shard_region = request.getData().getShard_region();
            ShardNumberDto shard_number = request.getData().getShard_number();
            c322132.label = 1;
            Object objGetCurrentAggregatedPositions = ceresRetrofit.GetCurrentAggregatedPositions(metadata, account_id, contract_id, cursor, page_size, boolIs_download_csv, contract_type, account_number, start_oldest_event_date, end_oldest_event_date, shard_region, shard_number, c322132);
            if (objGetCurrentAggregatedPositions == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj = objGetCurrentAggregatedPositions;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetContractQuantities(GetContractQuantitiesRequestDto getContractQuantitiesRequestDto, Continuation<? super GetContractQuantitiesResponseDto> continuation) {
        C322101 c322101;
        if (continuation instanceof C322101) {
            c322101 = (C322101) continuation;
            int i = c322101.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c322101.label = i - Integer.MIN_VALUE;
            } else {
                c322101 = new C322101(continuation);
            }
        }
        Object objGetContractQuantities = c322101.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c322101.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetContractQuantities);
            Request<GetContractQuantitiesRequestDto> request = new Request<>(getContractQuantitiesRequestDto, null, 2, null);
            c322101.label = 1;
            objGetContractQuantities = GetContractQuantities(request, c322101);
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

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetContractQuantities(Request<GetContractQuantitiesRequestDto> request, Continuation<? super Response<GetContractQuantitiesResponseDto>> continuation) {
        C322112 c322112;
        if (continuation instanceof C322112) {
            c322112 = (C322112) continuation;
            int i = c322112.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c322112.label = i - Integer.MIN_VALUE;
            } else {
                c322112 = new C322112(continuation);
            }
        }
        C322112 c3221122 = c322112;
        Object objGetContractQuantities = c3221122.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3221122.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetContractQuantities);
            CeresRetrofit ceresRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String account_id = request.getData().getAccount_id();
            List<String> contract_ids = request.getData().getContract_ids();
            String cursor = request.getData().getCursor();
            Integer page_size = request.getData().getPage_size();
            c3221122.label = 1;
            objGetContractQuantities = ceresRetrofit.GetContractQuantities(metadata, account_id, contract_ids, cursor, page_size, c3221122);
            if (objGetContractQuantities == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetContractQuantities);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetContractQuantities);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object CreatePositionSellout(CreatePositionSelloutRequestDto createPositionSelloutRequestDto, Continuation<? super CreatePositionSelloutResponseDto> continuation) {
        C321921 c321921;
        if (continuation instanceof C321921) {
            c321921 = (C321921) continuation;
            int i = c321921.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c321921.label = i - Integer.MIN_VALUE;
            } else {
                c321921 = new C321921(continuation);
            }
        }
        Object objCreatePositionSellout = c321921.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c321921.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCreatePositionSellout);
            Request<CreatePositionSelloutRequestDto> request = new Request<>(createPositionSelloutRequestDto, null, 2, null);
            c321921.label = 1;
            objCreatePositionSellout = CreatePositionSellout(request, c321921);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object CreatePositionSellout(Request<CreatePositionSelloutRequestDto> request, Continuation<? super Response<CreatePositionSelloutResponseDto>> continuation) {
        C321932 c321932;
        if (continuation instanceof C321932) {
            c321932 = (C321932) continuation;
            int i = c321932.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c321932.label = i - Integer.MIN_VALUE;
            } else {
                c321932 = new C321932(continuation);
            }
        }
        Object objCreatePositionSellout = c321932.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c321932.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCreatePositionSellout);
            CeresRetrofit ceresRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            CreatePositionSelloutRequestDto data = request.getData();
            c321932.label = 1;
            objCreatePositionSellout = ceresRetrofit.CreatePositionSellout(metadata, data, c321932);
            if (objCreatePositionSellout == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCreatePositionSellout);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objCreatePositionSellout);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetPnL(GetPnLRequestDto getPnLRequestDto, Continuation<? super PnLDto> continuation) {
        C322341 c322341;
        if (continuation instanceof C322341) {
            c322341 = (C322341) continuation;
            int i = c322341.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c322341.label = i - Integer.MIN_VALUE;
            } else {
                c322341 = new C322341(continuation);
            }
        }
        Object objGetPnL = c322341.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c322341.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetPnL);
            Request<GetPnLRequestDto> request = new Request<>(getPnLRequestDto, null, 2, null);
            c322341.label = 1;
            objGetPnL = GetPnL(request, c322341);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetPnL(Request<GetPnLRequestDto> request, Continuation<? super Response<PnLDto>> continuation) {
        C322352 c322352;
        if (continuation instanceof C322352) {
            c322352 = (C322352) continuation;
            int i = c322352.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c322352.label = i - Integer.MIN_VALUE;
            } else {
                c322352 = new C322352(continuation);
            }
        }
        Object objGetPnL = c322352.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c322352.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetPnL);
            CeresRetrofit ceresRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String account_id = request.getData().getAccount_id();
            String contract_id = request.getData().getContract_id();
            c322352.label = 1;
            objGetPnL = ceresRetrofit.GetPnL(metadata, account_id, contract_id, c322352);
            if (objGetPnL == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetPnL);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetPnL);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetPnLCostBasis(GetPnLRequestDto getPnLRequestDto, Continuation<? super PnLCostBasisDto> continuation) {
        C322361 c322361;
        if (continuation instanceof C322361) {
            c322361 = (C322361) continuation;
            int i = c322361.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c322361.label = i - Integer.MIN_VALUE;
            } else {
                c322361 = new C322361(continuation);
            }
        }
        Object objGetPnLCostBasis = c322361.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c322361.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetPnLCostBasis);
            Request<GetPnLRequestDto> request = new Request<>(getPnLRequestDto, null, 2, null);
            c322361.label = 1;
            objGetPnLCostBasis = GetPnLCostBasis(request, c322361);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetPnLCostBasis(Request<GetPnLRequestDto> request, Continuation<? super Response<PnLCostBasisDto>> continuation) {
        C322372 c322372;
        if (continuation instanceof C322372) {
            c322372 = (C322372) continuation;
            int i = c322372.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c322372.label = i - Integer.MIN_VALUE;
            } else {
                c322372 = new C322372(continuation);
            }
        }
        Object objGetPnLCostBasis = c322372.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c322372.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetPnLCostBasis);
            CeresRetrofit ceresRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String account_id = request.getData().getAccount_id();
            String contract_id = request.getData().getContract_id();
            c322372.label = 1;
            objGetPnLCostBasis = ceresRetrofit.GetPnLCostBasis(metadata, account_id, contract_id, c322372);
            if (objGetPnLCostBasis == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetPnLCostBasis);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetPnLCostBasis);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetBuyingPowerEffect(GetBuyingPowerEffectRequestDto getBuyingPowerEffectRequestDto, Continuation<? super GetBuyingPowerEffectResponseDto> continuation) {
        C322021 c322021;
        if (continuation instanceof C322021) {
            c322021 = (C322021) continuation;
            int i = c322021.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c322021.label = i - Integer.MIN_VALUE;
            } else {
                c322021 = new C322021(continuation);
            }
        }
        Object objGetBuyingPowerEffect = c322021.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c322021.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetBuyingPowerEffect);
            Request<GetBuyingPowerEffectRequestDto> request = new Request<>(getBuyingPowerEffectRequestDto, null, 2, null);
            c322021.label = 1;
            objGetBuyingPowerEffect = GetBuyingPowerEffect(request, c322021);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetBuyingPowerEffect(Request<GetBuyingPowerEffectRequestDto> request, Continuation<? super Response<GetBuyingPowerEffectResponseDto>> continuation) {
        C322032 c322032;
        if (continuation instanceof C322032) {
            c322032 = (C322032) continuation;
            int i = c322032.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c322032.label = i - Integer.MIN_VALUE;
            } else {
                c322032 = new C322032(continuation);
            }
        }
        Object objGetBuyingPowerEffect = c322032.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c322032.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetBuyingPowerEffect);
            CeresRetrofit ceresRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            GetBuyingPowerEffectRequestDto data = request.getData();
            c322032.label = 1;
            objGetBuyingPowerEffect = ceresRetrofit.GetBuyingPowerEffect(metadata, data, c322032);
            if (objGetBuyingPowerEffect == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetBuyingPowerEffect);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetBuyingPowerEffect);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetFeesForTentativeOrder(GetFeesForTentativeOrderRequestDto getFeesForTentativeOrderRequestDto, Continuation<? super GetFeesForTentativeOrderResponseDto> continuation) {
        C322221 c322221;
        if (continuation instanceof C322221) {
            c322221 = (C322221) continuation;
            int i = c322221.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c322221.label = i - Integer.MIN_VALUE;
            } else {
                c322221 = new C322221(continuation);
            }
        }
        Object objGetFeesForTentativeOrder = c322221.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c322221.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetFeesForTentativeOrder);
            Request<GetFeesForTentativeOrderRequestDto> request = new Request<>(getFeesForTentativeOrderRequestDto, null, 2, null);
            c322221.label = 1;
            objGetFeesForTentativeOrder = GetFeesForTentativeOrder(request, c322221);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetFeesForTentativeOrder(Request<GetFeesForTentativeOrderRequestDto> request, Continuation<? super Response<GetFeesForTentativeOrderResponseDto>> continuation) {
        C322232 c322232;
        if (continuation instanceof C322232) {
            c322232 = (C322232) continuation;
            int i = c322232.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c322232.label = i - Integer.MIN_VALUE;
            } else {
                c322232 = new C322232(continuation);
            }
        }
        Object objGetFeesForTentativeOrder = c322232.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c322232.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetFeesForTentativeOrder);
            CeresRetrofit ceresRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            GetFeesForTentativeOrderRequestDto data = request.getData();
            c322232.label = 1;
            objGetFeesForTentativeOrder = ceresRetrofit.GetFeesForTentativeOrder(metadata, data, c322232);
            if (objGetFeesForTentativeOrder == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetFeesForTentativeOrder);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetFeesForTentativeOrder);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object ValidateOrder(ValidateOrderRequestDto validateOrderRequestDto, Continuation<? super ValidateOrderResponseDto> continuation) {
        C322521 c322521;
        if (continuation instanceof C322521) {
            c322521 = (C322521) continuation;
            int i = c322521.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c322521.label = i - Integer.MIN_VALUE;
            } else {
                c322521 = new C322521(continuation);
            }
        }
        Object objValidateOrder = c322521.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c322521.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objValidateOrder);
            Request<ValidateOrderRequestDto> request = new Request<>(validateOrderRequestDto, null, 2, null);
            c322521.label = 1;
            objValidateOrder = ValidateOrder(request, c322521);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object ValidateOrder(Request<ValidateOrderRequestDto> request, Continuation<? super Response<ValidateOrderResponseDto>> continuation) {
        C322532 c322532;
        if (continuation instanceof C322532) {
            c322532 = (C322532) continuation;
            int i = c322532.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c322532.label = i - Integer.MIN_VALUE;
            } else {
                c322532 = new C322532(continuation);
            }
        }
        Object objValidateOrder = c322532.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c322532.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objValidateOrder);
            CeresRetrofit ceresRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String account_id = request.getData().getAccount_id();
            ValidateOrderRequestDto data = request.getData();
            c322532.label = 1;
            objValidateOrder = ceresRetrofit.ValidateOrder(metadata, account_id, data, c322532);
            if (objValidateOrder == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objValidateOrder);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objValidateOrder);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetRealizedPnlForOrders(GetRealizedPnlForOrdersRequestDto getRealizedPnlForOrdersRequestDto, Continuation<? super GetRealizedPnlForOrdersResponseDto> continuation) {
        C322401 c322401;
        if (continuation instanceof C322401) {
            c322401 = (C322401) continuation;
            int i = c322401.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c322401.label = i - Integer.MIN_VALUE;
            } else {
                c322401 = new C322401(continuation);
            }
        }
        Object objGetRealizedPnlForOrders = c322401.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c322401.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetRealizedPnlForOrders);
            Request<GetRealizedPnlForOrdersRequestDto> request = new Request<>(getRealizedPnlForOrdersRequestDto, null, 2, null);
            c322401.label = 1;
            objGetRealizedPnlForOrders = GetRealizedPnlForOrders(request, c322401);
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

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetRealizedPnlForOrders(Request<GetRealizedPnlForOrdersRequestDto> request, Continuation<? super Response<GetRealizedPnlForOrdersResponseDto>> continuation) {
        C322412 c322412;
        if (continuation instanceof C322412) {
            c322412 = (C322412) continuation;
            int i = c322412.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c322412.label = i - Integer.MIN_VALUE;
            } else {
                c322412 = new C322412(continuation);
            }
        }
        C322412 c3224122 = c322412;
        Object objGetRealizedPnlForOrders = c3224122.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3224122.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetRealizedPnlForOrders);
            CeresRetrofit ceresRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String account_id = request.getData().getAccount_id();
            List<String> order_ids = request.getData().getOrder_ids();
            Boolean include_fees = request.getData().getInclude_fees();
            c3224122.label = 1;
            objGetRealizedPnlForOrders = ceresRetrofit.GetRealizedPnlForOrders(metadata, account_id, order_ids, include_fees, c3224122);
            if (objGetRealizedPnlForOrders == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetRealizedPnlForOrders);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetRealizedPnlForOrders);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetEventContractRealizedPnlByContract(GetEventContractRealizedPnlByContractRequestDto getEventContractRealizedPnlByContractRequestDto, Continuation<? super GetEventContractRealizedPnlByContractResponseDto> continuation) {
        C322201 c322201;
        if (continuation instanceof C322201) {
            c322201 = (C322201) continuation;
            int i = c322201.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c322201.label = i - Integer.MIN_VALUE;
            } else {
                c322201 = new C322201(continuation);
            }
        }
        Object objGetEventContractRealizedPnlByContract = c322201.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c322201.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetEventContractRealizedPnlByContract);
            Request<GetEventContractRealizedPnlByContractRequestDto> request = new Request<>(getEventContractRealizedPnlByContractRequestDto, null, 2, null);
            c322201.label = 1;
            objGetEventContractRealizedPnlByContract = GetEventContractRealizedPnlByContract(request, c322201);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetEventContractRealizedPnlByContract(Request<GetEventContractRealizedPnlByContractRequestDto> request, Continuation<? super Response<GetEventContractRealizedPnlByContractResponseDto>> continuation) {
        C322212 c322212;
        if (continuation instanceof C322212) {
            c322212 = (C322212) continuation;
            int i = c322212.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c322212.label = i - Integer.MIN_VALUE;
            } else {
                c322212 = new C322212(continuation);
            }
        }
        Object objGetEventContractRealizedPnlByContract = c322212.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c322212.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetEventContractRealizedPnlByContract);
            CeresRetrofit ceresRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String account_id = request.getData().getAccount_id();
            c322212.label = 1;
            objGetEventContractRealizedPnlByContract = ceresRetrofit.GetEventContractRealizedPnlByContract(metadata, account_id, c322212);
            if (objGetEventContractRealizedPnlByContract == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetEventContractRealizedPnlByContract);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetEventContractRealizedPnlByContract);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object FlattenPositions(FlattenPositionsRequestDto flattenPositionsRequestDto, Continuation<? super FlattenPositionsResponseDto> continuation) {
        C321961 c321961;
        if (continuation instanceof C321961) {
            c321961 = (C321961) continuation;
            int i = c321961.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c321961.label = i - Integer.MIN_VALUE;
            } else {
                c321961 = new C321961(continuation);
            }
        }
        Object objFlattenPositions = c321961.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c321961.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFlattenPositions);
            Request<FlattenPositionsRequestDto> request = new Request<>(flattenPositionsRequestDto, null, 2, null);
            c321961.label = 1;
            objFlattenPositions = FlattenPositions(request, c321961);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object FlattenPositions(Request<FlattenPositionsRequestDto> request, Continuation<? super Response<FlattenPositionsResponseDto>> continuation) {
        C321972 c321972;
        if (continuation instanceof C321972) {
            c321972 = (C321972) continuation;
            int i = c321972.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c321972.label = i - Integer.MIN_VALUE;
            } else {
                c321972 = new C321972(continuation);
            }
        }
        Object objFlattenPositions = c321972.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c321972.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFlattenPositions);
            CeresRetrofit ceresRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String account_id = request.getData().getAccount_id();
            FlattenPositionsRequestDto data = request.getData();
            c321972.label = 1;
            objFlattenPositions = ceresRetrofit.FlattenPositions(metadata, account_id, data, c321972);
            if (objFlattenPositions == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objFlattenPositions);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objFlattenPositions);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object ReplaceFuturesOrder(ReplaceFuturesOrderRequestDto replaceFuturesOrderRequestDto, Continuation<? super FuturesOrderDto> continuation) {
        C322481 c322481;
        if (continuation instanceof C322481) {
            c322481 = (C322481) continuation;
            int i = c322481.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c322481.label = i - Integer.MIN_VALUE;
            } else {
                c322481 = new C322481(continuation);
            }
        }
        Object objReplaceFuturesOrder = c322481.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c322481.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objReplaceFuturesOrder);
            Request<ReplaceFuturesOrderRequestDto> request = new Request<>(replaceFuturesOrderRequestDto, null, 2, null);
            c322481.label = 1;
            objReplaceFuturesOrder = ReplaceFuturesOrder(request, c322481);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object ReplaceFuturesOrder(Request<ReplaceFuturesOrderRequestDto> request, Continuation<? super Response<FuturesOrderDto>> continuation) {
        C322492 c322492;
        if (continuation instanceof C322492) {
            c322492 = (C322492) continuation;
            int i = c322492.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c322492.label = i - Integer.MIN_VALUE;
            } else {
                c322492 = new C322492(continuation);
            }
        }
        Object objReplaceFuturesOrder = c322492.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c322492.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objReplaceFuturesOrder);
            CeresRetrofit ceresRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String order_id = request.getData().getOrder_id();
            ReplaceFuturesOrderRequestDto data = request.getData();
            c322492.label = 1;
            objReplaceFuturesOrder = ceresRetrofit.ReplaceFuturesOrder(metadata, order_id, data, c322492);
            if (objReplaceFuturesOrder == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objReplaceFuturesOrder);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objReplaceFuturesOrder);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object ListManualCashCorrections(ListManualCashCorrectionsRequestDto listManualCashCorrectionsRequestDto, Continuation<? super ListManualCashCorrectionsResponseDto> continuation) {
        C322441 c322441;
        if (continuation instanceof C322441) {
            c322441 = (C322441) continuation;
            int i = c322441.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c322441.label = i - Integer.MIN_VALUE;
            } else {
                c322441 = new C322441(continuation);
            }
        }
        Object objListManualCashCorrections = c322441.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c322441.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objListManualCashCorrections);
            Request<ListManualCashCorrectionsRequestDto> request = new Request<>(listManualCashCorrectionsRequestDto, null, 2, null);
            c322441.label = 1;
            objListManualCashCorrections = ListManualCashCorrections(request, c322441);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object ListManualCashCorrections(Request<ListManualCashCorrectionsRequestDto> request, Continuation<? super Response<ListManualCashCorrectionsResponseDto>> continuation) {
        C322452 c322452;
        if (continuation instanceof C322452) {
            c322452 = (C322452) continuation;
            int i = c322452.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c322452.label = i - Integer.MIN_VALUE;
            } else {
                c322452 = new C322452(continuation);
            }
        }
        Object objListManualCashCorrections = c322452.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c322452.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objListManualCashCorrections);
            CeresRetrofit ceresRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String account_id = request.getData().getAccount_id();
            c322452.label = 1;
            objListManualCashCorrections = ceresRetrofit.ListManualCashCorrections(metadata, account_id, c322452);
            if (objListManualCashCorrections == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objListManualCashCorrections);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objListManualCashCorrections);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object MarkAttestationsSigned(MarkAttestationsSignedRequestDto markAttestationsSignedRequestDto, Continuation<? super MarkAttestationsSignedResponseDto> continuation) {
        C322461 c322461;
        if (continuation instanceof C322461) {
            c322461 = (C322461) continuation;
            int i = c322461.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c322461.label = i - Integer.MIN_VALUE;
            } else {
                c322461 = new C322461(continuation);
            }
        }
        Object objMarkAttestationsSigned = c322461.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c322461.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objMarkAttestationsSigned);
            Request<MarkAttestationsSignedRequestDto> request = new Request<>(markAttestationsSignedRequestDto, null, 2, null);
            c322461.label = 1;
            objMarkAttestationsSigned = MarkAttestationsSigned(request, c322461);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object MarkAttestationsSigned(Request<MarkAttestationsSignedRequestDto> request, Continuation<? super Response<MarkAttestationsSignedResponseDto>> continuation) {
        C322472 c322472;
        if (continuation instanceof C322472) {
            c322472 = (C322472) continuation;
            int i = c322472.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c322472.label = i - Integer.MIN_VALUE;
            } else {
                c322472 = new C322472(continuation);
            }
        }
        Object objMarkAttestationsSigned = c322472.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c322472.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objMarkAttestationsSigned);
            CeresRetrofit ceresRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            MarkAttestationsSignedRequestDto data = request.getData();
            c322472.label = 1;
            objMarkAttestationsSigned = ceresRetrofit.MarkAttestationsSigned(metadata, data, c322472);
            if (objMarkAttestationsSigned == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objMarkAttestationsSigned);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objMarkAttestationsSigned);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetUserSettings(GetUserSettingsRequestDto getUserSettingsRequestDto, Continuation<? super GetUserSettingsResponseDto> continuation) {
        C322421 c322421;
        if (continuation instanceof C322421) {
            c322421 = (C322421) continuation;
            int i = c322421.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c322421.label = i - Integer.MIN_VALUE;
            } else {
                c322421 = new C322421(continuation);
            }
        }
        Object objGetUserSettings = c322421.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c322421.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetUserSettings);
            Request<GetUserSettingsRequestDto> request = new Request<>(getUserSettingsRequestDto, null, 2, null);
            c322421.label = 1;
            objGetUserSettings = GetUserSettings(request, c322421);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetUserSettings(Request<GetUserSettingsRequestDto> request, Continuation<? super Response<GetUserSettingsResponseDto>> continuation) {
        C322432 c322432;
        if (continuation instanceof C322432) {
            c322432 = (C322432) continuation;
            int i = c322432.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c322432.label = i - Integer.MIN_VALUE;
            } else {
                c322432 = new C322432(continuation);
            }
        }
        Object objGetUserSettings = c322432.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c322432.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetUserSettings);
            CeresRetrofit ceresRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            c322432.label = 1;
            objGetUserSettings = ceresRetrofit.GetUserSettings(metadata, c322432);
            if (objGetUserSettings == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetUserSettings);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetUserSettings);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object UpdateUserSettings(UpdateUserSettingsRequestDto updateUserSettingsRequestDto, Continuation<? super UpdateUserSettingsResponseDto> continuation) {
        C322501 c322501;
        if (continuation instanceof C322501) {
            c322501 = (C322501) continuation;
            int i = c322501.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c322501.label = i - Integer.MIN_VALUE;
            } else {
                c322501 = new C322501(continuation);
            }
        }
        Object objUpdateUserSettings = c322501.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c322501.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objUpdateUserSettings);
            Request<UpdateUserSettingsRequestDto> request = new Request<>(updateUserSettingsRequestDto, null, 2, null);
            c322501.label = 1;
            objUpdateUserSettings = UpdateUserSettings(request, c322501);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object UpdateUserSettings(Request<UpdateUserSettingsRequestDto> request, Continuation<? super Response<UpdateUserSettingsResponseDto>> continuation) {
        C322512 c322512;
        if (continuation instanceof C322512) {
            c322512 = (C322512) continuation;
            int i = c322512.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c322512.label = i - Integer.MIN_VALUE;
            } else {
                c322512 = new C322512(continuation);
            }
        }
        Object objUpdateUserSettings = c322512.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c322512.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objUpdateUserSettings);
            CeresRetrofit ceresRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            UpdateUserSettingsRequestDto data = request.getData();
            c322512.label = 1;
            objUpdateUserSettings = ceresRetrofit.UpdateUserSettings(metadata, data, c322512);
            if (objUpdateUserSettings == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objUpdateUserSettings);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objUpdateUserSettings);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetFuturesIntervalPerformance(GetFuturesIntervalPerformanceRequestDto getFuturesIntervalPerformanceRequestDto, Continuation<? super GetFuturesIntervalPerformanceResponseDto> continuation) {
        C322241 c322241;
        if (continuation instanceof C322241) {
            c322241 = (C322241) continuation;
            int i = c322241.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c322241.label = i - Integer.MIN_VALUE;
            } else {
                c322241 = new C322241(continuation);
            }
        }
        Object objGetFuturesIntervalPerformance = c322241.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c322241.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetFuturesIntervalPerformance);
            Request<GetFuturesIntervalPerformanceRequestDto> request = new Request<>(getFuturesIntervalPerformanceRequestDto, null, 2, null);
            c322241.label = 1;
            objGetFuturesIntervalPerformance = GetFuturesIntervalPerformance(request, c322241);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.ceres.p284v1.Ceres
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object GetFuturesIntervalPerformance(Request<GetFuturesIntervalPerformanceRequestDto> request, Continuation<? super Response<GetFuturesIntervalPerformanceResponseDto>> continuation) {
        C322252 c322252;
        if (continuation instanceof C322252) {
            c322252 = (C322252) continuation;
            int i = c322252.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c322252.label = i - Integer.MIN_VALUE;
            } else {
                c322252 = new C322252(continuation);
            }
        }
        Object objGetFuturesIntervalPerformance = c322252.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c322252.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetFuturesIntervalPerformance);
            CeresRetrofit ceresRetrofit = this.retrofit;
            Map<String, String> metadata = request.getMetadata();
            String account_id = request.getData().getAccount_id();
            SpanDto span = request.getData().getSpan() != SpanDto.INSTANCE.getZeroValue() ? request.getData().getSpan() : null;
            c322252.label = 1;
            objGetFuturesIntervalPerformance = ceresRetrofit.GetFuturesIntervalPerformance(metadata, account_id, span, c322252);
            if (objGetFuturesIntervalPerformance == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGetFuturesIntervalPerformance);
        }
        return Response2.handleRetrofitResponse((retrofit2.Response) objGetFuturesIntervalPerformance);
    }
}
