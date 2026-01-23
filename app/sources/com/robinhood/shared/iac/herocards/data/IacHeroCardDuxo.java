package com.robinhood.shared.iac.herocards.data;

import android.net.Uri;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.models.p320db.herocard.IacHeroCard;
import com.robinhood.shared.data.store.iac.IacHeroCardStore;
import com.robinhood.shared.iac.herocards.data.IacHeroCardViewState;
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
import timber.log.Timber;

/* compiled from: IacHeroCardDuxo.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/shared/iac/herocards/data/IacHeroCardDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/shared/iac/herocards/data/IacHeroCardViewState;", "iacHeroCardStore", "Lcom/robinhood/shared/data/store/iac/IacHeroCardStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/shared/data/store/iac/IacHeroCardStore;Lcom/robinhood/android/udf/DuxoBundle;)V", "timberTag", "Ltimber/log/Timber$Tree;", "onHeroCardDismissed", "", "card", "Lcom/robinhood/models/db/herocard/IacHeroCard;", "onHeroCardTapped", "onHeroCardSeen", "lib-iac-hero-cards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class IacHeroCardDuxo extends BaseDuxo4<IacHeroCardViewState> {
    public static final int $stable = 8;
    private final IacHeroCardStore iacHeroCardStore;
    private final Timber.Tree timberTag;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IacHeroCardDuxo(IacHeroCardStore iacHeroCardStore, DuxoBundle duxoBundle) {
        super(IacHeroCardViewState.Default.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(iacHeroCardStore, "iacHeroCardStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.iacHeroCardStore = iacHeroCardStore;
        this.timberTag = Timber.INSTANCE.tag("IacHeroCardDuxo");
    }

    /* compiled from: IacHeroCardDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.iac.herocards.data.IacHeroCardDuxo$onHeroCardDismissed$1", m3645f = "IacHeroCardDuxo.kt", m3646l = {41}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.iac.herocards.data.IacHeroCardDuxo$onHeroCardDismissed$1 */
    static final class C390431 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ IacHeroCard $card;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C390431(IacHeroCard iacHeroCard, Continuation<? super C390431> continuation) {
            super(2, continuation);
            this.$card = iacHeroCard;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return IacHeroCardDuxo.this.new C390431(this.$card, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C390431) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                IacHeroCardStore iacHeroCardStore = IacHeroCardDuxo.this.iacHeroCardStore;
                UUID receiptUuid = this.$card.getReceiptUuid();
                String cardIdentifier = this.$card.getCardIdentifier();
                this.label = 1;
                if (iacHeroCardStore.markIacHeroCardDismissed(receiptUuid, cardIdentifier, this) == coroutine_suspended) {
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

    public final void onHeroCardDismissed(IacHeroCard card) {
        Intrinsics.checkNotNullParameter(card, "card");
        this.timberTag.mo3350d("Hero card: " + card.getLoggingIdentifier() + " dismissed", new Object[0]);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C390431(card, null), 3, null);
    }

    /* compiled from: IacHeroCardDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.iac.herocards.data.IacHeroCardDuxo$onHeroCardTapped$1", m3645f = "IacHeroCardDuxo.kt", m3646l = {51}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.iac.herocards.data.IacHeroCardDuxo$onHeroCardTapped$1 */
    static final class C390451 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ IacHeroCard $card;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C390451(IacHeroCard iacHeroCard, Continuation<? super C390451> continuation) {
            super(2, continuation);
            this.$card = iacHeroCard;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return IacHeroCardDuxo.this.new C390451(this.$card, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C390451) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            String string2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                IacHeroCardStore iacHeroCardStore = IacHeroCardDuxo.this.iacHeroCardStore;
                UUID receiptUuid = this.$card.getReceiptUuid();
                Uri uriOriginalDeeplink = this.$card.originalDeeplink();
                if (uriOriginalDeeplink == null || (string2 = uriOriginalDeeplink.toString()) == null) {
                    string2 = "";
                }
                this.label = 1;
                if (iacHeroCardStore.markIacHeroCardTapped(receiptUuid, string2, this) == coroutine_suspended) {
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

    public final void onHeroCardTapped(IacHeroCard card) {
        Intrinsics.checkNotNullParameter(card, "card");
        this.timberTag.mo3350d("Hero card: " + card.getLoggingIdentifier() + " tapped", new Object[0]);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C390451(card, null), 3, null);
    }

    /* compiled from: IacHeroCardDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.iac.herocards.data.IacHeroCardDuxo$onHeroCardSeen$1", m3645f = "IacHeroCardDuxo.kt", m3646l = {58}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.iac.herocards.data.IacHeroCardDuxo$onHeroCardSeen$1 */
    static final class C390441 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ IacHeroCard $card;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C390441(IacHeroCard iacHeroCard, Continuation<? super C390441> continuation) {
            super(2, continuation);
            this.$card = iacHeroCard;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return IacHeroCardDuxo.this.new C390441(this.$card, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C390441) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                IacHeroCardStore iacHeroCardStore = IacHeroCardDuxo.this.iacHeroCardStore;
                UUID receiptUuid = this.$card.getReceiptUuid();
                this.label = 1;
                if (iacHeroCardStore.markIacHeroCardSeen(receiptUuid, this) == coroutine_suspended) {
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

    public final void onHeroCardSeen(IacHeroCard card) {
        Intrinsics.checkNotNullParameter(card, "card");
        this.timberTag.mo3350d("Hero card: " + card.getLoggingIdentifier() + " seen", new Object[0]);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C390441(card, null), 3, null);
    }
}
