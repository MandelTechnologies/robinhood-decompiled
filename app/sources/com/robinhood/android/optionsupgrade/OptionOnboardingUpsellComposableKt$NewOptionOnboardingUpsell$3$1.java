package com.robinhood.android.optionsupgrade;

import androidx.compose.runtime.SnapshotState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: OptionOnboardingUpsellComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.optionsupgrade.OptionOnboardingUpsellComposableKt$NewOptionOnboardingUpsell$3$1", m3645f = "OptionOnboardingUpsellComposable.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes11.dex */
final class OptionOnboardingUpsellComposableKt$NewOptionOnboardingUpsell$3$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CoroutineScope $coroutineScope;
    final /* synthetic */ SnapshotState<Boolean> $isBottomBarVisible$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OptionOnboardingUpsellComposableKt$NewOptionOnboardingUpsell$3$1(CoroutineScope coroutineScope, SnapshotState<Boolean> snapshotState, Continuation<? super OptionOnboardingUpsellComposableKt$NewOptionOnboardingUpsell$3$1> continuation) {
        super(2, continuation);
        this.$coroutineScope = coroutineScope;
        this.$isBottomBarVisible$delegate = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OptionOnboardingUpsellComposableKt$NewOptionOnboardingUpsell$3$1(this.$coroutineScope, this.$isBottomBarVisible$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OptionOnboardingUpsellComposableKt$NewOptionOnboardingUpsell$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: OptionOnboardingUpsellComposable.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionsupgrade.OptionOnboardingUpsellComposableKt$NewOptionOnboardingUpsell$3$1$1", m3645f = "OptionOnboardingUpsellComposable.kt", m3646l = {224}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingUpsellComposableKt$NewOptionOnboardingUpsell$3$1$1 */
    static final class C250651 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ SnapshotState<Boolean> $isBottomBarVisible$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C250651(SnapshotState<Boolean> snapshotState, Continuation<? super C250651> continuation) {
            super(2, continuation);
            this.$isBottomBarVisible$delegate = snapshotState;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C250651(this.$isBottomBarVisible$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C250651) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (DelayKt.delay(2250L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            OptionOnboardingUpsellComposableKt.NewOptionOnboardingUpsell_ocSOEb8$lambda$7(this.$isBottomBarVisible$delegate, true);
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            BuildersKt__Builders_commonKt.launch$default(this.$coroutineScope, null, null, new C250651(this.$isBottomBarVisible$delegate, null), 3, null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
