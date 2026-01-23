package com.robinhood.android.matcha.p177ui.instantwithdrawal;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.social.contracts.matcha.MatchaInstantWithdrawalIntro;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.staticcontent.model.productmarketing.ProductMarketingContent;
import com.robinhood.staticcontent.store.ContentStore;
import com.robinhood.staticcontent.store.productmarketing.RealProductMarketingStore;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: InstantWithdrawalIntroDuxo.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0013B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/instantwithdrawal/InstantWithdrawalIntroDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/matcha/ui/instantwithdrawal/InstantWithdrawalIntroDataState;", "Lcom/robinhood/android/matcha/ui/instantwithdrawal/InstantWithdrawalIntroViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "productMarketingStore", "Lcom/robinhood/staticcontent/store/productmarketing/RealProductMarketingStore;", "stateProvider", "Lcom/robinhood/android/matcha/ui/instantwithdrawal/InstantWithdrawalIntroStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/staticcontent/store/productmarketing/RealProductMarketingStore;Lcom/robinhood/android/matcha/ui/instantwithdrawal/InstantWithdrawalIntroStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "Companion", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class InstantWithdrawalIntroDuxo extends BaseDuxo<InstantWithdrawalIntroDataState, InstantWithdrawalIntroViewState> implements HasSavedState {
    private final RealProductMarketingStore productMarketingStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstantWithdrawalIntroDuxo(RealProductMarketingStore productMarketingStore, InstantWithdrawalIntroStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new InstantWithdrawalIntroDataState(((MatchaInstantWithdrawalIntro) INSTANCE.getArgs(savedStateHandle)).getVariant(), null, null, 6, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(productMarketingStore, "productMarketingStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.productMarketingStore = productMarketingStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C213951(null));
    }

    /* compiled from: InstantWithdrawalIntroDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.instantwithdrawal.InstantWithdrawalIntroDuxo$onCreate$1", m3645f = "InstantWithdrawalIntroDuxo.kt", m3646l = {33}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.matcha.ui.instantwithdrawal.InstantWithdrawalIntroDuxo$onCreate$1 */
    static final class C213951 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C213951(Continuation<? super C213951> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C213951 c213951 = InstantWithdrawalIntroDuxo.this.new C213951(continuation);
            c213951.L$0 = obj;
            return c213951;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C213951) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x006e  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            C213951 c213951;
            Throwable th;
            Object objM28550constructorimpl;
            Throwable thM28553exceptionOrNullimpl;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                String contentfulId = InstantWithdrawalIntroDataState3.getContentType(((MatchaInstantWithdrawalIntro) InstantWithdrawalIntroDuxo.INSTANCE.getArgs((HasSavedState) InstantWithdrawalIntroDuxo.this)).getVariant()).getContentfulId();
                InstantWithdrawalIntroDuxo instantWithdrawalIntroDuxo = InstantWithdrawalIntroDuxo.this;
                try {
                    Result.Companion companion = Result.INSTANCE;
                    RealProductMarketingStore realProductMarketingStore = instantWithdrawalIntroDuxo.productMarketingStore;
                    this.label = 1;
                    c213951 = this;
                    try {
                        obj = ContentStore.DefaultImpls.load$default(realProductMarketingStore, contentfulId, null, c213951, 2, null);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        th = th;
                        Result.Companion companion2 = Result.INSTANCE;
                        objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
                        InstantWithdrawalIntroDuxo instantWithdrawalIntroDuxo2 = InstantWithdrawalIntroDuxo.this;
                        if (Result.m28556isSuccessimpl(objM28550constructorimpl)) {
                        }
                        InstantWithdrawalIntroDuxo instantWithdrawalIntroDuxo3 = InstantWithdrawalIntroDuxo.this;
                        thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
                        if (thM28553exceptionOrNullimpl != null) {
                        }
                        return Unit.INSTANCE;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    c213951 = this;
                    th = th;
                    Result.Companion companion22 = Result.INSTANCE;
                    objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
                    InstantWithdrawalIntroDuxo instantWithdrawalIntroDuxo22 = InstantWithdrawalIntroDuxo.this;
                    if (Result.m28556isSuccessimpl(objM28550constructorimpl)) {
                    }
                    InstantWithdrawalIntroDuxo instantWithdrawalIntroDuxo32 = InstantWithdrawalIntroDuxo.this;
                    thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
                    if (thM28553exceptionOrNullimpl != null) {
                    }
                    return Unit.INSTANCE;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                try {
                    ResultKt.throwOnFailure(obj);
                    c213951 = this;
                } catch (Throwable th4) {
                    th = th4;
                    c213951 = this;
                    Result.Companion companion222 = Result.INSTANCE;
                    objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
                    InstantWithdrawalIntroDuxo instantWithdrawalIntroDuxo222 = InstantWithdrawalIntroDuxo.this;
                    if (Result.m28556isSuccessimpl(objM28550constructorimpl)) {
                    }
                    InstantWithdrawalIntroDuxo instantWithdrawalIntroDuxo322 = InstantWithdrawalIntroDuxo.this;
                    thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
                    if (thM28553exceptionOrNullimpl != null) {
                    }
                    return Unit.INSTANCE;
                }
            }
            objM28550constructorimpl = Result.m28550constructorimpl((ProductMarketingContent) obj);
            InstantWithdrawalIntroDuxo instantWithdrawalIntroDuxo2222 = InstantWithdrawalIntroDuxo.this;
            if (Result.m28556isSuccessimpl(objM28550constructorimpl)) {
                instantWithdrawalIntroDuxo2222.applyMutation(new InstantWithdrawalIntroDuxo2((ProductMarketingContent) objM28550constructorimpl, null));
            }
            InstantWithdrawalIntroDuxo instantWithdrawalIntroDuxo3222 = InstantWithdrawalIntroDuxo.this;
            thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
            if (thM28553exceptionOrNullimpl != null) {
                instantWithdrawalIntroDuxo3222.applyMutation(new InstantWithdrawalIntroDuxo3(thM28553exceptionOrNullimpl, null));
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: InstantWithdrawalIntroDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/instantwithdrawal/InstantWithdrawalIntroDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/matcha/ui/instantwithdrawal/InstantWithdrawalIntroDuxo;", "Lcom/robinhood/android/social/contracts/matcha/MatchaInstantWithdrawalIntro;", "<init>", "()V", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<InstantWithdrawalIntroDuxo, MatchaInstantWithdrawalIntro> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public MatchaInstantWithdrawalIntro getArgs(SavedStateHandle savedStateHandle) {
            return (MatchaInstantWithdrawalIntro) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public MatchaInstantWithdrawalIntro getArgs(InstantWithdrawalIntroDuxo instantWithdrawalIntroDuxo) {
            return (MatchaInstantWithdrawalIntro) DuxoCompanion.DefaultImpls.getArgs(this, instantWithdrawalIntroDuxo);
        }
    }
}
