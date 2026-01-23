package com.robinhood.android.cash.rhy.tab.p077v2.card;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.transition.Fade;
import android.util.AttributeSet;
import android.util.Property;
import android.util.Size;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.android.cash.rhy.tab.C10285R;
import com.robinhood.android.cash.rhy.tab.databinding.MergeRhyDebitCardViewBinding;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.util.extensions.Contexts7;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.disposer.ViewDisposerKt;
import com.robinhood.models.p320db.mcduckling.CardImageConfiguration;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.Transitions2;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.extensions.ViewsKt;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: RhyDebitCardView.kt */
@Metadata(m3635d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 A2\u00020\u0001:\u0003?@AB\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u001b\u001a\u00020\u001cH\u0014J\u0010\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001fH\u0014J\b\u0010 \u001a\u00020!H\u0002J\b\u0010\"\u001a\u00020!H\u0002J\u0006\u0010#\u001a\u00020!J\u0006\u0010$\u001a\u00020\u001cJ8\u0010%\u001a\u00020\u001c2\b\u0010&\u001a\u0004\u0018\u00010'2\b\u0010(\u001a\u0004\u0018\u00010'2\b\u0010)\u001a\u0004\u0018\u00010'2\b\u0010*\u001a\u0004\u0018\u00010+2\b\b\u0002\u0010,\u001a\u00020!J\u0006\u0010-\u001a\u00020\u001cJ\u000e\u0010.\u001a\u00020\u001c2\u0006\u0010/\u001a\u000200J\b\u00101\u001a\u00020\u001cH\u0002J \u00102\u001a\u00020\u001c2\u0006\u00103\u001a\u0002002\u0006\u00104\u001a\u0002002\u0006\u00105\u001a\u000206H\u0002J\n\u00107\u001a\u0004\u0018\u00010\u0012H\u0002J\f\u0010=\u001a\u00020!*\u00020>H\u0002R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u00108\u001a\u000209*\u00020:8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<¨\u0006B"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/card/RhyDebitCardView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/robinhood/android/cash/rhy/tab/databinding/MergeRhyDebitCardViewBinding;", "getBinding", "()Lcom/robinhood/android/cash/rhy/tab/databinding/MergeRhyDebitCardViewBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "lottieAnimation", "Lcom/airbnb/lottie/LottieAnimationView;", "imageConfigurationRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Lcom/robinhood/models/db/mcduckling/CardImageConfiguration;", "callbacks", "Lcom/robinhood/android/cash/rhy/tab/v2/card/RhyDebitCardView$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/cash/rhy/tab/v2/card/RhyDebitCardView$Callbacks;", "setCallbacks", "(Lcom/robinhood/android/cash/rhy/tab/v2/card/RhyDebitCardView$Callbacks;)V", "cardState", "Lcom/robinhood/android/cash/rhy/tab/v2/card/RhyDebitCardView$CardState;", "onAttachedToWindow", "", "dispatchDraw", "canvas", "Landroid/graphics/Canvas;", "isFrontPosition", "", "isBackPosition", "isAnimating", "showBack", "bindBack", "firstName", "", "lastName", "lastFourDigits", "cardNumberImage", "Landroid/graphics/Bitmap;", "showMockedCardNumbers", "toggleCardAnimation", "trasnlateLottieAnimation", "y", "", "playLottieAnimation", "fadeText", "startTextAlpha", "endTextAlpha", "textFadeDelay", "", "createCardImageConfiguration", "position", "Landroid/graphics/Point;", "Landroid/widget/TextView;", "getPosition", "(Landroid/widget/TextView;)Landroid/graphics/Point;", "isComplete", "Landroid/animation/ValueAnimator;", "Callbacks", "CardState", "Companion", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class RhyDebitCardView extends ConstraintLayout {
    public static final long ANIMATION_DURATION = 1000;
    public static final long HEADER_FADE_ANIMATION_DURATION = 83;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private Callbacks callbacks;
    private CardState cardState;
    private final BehaviorRelay<CardImageConfiguration> imageConfigurationRelay;
    private final LottieAnimationView lottieAnimation;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RhyDebitCardView.class, "binding", "getBinding()Lcom/robinhood/android/cash/rhy/tab/databinding/MergeRhyDebitCardViewBinding;", 0))};
    public static final int $stable = 8;

    /* compiled from: RhyDebitCardView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/card/RhyDebitCardView$Callbacks;", "", "onCardImageConfigurationChanged", "", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lcom/robinhood/models/db/mcduckling/CardImageConfiguration;", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onCardImageConfigurationChanged(CardImageConfiguration configuration);
    }

    public /* synthetic */ RhyDebitCardView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RhyDebitCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewGroups.inflate(this, C10285R.layout.merge_rhy_debit_card_view, true);
        this.binding = ViewBinding5.viewBinding(this, RhyDebitCardView2.INSTANCE);
        LottieAnimationView rhyDebitCardAnimation = getBinding().rhyDebitCardAnimation;
        Intrinsics.checkNotNullExpressionValue(rhyDebitCardAnimation, "rhyDebitCardAnimation");
        this.lottieAnimation = rhyDebitCardAnimation;
        BehaviorRelay<CardImageConfiguration> behaviorRelayCreate = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate, "create(...)");
        this.imageConfigurationRelay = behaviorRelayCreate;
        this.cardState = CardState.FRONT;
        rhyDebitCardAnimation.setAnimation(C10285R.raw.rhy_overview_card_animation);
        rhyDebitCardAnimation.setMinAndMaxFrame(0, 60);
        rhyDebitCardAnimation.addAnimatorUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.robinhood.android.cash.rhy.tab.v2.card.RhyDebitCardView.1

            /* compiled from: RhyDebitCardView.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.cash.rhy.tab.v2.card.RhyDebitCardView$1$WhenMappings */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[CardState.values().length];
                    try {
                        iArr[CardState.FRONT.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[CardState.BACK.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator animator) {
                CardState cardState;
                Intrinsics.checkNotNullParameter(animator, "animator");
                if (RhyDebitCardView.this.isComplete(animator)) {
                    RhyDebitCardView rhyDebitCardView = RhyDebitCardView.this;
                    int i = WhenMappings.$EnumSwitchMapping$0[rhyDebitCardView.cardState.ordinal()];
                    if (i == 1) {
                        cardState = CardState.BACK;
                    } else {
                        if (i != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        cardState = CardState.FRONT;
                    }
                    rhyDebitCardView.cardState = cardState;
                }
            }
        });
    }

    private final MergeRhyDebitCardViewBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeRhyDebitCardViewBinding) value;
    }

    public final Callbacks getCallbacks() {
        return this.callbacks;
    }

    public final void setCallbacks(Callbacks callbacks) {
        this.callbacks = callbacks;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Observable<CardImageConfiguration> observableDistinctUntilChanged = this.imageConfigurationRelay.distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        ViewDisposerKt.bindTo$default(observableDistinctUntilChanged, this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.card.RhyDebitCardView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyDebitCardView.onAttachedToWindow$lambda$0(this.f$0, (CardImageConfiguration) obj);
            }
        });
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ViewDisposerKt.bindTo$default(ObservablesAndroid.observeOnMainThread(Contexts7.requireBaseActivityBaseContext(context).getDayNightStyleChanges()), this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.card.RhyDebitCardView$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyDebitCardView.onAttachedToWindow$lambda$1(this.f$0, (DayNightOverlay) obj);
            }
        });
        View root = getBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        if (root.isLaidOut() && !root.isLayoutRequested()) {
            CardImageConfiguration cardImageConfigurationCreateCardImageConfiguration = createCardImageConfiguration();
            if (cardImageConfigurationCreateCardImageConfiguration != null) {
                this.imageConfigurationRelay.accept(cardImageConfigurationCreateCardImageConfiguration);
                return;
            }
            return;
        }
        root.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.robinhood.android.cash.rhy.tab.v2.card.RhyDebitCardView$onAttachedToWindow$$inlined$doOnLayout$1
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                view.removeOnLayoutChangeListener(this);
                CardImageConfiguration cardImageConfigurationCreateCardImageConfiguration2 = this.this$0.createCardImageConfiguration();
                if (cardImageConfigurationCreateCardImageConfiguration2 != null) {
                    this.this$0.imageConfigurationRelay.accept(cardImageConfigurationCreateCardImageConfiguration2);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$0(RhyDebitCardView rhyDebitCardView, CardImageConfiguration cardImageConfiguration) {
        Callbacks callbacks = rhyDebitCardView.callbacks;
        if (callbacks != null) {
            Intrinsics.checkNotNull(cardImageConfiguration);
            callbacks.onCardImageConfigurationChanged(cardImageConfiguration);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$1(RhyDebitCardView rhyDebitCardView, DayNightOverlay it) {
        Intrinsics.checkNotNullParameter(it, "it");
        CardImageConfiguration cardImageConfigurationCreateCardImageConfiguration = rhyDebitCardView.createCardImageConfiguration();
        if (cardImageConfigurationCreateCardImageConfiguration != null) {
            rhyDebitCardView.imageConfigurationRelay.accept(cardImageConfigurationCreateCardImageConfiguration);
        }
        return Unit.INSTANCE;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.dispatchDraw(canvas);
        if (isBackPosition() && this.imageConfigurationRelay.getValue() == null) {
            CardImageConfiguration cardImageConfigurationCreateCardImageConfiguration = createCardImageConfiguration();
            if (cardImageConfigurationCreateCardImageConfiguration != null) {
                this.imageConfigurationRelay.accept(cardImageConfigurationCreateCardImageConfiguration);
            }
            invalidate();
        }
    }

    private final boolean isFrontPosition() {
        return this.cardState == CardState.FRONT;
    }

    private final boolean isBackPosition() {
        return this.cardState == CardState.BACK;
    }

    public final boolean isAnimating() {
        return this.lottieAnimation.isAnimating();
    }

    public final void showBack() {
        this.lottieAnimation.setFrame(60);
        ConstraintLayout rhyDebitCardBackOverlay = getBinding().rhyDebitCardBackOverlay;
        Intrinsics.checkNotNullExpressionValue(rhyDebitCardBackOverlay, "rhyDebitCardBackOverlay");
        rhyDebitCardBackOverlay.setVisibility(0);
        this.cardState = CardState.BACK;
    }

    public static /* synthetic */ void bindBack$default(RhyDebitCardView rhyDebitCardView, String str, String str2, String str3, Bitmap bitmap, boolean z, int i, Object obj) {
        if ((i & 16) != 0) {
            z = false;
        }
        rhyDebitCardView.bindBack(str, str2, str3, bitmap, z);
    }

    public final void bindBack(String firstName, String lastName, String lastFourDigits, Bitmap cardNumberImage, boolean showMockedCardNumbers) {
        Transitions2.beginDelayedTransition(this, new Fade());
        getBinding().rhyDebitCardViewFirstName.setText(firstName);
        getBinding().rhyDebitCardViewLastName.setText(lastName);
        getBinding().rhyDebitCardViewCardNumberPlaceholder.setText((lastFourDigits == null || Intrinsics.areEqual(lastFourDigits, "")) ? ViewsKt.getString(this, C10285R.string.rhy_debit_card_number_placeholder) : ViewsKt.getString(this, C10285R.string.rhy_debit_card_number_placeholder_digits, lastFourDigits));
        if (cardNumberImage == null) {
            RhTextView rhyDebitCardViewCardNumberPlaceholder = getBinding().rhyDebitCardViewCardNumberPlaceholder;
            Intrinsics.checkNotNullExpressionValue(rhyDebitCardViewCardNumberPlaceholder, "rhyDebitCardViewCardNumberPlaceholder");
            rhyDebitCardViewCardNumberPlaceholder.setVisibility(0);
            RhTextView rhyDebitCardViewExpirationPlaceholder = getBinding().rhyDebitCardViewExpirationPlaceholder;
            Intrinsics.checkNotNullExpressionValue(rhyDebitCardViewExpirationPlaceholder, "rhyDebitCardViewExpirationPlaceholder");
            rhyDebitCardViewExpirationPlaceholder.setVisibility(0);
            RhTextView rhyDebitCardViewCvvPlaceholder = getBinding().rhyDebitCardViewCvvPlaceholder;
            Intrinsics.checkNotNullExpressionValue(rhyDebitCardViewCvvPlaceholder, "rhyDebitCardViewCvvPlaceholder");
            rhyDebitCardViewCvvPlaceholder.setVisibility(0);
            ImageView rhyDebitCardViewNumberImage = getBinding().rhyDebitCardViewNumberImage;
            Intrinsics.checkNotNullExpressionValue(rhyDebitCardViewNumberImage, "rhyDebitCardViewNumberImage");
            rhyDebitCardViewNumberImage.setVisibility(8);
        } else {
            RhTextView rhyDebitCardViewCardNumberPlaceholder2 = getBinding().rhyDebitCardViewCardNumberPlaceholder;
            Intrinsics.checkNotNullExpressionValue(rhyDebitCardViewCardNumberPlaceholder2, "rhyDebitCardViewCardNumberPlaceholder");
            rhyDebitCardViewCardNumberPlaceholder2.setVisibility(4);
            RhTextView rhyDebitCardViewExpirationPlaceholder2 = getBinding().rhyDebitCardViewExpirationPlaceholder;
            Intrinsics.checkNotNullExpressionValue(rhyDebitCardViewExpirationPlaceholder2, "rhyDebitCardViewExpirationPlaceholder");
            rhyDebitCardViewExpirationPlaceholder2.setVisibility(4);
            RhTextView rhyDebitCardViewCvvPlaceholder2 = getBinding().rhyDebitCardViewCvvPlaceholder;
            Intrinsics.checkNotNullExpressionValue(rhyDebitCardViewCvvPlaceholder2, "rhyDebitCardViewCvvPlaceholder");
            rhyDebitCardViewCvvPlaceholder2.setVisibility(4);
            ImageView imageView = getBinding().rhyDebitCardViewNumberImage;
            Intrinsics.checkNotNull(imageView);
            imageView.setVisibility(0);
            imageView.setImageBitmap(cardNumberImage);
            Intrinsics.checkNotNull(imageView);
        }
        if (showMockedCardNumbers) {
            getBinding().rhyDebitCardViewCardNumberPlaceholder.setText(ViewsKt.getString(this, C10285R.string.rhy_debit_card_number_mocked));
        }
    }

    public final void toggleCardAnimation() {
        if (!isAnimating()) {
            if (isFrontPosition()) {
                fadeText(1.0f, 0.0f, 0L);
            } else {
                fadeText(0.0f, 1.0f, 917L);
            }
        }
        playLottieAnimation();
    }

    public final void trasnlateLottieAnimation(float y) {
        this.lottieAnimation.setTranslationY(y);
    }

    private final void playLottieAnimation() {
        this.lottieAnimation.setSpeed(isFrontPosition() ? 1.0f : -1.0f);
        this.lottieAnimation.playAnimation();
    }

    private final void fadeText(float startTextAlpha, float endTextAlpha, long textFadeDelay) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(getBinding().rhyDebitCardHeaderContainer, (Property<ConstraintLayout, Float>) View.ALPHA, startTextAlpha, endTextAlpha);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(83L);
        animatorSet.setStartDelay(textFadeDelay);
        animatorSet.play(objectAnimatorOfFloat);
        animatorSet.start();
        this.lottieAnimation.playAnimation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final CardImageConfiguration createCardImageConfiguration() {
        if (getBinding().rhyDebitCardViewCardNumberPlaceholder.getLayout() == null || getBinding().rhyDebitCardViewExpirationPlaceholder.getLayout() == null || getBinding().rhyDebitCardViewCvvPlaceholder.getLayout() == null) {
            return null;
        }
        Size size = new Size(getBinding().rhyDebitCardBackOverlay.getWidth(), getBinding().rhyDebitCardBackOverlay.getHeight());
        CardImageConfiguration.TextAppearance textAppearance = new CardImageConfiguration.TextAppearance(CardImageConfiguration.FontFile.RH_CAPSULE_MONO, getBinding().rhyDebitCardViewCardNumberPlaceholder.getCurrentTextColor());
        RhTextView rhyDebitCardViewCardNumberPlaceholder = getBinding().rhyDebitCardViewCardNumberPlaceholder;
        Intrinsics.checkNotNullExpressionValue(rhyDebitCardViewCardNumberPlaceholder, "rhyDebitCardViewCardNumberPlaceholder");
        int i = 26;
        DefaultConstructorMarker defaultConstructorMarker = null;
        String str = null;
        CardImageConfiguration.CardNumberTextLayout cardNumberTextLayout = new CardImageConfiguration.CardNumberTextLayout(getPosition(rhyDebitCardViewCardNumberPlaceholder), null, Float.valueOf(getBinding().rhyDebitCardViewCardNumberPlaceholder.getTextSize()), null, str, ViewsKt.getString(this, C10285R.string.rhy_debit_card_number_separator), i, defaultConstructorMarker);
        RhTextView rhyDebitCardViewExpirationPlaceholder = getBinding().rhyDebitCardViewExpirationPlaceholder;
        Intrinsics.checkNotNullExpressionValue(rhyDebitCardViewExpirationPlaceholder, "rhyDebitCardViewExpirationPlaceholder");
        CardImageConfiguration.TextLayout textLayout = new CardImageConfiguration.TextLayout(getPosition(rhyDebitCardViewExpirationPlaceholder), null, Float.valueOf(getBinding().rhyDebitCardViewExpirationPlaceholder.getTextSize()), str, null, i, defaultConstructorMarker);
        RhTextView rhyDebitCardViewCvvPlaceholder = getBinding().rhyDebitCardViewCvvPlaceholder;
        Intrinsics.checkNotNullExpressionValue(rhyDebitCardViewCvvPlaceholder, "rhyDebitCardViewCvvPlaceholder");
        Float f = null;
        String str2 = null;
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        return new CardImageConfiguration(size, new CardImageConfiguration.FieldsConfiguration(cardNumberTextLayout, textLayout, new CardImageConfiguration.TextLayout(getPosition(rhyDebitCardViewCvvPlaceholder), f, Float.valueOf(getBinding().rhyDebitCardViewCvvPlaceholder.getTextSize()), objArr, str2, 26, null), 0 == true ? 1 : 0, 8, objArr2), textAppearance, 0, 8, null);
    }

    private final Point getPosition(TextView textView) {
        return new Point(textView.getLeft() + ((int) textView.getLayout().getLineLeft(0)), textView.getTop() + textView.getBaseline());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isComplete(ValueAnimator valueAnimator) {
        return valueAnimator.getAnimatedFraction() == 1.0f;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RhyDebitCardView.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/card/RhyDebitCardView$CardState;", "", "<init>", "(Ljava/lang/String;I)V", "FRONT", "BACK", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class CardState {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CardState[] $VALUES;
        public static final CardState FRONT = new CardState("FRONT", 0);
        public static final CardState BACK = new CardState("BACK", 1);

        private static final /* synthetic */ CardState[] $values() {
            return new CardState[]{FRONT, BACK};
        }

        public static EnumEntries<CardState> getEntries() {
            return $ENTRIES;
        }

        private CardState(String str, int i) {
        }

        static {
            CardState[] cardStateArr$values = $values();
            $VALUES = cardStateArr$values;
            $ENTRIES = EnumEntries2.enumEntries(cardStateArr$values);
        }

        public static CardState valueOf(String str) {
            return (CardState) Enum.valueOf(CardState.class, str);
        }

        public static CardState[] values() {
            return (CardState[]) $VALUES.clone();
        }
    }
}
