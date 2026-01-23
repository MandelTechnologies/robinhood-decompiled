package com.robinhood.android.designsystem.snackbar;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.snackbar.ContentViewCallback;
import com.robinhood.android.autoeventlogging.AutoLoggingConfig;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.autoeventlogging.ViewsKt;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: RdsSnackbarContent.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u0000 +2\u00020\u00012\u00020\u0002:\u0001+B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ6\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\b\b\u0002\u0010\"\u001a\u00020#2\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010%J\u0018\u0010&\u001a\u00020\u001d2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020(H\u0016J\u0018\u0010*\u001a\u00020\u001d2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020(H\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u00108F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R(\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u000f\u001a\u0004\u0018\u00010\u00168F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/designsystem/snackbar/RdsSnackbarContent;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/google/android/material/snackbar/ContentViewCallback;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "txt", "Landroid/widget/TextView;", "leadingIcon", "Landroid/widget/ImageView;", "actionTxt", "Lcom/robinhood/android/designsystem/text/RhTextView;", "value", "", "message", "getMessage", "()Ljava/lang/CharSequence;", "setMessage", "(Ljava/lang/CharSequence;)V", "Landroid/graphics/drawable/Drawable;", "leadingIconDrawable", "getLeadingIconDrawable", "()Landroid/graphics/drawable/Drawable;", "setLeadingIconDrawable", "(Landroid/graphics/drawable/Drawable;)V", "setAction", "", AnnotatedPrivateKey.LABEL, "", "actionEventData", "Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "actionEventConfig", "Lcom/robinhood/android/autoeventlogging/AutoLoggingConfig;", "onActionTextClicked", "Lkotlin/Function0;", "animateContentIn", "delay", "", "duration", "animateContentOut", "Companion", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class RdsSnackbarContent extends ConstraintLayout implements ContentViewCallback {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final RhTextView actionTxt;
    private final ImageView leadingIcon;
    private final TextView txt;

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor setAction$lambda$2$lambda$0(UserInteractionEventDescriptor userInteractionEventDescriptor) {
        return userInteractionEventDescriptor;
    }

    @Override // com.google.android.material.snackbar.ContentViewCallback
    public void animateContentIn(int delay, int duration) {
    }

    @Override // com.google.android.material.snackbar.ContentViewCallback
    public void animateContentOut(int delay, int duration) {
    }

    public /* synthetic */ RdsSnackbarContent(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RdsSnackbarContent(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, C13997R.layout.merge_rds_snackbar, this);
        ViewsKt.setLoggingConfig(this, new AutoLoggingConfig(false, false));
        View viewFindViewById = findViewById(C13997R.id.rds_snackbar_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.txt = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(C13997R.id.rds_snackbar_leading_icon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.leadingIcon = (ImageView) viewFindViewById2;
        View viewFindViewById3 = findViewById(C13997R.id.rds_snackbar_action_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.actionTxt = (RhTextView) viewFindViewById3;
    }

    public final CharSequence getMessage() {
        return this.txt.getText();
    }

    public final void setMessage(CharSequence charSequence) {
        this.txt.setVisibility(charSequence != null ? 0 : 8);
        this.txt.setText(charSequence);
    }

    public final Drawable getLeadingIconDrawable() {
        return this.leadingIcon.getDrawable();
    }

    public final void setLeadingIconDrawable(Drawable drawable) {
        this.leadingIcon.setVisibility(drawable != null ? 0 : 8);
        this.leadingIcon.setImageDrawable(drawable);
    }

    public static /* synthetic */ void setAction$default(RdsSnackbarContent rdsSnackbarContent, String str, UserInteractionEventDescriptor userInteractionEventDescriptor, AutoLoggingConfig autoLoggingConfig, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            userInteractionEventDescriptor = null;
        }
        if ((i & 4) != 0) {
            autoLoggingConfig = new AutoLoggingConfig(false, false, 3, null);
        }
        rdsSnackbarContent.setAction(str, userInteractionEventDescriptor, autoLoggingConfig, function0);
    }

    public final void setAction(String label, final UserInteractionEventDescriptor actionEventData, AutoLoggingConfig actionEventConfig, final Function0<Unit> onActionTextClicked) {
        Intrinsics.checkNotNullParameter(actionEventConfig, "actionEventConfig");
        RhTextView rhTextView = this.actionTxt;
        ViewsKt.eventData$default(rhTextView, false, new Function0() { // from class: com.robinhood.android.designsystem.snackbar.RdsSnackbarContent$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RdsSnackbarContent.setAction$lambda$2$lambda$0(actionEventData);
            }
        }, 1, null);
        ViewsKt.setLoggingConfig(rhTextView, actionEventConfig);
        if (label == null || label.length() == 0 || onActionTextClicked == null) {
            rhTextView.setVisibility(8);
            rhTextView.setText((CharSequence) null);
            rhTextView.setOnClickListener(null);
        } else {
            rhTextView.setVisibility(0);
            rhTextView.setText(label);
            OnClickListeners.onClick(rhTextView, new Function0() { // from class: com.robinhood.android.designsystem.snackbar.RdsSnackbarContent$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RdsSnackbarContent.setAction$lambda$2$lambda$1(onActionTextClicked);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setAction$lambda$2$lambda$1(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* compiled from: RdsSnackbarContent.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/designsystem/snackbar/RdsSnackbarContent$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/designsystem/snackbar/RdsSnackbarContent;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<RdsSnackbarContent> {
        private final /* synthetic */ Inflater<RdsSnackbarContent> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public RdsSnackbarContent inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (RdsSnackbarContent) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C13997R.layout.include_rds_snackbar);
        }
    }
}
