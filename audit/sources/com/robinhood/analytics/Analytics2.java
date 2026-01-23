package com.robinhood.analytics;

import com.robinhood.analytics.dao.SharedLegacyEventDao;
import com.robinhood.analytics.models.LegacyEvent;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.threeten.extra.Days;
import p479j$.time.Instant;
import p479j$.time.temporal.TemporalAmount;

/* compiled from: Analytics.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.analytics.Analytics$uploadAnalytics$2$1", m3645f = "Analytics.kt", m3646l = {808, 812, 822, 825}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.analytics.Analytics$uploadAnalytics$2$1, reason: use source file name */
/* loaded from: classes24.dex */
final class Analytics2 extends ContinuationImpl7 implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ Ref.BooleanRef $hasFailure;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ Analytics this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Analytics2(Analytics analytics, Ref.BooleanRef booleanRef, Continuation<? super Analytics2> continuation) {
        super(1, continuation);
        this.this$0 = analytics;
        this.$hasFailure = booleanRef;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new Analytics2(this.this$0, this.$hasFailure, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((Analytics2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0085, code lost:
    
        if (r12.deleteOldItems(r1, r11) == r0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0127, code lost:
    
        if (r12.delete(r9, r11) != r0) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0107 A[Catch: all -> 0x0027, LOOP:0: B:38:0x0101->B:40:0x0107, LOOP_END, TryCatch #0 {all -> 0x0027, blocks: (B:9:0x0022, B:44:0x012a, B:34:0x00e4, B:37:0x00f5, B:38:0x0101, B:40:0x0107, B:41:0x0115, B:47:0x013a, B:48:0x0141, B:16:0x003e), top: B:58:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0165  */
    /* JADX WARN: Type inference failed for: r12v15, types: [T, java.util.UUID] */
    /* JADX WARN: Type inference failed for: r1v16, types: [T, j$.time.Instant] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v11, types: [T, java.util.UUID] */
    /* JADX WARN: Type inference failed for: r9v3, types: [T, j$.time.Instant] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0127 -> B:44:0x012a). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean zIsNetworkRelated;
        Ref.ObjectRef objectRef;
        Ref.ObjectRef objectRef2;
        Iterable iterable;
        Iterator it;
        Ref.ObjectRef objectRef3;
        List list;
        Ref.ObjectRef objectRef4;
        Object obj2;
        ?? r1;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
        } finally {
            if (zIsNetworkRelated) {
                objectRef4 = objectRef;
                if (r1.size() != 25) {
                }
            }
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            SharedLegacyEventDao sharedLegacyEventDao = this.this$0.dao;
            Instant instantNow = Instant.now(this.this$0.getAnalyticsBundle().getClock());
            Intrinsics.checkNotNullExpressionValue(instantNow, "now(...)");
            Instant instantMinus = instantNow.minus((TemporalAmount) Days.m3991of(1));
            Intrinsics.checkNotNullExpressionValue(instantMinus, "minus(...)");
            this.label = 1;
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else if (i == 2) {
            objectRef3 = (Ref.ObjectRef) this.L$1;
            Ref.ObjectRef objectRef5 = (Ref.ObjectRef) this.L$0;
            ResultKt.throwOnFailure(obj);
            objectRef = objectRef5;
            objectRef2 = objectRef3;
            list = (List) obj;
            if (!list.isEmpty()) {
            }
        } else {
            if (i != 3) {
                if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ?? r12 = (List) this.L$2;
                objectRef2 = (Ref.ObjectRef) this.L$1;
                objectRef = (Ref.ObjectRef) this.L$0;
                ResultKt.throwOnFailure(obj);
                i = r12;
                r1 = i;
                if (!this.this$0.triggerFlow.tryEmit(Unit.INSTANCE)) {
                    throw new IllegalStateException("Check failed.");
                }
                objectRef4 = objectRef;
                if (r1.size() != 25) {
                    objectRef3 = objectRef2;
                    SharedLegacyEventDao sharedLegacyEventDao2 = this.this$0.dao;
                    Object element = objectRef4.element;
                    Intrinsics.checkNotNullExpressionValue(element, "element");
                    UUID uuid = (UUID) objectRef3.element;
                    this.L$0 = objectRef4;
                    this.L$1 = objectRef3;
                    this.L$2 = null;
                    this.label = 2;
                    obj2 = sharedLegacyEventDao2.get(25, (Instant) element, uuid, this);
                    if (obj2 != coroutine_suspended) {
                        objectRef = objectRef4;
                        obj = obj2;
                        objectRef2 = objectRef3;
                        list = (List) obj;
                        if (!list.isEmpty()) {
                            return Unit.INSTANCE;
                        }
                        LegacyEvent legacyEvent = (LegacyEvent) CollectionsKt.last(list);
                        objectRef.element = legacyEvent.getTimestamp();
                        objectRef2.element = legacyEvent.getId();
                        Analytics analytics = this.this$0;
                        this.L$0 = objectRef;
                        this.L$1 = objectRef2;
                        this.L$2 = list;
                        this.label = 3;
                        Object objUpload = analytics.upload(list, this);
                        iterable = list;
                        if (objUpload != coroutine_suspended) {
                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                            it = iterable.iterator();
                            while (it.hasNext()) {
                                linkedHashSet.add(((LegacyEvent) it.next()).getId());
                            }
                            SharedLegacyEventDao sharedLegacyEventDao3 = this.this$0.dao;
                            this.L$0 = objectRef;
                            this.L$1 = objectRef2;
                            this.L$2 = iterable;
                            this.label = 4;
                            i = iterable;
                        }
                    }
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
            List list2 = (List) this.L$2;
            objectRef2 = (Ref.ObjectRef) this.L$1;
            objectRef = (Ref.ObjectRef) this.L$0;
            ResultKt.throwOnFailure(obj);
            iterable = list2;
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            it = iterable.iterator();
            while (it.hasNext()) {
            }
            SharedLegacyEventDao sharedLegacyEventDao32 = this.this$0.dao;
            this.L$0 = objectRef;
            this.L$1 = objectRef2;
            this.L$2 = iterable;
            this.label = 4;
            i = iterable;
        }
        objectRef4 = new Ref.ObjectRef();
        objectRef4.element = Instant.EPOCH;
        objectRef3 = new Ref.ObjectRef();
        objectRef3.element = new UUID(0L, 0L);
        SharedLegacyEventDao sharedLegacyEventDao22 = this.this$0.dao;
        Object element2 = objectRef4.element;
        Intrinsics.checkNotNullExpressionValue(element2, "element");
        UUID uuid2 = (UUID) objectRef3.element;
        this.L$0 = objectRef4;
        this.L$1 = objectRef3;
        this.L$2 = null;
        this.label = 2;
        obj2 = sharedLegacyEventDao22.get(25, (Instant) element2, uuid2, this);
        if (obj2 != coroutine_suspended) {
        }
        return coroutine_suspended;
    }
}
