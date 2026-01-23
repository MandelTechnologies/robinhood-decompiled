package com.robinhood.android.cortex.store.asset;

import com.robinhood.android.cortex.models.asset.AssetDigest;
import com.robinhood.models.card.p311db.Card;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequencesKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Clock;
import p479j$.time.Instant;

/* compiled from: AssetDigestTimestamps.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0000*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/android/cortex/models/asset/AssetDigest$HasSignedAgreement;", "j$/time/Clock", Card.Icon.CLOCK, "j$/time/Instant", "getTimestampUpdateFlow", "(Lkotlinx/coroutines/flow/Flow;Lj$/time/Clock;)Lkotlinx/coroutines/flow/Flow;", "lib-store-cortex_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.cortex.store.asset.AssetDigestTimestampsKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class AssetDigestTimestamps {
    public static final Flow<Instant> getTimestampUpdateFlow(final Flow<AssetDigest.HasSignedAgreement> flow, Clock clock) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        Intrinsics.checkNotNullParameter(clock, "clock");
        return FlowKt.transformLatest(FlowKt.distinctUntilChanged(new Flow<Instant>() { // from class: com.robinhood.android.cortex.store.asset.AssetDigestTimestampsKt$getTimestampUpdateFlow$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.cortex.store.asset.AssetDigestTimestampsKt$getTimestampUpdateFlow$$inlined$map$1$2 */
            public static final class C121932<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.cortex.store.asset.AssetDigestTimestampsKt$getTimestampUpdateFlow$$inlined$map$1$2", m3645f = "AssetDigestTimestamps.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.cortex.store.asset.AssetDigestTimestampsKt$getTimestampUpdateFlow$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C121932.this.emit(null, this);
                    }
                }

                public C121932(FlowCollector flowCollector) {
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
                        AssetDigest.HasSignedAgreement hasSignedAgreement = (AssetDigest.HasSignedAgreement) obj;
                        Comparable comparableMaxOrThrow = SequencesKt.maxOrThrow(SequencesKt.plus(SequencesKt.sequenceOf(hasSignedAgreement.getUpdatedAt()), SequencesKt.map(CollectionsKt.asSequence(hasSignedAgreement.getDetail().getSources()), AssetDigestTimestamps2.INSTANCE)));
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(comparableMaxOrThrow, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super Instant> flowCollector, Continuation continuation) {
                Object objCollect = flow.collect(new C121932(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }), new C12192x20f9c6bd(null, clock));
    }
}
