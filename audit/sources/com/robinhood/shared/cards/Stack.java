package com.robinhood.shared.cards;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.cards.C31879R;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.view.Inflater;
import io.reactivex.Observable;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Stack.kt */
@Metadata(m3635d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 82\u00020\u0001:\u000278B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010(\u001a\u00020)H\u0014J\"\u0010*\u001a\u00020)2\u0010\u0010+\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f2\b\b\u0002\u0010,\u001a\u00020\u0015J\u001c\u0010-\u001a\u00020)2\u0006\u0010.\u001a\u00020\u00122\n\b\u0002\u0010/\u001a\u0004\u0018\u000100H\u0002J\b\u00101\u001a\u00020)H\u0002J\u000e\u00102\u001a\u00020)2\u0006\u0010/\u001a\u000200J\u0006\u00103\u001a\u00020)J\u0006\u00104\u001a\u00020)J\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u001506R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0010\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0013\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00150\u00150\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u001f\u001a\u00020 ¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u000e\u0010#\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020&X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00069"}, m3636d2 = {"Lcom/robinhood/shared/cards/Stack;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "currentCards", "", "Lcom/robinhood/shared/cards/NotificationCard;", "state", "Lcom/robinhood/shared/cards/Stack$State;", "cardsVisibilityRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "", "kotlin.jvm.PlatformType", "unreadCountTranslation", "", "getUnreadCountTranslation", "()I", "unreadCountTranslation$delegate", "Lkotlin/Lazy;", "errorView", "Landroid/view/View;", "cardStack", "Lcom/robinhood/shared/cards/CardStack;", "getCardStack", "()Lcom/robinhood/shared/cards/CardStack;", "loadingView", "unreadCountContainer", "unreadCountTxt", "Landroid/widget/TextView;", "goldSplashUnreadCountTxt", "onAttachedToWindow", "", "bind", "notificationCards", "ignoreTopCardPreference", "setState", "newState", "error", "", "translateUnreadCountPosition", "showErrorView", "showEmptyView", "showCardStack", "cardsVisibilityStream", "Lio/reactivex/Observable;", "State", "Companion", "lib-cards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes26.dex */
public final class Stack extends Hammer_Stack {
    public AnalyticsLogger analytics;
    private final CardStack cardStack;
    private final BehaviorRelay<Boolean> cardsVisibilityRelay;
    private List<? extends NotificationCard<?>> currentCards;
    private final View errorView;
    private final TextView goldSplashUnreadCountTxt;
    private final View loadingView;
    private State state;
    private final FrameLayout unreadCountContainer;

    /* renamed from: unreadCountTranslation$delegate, reason: from kotlin metadata */
    private final Lazy unreadCountTranslation;
    private final TextView unreadCountTxt;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: Stack.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[State.values().length];
            try {
                iArr[State.STACK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[State.LOADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[State.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[State.EMPTY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ Stack(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Stack(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        this.state = State.LOADING;
        BehaviorRelay<Boolean> behaviorRelayCreateDefault = BehaviorRelay.createDefault(Boolean.TRUE);
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreateDefault, "createDefault(...)");
        this.cardsVisibilityRelay = behaviorRelayCreateDefault;
        this.unreadCountTranslation = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0() { // from class: com.robinhood.shared.cards.Stack$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(Stack.unreadCountTranslation_delegate$lambda$0(this.f$0));
            }
        });
        ViewGroups.inflate(this, C31879R.layout.merge_card_stack, true);
        ViewsKt.setTopPadding(this, getResources().getDimensionPixelSize(C31879R.dimen.card_top_padding));
        setClipChildren(false);
        setClipToPadding(false);
        View viewFindViewById = findViewById(C31879R.id.error_view);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.errorView = viewFindViewById;
        View viewFindViewById2 = findViewById(C31879R.id.card_container);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        CardStack cardStack = (CardStack) viewFindViewById2;
        this.cardStack = cardStack;
        View viewFindViewById3 = findViewById(C31879R.id.loading_view);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.loadingView = viewFindViewById3;
        View viewFindViewById4 = findViewById(C31879R.id.card_stack_unread_count_container);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        FrameLayout frameLayout = (FrameLayout) viewFindViewById4;
        this.unreadCountContainer = frameLayout;
        View viewFindViewById5 = findViewById(C31879R.id.card_stack_unread_count_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById5;
        this.unreadCountTxt = textView;
        View viewFindViewById6 = findViewById(C31879R.id.card_stack_gold_splash_unread_count_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        TextView textView2 = (TextView) viewFindViewById6;
        this.goldSplashUnreadCountTxt = textView2;
        cardStack.bind(this, frameLayout, textView, textView2);
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

    private final int getUnreadCountTranslation() {
        return ((Number) this.unreadCountTranslation.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int unreadCountTranslation_delegate$lambda$0(Stack stack) {
        return stack.getResources().getDimensionPixelSize(C31879R.dimen.card_count_badge_translation);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Stack.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/cards/Stack$State;", "", "<init>", "(Ljava/lang/String;I)V", "STACK", "LOADING", "ERROR", "EMPTY", "lib-cards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class State {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State STACK = new State("STACK", 0);
        public static final State LOADING = new State("LOADING", 1);
        public static final State ERROR = new State("ERROR", 2);
        public static final State EMPTY = new State("EMPTY", 3);

        private static final /* synthetic */ State[] $values() {
            return new State[]{STACK, LOADING, ERROR, EMPTY};
        }

        public static EnumEntries<State> getEntries() {
            return $ENTRIES;
        }

        private State(String str, int i) {
        }

        static {
            State[] stateArr$values = $values();
            $VALUES = stateArr$values;
            $ENTRIES = EnumEntries2.enumEntries(stateArr$values);
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    public final CardStack getCardStack() {
        return this.cardStack;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        translateUnreadCountPosition();
    }

    public static /* synthetic */ void bind$default(Stack stack, List list, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        stack.bind(list, z);
    }

    public final void bind(List<? extends NotificationCard<?>> notificationCards, boolean ignoreTopCardPreference) {
        Intrinsics.checkNotNullParameter(notificationCards, "notificationCards");
        if (this.currentCards == notificationCards) {
            return;
        }
        this.currentCards = notificationCards;
        this.cardStack.bindCards(notificationCards, ignoreTopCardPreference);
    }

    static /* synthetic */ void setState$default(Stack stack, State state, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        stack.setState(state, th);
    }

    private final void setState(State newState, Throwable error) {
        Integer httpStatusCode;
        if (this.state == newState) {
            return;
        }
        this.state = newState;
        this.cardsVisibilityRelay.accept(Boolean.valueOf((newState == State.EMPTY || newState == State.ERROR) ? false : true));
        Iterator it = CollectionsKt.listOf((Object[]) new View[]{this.cardStack, this.loadingView, this.errorView}).iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(8);
        }
        int i = WhenMappings.$EnumSwitchMapping$0[this.state.ordinal()];
        if (i == 1) {
            this.cardStack.setVisibility(0);
            return;
        }
        if (i == 2) {
            this.loadingView.setVisibility(0);
        } else if (i == 3) {
            getAnalytics().logNotificationStack(AnalyticsStrings.NOTIF_STACK_EVENT_LOAD_ERROR, 0, (error == null || (httpStatusCode = Throwables.getHttpStatusCode(error)) == null) ? null : httpStatusCode.toString(), null, null, null, null, null);
        } else if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
    }

    private final void translateUnreadCountPosition() {
        this.unreadCountContainer.setTranslationX(getUnreadCountTranslation());
        this.unreadCountContainer.setTranslationY(0.0f);
    }

    public final void showErrorView(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        setState(State.ERROR, error);
    }

    public final void showEmptyView() {
        setState$default(this, State.EMPTY, null, 2, null);
    }

    public final void showCardStack() {
        setState$default(this, State.STACK, null, 2, null);
    }

    public final Observable<Boolean> cardsVisibilityStream() {
        Observable<Boolean> observableHide = this.cardsVisibilityRelay.hide();
        Intrinsics.checkNotNullExpressionValue(observableHide, "hide(...)");
        return observableHide;
    }

    /* compiled from: Stack.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/cards/Stack$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/shared/cards/Stack;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "lib-cards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<Stack> {
        private final /* synthetic */ Inflater<Stack> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public Stack inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (Stack) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C31879R.layout.include_card_stack);
        }
    }
}
