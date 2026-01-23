package com.robinhood.android.mcduckling.card.help.p179ui;

import android.os.Bundle;
import com.robinhood.android.mcduckling.card.help.p179ui.CardReplacementSubmissionDuxo;
import com.robinhood.android.mcduckling.card.help.p179ui.CardReplacementSubmissionState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.api.retrofit.Minerva;
import com.robinhood.models.api.minerva.ApiPaymentCard;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CardReplacementSubmissionDuxo.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\r\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\fJ\u000e\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/mcduckling/card/help/ui/CardReplacementSubmissionDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/mcduckling/card/help/ui/CardReplacementSubmissionState;", "minerva", "Lcom/robinhood/api/retrofit/Minerva;", "<init>", "(Lcom/robinhood/api/retrofit/Minerva;)V", CardReplacementSubmissionDuxo.SAVE_ALLOW_SUBMISSION, "", "saveState", "", "outState", "Landroid/os/Bundle;", "restoreState", "savedInstanceState", "submit", "cardSubmissionDetails", "Lcom/robinhood/android/mcduckling/card/help/ui/CardReplacementSubmissionDetails;", "Companion", "feature-mcduckling-help_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class CardReplacementSubmissionDuxo extends OldBaseDuxo<CardReplacementSubmissionState> {
    private static final String SAVE_ALLOW_SUBMISSION = "allowSubmission";
    private boolean allowSubmission;
    private final Minerva minerva;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CardReplacementSubmissionDuxo(Minerva minerva) {
        super(CardReplacementSubmissionState.Submitting.INSTANCE, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(minerva, "minerva");
        this.minerva = minerva;
        this.allowSubmission = true;
    }

    public final void saveState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        outState.putBoolean(SAVE_ALLOW_SUBMISSION, this.allowSubmission);
    }

    public final void restoreState(Bundle savedInstanceState) {
        this.allowSubmission = savedInstanceState != null ? savedInstanceState.getBoolean(SAVE_ALLOW_SUBMISSION, true) : true;
    }

    public final void submit(CardReplacementSubmissionDetails cardSubmissionDetails) {
        Intrinsics.checkNotNullParameter(cardSubmissionDetails, "cardSubmissionDetails");
        if (this.allowSubmission) {
            this.allowSubmission = false;
            BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C216431(cardSubmissionDetails, this, new ApiPaymentCard.ReplaceCardRequest(cardSubmissionDetails.getShippingAddressId(), cardSubmissionDetails.getIsBillingAddress()), null), 3, null);
        }
    }

    /* compiled from: CardReplacementSubmissionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.mcduckling.card.help.ui.CardReplacementSubmissionDuxo$submit$1", m3645f = "CardReplacementSubmissionDuxo.kt", m3646l = {40, 45, 50, 58, 69, 75}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.mcduckling.card.help.ui.CardReplacementSubmissionDuxo$submit$1 */
    static final class C216431 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ CardReplacementSubmissionDetails $cardSubmissionDetails;
        final /* synthetic */ ApiPaymentCard.ReplaceCardRequest $replaceCardRequest;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ CardReplacementSubmissionDuxo this$0;

        /* compiled from: CardReplacementSubmissionDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.mcduckling.card.help.ui.CardReplacementSubmissionDuxo$submit$1$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[CardReplacementType.values().length];
                try {
                    iArr[CardReplacementType.LOST.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[CardReplacementType.STOLEN.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[CardReplacementType.STOLEN_VIRTUAL.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[CardReplacementType.DAMAGED.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[CardReplacementType.VIRTUAL_TO_PHYSICAL.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[CardReplacementType.UNAUTHORIZED_TRANSACTION.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C216431(CardReplacementSubmissionDetails cardReplacementSubmissionDetails, CardReplacementSubmissionDuxo cardReplacementSubmissionDuxo, ApiPaymentCard.ReplaceCardRequest replaceCardRequest, Continuation<? super C216431> continuation) {
            super(2, continuation);
            this.$cardSubmissionDetails = cardReplacementSubmissionDetails;
            this.this$0 = cardReplacementSubmissionDuxo;
            this.$replaceCardRequest = replaceCardRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C216431 c216431 = new C216431(this.$cardSubmissionDetails, this.this$0, this.$replaceCardRequest, continuation);
            c216431.L$0 = obj;
            return c216431;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C216431) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x00c8, code lost:
        
            if (r1.reportCardLost(r7, r3, r6) == r0) goto L36;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objM28550constructorimpl;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            try {
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        CardReplacementSubmissionDetails cardReplacementSubmissionDetails = this.$cardSubmissionDetails;
                        CardReplacementSubmissionDuxo cardReplacementSubmissionDuxo = this.this$0;
                        ApiPaymentCard.ReplaceCardRequest replaceCardRequest = this.$replaceCardRequest;
                        Result.Companion companion = Result.INSTANCE;
                        switch (WhenMappings.$EnumSwitchMapping$0[cardReplacementSubmissionDetails.getReplacementType().ordinal()]) {
                            case 1:
                                Minerva minerva = cardReplacementSubmissionDuxo.minerva;
                                UUID cardId = cardReplacementSubmissionDetails.getCardId();
                                this.label = 1;
                                break;
                            case 2:
                                Minerva minerva2 = cardReplacementSubmissionDuxo.minerva;
                                UUID cardId2 = cardReplacementSubmissionDetails.getCardId();
                                this.label = 2;
                                if (minerva2.reportCardStolen(cardId2, replaceCardRequest, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                break;
                            case 3:
                                Minerva minerva3 = cardReplacementSubmissionDuxo.minerva;
                                UUID cardId3 = cardReplacementSubmissionDetails.getCardId();
                                ApiPaymentCard.ReplaceCardRequest replaceCardRequest2 = new ApiPaymentCard.ReplaceCardRequest(null, null);
                                this.label = 3;
                                if (minerva3.reportCardStolen(cardId3, replaceCardRequest2, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                break;
                            case 4:
                                Minerva minerva4 = cardReplacementSubmissionDuxo.minerva;
                                UUID cardId4 = cardReplacementSubmissionDetails.getCardId();
                                this.label = 4;
                                if (minerva4.reportCardDamaged(cardId4, replaceCardRequest, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                break;
                            case 5:
                                if (cardReplacementSubmissionDetails.getCardColor() == null) {
                                    throw new IllegalStateException("Check failed.");
                                }
                                ApiPaymentCard.SwitchToPhysicalRequest switchToPhysicalRequest = new ApiPaymentCard.SwitchToPhysicalRequest(cardReplacementSubmissionDetails.getShippingAddressId(), cardReplacementSubmissionDetails.getCardColor());
                                Minerva minerva5 = cardReplacementSubmissionDuxo.minerva;
                                UUID cardId5 = cardReplacementSubmissionDetails.getCardId();
                                this.label = 5;
                                if (minerva5.switchToPhysical(cardId5, switchToPhysicalRequest, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                break;
                            case 6:
                                Minerva minerva6 = cardReplacementSubmissionDuxo.minerva;
                                UUID cardId6 = cardReplacementSubmissionDetails.getCardId();
                                this.label = 6;
                                if (minerva6.reportCardStolen(cardId6, replaceCardRequest, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                break;
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        ResultKt.throwOnFailure(obj);
                        break;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                objM28550constructorimpl = Result.m28550constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
            }
            CardReplacementSubmissionDuxo cardReplacementSubmissionDuxo2 = this.this$0;
            if (Result.m28556isSuccessimpl(objM28550constructorimpl)) {
                cardReplacementSubmissionDuxo2.mutate(new Function1() { // from class: com.robinhood.android.mcduckling.card.help.ui.CardReplacementSubmissionDuxo$submit$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return CardReplacementSubmissionDuxo.C216431.invokeSuspend$lambda$2$lambda$1((CardReplacementSubmissionState) obj2);
                    }
                });
                cardReplacementSubmissionDuxo2.allowSubmission = false;
            }
            CardReplacementSubmissionDuxo cardReplacementSubmissionDuxo3 = this.this$0;
            final Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
            if (thM28553exceptionOrNullimpl != null) {
                cardReplacementSubmissionDuxo3.mutate(new Function1() { // from class: com.robinhood.android.mcduckling.card.help.ui.CardReplacementSubmissionDuxo$submit$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return CardReplacementSubmissionDuxo.C216431.invokeSuspend$lambda$4$lambda$3(thM28553exceptionOrNullimpl, (CardReplacementSubmissionState) obj2);
                    }
                });
                cardReplacementSubmissionDuxo3.allowSubmission = true;
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CardReplacementSubmissionState invokeSuspend$lambda$2$lambda$1(CardReplacementSubmissionState cardReplacementSubmissionState) {
            return CardReplacementSubmissionState.Success.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CardReplacementSubmissionState invokeSuspend$lambda$4$lambda$3(Throwable th, CardReplacementSubmissionState cardReplacementSubmissionState) {
            return new CardReplacementSubmissionState.Error(th);
        }
    }
}
