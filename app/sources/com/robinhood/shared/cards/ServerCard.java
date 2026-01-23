package com.robinhood.shared.cards;

import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.net.Uri;
import android.view.ViewGroup;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.designsystem.style.DirectionOverlay;
import com.robinhood.android.designsystem.style.GoldOverlay;
import com.robinhood.android.lib.creditcard.CreditCardOverlay;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.hammer.android.application.ApplicationComponentManagerHolder;
import com.robinhood.librobinhood.data.store.CardStore;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.prefs.StringPreference;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.shared.cards.NotificationCard;
import com.robinhood.shared.cards.prefs.TopCardRhIdPref;
import com.robinhood.userleap.SurveyManager3;
import com.robinhood.utils.coroutines.scope.RootCoroutineScope;
import com.robinhood.utils.extensions.StringsKt;
import com.robinhood.utils.system.References;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ServerCard.kt */
@Metadata(m3635d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001_B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010Q\u001a\u00020\u00022\u0006\u0010R\u001a\u00020SH\u0016J\u0018\u0010T\u001a\u00020U2\u0006\u00101\u001a\u0002002\u0006\u0010V\u001a\u00020\u0002H\u0016J\b\u0010W\u001a\u00020UH\u0014J\u0010\u0010X\u001a\u00020U2\u0006\u0010\u0003\u001a\u00020\u0004H\u0014J\b\u0010Y\u001a\u00020UH\u0014J\u0013\u0010Z\u001a\u00020\b2\b\u0010[\u001a\u0004\u0018\u00010\\H\u0096\u0002J\b\u0010]\u001a\u00020^H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u001b\u001a\u00020\u001c8\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0000\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001e\u0010#\u001a\u00020$8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001e\u0010)\u001a\u00020*8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R/\u00101\u001a\u0004\u0018\u0001002\b\u0010/\u001a\u0004\u0018\u0001008B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u0014\u00108\u001a\u0002098VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0014\u0010<\u001a\u0002098VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010;R\u0014\u0010>\u001a\u0002098VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010;R\u0016\u0010@\u001a\u0004\u0018\u0001098VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bA\u0010;R\u0016\u0010B\u001a\u0004\u0018\u0001098VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bC\u0010;R\u0014\u0010D\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010\u000eR\u0014\u0010E\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bE\u0010\u000eR\u0014\u0010F\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010\u000eR\u0014\u0010G\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010\u000eR\u0014\u0010H\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bH\u0010\u000eR\u0014\u0010I\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bI\u0010\u000eR\u0014\u0010J\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010\u000eR\u0014\u0010K\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bK\u0010\u000eR\u0014\u0010L\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bL\u0010\u000eR\u0014\u0010M\u001a\u0002098VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bN\u0010;R\u0010\u0010O\u001a\u0004\u0018\u00010PX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006`"}, m3636d2 = {"Lcom/robinhood/shared/cards/ServerCard;", "Lcom/robinhood/shared/cards/BaseAnalyticsNotificationCard;", "Lcom/robinhood/shared/cards/NotificationView;", "context", "Landroid/content/Context;", "card", "Lcom/robinhood/models/card/db/Card;", "showDismissBtn", "", "<init>", "(Landroid/content/Context;Lcom/robinhood/models/card/db/Card;Z)V", "getCard", "()Lcom/robinhood/models/card/db/Card;", "getShowDismissBtn", "()Z", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "getCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "setCoroutineScope", "(Lkotlinx/coroutines/CoroutineScope;)V", "cardStore", "Lcom/robinhood/librobinhood/data/store/CardStore;", "getCardStore", "()Lcom/robinhood/librobinhood/data/store/CardStore;", "setCardStore", "(Lcom/robinhood/librobinhood/data/store/CardStore;)V", "topCardRhIdPref", "Lcom/robinhood/prefs/StringPreference;", "getTopCardRhIdPref$annotations", "()V", "getTopCardRhIdPref", "()Lcom/robinhood/prefs/StringPreference;", "setTopCardRhIdPref", "(Lcom/robinhood/prefs/StringPreference;)V", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "getNavigator", "()Lcom/robinhood/android/navigation/Navigator;", "setNavigator", "(Lcom/robinhood/android/navigation/Navigator;)V", "userLeapManager", "Lcom/robinhood/userleap/UserLeapManager;", "getUserLeapManager", "()Lcom/robinhood/userleap/UserLeapManager;", "setUserLeapManager", "(Lcom/robinhood/userleap/UserLeapManager;)V", "<set-?>", "Lcom/robinhood/shared/cards/NotificationCard$Callbacks;", "callbacks", "getCallbacks", "()Lcom/robinhood/shared/cards/NotificationCard$Callbacks;", "setCallbacks", "(Lcom/robinhood/shared/cards/NotificationCard$Callbacks;)V", "callbacks$delegate", "Lkotlin/properties/ReadWriteProperty;", "cardId", "", "getCardId", "()Ljava/lang/String;", "loadId", "getLoadId", "message", "getMessage", "deeplinkUri", "getDeeplinkUri", "entityId", "getEntityId", "isDismissable", "isClaimableReward", "isClickable", "isCrypto", "isGold", "isGoldSplash", "isSpooky", "isRhdMargin", "isCreditCard", "type", "getType", "clickUri", "Landroid/net/Uri;", "generateView", "parent", "Landroid/view/ViewGroup;", "bind", "", "view", "onImpressionImpl", "onClickedImpl", "onDismissedImpl", "equals", "other", "", "hashCode", "", "ServerCardEntryPoint", "lib-cards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes26.dex */
public class ServerCard extends BaseAnalyticsNotificationCard<NotificationView> {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(ServerCard.class, "callbacks", "getCallbacks()Lcom/robinhood/shared/cards/NotificationCard$Callbacks;", 0))};
    public static final int $stable = 8;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces3 callbacks;
    private final Card card;
    public CardStore cardStore;
    private final Uri clickUri;

    @RootCoroutineScope
    public CoroutineScope coroutineScope;
    public Navigator navigator;
    private final boolean showDismissBtn;
    public StringPreference topCardRhIdPref;
    public SurveyManager3 userLeapManager;

    /* compiled from: ServerCard.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/cards/ServerCard$ServerCardEntryPoint;", "", "inject", "", "obj", "Lcom/robinhood/shared/cards/ServerCard;", "lib-cards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes21.dex */
    public interface ServerCardEntryPoint {
        void inject(ServerCard obj);
    }

    @TopCardRhIdPref
    public static /* synthetic */ void getTopCardRhIdPref$annotations() {
    }

    public final Card getCard() {
        return this.card;
    }

    @Override // com.robinhood.shared.cards.NotificationCard
    public boolean getShowDismissBtn() {
        return this.showDismissBtn;
    }

    public ServerCard(Context context, Card card, boolean z) {
        ComponentCallbacks2 componentCallbacks2;
        Uri uri;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(card, "card");
        this.card = card;
        this.showDismissBtn = z;
        Uri uri2 = null;
        this.callbacks = References.weak$default(null, 1, null);
        if (context instanceof Application) {
            componentCallbacks2 = (Application) context;
        } else {
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
            componentCallbacks2 = (Application) applicationContext;
        }
        ((ServerCardEntryPoint) ((ApplicationComponentManagerHolder) componentCallbacks2).getComponentManager().get()).inject(this);
        String strNullIfEmpty = StringsKt.nullIfEmpty(card.getDeeplinkUri());
        if (strNullIfEmpty != null && (uri = Uri.parse(strNullIfEmpty)) != null && getNavigator().isDeepLinkSupported(uri)) {
            uri2 = uri;
        }
        this.clickUri = uri2;
    }

    public final CoroutineScope getCoroutineScope() {
        CoroutineScope coroutineScope = this.coroutineScope;
        if (coroutineScope != null) {
            return coroutineScope;
        }
        Intrinsics.throwUninitializedPropertyAccessException("coroutineScope");
        return null;
    }

    public final void setCoroutineScope(CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(coroutineScope, "<set-?>");
        this.coroutineScope = coroutineScope;
    }

    public final CardStore getCardStore() {
        CardStore cardStore = this.cardStore;
        if (cardStore != null) {
            return cardStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("cardStore");
        return null;
    }

    public final void setCardStore(CardStore cardStore) {
        Intrinsics.checkNotNullParameter(cardStore, "<set-?>");
        this.cardStore = cardStore;
    }

    public final StringPreference getTopCardRhIdPref() {
        StringPreference stringPreference = this.topCardRhIdPref;
        if (stringPreference != null) {
            return stringPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("topCardRhIdPref");
        return null;
    }

    public final void setTopCardRhIdPref(StringPreference stringPreference) {
        Intrinsics.checkNotNullParameter(stringPreference, "<set-?>");
        this.topCardRhIdPref = stringPreference;
    }

    public final Navigator getNavigator() {
        Navigator navigator = this.navigator;
        if (navigator != null) {
            return navigator;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigator");
        return null;
    }

    public final void setNavigator(Navigator navigator) {
        Intrinsics.checkNotNullParameter(navigator, "<set-?>");
        this.navigator = navigator;
    }

    public final SurveyManager3 getUserLeapManager() {
        SurveyManager3 surveyManager3 = this.userLeapManager;
        if (surveyManager3 != null) {
            return surveyManager3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userLeapManager");
        return null;
    }

    public final void setUserLeapManager(SurveyManager3 surveyManager3) {
        Intrinsics.checkNotNullParameter(surveyManager3, "<set-?>");
        this.userLeapManager = surveyManager3;
    }

    private final NotificationCard.Callbacks getCallbacks() {
        return (NotificationCard.Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    private final void setCallbacks(NotificationCard.Callbacks callbacks) {
        this.callbacks.setValue(this, $$delegatedProperties[0], callbacks);
    }

    @Override // com.robinhood.shared.cards.BaseAnalyticsNotificationCard
    public String getCardId() {
        return this.card.getCardId();
    }

    @Override // com.robinhood.shared.cards.BaseAnalyticsNotificationCard
    public String getLoadId() {
        return this.card.getLoadId();
    }

    @Override // com.robinhood.shared.cards.BaseAnalyticsNotificationCard
    /* renamed from: getMessage */
    public String getReviewSummary() {
        return this.card.getMessage();
    }

    @Override // com.robinhood.shared.cards.BaseAnalyticsNotificationCard
    public String getDeeplinkUri() {
        return this.card.getDeeplinkUri();
    }

    @Override // com.robinhood.shared.cards.BaseAnalyticsNotificationCard
    public String getEntityId() {
        Uri uri;
        Uri uri2;
        if (Intrinsics.areEqual(this.card.getType(), "news")) {
            String deeplinkUri = this.card.getDeeplinkUri();
            String queryParameter = (deeplinkUri == null || (uri2 = Uri.parse(deeplinkUri)) == null) ? null : uri2.getQueryParameter("url");
            if (queryParameter != null && (uri = Uri.parse(queryParameter)) != null) {
                return uri.getLastPathSegment();
            }
        }
        return null;
    }

    @Override // com.robinhood.shared.cards.NotificationCard
    public boolean isDismissable() {
        return !this.card.getFixed();
    }

    @Override // com.robinhood.shared.cards.NotificationCard
    public boolean isClaimableReward() {
        return this.card.isClaimableReward();
    }

    @Override // com.robinhood.shared.cards.NotificationCard
    public boolean isClickable() {
        return this.clickUri != null;
    }

    @Override // com.robinhood.shared.cards.NotificationCard
    public boolean isCrypto() {
        return this.card.isCrypto();
    }

    @Override // com.robinhood.shared.cards.NotificationCard
    public boolean isGold() {
        return this.card.isGold();
    }

    @Override // com.robinhood.shared.cards.NotificationCard
    public boolean isGoldSplash() {
        return this.card.isGoldSplash();
    }

    @Override // com.robinhood.shared.cards.NotificationCard
    public boolean isSpooky() {
        return this.card.isSpooky();
    }

    @Override // com.robinhood.shared.cards.NotificationCard
    public boolean isRhdMargin() {
        return this.card.isRhdMargin();
    }

    @Override // com.robinhood.shared.cards.NotificationCard
    public boolean isCreditCard() {
        return this.card.isCreditCard();
    }

    @Override // com.robinhood.shared.cards.NotificationCard
    public String getType() {
        return this.card.getType();
    }

    @Override // com.robinhood.shared.cards.NotificationCard
    public NotificationView generateView(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        NotificationView notificationView = (NotificationView) (this.card.shouldShowSideImage() ? NotificationViewWithImage.INSTANCE : NotificationView.INSTANCE).inflate(parent);
        ScarletManager scarletManager = ScarletManager2.getScarletManager(notificationView);
        if (isGold()) {
            scarletManager.putOverlay(GoldOverlay.INSTANCE, Boolean.FALSE);
        }
        if (isCrypto() || isSpooky()) {
            scarletManager.putOverlay(DirectionOverlay.NEGATIVE, Boolean.FALSE);
        }
        if (isCreditCard()) {
            scarletManager.putOverlay(CreditCardOverlay.INSTANCE, Boolean.FALSE);
        }
        return notificationView;
    }

    @Override // com.robinhood.shared.cards.NotificationCard
    public void bind(NotificationCard.Callbacks callbacks, NotificationView view) {
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Intrinsics.checkNotNullParameter(view, "view");
        view.bind(this, callbacks);
        setCallbacks(callbacks);
    }

    /* compiled from: ServerCard.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.cards.ServerCard$onImpressionImpl$1", m3645f = "ServerCard.kt", m3646l = {147}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.cards.ServerCard$onImpressionImpl$1 */
    static final class C373621 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C373621(Continuation<? super C373621> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ServerCard.this.new C373621(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C373621) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CardStore cardStore = ServerCard.this.getCardStore();
                Card card = ServerCard.this.getCard();
                this.label = 1;
                if (cardStore.logCardImpression(card, this) == coroutine_suspended) {
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

    @Override // com.robinhood.shared.cards.BaseAnalyticsNotificationCard
    protected void onImpressionImpl() {
        getTopCardRhIdPref().set(this.card.getId());
        BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new C373621(null), 3, null);
    }

    @Override // com.robinhood.shared.cards.BaseAnalyticsNotificationCard
    protected void onClickedImpl(Context context) {
        NotificationCard.Callbacks callbacks;
        Intrinsics.checkNotNullParameter(context, "context");
        if (this.card.isClaimableReward() && (callbacks = getCallbacks()) != null) {
            callbacks.onDismissSelf();
        }
        Uri uri = this.clickUri;
        if (uri != null) {
            Navigator.DefaultImpls.handleDeepLink$default(getNavigator(), context, uri, Boolean.TRUE, null, false, null, 56, null);
        }
        BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new C373602(null), 3, null);
    }

    /* compiled from: ServerCard.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.cards.ServerCard$onClickedImpl$2", m3645f = "ServerCard.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.cards.ServerCard$onClickedImpl$2 */
    static final class C373602 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C373602(Continuation<? super C373602> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ServerCard.this.new C373602(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C373602) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CardStore cardStore = ServerCard.this.getCardStore();
                String id = ServerCard.this.getCard().getId();
                this.label = 1;
                if (cardStore.logCardClick(id, this) == coroutine_suspended) {
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

    /* compiled from: ServerCard.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.cards.ServerCard$onDismissedImpl$1", m3645f = "ServerCard.kt", m3646l = {167}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.cards.ServerCard$onDismissedImpl$1 */
    static final class C373611 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C373611(Continuation<? super C373611> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ServerCard.this.new C373611(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C373611) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            boolean zIsNetworkRelated;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CardStore cardStore = ServerCard.this.getCardStore();
                    String id = ServerCard.this.getCard().getId();
                    this.label = 1;
                    if (cardStore.dismissCard(id, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
            } finally {
                if (!zIsNetworkRelated) {
                }
                return Unit.INSTANCE;
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.shared.cards.BaseAnalyticsNotificationCard
    protected void onDismissedImpl() {
        BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new C373611(null), 3, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(getClass(), other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.robinhood.shared.cards.ServerCard");
        ServerCard serverCard = (ServerCard) other;
        return Intrinsics.areEqual(this.card, serverCard.card) && getShowDismissBtn() == serverCard.getShowDismissBtn();
    }

    public int hashCode() {
        return (this.card.hashCode() * 31) + Boolean.hashCode(getShowDismissBtn());
    }
}
