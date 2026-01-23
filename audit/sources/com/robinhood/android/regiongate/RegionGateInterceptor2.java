package com.robinhood.android.regiongate;

import com.robinhood.android.regiongate.annotation.RequiresRegionGate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.coroutines.Await2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: RegionGateInterceptor.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "Lcom/robinhood/android/regiongate/RegionGate;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.regiongate.RegionGateInterceptor$intercept$disabledRegionGates$1", m3645f = "RegionGateInterceptor.kt", m3646l = {57}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.regiongate.RegionGateInterceptor$intercept$disabledRegionGates$1, reason: use source file name */
/* loaded from: classes5.dex */
final class RegionGateInterceptor2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super List<? extends RegionGate>>, Object> {
    final /* synthetic */ RequiresRegionGate $regionGateAnnotation;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RegionGateInterceptor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RegionGateInterceptor2(RequiresRegionGate requiresRegionGate, RegionGateInterceptor regionGateInterceptor, Continuation<? super RegionGateInterceptor2> continuation) {
        super(2, continuation);
        this.$regionGateAnnotation = requiresRegionGate;
        this.this$0 = regionGateInterceptor;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RegionGateInterceptor2 regionGateInterceptor2 = new RegionGateInterceptor2(this.$regionGateAnnotation, this.this$0, continuation);
        regionGateInterceptor2.L$0 = obj;
        return regionGateInterceptor2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends RegionGate>> continuation) {
        return ((RegionGateInterceptor2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            KClass[] orCreateKotlinClasses = Reflection.getOrCreateKotlinClasses(this.$regionGateAnnotation.regionGates());
            RegionGateInterceptor regionGateInterceptor = this.this$0;
            ArrayList arrayList = new ArrayList(orCreateKotlinClasses.length);
            for (KClass kClass : orCreateKotlinClasses) {
                Object objectInstance = kClass.getObjectInstance();
                Intrinsics.checkNotNull(objectInstance);
                arrayList.add(BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new RegionGateInterceptor3((RegionGate) objectInstance, regionGateInterceptor, null), 3, null));
            }
            this.label = 1;
            obj = Await2.awaitAll(arrayList, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : (Iterable) obj) {
            if (!((Boolean) ((Tuples2) obj2).component2()).booleanValue()) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add((RegionGate) ((Tuples2) it.next()).component1());
        }
        return arrayList3;
    }
}
