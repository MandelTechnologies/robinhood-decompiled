package com.robinhood.shared.cards;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.util.ExponentialDecayBounceInterpolator;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.common.util.extensions.TemporaryServerToBentoColorMapper2;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.animation.CircularReveal;
import com.robinhood.android.designsystem.style.DirectionOverlay;
import com.robinhood.android.designsystem.style.GoldOverlay;
import com.robinhood.android.lib.creditcard.CreditCardOverlay;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.cards.C31879R;
import com.robinhood.disposer.DisposerKt;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.prefs.StringPreference;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.ResourceValue;
import com.robinhood.scarlet.util.resource.SelectorResource;
import com.robinhood.shared.cards.NotificationCard;
import com.robinhood.shared.cards.StackTouchListener;
import com.robinhood.shared.cards.prefs.TopCardRhIdPref;
import com.robinhood.utils.extensions.Disposable4;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.lifecycle.ContextLifecycles;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.PrimitiveIterators6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* compiled from: CardStack.kt */
@Metadata(m3635d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 [2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001[B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ(\u00101\u001a\u0002022\b\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010#\u001a\u00020\u00012\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020%J\"\u00103\u001a\u0002022\u0010\u0010'\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030)0(2\b\b\u0002\u00104\u001a\u00020\u0019J\b\u00105\u001a\u000202H\u0014J\u0010\u00106\u001a\u0002022\u0006\u00107\u001a\u00020\u0019H\u0003J\u0016\u00108\u001a\b\u0012\u0002\b\u0003\u0018\u00010)2\u0006\u00109\u001a\u00020 H\u0002J\b\u0010:\u001a\u000202H\u0002J\u0010\u0010;\u001a\u0002022\u0006\u0010<\u001a\u00020 H\u0002J\u0012\u0010=\u001a\u00020 2\b\u0010>\u001a\u0004\u0018\u00010?H\u0002J\u0012\u0010@\u001a\u00020\u00192\b\u0010>\u001a\u0004\u0018\u00010?H\u0016J\b\u0010A\u001a\u000202H\u0016J\u0012\u0010B\u001a\u00020\u00192\b\u0010>\u001a\u0004\u0018\u00010?H\u0016J\u0010\u0010C\u001a\u0002022\u0006\u0010D\u001a\u00020EH\u0016J\u0018\u0010F\u001a\u0002022\u0006\u0010G\u001a\u00020\u001b2\u0006\u0010>\u001a\u00020?H\u0016J \u0010H\u001a\u0002022\u0006\u0010G\u001a\u00020\u001b2\u0006\u0010>\u001a\u00020?2\u0006\u0010I\u001a\u00020\u0019H\u0016J\u0018\u0010J\u001a\u0002022\u0006\u0010G\u001a\u00020\u001b2\u0006\u0010>\u001a\u00020?H\u0016J\u001a\u0010K\u001a\u0002022\u0006\u0010G\u001a\u00020\u001b2\b\u0010>\u001a\u0004\u0018\u00010?H\u0016J\b\u0010L\u001a\u000202H\u0016J\u0010\u0010M\u001a\u0002022\u0006\u0010N\u001a\u00020OH\u0016J\b\u0010P\u001a\u000202H\u0002J\u001e\u0010Q\u001a\u0002022\u0006\u0010R\u001a\u00020S2\f\u0010T\u001a\b\u0012\u0004\u0012\u0002020UH\u0002J(\u0010V\u001a\u0002022\u0006\u0010W\u001a\u00020 2\u0006\u0010X\u001a\u00020 2\u0006\u0010Y\u001a\u00020 2\u0006\u0010Z\u001a\u00020 H\u0002R$\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0000\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010%X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010'\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030)\u0018\u00010(X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010*\u001a\u0004\u0018\u00010+X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010,\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u0010/\u001a\u00020 8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u0010.¨\u0006\\"}, m3636d2 = {"Lcom/robinhood/shared/cards/CardStack;", "Landroid/widget/FrameLayout;", "Lcom/robinhood/shared/cards/StackTouchListener$TouchCallbacks;", "Lcom/robinhood/shared/cards/NotificationCard$Callbacks;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "topCardRhIdPref", "Lcom/robinhood/prefs/StringPreference;", "getTopCardRhIdPref$annotations", "()V", "getTopCardRhIdPref", "()Lcom/robinhood/prefs/StringPreference;", "setTopCardRhIdPref", "(Lcom/robinhood/prefs/StringPreference;)V", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "canTopCardBounce", "", "topView", "Landroid/view/View;", "bottomView", "animationContainer", "Landroidx/cardview/widget/CardView;", "adapterIndex", "", "stack", "Lcom/robinhood/shared/cards/Stack;", "unreadCountContainer", "unreadCountTxt", "Landroid/widget/TextView;", "goldSplashUnreadCountTxt", "notificationCards", "", "Lcom/robinhood/shared/cards/NotificationCard;", "bounceDisposable", "Lio/reactivex/disposables/Disposable;", "numCards", "getNumCards", "()I", "numRemainingCards", "getNumRemainingCards", "bind", "", "bindCards", "ignoreTopCardPreference", "onAttachedToWindow", "populate", "logImpression", "getNotificationCard", "position", "startBounceAnimation", "setUnreadCount", "count", "getPosition", "token", "", "canDismiss", "onTouchInitiated", "canClick", "onAnimationStep", "fraction", "", "onDismissing", "view", "onDismissed", "shouldLogEvent", "onCanceled", "onClicked", "onDismissSelf", "onDismissButtonTap", "notificationCard", "Lcom/robinhood/shared/cards/ServerCard;", "runCompletionAnimation", "runAnimation", "imageView", "Landroid/widget/ImageView;", "onHidden", "Lkotlin/Function0;", "onAnimationEnded", "centerX", "centerY", "width", "radius", "Companion", "lib-cards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes26.dex */
public final class CardStack extends Hammer_CardStack implements StackTouchListener.TouchCallbacks, NotificationCard.Callbacks {
    private static final String EMPTY_VIEW_ID = "emptyView";
    private static final float MIN_ALPHA = 0.25f;
    private static final float MIN_SCALE = 0.9f;
    private int adapterIndex;
    public AnalyticsLogger analytics;
    private CardView animationContainer;
    private View bottomView;
    private Disposable bounceDisposable;
    private boolean canTopCardBounce;
    private TextView goldSplashUnreadCountTxt;
    private List<? extends NotificationCard<?>> notificationCards;
    private Stack stack;
    public StringPreference topCardRhIdPref;
    private View topView;
    private FrameLayout unreadCountContainer;
    private TextView unreadCountTxt;
    public static final int $stable = 8;

    @TopCardRhIdPref
    public static /* synthetic */ void getTopCardRhIdPref$annotations() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardStack(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        setClipChildren(false);
        setClipToPadding(false);
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

    public final AnalyticsLogger getAnalytics() {
        AnalyticsLogger analyticsLogger = this.analytics;
        if (analyticsLogger != null) {
            return analyticsLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analytics");
        return null;
    }

    public final void setAnalytics(AnalyticsLogger analyticsLogger) {
        Intrinsics.checkNotNullParameter(analyticsLogger, "<set-?>");
        this.analytics = analyticsLogger;
    }

    public final int getNumCards() {
        List<? extends NotificationCard<?>> list = this.notificationCards;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    private final int getNumRemainingCards() {
        return getNumCards() - this.adapterIndex;
    }

    public final void bind(Stack stack, FrameLayout unreadCountContainer, TextView unreadCountTxt, TextView goldSplashUnreadCountTxt) {
        Intrinsics.checkNotNullParameter(unreadCountContainer, "unreadCountContainer");
        Intrinsics.checkNotNullParameter(unreadCountTxt, "unreadCountTxt");
        Intrinsics.checkNotNullParameter(goldSplashUnreadCountTxt, "goldSplashUnreadCountTxt");
        this.stack = stack;
        this.unreadCountContainer = unreadCountContainer;
        this.unreadCountTxt = unreadCountTxt;
        this.goldSplashUnreadCountTxt = goldSplashUnreadCountTxt;
        SelectorResource.Companion companion = SelectorResource.INSTANCE;
        ResourceType.COLOR color = ResourceType.COLOR.INSTANCE;
        ScarletManager2.overrideAttribute(goldSplashUnreadCountTxt, R.attr.backgroundTint, TemporaryServerToBentoColorMapper2.dayNightColorSelector(companion, new ResourceValue(color, Integer.valueOf(getContext().getColor(C20690R.color.mobius_black))), new ResourceValue(color, Integer.valueOf(getContext().getColor(C20690R.color.mobius_gold)))));
        ScarletManager2.overrideAttribute(goldSplashUnreadCountTxt, R.attr.textColor, TemporaryServerToBentoColorMapper2.dayNightColorSelector(companion, new ResourceValue(color, Integer.valueOf(getContext().getColor(C20690R.color.mobius_white))), new ResourceValue(color, Integer.valueOf(getContext().getColor(C20690R.color.mobius_black)))));
        OnClickListeners.onClick(unreadCountContainer, new C373541(this));
    }

    /* compiled from: CardStack.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.cards.CardStack$bind$1 */
    /* synthetic */ class C373541 extends FunctionReferenceImpl implements Function0<Unit> {
        C373541(Object obj) {
            super(0, obj, CardStack.class, "onDismissSelf", "onDismissSelf()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((CardStack) this.receiver).onDismissSelf();
        }
    }

    public static /* synthetic */ void bindCards$default(CardStack cardStack, List list, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        cardStack.bindCards(list, z);
    }

    public final void bindCards(List<? extends NotificationCard<?>> notificationCards, boolean ignoreTopCardPreference) {
        int size;
        Intrinsics.checkNotNullParameter(notificationCards, "notificationCards");
        this.notificationCards = notificationCards;
        if (ignoreTopCardPreference) {
            size = 0;
        } else {
            size = Intrinsics.areEqual(getTopCardRhIdPref().get(), EMPTY_VIEW_ID) ? notificationCards.size() : CardHelper.INSTANCE.getTopCardIndex(getTopCardRhIdPref().get(), notificationCards);
        }
        this.adapterIndex = size;
        populate(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        populate(true);
        startBounceAnimation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"ClickableViewAccessibility"})
    public final void populate(boolean logImpression) {
        boolean z;
        NotificationCard<?> notificationCard;
        removeAllViews();
        List<? extends NotificationCard<?>> list = this.notificationCards;
        if (list == null) {
            return;
        }
        int i = this.adapterIndex;
        int i2 = i + 2;
        int size = list.size();
        setUnreadCount(size - i);
        Stack stack = this.stack;
        Intrinsics.checkNotNull(stack);
        while (true) {
            z = false;
            if (i >= size || i >= i2) {
                break;
            }
            NotificationCard<?> notificationCard2 = list.get(i);
            Intrinsics.checkNotNull(notificationCard2, "null cannot be cast to non-null type com.robinhood.shared.cards.NotificationCard<android.view.View>");
            NotificationCard<?> notificationCard3 = notificationCard2;
            View viewGenerateView = notificationCard3.generateView(this);
            notificationCard3.bind(stack.getCardStack(), viewGenerateView);
            viewGenerateView.setTag(Integer.valueOf(i));
            addView(viewGenerateView, 0);
            i++;
        }
        int childCount = getChildCount();
        View childAt = getChildAt(childCount - 1);
        this.topView = childAt;
        if (childAt != null) {
            childAt.setOnTouchListener(new StackTouchListener(childAt, childAt, this));
            notificationCard = getNotificationCard(this.adapterIndex);
            if (notificationCard != null && logImpression) {
                notificationCard.onImpression();
            }
            childAt.setElevation(getResources().getDimension(C13997R.dimen.rds_spacing_xxsmall));
        } else {
            notificationCard = null;
        }
        View childAt2 = getChildAt(childCount - 2);
        this.bottomView = childAt2;
        if (childAt2 != null) {
            Intrinsics.checkNotNull(childAt2);
            childAt2.setVisibility(4);
            View view = this.bottomView;
            Intrinsics.checkNotNull(view);
            view.setScaleX(0.9f);
            View view2 = this.bottomView;
            Intrinsics.checkNotNull(view2);
            view2.setScaleY(0.9f);
            View view3 = this.bottomView;
            Intrinsics.checkNotNull(view3);
            view3.setAlpha(0.25f);
        }
        if (childAt == null && this.bottomView == null) {
            stack.showEmptyView();
            getTopCardRhIdPref().set(EMPTY_VIEW_ID);
        } else {
            stack.showCardStack();
        }
        TextView textView = this.unreadCountTxt;
        Intrinsics.checkNotNull(textView);
        Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ScarletManager scarletManager = ScarletManager2.getScarletManager(context);
        if (notificationCard != null) {
            if (notificationCard.isGold()) {
                ScarletManager.putOverlay$default(scarletManager, GoldOverlay.INSTANCE, null, 2, null);
            } else {
                ScarletManager.removeOverlay$default(scarletManager, GoldOverlay.INSTANCE.getPriority(), null, 2, null);
            }
            if (notificationCard.isCrypto() || notificationCard.isSpooky()) {
                ScarletManager.putOverlay$default(scarletManager, DirectionOverlay.NEGATIVE, null, 2, null);
            } else {
                ScarletManager.removeOverlay$default(scarletManager, DirectionOverlay.NEGATIVE.getPriority(), null, 2, null);
            }
            if (notificationCard.isCreditCard()) {
                ScarletManager.putOverlay$default(scarletManager, CreditCardOverlay.INSTANCE, null, 2, null);
            } else {
                ScarletManager.removeOverlay$default(scarletManager, CreditCardOverlay.INSTANCE.getPriority(), null, 2, null);
            }
            TextView textView2 = this.goldSplashUnreadCountTxt;
            if (textView2 != null) {
                textView2.setVisibility(notificationCard.isGoldSplash() ? 0 : 8);
            }
        }
        if (notificationCard != null && notificationCard.getShouldBounce()) {
            z = true;
        }
        this.canTopCardBounce = z;
        startBounceAnimation();
    }

    private final NotificationCard<?> getNotificationCard(int position) {
        List<? extends NotificationCard<?>> list = this.notificationCards;
        if (list != null) {
            return (NotificationCard) CollectionsKt.getOrNull(list, position);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void startBounceAnimation() {
        if (this.canTopCardBounce) {
            if (this.bounceDisposable == null) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                AppCompatActivity appCompatActivityRequireActivityBaseContext = BaseContexts.requireActivityBaseContext(context);
                Intrinsics.checkNotNull(appCompatActivityRequireActivityBaseContext, "null cannot be cast to non-null type com.robinhood.android.common.ui.BaseActivity");
                BaseActivity baseActivity = (BaseActivity) appCompatActivityRequireActivityBaseContext;
                Boolean boolIsResumed = ContextLifecycles.isResumed(baseActivity);
                if (boolIsResumed != null && boolIsResumed.booleanValue()) {
                    final ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    valueAnimatorOfFloat.setInterpolator(new ExponentialDecayBounceInterpolator(0.2f, 3.0f, 3));
                    valueAnimatorOfFloat.setDuration(1000L);
                    final View view = this.topView;
                    valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.robinhood.shared.cards.CardStack.startBounceAnimation.1
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            Intrinsics.checkNotNullParameter(valueAnimator, "valueAnimator");
                            float animatedFraction = valueAnimator.getAnimatedFraction();
                            View view2 = view;
                            Intrinsics.checkNotNull(view2);
                            view2.setTranslationX(view.getWidth() * animatedFraction);
                            this.onAnimationStep(animatedFraction);
                        }
                    });
                    Observable<Long> observableDoOnDispose = Observable.interval(2L, 6L, TimeUnit.SECONDS).doOnDispose(new Action() { // from class: com.robinhood.shared.cards.CardStack.startBounceAnimation.2
                        @Override // io.reactivex.functions.Action
                        public final void run() {
                            valueAnimatorOfFloat.cancel();
                            this.bounceDisposable = null;
                        }
                    });
                    Intrinsics.checkNotNullExpressionValue(observableDoOnDispose, "doOnDispose(...)");
                    this.bounceDisposable = DisposerKt.bindTo$default(ObservablesAndroid.observeOnMainThread(observableDoOnDispose), baseActivity.getLifecycleEvents(), (LifecycleEvent) null, 2, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.cards.CardStack$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return CardStack.startBounceAnimation$lambda$0(valueAnimatorOfFloat, (Long) obj);
                        }
                    });
                }
            }
        } else {
            Disposable4.disposeSafe(this.bounceDisposable);
            this.bounceDisposable = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startBounceAnimation$lambda$0(ValueAnimator valueAnimator, Long l) {
        valueAnimator.start();
        return Unit.INSTANCE;
    }

    private final void setUnreadCount(int count) {
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        ViewPropertyAnimator viewPropertyAnimatorScaleX;
        if (count > 1) {
            TextView textView = this.unreadCountTxt;
            if (textView != null) {
                textView.setText(Formats.getIntegerFormat().format(Integer.valueOf(count)));
            }
            TextView textView2 = this.goldSplashUnreadCountTxt;
            if (textView2 != null) {
                textView2.setText(Formats.getIntegerFormat().format(Integer.valueOf(count)));
            }
            FrameLayout frameLayout = this.unreadCountContainer;
            if (frameLayout == null || (viewPropertyAnimatorAnimate = frameLayout.animate()) == null || (viewPropertyAnimatorScaleX = viewPropertyAnimatorAnimate.scaleX(1.0f)) == null) {
                return;
            }
            viewPropertyAnimatorScaleX.scaleY(1.0f);
            return;
        }
        FrameLayout frameLayout2 = this.unreadCountContainer;
        if (frameLayout2 != null) {
            frameLayout2.setScaleX(0.0f);
        }
        FrameLayout frameLayout3 = this.unreadCountContainer;
        if (frameLayout3 != null) {
            frameLayout3.setScaleY(0.0f);
        }
    }

    private final int getPosition(Object token) {
        Intrinsics.checkNotNull(token, "null cannot be cast to non-null type android.view.View");
        Object tag = ((View) token).getTag();
        Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) tag).intValue();
    }

    @Override // com.robinhood.shared.cards.SwipeDismissTouchListener.DismissCallbacks
    public boolean canDismiss(Object token) {
        NotificationCard<?> notificationCard = getNotificationCard(getPosition(token));
        return notificationCard == null || notificationCard.isDismissable();
    }

    @Override // com.robinhood.shared.cards.SwipeDismissTouchListener.DismissCallbacks
    public void onTouchInitiated() {
        Disposable4.disposeSafe(this.bounceDisposable);
        this.bounceDisposable = null;
    }

    @Override // com.robinhood.shared.cards.StackTouchListener.TouchCallbacks
    public boolean canClick(Object token) {
        NotificationCard<?> notificationCard = getNotificationCard(getPosition(token));
        return notificationCard != null && notificationCard.isClickable();
    }

    @Override // com.robinhood.shared.cards.SwipeDismissTouchListener.DismissCallbacks
    public void onAnimationStep(float fraction) {
        View view = this.bottomView;
        if (view != null) {
            view.setVisibility(0);
            float f = (0.100000024f * fraction) + 0.9f;
            view.setScaleX(f);
            view.setScaleY(f);
            view.setAlpha((0.75f * fraction) + 0.25f);
            view.setTranslationZ(fraction * 1.0f);
        }
        float f2 = getNumRemainingCards() > 1 ? 1.0f - fraction : 0.0f;
        FrameLayout frameLayout = this.unreadCountContainer;
        if (frameLayout != null) {
            frameLayout.setScaleX(f2);
        }
        FrameLayout frameLayout2 = this.unreadCountContainer;
        if (frameLayout2 != null) {
            frameLayout2.setScaleY(f2);
        }
    }

    @Override // com.robinhood.shared.cards.SwipeDismissTouchListener.DismissCallbacks
    public void onDismissing(View view, Object token) {
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        ViewPropertyAnimator viewPropertyAnimatorScaleX;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(token, "token");
        View view2 = this.bottomView;
        if (view2 != null) {
            view2.setVisibility(0);
            view2.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f);
        }
        FrameLayout frameLayout = this.unreadCountContainer;
        if (frameLayout == null || (viewPropertyAnimatorAnimate = frameLayout.animate()) == null || (viewPropertyAnimatorScaleX = viewPropertyAnimatorAnimate.scaleX(0.0f)) == null) {
            return;
        }
        viewPropertyAnimatorScaleX.scaleY(0.0f);
    }

    @Override // com.robinhood.shared.cards.SwipeDismissTouchListener.DismissCallbacks
    public void onDismissed(View view, Object token, boolean shouldLogEvent) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(token, "token");
        NotificationCard<?> notificationCard = getNotificationCard(getPosition(token));
        if (notificationCard != null) {
            notificationCard.onDismissed(shouldLogEvent);
        }
        this.adapterIndex++;
        if (isAttachedToWindow()) {
            List<? extends NotificationCard<?>> list = this.notificationCards;
            Intrinsics.checkNotNull(list);
            if (list.size() == this.adapterIndex) {
                runCompletionAnimation();
                getAnalytics().logNotificationStack(AnalyticsStrings.NOTIF_STACK_EVENT_CARD_STACK_COLLAPSE, 0, null, null, null, null, null, null);
            } else {
                populate(true);
            }
        }
    }

    @Override // com.robinhood.shared.cards.SwipeDismissTouchListener.DismissCallbacks
    public void onCanceled(View view, Object token) {
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        ViewPropertyAnimator viewPropertyAnimatorScaleX;
        ViewPropertyAnimator viewPropertyAnimatorScaleY;
        ViewPropertyAnimator viewPropertyAnimatorAlpha;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(token, "token");
        final View view2 = this.bottomView;
        if (view2 != null && (viewPropertyAnimatorAnimate = view2.animate()) != null && (viewPropertyAnimatorScaleX = viewPropertyAnimatorAnimate.scaleX(0.9f)) != null && (viewPropertyAnimatorScaleY = viewPropertyAnimatorScaleX.scaleY(0.9f)) != null && (viewPropertyAnimatorAlpha = viewPropertyAnimatorScaleY.alpha(0.25f)) != null) {
            viewPropertyAnimatorAlpha.withEndAction(new Runnable() { // from class: com.robinhood.shared.cards.CardStack.onCanceled.1
                @Override // java.lang.Runnable
                public final void run() {
                    view2.setVisibility(4);
                    this.startBounceAnimation();
                }
            });
        }
        List<? extends NotificationCard<?>> list = this.notificationCards;
        Intrinsics.checkNotNull(list);
        setUnreadCount(list.size() - this.adapterIndex);
    }

    @Override // com.robinhood.shared.cards.StackTouchListener.TouchCallbacks
    public void onClicked(View view, Object token) {
        Intrinsics.checkNotNullParameter(view, "view");
        NotificationCard<?> notificationCard = getNotificationCard(getPosition(token));
        if (notificationCard != null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            notificationCard.onClicked(context);
        }
    }

    @Override // com.robinhood.shared.cards.NotificationCard.Callbacks
    public void onDismissSelf() {
        final View view = this.topView;
        if (view == null || !canDismiss(view)) {
            return;
        }
        view.animate().translationX(-view.getWidth()).withEndAction(new Runnable() { // from class: com.robinhood.shared.cards.CardStack.onDismissSelf.1
            @Override // java.lang.Runnable
            public final void run() {
                CardStack cardStack = CardStack.this;
                View view2 = view;
                cardStack.onDismissed(view2, view2, false);
            }
        });
        onDismissing(view, view);
    }

    @Override // com.robinhood.shared.cards.NotificationCard.Callbacks
    public void onDismissButtonTap(ServerCard notificationCard) {
        Intrinsics.checkNotNullParameter(notificationCard, "notificationCard");
        getAnalytics().logNotificationStack(AnalyticsStrings.NOTIF_STACK_EVENT_DISMISS_BUTTON_TAP, getNumRemainingCards(), notificationCard.getType(), notificationCard.getCardId(), notificationCard.getLoadId(), notificationCard.getReviewSummary(), notificationCard.getDeeplinkUri(), notificationCard.getEntityId());
    }

    private final void runCompletionAnimation() {
        removeAllViews();
        if (this.animationContainer == null) {
            View viewInflate$default = ViewGroups.inflate$default(this, C31879R.layout.card_completion_animation_view, false, 2, null);
            Intrinsics.checkNotNull(viewInflate$default, "null cannot be cast to non-null type androidx.cardview.widget.CardView");
            this.animationContainer = (CardView) viewInflate$default;
        }
        CardView cardView = this.animationContainer;
        Intrinsics.checkNotNull(cardView);
        final ImageView imageView = (ImageView) cardView.findViewById(C31879R.id.animation_icon);
        imageView.setVisibility(4);
        addView(cardView);
        FrameLayout frameLayout = this.unreadCountContainer;
        Intrinsics.checkNotNull(frameLayout);
        final int width = frameLayout.getWidth() / 2;
        FrameLayout frameLayout2 = this.unreadCountContainer;
        Intrinsics.checkNotNull(frameLayout2);
        final int left = frameLayout2.getLeft() + width;
        FrameLayout frameLayout3 = this.unreadCountContainer;
        Intrinsics.checkNotNull(frameLayout3);
        final int top = frameLayout3.getTop() + width;
        final int width2 = getWidth();
        CircularReveal.createCircularReveal(cardView, left, top, width, width2).setDuration(200L).start();
        Intrinsics.checkNotNull(imageView);
        imageView.postDelayed(new Runnable() { // from class: com.robinhood.shared.cards.CardStack$runCompletionAnimation$$inlined$postDelayed$1
            @Override // java.lang.Runnable
            public final void run() {
                CardStack cardStack = this.this$0;
                Intrinsics.checkNotNull(imageView);
                ImageView imageView2 = imageView;
                final CardStack cardStack2 = this.this$0;
                final int i = left;
                final int i2 = top;
                final int i3 = width2;
                final int i4 = width;
                cardStack.runAnimation(imageView2, new Function0<Unit>() { // from class: com.robinhood.shared.cards.CardStack$runCompletionAnimation$1$1
                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        cardStack2.onAnimationEnded(i, i2, i3, i4);
                    }
                });
            }
        }, 200L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void runAnimation(ImageView imageView, final Function0<Unit> onHidden) {
        int duration = 0;
        imageView.setVisibility(0);
        imageView.setImageResource(C31879R.drawable.cat_wink_reveal);
        Drawable drawable = imageView.getDrawable();
        Intrinsics.checkNotNull(drawable, "null cannot be cast to non-null type android.graphics.drawable.AnimationDrawable");
        AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
        animationDrawable.start();
        Iterator<Integer> it = RangesKt.until(0, animationDrawable.getNumberOfFrames()).iterator();
        while (it.hasNext()) {
            duration += animationDrawable.getDuration(((PrimitiveIterators6) it).nextInt());
        }
        imageView.postDelayed(new Runnable() { // from class: com.robinhood.shared.cards.CardStack$runAnimation$$inlined$postDelayed$1
            @Override // java.lang.Runnable
            public final void run() {
                onHidden.invoke();
            }
        }, duration);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onAnimationEnded(int centerX, int centerY, int width, int radius) {
        CardView cardView = this.animationContainer;
        Intrinsics.checkNotNull(cardView);
        if (cardView.getWindowToken() == null) {
            return;
        }
        CircularReveal.createCircularHide(cardView, centerX, centerY, width, radius).setDuration(200L).setListener(new AnimatorListenerAdapter() { // from class: com.robinhood.shared.cards.CardStack.onAnimationEnded.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                CardStack.this.removeAllViews();
                CardStack.this.populate(true);
            }
        }).start();
    }
}
