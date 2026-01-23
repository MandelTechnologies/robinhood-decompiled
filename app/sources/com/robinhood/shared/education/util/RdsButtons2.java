package com.robinhood.shared.education.util;

import android.net.Uri;
import com.robinhood.android.account.p060ui.AccountOverviewOptionsSettingCard4;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.autoeventlogging.ViewsKt;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.LearningLesson;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.models.p387db.bonfire.education.lesson.EducationLesson;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RdsButtons.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u008b\u0001\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u00112\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u00112\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u0011H\u0000¢\u0006\u0002\u0010\u0014¨\u0006\u0015"}, m3636d2 = {"bindLessonCta", "", "Lcom/robinhood/android/designsystem/button/RdsButton;", "context", "Landroid/content/Context;", AccountOverviewOptionsSettingCard4.CTA, "Lcom/robinhood/shared/models/db/bonfire/education/lesson/EducationLesson$CtaButton;", "buttonBackgroundColor", "", "buttonForegroundColor", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "learningLesson", "Lcom/robinhood/rosetta/eventlogging/LearningLesson;", "itemPosition", "itemCount", "onDismissAction", "Lkotlin/Function0;", "onFinishWithResultAction", "onDeeplinkAction", "(Lcom/robinhood/android/designsystem/button/RdsButton;Landroid/content/Context;Lcom/robinhood/shared/models/db/bonfire/education/lesson/EducationLesson$CtaButton;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/robinhood/android/navigation/Navigator;Lcom/robinhood/rosetta/eventlogging/LearningLesson;IILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "feature-education_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.education.util.RdsButtonsKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class RdsButtons2 {

    /* compiled from: RdsButtons.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.education.util.RdsButtonsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EducationLesson.ActionType.values().length];
            try {
                iArr[EducationLesson.ActionType.DEEPLINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EducationLesson.ActionType.DISMISS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EducationLesson.ActionType.FINISH_WITH_RESULT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EducationLesson.ActionType.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor bindLessonCta$lambda$4(int i, int i2, EducationLesson.CtaButton ctaButton, LearningLesson learningLesson, UserInteractionEventData.Action action) {
        Component component = new Component(Component.ComponentType.BUTTON, null, null, 6, null);
        String title = ctaButton.getTitle();
        String actionUri = ctaButton.getActionUri();
        if (actionUri == null) {
            actionUri = "";
        }
        return new UserInteractionEventDescriptor(null, null, action, new Context(i, i2, 0, title, null, null, actionUri, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, learningLesson, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -67108940, -1, -1, -1, -1, -1, 16383, null), component, null, 35, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindLessonCta$lambda$5(EducationLesson.CtaButton ctaButton, Function0 function0, Navigator navigator, android.content.Context context, Function0 function02, Function0 function03) {
        int i = WhenMappings.$EnumSwitchMapping$0[ctaButton.getActionType().ordinal()];
        if (i == 1) {
            function0.invoke();
            String actionUri = ctaButton.getActionUri();
            Uri uri = actionUri != null ? Uri.parse(actionUri) : null;
            if (uri == null) {
                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalStateException("Deeplink LessonCTA's actionUri is null."), false, null, 4, null);
            }
            Navigator.DefaultImpls.handleDeepLink$default(navigator, context, uri, null, null, false, null, 60, null);
        } else if (i == 2) {
            function02.invoke();
        } else if (i == 3) {
            function03.invoke();
        } else if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }

    public static final void bindLessonCta(RdsButton rdsButton, final android.content.Context context, final EducationLesson.CtaButton ctaButton, Integer num, Integer num2, final Navigator navigator, final LearningLesson learningLesson, final int i, final int i2, final Function0<Unit> onDismissAction, final Function0<Unit> onFinishWithResultAction, final Function0<Unit> onDeeplinkAction) {
        UserInteractionEventData.Action action;
        Intrinsics.checkNotNullParameter(rdsButton, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(onDismissAction, "onDismissAction");
        Intrinsics.checkNotNullParameter(onFinishWithResultAction, "onFinishWithResultAction");
        Intrinsics.checkNotNullParameter(onDeeplinkAction, "onDeeplinkAction");
        if (ctaButton == null) {
            rdsButton.setVisibility(8);
            return;
        }
        rdsButton.setVisibility(0);
        rdsButton.setText(ctaButton.getTitle());
        if (num != null) {
            rdsButton.setBackgroundColor(num.intValue());
        }
        if (num2 != null) {
            rdsButton.setTextColor(num2.intValue());
        }
        int i3 = WhenMappings.$EnumSwitchMapping$0[ctaButton.getActionType().ordinal()];
        if (i3 == 1) {
            action = UserInteractionEventData.Action.OPEN_URL;
        } else if (i3 == 2) {
            action = UserInteractionEventData.Action.DISMISS;
        } else if (i3 == 3) {
            action = UserInteractionEventData.Action.CONTINUE;
        } else {
            if (i3 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            action = UserInteractionEventData.Action.ACTION_UNSPECIFIED;
        }
        final UserInteractionEventData.Action action2 = action;
        ViewsKt.eventData$default(rdsButton, false, new Function0() { // from class: com.robinhood.shared.education.util.RdsButtonsKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RdsButtons2.bindLessonCta$lambda$4(i, i2, ctaButton, learningLesson, action2);
            }
        }, 1, null);
        OnClickListeners.onClick(rdsButton, new Function0() { // from class: com.robinhood.shared.education.util.RdsButtonsKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RdsButtons2.bindLessonCta$lambda$5(ctaButton, onDeeplinkAction, navigator, context, onDismissAction, onFinishWithResultAction);
            }
        });
    }
}
