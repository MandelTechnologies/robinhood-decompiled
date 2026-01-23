package com.robinhood.android.common.views.futures;

import android.view.View;
import com.robinhood.android.common.data.prefs.ViewModePref;
import com.robinhood.android.common.udf.ViewDuxo;
import com.robinhood.android.common.util.SecurityViewMode;
import com.robinhood.android.futures.charts.FuturesChartResult;
import com.robinhood.android.futures.charts.FuturesChartsServiceManager;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesMarginRequirement;
import com.robinhood.android.models.futures.arsenal.p188db.UiFuturesContract;
import com.robinhood.android.models.futures.marketdata.p191db.FuturesClosePrices;
import com.robinhood.android.models.futures.marketdata.p191db.FuturesQuote;
import com.robinhood.android.models.futures.p189db.UiFuturesPosition;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.prefs.StringPreference;
import com.robinhood.store.futures.FuturesPositionStore;
import com.robinhood.store.futures.arsenal.FuturesContractStore;
import com.robinhood.store.futures.marketdata.FuturesMarketDataStore;
import com.robinhood.store.futures.marketdata.FuturesQuoteStore;
import io.reactivex.Scheduler;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: FuturesRowViewDuxo.kt */
@Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BK\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0001\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ2\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010#\u001a\u00020\u001aJ\u0010\u0010$\u001a\u00020\u00182\b\u0010%\u001a\u0004\u0018\u00010&J\b\u0010'\u001a\u00020\u0018H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/common/views/futures/FuturesRowViewDuxo;", "Lcom/robinhood/android/common/udf/ViewDuxo;", "Lcom/robinhood/android/common/views/futures/FuturesRowViewState;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "futuresContractStore", "Lcom/robinhood/store/futures/arsenal/FuturesContractStore;", "futuresMarketDataStore", "Lcom/robinhood/store/futures/marketdata/FuturesMarketDataStore;", "futuresPositionStore", "Lcom/robinhood/store/futures/FuturesPositionStore;", "futuresQuoteStore", "Lcom/robinhood/store/futures/marketdata/FuturesQuoteStore;", "viewModePreference", "Lcom/robinhood/prefs/StringPreference;", "futuresChartsServiceManager", "Lcom/robinhood/android/futures/charts/FuturesChartsServiceManager;", "hostView", "Landroid/view/View;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/store/futures/arsenal/FuturesContractStore;Lcom/robinhood/store/futures/marketdata/FuturesMarketDataStore;Lcom/robinhood/store/futures/FuturesPositionStore;Lcom/robinhood/store/futures/marketdata/FuturesQuoteStore;Lcom/robinhood/prefs/StringPreference;Lcom/robinhood/android/futures/charts/FuturesChartsServiceManager;Landroid/view/View;)V", "getViewModePreference", "()Lcom/robinhood/prefs/StringPreference;", "setInvertNameAndSymbol", "", "invertNameAndSymbol", "", "setContractData", "contractId", "Ljava/util/UUID;", "name", "", "symbol", "position", "Lcom/robinhood/android/models/futures/db/UiFuturesPosition;", "showSymbolInPositionInfo", "updateViewMode", "viewMode", "Lcom/robinhood/android/common/util/SecurityViewMode;", "onResume", "feature-lib-instrument-row_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class FuturesRowViewDuxo extends ViewDuxo<FuturesRowViewState> {
    public static final int $stable = 8;
    private final AccountProvider accountProvider;
    private final FuturesChartsServiceManager futuresChartsServiceManager;
    private final FuturesContractStore futuresContractStore;
    private final FuturesMarketDataStore futuresMarketDataStore;
    private final FuturesPositionStore futuresPositionStore;
    private final FuturesQuoteStore futuresQuoteStore;
    private final StringPreference viewModePreference;

    public final StringPreference getViewModePreference() {
        return this.viewModePreference;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FuturesRowViewDuxo(AccountProvider accountProvider, FuturesContractStore futuresContractStore, FuturesMarketDataStore futuresMarketDataStore, FuturesPositionStore futuresPositionStore, FuturesQuoteStore futuresQuoteStore, @ViewModePref StringPreference viewModePreference, FuturesChartsServiceManager futuresChartsServiceManager, View hostView) {
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(futuresContractStore, "futuresContractStore");
        Intrinsics.checkNotNullParameter(futuresMarketDataStore, "futuresMarketDataStore");
        Intrinsics.checkNotNullParameter(futuresPositionStore, "futuresPositionStore");
        Intrinsics.checkNotNullParameter(futuresQuoteStore, "futuresQuoteStore");
        Intrinsics.checkNotNullParameter(viewModePreference, "viewModePreference");
        Intrinsics.checkNotNullParameter(futuresChartsServiceManager, "futuresChartsServiceManager");
        Intrinsics.checkNotNullParameter(hostView, "hostView");
        String str = viewModePreference.get();
        if (str != null) {
            Scheduler scheduler = null;
            super(hostView, new FuturesRowViewState(null, null, null, false, null, null, null, null, null, null, SecurityViewMode.valueOf(str), false, 3071, null), scheduler, 4, null);
            this.accountProvider = accountProvider;
            this.futuresContractStore = futuresContractStore;
            this.futuresMarketDataStore = futuresMarketDataStore;
            this.futuresPositionStore = futuresPositionStore;
            this.futuresQuoteStore = futuresQuoteStore;
            this.viewModePreference = viewModePreference;
            this.futuresChartsServiceManager = futuresChartsServiceManager;
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void setInvertNameAndSymbol(final boolean invertNameAndSymbol) {
        applyMutation(new Function1() { // from class: com.robinhood.android.common.views.futures.FuturesRowViewDuxo$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesRowViewDuxo.setInvertNameAndSymbol$lambda$0(invertNameAndSymbol, (FuturesRowViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FuturesRowViewState setInvertNameAndSymbol$lambda$0(boolean z, FuturesRowViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return FuturesRowViewState.copy$default(applyMutation, null, null, null, z, null, null, null, null, null, null, null, false, 4087, null);
    }

    public static /* synthetic */ void setContractData$default(FuturesRowViewDuxo futuresRowViewDuxo, UUID uuid, String str, String str2, UiFuturesPosition uiFuturesPosition, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            uiFuturesPosition = null;
        }
        futuresRowViewDuxo.setContractData(uuid, str, str2, uiFuturesPosition, z);
    }

    public final void setContractData(final UUID contractId, final String name, final String symbol, final UiFuturesPosition position, final boolean showSymbolInPositionInfo) {
        Intrinsics.checkNotNullParameter(contractId, "contractId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        applyMutation(new Function1() { // from class: com.robinhood.android.common.views.futures.FuturesRowViewDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesRowViewDuxo.setContractData$lambda$1(contractId, name, symbol, position, showSymbolInPositionInfo, (FuturesRowViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FuturesRowViewState setContractData$lambda$1(UUID uuid, String str, String str2, UiFuturesPosition uiFuturesPosition, boolean z, FuturesRowViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        if (Intrinsics.areEqual(applyMutation.getContractId(), uuid)) {
            return applyMutation;
        }
        return new FuturesRowViewState(uuid, str, str2, applyMutation.getInvertNameAndSymbol(), null, uiFuturesPosition, null, null, null, null, applyMutation.getViewMode(), z, 976, null);
    }

    public final void updateViewMode(final SecurityViewMode viewMode) {
        applyMutation(new Function1() { // from class: com.robinhood.android.common.views.futures.FuturesRowViewDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesRowViewDuxo.updateViewMode$lambda$2(viewMode, this, (FuturesRowViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FuturesRowViewState updateViewMode$lambda$2(SecurityViewMode securityViewMode, FuturesRowViewDuxo futuresRowViewDuxo, FuturesRowViewState applyMutation) {
        SecurityViewMode securityViewModeValueOf;
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        if (securityViewMode == null) {
            String str = futuresRowViewDuxo.viewModePreference.get();
            if (str == null) {
                throw new IllegalStateException("Required value was null.");
            }
            securityViewModeValueOf = SecurityViewMode.valueOf(str);
        } else {
            securityViewModeValueOf = securityViewMode;
        }
        return FuturesRowViewState.copy$default(applyMutation, null, null, null, false, null, null, null, null, null, null, securityViewModeValueOf, false, 3071, null);
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onResume() {
        super.onResume();
        final StateFlow<FuturesRowViewState> statesFlow = getStatesFlow();
        Flow flowFilterNotNull = FlowKt.filterNotNull(FlowKt.distinctUntilChanged(new Flow<UUID>() { // from class: com.robinhood.android.common.views.futures.FuturesRowViewDuxo$onResume$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.common.views.futures.FuturesRowViewDuxo$onResume$$inlined$map$1$2 */
            public static final class C119142<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.common.views.futures.FuturesRowViewDuxo$onResume$$inlined$map$1$2", m3645f = "FuturesRowViewDuxo.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.common.views.futures.FuturesRowViewDuxo$onResume$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C119142.this.emit(null, this);
                    }
                }

                public C119142(FlowCollector flowCollector) {
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
                        UUID contractId = ((FuturesRowViewState) obj).getContractId();
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(contractId, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super UUID> flowCollector, Continuation continuation) {
                Object objCollect = statesFlow.collect(new C119142(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }));
        LifecycleHost.DefaultImpls.bind$default(this, getRxFactory().convertToObservable(FlowKt.transformLatest(flowFilterNotNull, new FuturesRowViewDuxo$onResume$$inlined$flatMapLatest$1(null, this))), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.views.futures.FuturesRowViewDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesRowViewDuxo.onResume$lambda$7(this.f$0, (UiFuturesContract) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, getRxFactory().convertToObservable(FlowKt.transformLatest(flowFilterNotNull, new FuturesRowViewDuxo$onResume$$inlined$flatMapLatest$2(null, this.futuresQuoteStore))), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.views.futures.FuturesRowViewDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesRowViewDuxo.onResume$lambda$10(this.f$0, (FuturesQuote) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, getRxFactory().convertToObservable(FlowKt.transformLatest(flowFilterNotNull, new FuturesRowViewDuxo$onResume$$inlined$flatMapLatest$3(null, this))), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.views.futures.FuturesRowViewDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesRowViewDuxo.onResume$lambda$14(this.f$0, (UiFuturesPosition) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, getRxFactory().convertToObservable(FlowKt.transformLatest(flowFilterNotNull, new FuturesRowViewDuxo$onResume$$inlined$flatMapLatest$4(null, this.futuresMarketDataStore))), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.views.futures.FuturesRowViewDuxo$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesRowViewDuxo.onResume$lambda$17(this.f$0, (FuturesClosePrices) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, getRxFactory().convertToObservable(FlowKt.transformLatest(flowFilterNotNull, new FuturesRowViewDuxo$onResume$$inlined$flatMapLatest$5(null, this))), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.views.futures.FuturesRowViewDuxo$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesRowViewDuxo.onResume$lambda$22(this.f$0, (FuturesMarginRequirement) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, asObservable(FlowKt.transformLatest(flowFilterNotNull, new FuturesRowViewDuxo$onResume$$inlined$flatMapLatest$6(null, this))), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.views.futures.FuturesRowViewDuxo$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesRowViewDuxo.onResume$lambda$25(this.f$0, (Result) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$7(FuturesRowViewDuxo futuresRowViewDuxo, final UiFuturesContract contract) {
        Intrinsics.checkNotNullParameter(contract, "contract");
        futuresRowViewDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.common.views.futures.FuturesRowViewDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesRowViewDuxo.onResume$lambda$7$lambda$6(contract, (FuturesRowViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FuturesRowViewState onResume$lambda$7$lambda$6(UiFuturesContract uiFuturesContract, FuturesRowViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return FuturesRowViewState.copy$default(applyMutation, null, null, null, false, uiFuturesContract, null, null, null, null, null, null, false, 4079, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$10(FuturesRowViewDuxo futuresRowViewDuxo, final FuturesQuote quote) {
        Intrinsics.checkNotNullParameter(quote, "quote");
        futuresRowViewDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.common.views.futures.FuturesRowViewDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesRowViewDuxo.onResume$lambda$10$lambda$9(quote, (FuturesRowViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FuturesRowViewState onResume$lambda$10$lambda$9(FuturesQuote futuresQuote, FuturesRowViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return FuturesRowViewState.copy$default(applyMutation, null, null, null, false, null, null, futuresQuote, null, null, null, null, false, 4031, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$14(FuturesRowViewDuxo futuresRowViewDuxo, final UiFuturesPosition position) {
        Intrinsics.checkNotNullParameter(position, "position");
        futuresRowViewDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.common.views.futures.FuturesRowViewDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesRowViewDuxo.onResume$lambda$14$lambda$13(position, (FuturesRowViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FuturesRowViewState onResume$lambda$14$lambda$13(UiFuturesPosition uiFuturesPosition, FuturesRowViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return FuturesRowViewState.copy$default(applyMutation, null, null, null, false, null, uiFuturesPosition, null, null, null, null, null, false, 4063, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$17(FuturesRowViewDuxo futuresRowViewDuxo, final FuturesClosePrices closePrices) {
        Intrinsics.checkNotNullParameter(closePrices, "closePrices");
        futuresRowViewDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.common.views.futures.FuturesRowViewDuxo$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesRowViewDuxo.onResume$lambda$17$lambda$16(closePrices, (FuturesRowViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FuturesRowViewState onResume$lambda$17$lambda$16(FuturesClosePrices futuresClosePrices, FuturesRowViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return FuturesRowViewState.copy$default(applyMutation, null, null, null, false, null, null, null, futuresClosePrices, null, null, null, false, 3967, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$22(FuturesRowViewDuxo futuresRowViewDuxo, final FuturesMarginRequirement marginRequirement) {
        Intrinsics.checkNotNullParameter(marginRequirement, "marginRequirement");
        futuresRowViewDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.common.views.futures.FuturesRowViewDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesRowViewDuxo.onResume$lambda$22$lambda$21(marginRequirement, (FuturesRowViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FuturesRowViewState onResume$lambda$22$lambda$21(FuturesMarginRequirement futuresMarginRequirement, FuturesRowViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return FuturesRowViewState.copy$default(applyMutation, null, null, null, false, null, null, null, null, futuresMarginRequirement, null, null, false, 3839, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$25(FuturesRowViewDuxo futuresRowViewDuxo, final Result result) {
        futuresRowViewDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.common.views.futures.FuturesRowViewDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesRowViewDuxo.onResume$lambda$25$lambda$24(result, (FuturesRowViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FuturesRowViewState onResume$lambda$25$lambda$24(Result result, FuturesRowViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Object value = result.getValue();
        if (Result.m28555isFailureimpl(value)) {
            value = null;
        }
        FuturesChartResult futuresChartResult = (FuturesChartResult) value;
        return FuturesRowViewState.copy$default(applyMutation, null, null, null, false, null, null, null, null, null, futuresChartResult != null ? futuresChartResult.getChart() : null, null, false, 3583, null);
    }
}
