package com.robinhood.android.rhsconversion;

import com.robinhood.android.rhsconversion.RhsConversionDisclosuresDuxo2;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.identi.UserAgreementsStore;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: RhsConversionDisclosuresDuxo.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016J\u0006\u0010\u000b\u001a\u00020\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/rhsconversion/RhsConversionDisclosuresDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "", "Lcom/robinhood/android/rhsconversion/RhsConversionDisclosuresEvent;", "userAgreementsStore", "Lcom/robinhood/librobinhood/data/store/identi/UserAgreementsStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/identi/UserAgreementsStore;Lcom/robinhood/android/udf/DuxoBundle;)V", "onResume", "onAgreementAccepted", "feature-rhs-conversion_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class RhsConversionDisclosuresDuxo extends BaseDuxo5<Unit, RhsConversionDisclosuresDuxo2> {
    public static final int $stable = 8;
    private final UserAgreementsStore userAgreementsStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RhsConversionDisclosuresDuxo(UserAgreementsStore userAgreementsStore, DuxoBundle duxoBundle) {
        super(Unit.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(userAgreementsStore, "userAgreementsStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.userAgreementsStore = userAgreementsStore;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onResume() {
        super.onResume();
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C273231(null), 3, null);
    }

    /* compiled from: RhsConversionDisclosuresDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.rhsconversion.RhsConversionDisclosuresDuxo$onResume$1", m3645f = "RhsConversionDisclosuresDuxo.kt", m3646l = {24}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.rhsconversion.RhsConversionDisclosuresDuxo$onResume$1 */
    static final class C273231 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C273231(Continuation<? super C273231> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RhsConversionDisclosuresDuxo.this.new C273231(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C273231) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                UserAgreementsStore userAgreementsStore = RhsConversionDisclosuresDuxo.this.userAgreementsStore;
                this.label = 1;
                if (userAgreementsStore.hasSeenRhsConversionPage(this) == coroutine_suspended) {
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

    /* compiled from: RhsConversionDisclosuresDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.rhsconversion.RhsConversionDisclosuresDuxo$onAgreementAccepted$1", m3645f = "RhsConversionDisclosuresDuxo.kt", m3646l = {30}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.rhsconversion.RhsConversionDisclosuresDuxo$onAgreementAccepted$1 */
    static final class C273221 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C273221(Continuation<? super C273221> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C273221 c273221 = RhsConversionDisclosuresDuxo.this.new C273221(continuation);
            c273221.L$0 = obj;
            return c273221;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C273221) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object objM28550constructorimpl;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    RhsConversionDisclosuresDuxo rhsConversionDisclosuresDuxo = RhsConversionDisclosuresDuxo.this;
                    Result.Companion companion = Result.INSTANCE;
                    UserAgreementsStore userAgreementsStore = rhsConversionDisclosuresDuxo.userAgreementsStore;
                    this.label = 1;
                    if (userAgreementsStore.agreeToRhsMargin(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                objM28550constructorimpl = Result.m28550constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
            }
            RhsConversionDisclosuresDuxo rhsConversionDisclosuresDuxo2 = RhsConversionDisclosuresDuxo.this;
            if (Result.m28556isSuccessimpl(objM28550constructorimpl)) {
                rhsConversionDisclosuresDuxo2.submit(RhsConversionDisclosuresDuxo2.Success.INSTANCE);
            }
            RhsConversionDisclosuresDuxo rhsConversionDisclosuresDuxo3 = RhsConversionDisclosuresDuxo.this;
            Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
            if (thM28553exceptionOrNullimpl != null) {
                rhsConversionDisclosuresDuxo3.submit(new RhsConversionDisclosuresDuxo2.Error(thM28553exceptionOrNullimpl));
            }
            return Unit.INSTANCE;
        }
    }

    public final void onAgreementAccepted() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C273221(null), 3, null);
    }
}
