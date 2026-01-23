package com.robinhood.librobinhood.data.store;

import com.plaid.internal.EnumC7081g;
import com.robinhood.models.crypto.p314db.CryptoAccountSwitcherLocation;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function4;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: CryptoAccountSwitcherStore.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "", "rhs", "isSelectable", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoAccountSwitcherStore$streamRhsNumber$1$1", m3645f = "CryptoAccountSwitcherStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE, 123, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, 136}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.CryptoAccountSwitcherStore$streamRhsNumber$1$1, reason: use source file name */
/* loaded from: classes13.dex */
final class CryptoAccountSwitcherStore2 extends ContinuationImpl7 implements Function4<FlowCollector<? super String>, String, Boolean, Continuation<? super Unit>, Object> {
    final /* synthetic */ Flow<String> $defaultNumberFlow;
    final /* synthetic */ CryptoAccountSwitcherLocation $location;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ CryptoAccountSwitcherStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoAccountSwitcherStore2(Flow<String> flow, CryptoAccountSwitcherStore cryptoAccountSwitcherStore, CryptoAccountSwitcherLocation cryptoAccountSwitcherLocation, Continuation<? super CryptoAccountSwitcherStore2> continuation) {
        super(4, continuation);
        this.$defaultNumberFlow = flow;
        this.this$0 = cryptoAccountSwitcherStore;
        this.$location = cryptoAccountSwitcherLocation;
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super String> flowCollector, String str, Boolean bool, Continuation<? super Unit> continuation) {
        return invoke(flowCollector, str, bool.booleanValue(), continuation);
    }

    public final Object invoke(FlowCollector<? super String> flowCollector, String str, boolean z, Continuation<? super Unit> continuation) {
        CryptoAccountSwitcherStore2 cryptoAccountSwitcherStore2 = new CryptoAccountSwitcherStore2(this.$defaultNumberFlow, this.this$0, this.$location, continuation);
        cryptoAccountSwitcherStore2.L$0 = flowCollector;
        cryptoAccountSwitcherStore2.L$1 = str;
        cryptoAccountSwitcherStore2.Z$0 = z;
        return cryptoAccountSwitcherStore2.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
    
        if (r1.emit(null, r8) == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0080, code lost:
    
        if (r1.emit(r9, r8) == r0) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0070  */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        String str;
        String str2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    flowCollector = (FlowCollector) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    str = (String) obj;
                    this.L$0 = str;
                    this.label = 3;
                    if (flowCollector.emit(str, this) != coroutine_suspended) {
                        str2 = str;
                        if (str2 != null) {
                        }
                    }
                    return coroutine_suspended;
                }
                if (i == 3) {
                    str2 = (String) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    if (str2 != null) {
                        this.this$0.mo15792setSelectedAccountNumber(this.$location, str2);
                    }
                } else if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            flowCollector = (FlowCollector) this.L$0;
            String str3 = (String) this.L$1;
            boolean z = this.Z$0;
            if (str3 != null) {
                if (!z) {
                    Flow flowTake = FlowKt.take(this.$defaultNumberFlow, 1);
                    this.L$0 = flowCollector;
                    this.label = 2;
                    obj = FlowKt.firstOrNull(flowTake, this);
                    if (obj != coroutine_suspended) {
                        str = (String) obj;
                        this.L$0 = str;
                        this.label = 3;
                        if (flowCollector.emit(str, this) != coroutine_suspended) {
                        }
                    }
                } else {
                    this.L$0 = null;
                    this.label = 4;
                }
                return coroutine_suspended;
            }
            this.L$0 = null;
            this.label = 1;
        }
        return Unit.INSTANCE;
    }
}
