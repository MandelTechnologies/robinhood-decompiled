package com.robinhood.shared.education.p377ui;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: AnimationState.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/AnimationState;", "", "<init>", "()V", "targetProgress", "", "getTargetProgress", "()F", "Section", "Complete", "Lcom/robinhood/shared/education/ui/AnimationState$Complete;", "Lcom/robinhood/shared/education/ui/AnimationState$Section;", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public abstract class AnimationState {
    public static final int $stable = 0;

    public /* synthetic */ AnimationState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract float getTargetProgress();

    private AnimationState() {
    }

    /* compiled from: AnimationState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/AnimationState$Section;", "Lcom/robinhood/shared/education/ui/AnimationState;", "targetProgress", "", "<init>", "(F)V", "getTargetProgress", "()F", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Section extends AnimationState {
        public static final int $stable = 0;
        private final float targetProgress;

        public static /* synthetic */ Section copy$default(Section section, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                f = section.targetProgress;
            }
            return section.copy(f);
        }

        /* renamed from: component1, reason: from getter */
        public final float getTargetProgress() {
            return this.targetProgress;
        }

        public final Section copy(float targetProgress) {
            return new Section(targetProgress);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Section) && Float.compare(this.targetProgress, ((Section) other).targetProgress) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.targetProgress);
        }

        public String toString() {
            return "Section(targetProgress=" + this.targetProgress + ")";
        }

        @Override // com.robinhood.shared.education.p377ui.AnimationState
        public float getTargetProgress() {
            return this.targetProgress;
        }

        public Section(float f) {
            super(null);
            this.targetProgress = f;
        }
    }

    /* compiled from: AnimationState.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/AnimationState$Complete;", "Lcom/robinhood/shared/education/ui/AnimationState;", "<init>", "()V", "targetProgress", "", "getTargetProgress", "()F", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Complete extends AnimationState {
        public static final int $stable = 0;
        public static final Complete INSTANCE = new Complete();
        private static final float targetProgress = 1.0f;

        private Complete() {
            super(null);
        }

        @Override // com.robinhood.shared.education.p377ui.AnimationState
        public float getTargetProgress() {
            return targetProgress;
        }
    }
}
