package com.robinhood.android.support.call;

import com.robinhood.android.support.call.ReviewCallDetailsDataState;
import com.robinhood.android.support.call.textanimator.ReviewCallDetailsEvent;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.librobinhood.data.store.SupportPhoneIssueStore;
import com.robinhood.models.p355ui.Issue;
import com.robinhood.shared.support.contracts.ReviewCallDetailsFragmentKey;
import com.robinhood.utils.extensions.Throwables;
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

/* compiled from: ReviewCallDetailsDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.support.call.ReviewCallDetailsDuxo$createNewIssue$1$1", m3645f = "ReviewCallDetailsDuxo.kt", m3646l = {128, 136}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.support.call.ReviewCallDetailsDuxo$createNewIssue$1$1, reason: use source file name */
/* loaded from: classes9.dex */
final class ReviewCallDetailsDuxo2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ReviewCallDetailsDataState $it;
    Object L$0;
    int label;
    final /* synthetic */ ReviewCallDetailsDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewCallDetailsDuxo2(ReviewCallDetailsDuxo reviewCallDetailsDuxo, ReviewCallDetailsDataState reviewCallDetailsDataState, Continuation<? super ReviewCallDetailsDuxo2> continuation) {
        super(2, continuation);
        this.this$0 = reviewCallDetailsDuxo;
        this.$it = reviewCallDetailsDataState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ReviewCallDetailsDuxo2(this.this$0, this.$it, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ReviewCallDetailsDuxo2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        ReviewCallDetailsDuxo reviewCallDetailsDuxo;
        Issue.Phone phone;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.this$0.applyMutation(new C288911(null));
                ReviewCallDetailsDuxo reviewCallDetailsDuxo2 = this.this$0;
                if (reviewCallDetailsDuxo2.authManager.isLoggedIn()) {
                    SupportPhoneIssueStore supportPhoneIssueStore = this.this$0.supportPhoneIssueStore;
                    UUID inquiryId = ((ReviewCallDetailsFragmentKey) ReviewCallDetailsDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).getInquiryId();
                    this.L$0 = reviewCallDetailsDuxo2;
                    this.label = 1;
                    Object objCreateLoggedInVoiceCase = supportPhoneIssueStore.createLoggedInVoiceCase(inquiryId, this);
                    if (objCreateLoggedInVoiceCase != coroutine_suspended) {
                        reviewCallDetailsDuxo = reviewCallDetailsDuxo2;
                        obj = objCreateLoggedInVoiceCase;
                        phone = (Issue.Phone) obj;
                    }
                } else {
                    String overriddenPhoneNumber = this.$it.getOverriddenPhoneNumber();
                    if (overriddenPhoneNumber == null) {
                        overriddenPhoneNumber = this.$it.getInitialLoggedOutPhoneNumber();
                    }
                    if (overriddenPhoneNumber == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    StringBuilder sb = new StringBuilder();
                    int length = overriddenPhoneNumber.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        char cCharAt = overriddenPhoneNumber.charAt(i2);
                        if (Character.isDigit(cCharAt)) {
                            sb.append(cCharAt);
                        }
                    }
                    String string2 = sb.toString();
                    SupportPhoneIssueStore supportPhoneIssueStore2 = this.this$0.supportPhoneIssueStore;
                    UUID inquiryId2 = ((ReviewCallDetailsFragmentKey) ReviewCallDetailsDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).getInquiryId();
                    this.L$0 = reviewCallDetailsDuxo2;
                    this.label = 2;
                    Object objCreateLoggedOutVoiceCase = supportPhoneIssueStore2.createLoggedOutVoiceCase(inquiryId2, string2, this);
                    if (objCreateLoggedOutVoiceCase != coroutine_suspended) {
                        reviewCallDetailsDuxo = reviewCallDetailsDuxo2;
                        obj = objCreateLoggedOutVoiceCase;
                        phone = (Issue.Phone) obj;
                    }
                }
                return coroutine_suspended;
            }
            if (i == 1) {
                reviewCallDetailsDuxo = (ReviewCallDetailsDuxo) this.L$0;
                ResultKt.throwOnFailure(obj);
                phone = (Issue.Phone) obj;
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                reviewCallDetailsDuxo = (ReviewCallDetailsDuxo) this.L$0;
                ResultKt.throwOnFailure(obj);
                phone = (Issue.Phone) obj;
            }
            Issue.Phone phoneAsPhoneOrThrow = reviewCallDetailsDuxo.asPhoneOrThrow(phone);
            this.this$0.applyMutation(new C288922(null));
            this.this$0.submit(new ReviewCallDetailsEvent.RequestSupportSuccess(this.this$0.authManager.isLoggedIn(), phoneAsPhoneOrThrow.getId()));
        } catch (Throwable th) {
            if (Throwables.isNetworkRelated(th)) {
                this.this$0.applyMutation(new C288933(null));
                this.this$0.submit(new ReviewCallDetailsEvent.RequestSupportFailure(th));
            } else {
                throw th;
            }
        }
        return Unit.INSTANCE;
    }

    /* compiled from: ReviewCallDetailsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/support/call/ReviewCallDetailsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.support.call.ReviewCallDetailsDuxo$createNewIssue$1$1$1", m3645f = "ReviewCallDetailsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.support.call.ReviewCallDetailsDuxo$createNewIssue$1$1$1 */
    static final class C288911 extends ContinuationImpl7 implements Function2<ReviewCallDetailsDataState, Continuation<? super ReviewCallDetailsDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C288911(Continuation<? super C288911> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C288911 c288911 = new C288911(continuation);
            c288911.L$0 = obj;
            return c288911;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ReviewCallDetailsDataState reviewCallDetailsDataState, Continuation<? super ReviewCallDetailsDataState> continuation) {
            return ((C288911) create(reviewCallDetailsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ReviewCallDetailsDataState.copy$default((ReviewCallDetailsDataState) this.L$0, null, ReviewCallDetailsDataState.RequestSupportState.Requesting.INSTANCE, false, null, null, 29, null);
        }
    }

    /* compiled from: ReviewCallDetailsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/support/call/ReviewCallDetailsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.support.call.ReviewCallDetailsDuxo$createNewIssue$1$1$2", m3645f = "ReviewCallDetailsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.support.call.ReviewCallDetailsDuxo$createNewIssue$1$1$2 */
    static final class C288922 extends ContinuationImpl7 implements Function2<ReviewCallDetailsDataState, Continuation<? super ReviewCallDetailsDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C288922(Continuation<? super C288922> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C288922 c288922 = new C288922(continuation);
            c288922.L$0 = obj;
            return c288922;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ReviewCallDetailsDataState reviewCallDetailsDataState, Continuation<? super ReviewCallDetailsDataState> continuation) {
            return ((C288922) create(reviewCallDetailsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ReviewCallDetailsDataState.copy$default((ReviewCallDetailsDataState) this.L$0, null, ReviewCallDetailsDataState.RequestSupportState.Idle.INSTANCE, false, null, null, 29, null);
        }
    }

    /* compiled from: ReviewCallDetailsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/support/call/ReviewCallDetailsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.support.call.ReviewCallDetailsDuxo$createNewIssue$1$1$3", m3645f = "ReviewCallDetailsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.support.call.ReviewCallDetailsDuxo$createNewIssue$1$1$3 */
    static final class C288933 extends ContinuationImpl7 implements Function2<ReviewCallDetailsDataState, Continuation<? super ReviewCallDetailsDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C288933(Continuation<? super C288933> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C288933 c288933 = new C288933(continuation);
            c288933.L$0 = obj;
            return c288933;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ReviewCallDetailsDataState reviewCallDetailsDataState, Continuation<? super ReviewCallDetailsDataState> continuation) {
            return ((C288933) create(reviewCallDetailsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ReviewCallDetailsDataState.copy$default((ReviewCallDetailsDataState) this.L$0, null, ReviewCallDetailsDataState.RequestSupportState.Idle.INSTANCE, false, null, null, 29, null);
        }
    }
}
