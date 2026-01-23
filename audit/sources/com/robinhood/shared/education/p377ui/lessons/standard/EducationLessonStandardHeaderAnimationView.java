package com.robinhood.shared.education.p377ui.lessons.standard;

import android.content.Context;
import android.util.AttributeSet;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.shared.education.p377ui.AnimationState;
import com.robinhood.shared.education.p377ui.lessons.standard.EducationLessonStandardHeaderData;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EducationLessonStandardHeaderAnimationView.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0018\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardHeaderAnimationView;", "Lcom/airbnb/lottie/LottieAnimationView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "previousUrl", "", "getPreviousUrl", "()Ljava/lang/String;", "setPreviousUrl", "(Ljava/lang/String;)V", "bind", "", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardHeaderData$LessonAnimation;", "bindAnimation", "state", "Lcom/robinhood/shared/education/ui/AnimationState;", "currentProgress", "", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class EducationLessonStandardHeaderAnimationView extends LottieAnimationView {
    public static final int $stable = 8;
    private String previousUrl;

    public /* synthetic */ EducationLessonStandardHeaderAnimationView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EducationLessonStandardHeaderAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final String getPreviousUrl() {
        return this.previousUrl;
    }

    public final void setPreviousUrl(String str) {
        this.previousUrl = str;
    }

    public final void bind(EducationLessonStandardHeaderData.LessonAnimation data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (!Intrinsics.areEqual(data.getAnimationUrl(), this.previousUrl)) {
            setAnimationFromUrl(data.getAnimationUrl());
            this.previousUrl = data.getAnimationUrl();
        }
        bindAnimation(data.getAnimationState(), data.getCurrentProgress());
    }

    private final void bindAnimation(AnimationState state, float currentProgress) {
        pauseAnimation();
        float targetProgress = state.getTargetProgress();
        float fAbs = Math.abs(getSpeed());
        if (currentProgress > targetProgress) {
            setMinAndMaxProgress(targetProgress, currentProgress);
            setSpeed(-fAbs);
        } else {
            setMinAndMaxProgress(currentProgress, targetProgress);
            setSpeed(fAbs);
        }
        resumeAnimation();
    }
}
