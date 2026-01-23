package com.robinhood.android.configurationvitals;

import dagger.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: Lazy.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0007H\u0001¢\u0006\u0002\b\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0003*\u00020\u0004H\n¨\u0006\u0005"}, m3636d2 = {"<anonymous>", "T", "Lkotlin/jvm/internal/EnhancedNullability;", "", "Lkotlinx/coroutines/CoroutineScope;", "com/robinhood/utils/dagger/LazyKt$coGet$2"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.utils.dagger.LazyKt$coGet$2", m3645f = "Lazy.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class ConfigurationVitalsManager$handleVitals$$inlined$coGet$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ConfigurationVitalsPreference>, Object> {
    final /* synthetic */ Lazy $this_coGet;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfigurationVitalsManager$handleVitals$$inlined$coGet$1(Lazy lazy, Continuation continuation) {
        super(2, continuation);
        this.$this_coGet = lazy;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ConfigurationVitalsManager$handleVitals$$inlined$coGet$1(this.$this_coGet, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ConfigurationVitalsPreference> continuation) {
        return ((ConfigurationVitalsManager$handleVitals$$inlined$coGet$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return this.$this_coGet.get();
    }
}
