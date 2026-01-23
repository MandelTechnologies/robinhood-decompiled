package com.robinhood.android.equitydetail.p123ui.about.p124v2;

import com.robinhood.models.p320db.EtpDetails;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: AboutV2Duxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.about.v2.AboutV2Duxo$bind$4", m3645f = "AboutV2Duxo.kt", m3646l = {73}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.equitydetail.ui.about.v2.AboutV2Duxo$bind$4, reason: use source file name */
/* loaded from: classes3.dex */
final class AboutV2Duxo5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ UUID $instrumentUuid;
    int label;
    final /* synthetic */ AboutV2Duxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AboutV2Duxo5(AboutV2Duxo aboutV2Duxo, UUID uuid, Continuation<? super AboutV2Duxo5> continuation) {
        super(2, continuation);
        this.this$0 = aboutV2Duxo;
        this.$instrumentUuid = uuid;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AboutV2Duxo5(this.this$0, this.$instrumentUuid, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AboutV2Duxo5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Flow<EtpDetails> flowAsFlow = this.this$0.etpDetailsStore.getStreamEtpDetails().asFlow(this.$instrumentUuid);
            C153991 c153991 = new C153991(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(flowAsFlow, c153991, this) == coroutine_suspended) {
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

    /* compiled from: AboutV2Duxo.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "etpDetails", "Lcom/robinhood/models/db/EtpDetails;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.about.v2.AboutV2Duxo$bind$4$1", m3645f = "AboutV2Duxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equitydetail.ui.about.v2.AboutV2Duxo$bind$4$1 */
    static final class C153991 extends ContinuationImpl7 implements Function2<EtpDetails, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AboutV2Duxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C153991(AboutV2Duxo aboutV2Duxo, Continuation<? super C153991> continuation) {
            super(2, continuation);
            this.this$0 = aboutV2Duxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C153991 c153991 = new C153991(this.this$0, continuation);
            c153991.L$0 = obj;
            return c153991;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EtpDetails etpDetails, Continuation<? super Unit> continuation) {
            return ((C153991) create(etpDetails, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: AboutV2Duxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitydetail/ui/about/v2/AboutV2DataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.about.v2.AboutV2Duxo$bind$4$1$1", m3645f = "AboutV2Duxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equitydetail.ui.about.v2.AboutV2Duxo$bind$4$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<AboutV2DataState, Continuation<? super AboutV2DataState>, Object> {
            final /* synthetic */ EtpDetails $etpDetails;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(EtpDetails etpDetails, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$etpDetails = etpDetails;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$etpDetails, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(AboutV2DataState aboutV2DataState, Continuation<? super AboutV2DataState> continuation) {
                return ((AnonymousClass1) create(aboutV2DataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return AboutV2DataState.copy$default((AboutV2DataState) this.L$0, null, null, this.$etpDetails, null, null, false, null, false, false, 507, null);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                this.this$0.applyMutation(new AnonymousClass1((EtpDetails) this.L$0, null));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
