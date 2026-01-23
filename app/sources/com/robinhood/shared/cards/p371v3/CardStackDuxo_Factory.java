package com.robinhood.shared.cards.p371v3;

import android.content.Context;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.CardStore;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.cards.CardHelper;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CardStackDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B[\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/shared/cards/v3/CardStackDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/cards/v3/CardStackDuxo;", "duxoBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/shared/cards/v3/CardStackStateProvider;", "appContext", "Landroid/content/Context;", "cardHelper", "Lcom/robinhood/shared/cards/CardHelper;", "cardStore", "Lcom/robinhood/librobinhood/data/store/CardStore;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-cards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class CardStackDuxo_Factory implements Factory<CardStackDuxo> {
    private final Provider<Context> appContext;
    private final Provider<AppType> appType;
    private final Provider<CardHelper> cardHelper;
    private final Provider<CardStore> cardStore;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<CardStackDuxo4> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final CardStackDuxo_Factory create(Provider<DuxoBundle> provider, Provider<CardStackDuxo4> provider2, Provider<Context> provider3, Provider<CardHelper> provider4, Provider<CardStore> provider5, Provider<AppType> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final CardStackDuxo newInstance(DuxoBundle duxoBundle, CardStackDuxo4 cardStackDuxo4, Context context, CardHelper cardHelper, CardStore cardStore, AppType appType) {
        return INSTANCE.newInstance(duxoBundle, cardStackDuxo4, context, cardHelper, cardStore, appType);
    }

    public CardStackDuxo_Factory(Provider<DuxoBundle> duxoBundle, Provider<CardStackDuxo4> stateProvider, Provider<Context> appContext, Provider<CardHelper> cardHelper, Provider<CardStore> cardStore, Provider<AppType> appType) {
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(cardHelper, "cardHelper");
        Intrinsics.checkNotNullParameter(cardStore, "cardStore");
        Intrinsics.checkNotNullParameter(appType, "appType");
        this.duxoBundle = duxoBundle;
        this.stateProvider = stateProvider;
        this.appContext = appContext;
        this.cardHelper = cardHelper;
        this.cardStore = cardStore;
        this.appType = appType;
    }

    @Override // javax.inject.Provider
    public CardStackDuxo get() {
        Companion companion = INSTANCE;
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        CardStackDuxo4 cardStackDuxo4 = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(cardStackDuxo4, "get(...)");
        Context context = this.appContext.get();
        Intrinsics.checkNotNullExpressionValue(context, "get(...)");
        CardHelper cardHelper = this.cardHelper.get();
        Intrinsics.checkNotNullExpressionValue(cardHelper, "get(...)");
        CardStore cardStore = this.cardStore.get();
        Intrinsics.checkNotNullExpressionValue(cardStore, "get(...)");
        AppType appType = this.appType.get();
        Intrinsics.checkNotNullExpressionValue(appType, "get(...)");
        return companion.newInstance(duxoBundle, cardStackDuxo4, context, cardHelper, cardStore, appType);
    }

    /* compiled from: CardStackDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\\\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007H\u0007J8\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/shared/cards/v3/CardStackDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/shared/cards/v3/CardStackDuxo_Factory;", "duxoBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/shared/cards/v3/CardStackStateProvider;", "appContext", "Landroid/content/Context;", "cardHelper", "Lcom/robinhood/shared/cards/CardHelper;", "cardStore", "Lcom/robinhood/librobinhood/data/store/CardStore;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "newInstance", "Lcom/robinhood/shared/cards/v3/CardStackDuxo;", "lib-cards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CardStackDuxo_Factory create(Provider<DuxoBundle> duxoBundle, Provider<CardStackDuxo4> stateProvider, Provider<Context> appContext, Provider<CardHelper> cardHelper, Provider<CardStore> cardStore, Provider<AppType> appType) {
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(appContext, "appContext");
            Intrinsics.checkNotNullParameter(cardHelper, "cardHelper");
            Intrinsics.checkNotNullParameter(cardStore, "cardStore");
            Intrinsics.checkNotNullParameter(appType, "appType");
            return new CardStackDuxo_Factory(duxoBundle, stateProvider, appContext, cardHelper, cardStore, appType);
        }

        @JvmStatic
        public final CardStackDuxo newInstance(DuxoBundle duxoBundle, CardStackDuxo4 stateProvider, Context appContext, CardHelper cardHelper, CardStore cardStore, AppType appType) {
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(appContext, "appContext");
            Intrinsics.checkNotNullParameter(cardHelper, "cardHelper");
            Intrinsics.checkNotNullParameter(cardStore, "cardStore");
            Intrinsics.checkNotNullParameter(appType, "appType");
            return new CardStackDuxo(duxoBundle, stateProvider, appContext, cardHelper, cardStore, appType);
        }
    }
}
