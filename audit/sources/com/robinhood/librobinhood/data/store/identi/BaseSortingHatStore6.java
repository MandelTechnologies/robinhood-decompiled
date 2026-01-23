package com.robinhood.librobinhood.data.store.identi;

import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.store.StoreBundle;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Duration;

/* compiled from: BaseSortingHatStore.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "", "lastUpdatedAt", "", "args", "Lcom/robinhood/librobinhood/data/store/identi/SortingHatQueryArgs;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.identi.BaseSortingHatStore$getSortingHatExperienceWithDynamicStaleEndpoint$3", m3645f = "BaseSortingHatStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.identi.BaseSortingHatStore$getSortingHatExperienceWithDynamicStaleEndpoint$3, reason: use source file name */
/* loaded from: classes13.dex */
final class BaseSortingHatStore6 extends ContinuationImpl7 implements Function3<Long, SortingHatQueryArgs, Continuation<? super Boolean>, Object> {
    final /* synthetic */ StoreBundle $storeBundle;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ BaseSortingHatStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BaseSortingHatStore6(BaseSortingHatStore baseSortingHatStore, StoreBundle storeBundle, Continuation<? super BaseSortingHatStore6> continuation) {
        super(3, continuation);
        this.this$0 = baseSortingHatStore;
        this.$storeBundle = storeBundle;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Long l, SortingHatQueryArgs sortingHatQueryArgs, Continuation<? super Boolean> continuation) {
        BaseSortingHatStore6 baseSortingHatStore6 = new BaseSortingHatStore6(this.this$0, this.$storeBundle, continuation);
        baseSortingHatStore6.L$0 = l;
        baseSortingHatStore6.L$1 = sortingHatQueryArgs;
        return baseSortingHatStore6.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        boolean zBooleanValue;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            Long l = (Long) this.L$0;
            if (Intrinsics.areEqual(this.this$0.sortingHatRecordInvestedMap.get((SortingHatQueryArgs) this.L$1), boxing.boxBoolean(true))) {
                Duration durationOfMinutes = Duration.ofMinutes(30L);
                Intrinsics.checkNotNullExpressionValue(durationOfMinutes, "ofMinutes(...)");
                zBooleanValue = new DefaultStaleDecider(durationOfMinutes, this.$storeBundle.getClock()).invoke(l).booleanValue();
            } else {
                Duration durationOfMinutes2 = Duration.ofMinutes(1L);
                Intrinsics.checkNotNullExpressionValue(durationOfMinutes2, "ofMinutes(...)");
                zBooleanValue = new DefaultStaleDecider(durationOfMinutes2, this.$storeBundle.getClock()).invoke(l).booleanValue();
            }
            return boxing.boxBoolean(zBooleanValue);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
