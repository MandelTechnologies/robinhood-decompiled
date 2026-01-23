package com.robinhood.android.jointaccounts.onboarding;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: JointAccountCelebrationScreen.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ>\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\r\u0010\nR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/jointaccounts/onboarding/JointAccountCelebrationScreenAnimationData;", "", "animationLoopStartFrame", "", "animationLoopEndFrame", "textAnimationFrame", "ctaAnimationFrame", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getAnimationLoopStartFrame", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAnimationLoopEndFrame", "getTextAnimationFrame", "getCtaAnimationFrame", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/robinhood/android/jointaccounts/onboarding/JointAccountCelebrationScreenAnimationData;", "equals", "", "other", "hashCode", "toString", "", "feature-joint-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class JointAccountCelebrationScreenAnimationData {
    public static final int $stable = 0;
    private final Integer animationLoopEndFrame;
    private final Integer animationLoopStartFrame;
    private final Integer ctaAnimationFrame;
    private final Integer textAnimationFrame;

    public JointAccountCelebrationScreenAnimationData() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ JointAccountCelebrationScreenAnimationData copy$default(JointAccountCelebrationScreenAnimationData jointAccountCelebrationScreenAnimationData, Integer num, Integer num2, Integer num3, Integer num4, int i, Object obj) {
        if ((i & 1) != 0) {
            num = jointAccountCelebrationScreenAnimationData.animationLoopStartFrame;
        }
        if ((i & 2) != 0) {
            num2 = jointAccountCelebrationScreenAnimationData.animationLoopEndFrame;
        }
        if ((i & 4) != 0) {
            num3 = jointAccountCelebrationScreenAnimationData.textAnimationFrame;
        }
        if ((i & 8) != 0) {
            num4 = jointAccountCelebrationScreenAnimationData.ctaAnimationFrame;
        }
        return jointAccountCelebrationScreenAnimationData.copy(num, num2, num3, num4);
    }

    /* renamed from: component1, reason: from getter */
    public final Integer getAnimationLoopStartFrame() {
        return this.animationLoopStartFrame;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getAnimationLoopEndFrame() {
        return this.animationLoopEndFrame;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getTextAnimationFrame() {
        return this.textAnimationFrame;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getCtaAnimationFrame() {
        return this.ctaAnimationFrame;
    }

    public final JointAccountCelebrationScreenAnimationData copy(Integer animationLoopStartFrame, Integer animationLoopEndFrame, Integer textAnimationFrame, Integer ctaAnimationFrame) {
        return new JointAccountCelebrationScreenAnimationData(animationLoopStartFrame, animationLoopEndFrame, textAnimationFrame, ctaAnimationFrame);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JointAccountCelebrationScreenAnimationData)) {
            return false;
        }
        JointAccountCelebrationScreenAnimationData jointAccountCelebrationScreenAnimationData = (JointAccountCelebrationScreenAnimationData) other;
        return Intrinsics.areEqual(this.animationLoopStartFrame, jointAccountCelebrationScreenAnimationData.animationLoopStartFrame) && Intrinsics.areEqual(this.animationLoopEndFrame, jointAccountCelebrationScreenAnimationData.animationLoopEndFrame) && Intrinsics.areEqual(this.textAnimationFrame, jointAccountCelebrationScreenAnimationData.textAnimationFrame) && Intrinsics.areEqual(this.ctaAnimationFrame, jointAccountCelebrationScreenAnimationData.ctaAnimationFrame);
    }

    public int hashCode() {
        Integer num = this.animationLoopStartFrame;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.animationLoopEndFrame;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.textAnimationFrame;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.ctaAnimationFrame;
        return iHashCode3 + (num4 != null ? num4.hashCode() : 0);
    }

    public String toString() {
        return "JointAccountCelebrationScreenAnimationData(animationLoopStartFrame=" + this.animationLoopStartFrame + ", animationLoopEndFrame=" + this.animationLoopEndFrame + ", textAnimationFrame=" + this.textAnimationFrame + ", ctaAnimationFrame=" + this.ctaAnimationFrame + ")";
    }

    public JointAccountCelebrationScreenAnimationData(Integer num, Integer num2, Integer num3, Integer num4) {
        this.animationLoopStartFrame = num;
        this.animationLoopEndFrame = num2;
        this.textAnimationFrame = num3;
        this.ctaAnimationFrame = num4;
    }

    public /* synthetic */ JointAccountCelebrationScreenAnimationData(Integer num, Integer num2, Integer num3, Integer num4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3, (i & 8) != 0 ? null : num4);
    }

    public final Integer getAnimationLoopStartFrame() {
        return this.animationLoopStartFrame;
    }

    public final Integer getAnimationLoopEndFrame() {
        return this.animationLoopEndFrame;
    }

    public final Integer getTextAnimationFrame() {
        return this.textAnimationFrame;
    }

    public final Integer getCtaAnimationFrame() {
        return this.ctaAnimationFrame;
    }
}
