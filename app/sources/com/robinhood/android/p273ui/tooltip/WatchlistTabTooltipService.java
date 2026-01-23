package com.robinhood.android.p273ui.tooltip;

import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.regiongate.WatchlistTabRegionGate;
import com.robinhood.models.p320db.Account;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.utils.Optional;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: WatchlistTabTooltipService.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B#\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\u0014\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u000bH\u0002J\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/ui/tooltip/WatchlistTabTooltipService;", "", "hasSeenTooltipPref", "Lcom/robinhood/prefs/BooleanPreference;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "<init>", "(Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/android/regiongate/RegionGateProvider;)V", "shouldShowTooltip", "Lkotlinx/coroutines/flow/Flow;", "", "streamAccount", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/db/Account;", "markTooltipSeen", "", "feature-tab-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class WatchlistTabTooltipService {
    public static final int $stable = 8;
    private final AccountProvider accountProvider;
    private final BooleanPreference hasSeenTooltipPref;
    private final RegionGateProvider regionGateProvider;

    public WatchlistTabTooltipService(@WatchlistTabTooltipModule2 BooleanPreference hasSeenTooltipPref, AccountProvider accountProvider, RegionGateProvider regionGateProvider) {
        Intrinsics.checkNotNullParameter(hasSeenTooltipPref, "hasSeenTooltipPref");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        this.hasSeenTooltipPref = hasSeenTooltipPref;
        this.accountProvider = accountProvider;
        this.regionGateProvider = regionGateProvider;
    }

    public final Flow<Boolean> shouldShowTooltip() {
        final Flow<Optional<Account>> flowStreamAccount = streamAccount();
        return FlowKt.distinctUntilChanged(FlowKt.combine(new Flow<Boolean>() { // from class: com.robinhood.android.ui.tooltip.WatchlistTabTooltipService$shouldShowTooltip$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.ui.tooltip.WatchlistTabTooltipService$shouldShowTooltip$$inlined$map$1$2 */
            public static final class C313302<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.ui.tooltip.WatchlistTabTooltipService$shouldShowTooltip$$inlined$map$1$2", m3645f = "WatchlistTabTooltipService.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.ui.tooltip.WatchlistTabTooltipService$shouldShowTooltip$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C313302.this.emit(null, this);
                    }
                }

                public C313302(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        Boolean boolBoxBoolean = boxing.boxBoolean(((Optional) obj).getOrNull() != null);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(boolBoxBoolean, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
                Object objCollect = flowStreamAccount.collect(new C313302(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, this.regionGateProvider.streamRegionGateStateFlow(WatchlistTabRegionGate.INSTANCE, false), FlowKt.onStart(Context7.buffer$default(RxConvert.asFlow(this.hasSeenTooltipPref.getChanges()), Integer.MAX_VALUE, null, 2, null), new WatchlistTabTooltipService2(this, null)), new C313311(null)));
    }

    /* compiled from: WatchlistTabTooltipService.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "", "hasAccount", "inRegionGate", "hasSeen"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.ui.tooltip.WatchlistTabTooltipService$shouldShowTooltip$1", m3645f = "WatchlistTabTooltipService.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.ui.tooltip.WatchlistTabTooltipService$shouldShowTooltip$1 */
    static final class C313311 extends ContinuationImpl7 implements Function4<Boolean, Boolean, Boolean, Continuation<? super Boolean>, Object> {
        /* synthetic */ boolean Z$0;
        /* synthetic */ boolean Z$1;
        /* synthetic */ boolean Z$2;
        int label;

        C313311(Continuation<? super C313311> continuation) {
            super(4, continuation);
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Boolean bool2, Boolean bool3, Continuation<? super Boolean> continuation) {
            return invoke(bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue(), continuation);
        }

        public final Object invoke(boolean z, boolean z2, boolean z3, Continuation<? super Boolean> continuation) {
            C313311 c313311 = new C313311(continuation);
            c313311.Z$0 = z;
            c313311.Z$1 = z2;
            c313311.Z$2 = z3;
            return c313311.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return boxing.boxBoolean(this.Z$0 && this.Z$1 && !this.Z$2);
        }
    }

    private final Flow<Optional<Account>> streamAccount() {
        return FlowKt.distinctUntilChanged(Context7.buffer$default(RxConvert.asFlow(this.accountProvider.streamIndividualAccountOptional()), Integer.MAX_VALUE, null, 2, null));
    }

    public final void markTooltipSeen() {
        this.hasSeenTooltipPref.set(true);
    }
}
