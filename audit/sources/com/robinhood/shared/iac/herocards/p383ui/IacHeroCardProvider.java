package com.robinhood.shared.iac.herocards.p383ui;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.p320db.herocard.IacHeroCard;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IacHeroCardProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u0000 \t2\u00020\u0001:\u0001\tR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0001X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/iac/herocards/ui/IacHeroCardProvider;", "", "card", "Lcom/robinhood/models/db/herocard/IacHeroCard;", "getCard", "()Lcom/robinhood/models/db/herocard/IacHeroCard;", "extras", "getExtras", "()Ljava/lang/Object;", "Companion", "lib-iac-hero-cards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public interface IacHeroCardProvider {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    IacHeroCard getCard();

    Object getExtras();

    /* compiled from: IacHeroCardProvider.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0001¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/shared/iac/herocards/ui/IacHeroCardProvider$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/shared/iac/herocards/ui/IacHeroCardProvider;", "card", "Lcom/robinhood/models/db/herocard/IacHeroCard;", "extras", "lib-iac-hero-cards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public static /* synthetic */ IacHeroCardProvider create$default(Companion companion, IacHeroCard iacHeroCard, Object obj, int i, Object obj2) {
            if ((i & 2) != 0) {
                obj = null;
            }
            return companion.create(iacHeroCard, obj);
        }

        public final IacHeroCardProvider create(final IacHeroCard card, final Object extras) {
            Intrinsics.checkNotNullParameter(card, "card");
            return new IacHeroCardProvider(card, extras) { // from class: com.robinhood.shared.iac.herocards.ui.IacHeroCardProvider$Companion$create$1
                private final IacHeroCard card;
                private final Object extras;

                {
                    this.card = card;
                    this.extras = extras;
                }

                @Override // com.robinhood.shared.iac.herocards.p383ui.IacHeroCardProvider
                public IacHeroCard getCard() {
                    return this.card;
                }

                @Override // com.robinhood.shared.iac.herocards.p383ui.IacHeroCardProvider
                public Object getExtras() {
                    return this.extras;
                }
            };
        }
    }
}
