package com.robinhood.equities.eventupdates;

import androidx.lifecycle.ViewModel2;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.arsenal.proto.p281v1.idl.EquityEventUpdateDto;
import com.robinhood.arsenal.proto.p281v1.idl.EquityService;
import com.robinhood.arsenal.proto.p281v1.idl.InstrumentEventUpdatesDto;
import com.robinhood.arsenal.proto.p281v1.idl.ListEquityEventUpdatesRequestDto;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* compiled from: EquityEventUpdatesSectionDuxo.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/equities/eventupdates/EquityEventUpdatesSectionDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/equities/eventupdates/EquityEventUpdatesDataState;", "Lcom/robinhood/equities/eventupdates/EquityEventUpdatesViewState;", "arsenalEquityService", "Lcom/robinhood/arsenal/proto/v1/idl/EquityService;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/equities/eventupdates/EquityEventUpdatesStateProvider;", "<init>", "(Lcom/robinhood/arsenal/proto/v1/idl/EquityService;Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/equities/eventupdates/EquityEventUpdatesStateProvider;)V", "bind", "Lkotlinx/coroutines/Job;", "instrumentId", "Ljava/util/UUID;", "lib-equity-event-updates_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class EquityEventUpdatesSectionDuxo extends BaseDuxo<EquityEventUpdatesDataState, EquityEventUpdatesSectionDuxo5> {
    public static final int $stable = 8;
    private final EquityService arsenalEquityService;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public EquityEventUpdatesSectionDuxo(EquityService arsenalEquityService, DuxoBundle duxoBundle, EquityEventUpdatesSectionDuxo4 stateProvider) {
        super(new EquityEventUpdatesDataState(null, 1, 0 == true ? 1 : 0), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(arsenalEquityService, "arsenalEquityService");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        this.arsenalEquityService = arsenalEquityService;
    }

    /* compiled from: EquityEventUpdatesSectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.equities.eventupdates.EquityEventUpdatesSectionDuxo$bind$1", m3645f = "EquityEventUpdatesSectionDuxo.kt", m3646l = {35}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.equities.eventupdates.EquityEventUpdatesSectionDuxo$bind$1 */
    static final class C331001 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $instrumentId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C331001(UUID uuid, Continuation<? super C331001> continuation) {
            super(2, continuation);
            this.$instrumentId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EquityEventUpdatesSectionDuxo.this.new C331001(this.$instrumentId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C331001) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                EquityService equityService = EquityEventUpdatesSectionDuxo.this.arsenalEquityService;
                String string2 = this.$instrumentId.toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                ListEquityEventUpdatesRequestDto listEquityEventUpdatesRequestDto = new ListEquityEventUpdatesRequestDto(string2, 4, null, 4, null);
                this.label = 1;
                obj = equityService.ListEquityEventUpdates(listEquityEventUpdatesRequestDto, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            EquityEventUpdatesSectionDuxo.this.applyMutation(new AnonymousClass1(((InstrumentEventUpdatesDto) obj).getEvent_updates(), null));
            return Unit.INSTANCE;
        }

        /* compiled from: EquityEventUpdatesSectionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/equities/eventupdates/EquityEventUpdatesDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.equities.eventupdates.EquityEventUpdatesSectionDuxo$bind$1$1", m3645f = "EquityEventUpdatesSectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.equities.eventupdates.EquityEventUpdatesSectionDuxo$bind$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<EquityEventUpdatesDataState, Continuation<? super EquityEventUpdatesDataState>, Object> {
            final /* synthetic */ List<EquityEventUpdateDto> $updates;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(List<EquityEventUpdateDto> list, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$updates = list;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$updates, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(EquityEventUpdatesDataState equityEventUpdatesDataState, Continuation<? super EquityEventUpdatesDataState> continuation) {
                return ((AnonymousClass1) create(equityEventUpdatesDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return ((EquityEventUpdatesDataState) this.L$0).copy(this.$updates);
            }
        }
    }

    public final Job bind(UUID instrumentId) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        return BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), null, null, new C331001(instrumentId, null), 3, null);
    }
}
