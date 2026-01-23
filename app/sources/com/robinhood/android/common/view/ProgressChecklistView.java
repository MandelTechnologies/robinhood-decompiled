package com.robinhood.android.common.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.customview.view.AbsSavedState;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BindViewDelegate2;
import com.robinhood.android.common.view.ProgressChecklistRowView;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.animation.Animators;
import com.robinhood.utils.p409ui.view.OnHierarchyChangeListenerAdapter;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: ProgressChecklistView.kt */
@Metadata(m3635d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002?@B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010!\u001a\u00020\"H\u0002J\b\u0010#\u001a\u00020\"H\u0002J\u0010\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\u001cH\u0002J\u0010\u0010,\u001a\u00020\"2\b\u0010-\u001a\u0004\u0018\u00010.J\b\u0010/\u001a\u00020\u001cH\u0002J4\u00100\u001a\u00020\"2\u0006\u00101\u001a\u00020\f2\u0006\u00102\u001a\u00020\n2\b\u00103\u001a\u0004\u0018\u0001042\b\u00105\u001a\u0004\u0018\u0001042\b\u00106\u001a\u0004\u0018\u000104J\u0006\u00107\u001a\u00020\"J\u0016\u00108\u001a\u00020\"2\u000e\b\u0002\u00109\u001a\b\u0012\u0004\u0012\u00020.0:J\b\u0010;\u001a\u00020<H\u0014J\u0010\u0010=\u001a\u00020\"2\u0006\u0010>\u001a\u00020<H\u0014R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0018\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0012\u001a\u0004\b\u0019\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0012\u0010\u001f\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010 R\u001c\u0010&\u001a\u0004\u0018\u00010'X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+¨\u0006A"}, m3636d2 = {"Lcom/robinhood/android/common/view/ProgressChecklistView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/robinhood/utils/ui/view/OnHierarchyChangeListenerAdapter;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "checklistRowLayoutId", "", "useDesignSystem", "", "completedCard", "Landroidx/cardview/widget/CardView;", "getCompletedCard", "()Landroidx/cardview/widget/CardView;", "completedCard$delegate", "Lkotlin/properties/ReadOnlyProperty;", "completedContent", "Landroid/widget/LinearLayout;", "getCompletedContent", "()Landroid/widget/LinearLayout;", "completedContent$delegate", "pendingContent", "getPendingContent", "pendingContent$delegate", "currentPendingView", "Lcom/robinhood/android/common/view/ProgressChecklistRowView;", "getCurrentPendingView", "()Lcom/robinhood/android/common/view/ProgressChecklistRowView;", "currentPromptId", "Ljava/lang/Integer;", "beginTransition", "", "updateCompletedCardVisibility", "bindButtonClickListeners", "rowView", "clickListener", "Lcom/robinhood/android/common/view/ProgressChecklistView$ClickListener;", "getClickListener", "()Lcom/robinhood/android/common/view/ProgressChecklistView$ClickListener;", "setClickListener", "(Lcom/robinhood/android/common/view/ProgressChecklistView$ClickListener;)V", "push", "currentStageTitle", "", "createRowView", "displayPrompt", "isError", "promptId", "promptMessage", "", "positiveButtonLabel", "negativeButtonLabel", "clear", "reset", "completedStageTitles", "", "onSaveInstanceState", "Landroid/os/Parcelable;", "onRestoreInstanceState", "state", "ClickListener", "SavedState", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class ProgressChecklistView extends ConstraintLayout implements OnHierarchyChangeListenerAdapter {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(ProgressChecklistView.class, "completedCard", "getCompletedCard()Landroidx/cardview/widget/CardView;", 0)), Reflection.property1(new PropertyReference1Impl(ProgressChecklistView.class, "completedContent", "getCompletedContent()Landroid/widget/LinearLayout;", 0)), Reflection.property1(new PropertyReference1Impl(ProgressChecklistView.class, "pendingContent", "getPendingContent()Landroid/widget/LinearLayout;", 0))};
    public static final int $stable = 8;
    private int checklistRowLayoutId;
    private ClickListener clickListener;

    /* renamed from: completedCard$delegate, reason: from kotlin metadata */
    private final Interfaces2 completedCard;

    /* renamed from: completedContent$delegate, reason: from kotlin metadata */
    private final Interfaces2 completedContent;
    private Integer currentPromptId;

    /* renamed from: pendingContent$delegate, reason: from kotlin metadata */
    private final Interfaces2 pendingContent;
    private boolean useDesignSystem;

    /* compiled from: ProgressChecklistView.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/common/view/ProgressChecklistView$ClickListener;", "", "onPositiveButtonClicked", "", "promptId", "", "onNegativeButtonClicked", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface ClickListener {
        void onNegativeButtonClicked(int promptId);

        void onPositiveButtonClicked(int promptId);
    }

    public /* synthetic */ ProgressChecklistView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    @Override // com.robinhood.utils.p409ui.view.OnHierarchyChangeListenerAdapter, android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewAdded(View view, View view2) {
        OnHierarchyChangeListenerAdapter.DefaultImpls.onChildViewAdded(this, view, view2);
    }

    @Override // com.robinhood.utils.p409ui.view.OnHierarchyChangeListenerAdapter, android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewRemoved(View view, View view2) {
        OnHierarchyChangeListenerAdapter.DefaultImpls.onChildViewRemoved(this, view, view2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressChecklistView(Context context, AttributeSet attributeSet) {
        int i;
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        int[] ProgressChecklistView = C11048R.styleable.ProgressChecklistView;
        Intrinsics.checkNotNullExpressionValue(ProgressChecklistView, "ProgressChecklistView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ProgressChecklistView, 0, 0);
        this.useDesignSystem = typedArrayObtainStyledAttributes.getBoolean(C11048R.styleable.ProgressChecklistView_useDesignSystem, false);
        this.checklistRowLayoutId = typedArrayObtainStyledAttributes.getResourceId(C11048R.styleable.ProgressChecklistView_rowLayoutId, C11048R.layout.include_progress_checklist_row);
        if (this.useDesignSystem) {
            i = C11048R.layout.merge_progress_checklist_design_system;
        } else {
            i = C11048R.layout.merge_progress_checklist;
        }
        ViewGroups.inflate(this, i, true);
        typedArrayObtainStyledAttributes.recycle();
        this.completedCard = BindViewDelegate2.bindView$default(this, C11048R.id.progress_checklist_card_completed, null, 2, null);
        this.completedContent = BindViewDelegate2.bindView$default(this, C11048R.id.progress_checklist_card_completed_content, null, 2, null);
        this.pendingContent = BindViewDelegate2.bindView$default(this, C11048R.id.progress_checklist_card_pending_content, null, 2, null);
        getCompletedContent().setOnHierarchyChangeListener(new OnHierarchyChangeListenerAdapter() { // from class: com.robinhood.android.common.view.ProgressChecklistView.2
            @Override // com.robinhood.utils.p409ui.view.OnHierarchyChangeListenerAdapter, android.view.ViewGroup.OnHierarchyChangeListener
            public void onChildViewRemoved(View parent, View child) {
                Intrinsics.checkNotNullParameter(parent, "parent");
                Intrinsics.checkNotNullParameter(child, "child");
                ProgressChecklistView.this.updateCompletedCardVisibility();
            }

            @Override // com.robinhood.utils.p409ui.view.OnHierarchyChangeListenerAdapter, android.view.ViewGroup.OnHierarchyChangeListener
            public void onChildViewAdded(View parent, View child) {
                Intrinsics.checkNotNullParameter(parent, "parent");
                Intrinsics.checkNotNullParameter(child, "child");
                ProgressChecklistView.this.updateCompletedCardVisibility();
            }
        });
        getPendingContent().setOnHierarchyChangeListener(new OnHierarchyChangeListenerAdapter() { // from class: com.robinhood.android.common.view.ProgressChecklistView.3
            @Override // com.robinhood.utils.p409ui.view.OnHierarchyChangeListenerAdapter, android.view.ViewGroup.OnHierarchyChangeListener
            public void onChildViewRemoved(View view, View view2) {
                OnHierarchyChangeListenerAdapter.DefaultImpls.onChildViewRemoved(this, view, view2);
            }

            @Override // com.robinhood.utils.p409ui.view.OnHierarchyChangeListenerAdapter, android.view.ViewGroup.OnHierarchyChangeListener
            public void onChildViewAdded(View parent, View child) {
                Intrinsics.checkNotNullParameter(parent, "parent");
                Intrinsics.checkNotNullParameter(child, "child");
                ProgressChecklistView.this.bindButtonClickListeners((ProgressChecklistRowView) child);
            }
        });
    }

    private final CardView getCompletedCard() {
        return (CardView) this.completedCard.getValue(this, $$delegatedProperties[0]);
    }

    private final LinearLayout getCompletedContent() {
        return (LinearLayout) this.completedContent.getValue(this, $$delegatedProperties[1]);
    }

    private final LinearLayout getPendingContent() {
        return (LinearLayout) this.pendingContent.getValue(this, $$delegatedProperties[2]);
    }

    private final ProgressChecklistRowView getCurrentPendingView() {
        View childAt = getPendingContent().getChildAt(0);
        ProgressChecklistRowView progressChecklistRowView = childAt instanceof ProgressChecklistRowView ? (ProgressChecklistRowView) childAt : null;
        if (progressChecklistRowView != null) {
            return progressChecklistRowView;
        }
        throw new IllegalStateException("Nothing is in progress");
    }

    private final void beginTransition() {
        Animators animators = Animators.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (animators.animationsEnabled(context)) {
            AutoTransition autoTransition = new AutoTransition();
            autoTransition.excludeChildren(ProgressChecklistRowView.class, true);
            TransitionManager.beginDelayedTransition(this, autoTransition);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateCompletedCardVisibility() {
        if (this.useDesignSystem) {
            return;
        }
        getCompletedCard().setVisibility(getCompletedContent().getChildCount() > 0 ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindButtonClickListeners(ProgressChecklistRowView rowView) {
        rowView.onPositiveButtonClicked(new Function0() { // from class: com.robinhood.android.common.view.ProgressChecklistView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProgressChecklistView.bindButtonClickListeners$lambda$5$lambda$3(this.f$0);
            }
        });
        rowView.onNegativeButtonClicked(new Function0() { // from class: com.robinhood.android.common.view.ProgressChecklistView$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProgressChecklistView.bindButtonClickListeners$lambda$5$lambda$4(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindButtonClickListeners$lambda$5$lambda$3(ProgressChecklistView progressChecklistView) {
        ClickListener clickListener = progressChecklistView.clickListener;
        if (clickListener != null) {
            Integer num = progressChecklistView.currentPromptId;
            Intrinsics.checkNotNull(num);
            clickListener.onPositiveButtonClicked(num.intValue());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindButtonClickListeners$lambda$5$lambda$4(ProgressChecklistView progressChecklistView) {
        ClickListener clickListener = progressChecklistView.clickListener;
        if (clickListener != null) {
            Integer num = progressChecklistView.currentPromptId;
            Intrinsics.checkNotNull(num);
            clickListener.onNegativeButtonClicked(num.intValue());
        }
        return Unit.INSTANCE;
    }

    public final ClickListener getClickListener() {
        return this.clickListener;
    }

    public final void setClickListener(ClickListener clickListener) {
        this.clickListener = clickListener;
    }

    public final void push(String currentStageTitle) {
        beginTransition();
        LinearLayout completedContent = getCompletedContent();
        LinearLayout pendingContent = getPendingContent();
        View childAt = pendingContent.getChildAt(0);
        if (childAt != null) {
            ProgressChecklistRowView progressChecklistRowView = (ProgressChecklistRowView) childAt;
            if (Intrinsics.areEqual(progressChecklistRowView.getStageTitle(), currentStageTitle)) {
                progressChecklistRowView.setState(ProgressChecklistRowView.State.IN_PROGRESS);
                progressChecklistRowView.setMessage(null);
                progressChecklistRowView.setPositiveButtonText(null);
                progressChecklistRowView.setNegativeButtonText(null);
                return;
            }
            ProgressChecklistRowView progressChecklistRowViewCreateRowView = createRowView();
            progressChecklistRowViewCreateRowView.setStageTitle(progressChecklistRowView.getStageTitle());
            progressChecklistRowViewCreateRowView.setState(ProgressChecklistRowView.State.COMPLETED);
            progressChecklistRowViewCreateRowView.setMessage(null);
            progressChecklistRowViewCreateRowView.setPositiveButtonText(null);
            progressChecklistRowViewCreateRowView.setNegativeButtonText(null);
            pendingContent.removeViewAt(0);
            completedContent.addView(progressChecklistRowViewCreateRowView);
        }
        if (currentStageTitle != null) {
            ProgressChecklistRowView progressChecklistRowViewCreateRowView2 = createRowView();
            progressChecklistRowViewCreateRowView2.setState(ProgressChecklistRowView.State.IN_PROGRESS);
            progressChecklistRowViewCreateRowView2.setStageTitle(currentStageTitle);
            pendingContent.addView(progressChecklistRowViewCreateRowView2);
        }
    }

    private final ProgressChecklistRowView createRowView() {
        View viewInflate$default = ViewGroups.inflate$default(this, this.checklistRowLayoutId, false, 2, null);
        Intrinsics.checkNotNull(viewInflate$default, "null cannot be cast to non-null type com.robinhood.android.common.view.ProgressChecklistRowView");
        return (ProgressChecklistRowView) viewInflate$default;
    }

    public final void displayPrompt(boolean isError, int promptId, CharSequence promptMessage, CharSequence positiveButtonLabel, CharSequence negativeButtonLabel) {
        ProgressChecklistRowView.State state;
        beginTransition();
        this.currentPromptId = Integer.valueOf(promptId);
        ProgressChecklistRowView currentPendingView = getCurrentPendingView();
        if (isError) {
            state = ProgressChecklistRowView.State.ERROR;
        } else {
            state = ProgressChecklistRowView.State.QUESTION;
        }
        currentPendingView.setState(state);
        currentPendingView.setMessage(promptMessage);
        currentPendingView.setPositiveButtonText(positiveButtonLabel);
        currentPendingView.setNegativeButtonText(negativeButtonLabel);
    }

    public final void clear() {
        beginTransition();
        getCompletedContent().removeAllViews();
        getPendingContent().removeAllViews();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void reset$default(ProgressChecklistView progressChecklistView, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = CollectionsKt.emptyList();
        }
        progressChecklistView.reset(list);
    }

    public final void reset(List<String> completedStageTitles) {
        Intrinsics.checkNotNullParameter(completedStageTitles, "completedStageTitles");
        getCompletedContent().removeAllViews();
        getPendingContent().removeAllViews();
        LinearLayout completedContent = getCompletedContent();
        for (String str : completedStageTitles) {
            ProgressChecklistRowView progressChecklistRowViewCreateRowView = createRowView();
            progressChecklistRowViewCreateRowView.setState(ProgressChecklistRowView.State.COMPLETED);
            progressChecklistRowViewCreateRowView.setStageTitle(str);
            completedContent.addView(progressChecklistRowViewCreateRowView);
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        Intrinsics.checkNotNull(parcelableOnSaveInstanceState);
        return new SavedState(parcelableOnSaveInstanceState, this.currentPromptId);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable state) {
        Intrinsics.checkNotNullParameter(state, "state");
        SavedState savedState = (SavedState) state;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.currentPromptId = savedState.getCurrentPromptId();
    }

    /* compiled from: ProgressChecklistView.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/common/view/ProgressChecklistView$SavedState;", "Landroidx/customview/view/AbsSavedState;", "inSuperState", "Landroid/os/Parcelable;", "currentPromptId", "", "<init>", "(Landroid/os/Parcelable;Ljava/lang/Integer;)V", "getInSuperState", "()Landroid/os/Parcelable;", "getCurrentPromptId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class SavedState extends AbsSavedState {
        public static final int $stable = 8;
        public static final Parcelable.Creator<SavedState> CREATOR = new Creator();
        private final Integer currentPromptId;
        private final Parcelable inSuperState;

        /* compiled from: ProgressChecklistView.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<SavedState> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SavedState(parcel.readParcelable(SavedState.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.inSuperState, flags);
            Integer num = this.currentPromptId;
            if (num == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(num.intValue());
            }
        }

        public final Parcelable getInSuperState() {
            return this.inSuperState;
        }

        public final Integer getCurrentPromptId() {
            return this.currentPromptId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SavedState(Parcelable inSuperState, Integer num) {
            super(inSuperState);
            Intrinsics.checkNotNullParameter(inSuperState, "inSuperState");
            this.inSuperState = inSuperState;
            this.currentPromptId = num;
        }
    }
}
