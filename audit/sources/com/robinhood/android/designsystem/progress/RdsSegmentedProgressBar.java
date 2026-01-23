package com.robinhood.android.designsystem.progress;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import androidx.core.view.ViewGroup2;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.extensions.ContextSystemServices;
import com.robinhood.utils.extensions.ViewsKt;
import java.util.Iterator;
import java.util.List;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* compiled from: RdsSegmentedProgressBar.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 92\u00020\u0001:\u000289B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u000eH\u0002J\u0018\u0010'\u001a\u00020%2\u0006\u0010(\u001a\u00020\u000e2\b\b\u0002\u0010)\u001a\u00020*J\u0018\u0010+\u001a\u00020%2\u0006\u0010,\u001a\u00020-2\b\b\u0002\u0010)\u001a\u00020*J \u0010\"\u001a\u00020%2\u0006\u0010.\u001a\u00020\u000e2\u0006\u0010/\u001a\u00020-2\b\b\u0002\u0010)\u001a\u00020*J\u0018\u0010\"\u001a\u00020%2\u0006\u0010.\u001a\u00020\u000e2\u0006\u0010/\u001a\u00020-H\u0002J\u0018\u00100\u001a\u00020%2\u0006\u0010.\u001a\u00020\u000e2\u0006\u0010/\u001a\u00020-H\u0002J\u000e\u00101\u001a\u00020%2\u0006\u00102\u001a\u00020\u000eJ\b\u00103\u001a\u00020%H\u0002J\b\u00104\u001a\u000205H\u0014J\u0012\u00106\u001a\u00020%2\b\u00107\u001a\u0004\u0018\u000105H\u0014R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R(\u0010\u0018\u001a\u0004\u0018\u00010\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R$\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010 \u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010\u001fR\u000e\u0010#\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006:"}, m3636d2 = {"Lcom/robinhood/android/designsystem/progress/RdsSegmentedProgressBar;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "progressBars", "", "Lcom/robinhood/android/designsystem/progress/RdsProgressBar;", "getProgressBars", "()Ljava/util/List;", "targetProgress", "", "currentAnimator", "Landroid/animation/ObjectAnimator;", "value", "Landroid/content/res/ColorStateList;", "progressTint", "getProgressTint", "()Landroid/content/res/ColorStateList;", "setProgressTint", "(Landroid/content/res/ColorStateList;)V", "progressBackgroundTint", "getProgressBackgroundTint", "setProgressBackgroundTint", "numSegments", "getNumSegments", "()I", "setNumSegments", "(I)V", "progress", "getProgress", "setProgress", "millisPerSegment", "setSegments", "", "newNumSegments", "setProgressBySegment", "segment", "animate", "", "setProgressByAbsolutePosition", "position", "", "segmentIdx", "segmentProgress", "animateToProgress", "setMillisPerSegment", "newMillisPerSegment", "cancelAnimations", "onSaveInstanceState", "Landroid/os/Parcelable;", "onRestoreInstanceState", "state", "SavedState", "Companion", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes17.dex */
public final class RdsSegmentedProgressBar extends Hammer_RdsSegmentedProgressBar {
    public static final int MILLISECONDS_PER_SEGMENT = 2000;
    public static final int SEGMENT_MAX_PROGRESS = 250;
    private ObjectAnimator currentAnimator;
    private int millisPerSegment;
    private int numSegments;
    private ColorStateList progressBackgroundTint;
    private ColorStateList progressTint;
    private int targetProgress;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RdsSegmentedProgressBar(Context context, AttributeSet attrs) {
        super(context, attrs, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.numSegments = getProgressBars().size();
        this.millisPerSegment = 2000;
        setOrientation(0);
        int[] SegmentedProgressBar = C13997R.styleable.SegmentedProgressBar;
        Intrinsics.checkNotNullExpressionValue(SegmentedProgressBar, "SegmentedProgressBar");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, SegmentedProgressBar, 0, 0);
        setProgressTint(typedArrayObtainStyledAttributes.getColorStateList(C13997R.styleable.SegmentedProgressBar_android_progressTint));
        setProgressBackgroundTint(typedArrayObtainStyledAttributes.getColorStateList(C13997R.styleable.SegmentedProgressBar_android_progressBackgroundTint));
        this.millisPerSegment = typedArrayObtainStyledAttributes.getInt(C13997R.styleable.SegmentedProgressBar_millisPerSegment, 2000);
        typedArrayObtainStyledAttributes.recycle();
    }

