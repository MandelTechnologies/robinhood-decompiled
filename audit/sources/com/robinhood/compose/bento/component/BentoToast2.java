package com.robinhood.compose.bento.component;

import android.app.Activity;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.robinhood.android.autoeventlogging.AutoLoggingConfig;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.designsystem.snackbar.RdsSnackbar;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoToast2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BentoToast.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0017\b\u0002\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006JB\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u0013R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/BentoToastHost;", "", "getView", "Lkotlin/Function0;", "Landroid/view/View;", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "showToast", "", "text", "", "length", "", "leadingIcon", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "action", "Lcom/robinhood/compose/bento/component/BentoToastAction;", "onDismiss", "showLoading", "", "Companion", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.compose.bento.component.BentoToastHost, reason: use source file name */
/* loaded from: classes20.dex */
public final class BentoToast2 {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Function0<View> getView;

    public /* synthetic */ BentoToast2(Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private BentoToast2(Function0<? extends View> function0) {
        this.getView = function0;
    }

    public static /* synthetic */ void showToast$default(BentoToast2 bentoToast2, CharSequence charSequence, int i, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, BentoToastAction bentoToastAction, Function0 function0, boolean z, int i2, Object obj) {
        if ((i2 & 32) != 0) {
            z = false;
        }
        bentoToast2.showToast(charSequence, i, serverToBentoAssetMapper2, bentoToastAction, function0, z);
    }

    public final void showToast(CharSequence text, int length, ServerToBentoAssetMapper2 leadingIcon, BentoToastAction action, final Function0<Unit> onDismiss, boolean showLoading) {
        RdsSnackbar action$default;
        RdsSnackbar leadingIcon2;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        RdsSnackbar rdsSnackbarMake = RdsSnackbar.INSTANCE.make(this.getView.invoke(), text, length);
        Integer numValueOf = leadingIcon != null ? Integer.valueOf(leadingIcon.getResourceId()) : null;
        RdsSnackbar rdsSnackbar = (numValueOf == null || (leadingIcon2 = rdsSnackbarMake.setLeadingIcon(numValueOf.intValue())) == null) ? rdsSnackbarMake : leadingIcon2;
        if (action != null && (action$default = RdsSnackbar.setAction$default(rdsSnackbar, action.getLabel(), action.getDismissAfterActionTap(), (UserInteractionEventDescriptor) null, (AutoLoggingConfig) null, action.getOnActionTextClicked(), 12, (Object) null)) != null) {
            rdsSnackbar = action$default;
        }
        RdsSnackbar rdsSnackbarAddDismissCallback = rdsSnackbar.addDismissCallback(new Function2() { // from class: com.robinhood.compose.bento.component.BentoToastHost$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return BentoToast2.showToast$lambda$1(onDismiss, (RdsSnackbar) obj, ((Integer) obj2).intValue());
            }
        });
        if (showLoading) {
            rdsSnackbarAddDismissCallback = rdsSnackbarAddDismissCallback.showLoading(showLoading);
        }
        rdsSnackbarAddDismissCallback.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showToast$lambda$1(Function0 function0, RdsSnackbar rdsSnackbar, int i) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* compiled from: BentoToast.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0015\u0010\u0004\u001a\u00020\u0005*\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0004\u001a\u00020\u0005*\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/BentoToastHost$Companion;", "", "<init>", "()V", "bentoToastHost", "Lcom/robinhood/compose/bento/component/BentoToastHost;", "Landroid/app/Activity;", "getBentoToastHost", "(Landroid/app/Activity;)Lcom/robinhood/compose/bento/component/BentoToastHost;", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/Fragment;)Lcom/robinhood/compose/bento/component/BentoToastHost;", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.compose.bento.component.BentoToastHost$Companion, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final View _get_bentoToastHost_$lambda$0(Activity activity) {
            View decorView = activity.getWindow().getDecorView();
            Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
            return decorView;
        }

        public final BentoToast2 getBentoToastHost(final Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "<this>");
            return new BentoToast2(new Function0() { // from class: com.robinhood.compose.bento.component.BentoToastHost$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BentoToast2.Companion._get_bentoToastHost_$lambda$0(activity);
                }
            }, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final View _get_bentoToastHost_$lambda$1(Fragment fragment) {
            View viewRequireView = fragment.requireView();
            Intrinsics.checkNotNullExpressionValue(viewRequireView, "requireView(...)");
            return viewRequireView;
        }

        public final BentoToast2 getBentoToastHost(final Fragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "<this>");
            return new BentoToast2(new Function0() { // from class: com.robinhood.compose.bento.component.BentoToastHost$Companion$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BentoToast2.Companion._get_bentoToastHost_$lambda$1(fragment);
                }
            }, null);
        }
    }
}
