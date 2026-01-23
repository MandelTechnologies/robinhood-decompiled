package com.robinhood.android.equitydetail.p123ui.about.p124v2;

import com.plaid.internal.EnumC7081g;
import com.robinhood.models.p320db.Instrument;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: AboutV2Duxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.about.v2.AboutV2Duxo$bind$1", m3645f = "AboutV2Duxo.kt", m3646l = {40}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.equitydetail.ui.about.v2.AboutV2Duxo$bind$1, reason: use source file name */
/* loaded from: classes3.dex */
final class AboutV2Duxo2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ UUID $instrumentUuid;
    final /* synthetic */ AboutV2ResourceStrings $resourceStrings;
    int label;
    final /* synthetic */ AboutV2Duxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AboutV2Duxo2(AboutV2Duxo aboutV2Duxo, UUID uuid, AboutV2ResourceStrings aboutV2ResourceStrings, Continuation<? super AboutV2Duxo2> continuation) {
        super(2, continuation);
        this.this$0 = aboutV2Duxo;
        this.$instrumentUuid = uuid;
        this.$resourceStrings = aboutV2ResourceStrings;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AboutV2Duxo2(this.this$0, this.$instrumentUuid, this.$resourceStrings, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AboutV2Duxo2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(this.this$0.instrumentStore.getInstrument(this.$instrumentUuid)), Integer.MAX_VALUE, null, 2, null);
            C153961 c153961 = new C153961(this.this$0, this.$resourceStrings, null);
            this.label = 1;
            if (FlowKt.collectLatest(flowBuffer$default, c153961, this) == coroutine_suspended) {
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
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "instrument", "Lcom/robinhood/models/db/Instrument;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.about.v2.AboutV2Duxo$bind$1$1", m3645f = "AboutV2Duxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equitydetail.ui.about.v2.AboutV2Duxo$bind$1$1 */
    static final class C153961 extends ContinuationImpl7 implements Function2<Instrument, Continuation<? super Unit>, Object> {
        final /* synthetic */ AboutV2ResourceStrings $resourceStrings;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AboutV2Duxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C153961(AboutV2Duxo aboutV2Duxo, AboutV2ResourceStrings aboutV2ResourceStrings, Continuation<? super C153961> continuation) {
            super(2, continuation);
            this.this$0 = aboutV2Duxo;
            this.$resourceStrings = aboutV2ResourceStrings;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C153961 c153961 = new C153961(this.this$0, this.$resourceStrings, continuation);
            c153961.L$0 = obj;
            return c153961;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Instrument instrument, Continuation<? super Unit> continuation) {
            return ((C153961) create(instrument, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: AboutV2Duxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitydetail/ui/about/v2/AboutV2DataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.about.v2.AboutV2Duxo$bind$1$1$1", m3645f = "AboutV2Duxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equitydetail.ui.about.v2.AboutV2Duxo$bind$1$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<AboutV2DataState, Continuation<? super AboutV2DataState>, Object> {
            final /* synthetic */ Instrument $instrument;
            final /* synthetic */ AboutV2ResourceStrings $resourceStrings;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(Instrument instrument, AboutV2ResourceStrings aboutV2ResourceStrings, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$instrument = instrument;
                this.$resourceStrings = aboutV2ResourceStrings;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$instrument, this.$resourceStrings, continuation);
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
                return AboutV2DataState.copy$default((AboutV2DataState) this.L$0, this.$instrument, null, null, null, this.$resourceStrings, false, null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE, null);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                this.this$0.applyMutation(new AnonymousClass1((Instrument) this.L$0, this.$resourceStrings, null));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