    private final List<RdsProgressBar> getProgressBars() {
        Sequence sequenceFilter = SequencesKt.filter(ViewGroup2.getChildren(this), new Function1<Object, Boolean>() { // from class: com.robinhood.android.designsystem.progress.RdsSegmentedProgressBar$special$$inlined$filterIsInstance$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof RdsProgressBar);
            }
        });
        Intrinsics.checkNotNull(sequenceFilter, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>");
        return SequencesKt.toList(sequenceFilter);
    }

    public final ColorStateList getProgressTint() {
        return this.progressTint;
    }

    public final void setProgressTint(ColorStateList colorStateList) {
        this.progressTint = colorStateList;
        if (colorStateList != null) {
            Iterator<T> it = getProgressBars().iterator();
            while (it.hasNext()) {
                ((RdsProgressBar) it.next()).setProgressTintList(colorStateList);
            }
        }
    }

    public final ColorStateList getProgressBackgroundTint() {
        return this.progressBackgroundTint;
    }

    public final void setProgressBackgroundTint(ColorStateList colorStateList) {
        this.progressBackgroundTint = colorStateList;
        if (colorStateList != null) {
            Iterator<T> it = getProgressBars().iterator();
            while (it.hasNext()) {
                ((RdsProgressBar) it.next()).setProgressBackgroundTintList(colorStateList);
            }
        }
    }

    public final int getNumSegments() {
        return this.numSegments;
    }

    public final void setNumSegments(int i) {
        if (this.numSegments != i) {
            this.numSegments = i;
            setSegments(Math.max(i, 1));
        }
    }

    private final int getProgress() {
        Iterator<T> it = getProgressBars().iterator();
        int progress = 0;
        while (it.hasNext()) {
            progress += ((RdsProgressBar) it.next()).getProgress();
        }
        return progress;
    }

