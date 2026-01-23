package com.robinhood.android.futures.onboarding.p145ui.p146uk;

import com.robinhood.android.futures.onboarding.p145ui.p146uk.FuturesUkCheckEligibilityFragment;
import com.robinhood.android.models.futures.p192ui.SuitabilityResult;
import com.robinhood.android.models.futures.p192ui.SuitabilityResult2;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.ceres.p284v1.EvaluateCheckpointSuitabilityResponseDto;
import com.robinhood.ceres.p284v1.GetCheckpointSuitabilityResponseDto;
import com.robinhood.ceres.p284v1.SuitabilityCheckpointDto;
import com.robinhood.store.futures.FuturesAccountStore;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: FuturesUkCheckEligibilityDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.futures.onboarding.ui.uk.FuturesUkCheckEligibilityDuxo$onCreate$1$1", m3645f = "FuturesUkCheckEligibilityDuxo.kt", m3646l = {49, 66, 70, 74}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.futures.onboarding.ui.uk.FuturesUkCheckEligibilityDuxo$onCreate$1$1, reason: use source file name */
/* loaded from: classes3.dex */
final class FuturesUkCheckEligibilityDuxo3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ FuturesUkCheckEligibilityDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FuturesUkCheckEligibilityDuxo3(FuturesUkCheckEligibilityDuxo futuresUkCheckEligibilityDuxo, Continuation<? super FuturesUkCheckEligibilityDuxo3> continuation) {
        super(2, continuation);
        this.this$0 = futuresUkCheckEligibilityDuxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FuturesUkCheckEligibilityDuxo3(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FuturesUkCheckEligibilityDuxo3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x009d, code lost:
    
        if (r10 == r0) goto L60;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0165  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x009d -> B:25:0x00a1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00b2 -> B:18:0x0081). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Ref.ObjectRef objectRef;
        SuitabilityCheckpointDto suitabilityCheckpointDto;
        Ref.ObjectRef objectRef2;
        FuturesUkCheckEligibilityDuxo futuresUkCheckEligibilityDuxo;
        Iterator it;
        Ref.ObjectRef objectRef3;
        Ref.ObjectRef objectRef4;
        SuitabilityCheckpointDto suitabilityCheckpointDto2;
        SuitabilityCheckpointDto suitabilityCheckpointDtoNextCheckpoint;
        SuitabilityResult result;
        Ref.ObjectRef objectRef5;
        SuitabilityResult suitabilityResult;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        boolean z = false;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            SuitabilityCheckpointDto checkpoint = ((FuturesUkCheckEligibilityFragment.Args) FuturesUkCheckEligibilityDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).getCheckpoint();
            if (checkpoint == null) {
                List listListOf = CollectionsKt.listOf((Object[]) new SuitabilityCheckpointDto[]{SuitabilityCheckpointDto.INVESTOR_PROFILE, SuitabilityCheckpointDto.EXPERIENCE, SuitabilityCheckpointDto.KNOWLEDGE});
                futuresUkCheckEligibilityDuxo = this.this$0;
                it = listListOf.iterator();
                if (it.hasNext()) {
                }
            } else {
                objectRef = new Ref.ObjectRef();
                FuturesAccountStore futuresAccountStore = this.this$0.futuresAccountStore;
                this.L$0 = checkpoint;
                this.L$1 = objectRef;
                this.L$2 = objectRef;
                this.label = 2;
                Object objEvaluateSuitability = futuresAccountStore.evaluateSuitability(checkpoint, this);
                if (objEvaluateSuitability != coroutine_suspended) {
                    suitabilityCheckpointDto = checkpoint;
                    obj = objEvaluateSuitability;
                    objectRef2 = objectRef;
                }
                return coroutine_suspended;
            }
        } else if (i == 1) {
            it = (Iterator) this.L$1;
            futuresUkCheckEligibilityDuxo = (FuturesUkCheckEligibilityDuxo) this.L$0;
            ResultKt.throwOnFailure(obj);
            GetCheckpointSuitabilityResponseDto getCheckpointSuitabilityResponseDto = (GetCheckpointSuitabilityResponseDto) obj;
            boolean z2 = getCheckpointSuitabilityResponseDto != null && (getCheckpointSuitabilityResponseDto.is_eligible() || getCheckpointSuitabilityResponseDto.getCan_retry());
            if (it.hasNext()) {
                SuitabilityCheckpointDto suitabilityCheckpointDto3 = (SuitabilityCheckpointDto) it.next();
                if (z2) {
                    FuturesAccountStore futuresAccountStore2 = futuresUkCheckEligibilityDuxo.futuresAccountStore;
                    this.L$0 = futuresUkCheckEligibilityDuxo;
                    this.L$1 = it;
                    this.label = 1;
                    obj = futuresAccountStore2.checkSuitability(suitabilityCheckpointDto3, this);
                }
                if (it.hasNext()) {
                    if (!z2) {
                        this.this$0.applyMutation(new C174221(null));
                    } else {
                        this.this$0.submit(new ProceedToNextStepEvent(false, true));
                    }
                    return Unit.INSTANCE;
                }
            }
        } else {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    objectRef5 = (Ref.ObjectRef) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    GetCheckpointSuitabilityResponseDto getCheckpointSuitabilityResponseDto2 = (GetCheckpointSuitabilityResponseDto) obj;
                    result = getCheckpointSuitabilityResponseDto2 == null ? SuitabilityResult2.toResult(getCheckpointSuitabilityResponseDto2) : null;
                    objectRef3 = objectRef5;
                    suitabilityResult = (SuitabilityResult) objectRef3.element;
                    if (suitabilityResult != null && suitabilityResult.isEligible()) {
                        FuturesUkCheckEligibilityDuxo futuresUkCheckEligibilityDuxo2 = this.this$0;
                        boolean z3 = result == null && result.isEligible();
                        if (result != null && !result.getCanRetry()) {
                            z = true;
                        }
                        futuresUkCheckEligibilityDuxo2.submit(new ProceedToNextStepEvent(z3, !z));
                    }
                    this.this$0.applyMutation(new C174232(objectRef3, result, null));
                    return Unit.INSTANCE;
                }
                objectRef4 = (Ref.ObjectRef) this.L$2;
                objectRef3 = (Ref.ObjectRef) this.L$1;
                suitabilityCheckpointDto2 = (SuitabilityCheckpointDto) this.L$0;
                ResultKt.throwOnFailure(obj);
                GetCheckpointSuitabilityResponseDto getCheckpointSuitabilityResponseDto3 = (GetCheckpointSuitabilityResponseDto) obj;
                objectRef4.element = getCheckpointSuitabilityResponseDto3 == null ? SuitabilityResult2.toResult(getCheckpointSuitabilityResponseDto3) : 0;
                suitabilityCheckpointDto = suitabilityCheckpointDto2;
                suitabilityCheckpointDtoNextCheckpoint = SuitabilityCheckpointDtos.nextCheckpoint(suitabilityCheckpointDto);
                if (suitabilityCheckpointDtoNextCheckpoint != null) {
                    FuturesAccountStore futuresAccountStore3 = this.this$0.futuresAccountStore;
                    this.L$0 = objectRef3;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 4;
                    obj = futuresAccountStore3.checkSuitability(suitabilityCheckpointDtoNextCheckpoint, this);
                    if (obj != coroutine_suspended) {
                        objectRef5 = objectRef3;
                        GetCheckpointSuitabilityResponseDto getCheckpointSuitabilityResponseDto22 = (GetCheckpointSuitabilityResponseDto) obj;
                        if (getCheckpointSuitabilityResponseDto22 == null) {
                        }
                        objectRef3 = objectRef5;
                        suitabilityResult = (SuitabilityResult) objectRef3.element;
                        if (suitabilityResult != null) {
                            FuturesUkCheckEligibilityDuxo futuresUkCheckEligibilityDuxo22 = this.this$0;
                            if (result == null) {
                                if (result != null) {
                                    z = true;
                                }
                                futuresUkCheckEligibilityDuxo22.submit(new ProceedToNextStepEvent(z3, !z));
                            }
                            return Unit.INSTANCE;
                        }
                        this.this$0.applyMutation(new C174232(objectRef3, result, null));
                        return Unit.INSTANCE;
                    }
                    return coroutine_suspended;
                }
                result = null;
                suitabilityResult = (SuitabilityResult) objectRef3.element;
                if (suitabilityResult != null) {
                }
                this.this$0.applyMutation(new C174232(objectRef3, result, null));
                return Unit.INSTANCE;
            }
            objectRef = (Ref.ObjectRef) this.L$2;
            objectRef2 = (Ref.ObjectRef) this.L$1;
            suitabilityCheckpointDto = (SuitabilityCheckpointDto) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        EvaluateCheckpointSuitabilityResponseDto evaluateCheckpointSuitabilityResponseDto = (EvaluateCheckpointSuitabilityResponseDto) obj;
        objectRef.element = evaluateCheckpointSuitabilityResponseDto != null ? SuitabilityResult2.toResult(evaluateCheckpointSuitabilityResponseDto) : 0;
        if (objectRef2.element == 0) {
            FuturesAccountStore futuresAccountStore4 = this.this$0.futuresAccountStore;
            this.L$0 = suitabilityCheckpointDto;
            this.L$1 = objectRef2;
            this.L$2 = objectRef2;
            this.label = 3;
            obj = futuresAccountStore4.checkSuitability(suitabilityCheckpointDto, this);
            if (obj != coroutine_suspended) {
                objectRef4 = objectRef2;
                objectRef3 = objectRef4;
                suitabilityCheckpointDto2 = suitabilityCheckpointDto;
                GetCheckpointSuitabilityResponseDto getCheckpointSuitabilityResponseDto32 = (GetCheckpointSuitabilityResponseDto) obj;
                objectRef4.element = getCheckpointSuitabilityResponseDto32 == null ? SuitabilityResult2.toResult(getCheckpointSuitabilityResponseDto32) : 0;
                suitabilityCheckpointDto = suitabilityCheckpointDto2;
                suitabilityCheckpointDtoNextCheckpoint = SuitabilityCheckpointDtos.nextCheckpoint(suitabilityCheckpointDto);
                if (suitabilityCheckpointDtoNextCheckpoint != null) {
                }
            }
            return coroutine_suspended;
        }
        objectRef3 = objectRef2;
        suitabilityCheckpointDtoNextCheckpoint = SuitabilityCheckpointDtos.nextCheckpoint(suitabilityCheckpointDto);
        if (suitabilityCheckpointDtoNextCheckpoint != null) {
        }
    }

    /* compiled from: FuturesUkCheckEligibilityDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/onboarding/ui/uk/FuturesUkCheckEligibilityDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.onboarding.ui.uk.FuturesUkCheckEligibilityDuxo$onCreate$1$1$1", m3645f = "FuturesUkCheckEligibilityDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.onboarding.ui.uk.FuturesUkCheckEligibilityDuxo$onCreate$1$1$1 */
    static final class C174221 extends ContinuationImpl7 implements Function2<FuturesUkCheckEligibilityDataState, Continuation<? super FuturesUkCheckEligibilityDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C174221(Continuation<? super C174221> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C174221 c174221 = new C174221(continuation);
            c174221.L$0 = obj;
            return c174221;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FuturesUkCheckEligibilityDataState futuresUkCheckEligibilityDataState, Continuation<? super FuturesUkCheckEligibilityDataState> continuation) {
            return ((C174221) create(futuresUkCheckEligibilityDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return FuturesUkCheckEligibilityDataState.copy$default((FuturesUkCheckEligibilityDataState) this.L$0, null, new SuitabilityResult(false, false), null, 5, null);
        }
    }

    /* compiled from: FuturesUkCheckEligibilityDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/futures/onboarding/ui/uk/FuturesUkCheckEligibilityDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.onboarding.ui.uk.FuturesUkCheckEligibilityDuxo$onCreate$1$1$2", m3645f = "FuturesUkCheckEligibilityDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.futures.onboarding.ui.uk.FuturesUkCheckEligibilityDuxo$onCreate$1$1$2 */
    static final class C174232 extends ContinuationImpl7 implements Function2<FuturesUkCheckEligibilityDataState, Continuation<? super FuturesUkCheckEligibilityDataState>, Object> {
        final /* synthetic */ Ref.ObjectRef<SuitabilityResult> $currentSuitability;
        final /* synthetic */ SuitabilityResult $nextSuitability;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C174232(Ref.ObjectRef<SuitabilityResult> objectRef, SuitabilityResult suitabilityResult, Continuation<? super C174232> continuation) {
            super(2, continuation);
            this.$currentSuitability = objectRef;
            this.$nextSuitability = suitabilityResult;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C174232 c174232 = new C174232(this.$currentSuitability, this.$nextSuitability, continuation);
            c174232.L$0 = obj;
            return c174232;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FuturesUkCheckEligibilityDataState futuresUkCheckEligibilityDataState, Continuation<? super FuturesUkCheckEligibilityDataState> continuation) {
            return ((C174232) create(futuresUkCheckEligibilityDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            FuturesUkCheckEligibilityDataState futuresUkCheckEligibilityDataState = (FuturesUkCheckEligibilityDataState) this.L$0;
            SuitabilityResult currentCheckpointSuitability = this.$currentSuitability.element;
            if (currentCheckpointSuitability == null) {
                currentCheckpointSuitability = futuresUkCheckEligibilityDataState.getCurrentCheckpointSuitability();
            }
            SuitabilityResult suitabilityResult = currentCheckpointSuitability;
            SuitabilityResult nextCheckpointSuitability = this.$nextSuitability;
            if (nextCheckpointSuitability == null) {
                nextCheckpointSuitability = futuresUkCheckEligibilityDataState.getNextCheckpointSuitability();
            }
            return FuturesUkCheckEligibilityDataState.copy$default(futuresUkCheckEligibilityDataState, null, suitabilityResult, nextCheckpointSuitability, 1, null);
        }
    }
}
