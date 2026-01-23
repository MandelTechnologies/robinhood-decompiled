package com.robinhood.android.mcduckling.card.help.p179ui;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.mcduckling.card.help.p179ui.CardHelpIntroFragment;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.store.PaymentCardStore;
import com.robinhood.models.p320db.mcduckling.PaymentCard;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CardHelpIntroDuxo.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u000eB\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/mcduckling/card/help/ui/CardHelpIntroDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/mcduckling/card/help/ui/CardHelpIntroViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "paymentCardStore", "Lcom/robinhood/librobinhood/store/PaymentCardStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/store/PaymentCardStore;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "Companion", "feature-mcduckling-help_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class CardHelpIntroDuxo extends OldBaseDuxo<CardHelpIntroViewState> implements HasSavedState {
    private final PaymentCardStore paymentCardStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CardHelpIntroDuxo(PaymentCardStore paymentCardStore, SavedStateHandle savedStateHandle) {
        super(new CardHelpIntroViewState(null, 1, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(paymentCardStore, "paymentCardStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.paymentCardStore = paymentCardStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        super.onStart();
        PaymentCardStore paymentCardStore = this.paymentCardStore;
        Companion companion = INSTANCE;
        paymentCardStore.refresh(((CardHelpIntroFragment.Args) companion.getArgs((HasSavedState) this)).getCardId(), true);
        LifecycleHost.DefaultImpls.bind$default(this, this.paymentCardStore.streamCard(((CardHelpIntroFragment.Args) companion.getArgs((HasSavedState) this)).getCardId()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.mcduckling.card.help.ui.CardHelpIntroDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CardHelpIntroDuxo.onStart$lambda$1(this.f$0, (PaymentCard) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(CardHelpIntroDuxo cardHelpIntroDuxo, final PaymentCard card) {
        Intrinsics.checkNotNullParameter(card, "card");
        cardHelpIntroDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.mcduckling.card.help.ui.CardHelpIntroDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CardHelpIntroDuxo.onStart$lambda$1$lambda$0(card, (CardHelpIntroViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CardHelpIntroViewState onStart$lambda$1$lambda$0(PaymentCard paymentCard, CardHelpIntroViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(paymentCard);
    }

    /* compiled from: CardHelpIntroDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/mcduckling/card/help/ui/CardHelpIntroDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/mcduckling/card/help/ui/CardHelpIntroDuxo;", "Lcom/robinhood/android/mcduckling/card/help/ui/CardHelpIntroFragment$Args;", "<init>", "()V", "feature-mcduckling-help_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<CardHelpIntroDuxo, CardHelpIntroFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public CardHelpIntroFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (CardHelpIntroFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public CardHelpIntroFragment.Args getArgs(CardHelpIntroDuxo cardHelpIntroDuxo) {
            return (CardHelpIntroFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, cardHelpIntroDuxo);
        }
    }
}