    private final void setProgress(int i) {
        int i2 = i / 250;
        int i3 = i - (i2 * 250);
        int i4 = 0;
        for (Object obj : getProgressBars()) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            RdsProgressBar rdsProgressBar = (RdsProgressBar) obj;
            if (i4 < i2) {
                rdsProgressBar.setProgress(250);
            } else if (i4 == i2) {
                rdsProgressBar.setProgress(i3);
            } else if (i4 > i2) {
                rdsProgressBar.setProgress(0);
            } else {
                Preconditions.INSTANCE.failUnexpectedItemKotlin(Integer.valueOf(i4));
                throw new ExceptionsH();
            }
            i4 = i5;
        }
    }

    private final void setSegments(int newNumSegments) {
        this.targetProgress = 0;
        cancelAnimations();
        removeAllViews();
        for (int i = 0; i < newNumSegments; i++) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            View viewInflate = ContextSystemServices.getLayoutInflater(context).inflate(C13997R.layout.include_rds_progress_bar_segmented_component, (ViewGroup) this, false);
            Intrinsics.checkNotNull(viewInflate, "null cannot be cast to non-null type com.robinhood.android.designsystem.progress.RdsProgressBar");
            RdsProgressBar rdsProgressBar = (RdsProgressBar) viewInflate;
            ColorStateList colorStateList = this.progressTint;
            if (colorStateList != null) {
                rdsProgressBar.setProgressTintList(colorStateList);
            }
            ColorStateList colorStateList2 = this.progressBackgroundTint;
            if (colorStateList2 != null) {
                rdsProgressBar.setProgressBackgroundTintList(colorStateList2);
            }
            if (i == newNumSegments - 1) {
                ViewsKt.setMarginEnd(rdsProgressBar, 0);
            }
            rdsProgressBar.setMax(250);
            addView(rdsProgressBar);
        }
    }

    public static /* synthetic */ void setProgressBySegment$default(RdsSegmentedProgressBar rdsSegmentedProgressBar, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        rdsSegmentedProgressBar.setProgressBySegment(i, z);
    }

    public final void setProgressBySegment(int segment, boolean animate) {
        int iCoerceIn = RangesKt.coerceIn(segment, 0, this.numSegments);
        if (iCoerceIn == 0) {
            setProgressByAbsolutePosition(0.0f, animate);
        } else {
            setProgress(iCoerceIn - 1, 1.0f, animate);
        }
    }

    public static /* synthetic */ void setProgressByAbsolutePosition$default(RdsSegmentedProgressBar rdsSegmentedProgressBar, float f, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        rdsSegmentedProgressBar.setProgressByAbsolutePosition(f, z);
    }

    public final void setProgressByAbsolutePosition(float position, boolean animate) {
        float fCoerceIn = RangesKt.coerceIn(position, 0.0f, 1.0f) * this.numSegments;
        int i = (int) fCoerceIn;
        setProgress(i, fCoerceIn - i, animate);
    }

    public static /* synthetic */ void setProgress$default(RdsSegmentedProgressBar rdsSegmentedProgressBar, int i, float f, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        rdsSegmentedProgressBar.setProgress(i, f, z);
    }

    public final void setProgress(int segmentIdx, float segmentProgress, boolean animate) {
        float fCoerceIn = RangesKt.coerceIn(segmentProgress, 0.0f, 1.0f);
        if (animate) {
            animateToProgress(segmentIdx, fCoerceIn);
        } else {
            setProgress(segmentIdx, fCoerceIn);
        }
    }

    private final void setProgress(int segmentIdx, float segmentProgress) {
        cancelAnimations();
        int i = (segmentIdx * 250) + ((int) (segmentProgress * 250));
        this.targetProgress = i;
        setProgress(i);
    }

    private final void animateToProgress(int segmentIdx, float segmentProgress) {
        cancelAnimations();
        this.targetProgress = (segmentIdx * 250) + ((int) (segmentProgress * 250));
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this, "progress", getProgress(), this.targetProgress);
        objectAnimatorOfInt.setDuration(Math.abs((this.millisPerSegment * (this.targetProgress - getProgress())) / 250));
        objectAnimatorOfInt.setInterpolator(new PathInterpolator(0.17f, 0.17f, 0.1f, 1.0f));
        this.currentAnimator = objectAnimatorOfInt;
        objectAnimatorOfInt.start();
    }

    public final void setMillisPerSegment(int newMillisPerSegment) {
        this.millisPerSegment = newMillisPerSegment;
    }

    private final void cancelAnimations() {
        ObjectAnimator objectAnimator = this.currentAnimator;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
        }
        ObjectAnimator objectAnimator2 = this.currentAnimator;
        if (objectAnimator2 != null) {
            objectAnimator2.cancel();
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        return new SavedState(getProgressBars().size(), this.targetProgress, this.millisPerSegment, super.onSaveInstanceState());
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable state) {
        Intrinsics.checkNotNull(state, "null cannot be cast to non-null type com.robinhood.android.designsystem.progress.RdsSegmentedProgressBar.SavedState");
        SavedState savedState = (SavedState) state;
        setSegments(savedState.getNumSegments());
        int targetProgress = savedState.getTargetProgress();
        this.targetProgress = targetProgress;
        setProgress(targetProgress);
        this.millisPerSegment = savedState.getMillisPerSegment();
        super.onRestoreInstanceState(savedState.getInSuperState());
    }

    /* compiled from: RdsSegmentedProgressBar.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/designsystem/progress/RdsSegmentedProgressBar$SavedState;", "Landroid/view/AbsSavedState;", "numSegments", "", "targetProgress", "millisPerSegment", "inSuperState", "Landroid/os/Parcelable;", "<init>", "(IIILandroid/os/Parcelable;)V", "getNumSegments", "()I", "getTargetProgress", "getMillisPerSegment", "getInSuperState", "()Landroid/os/Parcelable;", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes2.dex */
    private static final class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Creator();
        private final Parcelable inSuperState;
        private final int millisPerSegment;
        private final int numSegments;
        private final int targetProgress;

        /* compiled from: RdsSegmentedProgressBar.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<SavedState> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SavedState(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readParcelable(SavedState.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.numSegments);
            dest.writeInt(this.targetProgress);
            dest.writeInt(this.millisPerSegment);
            dest.writeParcelable(this.inSuperState, flags);
        }

        public final int getNumSegments() {
            return this.numSegments;
        }

        public final int getTargetProgress() {
            return this.targetProgress;
        }

        public final int getMillisPerSegment() {
            return this.millisPerSegment;
        }

        public final Parcelable getInSuperState() {
            return this.inSuperState;
        }

        public SavedState(int i, int i2, int i3, Parcelable parcelable) {
            super(parcelable);
            this.numSegments = i;
            this.targetProgress = i2;
            this.millisPerSegment = i3;
            this.inSuperState = parcelable;
        }
    }
}
