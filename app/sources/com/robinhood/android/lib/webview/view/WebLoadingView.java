package com.robinhood.android.lib.webview.view;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.lib.webview.C20684R;
import com.robinhood.utils.datetime.Durations;
import com.singular.sdk.internal.SLRemoteConfiguration;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import p479j$.time.Duration;

/* compiled from: WebLoadingView.kt */
@Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0007\u0018\u0000 =2\u00020\u0001:\u0001=B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u000fJ\u0017\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010*R\u0014\u0010,\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010*R\u0014\u0010-\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010*R*\u0010/\u001a\u00020\u00132\u0006\u0010.\u001a\u00020\u00138\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010!\u001a\u0004\b0\u00101\"\u0004\b2\u0010\u0016R\u0014\u00106\u001a\u0002038CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R(\u0010<\u001a\u0004\u0018\u0001072\b\u0010.\u001a\u0004\u0018\u0001078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b8\u00109\"\u0004\b:\u0010;¨\u0006>"}, m3636d2 = {"Lcom/robinhood/android/lib/webview/view/WebLoadingView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "j$/time/Duration", "maxLength", "elapsedLength", "", "slowTimedAnimation", "(Lj$/time/Duration;Lj$/time/Duration;)V", "startLoopingAnimation", "()V", "startTimedAnimation", "(Lj$/time/Duration;)V", "quicklyFinishAnimation", "", "reset", "stopAnimation", "(Z)V", "Landroid/widget/TextView;", "messageTextView", "Landroid/widget/TextView;", "Lcom/airbnb/lottie/LottieAnimationView;", "lottie", "Lcom/airbnb/lottie/LottieAnimationView;", "Landroid/animation/ValueAnimator;", "animator", "Landroid/animation/ValueAnimator;", "finished", "Z", "Landroid/widget/LinearLayout;", "debugPanel", "Landroid/widget/LinearLayout;", "Lcom/robinhood/android/designsystem/text/RhTextView;", "debugProgressText", "Lcom/robinhood/android/designsystem/text/RhTextView;", "Lcom/robinhood/android/designsystem/button/RdsButton;", "debugIndeterminateButton", "Lcom/robinhood/android/designsystem/button/RdsButton;", "debug10sButton", "debug30sButton", "debugFinishButton", "value", SLRemoteConfiguration.Constants.DEBUG_JSON_KEY, "getDebug", "()Z", "setDebug", "Landroid/animation/ValueAnimator$AnimatorUpdateListener;", "getUpdateListener", "()Landroid/animation/ValueAnimator$AnimatorUpdateListener;", "updateListener", "", "getMessage", "()Ljava/lang/CharSequence;", "setMessage", "(Ljava/lang/CharSequence;)V", "message", "Companion", "lib-webview_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class WebLoadingView extends ConstraintLayout {
    private static final float ANIMATION_BAR_FAST_FILL_CUTOFF_PERCENT = 0.3f;
    private static final Duration ANIMATION_BAR_FAST_FILL_DURATION;
    private static final float ANIMATION_BAR_FILLED_PERCENT = 0.6f;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Duration READY_FINISH_ANIMATION_DURATION;
    private ValueAnimator animator;
    private boolean debug;
    private final RdsButton debug10sButton;
    private final RdsButton debug30sButton;
    private final RdsButton debugFinishButton;
    private final RdsButton debugIndeterminateButton;
    private final LinearLayout debugPanel;
    private final RhTextView debugProgressText;
    private boolean finished;
    private final LottieAnimationView lottie;
    private final TextView messageTextView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebLoadingView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        View.inflate(context, C20684R.layout.merge_web_loading_view, this);
        View viewFindViewById = findViewById(C20684R.id.loading_message);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.messageTextView = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(C20684R.id.loading_lottie);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.lottie = (LottieAnimationView) viewFindViewById2;
        View viewFindViewById3 = findViewById(C20684R.id.debug_panel);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.debugPanel = (LinearLayout) viewFindViewById3;
        View viewFindViewById4 = findViewById(C20684R.id.debug_progress_text);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.debugProgressText = (RhTextView) viewFindViewById4;
        View viewFindViewById5 = findViewById(C20684R.id.debug_start_indeterminate);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.debugIndeterminateButton = (RdsButton) viewFindViewById5;
        View viewFindViewById6 = findViewById(C20684R.id.debug_start_10s);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.debug10sButton = (RdsButton) viewFindViewById6;
        View viewFindViewById7 = findViewById(C20684R.id.debug_start_30s);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.debug30sButton = (RdsButton) viewFindViewById7;
        View viewFindViewById8 = findViewById(C20684R.id.debug_finish);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        this.debugFinishButton = (RdsButton) viewFindViewById8;
        int[] LoadingView = C13997R.styleable.LoadingView;
        Intrinsics.checkNotNullExpressionValue(LoadingView, "LoadingView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, LoadingView, 0, 0);
        setMessage(typedArrayObtainStyledAttributes.getText(C13997R.styleable.LoadingView_android_text));
        typedArrayObtainStyledAttributes.recycle();
    }

    @SuppressLint({"SetTextI18n"})
    private final ValueAnimator.AnimatorUpdateListener getUpdateListener() {
        return new ValueAnimator.AnimatorUpdateListener() { // from class: com.robinhood.android.lib.webview.view.WebLoadingView$updateListener$1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                if (this.this$0.getDebug()) {
                    RhTextView rhTextView = this.this$0.debugProgressText;
                    String str = String.format("%.3f", Arrays.copyOf(new Object[]{animation.getAnimatedValue()}, 1));
                    Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                    rhTextView.setText(str);
                }
                LottieAnimationView lottieAnimationView = this.this$0.lottie;
                Object animatedValue = animation.getAnimatedValue();
                Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                lottieAnimationView.setProgress(((Float) animatedValue).floatValue());
            }
        };
    }

    public final CharSequence getMessage() {
        return this.messageTextView.getText().toString();
    }

    public final void setMessage(CharSequence charSequence) {
        this.messageTextView.setText(charSequence);
    }

    public final boolean getDebug() {
        return this.debug;
    }

    public final void setDebug(boolean z) {
        this.debug = z;
        this.debugPanel.setVisibility(z ? 0 : 8);
        if (z) {
            this.debugIndeterminateButton.setOnClickListener(new View.OnClickListener() { // from class: com.robinhood.android.lib.webview.view.WebLoadingView$debug$1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.this$0.startLoopingAnimation();
                }
            });
            this.debug10sButton.setOnClickListener(new View.OnClickListener() { // from class: com.robinhood.android.lib.webview.view.WebLoadingView$debug$2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    WebLoadingView webLoadingView = this.this$0;
                    Duration durationOfSeconds = Duration.ofSeconds(10L);
                    Intrinsics.checkNotNullExpressionValue(durationOfSeconds, "ofSeconds(...)");
                    webLoadingView.startTimedAnimation(durationOfSeconds);
                }
            });
            this.debug30sButton.setOnClickListener(new View.OnClickListener() { // from class: com.robinhood.android.lib.webview.view.WebLoadingView$debug$3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    WebLoadingView webLoadingView = this.this$0;
                    Duration durationOfSeconds = Duration.ofSeconds(30L);
                    Intrinsics.checkNotNullExpressionValue(durationOfSeconds, "ofSeconds(...)");
                    webLoadingView.startTimedAnimation(durationOfSeconds);
                }
            });
            this.debugFinishButton.setOnClickListener(new View.OnClickListener() { // from class: com.robinhood.android.lib.webview.view.WebLoadingView$debug$4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.this$0.quicklyFinishAnimation();
                }
            });
        }
    }

    public final void startLoopingAnimation() {
        stopAnimation(true);
        this.lottie.setRepeatCount(-1);
        this.lottie.playAnimation();
    }

    public final void startTimedAnimation(final Duration maxLength) {
        Intrinsics.checkNotNullParameter(maxLength, "maxLength");
        stopAnimation(true);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 0.3f);
        valueAnimatorOfFloat.addUpdateListener(getUpdateListener());
        Intrinsics.checkNotNull(valueAnimatorOfFloat);
        valueAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: com.robinhood.android.lib.webview.view.WebLoadingView$startTimedAnimation$lambda$2$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (this.this$0.finished) {
                    return;
                }
                WebLoadingView.slowTimedAnimation$default(this.this$0, maxLength, null, 2, null);
            }
        });
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.setDuration(ANIMATION_BAR_FAST_FILL_DURATION.toMillis());
        this.animator = valueAnimatorOfFloat;
        Intrinsics.checkNotNull(valueAnimatorOfFloat);
        valueAnimatorOfFloat.start();
    }

    static /* synthetic */ void slowTimedAnimation$default(WebLoadingView webLoadingView, Duration duration, Duration duration2, int i, Object obj) {
        if ((i & 2) != 0) {
            duration2 = ANIMATION_BAR_FAST_FILL_DURATION;
        }
        webLoadingView.slowTimedAnimation(duration, duration2);
    }

    private final void slowTimedAnimation(Duration maxLength, Duration elapsedLength) {
        stopAnimation$default(this, false, 1, null);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.lottie.getProgress(), 1.0f);
        valueAnimatorOfFloat.addUpdateListener(getUpdateListener());
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.setDuration(((Duration) RangesKt.coerceAtLeast(maxLength.minus(elapsedLength), Durations.INSTANCE.getONE_SECOND())).toMillis());
        this.animator = valueAnimatorOfFloat;
        Intrinsics.checkNotNull(valueAnimatorOfFloat);
        valueAnimatorOfFloat.start();
    }

    public final void quicklyFinishAnimation() {
        this.finished = true;
        stopAnimation$default(this, false, 1, null);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.lottie.getProgress(), 1.0f);
        valueAnimatorOfFloat.addUpdateListener(getUpdateListener());
        valueAnimatorOfFloat.setDuration(READY_FINISH_ANIMATION_DURATION.toMillis());
        this.animator = valueAnimatorOfFloat;
        Intrinsics.checkNotNull(valueAnimatorOfFloat);
        valueAnimatorOfFloat.start();
    }

    public static /* synthetic */ void stopAnimation$default(WebLoadingView webLoadingView, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        webLoadingView.stopAnimation(z);
    }

    public final void stopAnimation(boolean reset) {
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.lottie.cancelAnimation();
        if (reset) {
            this.lottie.setProgress(0.0f);
            this.finished = false;
        }
    }

    /* compiled from: WebLoadingView.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0006¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/lib/webview/view/WebLoadingView$Companion;", "", "<init>", "()V", "j$/time/Duration", "READY_FINISH_ANIMATION_DURATION", "Lj$/time/Duration;", "getREADY_FINISH_ANIMATION_DURATION", "()Lj$/time/Duration;", "", "ANIMATION_BAR_FILLED_PERCENT", "F", "ANIMATION_BAR_FAST_FILL_CUTOFF_PERCENT", "ANIMATION_BAR_FAST_FILL_DURATION", "lib-webview_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Duration getREADY_FINISH_ANIMATION_DURATION() {
            return WebLoadingView.READY_FINISH_ANIMATION_DURATION;
        }
    }

    static {
        Duration durationOfSeconds = Duration.ofSeconds(5L);
        Intrinsics.checkNotNullExpressionValue(durationOfSeconds, "ofSeconds(...)");
        ANIMATION_BAR_FAST_FILL_DURATION = durationOfSeconds;
        Duration durationOfMillis = Duration.ofMillis(200L);
        Intrinsics.checkNotNullExpressionValue(durationOfMillis, "ofMillis(...)");
        READY_FINISH_ANIMATION_DURATION = durationOfMillis;
    }
}
