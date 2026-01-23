package com.robinhood.shared.cards;

import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.extensions.Navigators3;
import com.robinhood.android.util.play.GooglePlay;
import com.robinhood.cards.C31879R;
import com.robinhood.hammer.android.application.ApplicationComponentManagerHolder;
import com.robinhood.prefs.LongPreference;
import com.robinhood.shared.cards.NotificationCard;
import com.robinhood.shared.cards.prefs.PromptedForReviewPref;
import com.robinhood.utils.datetime.Durations;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.system.References;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;
import p479j$.time.Duration;

/* compiled from: PromptForReviewNotificationCard.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 D2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002CDB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010:\u001a\u00020\u00022\u0006\u0010;\u001a\u00020<H\u0016J\u0018\u0010=\u001a\u00020>2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010?\u001a\u00020\u0002H\u0016J\u0010\u0010@\u001a\u00020>2\u0006\u0010\u0003\u001a\u00020\u0004H\u0014J\b\u0010A\u001a\u00020>H\u0014J\b\u0010B\u001a\u00020>H\u0002R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR$\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0000\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR/\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u000e\u0010&\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010'\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\fR\u0014\u0010)\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\fR\u0016\u0010+\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\fR\u0016\u0010-\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\fR\u0014\u0010/\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\u000eR\u0014\u00100\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u0010\u000eR\u0014\u00101\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u0010\u000eR\u0014\u00102\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u0010\u000eR\u0014\u00103\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u0010\u000eR\u0014\u00104\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u0010\u000eR\u0014\u00105\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u0010\u000eR\u0014\u00106\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u0010\u000eR\u0014\u00107\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u0010\u000eR\u0014\u00108\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u0010\f¨\u0006E"}, m3636d2 = {"Lcom/robinhood/shared/cards/PromptForReviewNotificationCard;", "Lcom/robinhood/shared/cards/BaseAnalyticsNotificationCard;", "Landroid/view/View;", "context", "Landroid/content/Context;", "loadId", "", "showDismissBtn", "", "<init>", "(Landroid/content/Context;Ljava/lang/String;Z)V", "getLoadId", "()Ljava/lang/String;", "getShowDismissBtn", "()Z", "promptedForReviewPref", "Lcom/robinhood/prefs/LongPreference;", "getPromptedForReviewPref$annotations", "()V", "getPromptedForReviewPref", "()Lcom/robinhood/prefs/LongPreference;", "setPromptedForReviewPref", "(Lcom/robinhood/prefs/LongPreference;)V", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "getNavigator", "()Lcom/robinhood/android/navigation/Navigator;", "setNavigator", "(Lcom/robinhood/android/navigation/Navigator;)V", "<set-?>", "Lcom/robinhood/shared/cards/NotificationCard$Callbacks;", "callbacks", "getCallbacks", "()Lcom/robinhood/shared/cards/NotificationCard$Callbacks;", "setCallbacks", "(Lcom/robinhood/shared/cards/NotificationCard$Callbacks;)V", "callbacks$delegate", "Lkotlin/properties/ReadWriteProperty;", "reviewSummary", "cardId", "getCardId", "message", "getMessage", "deeplinkUri", "getDeeplinkUri", "entityId", "getEntityId", "isDismissable", "isClaimableReward", "isClickable", "isCrypto", "isGold", "isGoldSplash", "isSpooky", "isRhdMargin", "isCreditCard", "type", "getType", "generateView", "parent", "Landroid/view/ViewGroup;", "bind", "", "view", "onClickedImpl", "onDismissedImpl", "dismissCard", "PromptForReviewNotificationCardEntryPoint", "Companion", "lib-cards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes26.dex */
public final class PromptForReviewNotificationCard extends BaseAnalyticsNotificationCard<View> {
    private static final Duration PROMPT_INTERVAL;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces3 callbacks;
    private final String loadId;
    public Navigator navigator;
    public LongPreference promptedForReviewPref;
    private final String reviewSummary;
    private final boolean showDismissBtn;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(PromptForReviewNotificationCard.class, "callbacks", "getCallbacks()Lcom/robinhood/shared/cards/NotificationCard$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: PromptForReviewNotificationCard.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/cards/PromptForReviewNotificationCard$PromptForReviewNotificationCardEntryPoint;", "", "inject", "", "obj", "Lcom/robinhood/shared/cards/PromptForReviewNotificationCard;", "lib-cards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes21.dex */
    public interface PromptForReviewNotificationCardEntryPoint {
        void inject(PromptForReviewNotificationCard obj);
    }

    @PromptedForReviewPref
    public static /* synthetic */ void getPromptedForReviewPref$annotations() {
    }

    @Override // com.robinhood.shared.cards.BaseAnalyticsNotificationCard
    public String getDeeplinkUri() {
        return null;
    }

    @Override // com.robinhood.shared.cards.BaseAnalyticsNotificationCard
    public String getEntityId() {
        return null;
    }

    @Override // com.robinhood.shared.cards.NotificationCard
    public boolean isClaimableReward() {
        return false;
    }

    @Override // com.robinhood.shared.cards.NotificationCard
    public boolean isClickable() {
        return false;
    }

    @Override // com.robinhood.shared.cards.NotificationCard
    public boolean isCreditCard() {
        return false;
    }

    @Override // com.robinhood.shared.cards.NotificationCard
    public boolean isCrypto() {
        return false;
    }

    @Override // com.robinhood.shared.cards.NotificationCard
    public boolean isDismissable() {
        return true;
    }

    @Override // com.robinhood.shared.cards.NotificationCard
    public boolean isGold() {
        return false;
    }

    @Override // com.robinhood.shared.cards.NotificationCard
    public boolean isGoldSplash() {
        return false;
    }

    @Override // com.robinhood.shared.cards.NotificationCard
    public boolean isRhdMargin() {
        return false;
    }

    @Override // com.robinhood.shared.cards.NotificationCard
    public boolean isSpooky() {
        return false;
    }

    @Override // com.robinhood.shared.cards.BaseAnalyticsNotificationCard
    public String getLoadId() {
        return this.loadId;
    }

    @Override // com.robinhood.shared.cards.NotificationCard
    public boolean getShowDismissBtn() {
        return this.showDismissBtn;
    }

    public PromptForReviewNotificationCard(Context context, String loadId, boolean z) {
        ComponentCallbacks2 componentCallbacks2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(loadId, "loadId");
        this.loadId = loadId;
        this.showDismissBtn = z;
        this.callbacks = References.weak$default(null, 1, null);
        String string2 = context.getString(C31879R.string.card_review_summary);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        this.reviewSummary = string2;
        if (context instanceof Application) {
            componentCallbacks2 = (Application) context;
        } else {
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
            componentCallbacks2 = (Application) applicationContext;
        }
        ((PromptForReviewNotificationCardEntryPoint) ((ApplicationComponentManagerHolder) componentCallbacks2).getComponentManager().get()).inject(this);
    }

    public final LongPreference getPromptedForReviewPref() {
        LongPreference longPreference = this.promptedForReviewPref;
        if (longPreference != null) {
            return longPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("promptedForReviewPref");
        return null;
    }

    public final void setPromptedForReviewPref(LongPreference longPreference) {
        Intrinsics.checkNotNullParameter(longPreference, "<set-?>");
        this.promptedForReviewPref = longPreference;
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

    static {
        Duration durationMultipliedBy = Durations.INSTANCE.getONE_DAY().multipliedBy(100L);
        Intrinsics.checkNotNullExpressionValue(durationMultipliedBy, "multipliedBy(...)");
        PROMPT_INTERVAL = durationMultipliedBy;
    }

    private final NotificationCard.Callbacks getCallbacks() {
        return (NotificationCard.Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    private final void setCallbacks(NotificationCard.Callbacks callbacks) {
        this.callbacks.setValue(this, $$delegatedProperties[0], callbacks);
    }

    @Override // com.robinhood.shared.cards.BaseAnalyticsNotificationCard
    public String getCardId() {
        return "custom_review_prompt";
    }

    @Override // com.robinhood.shared.cards.BaseAnalyticsNotificationCard
    /* renamed from: getMessage, reason: from getter */
    public String getReviewSummary() {
        return this.reviewSummary;
    }

    @Override // com.robinhood.shared.cards.NotificationCard
    public String getType() {
        return "custom_prompt_for_review";
    }

    @Override // com.robinhood.shared.cards.NotificationCard
    public View generateView(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return ViewGroups.inflate$default(parent, C31879R.layout.prompt_for_review_card, false, 2, null);
    }

    @Override // com.robinhood.shared.cards.NotificationCard
    public void bind(NotificationCard.Callbacks callbacks, final View view) {
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Intrinsics.checkNotNullParameter(view, "view");
        setCallbacks(callbacks);
        View viewFindViewById = view.findViewById(C31879R.id.prompt_for_review_negative_btn);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        OnClickListeners.onClick(viewFindViewById, new Function0() { // from class: com.robinhood.shared.cards.PromptForReviewNotificationCard$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PromptForReviewNotificationCard.bind$lambda$0(view, this);
            }
        });
        View viewFindViewById2 = view.findViewById(C31879R.id.prompt_for_review_positive_btn);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        OnClickListeners.onClick(viewFindViewById2, new Function0() { // from class: com.robinhood.shared.cards.PromptForReviewNotificationCard$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PromptForReviewNotificationCard.bind$lambda$1(this.f$0, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$0(View view, PromptForReviewNotificationCard promptForReviewNotificationCard) {
        Context context = view.getContext();
        Navigator navigator = promptForReviewNotificationCard.getNavigator();
        Context context2 = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        context.startActivity(Navigators3.createContactSupportTriageIntent$default(navigator, context2, null, "75", null, null, true, 26, null));
        promptForReviewNotificationCard.dismissCard();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$1(PromptForReviewNotificationCard promptForReviewNotificationCard, View view) {
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        promptForReviewNotificationCard.onClicked(context);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.shared.cards.BaseAnalyticsNotificationCard
    protected void onClickedImpl(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        GooglePlay.INSTANCE.launchStore(context);
        dismissCard();
    }

    @Override // com.robinhood.shared.cards.BaseAnalyticsNotificationCard
    protected void onDismissedImpl() {
        getPromptedForReviewPref().set(System.currentTimeMillis());
    }

    private final void dismissCard() {
        getPromptedForReviewPref().set(System.currentTimeMillis());
        NotificationCard.Callbacks callbacks = getCallbacks();
        Intrinsics.checkNotNull(callbacks);
        callbacks.onDismissSelf();
    }

    /* compiled from: PromptForReviewNotificationCard.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/shared/cards/PromptForReviewNotificationCard$Companion;", "", "<init>", "()V", "j$/time/Duration", "PROMPT_INTERVAL", "Lj$/time/Duration;", "getPROMPT_INTERVAL", "()Lj$/time/Duration;", "lib-cards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Duration getPROMPT_INTERVAL() {
            return PromptForReviewNotificationCard.PROMPT_INTERVAL;
        }
    }
}
