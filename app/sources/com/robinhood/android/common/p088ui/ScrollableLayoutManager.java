package com.robinhood.android.common.p088ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import com.jakewharton.rxbinding3.view.RxView;
import com.robinhood.android.common.p088ui.ScrollableLayoutManager;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.Observables;
import io.reactivex.subjects.BehaviorSubject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ScrollableLayoutManager.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0017\u0018\u00002\u00020\u0001:\u0005./012B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0019\u001a\u00020\u001a2\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u001d\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0002\u0010\u001fJ%\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010 \u001a\u00020!¢\u0006\u0002\u0010\"J\u0010\u0010#\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020\u0007H\u0016J\u001c\u0010%\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020\u00072\n\u0010&\u001a\u00060'R\u00020\u0007H\u0016J \u0010(\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010)\u001a\u00020*2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J'\u0010+\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010,\u001a\u00020!H\u0002¢\u0006\u0002\u0010\"J\u001f\u0010-\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0002\u0010\u001fR\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\f0\f0\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015¨\u00063"}, m3636d2 = {"Lcom/robinhood/android/common/ui/ScrollableLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "listener", "Lcom/robinhood/android/common/ui/ScrollableLayoutManager$OnScrollCompleteListener;", "targetSubject", "Lio/reactivex/subjects/BehaviorSubject;", "Lcom/robinhood/android/common/ui/ScrollableLayoutManager$Target;", "kotlin.jvm.PlatformType", "disposable", "Lio/reactivex/disposables/Disposable;", "snapMode", "Lcom/robinhood/android/common/ui/ScrollableLayoutManager$SnapMode;", "getSnapMode", "()Lcom/robinhood/android/common/ui/ScrollableLayoutManager$SnapMode;", "setSnapMode", "(Lcom/robinhood/android/common/ui/ScrollableLayoutManager$SnapMode;)V", "offsetSnapMode", "getOffsetSnapMode", "setOffsetSnapMode", "setOnScrollCompleteListener", "", "scrollToPositionWithOffset", "position", "", "offset", "(ILjava/lang/Integer;)V", "smoothScroll", "", "(ILjava/lang/Integer;Z)V", "onAttachedToWindow", "view", "onDetachedFromWindow", "recycler", "Landroidx/recyclerview/widget/RecyclerView$Recycler;", "smoothScrollToPosition", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "startSmoothScroll", "shouldSmoothScroll", "completeOrRetry", "SnapMode", "OnScrollCompleteListener", "Target", "Scroller", "InstantScroller", "lib-common-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public class ScrollableLayoutManager extends LinearLayoutManager {
    public static final int $stable = 8;
    private Disposable disposable;
    private OnScrollCompleteListener listener;
    private SnapMode offsetSnapMode;
    private RecyclerView recyclerView;
    private SnapMode snapMode;
    private BehaviorSubject<Target> targetSubject;

    /* compiled from: ScrollableLayoutManager.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/common/ui/ScrollableLayoutManager$OnScrollCompleteListener;", "", "onScrollComplete", "", "lib-common-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface OnScrollCompleteListener {
        void onScrollComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onAttachedToWindow$lambda$0() {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableLayoutManager(Context context) {
        super(context, 1, false);
        Intrinsics.checkNotNullParameter(context, "context");
        BehaviorSubject<Target> behaviorSubjectCreate = BehaviorSubject.create();
        Intrinsics.checkNotNullExpressionValue(behaviorSubjectCreate, "create(...)");
        this.targetSubject = behaviorSubjectCreate;
        this.snapMode = SnapMode.ANY;
        this.offsetSnapMode = SnapMode.START;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ScrollableLayoutManager.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/common/ui/ScrollableLayoutManager$SnapMode;", "", "<init>", "(Ljava/lang/String;I)V", "CENTER", "START", "END", "ANY", "lib-common-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class SnapMode {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ SnapMode[] $VALUES;
        public static final SnapMode CENTER = new SnapMode("CENTER", 0);
        public static final SnapMode START = new SnapMode("START", 1);
        public static final SnapMode END = new SnapMode("END", 2);
        public static final SnapMode ANY = new SnapMode("ANY", 3);

        private static final /* synthetic */ SnapMode[] $values() {
            return new SnapMode[]{CENTER, START, END, ANY};
        }

        public static EnumEntries<SnapMode> getEntries() {
            return $ENTRIES;
        }

        private SnapMode(String str, int i) {
        }

        static {
            SnapMode[] snapModeArr$values = $values();
            $VALUES = snapModeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(snapModeArr$values);
        }

        public static SnapMode valueOf(String str) {
            return (SnapMode) Enum.valueOf(SnapMode.class, str);
        }

        public static SnapMode[] values() {
            return (SnapMode[]) $VALUES.clone();
        }
    }

    public final SnapMode getSnapMode() {
        return this.snapMode;
    }

    public final void setSnapMode(SnapMode snapMode) {
        Intrinsics.checkNotNullParameter(snapMode, "<set-?>");
        this.snapMode = snapMode;
    }

    public final SnapMode getOffsetSnapMode() {
        return this.offsetSnapMode;
    }

    public final void setOffsetSnapMode(SnapMode snapMode) {
        Intrinsics.checkNotNullParameter(snapMode, "<set-?>");
        this.offsetSnapMode = snapMode;
    }

    public final void setOnScrollCompleteListener(OnScrollCompleteListener listener) {
        this.listener = listener;
    }

    public final void scrollToPositionWithOffset(int position, Integer offset) {
        this.targetSubject.onNext(new Target(position, offset, false, 4, null));
    }

    public final void scrollToPositionWithOffset(int position, Integer offset, boolean smoothScroll) {
        this.targetSubject.onNext(new Target(position, offset, smoothScroll));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAttachedToWindow(RecyclerView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onAttachedToWindow(view);
        this.recyclerView = view;
        BehaviorSubject<Target> behaviorSubjectCreate = BehaviorSubject.create();
        Intrinsics.checkNotNullExpressionValue(behaviorSubjectCreate, "create(...)");
        this.targetSubject = behaviorSubjectCreate;
        Observable<Unit> observableConcatWith = RxView.preDraws(view, new Function0() { // from class: com.robinhood.android.common.ui.ScrollableLayoutManager$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(ScrollableLayoutManager.onAttachedToWindow$lambda$0());
            }
        }).take(1L).concatWith(Observable.never());
        Disposable disposable = this.disposable;
        if (disposable != null) {
            disposable.dispose();
        }
        Observables observables = Observables.INSTANCE;
        BehaviorSubject<Target> behaviorSubject = this.targetSubject;
        Intrinsics.checkNotNull(observableConcatWith);
        Observable observableCombineLatest = Observable.combineLatest(behaviorSubject, observableConcatWith, new BiFunction<T1, T2, R>() { // from class: com.robinhood.android.common.ui.ScrollableLayoutManager$onAttachedToWindow$$inlined$combineLatest$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.BiFunction
            public final R apply(T1 t1, T2 t2) {
                Intrinsics.checkParameterIsNotNull(t1, "t1");
                Intrinsics.checkParameterIsNotNull(t2, "t2");
                return (R) ((ScrollableLayoutManager.Target) t1);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observableCombineLatest, "Observable.combineLatest…ombineFunction(t1, t2) })");
        this.disposable = observableCombineLatest.subscribe(new Consumer() { // from class: com.robinhood.android.common.ui.ScrollableLayoutManager.onAttachedToWindow.2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Target target) {
                ScrollableLayoutManager.this.startSmoothScroll(target.getPosition(), target.getOffset(), target.getSmoothScroll());
            }
        });
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onDetachedFromWindow(RecyclerView view, RecyclerView.Recycler recycler) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(recycler, "recycler");
        super.onDetachedFromWindow(view, recycler);
        this.recyclerView = null;
        Disposable disposable = this.disposable;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int position) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(state, "state");
        super.smoothScrollToPosition(recyclerView, state, position);
        this.targetSubject.onNext(new Target(position, null, false, 6, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startSmoothScroll(int position, Integer offset, boolean shouldSmoothScroll) {
        Scroller instantScroller;
        RecyclerView recyclerView = this.recyclerView;
        if (recyclerView == null) {
            return;
        }
        Context context = recyclerView.getContext();
        if (shouldSmoothScroll) {
            Intrinsics.checkNotNull(context);
            instantScroller = new Scroller(this, context);
        } else {
            Intrinsics.checkNotNull(context);
            instantScroller = new InstantScroller(this, context);
        }
        instantScroller.setTargetPosition(position);
        instantScroller.setTargetOffset(offset);
        startSmoothScroll(instantScroller);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void completeOrRetry(int position, Integer offset) {
        Target value = this.targetSubject.getValue();
        if (value == null) {
            return;
        }
        if (value.getPosition() == position && Intrinsics.areEqual(value.getOffset(), offset)) {
            OnScrollCompleteListener onScrollCompleteListener = this.listener;
            if (onScrollCompleteListener != null) {
                onScrollCompleteListener.onScrollComplete();
                return;
            }
            return;
        }
        this.targetSubject.onNext(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ScrollableLayoutManager.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J.\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/common/ui/ScrollableLayoutManager$Target;", "", "position", "", "offset", "smoothScroll", "", "<init>", "(ILjava/lang/Integer;Z)V", "getPosition", "()I", "getOffset", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSmoothScroll", "()Z", "component1", "component2", "component3", "copy", "(ILjava/lang/Integer;Z)Lcom/robinhood/android/common/ui/ScrollableLayoutManager$Target;", "equals", "other", "hashCode", "toString", "", "lib-common-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static final /* data */ class Target {
        private final Integer offset;
        private final int position;
        private final boolean smoothScroll;

        public static /* synthetic */ Target copy$default(Target target, int i, Integer num, boolean z, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = target.position;
            }
            if ((i2 & 2) != 0) {
                num = target.offset;
            }
            if ((i2 & 4) != 0) {
                z = target.smoothScroll;
            }
            return target.copy(i, num, z);
        }

        /* renamed from: component1, reason: from getter */
        public final int getPosition() {
            return this.position;
        }

        /* renamed from: component2, reason: from getter */
        public final Integer getOffset() {
            return this.offset;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getSmoothScroll() {
            return this.smoothScroll;
        }

        public final Target copy(int position, Integer offset, boolean smoothScroll) {
            return new Target(position, offset, smoothScroll);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Target)) {
                return false;
            }
            Target target = (Target) other;
            return this.position == target.position && Intrinsics.areEqual(this.offset, target.offset) && this.smoothScroll == target.smoothScroll;
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.position) * 31;
            Integer num = this.offset;
            return ((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + Boolean.hashCode(this.smoothScroll);
        }

        public String toString() {
            return "Target(position=" + this.position + ", offset=" + this.offset + ", smoothScroll=" + this.smoothScroll + ")";
        }

        public Target(int i, Integer num, boolean z) {
            this.position = i;
            this.offset = num;
            this.smoothScroll = z;
        }

        public /* synthetic */ Target(int i, Integer num, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i2 & 2) != 0 ? null : num, (i2 & 4) != 0 ? true : z);
        }

        public final int getPosition() {
            return this.position;
        }

        public final Integer getOffset() {
            return this.offset;
        }

        public final boolean getSmoothScroll() {
            return this.smoothScroll;
        }
    }

    /* compiled from: ScrollableLayoutManager.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0092\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0014J\b\u0010\u001b\u001a\u00020\u0014H\u0014J0\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u0007H\u0016J(\u0010\"\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u0007H\u0002R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/common/ui/ScrollableLayoutManager$Scroller;", "Landroidx/recyclerview/widget/LinearSmoothScroller;", "context", "Landroid/content/Context;", "<init>", "(Lcom/robinhood/android/common/ui/ScrollableLayoutManager;Landroid/content/Context;)V", "targetOffset", "", "getTargetOffset", "()Ljava/lang/Integer;", "setTargetOffset", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "hasFoundTarget", "", "getHasFoundTarget", "()Z", "setHasFoundTarget", "(Z)V", "onTargetFound", "", "targetView", "Landroid/view/View;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "action", "Landroidx/recyclerview/widget/RecyclerView$SmoothScroller$Action;", "onStop", "calculateDtToFit", "viewStart", "viewEnd", "boxStart", "boxEnd", "snapPreference", "calculateRawDt", "lib-common-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private class Scroller extends LinearSmoothScroller {
        private boolean hasFoundTarget;
        private Integer targetOffset;
        final /* synthetic */ ScrollableLayoutManager this$0;

        /* compiled from: ScrollableLayoutManager.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[SnapMode.values().length];
                try {
                    iArr[SnapMode.START.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[SnapMode.END.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[SnapMode.ANY.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[SnapMode.CENTER.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Scroller(ScrollableLayoutManager scrollableLayoutManager, Context context) {
            super(context);
            Intrinsics.checkNotNullParameter(context, "context");
            this.this$0 = scrollableLayoutManager;
        }

        public final Integer getTargetOffset() {
            return this.targetOffset;
        }

        public final void setTargetOffset(Integer num) {
            this.targetOffset = num;
        }

        public final boolean getHasFoundTarget() {
            return this.hasFoundTarget;
        }

        public final void setHasFoundTarget(boolean z) {
            this.hasFoundTarget = z;
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller, androidx.recyclerview.widget.RecyclerView.SmoothScroller
        protected void onTargetFound(View targetView, RecyclerView.State state, RecyclerView.SmoothScroller.Action action) {
            Intrinsics.checkNotNullParameter(targetView, "targetView");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(action, "action");
            super.onTargetFound(targetView, state, action);
            this.hasFoundTarget = true;
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller, androidx.recyclerview.widget.RecyclerView.SmoothScroller
        protected void onStop() {
            super.onStop();
            if (this.hasFoundTarget) {
                this.this$0.completeOrRetry(getTargetPosition(), this.targetOffset);
            }
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public int calculateDtToFit(int viewStart, int viewEnd, int boxStart, int boxEnd, int snapPreference) {
            int iCalculateRawDt = calculateRawDt(viewStart, viewEnd, boxStart, boxEnd);
            Integer num = this.targetOffset;
            return iCalculateRawDt + (num != null ? num.intValue() : 0);
        }

        private final int calculateRawDt(int viewStart, int viewEnd, int boxStart, int boxEnd) {
            int i = WhenMappings.$EnumSwitchMapping$0[(this.targetOffset == null ? this.this$0.getSnapMode() : this.this$0.getOffsetSnapMode()).ordinal()];
            if (i == 1) {
                return super.calculateDtToFit(viewStart, viewEnd, boxStart, boxEnd, -1);
            }
            if (i == 2) {
                return super.calculateDtToFit(viewStart, viewEnd, boxStart, boxEnd, 1);
            }
            if (i == 3) {
                return super.calculateDtToFit(viewStart, viewEnd, boxStart, boxEnd, 0);
            }
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            return (boxStart - (viewStart + ((viewEnd - viewStart) / 2))) + ((boxEnd - boxStart) / 2);
        }
    }

    /* compiled from: ScrollableLayoutManager.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J(\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0014¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/common/ui/ScrollableLayoutManager$InstantScroller;", "Lcom/robinhood/android/common/ui/ScrollableLayoutManager$Scroller;", "Lcom/robinhood/android/common/ui/ScrollableLayoutManager;", "context", "Landroid/content/Context;", "<init>", "(Lcom/robinhood/android/common/ui/ScrollableLayoutManager;Landroid/content/Context;)V", "onSeekTargetStep", "", "dx", "", "dy", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "action", "Landroidx/recyclerview/widget/RecyclerView$SmoothScroller$Action;", "lib-common-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private final class InstantScroller extends Scroller {
        final /* synthetic */ ScrollableLayoutManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InstantScroller(ScrollableLayoutManager scrollableLayoutManager, Context context) {
            super(scrollableLayoutManager, context);
            Intrinsics.checkNotNullParameter(context, "context");
            this.this$0 = scrollableLayoutManager;
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller, androidx.recyclerview.widget.RecyclerView.SmoothScroller
        protected void onSeekTargetStep(int dx, int dy, RecyclerView.State state, RecyclerView.SmoothScroller.Action action) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(action, "action");
            action.jumpTo(getTargetPosition());
        }
    }
}
