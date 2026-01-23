package com.stripe.android.stripe3ds2.views;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.stripe.android.stripe3ds2.databinding.StripeChallengeSubmitDialogBinding;
import com.stripe.android.stripe3ds2.init.p418ui.UiCustomization;
import com.stripe.android.stripe3ds2.utils.CustomizeUtils;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChallengeSubmitDialogFactory.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000bR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\f¨\u0006\u000e"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/views/ChallengeSubmitDialogFactory;", "", "Landroid/app/Dialog;", "Landroid/content/Context;", "context", "Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization;", "uiCustomization", "<init>", "(Landroid/content/Context;Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization;)V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "()Landroid/app/Dialog;", "Landroid/content/Context;", "Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization;", "ChallengeSubmitDialog", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class ChallengeSubmitDialogFactory {
    private final Context context;
    private final UiCustomization uiCustomization;

    public ChallengeSubmitDialogFactory(Context context, UiCustomization uiCustomization) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uiCustomization, "uiCustomization");
        this.context = context;
        this.uiCustomization = uiCustomization;
    }

    public Dialog create() {
        return new ChallengeSubmitDialog(this.context, this.uiCustomization);
    }

    /* compiled from: ChallengeSubmitDialogFactory.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\r\u001a\u00020\u000eH\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/views/ChallengeSubmitDialogFactory$ChallengeSubmitDialog;", "Landroid/app/Dialog;", "context", "Landroid/content/Context;", "uiCustomization", "Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization;", "(Landroid/content/Context;Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization;)V", "viewBinding", "Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeSubmitDialogBinding;", "getViewBinding", "()Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeSubmitDialogBinding;", "viewBinding$delegate", "Lkotlin/Lazy;", "onStart", "", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    private static final class ChallengeSubmitDialog extends Dialog {
        private final UiCustomization uiCustomization;

        /* renamed from: viewBinding$delegate, reason: from kotlin metadata */
        private final Lazy viewBinding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChallengeSubmitDialog(Context context, UiCustomization uiCustomization) {
            super(context);
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(uiCustomization, "uiCustomization");
            this.uiCustomization = uiCustomization;
            this.viewBinding = LazyKt.lazy(new Function0<StripeChallengeSubmitDialogBinding>() { // from class: com.stripe.android.stripe3ds2.views.ChallengeSubmitDialogFactory$ChallengeSubmitDialog$viewBinding$2
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final StripeChallengeSubmitDialogBinding invoke() {
                    StripeChallengeSubmitDialogBinding stripeChallengeSubmitDialogBindingInflate = StripeChallengeSubmitDialogBinding.inflate(this.this$0.getLayoutInflater());
                    Intrinsics.checkNotNullExpressionValue(stripeChallengeSubmitDialogBindingInflate, "inflate(...)");
                    return stripeChallengeSubmitDialogBindingInflate;
                }
            });
            setCancelable(false);
            Window window = getWindow();
            if (window != null) {
                window.clearFlags(2);
            }
            Window window2 = getWindow();
            if (window2 != null) {
                window2.setBackgroundDrawable(new ColorDrawable(0));
            }
        }

        private final StripeChallengeSubmitDialogBinding getViewBinding() {
            return (StripeChallengeSubmitDialogBinding) this.viewBinding.getValue();
        }

        @Override // android.app.Dialog
        protected void onStart() {
            super.onStart();
            setContentView(getViewBinding().getRoot());
            CustomizeUtils customizeUtils = CustomizeUtils.INSTANCE;
            CircularProgressIndicator progressBar = getViewBinding().progressBar;
            Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
            customizeUtils.applyProgressBarColor$3ds2sdk_release(progressBar, this.uiCustomization);
        }
    }
}
