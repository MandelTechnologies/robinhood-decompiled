package com.robinhood.android.libdesignsystem.serverui.experimental.compose.screener;

import androidx.lifecycle.ViewModel;
import com.robinhood.coroutines.flow.ErrorHandling3;
import com.robinhood.coroutines.p287rx.RxScheduler;
import com.robinhood.models.p320db.Quote;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import io.reactivex.Scheduler;
import io.reactivex.schedulers.Schedulers;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;
import p479j$.time.Duration;

/* compiled from: SduiPollableScreenerItemsViewModel.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J,\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000eJ\b\u0010\u0010\u001a\u00020\u0011H\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/screener/SduiPollableScreenerItemsViewModel;", "Landroidx/lifecycle/ViewModel;", "quoteProvider", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/screener/QuoteProvider;", "<init>", "(Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/screener/QuoteProvider;)V", "scheduler", "Lio/reactivex/Scheduler;", "pollQuote", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/screener/SduiPollableViewState;", "component", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "instrumentId", "", "defaultColumnValue", "onCleared", "", "lib-sdui_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class SduiPollableScreenerItemsViewModel extends ViewModel {
    public static final int $stable = 8;
    private final SduiPollableScreenerItemsViewModel2 quoteProvider;
    private final Scheduler scheduler;

    public SduiPollableScreenerItemsViewModel(SduiPollableScreenerItemsViewModel2 quoteProvider) {
        Intrinsics.checkNotNullParameter(quoteProvider, "quoteProvider");
        this.quoteProvider = quoteProvider;
        Scheduler schedulerFrom = Schedulers.from(Executors.newFixedThreadPool(50));
        Intrinsics.checkNotNullExpressionValue(schedulerFrom, "from(...)");
        this.scheduler = schedulerFrom;
    }

    public static /* synthetic */ Flow pollQuote$default(SduiPollableScreenerItemsViewModel sduiPollableScreenerItemsViewModel, UIComponent uIComponent, String str, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = "";
        }
        return sduiPollableScreenerItemsViewModel.pollQuote(uIComponent, str, str2);
    }

    public final Flow<SduiPollableViewState> pollQuote(final UIComponent<?> component, String instrumentId, final String defaultColumnValue) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(defaultColumnValue, "defaultColumnValue");
        Flow flowCancellable = FlowKt.cancellable(Context7.buffer$default(RxConvert.asFlow(this.quoteProvider.streamQuote(instrumentId)), Integer.MAX_VALUE, null, 2, null));
        Duration durationOfSeconds = Duration.ofSeconds(10L);
        Intrinsics.checkNotNullExpressionValue(durationOfSeconds, "ofSeconds(...)");
        final Flow flowIgnoreNetworkExceptions = ErrorHandling3.ignoreNetworkExceptions(flowCancellable, durationOfSeconds);
        return FlowKt.flowOn(new Flow<SduiPollableViewState>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.screener.SduiPollableScreenerItemsViewModel$pollQuote$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.screener.SduiPollableScreenerItemsViewModel$pollQuote$$inlined$map$1$2 */
            public static final class C208002<T> implements FlowCollector {
                final /* synthetic */ UIComponent $component$inlined;
                final /* synthetic */ String $defaultColumnValue$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.libdesignsystem.serverui.experimental.compose.screener.SduiPollableScreenerItemsViewModel$pollQuote$$inlined$map$1$2", m3645f = "SduiPollableScreenerItemsViewModel.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.screener.SduiPollableScreenerItemsViewModel$pollQuote$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C208002.this.emit(null, this);
                    }
                }

                public C208002(FlowCollector flowCollector, UIComponent uIComponent, String str) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$component$inlined = uIComponent;
                    this.$defaultColumnValue$inlined = str;
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
                        SduiPollableViewState sduiPollableViewState = new SduiPollableViewState((Quote) obj, this.$component$inlined, this.$defaultColumnValue$inlined);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(sduiPollableViewState, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super SduiPollableViewState> flowCollector, Continuation continuation) {
                Object objCollect = flowIgnoreNetworkExceptions.collect(new C208002(flowCollector, component, defaultColumnValue), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, RxScheduler.asCoroutineDispatcher(this.scheduler));
    }

    @Override // androidx.lifecycle.ViewModel
    protected void onCleared() {
        this.scheduler.shutdown();
        super.onCleared();
    }
}
