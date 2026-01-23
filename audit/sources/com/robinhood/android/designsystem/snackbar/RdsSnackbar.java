package com.robinhood.android.designsystem.snackbar;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.robinhood.android.autoeventlogging.AutoLoggingConfig;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.utils.extensions.ViewsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: RdsSnackbar.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 ,2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002+,B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J@\u0010\b\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012J@\u0010\b\u001a\u00020\u00002\b\b\u0001\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012J\u0010\u0010\u0016\u001a\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018J\u0010\u0010\u0016\u001a\u00020\u00002\b\b\u0001\u0010\u0019\u001a\u00020\u0015J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\fJ\u0010\u0010\u001c\u001a\u00020\u00002\b\b\u0001\u0010\u001d\u001a\u00020\u0015J\u000e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001fJ\u0006\u0010 \u001a\u00020\u0000J\u0006\u0010!\u001a\u00020\u0000J\u0006\u0010\"\u001a\u00020\u0000J\u000e\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u000eJ\u0016\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u0010J\u0010\u0010&\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u0015H\u0007J\"\u0010(\u001a\u00020\u00002\u001a\u0010)\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00130*R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, m3636d2 = {"Lcom/robinhood/android/designsystem/snackbar/RdsSnackbar;", "Lcom/google/android/material/snackbar/BaseTransientBottomBar;", "parent", "Landroid/view/ViewGroup;", "snackbarContent", "Lcom/robinhood/android/designsystem/snackbar/RdsSnackbarContent;", "<init>", "(Landroid/view/ViewGroup;Lcom/robinhood/android/designsystem/snackbar/RdsSnackbarContent;)V", "setAction", AnnotatedPrivateKey.LABEL, "", "dismissAfterActionTap", "", "actionEventData", "Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "actionEventConfig", "Lcom/robinhood/android/autoeventlogging/AutoLoggingConfig;", "onActionTextClicked", "Lkotlin/Function0;", "", "labelRes", "", "setLeadingIcon", "iconDrawable", "Landroid/graphics/drawable/Drawable;", "iconRes", "showLoading", "loading", "setMessage", "messageRes", "message", "", "setShortDuration", "setLongDuration", "setIndefiniteDuration", "setEventData", "eventData", "loggingConfig", "setCustomDuration", "durationInMillis", "addDismissCallback", "action", "Lkotlin/Function2;", "Callback", "Companion", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class RdsSnackbar extends BaseTransientBottomBar<RdsSnackbar> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int LENGTH_INDEFINITE = -2;
    public static final int LENGTH_LONG = 0;
    public static final int LENGTH_SHORT = -1;
    private final RdsSnackbarContent snackbarContent;

    public /* synthetic */ RdsSnackbar(ViewGroup viewGroup, RdsSnackbarContent rdsSnackbarContent, DefaultConstructorMarker defaultConstructorMarker) {
        this(viewGroup, rdsSnackbarContent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor setEventData$lambda$1(UserInteractionEventDescriptor userInteractionEventDescriptor) {
        return userInteractionEventDescriptor;
    }

    private RdsSnackbar(ViewGroup viewGroup, RdsSnackbarContent rdsSnackbarContent) throws Resources.NotFoundException {
        super(viewGroup, rdsSnackbarContent, rdsSnackbarContent);
        this.snackbarContent = rdsSnackbarContent;
        BaseTransientBottomBar.SnackbarBaseLayout snackbarBaseLayout = this.view;
        Intrinsics.checkNotNull(snackbarBaseLayout, "null cannot be cast to non-null type android.view.View");
        snackbarBaseLayout.setBackground(null);
        int dimensionPixelSize = this.view.getResources().getDimensionPixelSize(C13997R.dimen.rds_spacing_xsmall);
        snackbarBaseLayout.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
    }

    public static /* synthetic */ RdsSnackbar setAction$default(RdsSnackbar rdsSnackbar, String str, boolean z, UserInteractionEventDescriptor userInteractionEventDescriptor, AutoLoggingConfig autoLoggingConfig, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        boolean z2 = z;
        UserInteractionEventDescriptor userInteractionEventDescriptor2 = (i & 4) != 0 ? null : userInteractionEventDescriptor;
        if ((i & 8) != 0) {
            autoLoggingConfig = new AutoLoggingConfig(false, false, 3, null);
        }
        return rdsSnackbar.setAction(str, z2, userInteractionEventDescriptor2, autoLoggingConfig, (Function0<Unit>) function0);
    }

    public final RdsSnackbar setAction(String label, final boolean dismissAfterActionTap, UserInteractionEventDescriptor actionEventData, AutoLoggingConfig actionEventConfig, final Function0<Unit> onActionTextClicked) {
        Intrinsics.checkNotNullParameter(actionEventConfig, "actionEventConfig");
        this.snackbarContent.setAction(label, actionEventData, actionEventConfig, new Function0() { // from class: com.robinhood.android.designsystem.snackbar.RdsSnackbar$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RdsSnackbar.setAction$lambda$0(onActionTextClicked, dismissAfterActionTap, this);
            }
        });
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setAction$lambda$0(Function0 function0, boolean z, RdsSnackbar rdsSnackbar) {
        if (function0 != null) {
            function0.invoke();
        }
        if (function0 != null && z) {
            rdsSnackbar.dispatchDismiss(1);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ RdsSnackbar setAction$default(RdsSnackbar rdsSnackbar, int i, boolean z, UserInteractionEventDescriptor userInteractionEventDescriptor, AutoLoggingConfig autoLoggingConfig, Function0 function0, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        boolean z2 = z;
        UserInteractionEventDescriptor userInteractionEventDescriptor2 = (i2 & 4) != 0 ? null : userInteractionEventDescriptor;
        if ((i2 & 8) != 0) {
            autoLoggingConfig = new AutoLoggingConfig(false, false, 3, null);
        }
        return rdsSnackbar.setAction(i, z2, userInteractionEventDescriptor2, autoLoggingConfig, (Function0<Unit>) function0);
    }

    public final RdsSnackbar setAction(int labelRes, boolean dismissAfterActionTap, UserInteractionEventDescriptor actionEventData, AutoLoggingConfig actionEventConfig, Function0<Unit> onActionTextClicked) {
        Intrinsics.checkNotNullParameter(actionEventConfig, "actionEventConfig");
        return setAction(ViewsKt.getString(this.snackbarContent, labelRes), dismissAfterActionTap, actionEventData, actionEventConfig, onActionTextClicked);
    }

    public final RdsSnackbar setLeadingIcon(Drawable iconDrawable) {
        this.snackbarContent.setLeadingIconDrawable(iconDrawable);
        return this;
    }

    public final RdsSnackbar setLeadingIcon(int iconRes) {
        return setLeadingIcon(ViewsKt.getDrawable(this.snackbarContent, iconRes));
    }

    public final RdsSnackbar showLoading(boolean loading) {
        if (loading) {
            BaseTransientBottomBar.SnackbarBaseLayout view = this.view;
            Intrinsics.checkNotNullExpressionValue(view, "view");
            this.snackbarContent.setLeadingIconDrawable(ViewsKt.getDrawable(view, C13997R.drawable.button_spinner));
            Object leadingIconDrawable = this.snackbarContent.getLeadingIconDrawable();
            Intrinsics.checkNotNull(leadingIconDrawable, "null cannot be cast to non-null type android.graphics.drawable.Animatable");
            ((Animatable) leadingIconDrawable).start();
            return this;
        }
        this.snackbarContent.setLeadingIconDrawable(null);
        return this;
    }

    public final RdsSnackbar setMessage(int messageRes) {
        BaseTransientBottomBar.SnackbarBaseLayout view = this.view;
        Intrinsics.checkNotNullExpressionValue(view, "view");
        return setMessage(ViewsKt.getString(view, messageRes));
    }

    public final RdsSnackbar setMessage(CharSequence message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.snackbarContent.setMessage(message);
        return this;
    }

    public final RdsSnackbar setShortDuration() {
        RdsSnackbar duration = setDuration(-1);
        Intrinsics.checkNotNullExpressionValue(duration, "setDuration(...)");
        return duration;
    }

    public final RdsSnackbar setLongDuration() {
        RdsSnackbar duration = setDuration(0);
        Intrinsics.checkNotNullExpressionValue(duration, "setDuration(...)");
        return duration;
    }

    public final RdsSnackbar setIndefiniteDuration() {
        RdsSnackbar duration = setDuration(-2);
        Intrinsics.checkNotNullExpressionValue(duration, "setDuration(...)");
        return duration;
    }

    public final RdsSnackbar setEventData(final UserInteractionEventDescriptor eventData) {
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        com.robinhood.android.autoeventlogging.ViewsKt.eventData$default(this.snackbarContent, false, new Function0() { // from class: com.robinhood.android.designsystem.snackbar.RdsSnackbar$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RdsSnackbar.setEventData$lambda$1(eventData);
            }
        }, 1, null);
        return this;
    }

    public final RdsSnackbar setEventData(UserInteractionEventDescriptor eventData, AutoLoggingConfig loggingConfig) {
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        Intrinsics.checkNotNullParameter(loggingConfig, "loggingConfig");
        setEventData(eventData);
        com.robinhood.android.autoeventlogging.ViewsKt.setLoggingConfig(this.snackbarContent, loggingConfig);
        return this;
    }

    @SuppressLint({"WrongConstant"})
    public final RdsSnackbar setCustomDuration(int durationInMillis) {
        if (durationInMillis <= 0) {
            throw new IllegalStateException("Check failed.");
        }
        RdsSnackbar duration = setDuration(durationInMillis);
        Intrinsics.checkNotNullExpressionValue(duration, "setDuration(...)");
        return duration;
    }

    public final RdsSnackbar addDismissCallback(final Function2<? super RdsSnackbar, ? super Integer, Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        RdsSnackbar rdsSnackbarAddCallback = addCallback(new Callback() { // from class: com.robinhood.android.designsystem.snackbar.RdsSnackbar.addDismissCallback.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.robinhood.android.designsystem.snackbar.RdsSnackbar.Callback, com.google.android.material.snackbar.BaseTransientBottomBar.BaseCallback
            public void onDismissed(RdsSnackbar transientBottomBar, int event) {
                action.invoke(transientBottomBar, Integer.valueOf(event));
            }
        });
        Intrinsics.checkNotNullExpressionValue(rdsSnackbarAddCallback, "addCallback(...)");
        return rdsSnackbarAddCallback;
    }

    /* compiled from: RdsSnackbar.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\b\u0016\u0018\u0000 \f2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016J\u001a\u0010\b\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/designsystem/snackbar/RdsSnackbar$Callback;", "Lcom/google/android/material/snackbar/BaseTransientBottomBar$BaseCallback;", "Lcom/robinhood/android/designsystem/snackbar/RdsSnackbar;", "<init>", "()V", "onShown", "", "sb", "onDismissed", "transientBottomBar", "event", "", "Companion", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static class Callback extends BaseTransientBottomBar.BaseCallback<RdsSnackbar> {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int DISMISS_EVENT_ACTION = 1;
        public static final int DISMISS_EVENT_CONSECUTIVE = 4;
        public static final int DISMISS_EVENT_MANUAL = 3;
        public static final int DISMISS_EVENT_SWIPE = 0;
        public static final int DISMISS_EVENT_TIMEOUT = 2;

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.BaseCallback
        public void onDismissed(RdsSnackbar transientBottomBar, int event) {
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.BaseCallback
        public void onShown(RdsSnackbar sb) {
        }

        /* compiled from: RdsSnackbar.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/designsystem/snackbar/RdsSnackbar$Callback$Companion;", "", "<init>", "()V", "DISMISS_EVENT_SWIPE", "", "DISMISS_EVENT_ACTION", "DISMISS_EVENT_TIMEOUT", "DISMISS_EVENT_MANUAL", "DISMISS_EVENT_CONSECUTIVE", "dismissedNormally", "", "dismissEvent", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final boolean dismissedNormally(int dismissEvent) {
                return dismissEvent == 0 || dismissEvent == 2 || dismissEvent == 3;
            }

            private Companion() {
            }
        }
    }

    /* compiled from: RdsSnackbar.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005J\u001e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u0005J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011*\u0004\u0018\u00010\u000bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/designsystem/snackbar/RdsSnackbar$Companion;", "", "<init>", "()V", "LENGTH_LONG", "", "LENGTH_SHORT", "LENGTH_INDEFINITE", "make", "Lcom/robinhood/android/designsystem/snackbar/RdsSnackbar;", "view", "Landroid/view/View;", "messageRes", "length", "message", "", "findSuitableParent", "Landroid/view/ViewGroup;", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final RdsSnackbar make(View view, int messageRes, int length) {
            Intrinsics.checkNotNullParameter(view, "view");
            return make(view, ViewsKt.getString(view, messageRes), length);
        }

        public final RdsSnackbar make(View view, CharSequence message, int length) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(message, "message");
            ViewGroup viewGroupFindSuitableParent = findSuitableParent(view);
            if (viewGroupFindSuitableParent == null) {
                throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
            }
            RdsSnackbarContent rdsSnackbarContentInflate = RdsSnackbarContent.INSTANCE.inflate(viewGroupFindSuitableParent);
            rdsSnackbarContentInflate.setMessage(message);
            RdsSnackbar rdsSnackbar = new RdsSnackbar(viewGroupFindSuitableParent, rdsSnackbarContentInflate, null);
            rdsSnackbar.setDuration(length);
            return rdsSnackbar;
        }

        private final ViewGroup findSuitableParent(View view) {
            ViewGroup viewGroup = null;
            while (!(view instanceof CoordinatorLayout)) {
                if (view instanceof FrameLayout) {
                    if (((FrameLayout) view).getId() == 16908290) {
                        return (ViewGroup) view;
                    }
                    viewGroup = (ViewGroup) view;
                }
                if (view != null) {
                    Object parent = view.getParent();
                    view = parent instanceof View ? (View) parent : null;
                }
                if (view == null) {
                    return viewGroup;
                }
            }
            return (ViewGroup) view;
        }
    }
}
