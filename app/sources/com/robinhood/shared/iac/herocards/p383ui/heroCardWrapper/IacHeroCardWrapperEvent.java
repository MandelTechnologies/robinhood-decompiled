package com.robinhood.shared.iac.herocards.p383ui.heroCardWrapper;

import com.robinhood.android.equitydetail.p123ui.InstrumentDetailDuxo;
import com.robinhood.models.p320db.herocard.IacHeroCard;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IacHeroCardWrapperEvent.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/shared/iac/herocards/ui/heroCardWrapper/IacHeroCardWrapperEvent;", "", "OnCardLoadingCompleted", "Lcom/robinhood/shared/iac/herocards/ui/heroCardWrapper/IacHeroCardWrapperEvent$OnCardLoadingCompleted;", "lib-iac-hero-cards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public interface IacHeroCardWrapperEvent {

    /* compiled from: IacHeroCardWrapperEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/iac/herocards/ui/heroCardWrapper/IacHeroCardWrapperEvent$OnCardLoadingCompleted;", "Lcom/robinhood/shared/iac/herocards/ui/heroCardWrapper/IacHeroCardWrapperEvent;", InstrumentDetailDuxo.KEY_IAC_HERO_CARD, "Lcom/robinhood/models/db/herocard/IacHeroCard;", "<init>", "(Lcom/robinhood/models/db/herocard/IacHeroCard;)V", "getIacHeroCard", "()Lcom/robinhood/models/db/herocard/IacHeroCard;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-iac-hero-cards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class OnCardLoadingCompleted implements IacHeroCardWrapperEvent {
        public static final int $stable = 8;
        private final IacHeroCard iacHeroCard;

        public static /* synthetic */ OnCardLoadingCompleted copy$default(OnCardLoadingCompleted onCardLoadingCompleted, IacHeroCard iacHeroCard, int i, Object obj) {
            if ((i & 1) != 0) {
                iacHeroCard = onCardLoadingCompleted.iacHeroCard;
            }
            return onCardLoadingCompleted.copy(iacHeroCard);
        }

        /* renamed from: component1, reason: from getter */
        public final IacHeroCard getIacHeroCard() {
            return this.iacHeroCard;
        }

        public final OnCardLoadingCompleted copy(IacHeroCard iacHeroCard) {
            return new OnCardLoadingCompleted(iacHeroCard);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OnCardLoadingCompleted) && Intrinsics.areEqual(this.iacHeroCard, ((OnCardLoadingCompleted) other).iacHeroCard);
        }

        public int hashCode() {
            IacHeroCard iacHeroCard = this.iacHeroCard;
            if (iacHeroCard == null) {
                return 0;
            }
            return iacHeroCard.hashCode();
        }

        public String toString() {
            return "OnCardLoadingCompleted(iacHeroCard=" + this.iacHeroCard + ")";
        }

        public OnCardLoadingCompleted(IacHeroCard iacHeroCard) {
            this.iacHeroCard = iacHeroCard;
        }

        public final IacHeroCard getIacHeroCard() {
            return this.iacHeroCard;
        }
    }
}
