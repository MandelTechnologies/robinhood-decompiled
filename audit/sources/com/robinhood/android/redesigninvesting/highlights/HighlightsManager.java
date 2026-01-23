package com.robinhood.android.redesigninvesting.highlights;

import com.robinhood.android.microgramsdui.MicrogramManager;
import com.robinhood.android.microgramsdui.MicrogramManager2;
import com.robinhood.android.redesigninvesting.experiments.RedesignInvestingExperimentStore;
import com.robinhood.android.redesigninvesting.highlights.models.HighlightCard;
import com.robinhood.android.redesigninvesting.highlights.models.HighlightCard2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import microgram.android.MicrogramLaunchId;
import microgram.android.RemoteMicrogramApplication;
import microgram.contracts.invest_tab_highlights.proto.p494v1.HighlightCardDto;
import microgram.contracts.invest_tab_highlights.proto.p494v1.HighlightTypeDto;
import microgram.contracts.invest_tab_highlights.proto.p494v1.InvestTabHighlightsService;
import microgram.contracts.invest_tab_highlights.proto.p494v1.StreamHighlightRequestDto;
import microgram.contracts.invest_tab_highlights.proto.p494v1.StreamHighlightResponseDto;
import microgram.contracts.invest_tab_highlights.proto.p494v1.StreamHighlightsRequestDto;
import microgram.contracts.invest_tab_highlights.proto.p494v1.StreamHighlightsResponseDto;

/* compiled from: HighlightsManager.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\"\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000f2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0013J$\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u000f2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/redesigninvesting/highlights/HighlightsManager;", "", "microgramManager", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "experimentStore", "Lcom/robinhood/android/redesigninvesting/experiments/RedesignInvestingExperimentStore;", "<init>", "(Lcom/robinhood/android/microgramsdui/MicrogramManager;Lcom/robinhood/android/redesigninvesting/experiments/RedesignInvestingExperimentStore;)V", "microgramInstance", "Lcom/robinhood/android/microgramsdui/MicrogramInstance;", "lifecycleScope", "Lkotlinx/coroutines/CoroutineScope;", "client", "Lmicrogram/contracts/invest_tab_highlights/proto/v1/InvestTabHighlightsService;", "streamHighlights", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/robinhood/android/redesigninvesting/highlights/models/HighlightCard;", "accountNumber", "", "streamHighlight", "id", "type", "Lmicrogram/contracts/invest_tab_highlights/proto/v1/HighlightTypeDto;", "lib-highlights_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class HighlightsManager {
    private final RedesignInvestingExperimentStore experimentStore;
    private final MicrogramManager microgramManager;

    public HighlightsManager(MicrogramManager microgramManager, RedesignInvestingExperimentStore experimentStore) {
        Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
        Intrinsics.checkNotNullParameter(experimentStore, "experimentStore");
        this.microgramManager = microgramManager;
        this.experimentStore = experimentStore;
    }

    private final MicrogramManager2 microgramInstance(CoroutineScope lifecycleScope) {
        return MicrogramManager.DefaultImpls.m16549getInstancemoChb0s$default(this.microgramManager, lifecycleScope, new MicrogramLaunchId(new RemoteMicrogramApplication("app-invest-tab-highlights", null, 2, null), null, 2, null), null, 4, null);
    }

    private final InvestTabHighlightsService client(CoroutineScope lifecycleScope) {
        return (InvestTabHighlightsService) microgramInstance(lifecycleScope).getComponent().getServiceLocator().getClient(InvestTabHighlightsService.class);
    }

    public final Flow<List<HighlightCard>> streamHighlights(CoroutineScope lifecycleScope, String accountNumber) {
        Intrinsics.checkNotNullParameter(lifecycleScope, "lifecycleScope");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        final Flow<StreamHighlightsResponseDto> flowStreamHighlights = client(lifecycleScope).StreamHighlights(new StreamHighlightsRequestDto(accountNumber));
        return FlowKt.transformLatest(new Flow<List<? extends HighlightCard>>() { // from class: com.robinhood.android.redesigninvesting.highlights.HighlightsManager$streamHighlights$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.redesigninvesting.highlights.HighlightsManager$streamHighlights$$inlined$map$1$2 */
            public static final class C264802<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.redesigninvesting.highlights.HighlightsManager$streamHighlights$$inlined$map$1$2", m3645f = "HighlightsManager.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.redesigninvesting.highlights.HighlightsManager$streamHighlights$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C264802.this.emit(null, this);
                    }
                }

                public C264802(FlowCollector flowCollector) {
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
                        List<HighlightCardDto> highlight_cards = ((StreamHighlightsResponseDto) obj).getHighlight_cards();
                        ArrayList arrayList = new ArrayList();
                        Iterator<T> it = highlight_cards.iterator();
                        while (it.hasNext()) {
                            HighlightCard uiModel = HighlightCard2.toUiModel((HighlightCardDto) it.next());
                            if (uiModel != null) {
                                arrayList.add(uiModel);
                            }
                        }
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(arrayList, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super List<? extends HighlightCard>> flowCollector, Continuation continuation) {
                Object objCollect = flowStreamHighlights.collect(new C264802(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, new HighlightsManager$streamHighlights$$inlined$flatMapLatest$1(null, this));
    }

    public final Flow<HighlightCard> streamHighlight(CoroutineScope lifecycleScope, String id, HighlightTypeDto type2) {
        Intrinsics.checkNotNullParameter(lifecycleScope, "lifecycleScope");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(type2, "type");
        final Flow<StreamHighlightResponseDto> flowStreamHighlight = client(lifecycleScope).StreamHighlight(new StreamHighlightRequestDto(id, type2));
        return new Flow<HighlightCard>() { // from class: com.robinhood.android.redesigninvesting.highlights.HighlightsManager$streamHighlight$$inlined$mapNotNull$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.redesigninvesting.highlights.HighlightsManager$streamHighlight$$inlined$mapNotNull$1$2 */
            public static final class C264792<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.redesigninvesting.highlights.HighlightsManager$streamHighlight$$inlined$mapNotNull$1$2", m3645f = "HighlightsManager.kt", m3646l = {52}, m3647m = "emit")
                /* renamed from: com.robinhood.android.redesigninvesting.highlights.HighlightsManager$streamHighlight$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                        return C264792.this.emit(null, this);
                    }
                }

                public C264792(FlowCollector flowCollector) {
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
                        HighlightCardDto card = ((StreamHighlightResponseDto) obj).getCard();
                        HighlightCard uiModel = card != null ? HighlightCard2.toUiModel(card) : null;
                        if (uiModel != null) {
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(uiModel, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
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
            public Object collect(FlowCollector<? super HighlightCard> flowCollector, Continuation continuation) {
                Object objCollect = flowStreamHighlight.collect(new C264792(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }
}
