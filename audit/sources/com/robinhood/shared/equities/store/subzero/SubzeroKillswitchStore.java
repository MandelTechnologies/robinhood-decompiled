package com.robinhood.shared.equities.store.subzero;

import bonfire.proto.idl.equities.p034v1.EquitiesService;
import bonfire.proto.idl.equities.p034v1.GetKillswitchesRequestDto;
import bonfire.proto.idl.equities.p034v1.GetKillswitchesResponseDto;
import bonfire.proto.idl.equities.p034v1.Killswitch;
import bonfire.proto.idl.equities.p034v1.KillswitchDto;
import bonfire.proto.idl.equities.p034v1.KillswitchName;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlin.time.Duration;
import kotlin.time.Duration3;
import kotlin.time.DurationUnitJvm;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: SubzeroKillswitchStore.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fJ\u0016\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0086@¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/shared/equities/store/subzero/SubzeroKillswitchStore;", "Lcom/robinhood/store/Store;", "equitiesService", "Lbonfire/proto/idl/equities/v1/EquitiesService;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lbonfire/proto/idl/equities/v1/EquitiesService;Lcom/robinhood/store/StoreBundle;)V", "streamSubzeroDisabled", "Lkotlinx/coroutines/flow/Flow;", "", "symbol", "", "shouldDisableSubzeroForKillswitchOrBlacklist", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-store-subzero_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class SubzeroKillswitchStore extends Store {
    private final EquitiesService equitiesService;

    /* compiled from: SubzeroKillswitchStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.equities.store.subzero.SubzeroKillswitchStore", m3645f = "SubzeroKillswitchStore.kt", m3646l = {31}, m3647m = "shouldDisableSubzeroForKillswitchOrBlacklist")
    /* renamed from: com.robinhood.shared.equities.store.subzero.SubzeroKillswitchStore$shouldDisableSubzeroForKillswitchOrBlacklist$1 */
    static final class C389481 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C389481(Continuation<? super C389481> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SubzeroKillswitchStore.this.shouldDisableSubzeroForKillswitchOrBlacklist(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubzeroKillswitchStore(EquitiesService equitiesService, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(equitiesService, "equitiesService");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.equitiesService = equitiesService;
    }

    /* compiled from: SubzeroKillswitchStore.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.equities.store.subzero.SubzeroKillswitchStore$streamSubzeroDisabled$1", m3645f = "SubzeroKillswitchStore.kt", m3646l = {24, 24, 25}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.equities.store.subzero.SubzeroKillswitchStore$streamSubzeroDisabled$1 */
    static final class C389491 extends ContinuationImpl7 implements Function2<FlowCollector<? super Boolean>, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $symbol;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C389491(String str, Continuation<? super C389491> continuation) {
            super(2, continuation);
            this.$symbol = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C389491 c389491 = SubzeroKillswitchStore.this.new C389491(this.$symbol, continuation);
            c389491.L$0 = obj;
            return c389491;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super Boolean> flowCollector, Continuation<? super Unit> continuation) {
            return ((C389491) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x006f -> B:13:0x003d). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            FlowCollector flowCollector;
            long duration;
            FlowCollector flowCollector2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                flowCollector = (FlowCollector) this.L$0;
            } else {
                if (i == 1) {
                    flowCollector = (FlowCollector) this.L$1;
                    flowCollector2 = (FlowCollector) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    this.L$0 = flowCollector2;
                    this.L$1 = null;
                    this.label = 2;
                    if (flowCollector.emit(obj, this) != coroutine_suspended) {
                        flowCollector = flowCollector2;
                        Duration.Companion companion = Duration.INSTANCE;
                        duration = Duration3.toDuration(5, DurationUnitJvm.SECONDS);
                        this.L$0 = flowCollector;
                        this.label = 3;
                        if (DelayKt.m28786delayVtjQ1oo(duration, this) != coroutine_suspended) {
                        }
                    }
                    return coroutine_suspended;
                }
                if (i == 2) {
                    flowCollector = (FlowCollector) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    Duration.Companion companion2 = Duration.INSTANCE;
                    duration = Duration3.toDuration(5, DurationUnitJvm.SECONDS);
                    this.L$0 = flowCollector;
                    this.label = 3;
                    if (DelayKt.m28786delayVtjQ1oo(duration, this) != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                flowCollector = (FlowCollector) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            SubzeroKillswitchStore subzeroKillswitchStore = SubzeroKillswitchStore.this;
            String str = this.$symbol;
            this.L$0 = flowCollector;
            this.L$1 = flowCollector;
            this.label = 1;
            obj = subzeroKillswitchStore.shouldDisableSubzeroForKillswitchOrBlacklist(str, this);
            if (obj != coroutine_suspended) {
                flowCollector2 = flowCollector;
                this.L$0 = flowCollector2;
                this.L$1 = null;
                this.label = 2;
                if (flowCollector.emit(obj, this) != coroutine_suspended) {
                }
            }
            return coroutine_suspended;
        }
    }

    public final Flow<Boolean> streamSubzeroDisabled(String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return FlowKt.flow(new C389491(symbol, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object shouldDisableSubzeroForKillswitchOrBlacklist(String str, Continuation<? super Boolean> continuation) {
        C389481 c389481;
        Boolean boolBoxBoolean;
        Object next;
        Object next2;
        String servar_value;
        if (continuation instanceof C389481) {
            c389481 = (C389481) continuation;
            int i = c389481.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c389481.label = i - Integer.MIN_VALUE;
            } else {
                c389481 = new C389481(continuation);
            }
        }
        Object objGetKillswitches = c389481.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c389481.label;
        boolean z = true;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objGetKillswitches);
            EquitiesService equitiesService = this.equitiesService;
            GetKillswitchesRequestDto getKillswitchesRequestDto = new GetKillswitchesRequestDto();
            c389481.L$0 = str;
            c389481.label = 1;
            objGetKillswitches = equitiesService.GetKillswitches(getKillswitchesRequestDto, c389481);
            if (objGetKillswitches == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) c389481.L$0;
            ResultKt.throwOnFailure(objGetKillswitches);
        }
        List<KillswitchDto> killswitches = ((GetKillswitchesResponseDto) objGetKillswitches).getKillswitches();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(killswitches, 10));
        Iterator<T> it = killswitches.iterator();
        while (it.hasNext()) {
            arrayList.add(((KillswitchDto) it.next()).toProto());
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            boolBoxBoolean = null;
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (((Killswitch) next).getKillswitch_name() == KillswitchName.EQUITY_SHORT_SELLING_KILLSWITCH) {
                break;
            }
        }
        Killswitch killswitch = (Killswitch) next;
        boolean z2 = Boolean.parseBoolean(killswitch != null ? killswitch.getServar_value() : null);
        Iterator it3 = arrayList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it3.next();
            if (((Killswitch) next2).getKillswitch_name() == KillswitchName.EQUITY_SELL_SHORT_INSTRUMENT_BLACKLIST) {
                break;
            }
        }
        Killswitch killswitch2 = (Killswitch) next2;
        if (killswitch2 != null && (servar_value = killswitch2.getServar_value()) != null) {
            boolBoxBoolean = boxing.boxBoolean(StringsKt.contains$default((CharSequence) servar_value, (CharSequence) str, false, 2, (Object) null));
        }
        if (!z2 && !Intrinsics.areEqual(boolBoxBoolean, boxing.boxBoolean(true))) {
            z = false;
        }
        return boxing.boxBoolean(z);
    }
}
