package com.robinhood.shared.cards.dagger;

import com.robinhood.android.common.util.CardManager;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.shared.cards.CardHelper;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LibCardsModule_CardManagerFactory.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/cards/dagger/LibCardsModule_CardManagerFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/common/util/CardManager;", "cardHelper", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/cards/CardHelper;", "<init>", "(Ljavax/inject/Provider;)V", "get", "Companion", "lib-cards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class LibCardsModule_CardManagerFactory implements Factory<CardManager> {
    private final Provider<CardHelper> cardHelper;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final CardManager cardManager(CardHelper cardHelper) {
        return INSTANCE.cardManager(cardHelper);
    }

    @JvmStatic
    public static final LibCardsModule_CardManagerFactory create(Provider<CardHelper> provider) {
        return INSTANCE.create(provider);
    }

    public LibCardsModule_CardManagerFactory(Provider<CardHelper> cardHelper) {
        Intrinsics.checkNotNullParameter(cardHelper, "cardHelper");
        this.cardHelper = cardHelper;
    }

    @Override // javax.inject.Provider
    public CardManager get() {
        Companion companion = INSTANCE;
        CardHelper cardHelper = this.cardHelper.get();
        Intrinsics.checkNotNullExpressionValue(cardHelper, "get(...)");
        return companion.cardManager(cardHelper);
    }

    /* compiled from: LibCardsModule_CardManagerFactory.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\bH\u0007¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/shared/cards/dagger/LibCardsModule_CardManagerFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/shared/cards/dagger/LibCardsModule_CardManagerFactory;", "cardHelper", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/cards/CardHelper;", "cardManager", "Lcom/robinhood/android/common/util/CardManager;", "lib-cards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final LibCardsModule_CardManagerFactory create(Provider<CardHelper> cardHelper) {
            Intrinsics.checkNotNullParameter(cardHelper, "cardHelper");
            return new LibCardsModule_CardManagerFactory(cardHelper);
        }

        @JvmStatic
        public final CardManager cardManager(CardHelper cardHelper) {
            Intrinsics.checkNotNullParameter(cardHelper, "cardHelper");
            Object objCheckNotNull = Preconditions.checkNotNull(LibCardsModule.INSTANCE.cardManager(cardHelper), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (CardManager) objCheckNotNull;
        }
    }
}
