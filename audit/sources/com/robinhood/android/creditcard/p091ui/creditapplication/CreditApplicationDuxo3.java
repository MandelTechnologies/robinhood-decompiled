package com.robinhood.android.creditcard.p091ui.creditapplication;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.creditcard.p091ui.creditapplication.CreditApplicationDuxo6;
import com.robinhood.android.lib.store.creditcard.CreditCardStore;
import com.robinhood.android.models.creditcard.api.graphql.ManageCreditApplicationAssetReportResponse2;
import com.robinhood.utils.logging.CrashReporter;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Timeout4;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Duration;

/* compiled from: CreditApplicationDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.CreditApplicationDuxo$handlePlaidSuccess$1", m3645f = "CreditApplicationDuxo.kt", m3646l = {113, 115, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.creditcard.ui.creditapplication.CreditApplicationDuxo$handlePlaidSuccess$1, reason: use source file name */
/* loaded from: classes2.dex */
final class CreditApplicationDuxo3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $originalAccountId;
    final /* synthetic */ String $plaidAccessToken;
    final /* synthetic */ String $updatedAccountId;
    int label;
    final /* synthetic */ CreditApplicationDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CreditApplicationDuxo3(CreditApplicationDuxo creditApplicationDuxo, String str, String str2, String str3, Continuation<? super CreditApplicationDuxo3> continuation) {
        super(2, continuation);
        this.this$0 = creditApplicationDuxo;
        this.$originalAccountId = str;
        this.$updatedAccountId = str2;
        this.$plaidAccessToken = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CreditApplicationDuxo3(this.this$0, this.$originalAccountId, this.$updatedAccountId, this.$plaidAccessToken, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CreditApplicationDuxo3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0093, code lost:
    
        if (kotlinx.coroutines.time.Time4.withTimeout(r10, r3, r9) == r0) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0061 A[Catch: all -> 0x0016, TimeoutCancellationException -> 0x00a7, TryCatch #2 {TimeoutCancellationException -> 0x00a7, all -> 0x0016, blocks: (B:7:0x0011, B:13:0x0023, B:25:0x005d, B:27:0x0061, B:28:0x006c, B:14:0x0027, B:20:0x004a, B:22:0x004e, B:29:0x0074, B:17:0x002e), top: B:36:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006c A[Catch: all -> 0x0016, TimeoutCancellationException -> 0x00a7, TryCatch #2 {TimeoutCancellationException -> 0x00a7, all -> 0x0016, blocks: (B:7:0x0011, B:13:0x0023, B:25:0x005d, B:27:0x0061, B:28:0x006c, B:14:0x0027, B:20:0x004a, B:22:0x004e, B:29:0x0074, B:17:0x002e), top: B:36:0x0009 }] */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List list;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
        } catch (Timeout4 unused) {
            this.this$0.m1875xb14037d7();
        } catch (Throwable th) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, null, 6, null);
            this.this$0.submit(CreditApplicationDuxo6.UnexpectedError.INSTANCE);
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.submit(CreditApplicationDuxo6.Loading.INSTANCE);
            CreditCardStore creditCardStore = this.this$0.creditCardStore;
            String str = this.$originalAccountId;
            String str2 = this.$updatedAccountId;
            String str3 = this.$plaidAccessToken;
            this.label = 1;
            if (creditCardStore.submitPlaidPublicToken(str, str2, str3, this) == coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            list = (List) obj;
            if (list == null) {
                this.this$0.submit(new CreditApplicationDuxo6.AccountSelection(list));
            } else {
                this.this$0.submit(CreditApplicationDuxo6.UnexpectedError.INSTANCE);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        if (this.$originalAccountId == null) {
            CreditCardStore creditCardStore2 = this.this$0.creditCardStore;
            this.label = 2;
            obj = creditCardStore2.getAccounts(this);
            if (obj == coroutine_suspended) {
            }
            list = (List) obj;
            if (list == null) {
            }
            return Unit.INSTANCE;
        }
        Duration durationOfSeconds = Duration.ofSeconds(30L);
        Intrinsics.checkNotNullExpressionValue(durationOfSeconds, "ofSeconds(...)");
        C122281 c122281 = new C122281(this.this$0, this.$originalAccountId, this.$updatedAccountId, this.$plaidAccessToken, null);
        this.label = 3;
        return coroutine_suspended;
    }

    /* compiled from: CreditApplicationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.CreditApplicationDuxo$handlePlaidSuccess$1$1", m3645f = "CreditApplicationDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.CreditApplicationDuxo$handlePlaidSuccess$1$1 */
    static final class C122281 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $originalAccountId;
        final /* synthetic */ String $plaidAccessToken;
        final /* synthetic */ String $updatedAccountId;
        int label;
        final /* synthetic */ CreditApplicationDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C122281(CreditApplicationDuxo creditApplicationDuxo, String str, String str2, String str3, Continuation<? super C122281> continuation) {
            super(2, continuation);
            this.this$0 = creditApplicationDuxo;
            this.$originalAccountId = str;
            this.$updatedAccountId = str2;
            this.$plaidAccessToken = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C122281(this.this$0, this.$originalAccountId, this.$updatedAccountId, this.$plaidAccessToken, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C122281) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final Flow<ManageCreditApplicationAssetReportResponse2> flowPollAssetReportStatus = this.this$0.creditCardStore.pollAssetReportStatus(this.$originalAccountId, this.$updatedAccountId, this.$plaidAccessToken);
                Flow flowTake = FlowKt.take(new Flow<ManageCreditApplicationAssetReportResponse2>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.CreditApplicationDuxo$handlePlaidSuccess$1$1$invokeSuspend$$inlined$filter$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super ManageCreditApplicationAssetReportResponse2> flowCollector, Continuation continuation) {
                        Object objCollect = flowPollAssetReportStatus.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.CreditApplicationDuxo$handlePlaidSuccess$1$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.CreditApplicationDuxo$handlePlaidSuccess$1$1$invokeSuspend$$inlined$filter$1$2", m3645f = "CreditApplicationDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.CreditApplicationDuxo$handlePlaidSuccess$1$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            Object L$1;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i = anonymousClass1.label;
                                if ((i & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            }
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = anonymousClass1.label;
                            if (i2 == 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                if (((ManageCreditApplicationAssetReportResponse2) obj) == ManageCreditApplicationAssetReportResponse2.DONE) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } else {
                                if (i2 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                }, 1);
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowTake, anonymousClass2, this) == coroutine_suspended) {
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

        /* compiled from: CreditApplicationDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/models/creditcard/api/graphql/ManageCreditApplicationAssetReportStatus;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.CreditApplicationDuxo$handlePlaidSuccess$1$1$2", m3645f = "CreditApplicationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.CreditApplicationDuxo$handlePlaidSuccess$1$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<ManageCreditApplicationAssetReportResponse2, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ CreditApplicationDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(CreditApplicationDuxo creditApplicationDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = creditApplicationDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ManageCreditApplicationAssetReportResponse2 manageCreditApplicationAssetReportResponse2, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(manageCreditApplicationAssetReportResponse2, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.underwrite$feature_credit_card_externalDebug();
                return Unit.INSTANCE;
            }
        }
    }
}
