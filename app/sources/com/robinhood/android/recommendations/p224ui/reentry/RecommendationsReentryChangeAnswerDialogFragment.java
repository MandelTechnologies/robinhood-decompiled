package com.robinhood.android.recommendations.p224ui.reentry;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.autoeventlogging.ViewsKt;
import com.robinhood.android.common.p088ui.BaseDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.selectioncontrol.NewRdsRadioGroup;
import com.robinhood.android.designsystem.selectioncontrol.RdsRadioButtonRowView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.recommendations.C25978R;
import com.robinhood.android.recommendations.databinding.FragmentRecommendationsReentryConfirmAnswerDialogBinding;
import com.robinhood.recommendations.models.p363ui.UiRecommendationsQuestionnaire;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import io.noties.markwon.Markwon;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: RecommendationsReentryChangeAnswerDialogFragment.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 .2\u00020\u00012\u00020\u0002:\u0003,-.B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u001a\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010 \u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020%X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'¨\u0006/"}, m3636d2 = {"Lcom/robinhood/android/recommendations/ui/reentry/RecommendationsReentryChangeAnswerDialogFragment;", "Lcom/robinhood/android/common/ui/BaseDialogFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "binding", "Lcom/robinhood/android/recommendations/databinding/FragmentRecommendationsReentryConfirmAnswerDialogBinding;", "getBinding", "()Lcom/robinhood/android/recommendations/databinding/FragmentRecommendationsReentryConfirmAnswerDialogBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/recommendations/ui/reentry/RecommendationsReentryChangeAnswerDialogFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/recommendations/ui/reentry/RecommendationsReentryChangeAnswerDialogFragment$Callbacks;", "callbacks$delegate", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "excludeFromAutoScreenDisappearEventLogging", "", "getExcludeFromAutoScreenDisappearEventLogging", "()Z", "onViewCreated", "", "view", "Landroid/view/View;", "Callbacks", "Args", "Companion", "feature-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class RecommendationsReentryChangeAnswerDialogFragment extends BaseDialogFragment implements AutoLoggableFragment {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RecommendationsReentryChangeAnswerDialogFragment.class, "binding", "getBinding()Lcom/robinhood/android/recommendations/databinding/FragmentRecommendationsReentryConfirmAnswerDialogBinding;", 0)), Reflection.property1(new PropertyReference1Impl(RecommendationsReentryChangeAnswerDialogFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/recommendations/ui/reentry/RecommendationsReentryChangeAnswerDialogFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    public EventLogger eventLogger;
    private final boolean excludeFromAutoScreenDisappearEventLogging;
    public Markwon markwon;

    /* compiled from: RecommendationsReentryChangeAnswerDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/recommendations/ui/reentry/RecommendationsReentryChangeAnswerDialogFragment$Callbacks;", "", "onUpdateAnswerForReentry", "", "questionId", "Ljava/util/UUID;", "newAnswerId", "feature-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onUpdateAnswerForReentry(UUID questionId, UUID newAnswerId);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenAppearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenAppearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenSourceEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenSourceEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Component getScreenEventComponent() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventComponent(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Context getScreenEventContext() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventContext(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    public RecommendationsReentryChangeAnswerDialogFragment() {
        super(C25978R.layout.fragment_recommendations_reentry_confirm_answer_dialog);
        this.binding = ViewBinding5.viewBinding(this, RecommendationsReentryChangeAnswerDialogFragment2.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.recommendations.ui.reentry.RecommendationsReentryChangeAnswerDialogFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
        this.excludeFromAutoScreenDisappearEventLogging = true;
    }

    public final EventLogger getEventLogger() {
        EventLogger eventLogger = this.eventLogger;
        if (eventLogger != null) {
            return eventLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final void setEventLogger(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "<set-?>");
        this.eventLogger = eventLogger;
    }

    public final Markwon getMarkwon() {
        Markwon markwon = this.markwon;
        if (markwon != null) {
            return markwon;
        }
        Intrinsics.throwUninitializedPropertyAccessException("markwon");
        return null;
    }

    public final void setMarkwon(Markwon markwon) {
        Intrinsics.checkNotNullParameter(markwon, "<set-?>");
        this.markwon = markwon;
    }

    private final FragmentRecommendationsReentryConfirmAnswerDialogBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentRecommendationsReentryConfirmAnswerDialogBinding) value;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(savedInstanceState);
        Window window = dialogOnCreateDialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        return dialogOnCreateDialog;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        Screen.Name name = Screen.Name.RECS_REENTRY_EDIT;
        String string2 = ((Args) INSTANCE.getArgs((Fragment) this)).getQuestion().getId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return new Screen(name, null, string2, null, 10, null);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenDisappearEventLogging() {
        return this.excludeFromAutoScreenDisappearEventLogging;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.util.UUID] */
    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Companion companion = INSTANCE;
        objectRef.element = ((Args) companion.getArgs((Fragment) this)).getCurrentAnswer().getId();
        UiRecommendationsQuestionnaire.Question question = ((Args) companion.getArgs((Fragment) this)).getQuestion();
        final FragmentRecommendationsReentryConfirmAnswerDialogBinding binding = getBinding();
        binding.title.setText(question.getTitle());
        RhTextView subtitle = binding.subtitle;
        Intrinsics.checkNotNullExpressionValue(subtitle, "subtitle");
        TextViewsKt.setVisibilityText(subtitle, question.getSubtitle());
        binding.disclosure.setText(getMarkwon().toMarkdown(question.getDisclosureMarkdown()));
        List<UiRecommendationsQuestionnaire.Answer> allowedAnswers = question.getAllowedAnswers();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(allowedAnswers, 10));
        for (UiRecommendationsQuestionnaire.Answer answer : allowedAnswers) {
            RdsRadioButtonRowView.Companion companion2 = RdsRadioButtonRowView.INSTANCE;
            NewRdsRadioGroup radioGroup = binding.radioGroup;
            Intrinsics.checkNotNullExpressionValue(radioGroup, "radioGroup");
            RdsRadioButtonRowView rdsRadioButtonRowViewInflate = companion2.inflate((ViewGroup) radioGroup);
            rdsRadioButtonRowViewInflate.setId(View.generateViewId());
            rdsRadioButtonRowViewInflate.setPrimaryText(answer.getTitle());
            rdsRadioButtonRowViewInflate.setTag(answer.getId());
            rdsRadioButtonRowViewInflate.setChecked(Intrinsics.areEqual(answer.getId(), ((Args) INSTANCE.getArgs((Fragment) this)).getCurrentAnswer().getId()));
            arrayList.add(rdsRadioButtonRowViewInflate);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            binding.radioGroup.addView((RdsRadioButtonRowView) it.next());
        }
        ImageView navCloseBtn = binding.navCloseBtn;
        Intrinsics.checkNotNullExpressionValue(navCloseBtn, "navCloseBtn");
        OnClickListeners.onClick(navCloseBtn, new RecommendationsReentryChangeAnswerDialogFragment3(this));
        RdsButton confirmBtn = binding.confirmBtn;
        Intrinsics.checkNotNullExpressionValue(confirmBtn, "confirmBtn");
        ViewsKt.eventData$default(confirmBtn, false, new Function0() { // from class: com.robinhood.android.recommendations.ui.reentry.RecommendationsReentryChangeAnswerDialogFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RecommendationsReentryChangeAnswerDialogFragment.onViewCreated$lambda$7$lambda$4(this.f$0);
            }
        }, 1, null);
        RdsButton confirmBtn2 = binding.confirmBtn;
        Intrinsics.checkNotNullExpressionValue(confirmBtn2, "confirmBtn");
        OnClickListeners.onClick(confirmBtn2, new Function0() { // from class: com.robinhood.android.recommendations.ui.reentry.RecommendationsReentryChangeAnswerDialogFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RecommendationsReentryChangeAnswerDialogFragment.onViewCreated$lambda$7$lambda$5(this.f$0, objectRef);
            }
        });
        binding.radioGroup.onCheckedChange(new Function2() { // from class: com.robinhood.android.recommendations.ui.reentry.RecommendationsReentryChangeAnswerDialogFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return RecommendationsReentryChangeAnswerDialogFragment.onViewCreated$lambda$7$lambda$6(objectRef, binding, this, (NewRdsRadioGroup) obj, ((Integer) obj2).intValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor onViewCreated$lambda$7$lambda$4(RecommendationsReentryChangeAnswerDialogFragment recommendationsReentryChangeAnswerDialogFragment) {
        return new UserInteractionEventDescriptor(((Args) INSTANCE.getArgs((Fragment) recommendationsReentryChangeAnswerDialogFragment)).getQuestion().getId().toString(), null, UserInteractionEventData.Action.CONTINUE, null, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 42, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onViewCreated$lambda$7$lambda$5(RecommendationsReentryChangeAnswerDialogFragment recommendationsReentryChangeAnswerDialogFragment, Ref.ObjectRef objectRef) {
        recommendationsReentryChangeAnswerDialogFragment.getCallbacks().onUpdateAnswerForReentry(((Args) INSTANCE.getArgs((Fragment) recommendationsReentryChangeAnswerDialogFragment)).getQuestion().getId(), (UUID) objectRef.element);
        recommendationsReentryChangeAnswerDialogFragment.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4, types: [T, java.util.UUID] */
    public static final Unit onViewCreated$lambda$7$lambda$6(Ref.ObjectRef objectRef, FragmentRecommendationsReentryConfirmAnswerDialogBinding fragmentRecommendationsReentryConfirmAnswerDialogBinding, RecommendationsReentryChangeAnswerDialogFragment recommendationsReentryChangeAnswerDialogFragment, NewRdsRadioGroup newRdsRadioGroup, int i) {
        Intrinsics.checkNotNullParameter(newRdsRadioGroup, "<unused var>");
        Object tag = ViewCompat.requireViewById(fragmentRecommendationsReentryConfirmAnswerDialogBinding.radioGroup, i).getTag();
        Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type java.util.UUID");
        objectRef.element = (UUID) tag;
        EventLogger eventLogger = recommendationsReentryChangeAnswerDialogFragment.getEventLogger();
        UserInteractionEventData.Action action = UserInteractionEventData.Action.EDIT;
        Screen eventScreen = recommendationsReentryChangeAnswerDialogFragment.getEventScreen();
        Component.ComponentType componentType = Component.ComponentType.ROW;
        String string2 = ((UUID) objectRef.element).toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        EventLogger.DefaultImpls.logTap$default(eventLogger, action, eventScreen, new Component(componentType, string2, null, 4, null), null, null, false, 56, null);
        return Unit.INSTANCE;
    }

    /* compiled from: RecommendationsReentryChangeAnswerDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/recommendations/ui/reentry/RecommendationsReentryChangeAnswerDialogFragment$Args;", "Landroid/os/Parcelable;", "question", "Lcom/robinhood/recommendations/models/ui/UiRecommendationsQuestionnaire$Question;", "currentAnswer", "Lcom/robinhood/recommendations/models/ui/UiRecommendationsQuestionnaire$Answer;", "<init>", "(Lcom/robinhood/recommendations/models/ui/UiRecommendationsQuestionnaire$Question;Lcom/robinhood/recommendations/models/ui/UiRecommendationsQuestionnaire$Answer;)V", "getQuestion", "()Lcom/robinhood/recommendations/models/ui/UiRecommendationsQuestionnaire$Question;", "getCurrentAnswer", "()Lcom/robinhood/recommendations/models/ui/UiRecommendationsQuestionnaire$Answer;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final UiRecommendationsQuestionnaire.Answer currentAnswer;
        private final UiRecommendationsQuestionnaire.Question question;

        /* compiled from: RecommendationsReentryChangeAnswerDialogFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((UiRecommendationsQuestionnaire.Question) parcel.readParcelable(Args.class.getClassLoader()), (UiRecommendationsQuestionnaire.Answer) parcel.readParcelable(Args.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, UiRecommendationsQuestionnaire.Question question, UiRecommendationsQuestionnaire.Answer answer, int i, Object obj) {
            if ((i & 1) != 0) {
                question = args.question;
            }
            if ((i & 2) != 0) {
                answer = args.currentAnswer;
            }
            return args.copy(question, answer);
        }

        /* renamed from: component1, reason: from getter */
        public final UiRecommendationsQuestionnaire.Question getQuestion() {
            return this.question;
        }

        /* renamed from: component2, reason: from getter */
        public final UiRecommendationsQuestionnaire.Answer getCurrentAnswer() {
            return this.currentAnswer;
        }

        public final Args copy(UiRecommendationsQuestionnaire.Question question, UiRecommendationsQuestionnaire.Answer currentAnswer) {
            Intrinsics.checkNotNullParameter(question, "question");
            Intrinsics.checkNotNullParameter(currentAnswer, "currentAnswer");
            return new Args(question, currentAnswer);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return Intrinsics.areEqual(this.question, args.question) && Intrinsics.areEqual(this.currentAnswer, args.currentAnswer);
        }

        public int hashCode() {
            return (this.question.hashCode() * 31) + this.currentAnswer.hashCode();
        }

        public String toString() {
            return "Args(question=" + this.question + ", currentAnswer=" + this.currentAnswer + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.question, flags);
            dest.writeParcelable(this.currentAnswer, flags);
        }

        public Args(UiRecommendationsQuestionnaire.Question question, UiRecommendationsQuestionnaire.Answer currentAnswer) {
            Intrinsics.checkNotNullParameter(question, "question");
            Intrinsics.checkNotNullParameter(currentAnswer, "currentAnswer");
            this.question = question;
            this.currentAnswer = currentAnswer;
        }

        public final UiRecommendationsQuestionnaire.Question getQuestion() {
            return this.question;
        }

        public final UiRecommendationsQuestionnaire.Answer getCurrentAnswer() {
            return this.currentAnswer;
        }
    }

    /* compiled from: RecommendationsReentryChangeAnswerDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/recommendations/ui/reentry/RecommendationsReentryChangeAnswerDialogFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/recommendations/ui/reentry/RecommendationsReentryChangeAnswerDialogFragment;", "Lcom/robinhood/android/recommendations/ui/reentry/RecommendationsReentryChangeAnswerDialogFragment$Args;", "<init>", "()V", "feature-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<RecommendationsReentryChangeAnswerDialogFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(RecommendationsReentryChangeAnswerDialogFragment recommendationsReentryChangeAnswerDialogFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, recommendationsReentryChangeAnswerDialogFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public RecommendationsReentryChangeAnswerDialogFragment newInstance(Args args) {
            return (RecommendationsReentryChangeAnswerDialogFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(RecommendationsReentryChangeAnswerDialogFragment recommendationsReentryChangeAnswerDialogFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, recommendationsReentryChangeAnswerDialogFragment, args);
        }
    }
}
