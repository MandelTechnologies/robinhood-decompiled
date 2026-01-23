package com.robinhood.shared.iac.herocards.p383ui.heroCardWrapper;

import com.robinhood.android.equitydetail.p123ui.InstrumentDetailDuxo;
import com.robinhood.models.p320db.herocard.IacHeroCard;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IacHeroCardWrapperViewState.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/shared/iac/herocards/ui/heroCardWrapper/IacHeroCardWrapperViewState;", "", InstrumentDetailDuxo.KEY_IAC_HERO_CARD, "Lcom/robinhood/models/db/herocard/IacHeroCard;", "<init>", "(Lcom/robinhood/models/db/herocard/IacHeroCard;)V", "getIacHeroCard", "()Lcom/robinhood/models/db/herocard/IacHeroCard;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-iac-hero-cards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class IacHeroCardWrapperViewState {
    public static final int $stable = 8;
    private final IacHeroCard iacHeroCard;

    /* JADX WARN: Multi-variable type inference failed */
    public IacHeroCardWrapperViewState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ IacHeroCardWrapperViewState copy$default(IacHeroCardWrapperViewState iacHeroCardWrapperViewState, IacHeroCard iacHeroCard, int i, Object obj) {
        if ((i & 1) != 0) {
            iacHeroCard = iacHeroCardWrapperViewState.iacHeroCard;
        }
        return iacHeroCardWrapperViewState.copy(iacHeroCard);
    }

    /* renamed from: component1, reason: from getter */
    public final IacHeroCard getIacHeroCard() {
        return this.iacHeroCard;
    }

    public final IacHeroCardWrapperViewState copy(IacHeroCard iacHeroCard) {
        return new IacHeroCardWrapperViewState(iacHeroCard);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof IacHeroCardWrapperViewState) && Intrinsics.areEqual(this.iacHeroCard, ((IacHeroCardWrapperViewState) other).iacHeroCard);
    }

    public int hashCode() {
        IacHeroCard iacHeroCard = this.iacHeroCard;
        if (iacHeroCard == null) {
            return 0;
        }
        return iacHeroCard.hashCode();
    }

    public String toString() {
        return "IacHeroCardWrapperViewState(iacHeroCard=" + this.iacHeroCard + ")";
    }

    public IacHeroCardWrapperViewState(IacHeroCard iacHeroCard) {
        this.iacHeroCard = iacHeroCard;
    }

    public /* synthetic */ IacHeroCardWrapperViewState(IacHeroCard iacHeroCard, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : iacHeroCard);
    }

    public final IacHeroCard getIacHeroCard() {
        return this.iacHeroCard;
    }
}
