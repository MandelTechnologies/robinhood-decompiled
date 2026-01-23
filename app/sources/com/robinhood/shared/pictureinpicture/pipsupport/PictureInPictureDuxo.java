package com.robinhood.shared.pictureinpicture.pipsupport;

import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: PictureInPictureDuxo.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/shared/pictureinpicture/pipsupport/PictureInPictureDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/shared/pictureinpicture/pipsupport/PictureInPictureViewState;", "pictureInPictureStore", "Lcom/robinhood/shared/pictureinpicture/pipsupport/PictureInPictureStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/shared/pictureinpicture/pipsupport/PictureInPictureStore;Lcom/robinhood/android/udf/DuxoBundle;)V", "onCreate", "", "streamIsInIndexOptionsExperiment", "Lkotlinx/coroutines/flow/Flow;", "", "lib-pip-support_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class PictureInPictureDuxo extends BaseDuxo4<PictureInPictureViewState> {
    private final PictureInPictureStore pictureInPictureStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PictureInPictureDuxo(PictureInPictureStore pictureInPictureStore, DuxoBundle duxoBundle) {
        super(new PictureInPictureViewState(false, 1, null), duxoBundle);
        Intrinsics.checkNotNullParameter(pictureInPictureStore, "pictureInPictureStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.pictureInPictureStore = pictureInPictureStore;
    }

    /* compiled from: PictureInPictureDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.pictureinpicture.pipsupport.PictureInPictureDuxo$onCreate$1", m3645f = "PictureInPictureDuxo.kt", m3646l = {22}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.pictureinpicture.pipsupport.PictureInPictureDuxo$onCreate$1 */
    static final class C393711 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C393711(Continuation<? super C393711> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PictureInPictureDuxo.this.new C393711(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C393711) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: PictureInPictureDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "inExperiment", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.pictureinpicture.pipsupport.PictureInPictureDuxo$onCreate$1$1", m3645f = "PictureInPictureDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.pictureinpicture.pipsupport.PictureInPictureDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ PictureInPictureDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(PictureInPictureDuxo pictureInPictureDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = pictureInPictureDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                return invoke(bool.booleanValue(), continuation);
            }

            public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: PictureInPictureDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/pictureinpicture/pipsupport/PictureInPictureViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.pictureinpicture.pipsupport.PictureInPictureDuxo$onCreate$1$1$1", m3645f = "PictureInPictureDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.pictureinpicture.pipsupport.PictureInPictureDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C507351 extends ContinuationImpl7 implements Function2<PictureInPictureViewState, Continuation<? super PictureInPictureViewState>, Object> {
                final /* synthetic */ boolean $inExperiment;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C507351(boolean z, Continuation<? super C507351> continuation) {
                    super(2, continuation);
                    this.$inExperiment = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C507351(this.$inExperiment, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(PictureInPictureViewState pictureInPictureViewState, Continuation<? super PictureInPictureViewState> continuation) {
                    return ((C507351) create(pictureInPictureViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return new PictureInPictureViewState(this.$inExperiment);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C507351(this.Z$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowStreamIsInIndexOptionsExperiment = PictureInPictureDuxo.this.streamIsInIndexOptionsExperiment();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(PictureInPictureDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamIsInIndexOptionsExperiment, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        getLifecycleScope().repeatOnLifecycle(LifecycleState.CREATED, new C393711(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow<Boolean> streamIsInIndexOptionsExperiment() {
        return this.pictureInPictureStore.streamIsInIndexOptionsPipExperiment();
    }
}
