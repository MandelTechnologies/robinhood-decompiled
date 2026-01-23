package com.robinhood.android.acatsin.dtcentry;

import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.bonfire.AcatsValidationStore;
import com.robinhood.models.acats.p299db.p300ui.UiAcatsValidationResponse;
import com.robinhood.models.api.bonfire.ApiAcatsDtcNumberValidationRequest;
import com.robinhood.utils.extensions.Throwables;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsInDtcEntryDuxo.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/acatsin/dtcentry/AcatsInDtcEntryDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/acatsin/dtcentry/AcatsInDtcEntryDataState;", "Lcom/robinhood/android/acatsin/dtcentry/AcatsInDtcEntryViewState;", "Lcom/robinhood/android/acatsin/dtcentry/AcatsInDtcEntryEvent;", "acatsValidationStore", "Lcom/robinhood/librobinhood/data/store/bonfire/AcatsValidationStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/AcatsValidationStore;Lcom/robinhood/android/udf/DuxoBundle;)V", "onTextUpdated", "", "text", "", "validateDtcNumber", "dtcNumber", "", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class AcatsInDtcEntryDuxo extends BaseDuxo3<AcatsInDtcEntryDataState, AcatsInDtcEntryViewState, AcatsInDtcEntryEvent> {
    public static final int $stable = 8;
    private final AcatsValidationStore acatsValidationStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AcatsInDtcEntryDuxo(AcatsValidationStore acatsValidationStore, DuxoBundle duxoBundle) {
        super(new AcatsInDtcEntryDataState(null, false, 3, null), new AcatsInDtcEntryStateProvider(), duxoBundle);
        Intrinsics.checkNotNullParameter(acatsValidationStore, "acatsValidationStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.acatsValidationStore = acatsValidationStore;
    }

    /* compiled from: AcatsInDtcEntryDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acatsin/dtcentry/AcatsInDtcEntryDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.dtcentry.AcatsInDtcEntryDuxo$onTextUpdated$1", m3645f = "AcatsInDtcEntryDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acatsin.dtcentry.AcatsInDtcEntryDuxo$onTextUpdated$1 */
    static final class C79011 extends ContinuationImpl7 implements Function2<AcatsInDtcEntryDataState, Continuation<? super AcatsInDtcEntryDataState>, Object> {
        final /* synthetic */ CharSequence $text;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C79011(CharSequence charSequence, Continuation<? super C79011> continuation) {
            super(2, continuation);
            this.$text = charSequence;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C79011 c79011 = new C79011(this.$text, continuation);
            c79011.L$0 = obj;
            return c79011;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AcatsInDtcEntryDataState acatsInDtcEntryDataState, Continuation<? super AcatsInDtcEntryDataState> continuation) {
            return ((C79011) create(acatsInDtcEntryDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AcatsInDtcEntryDataState.copy$default((AcatsInDtcEntryDataState) this.L$0, this.$text, false, 2, null);
        }
    }

    public final void onTextUpdated(CharSequence text) {
        Intrinsics.checkNotNullParameter(text, "text");
        applyMutation(new C79011(text, null));
    }

    /* compiled from: AcatsInDtcEntryDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acatsin/dtcentry/AcatsInDtcEntryDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.dtcentry.AcatsInDtcEntryDuxo$validateDtcNumber$1", m3645f = "AcatsInDtcEntryDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acatsin.dtcentry.AcatsInDtcEntryDuxo$validateDtcNumber$1 */
    static final class C79021 extends ContinuationImpl7 implements Function2<AcatsInDtcEntryDataState, Continuation<? super AcatsInDtcEntryDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C79021(Continuation<? super C79021> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C79021 c79021 = new C79021(continuation);
            c79021.L$0 = obj;
            return c79021;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AcatsInDtcEntryDataState acatsInDtcEntryDataState, Continuation<? super AcatsInDtcEntryDataState> continuation) {
            return ((C79021) create(acatsInDtcEntryDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AcatsInDtcEntryDataState.copy$default((AcatsInDtcEntryDataState) this.L$0, null, true, 1, null);
        }
    }

    public final void validateDtcNumber(String dtcNumber) {
        Intrinsics.checkNotNullParameter(dtcNumber, "dtcNumber");
        applyMutation(new C79021(null));
        LifecycleHost.DefaultImpls.bind$default(this, this.acatsValidationStore.postDtcNumberValidationRequest(new ApiAcatsDtcNumberValidationRequest(dtcNumber)), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.acatsin.dtcentry.AcatsInDtcEntryDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AcatsInDtcEntryDuxo.validateDtcNumber$lambda$0(this.f$0, (UiAcatsValidationResponse) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.acatsin.dtcentry.AcatsInDtcEntryDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AcatsInDtcEntryDuxo.validateDtcNumber$lambda$1(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit validateDtcNumber$lambda$0(AcatsInDtcEntryDuxo acatsInDtcEntryDuxo, UiAcatsValidationResponse uiAcatsValidationResponse) {
        acatsInDtcEntryDuxo.applyMutation(new AcatsInDtcEntryDuxo2(acatsInDtcEntryDuxo, uiAcatsValidationResponse, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit validateDtcNumber$lambda$1(AcatsInDtcEntryDuxo acatsInDtcEntryDuxo, Throwable t) throws Throwable {
        Intrinsics.checkNotNullParameter(t, "t");
        if (!Throwables.isNetworkRelated(t)) {
            throw t;
        }
        acatsInDtcEntryDuxo.applyMutation(new AcatsInDtcEntryDuxo3(t, acatsInDtcEntryDuxo, null));
        return Unit.INSTANCE;
    }
}
